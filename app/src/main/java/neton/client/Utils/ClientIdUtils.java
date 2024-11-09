package neton.client.Utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import neton.client.config.ConfigManager;
import neton.client.config.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class ClientIdUtils {
    public static final String DEFAULT_CLIENT_ID = "000000000000000";
    private static final String EXTRAS_KEY_CLIENT_ID = "clientId";
    private static final int EXTRAS_KEY_CLIENT_ID_LEN = 15;
    private static final String EXTRAS_KEY_DEFAULT_VALUE = "";
    private static final String EXTRAS_KEY_UNKNOWN = "unknown";
    private static final String EXTRAS_KEY_ZERO = "0";
    private static final int MAX_RETRY_COUNT = 3;
    private static final String MCS_FILE_SUFFIX_NAME = ".ini";
    private static final long MONTH_MILLIONS = 2592000000L;
    private static final long TIMER_DELAY_PERIOD = 3000;
    private static final long TIMER_DELAY_TIME = 3000;
    private static final String MCS_HIDDEN_SD_CARD_FOLDER = ".mcs";
    private static final String MCS_HIDDEN_FILE_STORAGE_PATH = Environment.getExternalStorageDirectory().getPath() + File.separator + MCS_HIDDEN_SD_CARD_FOLDER;
    private static final String MCS_CONTROL_PULL_MSG_INFO_FILE_NAME = "mcs_msg.ini";
    private static final String MCS_CONTROL_PULL_MSG_INFO_FILE_PATH = MCS_HIDDEN_FILE_STORAGE_PATH + File.separator + MCS_CONTROL_PULL_MSG_INFO_FILE_NAME;
    private static String sClientId = "";
    private static Timer sTimer = null;
    private static final AtomicInteger sRetryCount = new AtomicInteger(0);

    private static boolean isHexDigit(byte b) {
        if (b >= 48 && b <= 57) {
            return true;
        }
        if (b < 97 || b > 122) {
            return b >= 65 && b <= 90;
        }
        return true;
    }

    static /* synthetic */ String access$100() {
        return buildClientId();
    }

    private ClientIdUtils() {
    }

    public static String getClientId(Context context, boolean z) {
        if (!ApkInfoUtil.isRegionCN() || z) {
            return DEFAULT_CLIENT_ID;
        }
        if (context == null) {
            throw new NullPointerException("context is null.");
        }
        Context applicationContext = context.getApplicationContext();
        if (System.currentTimeMillis() - ConfigManager.getInstance().getLongData(Constants.KEY_CLINET_ID_MODIFY_TIME).longValue() > MONTH_MILLIONS) {
            ConfigManager.getInstance().setStringData(Constants.KEY_CLINET_ID, "");
        }
        String stringData = ConfigManager.getInstance().getStringData(Constants.KEY_CLINET_ID, DEFAULT_CLIENT_ID);
        sClientId = stringData;
        if (TextUtils.isEmpty(stringData) || DEFAULT_CLIENT_ID.equals(sClientId)) {
            synchronized (ClientIdUtils.class) {
                if (TextUtils.isEmpty(sClientId) || DEFAULT_CLIENT_ID.equals(sClientId)) {
                    sClientId = getClientIdFromFile(applicationContext);
                    ConfigManager.getInstance().setStringData(Constants.KEY_CLINET_ID, sClientId);
                    ConfigManager.getInstance().setLongData(Constants.KEY_CLINET_ID_MODIFY_TIME, Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
        return TextUtils.isEmpty(sClientId) ? DEFAULT_CLIENT_ID : sClientId;
    }

    public static String getClientId(Context context) {
        return getClientId(context, true);
    }

    private static String getClientIdFromFile(Context context) {
        String localClientId = getLocalClientId();
        if (isNullOrEmpty(localClientId)) {
            localClientId = getClientIdByOS(context);
            if (localClientId == null) {
                startRetryTimer(context);
            } else if (isInvalidClientId(localClientId)) {
                localClientId = buildClientId();
            }
            setLocalClientId(localClientId);
        }
        return localClientId;
    }

    public static String getClientIdByOS(Context context) {
        String reflectColorImei = reflectColorImei(context);
        return reflectColorImei == null ? getDeviceId(context) : reflectColorImei;
    }

    private static void startRetryTimer(final Context context) {
        if (sTimer != null) {
            return;
        }
        sTimer = new Timer();
        sTimer.schedule(new TimerTask() { // from class: neton.client.Utils.ClientIdUtils.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                String clientIdByOS = ClientIdUtils.getClientIdByOS(context);
                if (clientIdByOS != null) {
                    if (ClientIdUtils.isInvalidClientId(clientIdByOS)) {
                        clientIdByOS = ClientIdUtils.access$100();
                    }
                    ClientIdUtils.setLocalClientId(clientIdByOS);
                    cancel();
                    ClientIdUtils.cancelTimer();
                    return;
                }
                if (3 <= ClientIdUtils.sRetryCount.incrementAndGet()) {
                    cancel();
                    ClientIdUtils.cancelTimer();
                }
            }
        }, 3000L, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cancelTimer() {
        if (sTimer != null) {
            sTimer.cancel();
            sRetryCount.set(0);
            sTimer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInvalidClientId(String str) {
        return EXTRAS_KEY_UNKNOWN.equalsIgnoreCase(str) || "null".equalsIgnoreCase(str) || EXTRAS_KEY_ZERO.equalsIgnoreCase(str);
    }

    @SuppressLint({"HardwareIds"})
    private static String getDeviceId(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception e) {
            LogUtil.m7847e(e.getMessage());
            return null;
        }
    }

    private static String reflectColorImei(Context context) {
        try {
            Class<?> cls = Class.forName("android.telephony.ColorOSTelephonyManager");
            return (String) cls.getMethod("colorGetImei", Integer.TYPE).invoke(cls.getMethod("getDefault", Context.class).invoke(cls, context), 0);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
            LogUtil.m7847e("reflectColorImei--Exception");
            return null;
        }
    }

    private static String getLocalClientId() {
        String loadData = loadData(MCS_CONTROL_PULL_MSG_INFO_FILE_PATH);
        if (isNullOrEmpty(loadData)) {
            return null;
        }
        return getString(parseObject(loadData, null), EXTRAS_KEY_CLIENT_ID, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setLocalClientId(String str) {
        try {
            String loadData = loadData(MCS_CONTROL_PULL_MSG_INFO_FILE_PATH);
            JSONObject parseObject = isNullOrEmpty(loadData) ? null : parseObject(loadData, null);
            if (parseObject == null) {
                parseObject = new JSONObject();
            }
            try {
                if (!isNullOrEmpty(str)) {
                    parseObject.put(EXTRAS_KEY_CLIENT_ID, str);
                }
            } catch (JSONException e) {
                LogUtil.m7847e(e.getMessage());
            }
            String jSONObject = parseObject.toString();
            if (isNullOrEmpty(jSONObject)) {
                return;
            }
            saveData(MCS_CONTROL_PULL_MSG_INFO_FILE_PATH, jSONObject);
        } catch (Exception e2) {
            LogUtil.m7847e(e2.getMessage());
        }
    }

    private static String buildClientId() {
        String str = getTimeStamp().substring(0, 6) + getUUIDHashCode();
        if (str.length() < 15) {
            str = (str + "123456789012345").substring(0, 15);
        }
        return replaceNonHexChar(str);
    }

    private static String getUUIDHashCode() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(randomUUID.toString().hashCode()));
        if (sb.length() < 9) {
            while (sb.length() < 9) {
                sb.append(EXTRAS_KEY_ZERO);
            }
        }
        return sb.substring(0, 9);
    }

    private static String loadData(String str) {
        StringBuilder readFile;
        if (!isExternalStorageMediaMounted() || (readFile = readFile(str, "utf-8")) == null) {
            return null;
        }
        return readFile.toString();
    }

    private static JSONObject parseObject(String str, JSONObject jSONObject) {
        Object parse = parse(str, jSONObject);
        return parse instanceof JSONObject ? (JSONObject) parse : jSONObject;
    }

    private static Object parse(String str, Object obj) {
        if (!isNullOrEmpty(str)) {
            try {
                return new JSONTokener(str).nextValue();
            } catch (JSONException e) {
                LogUtil.m7847e(e.getMessage());
            }
        }
        return obj;
    }

    private static String getString(JSONObject jSONObject, String str, String str2) {
        Object objectValue = getObjectValue(jSONObject, str, str2);
        return objectValue == null ? "" : objectValue.toString();
    }

    private static Object getObjectValue(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject == null) {
            return obj;
        }
        try {
            return !jSONObject.isNull(str) ? jSONObject.get(str) : obj;
        } catch (Exception e) {
            LogUtil.m7847e(e.getMessage());
            return obj;
        }
    }

    private static boolean isExternalStorageMediaMounted() {
        return Environment.getExternalStorageState() != null && Environment.getExternalStorageState().equals("mounted");
    }

    private static StringBuilder readFile(String str, String str2) {
        File file = new File(str);
        StringBuilder sb = new StringBuilder("");
        BufferedReader bufferedReader = null;
        try {
        } catch (IOException e) {
            LogUtil.m7847e(e.getMessage());
        }
        if (!file.isFile()) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), str2));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!sb.toString().equals("")) {
                            sb.append("\r\n");
                        }
                        sb.append(readLine);
                    } catch (IOException e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        LogUtil.m7847e(e.getMessage());
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return sb;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                LogUtil.m7847e(e3.getMessage());
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
        }
        return sb;
    }

    private static void saveData(String str, String str2) {
        if (isExternalStorageMediaMounted()) {
            writeFile(str, str2, false);
        }
    }

    private static boolean writeFile(String str, String str2, boolean z) {
        if (isNullOrEmpty(str2)) {
            return false;
        }
        FileWriter fileWriter = null;
        try {
            try {
                makeDirs(str);
                File file = new File(str);
                if (!file.exists() && !file.createNewFile()) {
                    return false;
                }
                FileWriter fileWriter2 = new FileWriter(str, z);
                try {
                    fileWriter2.write(str2);
                    fileWriter2.flush();
                    try {
                        fileWriter2.close();
                        return true;
                    } catch (IOException unused) {
                        return true;
                    }
                } catch (IOException e) {
                    e = e;
                    fileWriter = fileWriter2;
                    LogUtil.m7847e("writeFile--IOException:" + e.getMessage());
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean makeDirs(String str) {
        String folderName = getFolderName(str);
        if (isNullOrEmpty(folderName)) {
            return false;
        }
        File file = new File(folderName);
        return file.exists() || file.mkdirs();
    }

    private static String getFolderName(String str) {
        if (isNullOrEmpty(str)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        return lastIndexOf == -1 ? "" : str.substring(0, lastIndexOf);
    }

    private static String getTimeStamp() {
        return new SimpleDateFormat("yyMMddHHmmssSSS", Locale.getDefault()).format(new Date());
    }

    private static String replaceNonHexChar(String str) {
        if (isNullOrEmpty(str)) {
            return str;
        }
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (!isHexDigit(bytes[i])) {
                bytes[i] = 48;
            }
        }
        return new String(bytes, Charset.defaultCharset());
    }

    private static boolean isNullOrEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
}
