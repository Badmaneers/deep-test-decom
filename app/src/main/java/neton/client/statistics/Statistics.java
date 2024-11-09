package neton.client.statistics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Statistics {
    private static final String APP_ID = "appID";
    private static final String APP_NAME = "appName";
    private static final String APP_PACKAGE = "appPackage";
    private static final String APP_VERSION = "appVersion";
    private static final int COMMON = 1006;
    private static final String DATA_TYPE = "dataType";
    private static final String EVENT_ID = "eventID";
    private static final String LOG_MAP = "logMap";
    private static final String LOG_TAG = "logTag";
    private static final String SSOID = "ssoid";
    private static final String UPLOAD_NOW = "uploadNow";
    private static final String VERSION = "1.0.0";
    private static ExecutorService sSingleThreadExecutor = Executors.newSingleThreadExecutor();
    private static int appID = 20120;

    public static void onCommon(final Context context, final String str, final String str2, final Map<String, String> map, final boolean z) {
        try {
            Log.d("Statistics", "onCommonWithoutJar logTag is " + str + ",logmap:" + map);
            if (str == null || TextUtils.isEmpty(str)) {
                return;
            }
            sSingleThreadExecutor.execute(new Runnable() { // from class: neton.client.statistics.Statistics.1
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject = new JSONObject();
                    if (map != null && !map.isEmpty()) {
                        try {
                            for (String str3 : map.keySet()) {
                                jSONObject.put(str3, map.get(str3));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName("com.nearme.statistics.rom", "com.nearme.statistics.rom.service.ReceiverService"));
                    intent.putExtra(Statistics.APP_PACKAGE, context.getPackageName());
                    intent.putExtra(Statistics.APP_NAME, context.getApplicationInfo().name);
                    intent.putExtra(Statistics.APP_VERSION, "1.0.0");
                    intent.putExtra("ssoid", "system");
                    intent.putExtra(Statistics.APP_ID, Statistics.appID);
                    intent.putExtra(Statistics.EVENT_ID, str2);
                    intent.putExtra(Statistics.UPLOAD_NOW, z);
                    intent.putExtra(Statistics.LOG_TAG, str);
                    intent.putExtra(Statistics.LOG_MAP, jSONObject.toString());
                    intent.putExtra(Statistics.DATA_TYPE, Statistics.COMMON);
                    context.startService(intent);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
