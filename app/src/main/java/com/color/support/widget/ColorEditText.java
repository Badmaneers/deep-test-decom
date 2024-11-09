package com.color.support.widget;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.p024g.C0538w;
import com.color.support.util.C1337b;
import com.coloros.neton.BuildConfig;

/* loaded from: classes.dex */
public class ColorEditText extends AppCompatEditText {

    /* renamed from: A */
    private float f5983A;

    /* renamed from: B */
    private float f5984B;

    /* renamed from: C */
    private int f5985C;

    /* renamed from: D */
    private int f5986D;

    /* renamed from: E */
    private int f5987E;

    /* renamed from: F */
    private RectF f5988F;

    /* renamed from: G */
    private ColorStateList f5989G;

    /* renamed from: H */
    private ColorStateList f5990H;

    /* renamed from: I */
    private int f5991I;

    /* renamed from: J */
    private int f5992J;

    /* renamed from: K */
    private int f5993K;

    /* renamed from: L */
    private boolean f5994L;

    /* renamed from: M */
    private boolean f5995M;

    /* renamed from: N */
    private ValueAnimator f5996N;

    /* renamed from: O */
    private ValueAnimator f5997O;

    /* renamed from: P */
    private ValueAnimator f5998P;

    /* renamed from: Q */
    private boolean f5999Q;

    /* renamed from: R */
    private boolean f6000R;

    /* renamed from: S */
    private Paint f6001S;

    /* renamed from: T */
    private Paint f6002T;

    /* renamed from: U */
    private Paint f6003U;

    /* renamed from: V */
    private int f6004V;

    /* renamed from: W */
    private float f6005W;

    /* renamed from: a */
    private final C1563j f6006a;

    /* renamed from: aa */
    private int f6007aa;

    /* renamed from: ab */
    private int f6008ab;

    /* renamed from: ac */
    private int f6009ac;

    /* renamed from: ad */
    private int f6010ad;

    /* renamed from: ae */
    private C1490ex f6011ae;

    /* renamed from: b */
    private Interpolator f6012b;

    /* renamed from: c */
    private Interpolator f6013c;

    /* renamed from: d */
    private Drawable f6014d;

    /* renamed from: e */
    private Drawable f6015e;

    /* renamed from: f */
    private boolean f6016f;

    /* renamed from: g */
    private boolean f6017g;

    /* renamed from: h */
    private boolean f6018h;

    /* renamed from: i */
    private InterfaceC1632u f6019i;

    /* renamed from: j */
    private InterfaceC1631t f6020j;

    /* renamed from: k */
    private int f6021k;

    /* renamed from: l */
    private Context f6022l;

    /* renamed from: m */
    private int f6023m;

    /* renamed from: n */
    private boolean f6024n;

    /* renamed from: o */
    private ViewOnClickListenerC1592s f6025o;

    /* renamed from: p */
    private String f6026p;

    /* renamed from: q */
    private C1633v f6027q;

    /* renamed from: r */
    private CharSequence f6028r;

    /* renamed from: s */
    private boolean f6029s;

    /* renamed from: t */
    private CharSequence f6030t;

    /* renamed from: u */
    private boolean f6031u;

    /* renamed from: v */
    private GradientDrawable f6032v;

    /* renamed from: w */
    private int f6033w;

    /* renamed from: x */
    private int f6034x;

    /* renamed from: y */
    private float f6035y;

    /* renamed from: z */
    private float f6036z;

    public ColorEditText(Context context) {
        this(context, null);
    }

    public ColorEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @SuppressLint({"WrongConstant"})
    public ColorEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f6006a = new C1563j(this);
        this.f6016f = false;
        this.f6017g = false;
        this.f6018h = false;
        this.f6019i = null;
        this.f6020j = null;
        this.f6024n = false;
        this.f6026p = null;
        this.f6027q = null;
        this.f5985C = 3;
        this.f5988F = new RectF();
        this.f6022l = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, color.support.p043v7.appcompat.R.styleable.ColorEditText, 0, 0);
        boolean z = obtainStyledAttributes.getBoolean(color.support.p043v7.appcompat.R.styleable.ColorEditText_quickDelete, false);
        int color2 = obtainStyledAttributes.getColor(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorEditTextErrorColor, getResources().getColor(color.support.p043v7.appcompat.R.color.color_error_color_default));
        obtainStyledAttributes.recycle();
        setFastDeletable(z);
        this.f6014d = getResources().getDrawable(color.support.p043v7.appcompat.R.drawable.color_edit_text_delete_icon_normal);
        this.f6015e = getResources().getDrawable(color.support.p043v7.appcompat.R.drawable.color_edit_text_delete_icon_pressed);
        if (this.f6014d != null) {
            this.f6010ad = this.f6014d.getIntrinsicWidth();
            i2 = this.f6014d.getIntrinsicHeight();
            this.f6014d.setBounds(0, 0, this.f6010ad, i2);
        } else {
            i2 = 0;
        }
        if (this.f6015e != null) {
            this.f6015e.setBounds(0, 0, this.f6010ad, i2);
        }
        this.f6025o = new ViewOnClickListenerC1592s(this, this);
        C0538w.m1849a(this, this.f6025o);
        C0538w.m1840a((View) this, 1);
        this.f6026p = this.f6022l.getString(color.support.p043v7.appcompat.R.string.color_slide_delete);
        this.f6025o.m2071a();
        this.f6011ae = new C1490ex(this);
        this.f6006a.m5252a(new LinearInterpolator());
        this.f6006a.m5260b(new LinearInterpolator());
        this.f6006a.m5257b(8388659);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f6012b = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
            this.f6013c = new PathInterpolator(0.0f, 0.0f, 0.1f, 1.0f);
        } else {
            this.f6012b = new LinearInterpolator();
            this.f6013c = new LinearInterpolator();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, color.support.p043v7.appcompat.R.styleable.ColorEditText, i, color.support.p043v7.appcompat.R.style.Widget_ColorSupport_EditText_HintAnim_Line);
        this.f6029s = obtainStyledAttributes2.getBoolean(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorHintEnabled, false);
        if (Build.VERSION.SDK_INT < 23) {
            this.f6029s = false;
            setPadding(0, 0, 0, 0);
        } else {
            setTopHint(obtainStyledAttributes2.getText(color.support.p043v7.appcompat.R.styleable.ColorEditText_android_hint));
            if (this.f6029s) {
                this.f5995M = obtainStyledAttributes2.getBoolean(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorHintAnimationEnabled, true);
            }
            this.f6007aa = obtainStyledAttributes2.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.ColorEditText_rectModePaddingTop, 0);
            float dimension = obtainStyledAttributes2.getDimension(color.support.p043v7.appcompat.R.styleable.ColorEditText_cornerRadius, 0.0f);
            this.f6035y = dimension;
            this.f6036z = dimension;
            this.f5983A = dimension;
            this.f5984B = dimension;
            this.f5992J = obtainStyledAttributes2.getColor(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorStrokeColor, C1337b.m4374a(context, color.support.p043v7.appcompat.R.attr.colorPrimaryColor));
            this.f5985C = obtainStyledAttributes2.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorStrokeWidth, 0);
            this.f5986D = this.f5985C;
            if (this.f6029s) {
                this.f6033w = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_textinput_label_cutout_padding);
                this.f6008ab = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_textinput_line_padding_top);
                this.f6009ac = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_textinput_line_padding_middle);
            }
            int i3 = obtainStyledAttributes2.getInt(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorBackgroundMode, 0);
            setBoxBackgroundMode(i3);
            if (this.f6034x != 0) {
                setBackgroundDrawable(null);
            }
            if (obtainStyledAttributes2.hasValue(color.support.p043v7.appcompat.R.styleable.ColorEditText_android_textColorHint)) {
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(color.support.p043v7.appcompat.R.styleable.ColorEditText_android_textColorHint);
                this.f5990H = colorStateList;
                this.f5989G = colorStateList;
            }
            this.f5991I = obtainStyledAttributes2.getColor(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorDefaultStrokeColor, getResources().getColor(color.support.p043v7.appcompat.R.color.color_textinput_stroke_color_default));
            this.f5993K = obtainStyledAttributes2.getColor(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorDisabledStrokeColor, getResources().getColor(color.support.p043v7.appcompat.R.color.color_textinput_stroke_color_disabled));
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.ColorEditText_collapsedTextSize, 0);
            ColorStateList colorStateList2 = obtainStyledAttributes2.getColorStateList(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorStrokeColor);
            this.f6006a.m5248a(dimensionPixelSize, colorStateList2);
            this.f5990H = this.f6006a.m5272n();
            m4468a(false, false);
            this.f6011ae.m5033a(dimensionPixelSize, colorStateList2);
            if (i3 == 2) {
                Typeface.create("sans-serif-medium", 0);
                this.f6006a.m5265g();
            }
            obtainStyledAttributes2.recycle();
            this.f6002T = new Paint();
            this.f6002T.setColor(this.f5991I);
            this.f6002T.setStrokeWidth(this.f5985C);
            this.f6003U = new Paint();
            this.f6003U.setColor(this.f5993K);
            this.f6003U.setStrokeWidth(this.f5985C);
            this.f6001S = new Paint();
            this.f6001S.setColor(this.f5992J);
            this.f6001S.setStrokeWidth(this.f5985C);
            m4472c();
            this.f6006a.m5245a(getTextSize());
            int gravity = getGravity();
            this.f6006a.m5257b((gravity & (-113)) | 48);
            this.f6006a.m5246a(gravity);
            if (this.f5989G == null) {
                this.f5989G = getHintTextColors();
            }
            setHint((CharSequence) null);
            if (TextUtils.isEmpty(this.f6030t)) {
                this.f6028r = getHint();
                setTopHint(this.f6028r);
                setHint((CharSequence) null);
            }
            this.f6031u = true;
            m4468a(false, true);
            if (this.f6029s) {
                m4475d();
            }
        }
        this.f6011ae.m5032a(color2, this.f5985C, this.f6034x, getCornerRadiiAsArray(), this.f6006a);
    }

    public void setFastDeletable(boolean z) {
        if (this.f6017g != z) {
            this.f6017g = z;
            if (this.f6017g) {
                if (this.f6027q == null) {
                    this.f6027q = new C1633v(this, (byte) 0);
                    addTextChangedListener(this.f6027q);
                }
                this.f6023m = this.f6022l.getResources().getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.oppo_edit_text_drawable_padding);
                setCompoundDrawablePadding(this.f6023m);
            }
        }
    }

    /* renamed from: a */
    public void m4467a(boolean z) {
        if (TextUtils.isEmpty(getText().toString())) {
            if (m4485n()) {
                setPaddingRelative(0, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
            }
            setCompoundDrawables(null, null, null, null);
            this.f6018h = false;
            return;
        }
        if (z) {
            if (this.f6014d == null || this.f6018h) {
                return;
            }
            if (m4485n()) {
                setPaddingRelative(this.f6010ad + this.f6023m, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
            }
            setCompoundDrawables(null, null, this.f6014d, null);
            this.f6018h = true;
            return;
        }
        if (this.f6018h) {
            if (m4485n()) {
                setPaddingRelative(0, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
            }
            setCompoundDrawables(null, null, null, null);
            this.f6018h = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f6017g) {
            m4467a(z);
        }
    }

    public void setOnTextDeletedListener(InterfaceC1632u interfaceC1632u) {
        this.f6019i = interfaceC1632u;
    }

    public void setTextDeletedListener(InterfaceC1631t interfaceC1631t) {
        this.f6020j = interfaceC1631t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:            if (r1 < r0) goto L78;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006d, code lost:            r0 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006f, code lost:            if (r1 > r0) goto L78;     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.f6017g
            if (r0 == 0) goto Ld9
            android.text.Editable r0 = r6.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Ld9
            boolean r0 = r6.hasFocus()
            if (r0 == 0) goto Ld9
            int r0 = r6.getRight()
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            int r1 = r6.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r6.f6021k
            int r0 = r0 - r1
            int r1 = r6.getWidth()
            int r2 = r6.f6021k
            int r3 = r6.getPaddingRight()
            int r2 = r2 + r3
            int r3 = r6.getPaddingLeft()
            int r2 = r2 + r3
            r3 = 0
            if (r1 >= r2) goto L39
            return r3
        L39:
            float r1 = r7.getX()
            int r1 = (int) r1
            float r2 = r7.getY()
            int r2 = (int) r2
            boolean r4 = r6.m4484m()
            r5 = 1
            if (r4 == 0) goto L6f
            boolean r0 = r6.m4485n()
            if (r0 == 0) goto L60
            int r0 = r6.getCompoundPaddingLeft()
            int r4 = r6.getPaddingRight()
            int r0 = r0 - r4
            int r4 = r6.f6010ad
            int r0 = r0 + r4
            int r4 = r6.f6023m
            int r0 = r0 + r4
            goto L69
        L60:
            int r0 = r6.getCompoundPaddingLeft()
            int r4 = r6.getPaddingRight()
            int r0 = r0 - r4
        L69:
            if (r1 >= r0) goto L6d
        L6b:
            r0 = r5
            goto L72
        L6d:
            r0 = r3
            goto L72
        L6f:
            if (r1 <= r0) goto L6d
            goto L6b
        L72:
            int r1 = r7.getAction()
            r4 = 0
            switch(r1) {
                case 0: goto Lc7;
                case 1: goto La2;
                case 2: goto L85;
                case 3: goto L7b;
                case 4: goto L7b;
                default: goto L7a;
            }
        L7a:
            goto Ld9
        L7b:
            android.graphics.drawable.Drawable r0 = r6.f6014d
            if (r0 == 0) goto Ld9
            android.graphics.drawable.Drawable r0 = r6.f6014d
            r6.setCompoundDrawables(r4, r4, r0, r4)
            goto Ld9
        L85:
            if (r0 == 0) goto L8f
            if (r2 < 0) goto L8f
            int r0 = r6.getHeight()
            if (r2 <= r0) goto Ld9
        L8f:
            android.graphics.drawable.Drawable r0 = r6.f6014d
            if (r0 == 0) goto Ld9
            android.graphics.drawable.Drawable[] r0 = r6.getCompoundDrawablesRelative()
            r1 = 2
            r0 = r0[r1]
            if (r0 != 0) goto Ld9
            android.graphics.drawable.Drawable r0 = r6.f6014d
            r6.setCompoundDrawables(r4, r4, r0, r4)
            goto Ld9
        La2:
            if (r0 == 0) goto Ld9
            boolean r0 = r6.f6018h
            if (r0 == 0) goto Ld9
            boolean r0 = r6.f6016f
            if (r0 == 0) goto Ld9
            android.graphics.drawable.Drawable r0 = r6.f6014d
            if (r0 == 0) goto Lb5
            android.graphics.drawable.Drawable r0 = r6.f6014d
            r6.setCompoundDrawables(r4, r4, r0, r4)
        Lb5:
            com.color.support.widget.u r0 = r6.f6019i
            if (r0 == 0) goto Lc1
            com.color.support.widget.u r0 = r6.f6019i
            boolean r0 = r0.m5443a()
            if (r0 != 0) goto Ld9
        Lc1:
            r6.m4470b()
            r6.f6016f = r3
            return r5
        Lc7:
            if (r0 == 0) goto Ld9
            boolean r0 = r6.f6018h
            if (r0 == 0) goto Ld9
            r6.f6016f = r5
            android.graphics.drawable.Drawable r7 = r6.f6015e
            if (r7 == 0) goto Ld8
            android.graphics.drawable.Drawable r7 = r6.f6015e
            r6.setCompoundDrawables(r4, r4, r7, r4)
        Ld8:
            return r5
        Ld9:
            boolean r6 = super.onTouchEvent(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.ColorEditText.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public void m4470b() {
        Editable text = getText();
        text.delete(0, text.length());
        setText(BuildConfig.FLAVOR);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        if (drawable3 != null) {
            this.f6021k = drawable3.getBounds().width();
        } else {
            this.f6021k = 0;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f6017g && i == 67) {
            super.onKeyDown(i, keyEvent);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        Selection.setSelection(getText(), length());
    }

    @Override // android.view.View
    public void dispatchStartTemporaryDetach() {
        super.dispatchStartTemporaryDetach();
        if (this.f6024n) {
            onStartTemporaryDetach();
        }
    }

    /* renamed from: a */
    public final boolean m4486a() {
        if (this.f6017g) {
            String obj = getText().toString();
            if (!(obj == null ? false : TextUtils.isEmpty(obj)) && hasFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (m4486a() && this.f6025o != null && this.f6025o.m2082a(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public int getDeleteButtonLeft() {
        return ((getRight() - getLeft()) - getPaddingRight()) - (this.f6014d != null ? this.f6014d.getIntrinsicWidth() : 0);
    }

    private Drawable getBoxBackground() {
        if (this.f6034x == 1 || this.f6034x == 2) {
            return this.f6032v;
        }
        return null;
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f6034x) {
            return;
        }
        this.f6034x = i;
        m4472c();
    }

    /* renamed from: c */
    private void m4472c() {
        m4476e();
        m4477f();
    }

    /* renamed from: d */
    private void m4475d() {
        C0538w.m1863b(this, m4484m() ? getPaddingRight() : getPaddingLeft(), getModePaddingTop(), m4484m() ? getPaddingLeft() : getPaddingRight(), getPaddingBottom());
    }

    private int getModePaddingTop() {
        switch (this.f6034x) {
            case 1:
                return this.f6008ab + ((int) this.f6006a.m5262d()) + this.f6009ac;
            case 2:
                return this.f6007aa + ((int) (this.f6006a.m5261c() / 2.0f));
            default:
                return 0;
        }
    }

    /* renamed from: e */
    private void m4476e() {
        if (this.f6034x == 0) {
            this.f6032v = null;
            return;
        }
        if (this.f6034x == 2 && this.f6029s && !(this.f6032v instanceof C1562i)) {
            this.f6032v = new C1562i();
        } else if (this.f6032v == null) {
            this.f6032v = new GradientDrawable();
        }
    }

    public int getBoxStrokeColor() {
        return this.f5992J;
    }

    public void setBoxStrokeColor(int i) {
        if (this.f5992J != i) {
            this.f5992J = i;
            m4483l();
        }
    }

    private float[] getCornerRadiiAsArray() {
        return new float[]{this.f6036z, this.f6036z, this.f6035y, this.f6035y, this.f5984B, this.f5984B, this.f5983A, this.f5983A};
    }

    /* renamed from: a */
    private void m4468a(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        boolean z3 = !TextUtils.isEmpty(getText());
        if (this.f5989G != null) {
            this.f5989G = getHintTextColors();
            this.f6006a.m5249a(this.f5989G);
            this.f6006a.m5259b(this.f5989G);
        }
        if (!isEnabled) {
            this.f6006a.m5249a(ColorStateList.valueOf(this.f5993K));
            this.f6006a.m5259b(ColorStateList.valueOf(this.f5993K));
        } else if (hasFocus() && this.f5990H != null) {
            this.f6006a.m5249a(this.f5990H);
        }
        if (z3 || (isEnabled() && hasFocus())) {
            if (z2 || this.f5994L) {
                m4471b(z);
            }
        } else if ((z2 || !this.f5994L) && this.f6029s) {
            m4474c(z);
        }
        if (this.f6011ae != null) {
            this.f6011ae.m5038a(this.f6006a);
        }
    }

    public void setTopHint(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            setHintInternal(charSequence);
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f6030t)) {
            return;
        }
        this.f6030t = charSequence;
        this.f6006a.m5253a(charSequence);
        if (!this.f5994L) {
            m4481j();
        }
        if (this.f6011ae != null) {
            this.f6011ae.m5042b(this.f6006a);
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        if (this.f6029s) {
            return this.f6030t;
        }
        return null;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f6029s) {
            this.f6029s = z;
            if (!this.f6029s) {
                this.f6031u = false;
                if (!TextUtils.isEmpty(this.f6030t) && TextUtils.isEmpty(getHint())) {
                    setHint(this.f6030t);
                }
                setHintInternal(null);
                return;
            }
            CharSequence hint = getHint();
            if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.f6030t)) {
                    setTopHint(hint);
                }
                setHint((CharSequence) null);
            }
            this.f6031u = true;
        }
    }

    /* renamed from: f */
    private void m4477f() {
        if (this.f6034x == 0 || this.f6032v == null || getRight() == 0) {
            return;
        }
        this.f6032v.setBounds(0, getBoundsTop(), getWidth(), getHeight());
        m4479h();
    }

    private int getBoundsTop() {
        switch (this.f6034x) {
            case 1:
                return this.f6008ab;
            case 2:
                return (int) (this.f6006a.m5261c() / 2.0f);
            default:
                return 0;
        }
    }

    public int getLabelMarginTop() {
        if (this.f6029s) {
            return (int) (this.f6006a.m5261c() / 2.0f);
        }
        return 0;
    }

    public Rect getBackgroundRect() {
        switch (this.f6034x) {
            case 1:
            case 2:
                return getBoxBackground().getBounds();
            default:
                return null;
        }
    }

    /* renamed from: g */
    private void m4478g() {
        switch (this.f6034x) {
            case 1:
                this.f5985C = 0;
                return;
            case 2:
                if (this.f5992J == 0) {
                    this.f5992J = this.f5990H.getColorForState(getDrawableState(), this.f5990H.getDefaultColor());
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: h */
    private void m4479h() {
        if (this.f6032v == null) {
            return;
        }
        m4478g();
        if (this.f5985C >= 0 && this.f5987E != 0) {
            this.f6032v.setStroke(this.f5985C, this.f5987E);
        }
        this.f6032v.setCornerRadii(getCornerRadiiAsArray());
        invalidate();
    }

    public void setmHintAnimationEnabled(boolean z) {
        this.f5995M = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (getHintTextColors() != this.f5989G) {
            m4468a(false, false);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.f6029s || getText().length() == 0) {
                if (!this.f6011ae.m5041a()) {
                    this.f6006a.m5250a(canvas);
                } else {
                    this.f6011ae.m5037a(canvas, this.f6006a);
                }
            } else {
                canvas.drawText(" ", 0.0f, 0.0f, new Paint());
            }
            if (this.f6032v != null && this.f6034x == 2) {
                if (getScrollX() != 0) {
                    m4477f();
                }
                if (!this.f6011ae.m5041a()) {
                    this.f6032v.draw(canvas);
                } else {
                    this.f6011ae.m5036a(canvas, this.f6032v, this.f5987E);
                }
            }
            if (this.f6034x == 1) {
                int height = getHeight() - ((int) ((this.f5986D / 2.0d) + 0.5d));
                this.f6001S.setAlpha(this.f6004V);
                if (!isEnabled()) {
                    float f = height;
                    canvas.drawLine(0.0f, f, getWidth(), f, this.f6003U);
                } else if (!this.f6011ae.m5041a()) {
                    float f2 = height;
                    canvas.drawLine(0.0f, f2, getWidth(), f2, this.f6002T);
                    canvas.drawLine(0.0f, f2, this.f6005W * getWidth(), f2, this.f6001S);
                } else {
                    this.f6011ae.m5035a(canvas, height, getWidth(), (int) (this.f6005W * getWidth()), this.f6002T, this.f6001S);
                }
            }
            canvas.restoreToCount(save);
        }
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6011ae.m5034a(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f6032v != null) {
                m4477f();
            }
            if (this.f6029s) {
                m4475d();
            }
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int width = getWidth() - getCompoundPaddingRight();
            switch (this.f6034x) {
                case 1:
                    i5 = getBoxBackground().getBounds().top;
                    break;
                case 2:
                    i5 = getBoxBackground().getBounds().top - getLabelMarginTop();
                    break;
                default:
                    i5 = getPaddingTop();
                    break;
            }
            this.f6006a.m5247a(compoundPaddingLeft, getCompoundPaddingTop(), width, getHeight() - getCompoundPaddingBottom());
            this.f6006a.m5258b(compoundPaddingLeft, i5, width, getHeight() - getCompoundPaddingBottom());
            this.f6006a.m5269k();
            if (m4480i() && !this.f5994L) {
                m4481j();
            }
            this.f6011ae.m5043c(this.f6006a);
        }
    }

    /* renamed from: b */
    private void m4471b(boolean z) {
        if (this.f5996N != null && this.f5996N.isRunning()) {
            this.f5996N.cancel();
        }
        if (z && this.f5995M) {
            m4464a(1.0f);
        } else {
            this.f6006a.m5256b(1.0f);
        }
        this.f5994L = false;
        if (m4480i()) {
            m4481j();
        }
    }

    /* renamed from: i */
    private boolean m4480i() {
        return Build.VERSION.SDK_INT >= 23 && this.f6029s && !TextUtils.isEmpty(this.f6030t) && (this.f6032v instanceof C1562i);
    }

    /* renamed from: j */
    private void m4481j() {
        if (m4480i()) {
            RectF rectF = this.f5988F;
            this.f6006a.m5251a(rectF);
            m4465a(rectF);
            ((C1562i) this.f6032v).m5222a(rectF);
        }
    }

    /* renamed from: k */
    private void m4482k() {
        if (m4480i()) {
            ((C1562i) this.f6032v).m5225c();
        }
    }

    /* renamed from: a */
    private void m4465a(RectF rectF) {
        rectF.left -= this.f6033w;
        rectF.top -= this.f6033w;
        rectF.right += this.f6033w;
        rectF.bottom += this.f6033w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void drawableStateChanged() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.ColorEditText.drawableStateChanged():void");
    }

    /* renamed from: l */
    private void m4483l() {
        if (this.f6032v == null || this.f6034x == 0 || this.f6034x != 2) {
            return;
        }
        if (!isEnabled()) {
            this.f5987E = this.f5993K;
        } else if (hasFocus()) {
            this.f5987E = this.f5992J;
        } else {
            this.f5987E = this.f5991I;
        }
        m4479h();
    }

    /* renamed from: c */
    private void m4474c(boolean z) {
        if (this.f6032v != null) {
            Log.d("ColorEditText", "mBoxBackground: " + this.f6032v.getBounds());
        }
        if (this.f5996N != null && this.f5996N.isRunning()) {
            this.f5996N.cancel();
        }
        if (z && this.f5995M) {
            m4464a(0.0f);
        } else {
            this.f6006a.m5256b(0.0f);
        }
        if (m4480i() && ((C1562i) this.f6032v).m5223a()) {
            m4482k();
        }
        this.f5994L = true;
    }

    /* renamed from: a */
    private void m4464a(float f) {
        if (this.f6006a.m5267i() == f) {
            return;
        }
        if (this.f5996N == null) {
            this.f5996N = new ValueAnimator();
            this.f5996N.setInterpolator(this.f6012b);
            this.f5996N.setDuration(200L);
            this.f5996N.addUpdateListener(new C1591r(this));
        }
        this.f5996N.setFloatValues(this.f6006a.m5267i(), f);
        this.f5996N.start();
    }

    /* renamed from: m */
    private boolean m4484m() {
        return getLayoutDirection() == 1;
    }

    public void setErrorState(boolean z) {
        this.f6011ae.m5039a(z);
    }

    /* renamed from: n */
    private boolean m4485n() {
        return (getGravity() & 7) == 1;
    }
}
