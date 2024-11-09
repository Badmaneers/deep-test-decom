package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.p023f.C0478i;
import androidx.core.widget.C0577o;
import androidx.core.widget.InterfaceC0566d;
import androidx.core.widget.InterfaceC0580r;
import java.util.Locale;

/* compiled from: AppCompatTextHelper.java */
/* renamed from: androidx.appcompat.widget.bc */
/* loaded from: classes.dex */
public final class C0211bc {

    /* renamed from: a */
    private final TextView f1165a;

    /* renamed from: b */
    private C0274dl f1166b;

    /* renamed from: c */
    private C0274dl f1167c;

    /* renamed from: d */
    private C0274dl f1168d;

    /* renamed from: e */
    private C0274dl f1169e;

    /* renamed from: f */
    private C0274dl f1170f;

    /* renamed from: g */
    private C0274dl f1171g;

    /* renamed from: h */
    private C0274dl f1172h;

    /* renamed from: i */
    private final C0214bf f1173i;

    /* renamed from: j */
    private int f1174j = 0;

    /* renamed from: k */
    private int f1175k = -1;

    /* renamed from: l */
    private Typeface f1176l;

    /* renamed from: m */
    private boolean f1177m;

    public C0211bc(TextView textView) {
        this.f1165a = textView;
        this.f1173i = new C0214bf(this.f1165a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public final void m773a(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        ColorStateList colorStateList;
        String str2;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        C0192ak c0192ak;
        C0192ak c0192ak2;
        Drawable drawable;
        Context context = this.f1165a.getContext();
        C0192ak m709b = C0192ak.m709b();
        C0276dn m944a = C0276dn.m944a(context, attributeSet, R.styleable.AppCompatTextHelper, i, 0);
        int m962g = m944a.m962g(R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (m944a.m964i(R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.f1166b = m761a(context, m709b, m944a.m962g(R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (m944a.m964i(R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.f1167c = m761a(context, m709b, m944a.m962g(R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (m944a.m964i(R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.f1168d = m761a(context, m709b, m944a.m962g(R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (m944a.m964i(R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.f1169e = m761a(context, m709b, m944a.m962g(R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (m944a.m964i(R.styleable.AppCompatTextHelper_android_drawableStart)) {
                this.f1170f = m761a(context, m709b, m944a.m962g(R.styleable.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (m944a.m964i(R.styleable.AppCompatTextHelper_android_drawableEnd)) {
                this.f1171g = m761a(context, m709b, m944a.m962g(R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        m944a.m952b();
        boolean z3 = this.f1165a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m962g != -1) {
            C0276dn m942a = C0276dn.m942a(context, m962g, R.styleable.TextAppearance);
            if (z3 || !m942a.m964i(R.styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z2 = m942a.m949a(R.styleable.TextAppearance_textAllCaps, false);
                z = true;
            }
            m762a(context, m942a);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList3 = m942a.m964i(R.styleable.TextAppearance_android_textColor) ? m942a.m960f(R.styleable.TextAppearance_android_textColor) : null;
                colorStateList2 = m942a.m964i(R.styleable.TextAppearance_android_textColorHint) ? m942a.m960f(R.styleable.TextAppearance_android_textColorHint) : null;
                colorStateList = m942a.m964i(R.styleable.TextAppearance_android_textColorLink) ? m942a.m960f(R.styleable.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList = null;
                colorStateList2 = null;
                colorStateList3 = null;
            }
            str = m942a.m964i(R.styleable.TextAppearance_textLocale) ? m942a.m956d(R.styleable.TextAppearance_textLocale) : null;
            str2 = (Build.VERSION.SDK_INT < 26 || !m942a.m964i(R.styleable.TextAppearance_fontVariationSettings)) ? null : m942a.m956d(R.styleable.TextAppearance_fontVariationSettings);
            m942a.m952b();
        } else {
            z = false;
            z2 = false;
            str = null;
            colorStateList = null;
            str2 = null;
            colorStateList2 = null;
            colorStateList3 = null;
        }
        C0276dn m944a2 = C0276dn.m944a(context, attributeSet, R.styleable.TextAppearance, i, 0);
        if (!z3 && m944a2.m964i(R.styleable.TextAppearance_textAllCaps)) {
            z2 = m944a2.m949a(R.styleable.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (m944a2.m964i(R.styleable.TextAppearance_android_textColor)) {
                colorStateList3 = m944a2.m960f(R.styleable.TextAppearance_android_textColor);
            }
            if (m944a2.m964i(R.styleable.TextAppearance_android_textColorHint)) {
                colorStateList2 = m944a2.m960f(R.styleable.TextAppearance_android_textColorHint);
            }
            if (m944a2.m964i(R.styleable.TextAppearance_android_textColorLink)) {
                colorStateList = m944a2.m960f(R.styleable.TextAppearance_android_textColorLink);
            }
        }
        if (m944a2.m964i(R.styleable.TextAppearance_textLocale)) {
            str = m944a2.m956d(R.styleable.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && m944a2.m964i(R.styleable.TextAppearance_fontVariationSettings)) {
            str2 = m944a2.m956d(R.styleable.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT >= 28 && m944a2.m964i(R.styleable.TextAppearance_android_textSize) && m944a2.m958e(R.styleable.TextAppearance_android_textSize, -1) == 0) {
            c0192ak = m709b;
            this.f1165a.setTextSize(0, 0.0f);
        } else {
            c0192ak = m709b;
        }
        m762a(context, m944a2);
        m944a2.m952b();
        if (colorStateList3 != null) {
            this.f1165a.setTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.f1165a.setHintTextColor(colorStateList2);
        }
        if (colorStateList != null) {
            this.f1165a.setLinkTextColor(colorStateList);
        }
        if (!z3 && z) {
            m775a(z2);
        }
        if (this.f1176l != null) {
            if (this.f1175k == -1) {
                this.f1165a.setTypeface(this.f1176l, this.f1174j);
            } else {
                this.f1165a.setTypeface(this.f1176l);
            }
        }
        if (str2 != null) {
            this.f1165a.setFontVariationSettings(str2);
        }
        if (str != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f1165a.setTextLocales(LocaleList.forLanguageTags(str));
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f1165a.setTextLocale(Locale.forLanguageTag(str.substring(0, str.indexOf(44))));
            }
        }
        this.f1173i.m809a(attributeSet, i);
        if (InterfaceC0566d.f2511d && this.f1173i.m805a() != 0) {
            int[] m814e = this.f1173i.m814e();
            if (m814e.length > 0) {
                if (this.f1165a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f1165a.setAutoSizeTextTypeUniformWithConfiguration(this.f1173i.m812c(), this.f1173i.m813d(), this.f1173i.m811b(), 0);
                } else {
                    this.f1165a.setAutoSizeTextTypeUniformWithPresetSizes(m814e, 0);
                }
            }
        }
        C0276dn m943a = C0276dn.m943a(context, attributeSet, R.styleable.AppCompatTextView);
        int m962g2 = m943a.m962g(R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        if (m962g2 != -1) {
            c0192ak2 = c0192ak;
            drawable = c0192ak2.m711a(context, m962g2);
        } else {
            c0192ak2 = c0192ak;
            drawable = null;
        }
        int m962g3 = m943a.m962g(R.styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable m711a = m962g3 != -1 ? c0192ak2.m711a(context, m962g3) : null;
        int m962g4 = m943a.m962g(R.styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable m711a2 = m962g4 != -1 ? c0192ak2.m711a(context, m962g4) : null;
        int m962g5 = m943a.m962g(R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable m711a3 = m962g5 != -1 ? c0192ak2.m711a(context, m962g5) : null;
        int m962g6 = m943a.m962g(R.styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable m711a4 = m962g6 != -1 ? c0192ak2.m711a(context, m962g6) : null;
        int m962g7 = m943a.m962g(R.styleable.AppCompatTextView_drawableEndCompat, -1);
        Drawable m711a5 = m962g7 != -1 ? c0192ak2.m711a(context, m962g7) : null;
        if (Build.VERSION.SDK_INT >= 17 && (m711a4 != null || m711a5 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1165a.getCompoundDrawablesRelative();
            TextView textView = this.f1165a;
            if (m711a4 == null) {
                m711a4 = compoundDrawablesRelative[0];
            }
            if (m711a == null) {
                m711a = compoundDrawablesRelative[1];
            }
            if (m711a5 == null) {
                m711a5 = compoundDrawablesRelative[2];
            }
            if (m711a3 == null) {
                m711a3 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(m711a4, m711a, m711a5, m711a3);
        } else if (drawable != null || m711a != null || m711a2 != null || m711a3 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1165a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    TextView textView2 = this.f1165a;
                    Drawable drawable2 = compoundDrawablesRelative2[0];
                    if (m711a == null) {
                        m711a = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable3 = compoundDrawablesRelative2[2];
                    if (m711a3 == null) {
                        m711a3 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, m711a, drawable3, m711a3);
                }
            }
            Drawable[] compoundDrawables = this.f1165a.getCompoundDrawables();
            TextView textView3 = this.f1165a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (m711a == null) {
                m711a = compoundDrawables[1];
            }
            if (m711a2 == null) {
                m711a2 = compoundDrawables[2];
            }
            if (m711a3 == null) {
                m711a3 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, m711a, m711a2, m711a3);
        }
        if (m943a.m964i(R.styleable.AppCompatTextView_drawableTint)) {
            ColorStateList m960f = m943a.m960f(R.styleable.AppCompatTextView_drawableTint);
            TextView textView4 = this.f1165a;
            C0478i.m1620a(textView4);
            if (Build.VERSION.SDK_INT >= 23) {
                textView4.setCompoundDrawableTintList(m960f);
            } else if (textView4 instanceof InterfaceC0580r) {
                ((InterfaceC0580r) textView4).setSupportCompoundDrawablesTintList(m960f);
            }
        }
        if (m943a.m964i(R.styleable.AppCompatTextView_drawableTintMode)) {
            PorterDuff.Mode m846a = C0218bj.m846a(m943a.m946a(R.styleable.AppCompatTextView_drawableTintMode, -1), null);
            TextView textView5 = this.f1165a;
            C0478i.m1620a(textView5);
            if (Build.VERSION.SDK_INT >= 23) {
                textView5.setCompoundDrawableTintMode(m846a);
            } else if (textView5 instanceof InterfaceC0580r) {
                ((InterfaceC0580r) textView5).setSupportCompoundDrawablesTintMode(m846a);
            }
        }
        int m958e = m943a.m958e(R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int m958e2 = m943a.m958e(R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int m958e3 = m943a.m958e(R.styleable.AppCompatTextView_lineHeight, -1);
        m943a.m952b();
        if (m958e != -1) {
            C0577o.m2051b(this.f1165a, m958e);
        }
        if (m958e2 != -1) {
            C0577o.m2054c(this.f1165a, m958e2);
        }
        if (m958e3 != -1) {
            C0577o.m2055d(this.f1165a, m958e3);
        }
    }

    /* renamed from: a */
    public final void m772a(Typeface typeface) {
        if (this.f1177m) {
            this.f1165a.setTypeface(typeface);
            this.f1176l = typeface;
        }
    }

    /* renamed from: a */
    public final void m774a(Runnable runnable) {
        this.f1165a.post(runnable);
    }

    /* renamed from: a */
    private void m762a(Context context, C0276dn c0276dn) {
        String m956d;
        this.f1174j = c0276dn.m946a(R.styleable.TextAppearance_android_textStyle, this.f1174j);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1175k = c0276dn.m946a(R.styleable.TextAppearance_android_textFontWeight, -1);
            if (this.f1175k != -1) {
                this.f1174j = (this.f1174j & 2) | 0;
            }
        }
        if (c0276dn.m964i(R.styleable.TextAppearance_android_fontFamily) || c0276dn.m964i(R.styleable.TextAppearance_fontFamily)) {
            this.f1176l = null;
            int i = c0276dn.m964i(R.styleable.TextAppearance_fontFamily) ? R.styleable.TextAppearance_fontFamily : R.styleable.TextAppearance_android_fontFamily;
            int i2 = this.f1175k;
            int i3 = this.f1174j;
            if (!context.isRestricted()) {
                try {
                    Typeface m947a = c0276dn.m947a(i, this.f1174j, new C0212bd(this, i2, i3));
                    if (m947a != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.f1175k != -1) {
                            this.f1176l = Typeface.create(Typeface.create(m947a, 0), this.f1175k, (this.f1174j & 2) != 0);
                        } else {
                            this.f1176l = m947a;
                        }
                    }
                    this.f1177m = this.f1176l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1176l != null || (m956d = c0276dn.m956d(i)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && this.f1175k != -1) {
                this.f1176l = Typeface.create(Typeface.create(m956d, 0), this.f1175k, (this.f1174j & 2) != 0);
                return;
            } else {
                this.f1176l = Typeface.create(m956d, this.f1174j);
                return;
            }
        }
        if (c0276dn.m964i(R.styleable.TextAppearance_android_typeface)) {
            this.f1177m = false;
            switch (c0276dn.m946a(R.styleable.TextAppearance_android_typeface, 1)) {
                case 1:
                    this.f1176l = Typeface.SANS_SERIF;
                    return;
                case 2:
                    this.f1176l = Typeface.SERIF;
                    return;
                case 3:
                    this.f1176l = Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public final void m769a(Context context, int i) {
        String m956d;
        ColorStateList m960f;
        C0276dn m942a = C0276dn.m942a(context, i, R.styleable.TextAppearance);
        if (m942a.m964i(R.styleable.TextAppearance_textAllCaps)) {
            m775a(m942a.m949a(R.styleable.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && m942a.m964i(R.styleable.TextAppearance_android_textColor) && (m960f = m942a.m960f(R.styleable.TextAppearance_android_textColor)) != null) {
            this.f1165a.setTextColor(m960f);
        }
        if (m942a.m964i(R.styleable.TextAppearance_android_textSize) && m942a.m958e(R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.f1165a.setTextSize(0, 0.0f);
        }
        m762a(context, m942a);
        if (Build.VERSION.SDK_INT >= 26 && m942a.m964i(R.styleable.TextAppearance_fontVariationSettings) && (m956d = m942a.m956d(R.styleable.TextAppearance_fontVariationSettings)) != null) {
            this.f1165a.setFontVariationSettings(m956d);
        }
        m942a.m952b();
        if (this.f1176l != null) {
            this.f1165a.setTypeface(this.f1176l, this.f1174j);
        }
    }

    /* renamed from: a */
    public final void m775a(boolean z) {
        this.f1165a.setAllCaps(z);
    }

    /* renamed from: a */
    public final void m765a() {
        m777b();
    }

    /* renamed from: b */
    public final void m777b() {
        if (this.f1166b != null || this.f1167c != null || this.f1168d != null || this.f1169e != null) {
            Drawable[] compoundDrawables = this.f1165a.getCompoundDrawables();
            m763a(compoundDrawables[0], this.f1166b);
            m763a(compoundDrawables[1], this.f1167c);
            m763a(compoundDrawables[2], this.f1168d);
            m763a(compoundDrawables[3], this.f1169e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1170f == null && this.f1171g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1165a.getCompoundDrawablesRelative();
            m763a(compoundDrawablesRelative[0], this.f1170f);
            m763a(compoundDrawablesRelative[2], this.f1171g);
        }
    }

    /* renamed from: a */
    private void m763a(Drawable drawable, C0274dl c0274dl) {
        if (drawable == null || c0274dl == null) {
            return;
        }
        C0192ak.m708a(drawable, c0274dl, this.f1165a.getDrawableState());
    }

    /* renamed from: a */
    private static C0274dl m761a(Context context, C0192ak c0192ak, int i) {
        ColorStateList m714c = c0192ak.m714c(context, i);
        if (m714c == null) {
            return null;
        }
        C0274dl c0274dl = new C0274dl();
        c0274dl.f1364d = true;
        c0274dl.f1361a = m714c;
        return c0274dl;
    }

    /* renamed from: c */
    public final void m778c() {
        if (InterfaceC0566d.f2511d) {
            return;
        }
        this.f1173i.m815f();
    }

    /* renamed from: a */
    public final void m767a(int i, float f) {
        if (InterfaceC0566d.f2511d || this.f1173i.m816g()) {
            return;
        }
        this.f1173i.m807a(i, f);
    }

    /* renamed from: d */
    public final void m779d() {
        this.f1173i.m815f();
    }

    /* renamed from: e */
    public final boolean m780e() {
        return this.f1173i.m816g();
    }

    /* renamed from: a */
    public final void m766a(int i) {
        this.f1173i.m806a(i);
    }

    /* renamed from: a */
    public final void m768a(int i, int i2, int i3, int i4) {
        this.f1173i.m808a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final void m776a(int[] iArr, int i) {
        this.f1173i.m810a(iArr, i);
    }

    /* renamed from: f */
    public final int m781f() {
        return this.f1173i.m805a();
    }

    /* renamed from: g */
    public final int m782g() {
        return this.f1173i.m811b();
    }

    /* renamed from: h */
    public final int m783h() {
        return this.f1173i.m812c();
    }

    /* renamed from: i */
    public final int m784i() {
        return this.f1173i.m813d();
    }

    /* renamed from: j */
    public final int[] m785j() {
        return this.f1173i.m814e();
    }

    /* renamed from: k */
    public final ColorStateList m786k() {
        if (this.f1172h != null) {
            return this.f1172h.f1361a;
        }
        return null;
    }

    /* renamed from: a */
    public final void m770a(ColorStateList colorStateList) {
        if (this.f1172h == null) {
            this.f1172h = new C0274dl();
        }
        this.f1172h.f1361a = colorStateList;
        this.f1172h.f1364d = colorStateList != null;
        m764m();
    }

    /* renamed from: l */
    public final PorterDuff.Mode m787l() {
        if (this.f1172h != null) {
            return this.f1172h.f1362b;
        }
        return null;
    }

    /* renamed from: a */
    public final void m771a(PorterDuff.Mode mode) {
        if (this.f1172h == null) {
            this.f1172h = new C0274dl();
        }
        this.f1172h.f1362b = mode;
        this.f1172h.f1363c = mode != null;
        m764m();
    }

    /* renamed from: m */
    private void m764m() {
        this.f1166b = this.f1172h;
        this.f1167c = this.f1172h;
        this.f1168d = this.f1172h;
        this.f1169e = this.f1172h;
        this.f1170f = this.f1172h;
        this.f1171g = this.f1172h;
    }
}
