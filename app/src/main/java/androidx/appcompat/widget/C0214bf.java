package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* renamed from: androidx.appcompat.widget.bf */
/* loaded from: classes.dex */
public final class C0214bf {

    /* renamed from: a */
    private static final RectF f1184a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f1185b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, Field> f1186c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private int f1187d = 0;

    /* renamed from: e */
    private boolean f1188e = false;

    /* renamed from: f */
    private float f1189f = -1.0f;

    /* renamed from: g */
    private float f1190g = -1.0f;

    /* renamed from: h */
    private float f1191h = -1.0f;

    /* renamed from: i */
    private int[] f1192i = new int[0];

    /* renamed from: j */
    private boolean f1193j = false;

    /* renamed from: k */
    private TextPaint f1194k;

    /* renamed from: l */
    private final TextView f1195l;

    /* renamed from: m */
    private final Context f1196m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0214bf(TextView textView) {
        this.f1195l = textView;
        this.f1196m = this.f1195l.getContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m809a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1196m.obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_autoSizeTextType)) {
            this.f1187d = obtainStyledAttributes.getInt(R.styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(R.styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(R.styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = obtainTypedArray.getDimensionPixelSize(i2, -1);
                }
                this.f1192i = m797a(iArr);
                m802h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (m804j()) {
            if (this.f1187d == 1) {
                if (!this.f1193j) {
                    DisplayMetrics displayMetrics = this.f1196m.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    m795a(dimension2, dimension3, dimension);
                }
                m803i();
                return;
            }
            return;
        }
        this.f1187d = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m806a(int i) {
        if (m804j()) {
            switch (i) {
                case 0:
                    this.f1187d = 0;
                    this.f1190g = -1.0f;
                    this.f1191h = -1.0f;
                    this.f1189f = -1.0f;
                    this.f1192i = new int[0];
                    this.f1188e = false;
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f1196m.getResources().getDisplayMetrics();
                    m795a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m803i()) {
                        m815f();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: ".concat(String.valueOf(i)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m808a(int i, int i2, int i3, int i4) {
        if (m804j()) {
            DisplayMetrics displayMetrics = this.f1196m.getResources().getDisplayMetrics();
            m795a(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m803i()) {
                m815f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m810a(int[] iArr, int i) {
        if (m804j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1196m.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f1192i = m797a(iArr2);
                if (!m802h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1193j = false;
            }
            if (m803i()) {
                m815f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m805a() {
        return this.f1187d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m811b() {
        return Math.round(this.f1189f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final int m812c() {
        return Math.round(this.f1190g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final int m813d() {
        return Math.round(this.f1191h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int[] m814e() {
        return this.f1192i;
    }

    /* renamed from: h */
    private boolean m802h() {
        this.f1193j = this.f1192i.length > 0;
        if (this.f1193j) {
            this.f1187d = 1;
            this.f1190g = this.f1192i[0];
            this.f1191h = this.f1192i[r0 - 1];
            this.f1189f = -1.0f;
        }
        return this.f1193j;
    }

    /* renamed from: a */
    private static int[] m797a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: a */
    private void m795a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f1187d = 1;
        this.f1190g = f;
        this.f1191h = f2;
        this.f1189f = f3;
        this.f1193j = false;
    }

    /* renamed from: i */
    private boolean m803i() {
        if (m804j() && this.f1187d == 1) {
            if (!this.f1193j || this.f1192i.length == 0) {
                int floor = ((int) Math.floor((this.f1191h - this.f1190g) / this.f1189f)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1190g + (i * this.f1189f));
                }
                this.f1192i = m797a(iArr);
            }
            this.f1188e = true;
        } else {
            this.f1188e = false;
        }
        return this.f1188e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m815f() {
        boolean booleanValue;
        if (m816g()) {
            if (this.f1188e) {
                if (this.f1195l.getMeasuredHeight() <= 0 || this.f1195l.getMeasuredWidth() <= 0) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    booleanValue = this.f1195l.isHorizontallyScrollable();
                } else {
                    booleanValue = ((Boolean) m792a(this.f1195l, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
                }
                int measuredWidth = booleanValue ? 1048576 : (this.f1195l.getMeasuredWidth() - this.f1195l.getTotalPaddingLeft()) - this.f1195l.getTotalPaddingRight();
                int height = (this.f1195l.getHeight() - this.f1195l.getCompoundPaddingBottom()) - this.f1195l.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (f1184a) {
                    f1184a.setEmpty();
                    f1184a.right = measuredWidth;
                    f1184a.bottom = height;
                    float m790a = m790a(f1184a);
                    if (m790a != this.f1195l.getTextSize()) {
                        m807a(0, m790a);
                    }
                }
            }
            this.f1188e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m807a(int i, float f) {
        Resources resources;
        if (this.f1196m == null) {
            resources = Resources.getSystem();
        } else {
            resources = this.f1196m.getResources();
        }
        m794a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: a */
    private void m794a(float f) {
        if (f != this.f1195l.getPaint().getTextSize()) {
            this.f1195l.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1195l.isInLayout() : false;
            if (this.f1195l.getLayout() != null) {
                this.f1188e = false;
                try {
                    Method m793a = m793a("nullLayouts");
                    if (m793a != null) {
                        m793a.invoke(this.f1195l, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1195l.requestLayout();
                } else {
                    this.f1195l.forceLayout();
                }
                this.f1195l.invalidate();
            }
        }
    }

    /* renamed from: a */
    private int m790a(RectF rectF) {
        int i;
        int length = this.f1192i.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = 0;
        int i3 = 1;
        int i4 = length - 1;
        while (true) {
            int i5 = i3;
            int i6 = i2;
            i2 = i5;
            while (i2 <= i4) {
                i = (i2 + i4) / 2;
                if (m796a(this.f1192i[i], rectF)) {
                    break;
                }
                i6 = i - 1;
                i4 = i6;
            }
            return this.f1192i[i6];
            i3 = i + 1;
        }
    }

    /* renamed from: b */
    private void m801b(int i) {
        if (this.f1194k == null) {
            this.f1194k = new TextPaint();
        } else {
            this.f1194k.reset();
        }
        this.f1194k.set(this.f1195l.getPaint());
        this.f1194k.setTextSize(i);
    }

    /* renamed from: a */
    private StaticLayout m791a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return m798b(charSequence, alignment, i, i2);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return new StaticLayout(charSequence, this.f1194k, i, alignment, this.f1195l.getLineSpacingMultiplier(), this.f1195l.getLineSpacingExtra(), this.f1195l.getIncludeFontPadding());
        }
        return new StaticLayout(charSequence, this.f1194k, i, alignment, ((Float) m799b(this.f1195l, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m799b(this.f1195l, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m799b(this.f1195l, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: a */
    private boolean m796a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1195l.getText();
        TransformationMethod transformationMethod = this.f1195l.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1195l)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1195l.getMaxLines() : -1;
        m801b(i);
        StaticLayout m791a = m791a(text, (Layout.Alignment) m792a(this.f1195l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (m791a.getLineCount() <= maxLines && m791a.getLineEnd(m791a.getLineCount() - 1) == text.length())) && ((float) m791a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: b */
    private StaticLayout m798b(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1194k, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1195l.getLineSpacingExtra(), this.f1195l.getLineSpacingMultiplier()).setIncludePad(this.f1195l.getIncludeFontPadding()).setBreakStrategy(this.f1195l.getBreakStrategy()).setHyphenationFrequency(this.f1195l.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = this.f1195l.getTextDirectionHeuristic();
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) m792a(this.f1195l, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: a */
    private static <T> T m792a(Object obj, String str, T t) {
        try {
            return (T) m793a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: b */
    private static <T> T m799b(Object obj, String str, T t) {
        try {
            Field m800b = m800b(str);
            return m800b == null ? t : (T) m800b.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: a */
    private static Method m793a(String str) {
        try {
            Method method = f1185b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1185b.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: b */
    private static Field m800b(String str) {
        try {
            Field field = f1186c.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1186c.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m816g() {
        return m804j() && this.f1187d != 0;
    }

    /* renamed from: j */
    private boolean m804j() {
        return !(this.f1195l instanceof AppCompatEditText);
    }
}
