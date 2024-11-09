package color.support.p043v7.internal.widget;

import android.graphics.drawable.Drawable;
import android.util.IntProperty;
import androidx.core.graphics.drawable.C0546a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.x */
/* loaded from: classes.dex */
public final class C1257x extends IntProperty<Drawable> {

    /* renamed from: a */
    final /* synthetic */ C1256w f5288a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257x(C1256w c1256w, String str) {
        super(str);
        this.f5288a = c1256w;
    }

    @Override // android.util.Property
    public final /* synthetic */ Integer get(Object obj) {
        return Integer.valueOf(C0546a.m1928b((Drawable) obj));
    }

    @Override // android.util.IntProperty
    public final /* synthetic */ void setValue(Drawable drawable, int i) {
        drawable.setAlpha(i);
    }
}
