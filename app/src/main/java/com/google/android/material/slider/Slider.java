package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p018b.C0418a;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2250as;
import com.google.android.material.internal.C2261f;
import com.google.android.material.internal.InterfaceC2249ar;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p083l.C2314a;
import com.google.android.material.theme.p084a.C2402a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Slider extends View {

    /* renamed from: a */
    private static final String f10212a = "Slider";

    /* renamed from: b */
    private static final int f10213b = R.style.Widget_MaterialComponents_Slider;

    /* renamed from: A */
    private InterfaceC2323d f10214A;

    /* renamed from: B */
    private boolean f10215B;

    /* renamed from: C */
    private float f10216C;

    /* renamed from: D */
    private float f10217D;

    /* renamed from: E */
    private ArrayList<Float> f10218E;

    /* renamed from: F */
    private int f10219F;

    /* renamed from: G */
    private int f10220G;

    /* renamed from: H */
    private float f10221H;

    /* renamed from: I */
    private float[] f10222I;

    /* renamed from: J */
    private int f10223J;

    /* renamed from: K */
    private boolean f10224K;

    /* renamed from: L */
    private boolean f10225L;

    /* renamed from: M */
    private boolean f10226M;

    /* renamed from: N */
    private ColorStateList f10227N;

    /* renamed from: O */
    private ColorStateList f10228O;

    /* renamed from: P */
    private ColorStateList f10229P;

    /* renamed from: Q */
    private ColorStateList f10230Q;

    /* renamed from: R */
    private ColorStateList f10231R;

    /* renamed from: S */
    private final C2295h f10232S;

    /* renamed from: T */
    private float f10233T;

    /* renamed from: c */
    private final Paint f10234c;

    /* renamed from: d */
    private final Paint f10235d;

    /* renamed from: e */
    private final Paint f10236e;

    /* renamed from: f */
    private final Paint f10237f;

    /* renamed from: g */
    private final Paint f10238g;

    /* renamed from: h */
    private final Paint f10239h;

    /* renamed from: i */
    private final C2322c f10240i;

    /* renamed from: j */
    private final AccessibilityManager f10241j;

    /* renamed from: k */
    private RunnableC2321b f10242k;

    /* renamed from: l */
    private final InterfaceC2325f f10243l;

    /* renamed from: m */
    private final List<C2314a> f10244m;

    /* renamed from: n */
    private final List<Object> f10245n;

    /* renamed from: o */
    private final List<Object> f10246o;

    /* renamed from: p */
    private final int f10247p;

    /* renamed from: q */
    private int f10248q;

    /* renamed from: r */
    private int f10249r;

    /* renamed from: s */
    private int f10250s;

    /* renamed from: t */
    private int f10251t;

    /* renamed from: u */
    private int f10252u;

    /* renamed from: v */
    private int f10253v;

    /* renamed from: w */
    private int f10254w;

    /* renamed from: x */
    private int f10255x;

    /* renamed from: y */
    private float f10256y;

    /* renamed from: z */
    private MotionEvent f10257z;

    public Slider(Context context) {
        this(context, null);
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public Slider(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f10213b), attributeSet, i);
        this.f10244m = new ArrayList();
        this.f10245n = new ArrayList();
        this.f10246o = new ArrayList();
        this.f10215B = false;
        this.f10218E = new ArrayList<>();
        this.f10219F = -1;
        this.f10220G = -1;
        this.f10221H = 0.0f;
        this.f10225L = false;
        this.f10232S = new C2295h();
        Context context2 = getContext();
        this.f10234c = new Paint();
        this.f10234c.setStyle(Paint.Style.STROKE);
        this.f10234c.setStrokeCap(Paint.Cap.ROUND);
        this.f10235d = new Paint();
        this.f10235d.setStyle(Paint.Style.STROKE);
        this.f10235d.setStrokeCap(Paint.Cap.ROUND);
        this.f10236e = new Paint(1);
        this.f10236e.setStyle(Paint.Style.FILL);
        this.f10236e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f10237f = new Paint(1);
        this.f10237f.setStyle(Paint.Style.FILL);
        this.f10238g = new Paint();
        this.f10238g.setStyle(Paint.Style.STROKE);
        this.f10238g.setStrokeCap(Paint.Cap.ROUND);
        this.f10239h = new Paint();
        this.f10239h.setStyle(Paint.Style.STROKE);
        this.f10239h.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = context2.getResources();
        this.f10248q = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        this.f10251t = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f10252u = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_top);
        this.f10255x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.f10243l = new C2320a(this, attributeSet, i);
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, R.styleable.Slider, i, f10213b, new int[0]);
        this.f10216C = m7095a.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.f10217D = m7095a.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValue(m7095a.getFloat(R.styleable.Slider_android_value, this.f10216C));
        this.f10221H = m7095a.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        boolean hasValue = m7095a.hasValue(R.styleable.Slider_trackColor);
        int i2 = hasValue ? R.styleable.Slider_trackColor : R.styleable.Slider_trackColorInactive;
        int i3 = hasValue ? R.styleable.Slider_trackColor : R.styleable.Slider_trackColorActive;
        ColorStateList m7045a = C2221d.m7045a(context2, m7095a, i2);
        setTrackColorInactive(m7045a == null ? C0057a.m45a(context2, R.color.material_slider_inactive_track_color) : m7045a);
        ColorStateList m7045a2 = C2221d.m7045a(context2, m7095a, i3);
        setTrackColorActive(m7045a2 == null ? C0057a.m45a(context2, R.color.material_slider_active_track_color) : m7045a2);
        this.f10232S.m7282g(C2221d.m7045a(context2, m7095a, R.styleable.Slider_thumbColor));
        ColorStateList m7045a3 = C2221d.m7045a(context2, m7095a, R.styleable.Slider_haloColor);
        setHaloColor(m7045a3 == null ? C0057a.m45a(context2, R.color.material_slider_halo_color) : m7045a3);
        boolean hasValue2 = m7095a.hasValue(R.styleable.Slider_tickColor);
        int i4 = hasValue2 ? R.styleable.Slider_tickColor : R.styleable.Slider_tickColorInactive;
        int i5 = hasValue2 ? R.styleable.Slider_tickColor : R.styleable.Slider_tickColorActive;
        ColorStateList m7045a4 = C2221d.m7045a(context2, m7095a, i4);
        setTickColorInactive(m7045a4 == null ? C0057a.m45a(context2, R.color.material_slider_inactive_tick_marks_color) : m7045a4);
        ColorStateList m7045a5 = C2221d.m7045a(context2, m7095a, i5);
        setTickColorActive(m7045a5 == null ? C0057a.m45a(context2, R.color.material_slider_active_tick_marks_color) : m7045a5);
        setThumbRadius(m7095a.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0));
        setHaloRadius(m7095a.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(m7095a.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(m7095a.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        this.f10249r = m7095a.getInt(R.styleable.Slider_labelBehavior, 0);
        m7095a.recycle();
        setFocusable(true);
        this.f10232S.m7262P();
        this.f10247p = ViewConfiguration.get(context2).getScaledTouchSlop();
        this.f10240i = new C2322c(this);
        C0538w.m1849a(this, this.f10240i);
        this.f10241j = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* renamed from: b */
    private void m7401b() {
        Iterator<Float> it = this.f10218E.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.f10216C || next.floatValue() > this.f10217D) {
                throw new IllegalStateException("Slider value must be greater or equal to valueFrom, and lower or equal to valueTo");
            }
            if (this.f10221H > 0.0f && ((this.f10216C - next.floatValue()) / this.f10221H) % 1.0f > 1.0E-4d) {
                throw new IllegalStateException("Value must be equal to valueFrom plus a multiple of stepSize when using stepSize");
            }
        }
    }

    /* renamed from: c */
    private void m7406c() {
        if (this.f10226M) {
            if (this.f10216C >= this.f10217D) {
                throw new IllegalStateException("valueFrom must be smaller than valueTo");
            }
            if (this.f10217D <= this.f10216C) {
                throw new IllegalStateException("valueTo must be greater than valueFrom");
            }
            if (this.f10221H <= 0.0f || ((this.f10217D - this.f10216C) / this.f10221H) % 1.0f <= 1.0E-4d) {
                m7401b();
                this.f10226M = false;
                return;
            }
            throw new IllegalStateException("The stepSize must be 0, or a factor of the valueFrom-valueTo range");
        }
    }

    public float getValueFrom() {
        return this.f10216C;
    }

    public void setValueFrom(float f) {
        this.f10216C = f;
        this.f10226M = true;
        postInvalidate();
    }

    public float getValueTo() {
        return this.f10217D;
    }

    public void setValueTo(float f) {
        this.f10217D = f;
        this.f10226M = true;
        postInvalidate();
    }

    public float getValue() {
        if (this.f10218E.size() > 1) {
            throw new IllegalStateException("More than one value is set on the Slider. Use getValues() instead.");
        }
        return this.f10218E.get(0).floatValue();
    }

    public List<Float> getValues() {
        return new ArrayList(this.f10218E);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f10218E.size() == arrayList.size() && this.f10218E.equals(arrayList)) {
            return;
        }
        this.f10218E = arrayList;
        this.f10226M = true;
        this.f10220G = 0;
        m7414f();
        m7410d();
        m7423k();
        postInvalidate();
    }

    /* renamed from: d */
    private void m7410d() {
        if (this.f10244m.size() > this.f10218E.size()) {
            this.f10244m.subList(this.f10218E.size(), this.f10244m.size()).clear();
        }
        while (this.f10244m.size() < this.f10218E.size()) {
            this.f10244m.add(this.f10243l.mo7427a());
        }
        int i = this.f10244m.size() == 1 ? 0 : 1;
        Iterator<C2314a> it = this.f10244m.iterator();
        while (it.hasNext()) {
            it.next().m7284n(i);
        }
    }

    public float getStepSize() {
        return this.f10221H;
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("The stepSize must be 0, or a factor of the valueFrom-valueTo range");
        }
        if (this.f10221H != f) {
            this.f10221H = f;
            this.f10226M = true;
            postInvalidate();
        }
    }

    public float getMaximumValue() {
        return this.f10218E.get(this.f10218E.size() - 1).floatValue();
    }

    public float getMinimumValue() {
        return this.f10218E.get(0).floatValue();
    }

    public int getFocusedThumbIndex() {
        return this.f10220G;
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f10218E.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f10220G = i;
        this.f10240i.m2085c(this.f10220G);
        postInvalidate();
    }

    public int getActiveThumbIndex() {
        return this.f10219F;
    }

    public void setLabelFormatter(InterfaceC2323d interfaceC2323d) {
        this.f10214A = interfaceC2323d;
    }

    public float getThumbElevation() {
        return this.f10232S.m7265S();
    }

    public void setThumbElevation(float f) {
        this.f10232S.m7288r(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public int getThumbRadius() {
        return this.f10253v;
    }

    public void setThumbRadius(int i) {
        if (i == this.f10253v) {
            return;
        }
        this.f10253v = i;
        this.f10232S.setShapeAppearanceModel(C2303p.m7297a().m7328a(this.f10253v).m7327a());
        this.f10232S.setBounds(0, 0, this.f10253v * 2, this.f10253v * 2);
        postInvalidate();
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public int getHaloRadius() {
        return this.f10254w;
    }

    public void setHaloRadius(int i) {
        if (i == this.f10254w) {
            return;
        }
        this.f10254w = i;
        if (!m7418h()) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) background;
                int i2 = this.f10254w;
                if (Build.VERSION.SDK_INT >= 23) {
                    rippleDrawable.setRadius(i2);
                    return;
                }
                try {
                    RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable, Integer.valueOf(i2));
                    return;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new IllegalStateException("Couldn't set RippleDrawable radius", e);
                }
            }
            return;
        }
        postInvalidate();
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public int getLabelBehavior() {
        return this.f10249r;
    }

    public void setLabelBehavior(int i) {
        if (this.f10249r != i) {
            this.f10249r = i;
            requestLayout();
        }
    }

    public int getTrackSidePadding() {
        return this.f10251t;
    }

    public int getTrackWidth() {
        return this.f10223J;
    }

    public int getTrackHeight() {
        return this.f10250s;
    }

    public void setTrackHeight(int i) {
        if (this.f10250s != i) {
            this.f10250s = i;
            this.f10234c.setStrokeWidth(this.f10250s);
            this.f10235d.setStrokeWidth(this.f10250s);
            this.f10238g.setStrokeWidth(this.f10250s / 2.0f);
            this.f10239h.setStrokeWidth(this.f10250s / 2.0f);
            postInvalidate();
        }
    }

    public ColorStateList getHaloColor() {
        return this.f10227N;
    }

    public void setHaloColor(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f10227N)) {
            return;
        }
        this.f10227N = colorStateList;
        if (!m7418h()) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(colorStateList);
                return;
            }
            return;
        }
        this.f10237f.setColor(m7389a(colorStateList));
        this.f10237f.setAlpha(63);
        invalidate();
    }

    public ColorStateList getThumbColor() {
        return this.f10232S.m7259M();
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.f10232S.m7282g(colorStateList);
    }

    public ColorStateList getTickColor() {
        if (!this.f10229P.equals(this.f10228O)) {
            throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        }
        return this.f10228O;
    }

    public void setTickColor(ColorStateList colorStateList) {
        setTickColorInactive(colorStateList);
        setTickColorActive(colorStateList);
    }

    public ColorStateList getTickColorActive() {
        return this.f10228O;
    }

    public void setTickColorActive(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f10228O)) {
            return;
        }
        this.f10228O = colorStateList;
        this.f10239h.setColor(m7389a(this.f10228O));
        invalidate();
    }

    public ColorStateList getTickColorInactive() {
        return this.f10229P;
    }

    public void setTickColorInactive(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f10229P)) {
            return;
        }
        this.f10229P = colorStateList;
        this.f10238g.setColor(m7389a(this.f10229P));
        invalidate();
    }

    public ColorStateList getTrackColor() {
        if (!this.f10231R.equals(this.f10230Q)) {
            throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        }
        return this.f10230Q;
    }

    public void setTrackColor(ColorStateList colorStateList) {
        setTrackColorInactive(colorStateList);
        setTrackColorActive(colorStateList);
    }

    public ColorStateList getTrackColorActive() {
        return this.f10230Q;
    }

    public void setTrackColorActive(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f10230Q)) {
            return;
        }
        this.f10230Q = colorStateList;
        this.f10235d.setColor(m7389a(this.f10230Q));
        invalidate();
    }

    public ColorStateList getTrackColorInactive() {
        return this.f10231R;
    }

    public void setTrackColorInactive(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f10231R)) {
            return;
        }
        this.f10231R = colorStateList;
        this.f10234c.setColor(m7389a(this.f10231R));
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<C2314a> it = this.f10244m.iterator();
        while (it.hasNext()) {
            it.next().m7380a(C2250as.m7115d(this));
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        if (this.f10242k != null) {
            removeCallbacks(this.f10242k);
        }
        for (C2314a c2314a : this.f10244m) {
            InterfaceC2249ar m7116e = C2250as.m7116e(this);
            if (m7116e != null) {
                m7116e.mo7105b(c2314a);
                c2314a.m7382b(C2250as.m7115d(this));
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f10248q + (this.f10249r == 1 ? this.f10244m.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f10223J = i - (this.f10251t * 2);
        if (this.f10221H > 0.0f) {
            m7412e();
        }
        m7414f();
    }

    /* renamed from: e */
    private void m7412e() {
        m7406c();
        int min = Math.min((int) (((this.f10217D - this.f10216C) / this.f10221H) + 1.0f), (this.f10223J / (this.f10250s * 2)) + 1);
        if (this.f10222I == null || this.f10222I.length != min * 2) {
            this.f10222I = new float[min * 2];
        }
        float f = this.f10223J / (min - 1);
        for (int i = 0; i < min * 2; i += 2) {
            this.f10222I[i] = this.f10251t + ((i / 2) * f);
            this.f10222I[i + 1] = m7415g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m7414f() {
        if (m7418h() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int m7387a = (int) ((m7387a(this.f10218E.get(this.f10220G).floatValue()) * this.f10223J) + this.f10251t);
            int m7415g = m7415g();
            C0546a.m1921a(background, m7387a - this.f10254w, m7415g - this.f10254w, m7387a + this.f10254w, m7415g + this.f10254w);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public int m7415g() {
        return this.f10252u + (this.f10249r == 1 ? this.f10244m.get(0).getIntrinsicHeight() : 0);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f10226M) {
            m7406c();
            if (this.f10221H > 0.0f) {
                m7412e();
            }
        }
        super.onDraw(canvas);
        int m7415g = m7415g();
        int i = this.f10223J;
        float[] activeRange = getActiveRange();
        float f = i;
        float f2 = this.f10251t + (activeRange[1] * f);
        if (f2 < this.f10251t + i) {
            float f3 = m7415g;
            canvas.drawLine(f2, f3, this.f10251t + i, f3, this.f10234c);
        }
        float f4 = this.f10251t + (activeRange[0] * f);
        if (f4 > this.f10251t) {
            float f5 = m7415g;
            canvas.drawLine(this.f10251t, f5, f4, f5, this.f10234c);
        }
        if (getMaximumValue() > this.f10216C) {
            int i2 = this.f10223J;
            float[] activeRange2 = getActiveRange();
            float f6 = i2;
            float f7 = m7415g;
            canvas.drawLine(this.f10251t + (activeRange2[0] * f6), f7, this.f10251t + (activeRange2[1] * f6), f7, this.f10235d);
        }
        if (this.f10221H > 0.0f) {
            float[] activeRange3 = getActiveRange();
            int m7390a = m7390a(this.f10222I, activeRange3[0]);
            int m7390a2 = m7390a(this.f10222I, activeRange3[1]);
            int i3 = m7390a * 2;
            canvas.drawPoints(this.f10222I, 0, i3, this.f10238g);
            int i4 = m7390a2 * 2;
            canvas.drawPoints(this.f10222I, i3, i4 - i3, this.f10239h);
            canvas.drawPoints(this.f10222I, i4, this.f10222I.length - i4, this.f10238g);
        }
        if ((this.f10215B || isFocused()) && isEnabled()) {
            int i5 = this.f10223J;
            if (m7418h()) {
                int m7387a = (int) (this.f10251t + (m7387a(this.f10218E.get(this.f10220G).floatValue()) * i5));
                if (Build.VERSION.SDK_INT < 28) {
                    canvas.clipRect(m7387a - this.f10254w, m7415g - this.f10254w, this.f10254w + m7387a, this.f10254w + m7415g, Region.Op.UNION);
                }
                canvas.drawCircle(m7387a, m7415g, this.f10254w, this.f10237f);
            }
            if (this.f10219F != -1 && this.f10249r != 2) {
                Iterator<C2314a> it = this.f10244m.iterator();
                for (int i6 = 0; i6 < this.f10218E.size() && it.hasNext(); i6++) {
                    if (i6 != this.f10220G) {
                        m7396a(it.next(), this.f10218E.get(i6).floatValue());
                    }
                }
                if (!it.hasNext()) {
                    throw new IllegalStateException("Not enough labels to display all the values");
                }
                m7396a(it.next(), this.f10218E.get(this.f10220G).floatValue());
            }
        }
        m7395a(canvas, this.f10223J, m7415g);
    }

    private float[] getActiveRange() {
        float m7387a = m7387a(this.f10218E.size() == 1 ? this.f10216C : getMinimumValue());
        float m7387a2 = m7387a(getMaximumValue());
        if (C0538w.m1878h(this) == 1) {
            return new float[]{m7387a2, m7387a};
        }
        return new float[]{m7387a, m7387a2};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public float m7387a(float f) {
        float f2 = (f - this.f10216C) / (this.f10217D - this.f10216C);
        return C0538w.m1878h(this) == 1 ? 1.0f - f2 : f2;
    }

    /* renamed from: a */
    private void m7395a(Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            Iterator<Float> it = this.f10218E.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(this.f10251t + (m7387a(it.next().floatValue()) * i), i2, this.f10253v, this.f10236e);
            }
        }
        Iterator<Float> it2 = this.f10218E.iterator();
        while (it2.hasNext()) {
            Float next = it2.next();
            canvas.save();
            canvas.translate((this.f10251t + ((int) (m7387a(next.floatValue()) * i))) - this.f10253v, i2 - this.f10253v);
            this.f10232S.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: h */
    private boolean m7418h() {
        return this.f10224K || Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x002f. Please report as an issue. */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        this.f10233T = (x - this.f10251t) / this.f10223J;
        this.f10233T = Math.max(0.0f, this.f10233T);
        this.f10233T = Math.min(1.0f, this.f10233T);
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f10256y = x;
                ViewParent parent = getParent();
                while (true) {
                    if (parent instanceof ViewGroup) {
                        if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                            z = true;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                if (!z) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (m7420i()) {
                        requestFocus();
                        this.f10215B = true;
                        m7422j();
                        m7414f();
                        invalidate();
                        m7424l();
                    }
                }
                setPressed(this.f10215B);
                this.f10257z = MotionEvent.obtain(motionEvent);
                return true;
            case 1:
                this.f10215B = false;
                if (this.f10257z != null && this.f10257z.getActionMasked() == 0 && this.f10257z.getX() == motionEvent.getX() && this.f10257z.getY() == motionEvent.getY()) {
                    m7420i();
                }
                if (this.f10219F != -1) {
                    m7422j();
                    this.f10219F = -1;
                }
                Iterator<C2314a> it = this.f10244m.iterator();
                while (it.hasNext()) {
                    C2250as.m7116e(this).mo7105b(it.next());
                }
                Iterator<Object> it2 = this.f10246o.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                invalidate();
                setPressed(this.f10215B);
                this.f10257z = MotionEvent.obtain(motionEvent);
                return true;
            case 2:
                if (!this.f10215B) {
                    if (Math.abs(x - this.f10256y) < this.f10247p) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m7424l();
                }
                if (m7420i()) {
                    this.f10215B = true;
                    m7422j();
                    m7414f();
                    invalidate();
                }
                setPressed(this.f10215B);
                this.f10257z = MotionEvent.obtain(motionEvent);
                return true;
            default:
                setPressed(this.f10215B);
                this.f10257z = MotionEvent.obtain(motionEvent);
                return true;
        }
    }

    /* renamed from: a */
    private static int m7390a(float[] fArr, float f) {
        return Math.round(f * ((fArr.length / 2) - 1));
    }

    /* renamed from: i */
    private boolean m7420i() {
        if (this.f10219F != -1) {
            return true;
        }
        float valueOfTouchPosition = getValueOfTouchPosition();
        float m7404c = m7404c(valueOfTouchPosition);
        float min = Math.min(m7404c, this.f10256y);
        float max = Math.max(m7404c, this.f10256y);
        this.f10219F = 0;
        float abs = Math.abs(this.f10218E.get(this.f10219F).floatValue() - valueOfTouchPosition);
        for (int i = 0; i < this.f10218E.size(); i++) {
            float abs2 = Math.abs(this.f10218E.get(i).floatValue() - valueOfTouchPosition);
            float m7404c2 = m7404c(this.f10218E.get(i).floatValue());
            float abs3 = Math.abs(m7404c2 - m7404c);
            float abs4 = Math.abs(m7404c(this.f10218E.get(this.f10219F).floatValue()) - m7404c);
            if (min < m7404c2 && max > m7404c2) {
                this.f10219F = i;
                return true;
            }
            if (abs3 < this.f10247p && abs4 < this.f10247p && Math.abs(abs3 - abs4) > 1.0E-4d) {
                this.f10219F = -1;
                return false;
            }
            if (abs2 < abs) {
                this.f10219F = i;
                abs = abs2;
            }
        }
        return true;
    }

    /* renamed from: j */
    private boolean m7422j() {
        return m7403b(getValueOfTouchPosition());
    }

    /* renamed from: b */
    private boolean m7403b(float f) {
        return m7397a(this.f10219F, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m7397a(int i, float f) {
        if (Math.abs(f - this.f10218E.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f10218E.set(i, Float.valueOf(f));
        Collections.sort(this.f10218E);
        if (i == this.f10219F) {
            i = this.f10218E.indexOf(Float.valueOf(f));
        }
        this.f10219F = i;
        this.f10220G = i;
        m7394a(i);
        return true;
    }

    private float getValueOfTouchPosition() {
        double d;
        float f = this.f10233T;
        if (this.f10221H > 0.0f) {
            d = Math.round(f * r1) / ((int) ((this.f10217D - this.f10216C) / this.f10221H));
        } else {
            d = f;
        }
        if (C0538w.m1878h(this) == 1) {
            d = 1.0d - d;
        }
        return (float) ((d * (this.f10217D - this.f10216C)) + this.f10216C);
    }

    /* renamed from: c */
    private float m7404c(float f) {
        return (m7387a(f) * this.f10223J) + this.f10251t;
    }

    /* renamed from: a */
    private void m7396a(C2314a c2314a, float f) {
        c2314a.m7381a(m7408d(f));
        int m7387a = (this.f10251t + ((int) (m7387a(f) * this.f10223J))) - (c2314a.getIntrinsicWidth() / 2);
        int m7415g = m7415g() - (this.f10255x + this.f10253v);
        c2314a.setBounds(m7387a, m7415g - c2314a.getIntrinsicHeight(), c2314a.getIntrinsicWidth() + m7387a, m7415g);
        Rect rect = new Rect(c2314a.getBounds());
        C2261f.m7178a(C2250as.m7115d(this), this, rect);
        c2314a.setBounds(rect);
        C2250as.m7116e(this).mo7104a(c2314a);
    }

    /* renamed from: k */
    private void m7423k() {
        Iterator<Object> it = this.f10245n.iterator();
        while (it.hasNext()) {
            it.next();
            Iterator<Float> it2 = this.f10218E.iterator();
            while (it2.hasNext()) {
                it2.next().floatValue();
            }
        }
    }

    /* renamed from: a */
    private void m7394a(int i) {
        Iterator<Object> it = this.f10245n.iterator();
        while (it.hasNext()) {
            it.next();
            this.f10218E.get(i).floatValue();
        }
        if (this.f10241j == null || !this.f10241j.isEnabled()) {
            return;
        }
        m7407c(i);
    }

    /* renamed from: l */
    private void m7424l() {
        Iterator<Object> it = this.f10246o.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f10234c.setColor(m7389a(this.f10231R));
        this.f10235d.setColor(m7389a(this.f10230Q));
        this.f10238g.setColor(m7389a(this.f10229P));
        this.f10239h.setColor(m7389a(this.f10228O));
        for (C2314a c2314a : this.f10244m) {
            if (c2314a.isStateful()) {
                c2314a.setState(getDrawableState());
            }
        }
        if (this.f10232S.isStateful()) {
            this.f10232S.setState(getDrawableState());
        }
        this.f10237f.setColor(m7389a(this.f10227N));
        this.f10237f.setAlpha(63);
    }

    /* renamed from: a */
    private int m7389a(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Float valueOf;
        if (isEnabled()) {
            if (this.f10218E.size() == 1) {
                this.f10219F = 0;
            }
            if (this.f10219F == -1) {
                if (i == 61) {
                    if (keyEvent.hasNoModifiers()) {
                        m7402b(1);
                        return true;
                    }
                    if (!keyEvent.isShiftPressed()) {
                        return false;
                    }
                    m7402b(-1);
                    return true;
                }
                if (i != 66) {
                    if (i != 69) {
                        if (i != 81) {
                            switch (i) {
                            }
                        }
                        m7402b(1);
                        return true;
                    }
                    m7402b(-1);
                    return true;
                }
                this.f10219F = this.f10220G;
                postInvalidate();
                return true;
            }
            this.f10225L |= keyEvent.isLongPress();
            float m7426n = this.f10225L ? m7426n() : m7425m();
            switch (i) {
                case 21:
                case 69:
                    m7426n = -m7426n;
                case 22:
                case 70:
                case 81:
                    valueOf = Float.valueOf(m7426n);
                    break;
                case 61:
                    if (keyEvent.isShiftPressed()) {
                        valueOf = Float.valueOf(-m7426n);
                        break;
                    } else {
                        valueOf = Float.valueOf(m7426n);
                        break;
                    }
                default:
                    valueOf = null;
                    break;
            }
            if (valueOf != null) {
                if (C0538w.m1878h(this) == 1) {
                    valueOf = Float.valueOf(-valueOf.floatValue());
                }
                if (m7403b(C0418a.m1477a(this.f10218E.get(this.f10219F).floatValue() + valueOf.floatValue(), this.f10216C, this.f10217D))) {
                    m7414f();
                    postInvalidate();
                }
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f10225L = false;
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: b */
    private void m7402b(int i) {
        this.f10220G += i;
        this.f10220G = C0418a.m1478a(this.f10220G, 0, this.f10218E.size() - 1);
        if (this.f10219F != -1) {
            this.f10219F = this.f10220G;
        }
        m7414f();
        postInvalidate();
    }

    /* renamed from: m */
    private float m7425m() {
        if (this.f10221H == 0.0f) {
            return 1.0f;
        }
        return this.f10221H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public float m7426n() {
        float m7425m = m7425m();
        return (this.f10217D - this.f10216C) / m7425m <= 20.0f ? m7425m : Math.round(r1 / 20.0f) * m7425m;
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f10219F = -1;
            Iterator<C2314a> it = this.f10244m.iterator();
            while (it.hasNext()) {
                C2250as.m7116e(this).mo7105b(it.next());
            }
            this.f10240i.m2085c(RecyclerView.UNDEFINED_DURATION);
            return;
        }
        this.f10240i.m2085c(this.f10220G);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f10240i.m2082a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: c */
    private void m7407c(int i) {
        if (this.f10242k == null) {
            this.f10242k = new RunnableC2321b(this, (byte) 0);
        } else {
            removeCallbacks(this.f10242k);
        }
        this.f10242k.f10266a = i;
        postDelayed(this.f10242k, 200L);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f10258a = this.f10216C;
        sliderState.f10259b = this.f10217D;
        sliderState.f10260c = new ArrayList<>(this.f10218E);
        sliderState.f10261d = this.f10221H;
        sliderState.f10262e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f10216C = sliderState.f10258a;
        this.f10217D = sliderState.f10259b;
        this.f10218E = sliderState.f10260c;
        this.f10221H = sliderState.f10261d;
        if (sliderState.f10262e) {
            requestFocus();
        }
        m7423k();
    }

    /* loaded from: classes.dex */
    class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C2324e();

        /* renamed from: a */
        float f10258a;

        /* renamed from: b */
        float f10259b;

        /* renamed from: c */
        ArrayList<Float> f10260c;

        /* renamed from: d */
        float f10261d;

        /* renamed from: e */
        boolean f10262e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ SliderState(Parcel parcel, byte b) {
            this(parcel);
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(Parcel parcel) {
            super(parcel);
            this.f10258a = parcel.readFloat();
            this.f10259b = parcel.readFloat();
            this.f10260c = new ArrayList<>();
            parcel.readList(this.f10260c, Float.class.getClassLoader());
            this.f10261d = parcel.readFloat();
            this.f10262e = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f10258a);
            parcel.writeFloat(this.f10259b);
            parcel.writeList(this.f10260c);
            parcel.writeFloat(this.f10261d);
            parcel.writeBooleanArray(new boolean[]{this.f10262e});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public String m7408d(float f) {
        if (this.f10214A != null) {
            return this.f10214A.m7429a();
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }
}
