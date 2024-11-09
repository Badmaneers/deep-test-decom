package neton.client.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.util.Arrays;
import neton.client.Utils.LogUtil;

/* loaded from: classes.dex */
public class DBHelper extends SQLiteOpenHelper {
    private static final String COL_ID = "_id";
    private static final String DB_NAME = "com_coloros_net";
    private static final int DB_VERSION = 1;
    private static DBHelper mInstance;
    public static final String TABLE_ADDRESS_INFO = "address_info";
    public static final String TABLE_IP_INFO = "ip_info";
    static final String[] tables = {TABLE_ADDRESS_INFO, TABLE_IP_INFO};

    private DBHelper(Context context) {
        super(context, DB_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static DBHelper getInstance(Context context) {
        DBHelper dBHelper;
        synchronized (DBUtil.mLockObject) {
            if (mInstance == null) {
                mInstance = new DBHelper(context);
            }
            dBHelper = mInstance;
        }
        return dBHelper;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        createTables(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        LogUtil.m7844d("DBHelper-onUpgrade-oldVersion:" + i + ",newVersion:" + i2 + ",tables:" + Arrays.toString(tables));
        upgradeTables(sQLiteDatabase, tables);
    }

    private void createTables(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE address_info (_id INTEGER PRIMARY KEY AUTOINCREMENT,host TEXT,dnsType INTEGER,timeStamp LONG,ttl LONG);");
        sQLiteDatabase.execSQL("CREATE TABLE ip_info (_id INTEGER PRIMARY KEY AUTOINCREMENT,host TEXT,dnsType INTEGER,ttl LONG,ip TEXT,port INTEGER,weight INTEGER,failCount INTEGER,failTime LONG,sp TEXT,local TEXT);");
    }

    private void deleteTables(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        int i = 0;
        while (strArr != null) {
            try {
                if (i >= strArr.length) {
                    return;
                }
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + strArr[i]);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    private void upgradeTables(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        if (strArr != null) {
            try {
                try {
                    if (strArr.length != 0) {
                        sQLiteDatabase.beginTransaction();
                        for (String str : strArr) {
                            if (tabIsExist(sQLiteDatabase, str)) {
                                sQLiteDatabase.execSQL("ALTER TABLE " + str + " RENAME TO " + (str + "_temp"));
                            }
                        }
                        createTables(sQLiteDatabase);
                        for (String str2 : strArr) {
                            String str3 = str2 + "_temp";
                            if (tabIsExist(sQLiteDatabase, str3)) {
                                String columnNames = getColumnNames(sQLiteDatabase, str3);
                                if (!TextUtils.isEmpty(columnNames)) {
                                    try {
                                        sQLiteDatabase.execSQL("INSERT INTO " + str2 + " (" + columnNames + ")  SELECT " + columnNames + " FROM " + str3);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(str3)));
                                }
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        try {
                            sQLiteDatabase.endTransaction();
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                } catch (Exception e3) {
                    deleteTables(sQLiteDatabase, strArr);
                    createTables(sQLiteDatabase);
                    e3.printStackTrace();
                    try {
                        sQLiteDatabase.endTransaction();
                        return;
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        return;
                    }
                }
            } catch (Throwable th) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                throw th;
            }
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5 */
    private boolean tabIsExist(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor rawQuery;
        boolean z = false;
        if (str == null) {
            return false;
        }
        ?? r0 = 0;
        Cursor cursor = null;
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            try {
                rawQuery = sQLiteDatabase.rawQuery("select count(*) as c from sqlite_master where type ='table' and name ='" + str.trim() + "' ", null);
                try {
                    if (rawQuery.moveToNext()) {
                        if (rawQuery.getInt(0) > 0) {
                            z = true;
                        }
                    }
                } catch (Exception e2) {
                    cursor = rawQuery;
                    e = e2;
                    e.printStackTrace();
                    if (cursor != null) {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    }
                    r0 = "tabIsExist tabName:";
                    LogUtil.m7844d("tabIsExist tabName:" + str + ",result:" + z);
                    return z;
                } catch (Throwable th) {
                    th = th;
                    r0 = rawQuery;
                    if (r0 != 0) {
                        try {
                            if (!r0.isClosed()) {
                                r0.close();
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
            }
            if (rawQuery != null) {
                if (!rawQuery.isClosed()) {
                    rawQuery.close();
                }
            }
            r0 = "tabIsExist tabName:";
            LogUtil.m7844d("tabIsExist tabName:" + str + ",result:" + z);
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getColumnNames(android.database.sqlite.SQLiteDatabase r5, java.lang.String r6) {
        /*
            r4 = this;
            r4 = 0
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            java.lang.String r2 = "PRAGMA table_info("
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r1.append(r6)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            java.lang.String r6 = ")"
            r1.append(r6)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            android.database.Cursor r5 = r5.rawQuery(r6, r0)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            if (r5 == 0) goto L56
            java.lang.String r6 = "name"
            int r6 = r5.getColumnIndex(r6)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> Lb9
            r1 = -1
            if (r1 != r6) goto L35
            if (r5 == 0) goto L34
            boolean r4 = r5.isClosed()     // Catch: java.lang.Exception -> L30
            if (r4 != 0) goto L34
            r5.close()     // Catch: java.lang.Exception -> L30
            goto L34
        L30:
            r4 = move-exception
            r4.printStackTrace()
        L34:
            return r0
        L35:
            int r1 = r5.getCount()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> Lb9
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> Lb9
            r5.moveToFirst()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> Lb9
            r2 = r4
        L3f:
            boolean r3 = r5.isAfterLast()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> Lb9
            if (r3 != 0) goto L57
            java.lang.String r3 = r5.getString(r6)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> Lb9
            r1[r2] = r3     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> Lb9
            int r2 = r2 + 1
            r5.moveToNext()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> Lb9
            goto L3f
        L51:
            r6 = move-exception
            goto L6e
        L53:
            r6 = move-exception
            r1 = r0
            goto L6e
        L56:
            r1 = r0
        L57:
            if (r5 == 0) goto L7c
            boolean r6 = r5.isClosed()     // Catch: java.lang.Exception -> L63
            if (r6 != 0) goto L7c
            r5.close()     // Catch: java.lang.Exception -> L63
            goto L7c
        L63:
            r5 = move-exception
            r5.printStackTrace()
            goto L7c
        L68:
            r4 = move-exception
            r5 = r0
            goto Lba
        L6b:
            r6 = move-exception
            r5 = r0
            r1 = r5
        L6e:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> Lb9
            if (r5 == 0) goto L7c
            boolean r6 = r5.isClosed()     // Catch: java.lang.Exception -> L63
            if (r6 != 0) goto L7c
            r5.close()     // Catch: java.lang.Exception -> L63
        L7c:
            if (r1 != 0) goto L7f
            return r0
        L7f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L84:
            int r6 = r1.length
            if (r4 >= r6) goto L9f
            int r6 = r1.length
            int r6 = r6 + (-1)
            if (r4 != r6) goto L92
            r6 = r1[r4]
            r5.append(r6)
            goto L9c
        L92:
            r6 = r1[r4]
            r5.append(r6)
            java.lang.String r6 = ","
            r5.append(r6)
        L9c:
            int r4 = r4 + 1
            goto L84
        L9f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "DBHelper-getColumnNames:"
            r4.<init>(r6)
            java.lang.String r6 = r5.toString()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            neton.client.Utils.LogUtil.m7850i(r4)
            java.lang.String r4 = r5.toString()
            return r4
        Lb9:
            r4 = move-exception
        Lba:
            if (r5 == 0) goto Lca
            boolean r6 = r5.isClosed()     // Catch: java.lang.Exception -> Lc6
            if (r6 != 0) goto Lca
            r5.close()     // Catch: java.lang.Exception -> Lc6
            goto Lca
        Lc6:
            r5 = move-exception
            r5.printStackTrace()
        Lca:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: neton.client.database.DBHelper.getColumnNames(android.database.sqlite.SQLiteDatabase, java.lang.String):java.lang.String");
    }
}
