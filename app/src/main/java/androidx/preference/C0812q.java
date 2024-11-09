package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.content.C0420a;

/* compiled from: PreferenceManager.java */
/* renamed from: androidx.preference.q */
/* loaded from: classes.dex */
public final class C0812q {

    /* renamed from: a */
    private Context f3326a;

    /* renamed from: b */
    private SharedPreferences f3327b;

    /* renamed from: c */
    private AbstractC0808m f3328c;

    /* renamed from: d */
    private SharedPreferences.Editor f3329d;

    /* renamed from: e */
    private boolean f3330e;

    /* renamed from: f */
    private String f3331f;

    /* renamed from: g */
    private int f3332g;

    /* renamed from: h */
    private int f3333h;

    /* renamed from: i */
    private InterfaceC0813s f3334i;

    /* renamed from: a */
    public final AbstractC0808m m2737a() {
        return this.f3328c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final SharedPreferences.Editor m2739c() {
        if (this.f3328c != null) {
            return null;
        }
        if (this.f3330e) {
            if (this.f3329d == null) {
                this.f3329d = m2738b().edit();
            }
            return this.f3329d;
        }
        return m2738b().edit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m2740d() {
        return !this.f3330e;
    }

    /* renamed from: e */
    public final InterfaceC0813s m2741e() {
        return this.f3334i;
    }

    /* renamed from: b */
    public final SharedPreferences m2738b() {
        Context m1489c;
        if (this.f3328c != null) {
            return null;
        }
        if (this.f3327b == null) {
            if (this.f3333h == 1) {
                m1489c = C0420a.m1489c(this.f3326a);
            } else {
                m1489c = this.f3326a;
            }
            this.f3327b = m1489c.getSharedPreferences(this.f3331f, this.f3332g);
        }
        return this.f3327b;
    }
}
