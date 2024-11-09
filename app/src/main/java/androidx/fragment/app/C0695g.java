package androidx.fragment.app;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Fragment.java */
/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public final class C0695g extends AbstractC0701m {

    /* renamed from: a */
    final /* synthetic */ Fragment f2956a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0695g(Fragment fragment) {
        this.f2956a = fragment;
    }

    @Override // androidx.fragment.app.AbstractC0701m
    /* renamed from: a */
    public final View mo2431a(int i) {
        if (this.f2956a.f2748O == null) {
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }
        return this.f2956a.f2748O.findViewById(i);
    }

    @Override // androidx.fragment.app.AbstractC0701m
    /* renamed from: b_ */
    public final boolean mo2432b_() {
        return this.f2956a.f2748O != null;
    }
}
