package com.coloros.anim.p055b;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.coloros.anim.C1690al;
import com.coloros.anim.p056c.C1765j;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager.java */
/* renamed from: com.coloros.anim.b.a */
/* loaded from: classes.dex */
public final class C1699a {

    /* renamed from: d */
    private final AssetManager f8083d;

    /* renamed from: e */
    private C1690al f8084e;

    /* renamed from: a */
    private final C1765j<String> f8080a = new C1765j<>();

    /* renamed from: b */
    private final Map<C1765j<String>, Typeface> f8081b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f8082c = new HashMap();

    /* renamed from: f */
    private String f8085f = ".ttf";

    public C1699a(Drawable.Callback callback, C1690al c1690al) {
        this.f8084e = c1690al;
        if (!(callback instanceof View)) {
            Log.w("EffectiveAnimation", "EffectiveAnimationDrawable must be inside of a view for images to work.");
            this.f8083d = null;
        } else {
            this.f8083d = ((View) callback).getContext().getAssets();
        }
    }

    /* renamed from: a */
    public final void m5617a(C1690al c1690al) {
        this.f8084e = c1690al;
    }

    /* renamed from: a */
    public final Typeface m5616a(String str, String str2) {
        this.f8080a.m5801a(str, str2);
        Typeface typeface = this.f8081b.get(this.f8080a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = this.f8082c.get(str);
        if (typeface2 == null) {
            typeface2 = Typeface.createFromAsset(this.f8083d, "fonts/" + str + this.f8085f);
            this.f8082c.put(str, typeface2);
        }
        int i = 0;
        boolean contains = str2.contains("Italic");
        boolean contains2 = str2.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        }
        if (typeface2.getStyle() != i) {
            typeface2 = Typeface.create(typeface2, i);
        }
        this.f8081b.put(this.f8080a, typeface2);
        return typeface2;
    }
}
