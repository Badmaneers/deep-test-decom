package androidx.dynamicanimation.p031a;

import android.view.View;

/* compiled from: DynamicAnimation.java */
/* renamed from: androidx.dynamicanimation.a.n */
/* loaded from: classes.dex */
final class C0624n extends AbstractC0636z {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0624n(String str) {
        super(str, (byte) 0);
    }

    @Override // androidx.dynamicanimation.p031a.AbstractC0609aa
    /* renamed from: a */
    public final /* synthetic */ float mo2182a(View view) {
        return view.getScrollX();
    }

    @Override // androidx.dynamicanimation.p031a.AbstractC0609aa
    /* renamed from: a */
    public final /* synthetic */ void mo2183a(View view, float f) {
        view.setScrollX((int) f);
    }
}