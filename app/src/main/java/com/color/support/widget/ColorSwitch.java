package com.color.support.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.p024g.p026b.C0517b;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1338c;
import com.color.support.util.C1345j;

/* loaded from: classes.dex */
public class ColorSwitch extends CompoundButton {

    /* renamed from: A */
    private float f6636A;

    /* renamed from: B */
    private int f6637B;

    /* renamed from: C */
    private float f6638C;

    /* renamed from: D */
    private float f6639D;

    /* renamed from: E */
    private float f6640E;

    /* renamed from: F */
    private boolean f6641F;

    /* renamed from: G */
    private boolean f6642G;

    /* renamed from: H */
    private boolean f6643H;

    /* renamed from: I */
    private boolean f6644I;

    /* renamed from: J */
    private boolean f6645J;

    /* renamed from: K */
    private boolean f6646K;

    /* renamed from: L */
    private Paint f6647L;

    /* renamed from: M */
    private Paint f6648M;

    /* renamed from: N */
    private Paint f6649N;

    /* renamed from: O */
    private Drawable f6650O;

    /* renamed from: P */
    private Drawable f6651P;

    /* renamed from: Q */
    private Drawable f6652Q;

    /* renamed from: R */
    private Drawable f6653R;

    /* renamed from: S */
    private Drawable f6654S;

    /* renamed from: T */
    private Drawable f6655T;

    /* renamed from: U */
    private AnimatorSet f6656U;

    /* renamed from: V */
    private AnimatorSet f6657V;

    /* renamed from: W */
    private AnimatorSet f6658W;

    /* renamed from: a */
    private String f6659a;

    /* renamed from: aa */
    private AnimatorSet f6660aa;

    /* renamed from: ab */
    private C1345j f6661ab;

    /* renamed from: ac */
    private int f6662ac;

    /* renamed from: ad */
    private int f6663ad;

    /* renamed from: ae */
    private boolean f6664ae;

    /* renamed from: af */
    private boolean f6665af;

    /* renamed from: ag */
    private AccessibilityManager f6666ag;

    /* renamed from: ah */
    private InterfaceC1483eq f6667ah;

    /* renamed from: b */
    private String f6668b;

    /* renamed from: c */
    private String f6669c;

    /* renamed from: d */
    private int f6670d;

    /* renamed from: e */
    private int f6671e;

    /* renamed from: f */
    private int f6672f;

    /* renamed from: g */
    private int f6673g;

    /* renamed from: h */
    private int f6674h;

    /* renamed from: i */
    private int f6675i;

    /* renamed from: j */
    private int f6676j;

    /* renamed from: k */
    private int f6677k;

    /* renamed from: l */
    private int f6678l;

    /* renamed from: m */
    private int f6679m;

    /* renamed from: n */
    private int f6680n;

    /* renamed from: o */
    private int f6681o;

    /* renamed from: p */
    private int f6682p;

    /* renamed from: q */
    private int f6683q;

    /* renamed from: r */
    private int f6684r;

    /* renamed from: s */
    private int f6685s;

    /* renamed from: t */
    private int f6686t;

    /* renamed from: u */
    private RectF f6687u;

    /* renamed from: v */
    private RectF f6688v;

    /* renamed from: w */
    private int f6689w;

    /* renamed from: x */
    private int f6690x;

    /* renamed from: y */
    private float f6691y;

    /* renamed from: z */
    private float f6692z;

    public ColorSwitch(Context context) {
        this(context, null);
    }

    public ColorSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6687u = new RectF();
        this.f6688v = new RectF();
        this.f6691y = 1.0f;
        this.f6692z = 1.0f;
        this.f6641F = false;
        this.f6642G = false;
        this.f6656U = new AnimatorSet();
        this.f6665af = false;
        setSoundEffectsEnabled(false);
        C1338c.m4375a(this, false);
        this.f6666ag = (AccessibilityManager) getContext().getSystemService("accessibility");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorSwitch, i, R.style.ColorSwitchStyle);
        this.f6670d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSwitch_barWidth, 0);
        this.f6671e = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSwitch_barHeight, 0);
        this.f6675i = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSwitch_outerCircleStrokeWidth, 0);
        this.f6673g = obtainStyledAttributes.getColor(R.styleable.ColorSwitch_barUncheckedColor, 0);
        this.f6672f = obtainStyledAttributes.getColor(R.styleable.ColorSwitch_barCheckedColor, 0);
        this.f6674h = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ColorSwitch_outerCircleWidth, 0);
        this.f6676j = obtainStyledAttributes.getColor(R.styleable.ColorSwitch_outerCircleColor, 0);
        this.f6677k = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSwitch_innerCircleWidth, 0);
        this.f6678l = obtainStyledAttributes.getColor(R.styleable.ColorSwitch_innerCircleColor, 0);
        this.f6685s = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSwitch_circlePadding, 0);
        this.f6650O = obtainStyledAttributes.getDrawable(R.styleable.ColorSwitch_loadingDrawable);
        this.f6679m = obtainStyledAttributes.getColor(R.styleable.ColorSwitch_barUncheckedDisabledColor, 0);
        this.f6680n = obtainStyledAttributes.getColor(R.styleable.ColorSwitch_barCheckedDisabledColor, 0);
        this.f6681o = obtainStyledAttributes.getColor(R.styleable.ColorSwitch_innerCircleUncheckedDisabledColor, 0);
        this.f6682p = obtainStyledAttributes.getColor(R.styleable.ColorSwitch_innerCircleCheckedDisabledColor, 0);
        this.f6683q = obtainStyledAttributes.getColor(R.styleable.ColorSwitch_outerCircleUncheckedDisabledColor, 0);
        this.f6684r = obtainStyledAttributes.getColor(R.styleable.ColorSwitch_outerCircleCheckedDisabledColor, 0);
        this.f6651P = obtainStyledAttributes.getDrawable(R.styleable.ColorSwitch_themedCheckedDrawable);
        this.f6652Q = obtainStyledAttributes.getDrawable(R.styleable.ColorSwitch_themedUncheckedDrawable);
        this.f6653R = obtainStyledAttributes.getDrawable(R.styleable.ColorSwitch_themedLoadingCheckedBackground);
        this.f6654S = obtainStyledAttributes.getDrawable(R.styleable.ColorSwitch_themedLoadingUncheckedBackground);
        this.f6655T = obtainStyledAttributes.getDrawable(R.styleable.ColorSwitch_themedLoadingDrawable);
        this.f6690x = (this.f6670d - (this.f6685s * 2)) - this.f6674h;
        obtainStyledAttributes.recycle();
        this.f6686t = getContext().getResources().getDimensionPixelSize(R.dimen.color_switch_padding);
        this.f6646K = getContext().getResources().getBoolean(R.bool.color_switch_theme_enable);
        this.f6647L = new Paint(1);
        this.f6648M = new Paint(1);
        this.f6649N = new Paint(1);
        Interpolator m1773a = C0517b.m1773a(0.3f, 0.0f, 0.1f, 1.0f);
        this.f6657V = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "circleScale", 1.0f, 0.0f);
        ofFloat.setInterpolator(m1773a);
        ofFloat.setDuration(433L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "loadingScale", 0.5f, 1.0f);
        ofFloat2.setInterpolator(m1773a);
        ofFloat2.setDuration(550L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "loadingAlpha", 0.0f, 1.0f);
        ofFloat3.setInterpolator(m1773a);
        ofFloat3.setDuration(550L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "loadingRotation", 0.0f, 360.0f);
        ofFloat4.setRepeatCount(-1);
        ofFloat4.setDuration(800L);
        ofFloat4.setInterpolator(new LinearInterpolator());
        this.f6657V.play(ofFloat).with(ofFloat3).with(ofFloat2).with(ofFloat4);
        Interpolator m1773a2 = C0517b.m1773a(0.3f, 0.0f, 0.1f, 1.0f);
        this.f6658W = new AnimatorSet();
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "loadingAlpha", 1.0f, 0.0f);
        ofFloat5.setInterpolator(m1773a2);
        ofFloat5.setDuration(100L);
        this.f6658W.play(ofFloat5);
        this.f6660aa = new AnimatorSet();
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "loadingRotation", 0.0f, 360.0f);
        ofFloat6.setRepeatCount(-1);
        ofFloat6.setDuration(800L);
        ofFloat6.setInterpolator(new LinearInterpolator());
        this.f6660aa.play(ofFloat6);
        this.f6661ab = C1345j.m4401a();
        this.f6662ac = this.f6661ab.m4402a(context, R.raw.color_switch_sound_on);
        this.f6663ad = this.f6661ab.m4402a(context, R.raw.color_switch_sound_off);
        this.f6659a = getResources().getString(R.string.switch_on);
        this.f6668b = getResources().getString(R.string.switch_off);
        this.f6669c = getResources().getString(R.string.switch_loading);
    }

    public void setOnLoadingStateChangedListener(InterfaceC1483eq interfaceC1483eq) {
        this.f6667ah = interfaceC1483eq;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public void setTactileFeedbackEnabled(boolean z) {
        this.f6645J = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    @Override // android.widget.CompoundButton, android.widget.Checkable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setChecked(boolean r11) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.ColorSwitch.setChecked(boolean):void");
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        if (this.f6646K) {
            canvas.save();
            Drawable m4768b = m4768b();
            m4768b.setAlpha((int) ((isEnabled() ? 1.0f : 0.5f) * 255.0f));
            m4768b.setBounds(this.f6686t, this.f6686t, this.f6670d + this.f6686t, this.f6671e + this.f6686t);
            m4768b().draw(canvas);
            canvas.restore();
            if (this.f6641F) {
                int width = (getWidth() - this.f6674h) / 2;
                int width2 = (getWidth() + this.f6674h) / 2;
                int height = (getHeight() - this.f6674h) / 2;
                int height2 = (getHeight() + this.f6674h) / 2;
                int width3 = getWidth() / 2;
                int height3 = getHeight() / 2;
                canvas.save();
                canvas.rotate(this.f6640E, width3, height3);
                this.f6655T.setBounds(width, height, width2, height2);
                this.f6655T.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        if (isChecked()) {
            if (!m4769c()) {
                f = ((this.f6670d - this.f6685s) - (this.f6690x - this.f6689w)) + this.f6686t;
                f2 = f - (this.f6674h * this.f6691y);
            }
            f2 = this.f6685s + this.f6689w + this.f6686t;
            f = (this.f6674h * this.f6691y) + f2;
        } else {
            if (m4769c()) {
                f = ((this.f6670d - this.f6685s) - (this.f6690x - this.f6689w)) + this.f6686t;
                f2 = (f - (this.f6674h * this.f6691y)) + this.f6686t;
            }
            f2 = this.f6685s + this.f6689w + this.f6686t;
            f = (this.f6674h * this.f6691y) + f2;
        }
        float f3 = ((this.f6671e - this.f6674h) / 2.0f) + this.f6686t;
        this.f6687u.set(f2, f3, f, this.f6674h + f3);
        this.f6688v.set(this.f6687u.left + this.f6675i, this.f6687u.top + this.f6675i, this.f6687u.right - this.f6675i, this.f6687u.bottom - this.f6675i);
        canvas.save();
        this.f6647L.setColor(this.f6637B);
        if (!isEnabled()) {
            this.f6647L.setColor(isChecked() ? this.f6680n : this.f6679m);
        }
        float f4 = this.f6671e / 2.0f;
        canvas.drawRoundRect(this.f6686t, this.f6686t, this.f6670d + this.f6686t, this.f6671e + this.f6686t, f4, f4, this.f6647L);
        canvas.restore();
        canvas.save();
        canvas.scale(this.f6638C, this.f6638C, this.f6687u.centerX(), this.f6687u.centerY());
        canvas.rotate(this.f6640E, this.f6687u.centerX(), this.f6687u.centerY());
        if (this.f6650O != null) {
            this.f6650O.setBounds((int) this.f6687u.left, (int) this.f6687u.top, (int) this.f6687u.right, (int) this.f6687u.bottom);
            this.f6650O.setAlpha((int) (this.f6639D * 255.0f));
            this.f6650O.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        canvas.scale(this.f6692z, this.f6692z, this.f6687u.centerX(), this.f6687u.centerY());
        this.f6648M.setColor(this.f6676j);
        if (!isEnabled()) {
            this.f6648M.setColor(isChecked() ? this.f6684r : this.f6683q);
        }
        float f5 = this.f6674h / 2.0f;
        canvas.drawRoundRect(this.f6687u, f5, f5, this.f6648M);
        canvas.restore();
        canvas.save();
        canvas.scale(this.f6692z, this.f6692z, this.f6687u.centerX(), this.f6687u.centerY());
        float f6 = this.f6677k / 2.0f;
        this.f6649N.setColor(this.f6678l);
        if (!isEnabled()) {
            this.f6649N.setColor(isChecked() ? this.f6682p : this.f6681o);
        }
        this.f6649N.setAlpha((int) (this.f6636A * 255.0f));
        canvas.drawRoundRect(this.f6688v, f6, f6, this.f6649N);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f6664ae = true;
            this.f6645J = true;
        }
        if (this.f6642G && motionEvent.getAction() == 1 && isEnabled()) {
            m4770a();
            return false;
        }
        if (this.f6641F) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void m4770a() {
        if (this.f6641F) {
            return;
        }
        if (this.f6666ag != null && this.f6666ag.isEnabled()) {
            announceForAccessibility(this.f6669c);
        }
        this.f6641F = true;
        if (this.f6646K) {
            this.f6660aa.start();
        } else {
            this.f6657V.start();
        }
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6644I = true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f6670d + (this.f6686t * 2), this.f6671e + (this.f6686t * 2));
        if (this.f6665af) {
            return;
        }
        this.f6665af = true;
        if (m4769c()) {
            this.f6689w = isChecked() ? 0 : this.f6690x;
        } else {
            this.f6689w = isChecked() ? this.f6690x : 0;
        }
        this.f6636A = isChecked() ? 0.0f : 1.0f;
        this.f6637B = isChecked() ? this.f6672f : this.f6673g;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f6643H = true;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6644I = false;
        this.f6643H = false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f6656U == null || !this.f6656U.isStarted()) {
            return;
        }
        this.f6656U.end();
    }

    public void setShouldPlaySound(boolean z) {
        this.f6664ae = z;
    }

    public void setLoadingStyle(boolean z) {
        this.f6642G = z;
    }

    public void setCircleTranslation(int i) {
        this.f6689w = i;
        invalidate();
    }

    public int getCircleTranslation() {
        return this.f6689w;
    }

    public void setCircleScaleX(float f) {
        this.f6691y = f;
        invalidate();
    }

    public float getCircleScaleX() {
        return this.f6691y;
    }

    public void setInnerCircleAlpha(float f) {
        this.f6636A = f;
        invalidate();
    }

    public float getInnerCircleAlpha() {
        return this.f6636A;
    }

    public void setBarColor(int i) {
        this.f6637B = i;
        invalidate();
    }

    public int getBarColor() {
        return this.f6637B;
    }

    public void setCircleScale(float f) {
        this.f6692z = f;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public float getCircleScale() {
        return this.f6692z;
    }

    public void setLoadingScale(float f) {
        this.f6638C = f;
        invalidate();
    }

    public float getLoadingScale() {
        return this.f6638C;
    }

    public void setLoadingAlpha(float f) {
        this.f6639D = f;
        invalidate();
    }

    public float getLoadingAlpha() {
        return this.f6639D;
    }

    public void setLoadingRotation(float f) {
        this.f6640E = f;
        invalidate();
    }

    public float getLoadingRotation() {
        return this.f6640E;
    }

    @Override // android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Switch.class.getName();
    }

    /* renamed from: c */
    private boolean m4769c() {
        return Build.VERSION.SDK_INT > 16 && getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f6642G) {
            accessibilityNodeInfo.setCheckable(false);
            accessibilityNodeInfo.setText(isChecked() ? this.f6659a : this.f6668b);
        } else {
            accessibilityNodeInfo.setText(isChecked() ? this.f6659a : this.f6668b);
        }
    }

    /* renamed from: b */
    private Drawable m4768b() {
        return this.f6641F ? isChecked() ? this.f6653R : this.f6654S : isChecked() ? this.f6651P : this.f6652Q;
    }
}
