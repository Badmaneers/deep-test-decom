package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: TypefaceCompatUtil.java */
/* renamed from: androidx.core.graphics.o */
/* loaded from: classes.dex */
public final class C0562o {
    /* renamed from: a */
    public static File m1975a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IOException -> 0x0032, TryCatch #1 {IOException -> 0x0032, blocks: (B:3:0x0001, B:6:0x0016, B:16:0x0025, B:14:0x0031, B:13:0x002e, B:20:0x002a), top: B:2:0x0001, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.nio.ByteBuffer m1978a(java.io.File r9) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L32
            r1.<init>(r9)     // Catch: java.io.IOException -> L32
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L1d
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L1d
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L1d
            r4 = 0
            java.nio.MappedByteBuffer r9 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L1d
            r1.close()     // Catch: java.io.IOException -> L32
            return r9
        L1a:
            r9 = move-exception
            r2 = r0
            goto L23
        L1d:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L1f
        L1f:
            r2 = move-exception
            r8 = r2
            r2 = r9
            r9 = r8
        L23:
            if (r2 == 0) goto L2e
            r1.close()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L32
            goto L31
        L29:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.io.IOException -> L32
            goto L31
        L2e:
            r1.close()     // Catch: java.io.IOException -> L32
        L31:
            throw r9     // Catch: java.io.IOException -> L32
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0562o.m1978a(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049 A[Catch: all -> 0x004d, Throwable -> 0x0050, TryCatch #4 {Throwable -> 0x0050, blocks: (B:10:0x0013, B:13:0x002c, B:26:0x004c, B:25:0x0049, B:32:0x0045), top: B:9:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[Catch: IOException -> 0x0067, SYNTHETIC, TRY_LEAVE, TryCatch #1 {IOException -> 0x0067, blocks: (B:3:0x0005, B:6:0x000f, B:15:0x0031, B:47:0x005a, B:44:0x0063, B:51:0x005f, B:45:0x0066), top: B:2:0x0005, inners: #2 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.nio.ByteBuffer m1977a(android.content.Context r9, android.net.Uri r10) {
        /*
            android.content.ContentResolver r9 = r9.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r9 = r9.openFileDescriptor(r10, r1, r0)     // Catch: java.io.IOException -> L67
            if (r9 != 0) goto L13
            if (r9 == 0) goto L12
            r9.close()     // Catch: java.io.IOException -> L67
        L12:
            return r0
        L13:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L50
            java.io.FileDescriptor r1 = r9.getFileDescriptor()     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L50
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L50
            java.nio.channels.FileChannel r2 = r10.getChannel()     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L38
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L38
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L38
            r4 = 0
            java.nio.MappedByteBuffer r1 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L38
            r10.close()     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L50
            if (r9 == 0) goto L34
            r9.close()     // Catch: java.io.IOException -> L67
        L34:
            return r1
        L35:
            r1 = move-exception
            r2 = r0
            goto L3e
        L38:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L3a
        L3a:
            r2 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
        L3e:
            if (r2 == 0) goto L49
            r10.close()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4d
            goto L4c
        L44:
            r10 = move-exception
            r2.addSuppressed(r10)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L50
            goto L4c
        L49:
            r10.close()     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L50
        L4c:
            throw r1     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L50
        L4d:
            r10 = move-exception
            r1 = r0
            goto L56
        L50:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L52
        L52:
            r1 = move-exception
            r8 = r1
            r1 = r10
            r10 = r8
        L56:
            if (r9 == 0) goto L66
            if (r1 == 0) goto L63
            r9.close()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L67
            goto L66
        L5e:
            r9 = move-exception
            r1.addSuppressed(r9)     // Catch: java.io.IOException -> L67
            goto L66
        L63:
            r9.close()     // Catch: java.io.IOException -> L67
        L66:
            throw r10     // Catch: java.io.IOException -> L67
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0562o.m1977a(android.content.Context, android.net.Uri):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    public static ByteBuffer m1976a(Context context, Resources resources, int i) {
        File m1975a = m1975a(context);
        if (m1975a == null) {
            return null;
        }
        try {
            if (m1980a(m1975a, resources, i)) {
                return m1978a(m1975a);
            }
            return null;
        } finally {
            m1975a.delete();
        }
    }

    /* renamed from: a */
    public static boolean m1981a(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            m1979a(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m1979a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    m1979a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* renamed from: a */
    public static boolean m1980a(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m1981a = m1981a(file, inputStream);
            m1979a(inputStream);
            return m1981a;
        } catch (Throwable th2) {
            th = th2;
            m1979a(inputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m1979a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
