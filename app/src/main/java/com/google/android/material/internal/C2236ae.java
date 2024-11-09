package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.p023f.C0478i;
import com.coloros.neton.BuildConfig;
import java.lang.reflect.Constructor;

/* compiled from: StaticLayoutBuilderCompat.java */
/* renamed from: com.google.android.material.internal.ae */
/* loaded from: classes.dex */
final class C2236ae {

    /* renamed from: a */
    private static boolean f9910a;

    /* renamed from: b */
    private static Constructor<StaticLayout> f9911b;

    /* renamed from: c */
    private static Object f9912c;

    /* renamed from: d */
    private CharSequence f9913d;

    /* renamed from: e */
    private final TextPaint f9914e;

    /* renamed from: f */
    private final int f9915f;

    /* renamed from: h */
    private int f9917h;

    /* renamed from: l */
    private boolean f9921l;

    /* renamed from: g */
    private int f9916g = 0;

    /* renamed from: i */
    private Layout.Alignment f9918i = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: j */
    private int f9919j = Integer.MAX_VALUE;

    /* renamed from: k */
    private boolean f9920k = true;

    /* renamed from: m */
    private TextUtils.TruncateAt f9922m = null;

    private C2236ae(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f9913d = charSequence;
        this.f9914e = textPaint;
        this.f9915f = i;
        this.f9917h = charSequence.length();
    }

    /* renamed from: a */
    public static C2236ae m7079a(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C2236ae(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public final C2236ae m7082a(Layout.Alignment alignment) {
        this.f9918i = alignment;
        return this;
    }

    /* renamed from: a */
    public final C2236ae m7080a() {
        this.f9920k = false;
        return this;
    }

    /* renamed from: a */
    public final C2236ae m7081a(int i) {
        this.f9919j = i;
        return this;
    }

    /* renamed from: a */
    public final C2236ae m7083a(TextUtils.TruncateAt truncateAt) {
        this.f9922m = truncateAt;
        return this;
    }

    /* renamed from: b */
    public final StaticLayout m7085b() {
        Class<?> cls;
        if (this.f9913d == null) {
            this.f9913d = BuildConfig.FLAVOR;
        }
        int max = Math.max(0, this.f9915f);
        CharSequence charSequence = this.f9913d;
        if (this.f9919j == 1) {
            charSequence = TextUtils.ellipsize(this.f9913d, this.f9914e, max, this.f9922m);
        }
        this.f9917h = Math.min(charSequence.length(), this.f9917h);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f9921l) {
                this.f9918i = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f9916g, this.f9917h, this.f9914e, max);
            obtain.setAlignment(this.f9918i);
            obtain.setIncludePad(this.f9920k);
            obtain.setTextDirection(this.f9921l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (this.f9922m != null) {
                obtain.setEllipsize(this.f9922m);
            }
            obtain.setMaxLines(this.f9919j);
            return obtain.build();
        }
        if (!f9910a) {
            try {
                boolean z = this.f9921l && Build.VERSION.SDK_INT >= 23;
                if (Build.VERSION.SDK_INT >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f9912c = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = C2236ae.class.getClassLoader();
                    String str = this.f9921l ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f9912c = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
                f9911b = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f9910a = true;
            } catch (Exception e) {
                throw new C2237af(e);
            }
        }
        try {
            return (StaticLayout) ((Constructor) C0478i.m1620a(f9911b)).newInstance(charSequence, Integer.valueOf(this.f9916g), Integer.valueOf(this.f9917h), this.f9914e, Integer.valueOf(max), this.f9918i, C0478i.m1620a(f9912c), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f9920k), null, Integer.valueOf(max), Integer.valueOf(this.f9919j));
        } catch (Exception e2) {
            throw new C2237af(e2);
        }
    }

    /* renamed from: a */
    public final C2236ae m7084a(boolean z) {
        this.f9921l = z;
        return this;
    }
}
