package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewModel.java */
/* renamed from: androidx.lifecycle.aa */
/* loaded from: classes.dex */
public abstract class AbstractC0716aa {

    /* renamed from: a */
    private final Map<String, Object> f3059a = new HashMap();

    /* renamed from: b */
    private volatile boolean f3060b = false;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2362a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m2599d() {
        this.f3060b = true;
        if (this.f3059a != null) {
            synchronized (this.f3059a) {
                for (Object obj : this.f3059a.values()) {
                    if (obj instanceof Closeable) {
                        try {
                            ((Closeable) obj).close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
        mo2362a();
    }
}
