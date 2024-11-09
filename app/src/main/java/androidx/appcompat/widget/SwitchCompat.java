package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.p010c.C0126a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0538w;
import androidx.core.widget.C0577o;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: A */
    private int f997A;

    /* renamed from: B */
    private int f998B;

    /* renamed from: C */
    private int f999C;

    /* renamed from: D */
    private int f1000D;

    /* renamed from: E */
    private int f1001E;

    /* renamed from: F */
    private int f1002F;

    /* renamed from: G */
    private int f1003G;

    /* renamed from: H */
    private final TextPaint f1004H;

    /* renamed from: I */
    private ColorStateList f1005I;

    /* renamed from: J */
    private Layout f1006J;

    /* renamed from: K */
    private Layout f1007K;

    /* renamed from: L */
    private TransformationMethod f1008L;

    /* renamed from: M */
    private final C0211bc f1009M;

    /* renamed from: N */
    private final Rect f1010N;

    /* renamed from: a */
    float f1011a;

    /* renamed from: b */
    ObjectAnimator f1012b;

    /* renamed from: d */
    private Drawable f1013d;

    /* renamed from: e */
    private ColorStateList f1014e;

    /* renamed from: f */
    private PorterDuff.Mode f1015f;

    /* renamed from: g */
    private boolean f1016g;

    /* renamed from: h */
    private boolean f1017h;

    /* renamed from: i */
    private Drawable f1018i;

    /* renamed from: j */
    private ColorStateList f1019j;

    /* renamed from: k */
    private PorterDuff.Mode f1020k;

    /* renamed from: l */
    private boolean f1021l;

    /* renamed from: m */
    private boolean f1022m;

    /* renamed from: n */
    private int f1023n;

    /* renamed from: o */
    private int f1024o;

    /* renamed from: p */
    private int f1025p;

    /* renamed from: q */
    private boolean f1026q;

    /* renamed from: r */
    private CharSequence f1027r;

    /* renamed from: s */
    private CharSequence f1028s;

    /* renamed from: t */
    private boolean f1029t;

    /* renamed from: u */
    private int f1030u;

    /* renamed from: v */
    private int f1031v;

    /* renamed from: w */
    private float f1032w;

    /* renamed from: x */
    private float f1033x;

    /* renamed from: y */
    private VelocityTracker f1034y;

    /* renamed from: z */
    private int f1035z;

    /* renamed from: c */
    private static final Property<SwitchCompat, Float> f996c = new C0271di(Float.class, "thumbPos");

    /* renamed from: O */
    private static final int[] f995O = {R.attr.state_checked};

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        Typeface create;
        this.f1014e = null;
        this.f1015f = null;
        this.f1016g = false;
        this.f1017h = false;
        this.f1019j = null;
        this.f1020k = null;
        this.f1021l = false;
        this.f1022m = false;
        this.f1034y = VelocityTracker.obtain();
        this.f1010N = new Rect();
        this.f1004H = new TextPaint(1);
        this.f1004H.density = getResources().getDisplayMetrics().density;
        C0276dn m944a = C0276dn.m944a(context, attributeSet, androidx.appcompat.R.styleable.SwitchCompat, i, 0);
        this.f1013d = m944a.m948a(androidx.appcompat.R.styleable.SwitchCompat_android_thumb);
        if (this.f1013d != null) {
            this.f1013d.setCallback(this);
        }
        this.f1018i = m944a.m948a(androidx.appcompat.R.styleable.SwitchCompat_track);
        if (this.f1018i != null) {
            this.f1018i.setCallback(this);
        }
        this.f1027r = m944a.m954c(androidx.appcompat.R.styleable.SwitchCompat_android_textOn);
        this.f1028s = m944a.m954c(androidx.appcompat.R.styleable.SwitchCompat_android_textOff);
        this.f1029t = m944a.m949a(androidx.appcompat.R.styleable.SwitchCompat_showText, true);
        this.f1023n = m944a.m958e(androidx.appcompat.R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.f1024o = m944a.m958e(androidx.appcompat.R.styleable.SwitchCompat_switchMinWidth, 0);
        this.f1025p = m944a.m958e(androidx.appcompat.R.styleable.SwitchCompat_switchPadding, 0);
        this.f1026q = m944a.m949a(androidx.appcompat.R.styleable.SwitchCompat_splitTrack, false);
        ColorStateList m960f = m944a.m960f(androidx.appcompat.R.styleable.SwitchCompat_thumbTint);
        if (m960f != null) {
            this.f1014e = m960f;
            this.f1016g = true;
        }
        PorterDuff.Mode m846a = C0218bj.m846a(m944a.m946a(androidx.appcompat.R.styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.f1015f != m846a) {
            this.f1015f = m846a;
            this.f1017h = true;
        }
        if (this.f1016g || this.f1017h) {
            m631b();
        }
        ColorStateList m960f2 = m944a.m960f(androidx.appcompat.R.styleable.SwitchCompat_trackTint);
        if (m960f2 != null) {
            this.f1019j = m960f2;
            this.f1021l = true;
        }
        PorterDuff.Mode m846a2 = C0218bj.m846a(m944a.m946a(androidx.appcompat.R.styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.f1020k != m846a2) {
            this.f1020k = m846a2;
            this.f1022m = true;
        }
        if (this.f1021l || this.f1022m) {
            m630a();
        }
        int m962g = m944a.m962g(androidx.appcompat.R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (m962g != 0) {
            C0276dn m942a = C0276dn.m942a(context, m962g, androidx.appcompat.R.styleable.TextAppearance);
            ColorStateList m960f3 = m942a.m960f(androidx.appcompat.R.styleable.TextAppearance_android_textColor);
            if (m960f3 != null) {
                this.f1005I = m960f3;
            } else {
                this.f1005I = getTextColors();
            }
            int m958e = m942a.m958e(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
            if (m958e != 0) {
                float f = m958e;
                if (f != this.f1004H.getTextSize()) {
                    this.f1004H.setTextSize(f);
                    requestLayout();
                }
            }
            int m946a = m942a.m946a(androidx.appcompat.R.styleable.TextAppearance_android_typeface, -1);
            int m946a2 = m942a.m946a(androidx.appcompat.R.styleable.TextAppearance_android_textStyle, -1);
            switch (m946a) {
                case 1:
                    typeface = Typeface.SANS_SERIF;
                    break;
                case 2:
                    typeface = Typeface.SERIF;
                    break;
                case 3:
                    typeface = Typeface.MONOSPACE;
                    break;
                default:
                    typeface = null;
                    break;
            }
            if (m946a2 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(m946a2);
                } else {
                    create = Typeface.create(typeface, m946a2);
                }
                setSwitchTypeface(create);
                int i2 = m946a2 & (~(create != null ? create.getStyle() : 0));
                this.f1004H.setFakeBoldText((i2 & 1) != 0);
                this.f1004H.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                this.f1004H.setFakeBoldText(false);
                this.f1004H.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (m942a.m949a(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false)) {
                this.f1008L = new C0126a(getContext());
            } else {
                this.f1008L = null;
            }
            m942a.m952b();
        }
        this.f1009M = new C0211bc(this);
        this.f1009M.m773a(attributeSet, i);
        m944a.m952b();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1031v = viewConfiguration.getScaledTouchSlop();
        this.f1035z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1004H.getTypeface() == null || this.f1004H.getTypeface().equals(typeface)) && (this.f1004H.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f1004H.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setSwitchPadding(int i) {
        this.f1025p = i;
        requestLayout();
    }

    public int getSwitchPadding() {
        return this.f1025p;
    }

    public void setSwitchMinWidth(int i) {
        this.f1024o = i;
        requestLayout();
    }

    public int getSwitchMinWidth() {
        return this.f1024o;
    }

    public void setThumbTextPadding(int i) {
        this.f1023n = i;
        requestLayout();
    }

    public int getThumbTextPadding() {
        return this.f1023n;
    }

    public void setTrackDrawable(Drawable drawable) {
        if (this.f1018i != null) {
            this.f1018i.setCallback(null);
        }
        this.f1018i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0057a.m46b(getContext(), i));
    }

    public Drawable getTrackDrawable() {
        return this.f1018i;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1019j = colorStateList;
        this.f1021l = true;
        m630a();
    }

    public ColorStateList getTrackTintList() {
        return this.f1019j;
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1020k = mode;
        this.f1022m = true;
        m630a();
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1020k;
    }

    /* renamed from: a */
    private void m630a() {
        if (this.f1018i != null) {
            if (this.f1021l || this.f1022m) {
                this.f1018i = C0546a.m1933f(this.f1018i).mutate();
                if (this.f1021l) {
                    C0546a.m1922a(this.f1018i, this.f1019j);
                }
                if (this.f1022m) {
                    C0546a.m1925a(this.f1018i, this.f1020k);
                }
                if (this.f1018i.isStateful()) {
                    this.f1018i.setState(getDrawableState());
                }
            }
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        if (this.f1013d != null) {
            this.f1013d.setCallback(null);
        }
        this.f1013d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0057a.m46b(getContext(), i));
    }

    public Drawable getThumbDrawable() {
        return this.f1013d;
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1014e = colorStateList;
        this.f1016g = true;
        m631b();
    }

    public ColorStateList getThumbTintList() {
        return this.f1014e;
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1015f = mode;
        this.f1017h = true;
        m631b();
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1015f;
    }

    /* renamed from: b */
    private void m631b() {
        if (this.f1013d != null) {
            if (this.f1016g || this.f1017h) {
                this.f1013d = C0546a.m1933f(this.f1013d).mutate();
                if (this.f1016g) {
                    C0546a.m1922a(this.f1013d, this.f1014e);
                }
                if (this.f1017h) {
                    C0546a.m1925a(this.f1013d, this.f1015f);
                }
                if (this.f1013d.isStateful()) {
                    this.f1013d.setState(getDrawableState());
                }
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1026q = z;
        invalidate();
    }

    public boolean getSplitTrack() {
        return this.f1026q;
    }

    public CharSequence getTextOn() {
        return this.f1027r;
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1027r = charSequence;
        requestLayout();
    }

    public CharSequence getTextOff() {
        return this.f1028s;
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1028s = charSequence;
        requestLayout();
    }

    public void setShowText(boolean z) {
        if (this.f1029t != z) {
            this.f1029t = z;
            requestLayout();
        }
    }

    public boolean getShowText() {
        return this.f1029t;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1029t) {
            if (this.f1006J == null) {
                this.f1006J = m629a(this.f1027r);
            }
            if (this.f1007K == null) {
                this.f1007K = m629a(this.f1028s);
            }
        }
        Rect rect = this.f1010N;
        int i5 = 0;
        if (this.f1013d != null) {
            this.f1013d.getPadding(rect);
            i3 = (this.f1013d.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f1013d.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f999C = Math.max(this.f1029t ? Math.max(this.f1006J.getWidth(), this.f1007K.getWidth()) + (this.f1023n * 2) : 0, i3);
        if (this.f1018i != null) {
            this.f1018i.getPadding(rect);
            i5 = this.f1018i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        if (this.f1013d != null) {
            Rect m847a = C0218bj.m847a(this.f1013d);
            i6 = Math.max(i6, m847a.left);
            i7 = Math.max(i7, m847a.right);
        }
        int max = Math.max(this.f1024o, (this.f999C * 2) + i6 + i7);
        int max2 = Math.max(i5, i4);
        this.f997A = max;
        this.f998B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1027r : this.f1028s;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* renamed from: a */
    private Layout m629a(CharSequence charSequence) {
        if (this.f1008L != null) {
            charSequence = this.f1008L.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f1004H, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, this.f1004H)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.f1034y.addMovement(motionEvent);
        boolean z2 = false;
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled()) {
                    if (this.f1013d != null) {
                        int thumbOffset = getThumbOffset();
                        this.f1013d.getPadding(this.f1010N);
                        int i = this.f1001E - this.f1031v;
                        int i2 = (this.f1000D + thumbOffset) - this.f1031v;
                        int i3 = this.f999C + i2 + this.f1010N.left + this.f1010N.right + this.f1031v;
                        int i4 = this.f1003G + this.f1031v;
                        if (x > i2 && x < i3 && y > i && y < i4) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        this.f1030u = 1;
                        this.f1032w = x;
                        this.f1033x = y;
                        break;
                    }
                }
                break;
            case 1:
            case 3:
                if (this.f1030u != 2) {
                    this.f1030u = 0;
                    this.f1034y.clear();
                    break;
                } else {
                    this.f1030u = 0;
                    boolean z3 = motionEvent.getAction() == 1 && isEnabled();
                    boolean isChecked = isChecked();
                    if (z3) {
                        this.f1034y.computeCurrentVelocity(1000);
                        float xVelocity = this.f1034y.getXVelocity();
                        if (Math.abs(xVelocity) > this.f1035z) {
                            z = !C0295ef.m987a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f;
                        } else {
                            z = getTargetCheckedState();
                        }
                    } else {
                        z = isChecked;
                    }
                    if (z != isChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(z);
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.onTouchEvent(obtain);
                    obtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                break;
            case 2:
                switch (this.f1030u) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.f1032w) > this.f1031v || Math.abs(y2 - this.f1033x) > this.f1031v) {
                            this.f1030u = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f1032w = x2;
                            this.f1033x = y2;
                            return true;
                        }
                        break;
                    case 2:
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f = x3 - this.f1032w;
                        float f2 = thumbScrollRange != 0 ? f / thumbScrollRange : f > 0.0f ? 1.0f : -1.0f;
                        if (C0295ef.m987a(this)) {
                            f2 = -f2;
                        }
                        float f3 = f2 + this.f1011a;
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        } else if (f3 > 1.0f) {
                            f3 = 1.0f;
                        }
                        if (f3 != this.f1011a) {
                            this.f1032w = x3;
                            setThumbPosition(f3);
                        }
                        return true;
                }
        }
        return super.onTouchEvent(motionEvent);
    }

    private boolean getTargetCheckedState() {
        return this.f1011a > 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f1011a = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() != null && C0538w.m1819C(this)) {
            this.f1012b = ObjectAnimator.ofFloat(this, f996c, isChecked ? 1.0f : 0.0f);
            this.f1012b.setDuration(250L);
            if (Build.VERSION.SDK_INT >= 18) {
                this.f1012b.setAutoCancel(true);
            }
            this.f1012b.start();
            return;
        }
        if (this.f1012b != null) {
            this.f1012b.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int paddingTop;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        int i8 = 0;
        if (this.f1013d != null) {
            Rect rect = this.f1010N;
            if (this.f1018i != null) {
                this.f1018i.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m847a = C0218bj.m847a(this.f1013d);
            int max = Math.max(0, m847a.left - rect.left);
            i5 = Math.max(0, m847a.right - rect.right);
            i8 = max;
        } else {
            i5 = 0;
        }
        if (C0295ef.m987a(this)) {
            i6 = getPaddingLeft() + i8;
            width = ((this.f997A + i6) - i8) - i5;
        } else {
            width = (getWidth() - getPaddingRight()) - i5;
            i6 = (width - this.f997A) + i8 + i5;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.f998B / 2);
            i7 = this.f998B + paddingTop;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i7 = this.f998B + paddingTop;
        } else {
            i7 = getHeight() - getPaddingBottom();
            paddingTop = i7 - this.f998B;
        }
        this.f1000D = i6;
        this.f1001E = paddingTop;
        this.f1003G = i7;
        this.f1002F = width;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1010N;
        int i3 = this.f1000D;
        int i4 = this.f1001E;
        int i5 = this.f1002F;
        int i6 = this.f1003G;
        int thumbOffset = getThumbOffset() + i3;
        if (this.f1013d != null) {
            rect = C0218bj.m847a(this.f1013d);
        } else {
            rect = C0218bj.f1197a;
        }
        if (this.f1018i != null) {
            this.f1018i.getPadding(rect2);
            thumbOffset += rect2.left;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i3 += rect.left - rect2.left;
                }
                i = rect.top > rect2.top ? (rect.top - rect2.top) + i4 : i4;
                if (rect.right > rect2.right) {
                    i5 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i2 = i6 - (rect.bottom - rect2.bottom);
                    this.f1018i.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1018i.setBounds(i3, i, i5, i2);
        }
        if (this.f1013d != null) {
            this.f1013d.getPadding(rect2);
            int i7 = thumbOffset - rect2.left;
            int i8 = thumbOffset + this.f999C + rect2.right;
            this.f1013d.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0546a.m1921a(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1010N;
        Drawable drawable = this.f1018i;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f1001E;
        int i2 = this.f1003G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f1013d;
        if (drawable != null) {
            if (this.f1026q && drawable2 != null) {
                Rect m847a = C0218bj.m847a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m847a.left;
                rect.right -= m847a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1006J : this.f1007K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            if (this.f1005I != null) {
                this.f1004H.setColor(this.f1005I.getColorForState(drawableState, 0));
            }
            this.f1004H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C0295ef.m987a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f997A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1025p : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C0295ef.m987a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f997A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1025p : compoundPaddingRight;
    }

    private int getThumbOffset() {
        float f;
        if (C0295ef.m987a(this)) {
            f = 1.0f - this.f1011a;
        } else {
            f = this.f1011a;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        if (this.f1018i == null) {
            return 0;
        }
        Rect rect2 = this.f1010N;
        this.f1018i.getPadding(rect2);
        if (this.f1013d != null) {
            rect = C0218bj.m847a(this.f1013d);
        } else {
            rect = C0218bj.f1197a;
        }
        return ((((this.f997A - this.f999C) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f995O);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1013d;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1018i;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.f1013d != null) {
            C0546a.m1919a(this.f1013d, f, f2);
        }
        if (this.f1018i != null) {
            C0546a.m1919a(this.f1018i, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1013d || drawable == this.f1018i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f1013d != null) {
            this.f1013d.jumpToCurrentState();
        }
        if (this.f1018i != null) {
            this.f1018i.jumpToCurrentState();
        }
        if (this.f1012b == null || !this.f1012b.isStarted()) {
            return;
        }
        this.f1012b.end();
        this.f1012b = null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f1027r : this.f1028s;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0577o.m2046a(this, callback));
    }
}
