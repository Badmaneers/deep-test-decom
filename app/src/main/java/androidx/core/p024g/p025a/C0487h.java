package androidx.core.p024g.p025a;

import android.os.Build;
import android.os.Bundle;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* renamed from: androidx.core.g.a.h */
/* loaded from: classes.dex */
public class C0487h {

    /* renamed from: a */
    private final Object f2332a;

    /* renamed from: a */
    public C0482c mo1717a(int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo1719a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C0482c mo1720b(int i) {
        return null;
    }

    public C0487h() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2332a = new C0489j(this);
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f2332a = new C0488i(this);
        } else {
            this.f2332a = null;
        }
    }

    public C0487h(Object obj) {
        this.f2332a = obj;
    }

    /* renamed from: a */
    public final Object m1718a() {
        return this.f2332a;
    }
}
