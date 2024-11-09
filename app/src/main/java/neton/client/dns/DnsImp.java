package neton.client.dns;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import neton.client.Utils.LogUtil;
import neton.client.Utils.ThreadPoolUtil;
import neton.client.database.DBUtil;
import neton.internal.Util;

/* loaded from: classes.dex */
public abstract class DnsImp implements Dns {
    static final float DELETE_WEIGHT = 0.75f;
    static final String regex = "(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})";
    protected Map<String, AddressInfo> mAddressInfos = new HashMap();
    protected Context mContext;

    public abstract int getDnsType();

    public DnsImp(Context context) {
        this.mContext = context;
    }

    public void load() {
        ThreadPoolUtil.execute(new Runnable() { // from class: neton.client.dns.DnsImp.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (DnsImp.this.mAddressInfos) {
                    LinkedList<AddressInfo> addressInfoList = DBUtil.getAddressInfoList(DnsImp.this.mContext, DnsImp.this.getDnsType());
                    if (addressInfoList != null && addressInfoList.size() > 0) {
                        for (AddressInfo addressInfo : addressInfoList) {
                            LinkedList<IpInfo> ipInfoList = DBUtil.getIpInfoList(DnsImp.this.mContext, DnsImp.this.getDnsType(), addressInfo.getHost());
                            if (ipInfoList != null) {
                                addressInfo.setIpInfoList(ipInfoList);
                            }
                            DnsImp.this.mAddressInfos.put(addressInfo.getHost(), addressInfo);
                        }
                    }
                }
                LogUtil.m7844d("DnsImp--load--type:" + DnsImp.this.getDnsType() + ",mAddressInfos:" + DnsImp.this.mAddressInfos);
            }
        });
    }

    public boolean checkNeedDelete(AddressInfo addressInfo) {
        if (addressInfo.getTimeStamp() != 0 && addressInfo.getTimeStamp() < System.currentTimeMillis()) {
            LogUtil.m7844d("DnsImp--lookup--checkNeedDelete--timeout");
            return true;
        }
        List<IpInfo> ipInfoList = addressInfo.getIpInfoList();
        if (ipInfoList != null && ipInfoList.size() > 0) {
            Iterator<IpInfo> it = ipInfoList.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().getFailCount();
            }
            if (i > ipInfoList.size() * DELETE_WEIGHT) {
                LogUtil.m7844d("DnsImp--lookup--checkNeedDelete--fail overtimes");
                return true;
            }
        }
        return false;
    }

    public AddressInfo getAddressInfo(String str) {
        AddressInfo addressInfo;
        synchronized (this.mAddressInfos) {
            if (!this.mAddressInfos.containsKey(str)) {
                this.mAddressInfos.put(str, new AddressInfo(str, getDnsType()));
            }
            addressInfo = this.mAddressInfos.get(str);
        }
        return addressInfo;
    }

    public void saveAddressInfo(final String str, final List<IpInfo> list, final int i) {
        final AddressInfo addressInfo = getAddressInfo(str);
        if (list == null || list.size() == 0) {
            return;
        }
        ThreadPoolUtil.executeSingle(new Runnable() { // from class: neton.client.dns.DnsImp.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (addressInfo) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        IpInfo ipInfo = (IpInfo) it.next();
                        if (ipInfo != null && ipInfo.getTtl() > 0) {
                            addressInfo.setTtl(ipInfo.getTtl());
                            addressInfo.setTimeStamp((ipInfo.getTtl() * 1000) + System.currentTimeMillis());
                            break;
                        }
                    }
                    addressInfo.setIpInfoList(list);
                    if (DnsImp.this.getDnsType() == DnsInfo.TYPE_HTTP) {
                        DBUtil.addAddressInfo(DnsImp.this.mContext, addressInfo);
                        DBUtil.deleteIpInfosByHostAndDnsType(DnsImp.this.mContext, str, DnsImp.this.getDnsType());
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            DBUtil.addIpInfo(DnsImp.this.mContext, (IpInfo) it2.next());
                        }
                    }
                    addressInfo.setLooking(false);
                    LogUtil.m7844d("DnsImp--saveAddressInfo--type:" + i);
                }
            }
        });
    }

    public void delete(String str) {
        AddressInfo addressInfo = getAddressInfo(str);
        addressInfo.setTtl(0L);
        addressInfo.setTimeStamp(0L);
        addressInfo.setIpInfoList(null);
        DBUtil.updateAddressInfo(this.mContext, addressInfo);
        DBUtil.deleteIpInfosByHostAndDnsType(this.mContext, str, getDnsType());
        LogUtil.m7844d("DnsImp--delete -host:" + str + ",type:" + getDnsType());
    }

    public static boolean isHostIp(String str) {
        return Util.verifyAsIpAddress(str);
    }
}
