package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import androidx.core.content.p020a.AbstractC0432l;
import androidx.core.content.p020a.C0425e;
import androidx.core.content.p020a.C0427g;
import androidx.core.content.p020a.InterfaceC0424d;
import androidx.core.p021d.C0440b;
import androidx.core.p021d.C0446h;
import androidx.p011b.C0324g;

/* compiled from: TypefaceCompat.java */
@SuppressLint({"NewApi"})
/* renamed from: androidx.core.graphics.e */
/* loaded from: classes.dex */
public final class C0552e {

    /* renamed from: a */
    private static final C0558k f2425a;

    /* renamed from: b */
    private static final C0324g<String, Typeface> f2426b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2425a = new C0557j();
        } else if (Build.VERSION.SDK_INT >= 28) {
            f2425a = new C0556i();
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2425a = new C0555h();
        } else if (Build.VERSION.SDK_INT >= 24 && C0554g.m1956a()) {
            f2425a = new C0554g();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f2425a = new C0553f();
        } else {
            f2425a = new C0558k();
        }
        f2426b = new C0324g<>(16);
    }

    /* renamed from: a */
    public static Typeface m1946a(Resources resources, int i, int i2) {
        return f2426b.m1045a((C0324g<String, Typeface>) m1947b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m1947b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: a */
    public static Typeface m1944a(Context context, InterfaceC0424d interfaceC0424d, Resources resources, int i, int i2, AbstractC0432l abstractC0432l, boolean z) {
        Typeface mo1953a;
        if (interfaceC0424d instanceof C0427g) {
            C0427g c0427g = (C0427g) interfaceC0424d;
            boolean z2 = true;
            if (!z ? abstractC0432l != null : c0427g.m1517b() != 0) {
                z2 = false;
            }
            mo1953a = C0440b.m1559a(context, c0427g.m1516a(), abstractC0432l, null, z2, z ? c0427g.m1518c() : -1, i2);
        } else {
            mo1953a = f2425a.mo1953a(context, (C0425e) interfaceC0424d, resources, i2);
            if (abstractC0432l != null) {
                if (mo1953a != null) {
                    abstractC0432l.m1533a(mo1953a, (Handler) null);
                } else {
                    abstractC0432l.m1532a(-3, (Handler) null);
                }
            }
        }
        if (mo1953a != null) {
            f2426b.m1046a(m1947b(resources, i, i2), mo1953a);
        }
        return mo1953a;
    }

    /* renamed from: a */
    public static Typeface m1942a(Context context, Resources resources, int i, String str, int i2) {
        Typeface mo1965a = f2425a.mo1965a(context, resources, i, str, i2);
        if (mo1965a != null) {
            f2426b.m1046a(m1947b(resources, i, i2), mo1965a);
        }
        return mo1965a;
    }

    /* renamed from: a */
    public static Typeface m1945a(Context context, C0446h[] c0446hArr, int i) {
        return f2425a.mo1954a(context, c0446hArr, i);
    }

    /* renamed from: a */
    public static Typeface m1943a(Context context, Typeface typeface, int i) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        if (Build.VERSION.SDK_INT < 21) {
            C0425e m1972a = f2425a.m1972a(typeface);
            Typeface mo1953a = m1972a == null ? null : f2425a.mo1953a(context, m1972a, context.getResources(), i);
            if (mo1953a != null) {
                return mo1953a;
            }
        }
        return Typeface.create(typeface, i);
    }
}
