package neton.client.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import neton.client.Utils.LogUtil;
import neton.client.Utils.ThreadPoolUtil;

/* loaded from: classes.dex */
public class NetonReceiver extends BroadcastReceiver {
    private static final String ACTION_CONNECTIVITY_CHANGE = "android.net.conn.CONNECTIVITY_CHANGE";
    private static final String COLUMN_NAME_XML = "xml";
    private static final Uri CONTENT_URI = Uri.parse("content://com.nearme.romupdate.provider.db/update_list");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        processNetonAction(context, intent);
    }

    public static void processNetonAction(final Context context, final Intent intent) {
        final String action = intent.getAction();
        LogUtil.m7844d("NetonReceiver action = ".concat(String.valueOf(action)));
        ThreadPoolUtil.execute(new Runnable() { // from class: neton.client.config.NetonReceiver.1
            @Override // java.lang.Runnable
            public final void run() {
                if (action.equals(Constants.ACTION_ROM_UPDATED)) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(Constants.KEY_CONFIG_LIST);
                    LogUtil.m7844d("NetonReceiver changedFilterNameList = ".concat(String.valueOf(stringArrayListExtra)));
                    if (stringArrayListExtra == null || stringArrayListExtra.isEmpty() || !stringArrayListExtra.contains(Constants.ROMUPDATE_NETON_FILTER)) {
                        return;
                    }
                    String dataFromProvider = NetonReceiver.getDataFromProvider(context, Constants.ROMUPDATE_NETON_FILTER);
                    LogUtil.m7844d("NetonReceiver jsonValue = ".concat(String.valueOf(dataFromProvider)));
                    if (TextUtils.isEmpty(dataFromProvider)) {
                        return;
                    }
                    new JsonConfigParser().parse(dataFromProvider);
                    return;
                }
                action.equals(NetonReceiver.ACTION_CONNECTIVITY_CHANGE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:            if (r7 == null) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:            if (r7 != null) goto L14;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:            r7.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0065, code lost:            return r0;     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getDataFromProvider(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "xml"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            android.net.Uri r2 = neton.client.config.NetonReceiver.CONTENT_URI     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r4 = "filtername=\""
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r7.append(r8)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r8 = "\""
            r7.append(r8)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r5 = 0
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            if (r7 == 0) goto L42
            int r8 = r7.getCount()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L66
            if (r8 <= 0) goto L42
            boolean r8 = r7.moveToFirst()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L66
            if (r8 == 0) goto L42
            java.lang.String r8 = "xml"
            int r8 = r7.getColumnIndex(r8)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L66
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L66
            r0 = r8
            goto L42
        L40:
            r8 = move-exception
            goto L4d
        L42:
            if (r7 == 0) goto L65
        L44:
            r7.close()
            goto L65
        L48:
            r8 = move-exception
            r7 = r0
            goto L67
        L4b:
            r8 = move-exception
            r7 = r0
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "getDataFromProvider--Exception:"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L66
            r1.append(r8)     // Catch: java.lang.Throwable -> L66
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L66
            neton.client.Utils.LogUtil.m7847e(r8)     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L65
            goto L44
        L65:
            return r0
        L66:
            r8 = move-exception
        L67:
            if (r7 == 0) goto L6c
            r7.close()
        L6c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: neton.client.config.NetonReceiver.getDataFromProvider(android.content.Context, java.lang.String):java.lang.String");
    }
}
