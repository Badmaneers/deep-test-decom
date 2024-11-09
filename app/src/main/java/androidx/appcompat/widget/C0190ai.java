package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.core.p024g.C0538w;

/* compiled from: AppCompatBackgroundHelper.java */
/* renamed from: androidx.appcompat.widget.ai */
/* loaded from: classes.dex */
public final class C0190ai {

    /* renamed from: a */
    private final View f1105a;

    /* renamed from: d */
    private C0274dl f1108d;

    /* renamed from: e */
    private C0274dl f1109e;

    /* renamed from: f */
    private C0274dl f1110f;

    /* renamed from: c */
    private int f1107c = -1;

    /* renamed from: b */
    private final C0192ak f1106b = C0192ak.m709b();

    public C0190ai(View view) {
        this.f1105a = view;
    }

    /* renamed from: a */
    public final void m694a(AttributeSet attributeSet, int i) {
        C0276dn m944a = C0276dn.m944a(this.f1105a.getContext(), attributeSet, R.styleable.ViewBackgroundHelper, i, 0);
        try {
            if (m944a.m964i(R.styleable.ViewBackgroundHelper_android_background)) {
                this.f1107c = m944a.m962g(R.styleable.ViewBackgroundHelper_android_background, -1);
                ColorStateList m714c = this.f1106b.m714c(this.f1105a.getContext(), this.f1107c);
                if (m714c != null) {
                    m688b(m714c);
                }
            }
            if (m944a.m964i(R.styleable.ViewBackgroundHelper_backgroundTint)) {
                C0538w.m1842a(this.f1105a, m944a.m960f(R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (m944a.m964i(R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                C0538w.m1844a(this.f1105a, C0218bj.m846a(m944a.m946a(R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            m944a.m952b();
        }
    }

    /* renamed from: a */
    public final void m691a(int i) {
        this.f1107c = i;
        m688b(this.f1106b != null ? this.f1106b.m714c(this.f1105a.getContext(), i) : null);
        m697d();
    }

    /* renamed from: a */
    public final void m690a() {
        this.f1107c = -1;
        m688b(null);
        m697d();
    }

    /* renamed from: a */
    public final void m692a(ColorStateList colorStateList) {
        if (this.f1109e == null) {
            this.f1109e = new C0274dl();
        }
        this.f1109e.f1361a = colorStateList;
        this.f1109e.f1364d = true;
        m697d();
    }

    /* renamed from: b */
    public final ColorStateList m695b() {
        if (this.f1109e != null) {
            return this.f1109e.f1361a;
        }
        return null;
    }

    /* renamed from: a */
    public final void m693a(PorterDuff.Mode mode) {
        if (this.f1109e == null) {
            this.f1109e = new C0274dl();
        }
        this.f1109e.f1362b = mode;
        this.f1109e.f1363c = true;
        m697d();
    }

    /* renamed from: c */
    public final PorterDuff.Mode m696c() {
        if (this.f1109e != null) {
            return this.f1109e.f1362b;
        }
        return null;
    }

    /* renamed from: d */
    public final void m697d() {
        Drawable background = this.f1105a.getBackground();
        if (background != null) {
            if (m689e() && m687a(background)) {
                return;
            }
            if (this.f1109e != null) {
                C0192ak.m708a(background, this.f1109e, this.f1105a.getDrawableState());
            } else if (this.f1108d != null) {
                C0192ak.m708a(background, this.f1108d, this.f1105a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    private void m688b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1108d == null) {
                this.f1108d = new C0274dl();
            }
            this.f1108d.f1361a = colorStateList;
            this.f1108d.f1364d = true;
        } else {
            this.f1108d = null;
        }
        m697d();
    }

    /* renamed from: e */
    private boolean m689e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1108d != null : i == 21;
    }

    /* renamed from: a */
    private boolean m687a(Drawable drawable) {
        if (this.f1110f == null) {
            this.f1110f = new C0274dl();
        }
        C0274dl c0274dl = this.f1110f;
        c0274dl.m941a();
        ColorStateList m1896y = C0538w.m1896y(this.f1105a);
        if (m1896y != null) {
            c0274dl.f1364d = true;
            c0274dl.f1361a = m1896y;
        }
        PorterDuff.Mode m1897z = C0538w.m1897z(this.f1105a);
        if (m1897z != null) {
            c0274dl.f1363c = true;
            c0274dl.f1362b = m1897z;
        }
        if (!c0274dl.f1364d && !c0274dl.f1363c) {
            return false;
        }
        C0192ak.m708a(drawable, c0274dl, this.f1105a.getDrawableState());
        return true;
    }
}
