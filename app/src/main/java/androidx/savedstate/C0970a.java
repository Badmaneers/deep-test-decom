package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0728h;
import androidx.lifecycle.EnumC0729i;
import androidx.lifecycle.InterfaceC0727g;
import androidx.lifecycle.InterfaceC0733m;
import androidx.p002a.p003a.p005b.C0043b;
import java.util.Map;

/* compiled from: SavedStateRegistry.java */
@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.savedstate.a */
/* loaded from: classes.dex */
public final class C0970a {

    /* renamed from: c */
    private Bundle f3949c;

    /* renamed from: d */
    private boolean f3950d;

    /* renamed from: b */
    private C0043b<String, InterfaceC0972c> f3948b = new C0043b<>();

    /* renamed from: a */
    boolean f3947a = true;

    /* renamed from: a */
    public final Bundle m3417a(String str) {
        if (!this.f3950d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        if (this.f3949c == null) {
            return null;
        }
        Bundle bundle = this.f3949c.getBundle(str);
        this.f3949c.remove(str);
        if (this.f3949c.isEmpty()) {
            this.f3949c = null;
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3419a(AbstractC0728h abstractC0728h, Bundle bundle) {
        if (this.f3950d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f3949c = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        abstractC0728h.mo2609a(new InterfaceC0727g() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // androidx.lifecycle.InterfaceC0731k
            /* renamed from: a */
            public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
                if (enumC0729i == EnumC0729i.ON_START) {
                    C0970a.this.f3947a = true;
                } else if (enumC0729i == EnumC0729i.ON_STOP) {
                    C0970a.this.f3947a = false;
                }
            }
        });
        this.f3950d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3418a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (this.f3949c != null) {
            bundle2.putAll(this.f3949c);
        }
        C0043b<String, InterfaceC0972c>.f m23c = this.f3948b.m23c();
        while (m23c.hasNext()) {
            Map.Entry entry = (Map.Entry) m23c.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0972c) entry.getValue()).m3420a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
