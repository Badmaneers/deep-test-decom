package color.support.p043v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.appcompat.p008b.p009a.C0123l;

/* compiled from: ListViewCompat.java */
/* renamed from: color.support.v7.internal.widget.am */
/* loaded from: classes.dex */
final class C1230am extends C0123l {

    /* renamed from: a */
    private boolean f5227a;

    public C1230am(Drawable drawable) {
        super(drawable);
        this.f5227a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4066a(boolean z) {
        this.f5227a = z;
    }

    @Override // androidx.appcompat.p008b.p009a.C0123l, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f5227a) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // androidx.appcompat.p008b.p009a.C0123l, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f5227a) {
            super.draw(canvas);
        }
    }

    @Override // androidx.appcompat.p008b.p009a.C0123l, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f5227a) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
