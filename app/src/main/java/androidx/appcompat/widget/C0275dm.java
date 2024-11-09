package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources.java */
/* renamed from: androidx.appcompat.widget.dm */
/* loaded from: classes.dex */
final class C0275dm extends C0245cj {

    /* renamed from: a */
    private final WeakReference<Context> f1365a;

    public C0275dm(Context context, Resources resources) {
        super(resources);
        this.f1365a = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.C0245cj, android.content.res.Resources
    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f1365a.get();
        if (drawable != null && context != null) {
            C0238cc.m886a().m896a(context, i, drawable);
        }
        return drawable;
    }
}
