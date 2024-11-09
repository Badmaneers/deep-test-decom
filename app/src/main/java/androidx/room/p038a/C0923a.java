package androidx.room.p038a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CopyLock.java */
/* renamed from: androidx.room.a.a */
/* loaded from: classes.dex */
public final class C0923a {

    /* renamed from: a */
    private static final Map<String, Lock> f3799a = new HashMap();

    /* renamed from: b */
    private final File f3800b;

    /* renamed from: c */
    private final Lock f3801c;

    /* renamed from: d */
    private final boolean f3802d;

    /* renamed from: e */
    private FileChannel f3803e;

    public C0923a(String str, File file, boolean z) {
        this.f3800b = new File(file, str + ".lck");
        this.f3801c = m3334a(this.f3800b.getAbsolutePath());
        this.f3802d = z;
    }

    /* renamed from: a */
    public final void m3335a() {
        this.f3801c.lock();
        if (this.f3802d) {
            try {
                this.f3803e = new FileOutputStream(this.f3800b).getChannel();
                this.f3803e.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    /* renamed from: b */
    public final void m3336b() {
        if (this.f3803e != null) {
            try {
                this.f3803e.close();
            } catch (IOException unused) {
            }
        }
        this.f3801c.unlock();
    }

    /* renamed from: a */
    private static Lock m3334a(String str) {
        Lock lock;
        synchronized (f3799a) {
            lock = f3799a.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                f3799a.put(str, lock);
            }
        }
        return lock;
    }
}
