package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CircleImageView.java */
/* renamed from: androidx.swiperefreshlayout.widget.a */
/* loaded from: classes.dex */
public final class C0981a extends ImageView {

    /* renamed from: a */
    int f4029a;

    /* renamed from: b */
    private Animation.AnimationListener f4030b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0981a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f4029a = (int) (3.5f * f);
        if (m3453a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0538w.m1839a(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0982b(this, this.f4029a));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f4029a, i2, i, 503316480);
            int i3 = this.f4029a;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(-328966);
        C0538w.m1846a(this, shapeDrawable);
    }

    /* renamed from: a */
    private static boolean m3453a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m3453a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f4029a * 2), getMeasuredHeight() + (this.f4029a * 2));
    }

    /* renamed from: a */
    public final void m3454a(Animation.AnimationListener animationListener) {
        this.f4030b = animationListener;
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        if (this.f4030b != null) {
            this.f4030b.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f4030b != null) {
            this.f4030b.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
