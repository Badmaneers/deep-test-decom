package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.C0861bn;
import androidx.recyclerview.widget.InterfaceC0862bo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager2.java */
/* renamed from: androidx.viewpager2.widget.k */
/* loaded from: classes.dex */
public final class C1128k implements InterfaceC0862bo {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f4554a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1128k(ViewPager2 viewPager2) {
        this.f4554a = viewPager2;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0862bo
    /* renamed from: a */
    public final void mo3132a(View view) {
        C0861bn c0861bn = (C0861bn) view.getLayoutParams();
        if (c0861bn.width != -1 || c0861bn.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
