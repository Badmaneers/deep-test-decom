package com.google.android.material.p072a;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty.java */
/* renamed from: com.google.android.material.a.e */
/* loaded from: classes.dex */
public final class C2036e extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f8980a = new C2036e();

    /* renamed from: b */
    private final WeakHashMap<Drawable, Integer> f8981b;

    @Override // android.util.Property
    public final /* synthetic */ Integer get(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable2.getAlpha());
        }
        if (this.f8981b.containsKey(drawable2)) {
            return this.f8981b.get(drawable2);
        }
        return 255;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Drawable drawable, Integer num) {
        Drawable drawable2 = drawable;
        Integer num2 = num;
        if (Build.VERSION.SDK_INT < 19) {
            this.f8981b.put(drawable2, num2);
        }
        drawable2.setAlpha(num2.intValue());
    }

    private C2036e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f8981b = new WeakHashMap<>();
    }
}
