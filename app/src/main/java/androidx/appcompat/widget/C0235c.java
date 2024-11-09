package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionBarBackgroundDrawable.java */
/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public final class C0235c extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1272a;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C0235c(ActionBarContainer actionBarContainer) {
        this.f1272a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f1272a.f754d) {
            if (this.f1272a.f753c != null) {
                this.f1272a.f753c.draw(canvas);
            }
        } else {
            if (this.f1272a.f751a != null) {
                this.f1272a.f751a.draw(canvas);
            }
            if (this.f1272a.f752b == null || !this.f1272a.f755e) {
                return;
            }
            this.f1272a.f752b.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f1272a.f754d) {
            if (this.f1272a.f753c != null) {
                this.f1272a.f753c.getOutline(outline);
            }
        } else if (this.f1272a.f751a != null) {
            this.f1272a.f751a.getOutline(outline);
        }
    }
}
