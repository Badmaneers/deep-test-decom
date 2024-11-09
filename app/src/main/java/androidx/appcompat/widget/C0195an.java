package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.widget.C0571i;
import androidx.core.widget.InterfaceC0581s;

/* compiled from: AppCompatImageHelper.java */
/* renamed from: androidx.appcompat.widget.an */
/* loaded from: classes.dex */
public final class C0195an {

    /* renamed from: a */
    private final ImageView f1126a;

    /* renamed from: b */
    private C0274dl f1127b;

    /* renamed from: c */
    private C0274dl f1128c;

    /* renamed from: d */
    private C0274dl f1129d;

    public C0195an(ImageView imageView) {
        this.f1126a = imageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m729a(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int m962g;
        C0276dn m944a = C0276dn.m944a(this.f1126a.getContext(), attributeSet, R.styleable.AppCompatImageView, i, 0);
        try {
            Drawable drawable3 = this.f1126a.getDrawable();
            if (drawable3 == null && (m962g = m944a.m962g(R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable3 = C0057a.m46b(this.f1126a.getContext(), m962g)) != null) {
                this.f1126a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                C0218bj.m848b(drawable3);
            }
            if (m944a.m964i(R.styleable.AppCompatImageView_tint)) {
                ImageView imageView = this.f1126a;
                ColorStateList m960f = m944a.m960f(R.styleable.AppCompatImageView_tint);
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView.setImageTintList(m960f);
                    if (Build.VERSION.SDK_INT == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView.getDrawableState());
                        }
                        imageView.setImageDrawable(drawable2);
                    }
                } else if (imageView instanceof InterfaceC0581s) {
                    ((InterfaceC0581s) imageView).setSupportImageTintList(m960f);
                }
            }
            if (m944a.m964i(R.styleable.AppCompatImageView_tintMode)) {
                ImageView imageView2 = this.f1126a;
                PorterDuff.Mode m846a = C0218bj.m846a(m944a.m946a(R.styleable.AppCompatImageView_tintMode, -1), null);
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView2.setImageTintMode(m846a);
                    if (Build.VERSION.SDK_INT == 21 && (drawable = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                        if (drawable.isStateful()) {
                            drawable.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable);
                    }
                } else if (imageView2 instanceof InterfaceC0581s) {
                    ((InterfaceC0581s) imageView2).setSupportImageTintMode(m846a);
                }
            }
        } finally {
            m944a.m952b();
        }
    }

    /* renamed from: a */
    public final void m726a(int i) {
        if (i != 0) {
            Drawable m46b = C0057a.m46b(this.f1126a.getContext(), i);
            if (m46b != null) {
                C0218bj.m848b(m46b);
            }
            this.f1126a.setImageDrawable(m46b);
        } else {
            this.f1126a.setImageDrawable(null);
        }
        m733d();
    }

    /* renamed from: a */
    public final boolean m730a() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1126a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: a */
    public final void m727a(ColorStateList colorStateList) {
        if (this.f1128c == null) {
            this.f1128c = new C0274dl();
        }
        this.f1128c.f1361a = colorStateList;
        this.f1128c.f1364d = true;
        m733d();
    }

    /* renamed from: b */
    public final ColorStateList m731b() {
        if (this.f1128c != null) {
            return this.f1128c.f1361a;
        }
        return null;
    }

    /* renamed from: a */
    public final void m728a(PorterDuff.Mode mode) {
        if (this.f1128c == null) {
            this.f1128c = new C0274dl();
        }
        this.f1128c.f1362b = mode;
        this.f1128c.f1363c = true;
        m733d();
    }

    /* renamed from: c */
    public final PorterDuff.Mode m732c() {
        if (this.f1128c != null) {
            return this.f1128c.f1362b;
        }
        return null;
    }

    /* renamed from: d */
    public final void m733d() {
        Drawable drawable = this.f1126a.getDrawable();
        if (drawable != null) {
            C0218bj.m848b(drawable);
        }
        if (drawable != null) {
            if (m725e() && m724a(drawable)) {
                return;
            }
            if (this.f1128c != null) {
                C0192ak.m708a(drawable, this.f1128c, this.f1126a.getDrawableState());
            } else if (this.f1127b != null) {
                C0192ak.m708a(drawable, this.f1127b, this.f1126a.getDrawableState());
            }
        }
    }

    /* renamed from: e */
    private boolean m725e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1127b != null : i == 21;
    }

    /* renamed from: a */
    private boolean m724a(Drawable drawable) {
        if (this.f1129d == null) {
            this.f1129d = new C0274dl();
        }
        C0274dl c0274dl = this.f1129d;
        c0274dl.m941a();
        ColorStateList m2039a = C0571i.m2039a(this.f1126a);
        if (m2039a != null) {
            c0274dl.f1364d = true;
            c0274dl.f1361a = m2039a;
        }
        PorterDuff.Mode m2040b = C0571i.m2040b(this.f1126a);
        if (m2040b != null) {
            c0274dl.f1363c = true;
            c0274dl.f1362b = m2040b;
        }
        if (!c0274dl.f1364d && !c0274dl.f1363c) {
            return false;
        }
        C0192ak.m708a(drawable, c0274dl, this.f1126a.getDrawableState());
        return true;
    }
}
