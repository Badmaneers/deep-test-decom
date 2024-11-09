package androidx.core.p024g;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewCompat.java */
/* renamed from: androidx.core.g.z */
/* loaded from: classes.dex */
public final class C0541z extends AbstractC0502ac<CharSequence> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0541z(int i, Class cls) {
        super(i, cls, (byte) 0);
    }

    @Override // androidx.core.p024g.AbstractC0502ac
    /* renamed from: a */
    final /* synthetic */ void mo1724a(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    @Override // androidx.core.p024g.AbstractC0502ac
    /* renamed from: a */
    final /* synthetic */ boolean mo1725a(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }

    @Override // androidx.core.p024g.AbstractC0502ac
    /* renamed from: a */
    final /* synthetic */ CharSequence mo1723a(View view) {
        return view.getAccessibilityPaneTitle();
    }
}
