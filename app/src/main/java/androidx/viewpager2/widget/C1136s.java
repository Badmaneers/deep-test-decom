package androidx.viewpager2.widget;

import android.view.View;
import androidx.core.p024g.p025a.InterfaceC0491l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager2.java */
/* renamed from: androidx.viewpager2.widget.s */
/* loaded from: classes.dex */
public final class C1136s implements InterfaceC0491l {

    /* renamed from: a */
    final /* synthetic */ C1134q f4563a;

    public C1136s(C1134q c1134q) {
        this.f4563a = c1134q;
    }

    @Override // androidx.core.p024g.p025a.InterfaceC0491l
    /* renamed from: a */
    public final boolean mo1722a(View view) {
        this.f4563a.m3767e(((ViewPager2) view).getCurrentItem() - 1);
        return true;
    }
}
