package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2303p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CutoutDrawable.java */
/* renamed from: com.google.android.material.textfield.k */
/* loaded from: classes.dex */
public final class C2386k extends C2295h {

    /* renamed from: a */
    private final Paint f10546a;

    /* renamed from: b */
    private final RectF f10547b;

    /* renamed from: c */
    private int f10548c;

    C2386k() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2386k(C2303p c2303p) {
        super(c2303p == null ? new C2303p() : c2303p);
        this.f10546a = new Paint(1);
        this.f10546a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f10546a.setColor(-1);
        this.f10546a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f10547b = new RectF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m7629a() {
        return !this.f10547b.isEmpty();
    }

    /* renamed from: a */
    private void m7627a(float f, float f2, float f3, float f4) {
        if (f == this.f10547b.left && f2 == this.f10547b.top && f3 == this.f10547b.right && f4 == this.f10547b.bottom) {
            return;
        }
        this.f10547b.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7628a(RectF rectF) {
        m7627a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7630b() {
        m7627a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f10548c = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.f10548c = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.f10547b, this.f10546a);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.f10548c);
    }
}
