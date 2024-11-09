package color.support.p043v7.internal.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: ColorGradientLinearLayout.java */
/* renamed from: color.support.v7.internal.widget.s */
/* loaded from: classes.dex */
final class C1252s extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ ColorGradientLinearLayout f5273a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1252s(ColorGradientLinearLayout colorGradientLinearLayout) {
        this.f5273a = colorGradientLinearLayout;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        i = this.f5273a.f5167v;
        i2 = this.f5273a.f5168w;
        i3 = this.f5273a.f5169x;
        i4 = this.f5273a.f5170y;
        i5 = this.f5273a.f5160o;
        outline.setRoundRect(i, i2, i3, i4, i5);
    }
}
