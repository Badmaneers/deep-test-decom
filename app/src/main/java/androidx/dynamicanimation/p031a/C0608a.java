package androidx.dynamicanimation.p031a;

import android.os.Build;
import android.os.SystemClock;
import androidx.p011b.C0328n;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimationHandler.java */
/* renamed from: androidx.dynamicanimation.a.a */
/* loaded from: classes.dex */
public final class C0608a {

    /* renamed from: a */
    public static final ThreadLocal<C0608a> f2638a = new ThreadLocal<>();

    /* renamed from: f */
    private AbstractC0614d f2643f;

    /* renamed from: d */
    private final C0328n<InterfaceC0613c, Long> f2641d = new C0328n<>();

    /* renamed from: b */
    final ArrayList<InterfaceC0613c> f2639b = new ArrayList<>();

    /* renamed from: e */
    private final C0612b f2642e = new C0612b(this);

    /* renamed from: c */
    long f2640c = 0;

    /* renamed from: g */
    private boolean f2644g = false;

    C0608a() {
    }

    /* renamed from: a */
    public static C0608a m2177a() {
        if (f2638a.get() == null) {
            f2638a.set(new C0608a());
        }
        return f2638a.get();
    }

    /* renamed from: b */
    public final AbstractC0614d m2180b() {
        if (this.f2643f == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                this.f2643f = new C0617g(this.f2642e);
            } else {
                this.f2643f = new C0615e(this.f2642e);
            }
        }
        return this.f2643f;
    }

    /* renamed from: a */
    public final void m2179a(InterfaceC0613c interfaceC0613c) {
        if (this.f2639b.size() == 0) {
            m2180b().mo2199a();
        }
        if (this.f2639b.contains(interfaceC0613c)) {
            return;
        }
        this.f2639b.add(interfaceC0613c);
    }

    /* renamed from: b */
    public final void m2181b(InterfaceC0613c interfaceC0613c) {
        this.f2641d.remove(interfaceC0613c);
        int indexOf = this.f2639b.indexOf(interfaceC0613c);
        if (indexOf >= 0) {
            this.f2639b.set(indexOf, null);
            this.f2644g = true;
        }
    }

    /* renamed from: a */
    public final void m2178a(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f2639b.size()) {
                break;
            }
            InterfaceC0613c interfaceC0613c = this.f2639b.get(i);
            if (interfaceC0613c != null) {
                Long l = this.f2641d.get(interfaceC0613c);
                if (l != null) {
                    if (l.longValue() < uptimeMillis) {
                        this.f2641d.remove(interfaceC0613c);
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    interfaceC0613c.mo2198a(j);
                }
            }
            i++;
        }
        if (this.f2644g) {
            for (int size = this.f2639b.size() - 1; size >= 0; size--) {
                if (this.f2639b.get(size) == null) {
                    this.f2639b.remove(size);
                }
            }
            this.f2644g = false;
        }
    }
}
