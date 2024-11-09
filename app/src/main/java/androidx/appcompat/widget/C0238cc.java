package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.graphics.drawable.C0546a;
import androidx.p011b.C0318a;
import androidx.p011b.C0323f;
import androidx.p011b.C0329o;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourceManagerInternal.java */
/* renamed from: androidx.appcompat.widget.cc */
/* loaded from: classes.dex */
public final class C0238cc {

    /* renamed from: b */
    private static C0238cc f1275b;

    /* renamed from: d */
    private WeakHashMap<Context, C0329o<ColorStateList>> f1277d;

    /* renamed from: e */
    private C0318a<String, InterfaceC0242cg> f1278e;

    /* renamed from: f */
    private C0329o<String> f1279f;

    /* renamed from: g */
    private final WeakHashMap<Context, C0323f<WeakReference<Drawable.ConstantState>>> f1280g = new WeakHashMap<>(0);

    /* renamed from: h */
    private TypedValue f1281h;

    /* renamed from: i */
    private boolean f1282i;

    /* renamed from: j */
    private InterfaceC0243ch f1283j;

    /* renamed from: a */
    private static final PorterDuff.Mode f1274a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static final C0241cf f1276c = new C0241cf();

    /* renamed from: a */
    public static synchronized C0238cc m886a() {
        C0238cc c0238cc;
        synchronized (C0238cc.class) {
            if (f1275b == null) {
                C0238cc c0238cc2 = new C0238cc();
                f1275b = c0238cc2;
                if (Build.VERSION.SDK_INT < 24) {
                    c0238cc2.m888a("vector", new C0244ci());
                    c0238cc2.m888a("animated-vector", new C0240ce());
                    c0238cc2.m888a("animated-selector", new C0239cd());
                }
            }
            c0238cc = f1275b;
        }
        return c0238cc;
    }

    /* renamed from: a */
    public final synchronized void m895a(InterfaceC0243ch interfaceC0243ch) {
        this.f1283j = interfaceC0243ch;
    }

    /* renamed from: a */
    public final synchronized Drawable m891a(Context context, int i) {
        return m892a(context, i, false);
    }

    /* renamed from: a */
    public final synchronized void m894a(Context context) {
        C0323f<WeakReference<Drawable.ConstantState>> c0323f = this.f1280g.get(context);
        if (c0323f != null) {
            c0323f.m1043d();
        }
    }

    /* renamed from: a */
    private static long m881a(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: a */
    private Drawable m884a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m897b = m897b(context, i);
        if (m897b != null) {
            if (C0218bj.m849c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m1933f = C0546a.m1933f(drawable);
            C0546a.m1922a(m1933f, m897b);
            PorterDuff.Mode m882a = m882a(i);
            if (m882a == null) {
                return m1933f;
            }
            C0546a.m1925a(m1933f, m882a);
            return m1933f;
        }
        if ((this.f1283j == null || !this.f1283j.mo721a(context, i, drawable)) && !m896a(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: c */
    private Drawable m890c(Context context, int i) {
        int next;
        if (this.f1278e == null || this.f1278e.isEmpty()) {
            return null;
        }
        if (this.f1279f != null) {
            String m1067a = this.f1279f.m1067a(i);
            if ("appcompat_skip_skip".equals(m1067a) || (m1067a != null && this.f1278e.get(m1067a) == null)) {
                return null;
            }
        } else {
            this.f1279f = new C0329o<>();
        }
        if (this.f1281h == null) {
            this.f1281h = new TypedValue();
        }
        TypedValue typedValue = this.f1281h;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long m881a = m881a(typedValue);
        Drawable m885a = m885a(context, m881a);
        if (m885a != null) {
            return m885a;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1279f.m1074c(i, name);
                InterfaceC0242cg interfaceC0242cg = this.f1278e.get(name);
                if (interfaceC0242cg != null) {
                    m885a = interfaceC0242cg.mo898a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m885a != null) {
                    m885a.setChangingConfigurations(typedValue.changingConfigurations);
                    m889a(context, m881a, m885a);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (m885a == null) {
            this.f1279f.m1074c(i, "appcompat_skip_skip");
        }
        return m885a;
    }

    /* renamed from: a */
    private synchronized Drawable m885a(Context context, long j) {
        C0323f<WeakReference<Drawable.ConstantState>> c0323f = this.f1280g.get(context);
        if (c0323f == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m1032a = c0323f.m1032a(j);
        if (m1032a != null) {
            Drawable.ConstantState constantState = m1032a.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c0323f.m1037b(j);
        }
        return null;
    }

    /* renamed from: a */
    private synchronized boolean m889a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0323f<WeakReference<Drawable.ConstantState>> c0323f = this.f1280g.get(context);
        if (c0323f == null) {
            c0323f = new C0323f<>();
            this.f1280g.put(context, c0323f);
        }
        c0323f.m1038b(j, new WeakReference<>(constantState));
        return true;
    }

    /* renamed from: a */
    public final synchronized Drawable m893a(Context context, C0293ed c0293ed, int i) {
        Drawable m890c = m890c(context, i);
        if (m890c == null) {
            m890c = c0293ed.m985a(i);
        }
        if (m890c == null) {
            return null;
        }
        return m884a(context, i, false, m890c);
    }

    /* renamed from: a */
    public final boolean m896a(Context context, int i, Drawable drawable) {
        return this.f1283j != null && this.f1283j.mo722b(context, i, drawable);
    }

    /* renamed from: a */
    private void m888a(String str, InterfaceC0242cg interfaceC0242cg) {
        if (this.f1278e == null) {
            this.f1278e = new C0318a<>();
        }
        this.f1278e.put(str, interfaceC0242cg);
    }

    /* renamed from: a */
    private PorterDuff.Mode m882a(int i) {
        if (this.f1283j == null) {
            return null;
        }
        return this.f1283j.mo719a(i);
    }

    /* renamed from: a */
    public static void m887a(Drawable drawable, C0274dl c0274dl, int[] iArr) {
        if (C0218bj.m849c(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (c0274dl.f1364d || c0274dl.f1363c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = c0274dl.f1364d ? c0274dl.f1361a : null;
            PorterDuff.Mode mode = c0274dl.f1363c ? c0274dl.f1362b : f1274a;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = m883a(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m883a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m900a;
        synchronized (C0238cc.class) {
            m900a = f1276c.m900a(i, mode);
            if (m900a == null) {
                m900a = new PorterDuffColorFilter(i, mode);
                f1276c.m901a(i, mode, m900a);
            }
        }
        return m900a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable m892a(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f1282i     // Catch: java.lang.Throwable -> L84
            r1 = 1
            if (r0 != 0) goto L36
            r4.f1282i = r1     // Catch: java.lang.Throwable -> L84
            int r0 = androidx.appcompat.resources.R.drawable.abc_vector_test     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r0 = r4.m891a(r5, r0)     // Catch: java.lang.Throwable -> L84
            r2 = 0
            if (r0 == 0) goto L2c
            boolean r3 = r0 instanceof androidx.vectordrawable.p039a.p040a.C1081m     // Catch: java.lang.Throwable -> L84
            if (r3 != 0) goto L28
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L84
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = r2
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 == 0) goto L2c
            goto L36
        L2c:
            r4.f1282i = r2     // Catch: java.lang.Throwable -> L84
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L84
            throw r5     // Catch: java.lang.Throwable -> L84
        L36:
            android.graphics.drawable.Drawable r0 = r4.m890c(r5, r6)     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L71
            android.util.TypedValue r0 = r4.f1281h     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L47
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L84
            r0.<init>()     // Catch: java.lang.Throwable -> L84
            r4.f1281h = r0     // Catch: java.lang.Throwable -> L84
        L47:
            android.util.TypedValue r0 = r4.f1281h     // Catch: java.lang.Throwable -> L84
            android.content.res.Resources r2 = r5.getResources()     // Catch: java.lang.Throwable -> L84
            r2.getValue(r6, r0, r1)     // Catch: java.lang.Throwable -> L84
            long r1 = m881a(r0)     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r3 = r4.m885a(r5, r1)     // Catch: java.lang.Throwable -> L84
            if (r3 != 0) goto L70
            androidx.appcompat.widget.ch r3 = r4.f1283j     // Catch: java.lang.Throwable -> L84
            if (r3 != 0) goto L60
            r3 = 0
            goto L66
        L60:
            androidx.appcompat.widget.ch r3 = r4.f1283j     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r3 = r3.mo720a(r4, r5, r6)     // Catch: java.lang.Throwable -> L84
        L66:
            if (r3 == 0) goto L70
            int r0 = r0.changingConfigurations     // Catch: java.lang.Throwable -> L84
            r3.setChangingConfigurations(r0)     // Catch: java.lang.Throwable -> L84
            r4.m889a(r5, r1, r3)     // Catch: java.lang.Throwable -> L84
        L70:
            r0 = r3
        L71:
            if (r0 != 0) goto L77
            android.graphics.drawable.Drawable r0 = androidx.core.content.C0420a.m1483a(r5, r6)     // Catch: java.lang.Throwable -> L84
        L77:
            if (r0 == 0) goto L7d
            android.graphics.drawable.Drawable r0 = r4.m884a(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L84
        L7d:
            if (r0 == 0) goto L82
            androidx.appcompat.widget.C0218bj.m848b(r0)     // Catch: java.lang.Throwable -> L84
        L82:
            monitor-exit(r4)
            return r0
        L84:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0238cc.m892a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    public final synchronized ColorStateList m897b(Context context, int i) {
        ColorStateList m1067a;
        C0329o<ColorStateList> c0329o;
        m1067a = (this.f1277d == null || (c0329o = this.f1277d.get(context)) == null) ? null : c0329o.m1067a(i);
        if (m1067a == null) {
            m1067a = this.f1283j != null ? this.f1283j.mo718a(context, i) : null;
            if (m1067a != null) {
                if (this.f1277d == null) {
                    this.f1277d = new WeakHashMap<>();
                }
                C0329o<ColorStateList> c0329o2 = this.f1277d.get(context);
                if (c0329o2 == null) {
                    c0329o2 = new C0329o<>();
                    this.f1277d.put(context, c0329o2);
                }
                c0329o2.m1074c(i, m1067a);
            }
        }
        return m1067a;
    }
}
