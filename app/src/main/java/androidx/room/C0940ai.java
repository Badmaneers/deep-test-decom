package androidx.room;

import android.content.Context;
import androidx.p032e.p033a.InterfaceC0647c;
import androidx.room.p038a.C0926d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SQLiteCopyOpenHelper.java */
/* renamed from: androidx.room.ai */
/* loaded from: classes.dex */
public final class C0940ai implements InterfaceC0647c {

    /* renamed from: a */
    private final Context f3865a;

    /* renamed from: b */
    private final String f3866b;

    /* renamed from: c */
    private final File f3867c;

    /* renamed from: d */
    private final int f3868d;

    /* renamed from: e */
    private final InterfaceC0647c f3869e;

    /* renamed from: f */
    private C0922a f3870f;

    /* renamed from: g */
    private boolean f3871g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0940ai(Context context, String str, File file, int i, InterfaceC0647c interfaceC0647c) {
        this.f3865a = context;
        this.f3866b = str;
        this.f3867c = file;
        this.f3868d = i;
        this.f3869e = interfaceC0647c;
    }

    @Override // androidx.p032e.p033a.InterfaceC0647c
    /* renamed from: a */
    public final String mo2219a() {
        return this.f3869e.mo2219a();
    }

    @Override // androidx.p032e.p033a.InterfaceC0647c
    /* renamed from: a */
    public final void mo2220a(boolean z) {
        this.f3869e.mo2220a(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #4 {all -> 0x0095, blocks: (B:13:0x0029, B:39:0x0032, B:15:0x0042, B:20:0x0047, B:21:0x004b, B:24:0x0050, B:27:0x005b, B:31:0x0063, B:29:0x0070, B:34:0x0068, B:37:0x008a, B:42:0x003a, B:43:0x0041), top: B:12:0x0029, outer: #3, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.p032e.p033a.InterfaceC0647c
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized androidx.p032e.p033a.InterfaceC0646b mo2221b() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f3871g     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L9a
            java.lang.String r0 = r7.mo2219a()     // Catch: java.lang.Throwable -> La2
            android.content.Context r1 = r7.f3865a     // Catch: java.lang.Throwable -> La2
            java.io.File r1 = r1.getDatabasePath(r0)     // Catch: java.lang.Throwable -> La2
            androidx.room.a r2 = r7.f3870f     // Catch: java.lang.Throwable -> La2
            r3 = 1
            if (r2 == 0) goto L1d
            androidx.room.a r2 = r7.f3870f     // Catch: java.lang.Throwable -> La2
            boolean r2 = r2.f3793j     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L1b
            goto L1d
        L1b:
            r2 = 0
            goto L1e
        L1d:
            r2 = r3
        L1e:
            androidx.room.a.a r4 = new androidx.room.a.a     // Catch: java.lang.Throwable -> La2
            android.content.Context r5 = r7.f3865a     // Catch: java.lang.Throwable -> La2
            java.io.File r5 = r5.getFilesDir()     // Catch: java.lang.Throwable -> La2
            r4.<init>(r0, r5, r2)     // Catch: java.lang.Throwable -> La2
            r4.m3335a()     // Catch: java.lang.Throwable -> L95
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L95
            if (r2 != 0) goto L42
            r7.m3365a(r1)     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L95
        L35:
            r4.m3336b()     // Catch: java.lang.Throwable -> La2
            goto L92
        L39:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "Unable to copy database file."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L95
            throw r1     // Catch: java.lang.Throwable -> L95
        L42:
            androidx.room.a r2 = r7.f3870f     // Catch: java.lang.Throwable -> L95
            if (r2 != 0) goto L47
            goto L35
        L47:
            int r2 = androidx.room.p038a.C0925c.m3338a(r1)     // Catch: java.io.IOException -> L89 java.lang.Throwable -> L95
            int r5 = r7.f3868d     // Catch: java.lang.Throwable -> L95
            if (r2 != r5) goto L50
            goto L35
        L50:
            androidx.room.a r5 = r7.f3870f     // Catch: java.lang.Throwable -> L95
            int r6 = r7.f3868d     // Catch: java.lang.Throwable -> L95
            boolean r2 = r5.m3333a(r2, r6)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L5b
            goto L35
        L5b:
            android.content.Context r2 = r7.f3865a     // Catch: java.lang.Throwable -> L95
            boolean r2 = r2.deleteDatabase(r0)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L70
            r7.m3365a(r1)     // Catch: java.io.IOException -> L67 java.lang.Throwable -> L95
            goto L35
        L67:
            r0 = move-exception
            java.lang.String r1 = "ROOM"
            java.lang.String r2 = "Unable to copy database file."
            android.util.Log.w(r1, r2, r0)     // Catch: java.lang.Throwable -> L95
            goto L35
        L70:
            java.lang.String r1 = "ROOM"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            java.lang.String r5 = "Failed to delete database file ("
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L95
            r2.append(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = ") for a copy destructive migration."
            r2.append(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L95
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L95
            goto L35
        L89:
            r0 = move-exception
            java.lang.String r1 = "ROOM"
            java.lang.String r2 = "Unable to read database version."
            android.util.Log.w(r1, r2, r0)     // Catch: java.lang.Throwable -> L95
            goto L35
        L92:
            r7.f3871g = r3     // Catch: java.lang.Throwable -> La2
            goto L9a
        L95:
            r0 = move-exception
            r4.m3336b()     // Catch: java.lang.Throwable -> La2
            throw r0     // Catch: java.lang.Throwable -> La2
        L9a:
            androidx.e.a.c r0 = r7.f3869e     // Catch: java.lang.Throwable -> La2
            androidx.e.a.b r0 = r0.mo2221b()     // Catch: java.lang.Throwable -> La2
            monitor-exit(r7)
            return r0
        La2:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0940ai.mo2221b():androidx.e.a.b");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3366a(C0922a c0922a) {
        this.f3870f = c0922a;
    }

    /* renamed from: a */
    private void m3365a(File file) {
        ReadableByteChannel channel;
        if (this.f3866b != null) {
            channel = Channels.newChannel(this.f3865a.getAssets().open(this.f3866b));
        } else if (this.f3867c != null) {
            channel = new FileInputStream(this.f3867c).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f3865a.getCacheDir());
        createTempFile.deleteOnExit();
        C0926d.m3339a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }
}
