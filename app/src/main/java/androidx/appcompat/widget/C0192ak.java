package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: AppCompatDrawableManager.java */
/* renamed from: androidx.appcompat.widget.ak */
/* loaded from: classes.dex */
public final class C0192ak {

    /* renamed from: a */
    private static final PorterDuff.Mode f1117a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0192ak f1118b;

    /* renamed from: c */
    private C0238cc f1119c;

    /* renamed from: a */
    public static synchronized void m707a() {
        synchronized (C0192ak.class) {
            if (f1118b == null) {
                C0192ak c0192ak = new C0192ak();
                f1118b = c0192ak;
                c0192ak.f1119c = C0238cc.m886a();
                f1118b.f1119c.m895a(new C0193al());
            }
        }
    }

    /* renamed from: b */
    public static synchronized C0192ak m709b() {
        C0192ak c0192ak;
        synchronized (C0192ak.class) {
            if (f1118b == null) {
                m707a();
            }
            c0192ak = f1118b;
        }
        return c0192ak;
    }

    /* renamed from: a */
    public final synchronized Drawable m711a(Context context, int i) {
        return this.f1119c.m891a(context, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized Drawable m713b(Context context, int i) {
        return this.f1119c.m892a(context, i, true);
    }

    /* renamed from: a */
    public final synchronized void m712a(Context context) {
        this.f1119c.m894a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized ColorStateList m714c(Context context, int i) {
        return this.f1119c.m897b(context, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m708a(Drawable drawable, C0274dl c0274dl, int[] iArr) {
        C0238cc.m887a(drawable, c0274dl, iArr);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m706a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m883a;
        synchronized (C0192ak.class) {
            m883a = C0238cc.m883a(i, mode);
        }
        return m883a;
    }
}
