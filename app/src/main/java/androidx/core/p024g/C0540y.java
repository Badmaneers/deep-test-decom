package androidx.core.p024g;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewCompat.java */
/* renamed from: androidx.core.g.y */
/* loaded from: classes.dex */
public final class C0540y extends AbstractC0502ac<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0540y(int i, Class cls) {
        super(i, cls);
    }

    @Override // androidx.core.p024g.AbstractC0502ac
    /* renamed from: a */
    final /* synthetic */ void mo1724a(View view, Boolean bool) {
        view.setScreenReaderFocusable(bool.booleanValue());
    }

    @Override // androidx.core.p024g.AbstractC0502ac
    /* renamed from: a */
    final /* bridge */ /* synthetic */ boolean mo1725a(Boolean bool, Boolean bool2) {
        return !m1727a(bool, bool2);
    }

    @Override // androidx.core.p024g.AbstractC0502ac
    /* renamed from: a */
    final /* synthetic */ Boolean mo1723a(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
