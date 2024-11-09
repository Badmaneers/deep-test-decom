package color.support.p043v7.internal.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: ColorAlertLinearLayout.java */
/* renamed from: color.support.v7.internal.widget.h */
/* loaded from: classes.dex */
final class C1241h extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ ColorAlertLinearLayout f5255a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1241h(ColorAlertLinearLayout colorAlertLinearLayout) {
        this.f5255a = colorAlertLinearLayout;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        i = this.f5255a.f5131i;
        i2 = this.f5255a.f5132j;
        i3 = this.f5255a.f5133k;
        i4 = this.f5255a.f5134l;
        i5 = this.f5255a.f5128f;
        outline.setRoundRect(i, i2, i3, i4, i5);
    }
}
