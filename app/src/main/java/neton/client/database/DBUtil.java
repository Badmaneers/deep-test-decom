package neton.client.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.LinkedList;
import neton.client.Utils.LogUtil;
import neton.client.dns.AddressInfo;
import neton.client.dns.DnsInfo;
import neton.client.dns.IpInfo;

/* loaded from: classes.dex */
public class DBUtil {
    public static final Object mLockObject = new Object();

    private static void closeDatabase(SQLiteDatabase sQLiteDatabase) {
    }

    private static SQLiteDatabase initDatabase(Context context) {
        SQLiteDatabase openDatabase;
        synchronized (mLockObject) {
            DatabaseManager.initializeInstance(DBHelper.getInstance(context));
            openDatabase = DatabaseManager.getInstance().openDatabase();
        }
        return openDatabase;
    }

    private static void closeCursor(Cursor cursor) {
        if (cursor != null) {
            try {
                if (cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } catch (Exception unused) {
                LogUtil.m7844d("closeCursor--Exception");
            }
        }
    }

    private static void closeSource(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        closeCursor(cursor);
        closeDatabase(sQLiteDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:            if (r12.moveToLast() != false) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:            r2.add(neton.client.dns.AddressInfo.getAddressInfoByCursor(r12));     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:            if (r12.moveToPrevious() != false) goto L54;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[Catch: all -> 0x00ba, TryCatch #6 {, blocks: (B:12:0x0041, B:14:0x0097, B:27:0x008f, B:30:0x009a, B:32:0x00a1, B:33:0x00b6, B:34:0x00b9), top: B:4:0x0009 }] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.LinkedList<neton.client.dns.AddressInfo> getAddressInfoList(android.content.Context r11, int r12) {
        /*
            java.lang.String r0 = "getAddressInfoList: start."
            neton.client.Utils.LogUtil.m7850i(r0)
            java.lang.Object r0 = neton.client.database.DBUtil.mLockObject
            monitor-enter(r0)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r11 = initDatabase(r11)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L76
            java.lang.String r5 = "dnsType=?"
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6d
            r2 = 0
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6d
            r6[r2] = r12     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6d
            java.lang.String r3 = "address_info"
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6d
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L65
            r2.<init>()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L65
            if (r12 == 0) goto L41
            boolean r3 = r12.moveToLast()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L99
            if (r3 == 0) goto L41
        L31:
            neton.client.dns.AddressInfo r3 = neton.client.dns.AddressInfo.getAddressInfoByCursor(r12)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L99
            r2.add(r3)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L99
            boolean r3 = r12.moveToPrevious()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L99
            if (r3 != 0) goto L31
            goto L41
        L3f:
            r3 = move-exception
            goto L7a
        L41:
            java.lang.String r1 = "getAddressInfoList: finish."
            neton.client.Utils.LogUtil.m7850i(r1)     // Catch: java.lang.Throwable -> Lba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = "getAddressInfoList size:"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lba
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Lba
            r1.append(r3)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lba
            neton.client.Utils.LogUtil.m7844d(r1)     // Catch: java.lang.Throwable -> Lba
            closeSource(r11, r12)     // Catch: java.lang.Throwable -> Lba
            r1 = r2
            goto L97
        L60:
            r2 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
            goto L9a
        L65:
            r3 = move-exception
            r2 = r1
            goto L7a
        L68:
            r12 = move-exception
            r2 = r1
            r1 = r12
            r12 = r2
            goto L9a
        L6d:
            r3 = move-exception
            r12 = r1
            goto L79
        L70:
            r11 = move-exception
            r12 = r1
            r2 = r12
            r1 = r11
            r11 = r2
            goto L9a
        L76:
            r3 = move-exception
            r11 = r1
            r12 = r11
        L79:
            r2 = r12
        L7a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            java.lang.String r5 = "getAddressInfoList:"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L99
            r4.append(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L99
            neton.client.Utils.LogUtil.m7847e(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "getAddressInfoList: finish."
            neton.client.Utils.LogUtil.m7850i(r2)     // Catch: java.lang.Throwable -> Lba
            closeSource(r11, r12)     // Catch: java.lang.Throwable -> Lba
        L97:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lba
            return r1
        L99:
            r1 = move-exception
        L9a:
            java.lang.String r3 = "getAddressInfoList: finish."
            neton.client.Utils.LogUtil.m7850i(r3)     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto Lb6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lba
            java.lang.String r4 = "getAddressInfoList size:"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lba
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lba
            r3.append(r2)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Lba
            neton.client.Utils.LogUtil.m7844d(r2)     // Catch: java.lang.Throwable -> Lba
        Lb6:
            closeSource(r11, r12)     // Catch: java.lang.Throwable -> Lba
            throw r1     // Catch: java.lang.Throwable -> Lba
        Lba:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lba
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: neton.client.database.DBUtil.getAddressInfoList(android.content.Context, int):java.util.LinkedList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r13v7 */
    public static LinkedList<AddressInfo> getAddressInfoList(Context context, int i, String str) {
        LinkedList<AddressInfo> linkedList;
        Throwable th;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        LogUtil.m7850i("getAddressInfoList: start.");
        synchronized (mLockObject) {
            linkedList = null;
            try {
                try {
                    context = initDatabase(context);
                    try {
                        i = context.query(DBHelper.TABLE_ADDRESS_INFO, null, "host=? and dnsType=?", new String[]{str, String.valueOf((int) i)}, null, null, null);
                        if (i != 0) {
                            try {
                                if (i.moveToLast()) {
                                    LinkedList<AddressInfo> linkedList2 = new LinkedList<>();
                                    do {
                                        try {
                                            linkedList2.add(AddressInfo.getAddressInfoByCursor(i));
                                        } catch (Exception e) {
                                            e = e;
                                            LogUtil.m7847e("getAddressInfoList:" + e.getMessage());
                                            LogUtil.m7850i("getAddressInfoList: finish.");
                                            sQLiteDatabase = context;
                                            cursor = i;
                                            closeSource(sQLiteDatabase, cursor);
                                            return linkedList;
                                        }
                                    } while (i.moveToPrevious());
                                    linkedList = linkedList2;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            } catch (Throwable th2) {
                                th = th2;
                                str = 0;
                                LogUtil.m7850i("getAddressInfoList: finish.");
                                if (str != 0) {
                                    LogUtil.m7850i("getAddressInfoList size:" + str.size());
                                }
                                closeSource(context, i);
                                throw th;
                            }
                        }
                        LogUtil.m7850i("getAddressInfoList: finish.");
                        sQLiteDatabase = context;
                        cursor = i;
                        if (linkedList != null) {
                            LogUtil.m7850i("getAddressInfoList size:" + linkedList.size());
                            sQLiteDatabase = context;
                            cursor = i;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i = 0;
                        context = context;
                        LogUtil.m7847e("getAddressInfoList:" + e.getMessage());
                        LogUtil.m7850i("getAddressInfoList: finish.");
                        sQLiteDatabase = context;
                        cursor = i;
                        closeSource(sQLiteDatabase, cursor);
                        return linkedList;
                    } catch (Throwable th3) {
                        str = 0;
                        th = th3;
                        i = 0;
                    }
                } catch (Exception e4) {
                    e = e4;
                    context = 0;
                    i = 0;
                } catch (Throwable th4) {
                    i = 0;
                    str = 0;
                    th = th4;
                    context = 0;
                }
                closeSource(sQLiteDatabase, cursor);
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static AddressInfo getAddressInfo(Context context, int i, String str) {
        Cursor cursor;
        AddressInfo addressInfo;
        LogUtil.m7850i("getAddressInfo: start..--dnsType:" + ((int) i) + ",url:" + str);
        synchronized (mLockObject) {
            try {
                try {
                    context = initDatabase(context);
                    try {
                        cursor = context.query(DBHelper.TABLE_IP_INFO, null, "host=? and dnsType=?", new String[]{str, String.valueOf((int) i)}, null, null, null);
                    } catch (Exception e) {
                        e = e;
                        cursor = null;
                    } catch (Throwable th) {
                        th = th;
                        i = 0;
                        LogUtil.m7850i("getAppMessageByMessageId: finish.");
                        closeSource(context, i);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    context = 0;
                    cursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    context = 0;
                    i = 0;
                }
                try {
                    addressInfo = AddressInfo.getAddressInfoByCursor(cursor);
                    LogUtil.m7850i("getAppMessageByMessageId: finish.");
                    closeSource(context, cursor);
                    context = context;
                    i = cursor;
                } catch (Exception e3) {
                    e = e3;
                    LogUtil.m7847e("getAddressInfo:" + e.getMessage());
                    LogUtil.m7850i("getAppMessageByMessageId: finish.");
                    closeSource(context, cursor);
                    addressInfo = null;
                    context = context;
                    i = cursor;
                    return addressInfo;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return addressInfo;
    }

    public static LinkedList<IpInfo> getIpInfoList(Context context, int i, String str) {
        LinkedList<IpInfo> linkedList;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        synchronized (mLockObject) {
            linkedList = null;
            try {
                sQLiteDatabase = initDatabase(context);
                try {
                    cursor = sQLiteDatabase.query(DBHelper.TABLE_IP_INFO, null, "host=? and dnsType=?", new String[]{str, String.valueOf(i)}, null, null, null);
                    if (cursor != null) {
                        try {
                            try {
                                if (cursor.moveToLast()) {
                                    LinkedList<IpInfo> linkedList2 = new LinkedList<>();
                                    do {
                                        linkedList2.add(IpInfo.getIpInfoByCursor(str, i, cursor));
                                    } while (cursor.moveToPrevious());
                                    linkedList = linkedList2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                closeSource(sQLiteDatabase, cursor);
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            LogUtil.m7847e("getIpInfoList:" + e.getMessage());
                            closeSource(sQLiteDatabase, cursor);
                            return linkedList;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    cursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    closeSource(sQLiteDatabase, cursor);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                sQLiteDatabase = null;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase = null;
                cursor = null;
            }
            closeSource(sQLiteDatabase, cursor);
        }
        return linkedList;
    }

    public static void addAddressInfo(Context context, AddressInfo addressInfo) {
        LogUtil.m7850i("addAddressInfo start.:" + addressInfo.toString());
        synchronized (mLockObject) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(DnsInfo.HOST, addressInfo.getHost());
                contentValues.put(DnsInfo.DNS_TYPE, Integer.valueOf(addressInfo.getDnsType()));
                contentValues.put(DnsInfo.TTL, Long.valueOf(addressInfo.getTtl()));
                contentValues.put(AddressInfo.TIMESTAMP, Long.valueOf(addressInfo.getTimeStamp()));
                addDataToDB(context, DBHelper.TABLE_ADDRESS_INFO, contentValues);
                LogUtil.m7850i("addAddressInfo finish,");
            } catch (Exception unused) {
                LogUtil.m7847e("addAddressInfo--Exception");
            }
        }
    }

    public static void addIpInfo(Context context, IpInfo ipInfo) {
        LogUtil.m7850i("addIpInfo start.:".concat(String.valueOf(ipInfo)));
        synchronized (mLockObject) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(DnsInfo.HOST, ipInfo.getHost());
                contentValues.put(DnsInfo.DNS_TYPE, Integer.valueOf(ipInfo.getDnsType()));
                contentValues.put("ip", ipInfo.getIp());
                contentValues.put(IpInfo.PORT, Integer.valueOf(ipInfo.getPort()));
                contentValues.put(IpInfo.LOCAL, ipInfo.getLocal());
                contentValues.put(IpInfo.WEIGHT, Integer.valueOf(ipInfo.getWeight()));
                contentValues.put(IpInfo.f10845SP, ipInfo.getSp());
                contentValues.put(IpInfo.FAIL_COUNT, Integer.valueOf(ipInfo.getFailCount()));
                contentValues.put(IpInfo.FAIL_TIME, Long.valueOf(ipInfo.getFailTime()));
                addDataToDB(context, DBHelper.TABLE_IP_INFO, contentValues);
                LogUtil.m7850i("addIpInfo finish,");
            } catch (Exception unused) {
                LogUtil.m7847e("addIpInfo--Exception");
            }
        }
    }

    public static void updateAddressInfo(Context context, AddressInfo addressInfo) {
        SQLiteDatabase sQLiteDatabase;
        LogUtil.m7850i("updateAddressInfo start.:" + addressInfo.toString());
        ContentValues contentValues = new ContentValues();
        contentValues.put(DnsInfo.HOST, addressInfo.getHost());
        contentValues.put(DnsInfo.DNS_TYPE, Integer.valueOf(addressInfo.getDnsType()));
        contentValues.put(DnsInfo.TTL, Long.valueOf(addressInfo.getTtl()));
        contentValues.put(AddressInfo.TIMESTAMP, Long.valueOf(addressInfo.getTimeStamp()));
        synchronized (mLockObject) {
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                try {
                    sQLiteDatabase = initDatabase(context);
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(addressInfo.getDnsType());
                        sQLiteDatabase.update(DBHelper.TABLE_ADDRESS_INFO, contentValues, "host=? and dnsType=?", new String[]{addressInfo.getHost(), sb.toString()});
                        closeDatabase(sQLiteDatabase);
                    } catch (Exception e) {
                        e = e;
                        sQLiteDatabase2 = sQLiteDatabase;
                        LogUtil.m7847e("updateAddressInfo--Exception:" + e.toString());
                        closeDatabase(sQLiteDatabase2);
                    } catch (Throwable th) {
                        th = th;
                        closeDatabase(sQLiteDatabase);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabase2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String] */
    public static void updateIpInfo(Context context, IpInfo ipInfo) {
        SQLiteDatabase sQLiteDatabase;
        LogUtil.m7850i("updateIpInfo start.:" + ipInfo.toString());
        ContentValues contentValues = new ContentValues();
        contentValues.put(IpInfo.FAIL_COUNT, Integer.valueOf(ipInfo.getFailCount()));
        contentValues.put(IpInfo.FAIL_TIME, Long.valueOf(ipInfo.getFailTime()));
        synchronized (mLockObject) {
            SQLiteDatabase sQLiteDatabase2 = null;
            SQLiteDatabase sQLiteDatabase3 = null;
            try {
                try {
                    sQLiteDatabase = initDatabase(context);
                    try {
                        ?? r2 = "host=? and dnsType=? and ip=? and port=?";
                        StringBuilder sb = new StringBuilder();
                        sb.append(ipInfo.getDnsType());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(ipInfo.getPort());
                        sQLiteDatabase.update(DBHelper.TABLE_IP_INFO, contentValues, "host=? and dnsType=? and ip=? and port=?", new String[]{ipInfo.getHost(), sb.toString(), ipInfo.getIp(), sb2.toString()});
                        closeDatabase(sQLiteDatabase);
                        sQLiteDatabase2 = r2;
                    } catch (Exception e) {
                        e = e;
                        sQLiteDatabase3 = sQLiteDatabase;
                        LogUtil.m7847e("updateIpInfo--Exception:" + e.toString());
                        closeDatabase(sQLiteDatabase3);
                        sQLiteDatabase2 = sQLiteDatabase3;
                    } catch (Throwable th) {
                        th = th;
                        closeDatabase(sQLiteDatabase);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabase2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.String] */
    private static void addDataToDB(Context context, String str, ContentValues contentValues) {
        synchronized (mLockObject) {
            LogUtil.m7850i("addDataToDB-table:" + str + ",values:" + contentValues);
            if (contentValues == null) {
                return;
            }
            SQLiteDatabase sQLiteDatabase = null;
            r1 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            SQLiteDatabase sQLiteDatabase3 = null;
            try {
                try {
                    SQLiteDatabase initDatabase = initDatabase(context);
                    try {
                        initDatabase.beginTransaction();
                        initDatabase.insert(str, null, contentValues);
                        initDatabase.setTransactionSuccessful();
                        if (initDatabase != null) {
                            try {
                                initDatabase.endTransaction();
                            } catch (Exception e) {
                                LogUtil.m7847e("addDataToDB--endTransaction--Exception:" + e.toString());
                                sQLiteDatabase2 = "addDataToDB--endTransaction--Exception:";
                            }
                        }
                        closeDatabase(initDatabase);
                        sQLiteDatabase = sQLiteDatabase2;
                    } catch (Exception e2) {
                        e = e2;
                        sQLiteDatabase3 = initDatabase;
                        LogUtil.m7847e("addDataToDB--Exception:" + e.toString());
                        if (sQLiteDatabase3 != null) {
                            try {
                                sQLiteDatabase3.endTransaction();
                            } catch (Exception e3) {
                                LogUtil.m7847e("addDataToDB--endTransaction--Exception:" + e3.toString());
                            }
                        }
                        closeDatabase(sQLiteDatabase3);
                        sQLiteDatabase = sQLiteDatabase3;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = initDatabase;
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Exception e4) {
                                LogUtil.m7847e("addDataToDB--endTransaction--Exception:" + e4.toString());
                            }
                        }
                        closeDatabase(sQLiteDatabase);
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private static void deleteAllInTable(Context context, String str) {
        synchronized (mLockObject) {
            LogUtil.m7850i("deleteAllInTable-table:".concat(String.valueOf(str)));
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase initDatabase = initDatabase(context);
                    try {
                        initDatabase.delete(str, null, null);
                        closeDatabase(initDatabase);
                    } catch (Exception unused) {
                        sQLiteDatabase = initDatabase;
                        LogUtil.m7847e("deleteAllInTable--Exception");
                        closeDatabase(sQLiteDatabase);
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = initDatabase;
                        closeDatabase(sQLiteDatabase);
                        throw th;
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
    public static void deleteAddressInTable(Context context, String str, String str2, int i) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (mLockObject) {
            LogUtil.m7850i("deleteAddressInTable-table:" + str + ",url:" + str2 + ",dnsType:" + i);
            SQLiteDatabase sQLiteDatabase2 = null;
            SQLiteDatabase sQLiteDatabase3 = null;
            try {
                try {
                    sQLiteDatabase = initDatabase(context);
                    try {
                        ?? r1 = "host=? and dnsType=?";
                        sQLiteDatabase.delete(str, "host=? and dnsType=?", new String[]{str2, String.valueOf(i)});
                        closeDatabase(sQLiteDatabase);
                        sQLiteDatabase2 = r1;
                    } catch (Exception unused) {
                        sQLiteDatabase3 = sQLiteDatabase;
                        LogUtil.m7847e("deleteAddressInTable--Exception");
                        closeDatabase(sQLiteDatabase3);
                        sQLiteDatabase2 = sQLiteDatabase3;
                    } catch (Throwable th) {
                        th = th;
                        closeDatabase(sQLiteDatabase);
                        throw th;
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabase2;
            }
        }
    }

    public static void deleteIpInfosByHostAndDnsType(Context context, String str, int i) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (mLockObject) {
            LogUtil.m7850i("deleteIpInfosByHostAndDnsType-host:" + str + ",dnsType:" + i);
            SQLiteDatabase sQLiteDatabase2 = null;
            SQLiteDatabase sQLiteDatabase3 = null;
            try {
                try {
                    sQLiteDatabase = initDatabase(context);
                    try {
                        int delete = sQLiteDatabase.delete(DBHelper.TABLE_IP_INFO, "host=? and dnsType=?", new String[]{str, String.valueOf(i)});
                        LogUtil.m7850i("deleteIpInfosByHostAndDnsType-host:" + str + ",dnsType:" + i + ",count:" + delete);
                        closeDatabase(sQLiteDatabase);
                        sQLiteDatabase2 = delete;
                    } catch (Exception e) {
                        e = e;
                        sQLiteDatabase3 = sQLiteDatabase;
                        LogUtil.m7847e("deleteIpInfosByHostAndDnsType--Exception:" + e.getMessage());
                        closeDatabase(sQLiteDatabase3);
                        sQLiteDatabase2 = sQLiteDatabase3;
                    } catch (Throwable th) {
                        th = th;
                        closeDatabase(sQLiteDatabase);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabase2;
            }
        }
    }

    public static void delAllTables(Context context) {
        LogUtil.m7850i("delAllTables start.");
        synchronized (mLockObject) {
            for (int i = 0; i < DBHelper.tables.length; i++) {
                try {
                    deleteAllInTable(context, DBHelper.tables[i]);
                } catch (Exception unused) {
                    LogUtil.m7847e("delAllTables--Exception");
                }
            }
        }
        LogUtil.m7850i("delAllTables end.");
    }
}
