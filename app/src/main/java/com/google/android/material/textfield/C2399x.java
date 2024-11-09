package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.p024g.C0538w;
import androidx.core.widget.C0577o;
import com.google.android.material.R;
import com.google.android.material.p072a.C2032a;
import com.google.android.material.p072a.C2033b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndicatorViewController.java */
/* renamed from: com.google.android.material.textfield.x */
/* loaded from: classes.dex */
public final class C2399x {

    /* renamed from: a */
    private final Context f10576a;

    /* renamed from: b */
    private final TextInputLayout f10577b;

    /* renamed from: c */
    private LinearLayout f10578c;

    /* renamed from: d */
    private int f10579d;

    /* renamed from: e */
    private FrameLayout f10580e;

    /* renamed from: f */
    private int f10581f;

    /* renamed from: g */
    private Animator f10582g;

    /* renamed from: h */
    private final float f10583h;

    /* renamed from: i */
    private int f10584i;

    /* renamed from: j */
    private int f10585j;

    /* renamed from: k */
    private CharSequence f10586k;

    /* renamed from: l */
    private boolean f10587l;

    /* renamed from: m */
    private TextView f10588m;

    /* renamed from: n */
    private CharSequence f10589n;

    /* renamed from: o */
    private int f10590o;

    /* renamed from: p */
    private ColorStateList f10591p;

    /* renamed from: q */
    private CharSequence f10592q;

    /* renamed from: r */
    private boolean f10593r;

    /* renamed from: s */
    private TextView f10594s;

    /* renamed from: t */
    private int f10595t;

    /* renamed from: u */
    private ColorStateList f10596u;

    /* renamed from: v */
    private Typeface f10597v;

    /* renamed from: c */
    private static boolean m7662c(int i) {
        return i == 0 || i == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Animator m7652a(C2399x c2399x) {
        c2399x.f10582g = null;
        return null;
    }

    public C2399x(TextInputLayout textInputLayout) {
        this.f10576a = textInputLayout.getContext();
        this.f10577b = textInputLayout;
        this.f10583h = this.f10576a.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7670a(CharSequence charSequence) {
        m7664l();
        this.f10592q = charSequence;
        this.f10594s.setText(charSequence);
        if (this.f10584i != 2) {
            this.f10585j = 2;
        }
        m7656a(this.f10584i, this.f10585j, m7660a(this.f10594s, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7676b(CharSequence charSequence) {
        m7664l();
        this.f10586k = charSequence;
        this.f10588m.setText(charSequence);
        if (this.f10584i != 1) {
            this.f10585j = 1;
        }
        m7656a(this.f10584i, this.f10585j, m7660a(this.f10588m, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7665a() {
        this.f10586k = null;
        m7664l();
        if (this.f10584i == 1) {
            if (this.f10593r && !TextUtils.isEmpty(this.f10592q)) {
                this.f10585j = 2;
            } else {
                this.f10585j = 0;
            }
        }
        m7656a(this.f10584i, this.f10585j, m7660a(this.f10588m, (CharSequence) null));
    }

    /* renamed from: a */
    private boolean m7660a(TextView textView, CharSequence charSequence) {
        if (C0538w.m1819C(this.f10577b) && this.f10577b.isEnabled()) {
            return (this.f10585j == this.f10584i && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* renamed from: a */
    private void m7656a(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f10582g = animatorSet;
            ArrayList arrayList = new ArrayList();
            m7659a(arrayList, this.f10593r, this.f10594s, 2, i, i2);
            m7659a(arrayList, this.f10587l, this.f10588m, 1, i, i2);
            C2033b.m6242a(animatorSet, arrayList);
            animatorSet.addListener(new C2400y(this, i2, m7663d(i), i, m7663d(i2)));
            animatorSet.start();
        } else {
            m7655a(i, i2);
        }
        this.f10577b.m7613b();
        this.f10577b.m7611a(z);
        this.f10577b.m7615d();
    }

    /* renamed from: a */
    private void m7655a(int i, int i2) {
        TextView m7663d;
        TextView m7663d2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m7663d2 = m7663d(i2)) != null) {
            m7663d2.setVisibility(0);
            m7663d2.setAlpha(1.0f);
        }
        if (i != 0 && (m7663d = m7663d(i)) != null) {
            m7663d.setVisibility(4);
            if (i == 1) {
                m7663d.setText((CharSequence) null);
            }
        }
        this.f10584i = i2;
    }

    /* renamed from: a */
    private void m7659a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            list.add(m7654a(textView, i3 == i));
            if (i3 == i) {
                list.add(m7653a(textView));
            }
        }
    }

    /* renamed from: a */
    private static ObjectAnimator m7654a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C2032a.f8973a);
        return ofFloat;
    }

    /* renamed from: a */
    private ObjectAnimator m7653a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f10583h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C2032a.f8976d);
        return ofFloat;
    }

    /* renamed from: l */
    private void m7664l() {
        if (this.f10582g != null) {
            this.f10582g.cancel();
        }
    }

    /* renamed from: d */
    private TextView m7663d(int i) {
        switch (i) {
            case 1:
                return this.f10588m;
            case 2:
                return this.f10594s;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7669a(TextView textView, int i) {
        if (this.f10578c == null && this.f10580e == null) {
            this.f10578c = new LinearLayout(this.f10576a);
            this.f10578c.setOrientation(0);
            this.f10577b.addView(this.f10578c, -1, -2);
            this.f10580e = new FrameLayout(this.f10576a);
            this.f10578c.addView(this.f10580e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f10577b.getEditText() != null) {
                m7672b();
            }
        }
        if (m7662c(i)) {
            this.f10580e.setVisibility(0);
            this.f10580e.addView(textView);
            this.f10581f++;
        } else {
            this.f10578c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f10578c.setVisibility(0);
        this.f10579d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7675b(TextView textView, int i) {
        if (this.f10578c == null) {
            return;
        }
        if (m7662c(i) && this.f10580e != null) {
            this.f10581f--;
            m7657a(this.f10580e, this.f10581f);
            this.f10580e.removeView(textView);
        } else {
            this.f10578c.removeView(textView);
        }
        this.f10579d--;
        m7657a(this.f10578c, this.f10579d);
    }

    /* renamed from: a */
    private static void m7657a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7671a(boolean z) {
        if (this.f10587l == z) {
            return;
        }
        m7664l();
        if (z) {
            this.f10588m = new AppCompatTextView(this.f10576a);
            this.f10588m.setId(R.id.textinput_error);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f10588m.setTextAlignment(5);
            }
            if (this.f10597v != null) {
                this.f10588m.setTypeface(this.f10597v);
            }
            m7666a(this.f10590o);
            m7667a(this.f10591p);
            m7678c(this.f10589n);
            this.f10588m.setVisibility(4);
            C0538w.m1882k(this.f10588m);
            m7669a(this.f10588m, 0);
        } else {
            m7665a();
            m7675b(this.f10588m, 0);
            this.f10588m = null;
            this.f10577b.m7613b();
            this.f10577b.m7615d();
        }
        this.f10587l = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m7679c() {
        return this.f10587l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m7680d() {
        return this.f10593r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7677b(boolean z) {
        if (this.f10593r == z) {
            return;
        }
        m7664l();
        if (z) {
            this.f10594s = new AppCompatTextView(this.f10576a);
            this.f10594s.setId(R.id.textinput_helper_text);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f10594s.setTextAlignment(5);
            }
            if (this.f10597v != null) {
                this.f10594s.setTypeface(this.f10597v);
            }
            this.f10594s.setVisibility(4);
            C0538w.m1882k(this.f10594s);
            m7673b(this.f10595t);
            m7674b(this.f10596u);
            m7669a(this.f10594s, 1);
        } else {
            m7664l();
            if (this.f10584i == 2) {
                this.f10585j = 0;
            }
            m7656a(this.f10584i, this.f10585j, m7660a(this.f10594s, (CharSequence) null));
            m7675b(this.f10594s, 1);
            this.f10594s = null;
            this.f10577b.m7613b();
            this.f10577b.m7615d();
        }
        this.f10593r = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m7681e() {
        return (this.f10585j != 1 || this.f10588m == null || TextUtils.isEmpty(this.f10586k)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final CharSequence m7682f() {
        return this.f10586k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final CharSequence m7683g() {
        return this.f10592q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7668a(Typeface typeface) {
        if (typeface != this.f10597v) {
            this.f10597v = typeface;
            m7658a(this.f10588m, typeface);
            m7658a(this.f10594s, typeface);
        }
    }

    /* renamed from: a */
    private static void m7658a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final int m7684h() {
        if (this.f10588m != null) {
            return this.f10588m.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final ColorStateList m7685i() {
        if (this.f10588m != null) {
            return this.f10588m.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7667a(ColorStateList colorStateList) {
        this.f10591p = colorStateList;
        if (this.f10588m == null || colorStateList == null) {
            return;
        }
        this.f10588m.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7666a(int i) {
        this.f10590o = i;
        if (this.f10588m != null) {
            this.f10577b.m7608a(this.f10588m, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m7678c(CharSequence charSequence) {
        this.f10589n = charSequence;
        if (this.f10588m != null) {
            this.f10588m.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final CharSequence m7686j() {
        return this.f10589n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final int m7687k() {
        if (this.f10594s != null) {
            return this.f10594s.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7674b(ColorStateList colorStateList) {
        this.f10596u = colorStateList;
        if (this.f10594s == null || colorStateList == null) {
            return;
        }
        this.f10594s.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7673b(int i) {
        this.f10595t = i;
        if (this.f10594s != null) {
            C0577o.m2048a(this.f10594s, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7672b() {
        if ((this.f10578c == null || this.f10577b.getEditText() == null) ? false : true) {
            C0538w.m1863b(this.f10578c, C0538w.m1883l(this.f10577b.getEditText()), 0, C0538w.m1884m(this.f10577b.getEditText()), 0);
        }
    }
}
