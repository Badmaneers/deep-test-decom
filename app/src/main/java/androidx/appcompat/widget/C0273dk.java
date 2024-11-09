package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper.java */
/* renamed from: androidx.appcompat.widget.dk */
/* loaded from: classes.dex */
public final class C0273dk extends ContextWrapper {

    /* renamed from: a */
    private static final Object f1357a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0273dk>> f1358b;

    /* renamed from: c */
    private final Resources f1359c;

    /* renamed from: d */
    private final Resources.Theme f1360d;

    private C0273dk(Context context) {
        super(context);
        if (C0293ed.m984a()) {
            this.f1359c = new C0293ed(this, context.getResources());
            this.f1360d = this.f1359c.newTheme();
            this.f1360d.setTo(context.getTheme());
        } else {
            this.f1359c = new C0275dm(this, context.getResources());
            this.f1360d = null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return this.f1360d == null ? super.getTheme() : this.f1360d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f1360d == null) {
            super.setTheme(i);
        } else {
            this.f1360d.applyStyle(i, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.f1359c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.f1359c.getAssets();
    }

    /* renamed from: a */
    public static Context m940a(Context context) {
        boolean z = false;
        if (!(context instanceof C0273dk) && !(context.getResources() instanceof C0275dm) && !(context.getResources() instanceof C0293ed) && (Build.VERSION.SDK_INT < 21 || C0293ed.m984a())) {
            z = true;
        }
        if (!z) {
            return context;
        }
        synchronized (f1357a) {
            if (f1358b == null) {
                f1358b = new ArrayList<>();
            } else {
                for (int size = f1358b.size() - 1; size >= 0; size--) {
                    WeakReference<C0273dk> weakReference = f1358b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1358b.remove(size);
                    }
                }
                for (int size2 = f1358b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0273dk> weakReference2 = f1358b.get(size2);
                    C0273dk c0273dk = weakReference2 != null ? weakReference2.get() : null;
                    if (c0273dk != null && c0273dk.getBaseContext() == context) {
                        return c0273dk;
                    }
                }
            }
            C0273dk c0273dk2 = new C0273dk(context);
            f1358b.add(new WeakReference<>(c0273dk2));
            return c0273dk2;
        }
    }
}
