package com.color.support.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.EditText;
import color.support.p043v7.appcompat.R;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ErrorEditTextHelper.java */
/* renamed from: com.color.support.widget.ex */
/* loaded from: classes.dex */
public final class C1490ex {

    /* renamed from: a */
    private static final Rect f7130a = new Rect();

    /* renamed from: b */
    private final EditText f7131b;

    /* renamed from: c */
    private final C1563j f7132c;

    /* renamed from: d */
    private ColorStateList f7133d;

    /* renamed from: e */
    private int f7134e;

    /* renamed from: f */
    private int f7135f;

    /* renamed from: g */
    private int f7136g;

    /* renamed from: h */
    private C1562i f7137h;

    /* renamed from: i */
    private ColorStateList f7138i;

    /* renamed from: j */
    private ColorStateList f7139j;

    /* renamed from: k */
    private Paint f7140k;

    /* renamed from: l */
    private Paint f7141l;

    /* renamed from: m */
    private AnimatorSet f7142m;

    /* renamed from: n */
    private boolean f7143n;

    /* renamed from: o */
    private ArrayList<Object> f7144o;

    /* renamed from: p */
    private boolean f7145p;

    /* renamed from: q */
    private boolean f7146q;

    /* renamed from: r */
    private float f7147r;

    /* renamed from: s */
    private float f7148s;

    /* renamed from: t */
    private float f7149t;

    /* renamed from: u */
    private float f7150u;

    /* renamed from: v */
    private float f7151v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1490ex(EditText editText) {
        this.f7131b = editText;
        this.f7132c = new C1563j(this.f7131b);
        this.f7132c.m5252a(new LinearInterpolator());
        this.f7132c.m5260b(new LinearInterpolator());
        this.f7132c.m5257b(8388659);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5032a(int i, int i2, int i3, float[] fArr, C1563j c1563j) {
        this.f7133d = this.f7131b.getTextColors();
        this.f7134e = this.f7131b.getHighlightColor();
        this.f7135f = i;
        this.f7136g = i2;
        if (i3 == 2) {
            Typeface.create("sans-serif-medium", 0);
            this.f7132c.m5265g();
        }
        this.f7132c.m5245a(c1563j.m5268j());
        this.f7132c.m5257b(c1563j.m5264f());
        this.f7132c.m5246a(c1563j.m5263e());
        this.f7137h = new C1562i();
        this.f7137h.setCornerRadii(fArr);
        this.f7140k = new Paint();
        this.f7140k.setStrokeWidth(this.f7136g);
        this.f7141l = new Paint();
        float dimension = this.f7131b.getResources().getDimension(R.dimen.color_edit_text_shake_amplitude);
        PathInterpolator pathInterpolator = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(pathInterpolator);
        ofFloat.setDuration(217L);
        ofFloat.addUpdateListener(new C1492ez(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, dimension);
        ofFloat2.setInterpolator(new InterpolatorC1497fd((byte) 0));
        ofFloat2.setDuration(InterpolatorC1497fd.f7158a);
        ofFloat2.addUpdateListener(new C1494fa(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 0.3f);
        ofFloat3.setInterpolator(pathInterpolator);
        ofFloat3.setDuration(133L);
        ofFloat3.setStartDelay(80L);
        ofFloat3.addUpdateListener(new C1495fb(this));
        this.f7142m = new AnimatorSet();
        this.f7142m.playTogether(ofFloat, ofFloat2, ofFloat3);
        this.f7142m.addListener(new C1496fc(this));
        this.f7131b.addTextChangedListener(new C1491ey(this));
        m5042b(c1563j);
        m5038a(c1563j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5037a(Canvas canvas, C1563j c1563j) {
        this.f7132c.m5249a(ColorStateList.valueOf(m5015a(this.f7138i.getDefaultColor(), this.f7135f, this.f7147r)));
        this.f7132c.m5259b(ColorStateList.valueOf(m5015a(this.f7139j.getDefaultColor(), this.f7135f, this.f7147r)));
        this.f7132c.m5256b(c1563j.m5266h());
        this.f7132c.m5250a(canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5036a(Canvas canvas, GradientDrawable gradientDrawable, int i) {
        this.f7137h.setBounds(gradientDrawable.getBounds());
        if (gradientDrawable instanceof C1562i) {
            this.f7137h.m5222a(((C1562i) gradientDrawable).m5224b());
        }
        this.f7137h.setStroke(this.f7136g, m5015a(i, this.f7135f, this.f7147r));
        this.f7137h.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5035a(Canvas canvas, int i, int i2, int i3, Paint paint, Paint paint2) {
        this.f7140k.setColor(m5015a(paint.getColor(), this.f7135f, this.f7147r));
        float f = i;
        canvas.drawLine(0.0f, f, i2, f, this.f7140k);
        this.f7140k.setColor(m5015a(paint2.getColor(), this.f7135f, this.f7147r));
        canvas.drawLine(0.0f, f, i3, f, this.f7140k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5034a(Canvas canvas) {
        Layout.Alignment alignment;
        float f;
        float f2;
        float f3;
        if (this.f7145p && this.f7143n) {
            int save = canvas.save();
            if (!m5027d()) {
                canvas.translate(this.f7148s, 0.0f);
            } else {
                canvas.translate(-this.f7148s, 0.0f);
            }
            int compoundPaddingStart = this.f7131b.getCompoundPaddingStart();
            int compoundPaddingEnd = this.f7131b.getCompoundPaddingEnd();
            int width = this.f7131b.getWidth() - compoundPaddingEnd;
            int i = width - compoundPaddingStart;
            float x = width + this.f7131b.getX() + this.f7131b.getScrollX();
            float f4 = i;
            float scrollX = (this.f7150u - this.f7131b.getScrollX()) - f4;
            this.f7131b.getLineBounds(0, f7130a);
            int save2 = canvas.save();
            if (!m5027d()) {
                canvas.translate(compoundPaddingStart, f7130a.top);
            } else {
                canvas.translate(compoundPaddingEnd, f7130a.top);
            }
            int save3 = canvas.save();
            if (this.f7131b.getBottom() == this.f7151v && this.f7150u > f4) {
                if (!m5027d()) {
                    canvas.translate(-scrollX, 0.0f);
                    canvas.clipRect(this.f7131b.getScrollX(), 0.0f, x, this.f7151v);
                } else {
                    canvas.clipRect(this.f7131b.getScrollX() + i, 0.0f, this.f7131b.getScrollX(), this.f7151v);
                }
            }
            Layout layout = this.f7131b.getLayout();
            layout.getPaint().setColor(this.f7133d.getDefaultColor());
            layout.draw(canvas);
            canvas.restoreToCount(save3);
            canvas.restoreToCount(save2);
            switch (this.f7131b.getTextAlignment()) {
                case 1:
                    int gravity = this.f7131b.getGravity() & 8388615;
                    if (gravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                        break;
                    } else if (gravity == 3) {
                        if (!m5027d()) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                        } else {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        }
                    } else if (gravity == 5) {
                        if (!m5027d()) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                        }
                    } else if (gravity == 8388611) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break;
                    } else if (gravity == 8388613) {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    } else {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break;
                    }
                case 2:
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                case 3:
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                case 4:
                    alignment = Layout.Alignment.ALIGN_CENTER;
                    break;
                case 5:
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                case 6:
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                default:
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
            }
            this.f7141l.setColor(m5014a(this.f7149t));
            if ((alignment == Layout.Alignment.ALIGN_NORMAL && !m5027d()) || (alignment == Layout.Alignment.ALIGN_OPPOSITE && m5027d())) {
                f3 = compoundPaddingStart;
            } else {
                if (!(alignment == Layout.Alignment.ALIGN_NORMAL && m5027d()) && (alignment != Layout.Alignment.ALIGN_OPPOSITE || m5027d())) {
                    float f5 = (((compoundPaddingStart + r4) - compoundPaddingEnd) / 2.0f) - (this.f7150u / 2.0f);
                    f = f5;
                    f2 = this.f7150u + f5;
                    canvas.drawRect(f, f7130a.top, f2, f7130a.bottom, this.f7141l);
                    canvas.restoreToCount(save);
                }
                f3 = compoundPaddingStart;
            }
            f = f3;
            f2 = f;
            canvas.drawRect(f, f7130a.top, f2, f7130a.bottom, this.f7141l);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: a */
    private int m5014a(float f) {
        return Color.argb((int) (f * 255.0f), Color.red(this.f7135f), Color.green(this.f7135f), Color.blue(this.f7135f));
    }

    /* renamed from: a */
    private static int m5015a(int i, int i2, float f) {
        if (f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = 1.0f - f;
        int alpha = (int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f));
        int red = (int) ((Color.red(i) * f2) + (Color.red(i2) * f));
        int green = (int) ((Color.green(i) * f2) + (Color.green(i2) * f));
        int blue = (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f));
        if (alpha > 255) {
            alpha = 255;
        }
        if (red > 255) {
            red = 255;
        }
        if (green > 255) {
            green = 255;
        }
        if (blue > 255) {
            blue = 255;
        }
        return Color.argb(alpha, red, green, blue);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m5041a() {
        return this.f7143n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5017a(boolean z, boolean z2, boolean z3) {
        if (this.f7143n == z) {
            return;
        }
        this.f7143n = z;
        m5024c();
        if (z2) {
            m5016a(z, z3);
        } else {
            m5021b(z, z3);
        }
    }

    /* renamed from: a */
    private void m5016a(boolean z, boolean z2) {
        if (z) {
            m5020b();
            this.f7131b.setTextColor(0);
            this.f7131b.setHighlightColor(0);
            this.f7147r = 0.0f;
            this.f7148s = 0.0f;
            this.f7149t = 0.0f;
            this.f7145p = true;
            this.f7146q = this.f7131b.isFocused();
            this.f7142m.start();
            return;
        }
        m5020b();
        m5022b(false, false, z2);
    }

    /* renamed from: b */
    private void m5021b(boolean z, boolean z2) {
        if (z) {
            this.f7147r = 1.0f;
            this.f7148s = 0.0f;
            this.f7149t = 0.0f;
            m5022b(true, false, z2);
            return;
        }
        m5022b(false, false, z2);
    }

    /* renamed from: b */
    private void m5020b() {
        if (this.f7142m.isStarted()) {
            this.f7142m.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5022b(boolean z, boolean z2, boolean z3) {
        this.f7145p = false;
        if (z) {
            if (z2) {
                this.f7131b.setTextColor(this.f7133d);
            }
            this.f7131b.setHighlightColor(m5014a(0.3f));
            if (z3) {
                this.f7131b.setSelection(0, this.f7131b.getText().length());
                return;
            }
            return;
        }
        this.f7131b.setTextColor(this.f7133d);
        this.f7131b.setHighlightColor(this.f7134e);
    }

    /* renamed from: c */
    private void m5024c() {
        if (this.f7144o != null) {
            for (int i = 0; i < this.f7144o.size(); i++) {
                this.f7144o.get(i);
            }
        }
    }

    /* renamed from: d */
    private boolean m5027d() {
        return this.f7131b.getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5038a(C1563j c1563j) {
        this.f7138i = c1563j.m5272n();
        this.f7139j = c1563j.m5271m();
        this.f7132c.m5249a(this.f7138i);
        this.f7132c.m5259b(this.f7139j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m5042b(C1563j c1563j) {
        this.f7132c.m5253a(c1563j.m5270l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m5043c(C1563j c1563j) {
        Rect m5244a = c1563j.m5244a();
        Rect m5255b = c1563j.m5255b();
        this.f7132c.m5247a(m5244a.left, m5244a.top, m5244a.right, m5244a.bottom);
        this.f7132c.m5258b(m5255b.left, m5255b.top, m5255b.right, m5255b.bottom);
        this.f7132c.m5269k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5040a(int[] iArr) {
        this.f7132c.m5254a(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5033a(int i, ColorStateList colorStateList) {
        this.f7132c.m5248a(i, colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5039a(boolean z) {
        m5017a(z, true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ void m5031f(C1490ex c1490ex) {
        if (c1490ex.f7144o != null) {
            for (int i = 0; i < c1490ex.f7144o.size(); i++) {
                c1490ex.f7144o.get(i);
            }
        }
    }
}
