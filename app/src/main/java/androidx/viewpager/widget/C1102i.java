package androidx.viewpager.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0534s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager.java */
/* renamed from: androidx.viewpager.widget.i */
/* loaded from: classes.dex */
public final class C1102i implements InterfaceC0534s {

    /* renamed from: a */
    final /* synthetic */ ViewPager f4473a;

    /* renamed from: b */
    private final Rect f4474b = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1102i(ViewPager viewPager) {
        this.f4473a = viewPager;
    }

    @Override // androidx.core.p024g.InterfaceC0534s
    /* renamed from: a */
    public final C0514ao mo250a(View view, C0514ao c0514ao) {
        C0514ao m1837a = C0538w.m1837a(view, c0514ao);
        if (m1837a.m1770f()) {
            return m1837a;
        }
        Rect rect = this.f4474b;
        rect.left = m1837a.m1764a();
        rect.top = m1837a.m1766b();
        rect.right = m1837a.m1767c();
        rect.bottom = m1837a.m1768d();
        int childCount = this.f4473a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0514ao m1859b = C0538w.m1859b(this.f4473a.getChildAt(i), m1837a);
            rect.left = Math.min(m1859b.m1764a(), rect.left);
            rect.top = Math.min(m1859b.m1766b(), rect.top);
            rect.right = Math.min(m1859b.m1767c(), rect.right);
            rect.bottom = Math.min(m1859b.m1768d(), rect.bottom);
        }
        return m1837a.m1765a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
