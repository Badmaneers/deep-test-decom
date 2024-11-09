package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.appcompat.p008b.p009a.C0123l;

/* compiled from: DropDownListView.java */
/* renamed from: androidx.appcompat.widget.bl */
/* loaded from: classes.dex */
final class C0220bl extends C0123l {

    /* renamed from: a */
    private boolean f1215a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0220bl(Drawable drawable) {
        super(drawable);
        this.f1215a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m851a(boolean z) {
        this.f1215a = z;
    }

    @Override // androidx.appcompat.p008b.p009a.C0123l, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f1215a) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // androidx.appcompat.p008b.p009a.C0123l, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f1215a) {
            super.draw(canvas);
        }
    }

    @Override // androidx.appcompat.p008b.p009a.C0123l, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f1215a) {
            super.setHotspot(f, f2);
        }
    }

    @Override // androidx.appcompat.p008b.p009a.C0123l, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f1215a) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // androidx.appcompat.p008b.p009a.C0123l, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f1215a) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
