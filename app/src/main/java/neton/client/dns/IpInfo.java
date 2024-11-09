package neton.client.dns;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.coloros.neton.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import neton.client.Utils.LogUtil;
import neton.client.Utils.NetHelper;
import neton.client.Utils.ThreadPoolUtil;
import neton.client.Utils.Util;
import neton.client.config.ConfigManager;
import neton.client.config.Constants;
import neton.client.database.DBUtil;

/* loaded from: classes.dex */
public class IpInfo extends DnsInfo {
    public static final int ERROR_PORT = -1;
    public static final String FAIL_COUNT = "failCount";
    public static final String FAIL_TIME = "failTime";

    /* renamed from: IP */
    public static final String f10844IP = "ip";
    public static final String LOCAL = "local";
    public static final long MAX_FAIL_TIME = 1800000;
    public static final String PORT = "port";

    /* renamed from: SP */
    public static final String f10845SP = "sp";
    public static final String WEIGHT = "weight";
    private int failCount;
    private long failTime;

    /* renamed from: ip */
    private String f10846ip;
    private String local;
    private int port;

    /* renamed from: sp */
    private String f10847sp;
    private int weight;

    public IpInfo(String str, int i) {
        super(str, i);
        this.port = -1;
        this.f10847sp = BuildConfig.FLAVOR;
        this.weight = 0;
        this.failCount = 0;
        this.failTime = 0L;
    }

    public String getIp() {
        return this.f10846ip;
    }

    public void setIp(String str) {
        this.f10846ip = str;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int i) {
        if (i == 0) {
            this.port = 80;
        }
        this.port = i;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String str) {
        this.local = str;
    }

    public String getSp() {
        return this.f10847sp;
    }

    public void setSp(String str) {
        this.f10847sp = str;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int i) {
        this.weight = i;
    }

    public synchronized int getFailCount() {
        return this.failCount;
    }

    public synchronized void setFailCount(int i) {
        this.failCount = i;
    }

    public long getFailTime() {
        return this.failTime;
    }

    public void setFailTime(long j) {
        this.failTime = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: neton.client.dns.IpInfo$1 */
    /* loaded from: classes.dex */
    public class RunnableC24991 implements Runnable {
        final /* synthetic */ Context val$context;
        final /* synthetic */ int val$failCount;
        final /* synthetic */ IpInfo val$ipInfo;

        RunnableC24991(Context context, IpInfo ipInfo, int i) {
            r2 = context;
            r3 = ipInfo;
            r4 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetHelper.isConnectNet(r2)) {
                synchronized (r3) {
                    IpInfo.this.setFailCount(r4);
                    IpInfo.this.setFailTime(System.currentTimeMillis());
                    DBUtil.updateIpInfo(r2, r3);
                }
            }
        }
    }

    public void updateFailCount(Context context, int i) {
        ThreadPoolUtil.execute(new Runnable() { // from class: neton.client.dns.IpInfo.1
            final /* synthetic */ Context val$context;
            final /* synthetic */ int val$failCount;
            final /* synthetic */ IpInfo val$ipInfo;

            RunnableC24991(Context context2, IpInfo this, int i2) {
                r2 = context2;
                r3 = this;
                r4 = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NetHelper.isConnectNet(r2)) {
                    synchronized (r3) {
                        IpInfo.this.setFailCount(r4);
                        IpInfo.this.setFailTime(System.currentTimeMillis());
                        DBUtil.updateIpInfo(r2, r3);
                    }
                }
            }
        });
    }

    public boolean checkSelect() {
        if (getFailCount() != 0) {
            return getFailCount() > 0 && System.currentTimeMillis() - getFailTime() > MAX_FAIL_TIME;
        }
        return true;
    }

    public boolean checkSet() {
        String stringData = ConfigManager.getInstance().getStringData(Constants.KEY_HEADER_SET);
        return TextUtils.isEmpty(stringData) || stringData.equalsIgnoreCase(getLocal());
    }

    public String toString() {
        return this.host + ",dnsType:" + this.dnsType + ",ip:" + this.f10846ip + "," + this.port + "," + this.weight + "," + this.f10847sp + "," + this.local + "," + this.failCount + "," + this.failTime;
    }

    public static List<IpInfo> parseIpInfoList(String str, int i, List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            IpInfo parseIpInfo = parseIpInfo(str, i, list.get(i2));
            if (parseIpInfo != null) {
                arrayList.add(parseIpInfo);
            }
        }
        return arrayList;
    }

    public static IpInfo parseIpInfoByIp(String str, int i, String str2) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.m7844d("parseIpInfoByIp--url:".concat(String.valueOf(str2)));
            return null;
        }
        IpInfo ipInfo = new IpInfo(str, i);
        ipInfo.setIp(str2);
        return ipInfo;
    }

    public static IpInfo parseIpInfo(String str, int i, String str2) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.m7844d("parseIpInfo--url is null:".concat(String.valueOf(str2)));
            return null;
        }
        String[] split = str2.trim().split(",");
        if (split.length < 5 && split.length > 0) {
            LogUtil.m7844d("parseIpInfo--strs:" + Arrays.toString(split));
            return parseIpInfoByIp(str, i, split[0]);
        }
        try {
            IpInfo ipInfo = new IpInfo(str, i);
            ipInfo.setIp(split[0]);
            ipInfo.setPort(Integer.parseInt(split[1]));
            ipInfo.setTtl(Util.parseLong(split[2]));
            ipInfo.setWeight(Integer.parseInt(split[3]));
            ipInfo.setSp(split[4]);
            ipInfo.setLocal(split.length > 5 ? split[5] : BuildConfig.FLAVOR);
            LogUtil.m7844d("parseIpInfo--url:" + str2 + ",info:" + ipInfo.toString());
            return ipInfo;
        } catch (Exception e) {
            LogUtil.m7847e("parseIpInfo--Exception:" + e.getMessage());
            return null;
        }
    }

    public static IpInfo getIpInfoByCursor(String str, int i, Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return null;
        }
        IpInfo ipInfo = new IpInfo(str, i);
        ipInfo.setIp(cursor.getString(cursor.getColumnIndex("ip")));
        ipInfo.setPort(cursor.getInt(cursor.getColumnIndex(PORT)));
        ipInfo.setTtl(cursor.getLong(cursor.getColumnIndex(DnsInfo.TTL)));
        ipInfo.setWeight(cursor.getInt(cursor.getColumnIndex(WEIGHT)));
        ipInfo.setLocal(cursor.getString(cursor.getColumnIndex(LOCAL)));
        ipInfo.setSp(cursor.getString(cursor.getColumnIndex(f10845SP)));
        ipInfo.setFailCount(cursor.getInt(cursor.getColumnIndex(FAIL_COUNT)));
        ipInfo.setFailTime(cursor.getLong(cursor.getColumnIndex(FAIL_TIME)));
        return ipInfo;
    }

    public boolean isIpInfoValid() {
        return !TextUtils.isEmpty(getIp());
    }
}
