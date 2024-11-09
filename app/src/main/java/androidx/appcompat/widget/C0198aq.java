package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0538w;

/* compiled from: AppCompatSeekBarHelper.java */
/* renamed from: androidx.appcompat.widget.aq */
/* loaded from: classes.dex */
final class C0198aq extends C0197ap {

    /* renamed from: a */
    private final SeekBar f1135a;

    /* renamed from: b */
    private Drawable f1136b;

    /* renamed from: c */
    private ColorStateList f1137c;

    /* renamed from: d */
    private PorterDuff.Mode f1138d;

    /* renamed from: e */
    private boolean f1139e;

    /* renamed from: f */
    private boolean f1140f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0198aq(SeekBar seekBar) {
        super(seekBar);
        this.f1137c = null;
        this.f1138d = null;
        this.f1139e = false;
        this.f1140f = false;
        this.f1135a = seekBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0197ap
    /* renamed from: a */
    public final void mo736a(AttributeSet attributeSet, int i) {
        super.mo736a(attributeSet, i);
        C0276dn m944a = C0276dn.m944a(this.f1135a.getContext(), attributeSet, R.styleable.AppCompatSeekBar, i, 0);
        Drawable m951b = m944a.m951b(R.styleable.AppCompatSeekBar_android_thumb);
        if (m951b != null) {
            this.f1135a.setThumb(m951b);
        }
        Drawable m948a = m944a.m948a(R.styleable.AppCompatSeekBar_tickMark);
        if (this.f1136b != null) {
            this.f1136b.setCallback(null);
        }
        this.f1136b = m948a;
        if (m948a != null) {
            m948a.setCallback(this.f1135a);
            C0546a.m1929b(m948a, C0538w.m1878h(this.f1135a));
            if (m948a.isStateful()) {
                m948a.setState(this.f1135a.getDrawableState());
            }
            m737d();
        }
        this.f1135a.invalidate();
        if (m944a.m964i(R.styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1138d = C0218bj.m846a(m944a.m946a(R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.f1138d);
            this.f1140f = true;
        }
        if (m944a.m964i(R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.f1137c = m944a.m960f(R.styleable.AppCompatSeekBar_tickMarkTint);
            this.f1139e = true;
        }
        m944a.m952b();
        m737d();
    }

    /* renamed from: d */
    private void m737d() {
        if (this.f1136b != null) {
            if (this.f1139e || this.f1140f) {
                this.f1136b = C0546a.m1933f(this.f1136b.mutate());
                if (this.f1139e) {
                    C0546a.m1922a(this.f1136b, this.f1137c);
                }
                if (this.f1140f) {
                    C0546a.m1925a(this.f1136b, this.f1138d);
                }
                if (this.f1136b.isStateful()) {
                    this.f1136b.setState(this.f1135a.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m739b() {
        if (this.f1136b != null) {
            this.f1136b.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m740c() {
        Drawable drawable = this.f1136b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1135a.getDrawableState())) {
            this.f1135a.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m738a(Canvas canvas) {
        if (this.f1136b != null) {
            int max = this.f1135a.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1136b.getIntrinsicWidth();
                int intrinsicHeight = this.f1136b.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1136b.setBounds(-i, -i2, i, i2);
                float width = ((this.f1135a.getWidth() - this.f1135a.getPaddingLeft()) - this.f1135a.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1135a.getPaddingLeft(), this.f1135a.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1136b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
