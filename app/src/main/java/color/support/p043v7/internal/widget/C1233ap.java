package color.support.p043v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.content.C0420a;
import androidx.core.graphics.drawable.C0546a;
import color.support.p043v7.appcompat.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: TintManager.java */
/* renamed from: color.support.v7.internal.widget.ap */
/* loaded from: classes.dex */
public final class C1233ap {

    /* renamed from: a */
    public static final boolean f5246a;

    /* renamed from: b */
    private static final PorterDuff.Mode f5247b;

    /* renamed from: c */
    private static final WeakHashMap<Context, C1233ap> f5248c;

    /* renamed from: d */
    private static final C1234aq f5249d;

    /* renamed from: e */
    private final WeakReference<Context> f5250e;

    /* renamed from: f */
    private SparseArray<ColorStateList> f5251f;

    static {
        f5246a = Build.VERSION.SDK_INT < 21;
        f5247b = PorterDuff.Mode.SRC_IN;
        f5248c = new WeakHashMap<>();
        f5249d = new C1234aq();
    }

    /* renamed from: a */
    public static C1233ap m4077a(Context context) {
        C1233ap c1233ap = f5248c.get(context);
        if (c1233ap != null) {
            return c1233ap;
        }
        C1233ap c1233ap2 = new C1233ap(context);
        f5248c.put(context, c1233ap2);
        return c1233ap2;
    }

    private C1233ap(Context context) {
        this.f5250e = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final Drawable m4078a(int i) {
        Context context = this.f5250e.get();
        if (context == null) {
            return null;
        }
        Drawable m1483a = C0420a.m1483a(context, i);
        if (m1483a == null) {
            return m1483a;
        }
        if (Build.VERSION.SDK_INT >= 8) {
            m1483a = m1483a.mutate();
        }
        Context context2 = this.f5250e.get();
        if (context2 != null) {
            r1 = this.f5251f != null ? this.f5251f.get(i) : null;
            if (r1 == null) {
                if (i == R.drawable.color_back_arrow_normal) {
                    r1 = new ColorStateList(new int[][]{C1232ao.f5236a, C1232ao.f5239d, C1232ao.f5242g}, new int[]{C1232ao.m4075b(context2, R.attr.colorTintControlDisabled), C1232ao.m4074a(context2, R.attr.colorTintControlPressed), C1232ao.m4074a(context2, R.attr.colorTintControlNormal)});
                }
                if (r1 != null) {
                    if (this.f5251f == null) {
                        this.f5251f = new SparseArray<>();
                    }
                    this.f5251f.append(i, r1);
                }
            }
        }
        if (r1 != null) {
            Drawable m1933f = C0546a.m1933f(m1483a);
            C0546a.m1922a(m1933f, r1);
            return m1933f;
        }
        this.f5250e.get();
        return m1483a;
    }
}
