package neton.client.dns;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import neton.client.Utils.ApkInfoUtil;
import neton.client.Utils.HttpRequestHelper;
import neton.client.Utils.LogUtil;
import neton.client.Utils.MathUtils;
import neton.client.Utils.NetHelper;
import neton.client.Utils.ThreadPoolUtil;
import neton.client.Utils.Util;
import neton.client.config.ConfigManager;
import neton.client.config.Constants;

/* loaded from: classes.dex */
public class HttpDns extends DnsImp {
    public HttpDns(Context context) {
        super(context);
        load();
    }

    @Override // neton.client.dns.DnsImp
    public int getDnsType() {
        return DnsInfo.TYPE_HTTP;
    }

    @Override // neton.client.dns.Dns
    public IpInfo lookup(final String str) {
        LogUtil.m7844d("HttpDns--lookup--start--host:" + str + ",mAddressInfos:" + this.mAddressInfos);
        AddressInfo addressInfo = getAddressInfo(str);
        synchronized (addressInfo) {
            IpInfo ipInfo = addressInfo.getIpInfo();
            if (ipInfo != null && ipInfo.checkSelect()) {
                LogUtil.m7844d("HttpDns--lookup--success ipInfo:".concat(String.valueOf(ipInfo)));
                return ipInfo;
            }
            List<IpInfo> ipInfoList = addressInfo.getIpInfoList();
            if (ipInfoList != null && ipInfoList.size() > 0) {
                if (checkNeedDelete(addressInfo)) {
                    LogUtil.m7844d("HttpDns--lookup--checkNeedDelete");
                    delete(str);
                } else {
                    ipInfo = select(ipInfoList);
                    LogUtil.m7844d("HttpDns--lookup--select-ipInfo:".concat(String.valueOf(ipInfo)));
                    if (ipInfo != null) {
                        return ipInfo;
                    }
                    delete(str);
                }
            }
            if (NetHelper.isConnectNet(this.mContext) && !addressInfo.isLooking()) {
                addressInfo.setLooking(true);
                ThreadPoolUtil.executeSingle(new Runnable() { // from class: neton.client.dns.HttpDns.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        HttpDns.this.initAddressInfo(HttpDns.this.mContext, str);
                    }
                });
            }
            LogUtil.m7844d("HttpDns--lookup--end--host:" + str + ",ipInfo:" + ipInfo);
            return ipInfo;
        }
    }

    public void initAddressInfo(Context context, String str) {
        List<String> listData = ConfigManager.getInstance().getListData(ApkInfoUtil.isRegionCN() ? Constants.KEY_HTTP_DNS_LIST : Constants.KEY_FOREIGN_HTTP_DNS_LIST);
        if (listData == null || listData.isEmpty()) {
            listData = Arrays.asList(ApkInfoUtil.isRegionCN() ? Constants.DEFAULT_HTTP_DNS_LIST : Constants.DEFAULT_FOREIGN_HTTP_DNS_LIST);
        }
        String stringData = ConfigManager.getInstance().getStringData(ApkInfoUtil.isRegionCN() ? Constants.KEY_HTTP_LAST_DNS : Constants.KEY_FOREIGN_HTTP_LAST_DNS, ApkInfoUtil.isRegionCN() ? Constants.DEFAULT_HTTP_LAST_DNS : Constants.DEFAULT_FOREIGN_HTTP_LAST_DNS);
        LogUtil.m7844d("initAddressInfo:" + listData + ",httpDns:" + stringData);
        if (listData == null && TextUtils.isEmpty(stringData)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i = 0; listData != null && i < listData.size(); i++) {
            arrayList.add(listData.get(i));
        }
        while (true) {
            if (arrayList.size() <= 0) {
                break;
            }
            int random = MathUtils.random(arrayList.size());
            String str2 = (String) arrayList.get(random);
            List<String> requestDns = HttpRequestHelper.getRequestDns(context, str2, str);
            if (requestDns == null || requestDns.size() == 0) {
                arrayList.remove(random);
                LogUtil.m7844d("HttpDns--initAddressInfo--randomInt:" + random + ",dns:" + str2 + ",lsit:" + arrayList + ",hasIpList:false");
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> it = requestDns.iterator();
                while (it.hasNext()) {
                    arrayList2.add(IpInfo.parseIpInfo(str, getDnsType(), it.next()));
                }
                saveAddressInfo(str, arrayList2, getDnsType());
                z = true;
            }
        }
        if (z) {
            return;
        }
        List<String> requestDns2 = HttpRequestHelper.getRequestDns(context, stringData, str);
        ArrayList arrayList3 = new ArrayList();
        if (requestDns2 != null && requestDns2.size() > 0) {
            Iterator<String> it2 = requestDns2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(IpInfo.parseIpInfo(str, getDnsType(), it2.next()));
            }
            saveAddressInfo(str, arrayList3, getDnsType());
        }
        LogUtil.m7844d("HttpDns--initAddressInfo--host:" + str + ",ipInfos:" + arrayList3);
    }

    public IpInfo select(List<IpInfo> list) {
        IpInfo ipInfo;
        ArrayList arrayList = new ArrayList();
        for (IpInfo ipInfo2 : list) {
            if (ipInfo2.checkSelect()) {
                arrayList.add(ipInfo2);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        String stringData = ConfigManager.getInstance().getStringData(Constants.KEY_HEADER_SET);
        String carrierName = NetHelper.isWifiConnecting(this.mContext) ? NetHelper.CARRIER_BGP : NetHelper.getCarrierName(this.mContext);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < size; i++) {
            IpInfo ipInfo3 = (IpInfo) arrayList.get(i);
            if (ipInfo3 != null && ((TextUtils.isEmpty(stringData) || TextUtils.isEmpty(ipInfo3.getLocal()) || stringData.equalsIgnoreCase(ipInfo3.getLocal())) && (NetHelper.CARRIER_BGP.equalsIgnoreCase(carrierName) || NetHelper.CARRIER_BGP.equalsIgnoreCase(ipInfo3.getSp()) || carrierName.equalsIgnoreCase(ipInfo3.getSp())))) {
                int weight = ((IpInfo) arrayList.get(i)).getWeight();
                LogUtil.m7844d("selectIpInfo--i" + i + ",w:--ipInfo==:" + Util.toString(arrayList.get(i)));
                for (int i2 = 0; i2 < weight; i2++) {
                    arrayList2.add(arrayList.get(i));
                }
            }
        }
        LogUtil.m7844d("selectIpInfo--final--setList:" + arrayList2.size());
        if (arrayList2.size() == 0) {
            LogUtil.m7844d("selectIpInfo--select--setList is null");
            return null;
        }
        if (arrayList2.size() > 1) {
            ipInfo = (IpInfo) arrayList2.get(MathUtils.random(arrayList2.size()));
        } else {
            ipInfo = (IpInfo) arrayList2.get(0);
        }
        LogUtil.m7844d("selectIpInfo--end--ipInfo:" + Util.toString(ipInfo));
        return ipInfo;
    }
}
