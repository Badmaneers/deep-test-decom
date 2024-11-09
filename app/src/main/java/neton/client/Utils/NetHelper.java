package neton.client.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.coloros.neton.BuildConfig;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import neton.client.config.ConfigManager;
import neton.client.config.Constants;

/* loaded from: classes.dex */
public class NetHelper {
    public static final String CARRIER_BGP = "bgp";
    private static final String CARRIER_CHINA_MOBILE = "cm";
    public static final String CARRIER_CHINA_TELCOM = "ct";
    private static final String CARRIER_CHINA_UNION = "cu";
    private static final String CARRIER_NONE = "none";
    public static final String CARRIER_OTHER = "ot";
    public static final String CARRIER_WIFI = "wifi";
    private static final int NETWORK_CLASS_2_G = 1;
    private static final int NETWORK_CLASS_3_G = 2;
    private static final int NETWORK_CLASS_4_G = 3;
    private static final int NETWORK_CLASS_UNAVAILABLE = -1;
    private static final int NETWORK_CLASS_UNKNOWN = 0;
    private static final int NETWORK_CLASS_WIFI = -101;
    private static final int NETWORK_TYPE_1xRTT = 7;
    private static final int NETWORK_TYPE_CDMA = 4;
    private static final int NETWORK_TYPE_EDGE = 2;
    private static final int NETWORK_TYPE_EHRPD = 14;
    private static final int NETWORK_TYPE_EVDO_0 = 5;
    private static final int NETWORK_TYPE_EVDO_A = 6;
    private static final int NETWORK_TYPE_EVDO_B = 12;
    private static final int NETWORK_TYPE_GPRS = 1;
    private static final int NETWORK_TYPE_HSDPA = 8;
    private static final int NETWORK_TYPE_HSPA = 10;
    private static final int NETWORK_TYPE_HSPAP = 15;
    private static final int NETWORK_TYPE_HSUPA = 9;
    private static final int NETWORK_TYPE_IDEN = 11;
    private static final int NETWORK_TYPE_LTE = 13;
    private static final int NETWORK_TYPE_UMTS = 3;
    private static final int NETWORK_TYPE_UNAVAILABLE = -1;
    private static final int NETWORK_TYPE_UNKNOWN = 0;
    private static final int NETWORK_TYPE_WIFI = -101;
    public static final String OPPO_CTA_USER_EXPERIENCE = "oppo_cta_user_experience";
    private static final String TAG = "NetHelper";
    private static String sCarrierStatus = "none";
    private static String sLastCarrierStatus = "none";

    private static int getNetworkClassByType(int i) {
        if (i == -101) {
            return -101;
        }
        if (i == -1) {
            return -1;
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 1;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 2;
            case 13:
                return 3;
            default:
                return 0;
        }
    }

    public static String getCarrierStatus() {
        return sCarrierStatus;
    }

    public static String getLastCarrierStatus() {
        return sLastCarrierStatus;
    }

    public static void setCarrierStatus(Context context) {
        sLastCarrierStatus = sCarrierStatus;
        if (isWifiConnecting(context)) {
            sCarrierStatus = CARRIER_WIFI;
        } else {
            String carrierName = getCarrierName(context);
            if (CARRIER_CHINA_MOBILE.equals(carrierName)) {
                sCarrierStatus = CARRIER_CHINA_MOBILE;
            } else if (CARRIER_CHINA_UNION.equals(carrierName)) {
                sCarrierStatus = CARRIER_CHINA_UNION;
            } else if (CARRIER_CHINA_TELCOM.equals(carrierName)) {
                sCarrierStatus = CARRIER_CHINA_TELCOM;
            } else {
                sCarrierStatus = CARRIER_NONE;
            }
        }
        LogUtil.m7844d("setCarrierStatus--:" + sLastCarrierStatus + "-->" + sCarrierStatus);
    }

    public static boolean isConnectNet(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (!activeNetworkInfo.isAvailable()) {
                if (!activeNetworkInfo.isConnected()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            LogUtil.m7849e(TAG, e);
            return false;
        }
    }

    public static boolean hasAccessAndNetwork(Context context) {
        boolean networkAccess = getNetworkAccess(context);
        int intData = ConfigManager.getInstance().getIntData(Constants.NETTON_STATUS);
        boolean isConnectNet = isConnectNet(context);
        LogUtil.m7844d("hasAccessAndNetwork....access:" + networkAccess + ",net:" + isConnectNet + ",isConfigAccess:" + intData);
        return networkAccess && intData != -1 && isConnectNet;
    }

    public static boolean isWifiConnecting(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            NetworkInfo.State state = connectivityManager.getNetworkInfo(1).getState();
            if (state != null) {
                if (NetworkInfo.State.CONNECTED == state) {
                    return true;
                }
            }
        } catch (Exception unused) {
            LogUtil.m7847e("isWifiConnecting--Exception");
        }
        return false;
    }

    private static String intToIp(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    public static String getLocalIp6Address() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet6Address)) {
                        return nextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (SocketException e) {
            LogUtil.m7848e("WifiPreference IpAddress", e.toString());
            return null;
        }
    }

    private static String getLocalIp4Address() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        return nextElement.getHostAddress();
                    }
                }
            }
            return BuildConfig.FLAVOR;
        } catch (Exception e) {
            LogUtil.m7847e(e.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    public static boolean getNetworkAccess(Context context) {
        int i;
        try {
            i = Settings.System.getInt(context.getContentResolver(), OPPO_CTA_USER_EXPERIENCE);
        } catch (Settings.SettingNotFoundException unused) {
            LogUtil.m7847e("getNetworkAccess--SettingNotFoundException");
            i = 0;
        }
        StringBuilder sb = new StringBuilder("NetHelper-getNetworkAccess val:");
        sb.append(i == 1);
        LogUtil.m7850i(sb.toString());
        return i == 1;
    }

    public static String getNetworkType(Context context) {
        int i;
        NetworkInfo activeNetworkInfo;
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            LogUtil.m7849e(TAG, e);
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                i = -101;
            } else {
                if (type == 0) {
                    i = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                }
                i = 0;
            }
        } else {
            i = -1;
        }
        int networkClassByType = getNetworkClassByType(i);
        if (networkClassByType == -101) {
            return "WIFI";
        }
        switch (networkClassByType) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "UNKNOWN";
            case 1:
                return "2G";
            case 2:
                return "3G";
            case 3:
                return "4G";
            default:
                return "UNKNOWN";
        }
    }

    public static String getCarrier(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception e) {
            LogUtil.m7849e(TAG, e);
            return CARRIER_NONE;
        }
    }

    public static String getCarrierName(Context context) {
        String subscriberId;
        String str;
        String str2 = CARRIER_BGP;
        try {
            subscriberId = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        } catch (Exception unused) {
            LogUtil.m7847e("getCarrierName--Exception");
        }
        if (TextUtils.isEmpty(subscriberId)) {
            return CARRIER_BGP;
        }
        if (!subscriberId.startsWith("46000") && !subscriberId.startsWith("46002")) {
            if (!subscriberId.startsWith("46001")) {
                if (subscriberId.startsWith("46003") || subscriberId.startsWith("46011") || subscriberId.startsWith("45502")) {
                    str = CARRIER_CHINA_TELCOM;
                }
                LogUtil.m7844d("getProvidersName--" + subscriberId + ",providersName:" + str2);
                return str2;
            }
            str = CARRIER_CHINA_UNION;
            str2 = str;
            LogUtil.m7844d("getProvidersName--" + subscriberId + ",providersName:" + str2);
            return str2;
        }
        str = CARRIER_CHINA_MOBILE;
        str2 = str;
        LogUtil.m7844d("getProvidersName--" + subscriberId + ",providersName:" + str2);
        return str2;
    }
}
