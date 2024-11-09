package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: VectorEnabledTintResources.java */
/* renamed from: androidx.appcompat.widget.ed */
/* loaded from: classes.dex */
public final class C0293ed extends Resources {

    /* renamed from: a */
    private static boolean f1419a = false;

    /* renamed from: b */
    private final WeakReference<Context> f1420b;

    public C0293ed(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1420b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i) {
        Context context = this.f1420b.get();
        if (context != null) {
            return C0238cc.m886a().m893a(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable m985a(int i) {
        return super.getDrawable(i);
    }

    /* renamed from: a */
    public static boolean m984a() {
        return f1419a && Build.VERSION.SDK_INT <= 20;
    }
}
