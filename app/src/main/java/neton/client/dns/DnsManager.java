package neton.client.dns;

import android.content.Context;
import android.text.TextUtils;
import neton.client.Utils.LogUtil;
import neton.client.Utils.ThreadPoolUtil;
import neton.client.config.ConfigManager;
import neton.client.config.Constants;

/* loaded from: classes.dex */
public class DnsManager implements Dns {
    private HttpDns mHttpDns;
    private LocalDns mLocalDns;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class InstanceHolder {
        static DnsManager ourInstance = new DnsManager();

        private InstanceHolder() {
        }
    }

    public static DnsManager getInstance() {
        return InstanceHolder.ourInstance;
    }

    private DnsManager() {
    }

    public void init(Context context) {
        this.mHttpDns = new HttpDns(context);
        this.mLocalDns = new LocalDns(context);
    }

    @Override // neton.client.dns.Dns
    public IpInfo lookup(String str) {
        IpInfo ipInfo = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int intData = ConfigManager.getInstance().getIntData(Constants.KEY_DNS_MODE, 1);
        if (intData == 0) {
            ipInfo = this.mHttpDns.lookup(str);
            if (ipInfo == null || !ipInfo.isIpInfoValid()) {
                ipInfo = this.mLocalDns.lookup(str);
            }
        } else if (1 == intData) {
            ipInfo = this.mLocalDns.lookup(str);
        } else if (2 == intData) {
            ipInfo = this.mHttpDns.lookup(str);
        }
        LogUtil.m7844d("DnsManager--lookup--ipInfo:".concat(String.valueOf(ipInfo)));
        return ipInfo;
    }

    public void updateIpInfo(final IpInfo ipInfo) {
        ThreadPoolUtil.execute(new Runnable() { // from class: neton.client.dns.DnsManager.1
            @Override // java.lang.Runnable
            public void run() {
                if (ipInfo == null || !ipInfo.checkSelect()) {
                    return;
                }
                if (DnsInfo.TYPE_HTTP == ipInfo.getDnsType()) {
                    DnsManager.this.mHttpDns.getAddressInfo(ipInfo.getHost()).setIpInfo(ipInfo);
                } else if (DnsInfo.TYPE_LOCAL == ipInfo.getDnsType()) {
                    DnsManager.this.mLocalDns.getAddressInfo(ipInfo.getHost()).setIpInfo(ipInfo);
                }
            }
        });
    }
}
