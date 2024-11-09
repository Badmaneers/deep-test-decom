package neton.client.dns;

import android.content.Context;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import neton.client.Utils.LogUtil;
import neton.client.Utils.MathUtils;

/* loaded from: classes.dex */
public class LocalDns extends DnsImp {
    public LocalDns(Context context) {
        super(context);
        load();
    }

    @Override // neton.client.dns.DnsImp
    public int getDnsType() {
        return DnsInfo.TYPE_LOCAL;
    }

    @Override // neton.client.dns.Dns
    public IpInfo lookup(String str) {
        LogUtil.m7844d("LocalDns--lookup--start--host:" + str + ",mAddressInfos:" + this.mAddressInfos);
        AddressInfo addressInfo = getAddressInfo(str);
        synchronized (addressInfo) {
            IpInfo ipInfo = addressInfo.getIpInfo();
            if (ipInfo != null && ipInfo.checkSelect()) {
                LogUtil.m7844d("LocalDns--lookup--success ipInfo:".concat(String.valueOf(ipInfo)));
                return ipInfo;
            }
            List<IpInfo> ipInfoList = addressInfo.getIpInfoList();
            if (ipInfoList != null && ipInfoList.size() > 0) {
                if (checkNeedDelete(addressInfo)) {
                    delete(str);
                } else {
                    ipInfo = select(ipInfoList);
                    if (ipInfo != null) {
                        return ipInfo;
                    }
                    delete(str);
                }
            }
            LogUtil.m7844d("LocalDns--real lookup dns start --ipInfoList:".concat(String.valueOf(ipInfoList)));
            try {
                List<InetAddress> asList = Arrays.asList(InetAddress.getAllByName(str));
                LogUtil.m7844d("LocalDns--real lookup dns end--inetAddresses:".concat(String.valueOf(asList)));
                if (asList != null && asList.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (InetAddress inetAddress : asList) {
                        IpInfo ipInfo2 = new IpInfo(str, getDnsType());
                        ipInfo2.setIp(inetAddress.getHostAddress());
                        arrayList.add(ipInfo2);
                    }
                    IpInfo select = select(arrayList);
                    saveAddressInfo(str, arrayList, getDnsType());
                    ipInfo = select;
                }
                LogUtil.m7844d("LocalDns--lookup--end --host:".concat(String.valueOf(str)));
                return ipInfo;
            } catch (UnknownHostException e) {
                LogUtil.m7844d("LocalDns--UnknownHostException--:" + e.getMessage());
                throw e;
            }
        }
    }

    public IpInfo select(List<IpInfo> list) {
        LogUtil.m7844d("selectIpInfo-:".concat(String.valueOf(list)));
        ArrayList arrayList = new ArrayList();
        for (IpInfo ipInfo : list) {
            if (ipInfo.checkSelect()) {
                arrayList.add(ipInfo);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size > 0) {
            return (IpInfo) arrayList.get(MathUtils.random(size));
        }
        return (IpInfo) arrayList.get(0);
    }
}
