package com.coloros.anim.p055b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.coloros.anim.C1689ak;
import com.coloros.anim.InterfaceC1691am;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImageAssetManager.java */
/* renamed from: com.coloros.anim.b.b */
/* loaded from: classes.dex */
public final class C1700b {

    /* renamed from: a */
    private static final Object f8086a = new Object();

    /* renamed from: b */
    private final Context f8087b;

    /* renamed from: c */
    private final Map<String, C1689ak> f8088c;

    /* renamed from: d */
    private String f8089d;

    /* renamed from: e */
    private InterfaceC1691am f8090e;

    public C1700b(Drawable.Callback callback, String str, InterfaceC1691am interfaceC1691am, Map<String, C1689ak> map) {
        this.f8089d = str;
        if (!TextUtils.isEmpty(str) && this.f8089d.charAt(this.f8089d.length() - 1) != '/') {
            this.f8089d += '/';
        }
        if (!(callback instanceof View)) {
            Log.w("EffectiveAnimation", "EffectiveAnimationDrawable must be inside of a view for images to work.");
            this.f8088c = new HashMap();
            this.f8087b = null;
        } else {
            this.f8087b = ((View) callback).getContext();
            this.f8088c = map;
            this.f8090e = interfaceC1691am;
        }
    }

    /* renamed from: a */
    public final void m5620a(InterfaceC1691am interfaceC1691am) {
        this.f8090e = interfaceC1691am;
    }

    /* renamed from: a */
    public final Bitmap m5619a(String str) {
        C1689ak c1689ak = this.f8088c.get(str);
        if (c1689ak == null) {
            return null;
        }
        Bitmap m5560c = c1689ak.m5560c();
        if (m5560c != null) {
            return m5560c;
        }
        if (this.f8090e != null) {
            Bitmap m5561a = this.f8090e.m5561a();
            if (m5561a != null) {
                m5618a(str, m5561a);
            }
            return m5561a;
        }
        String m5559b = c1689ak.m5559b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (m5559b.startsWith("data:") && m5559b.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(m5559b.substring(m5559b.indexOf(44) + 1), 0);
                return m5618a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                Log.w("EffectiveAnimation", "data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f8089d)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with EffectiveAnimationComposition#setImagesFolder or EffectiveAnimationDrawable#setImagesFolder");
            }
            return m5618a(str, BitmapFactory.decodeStream(this.f8087b.getAssets().open(this.f8089d + m5559b), null, options));
        } catch (IOException e2) {
            Log.w("EffectiveAnimation", "Unable to open asset.", e2);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m5621a(Context context) {
        return (context == null && this.f8087b == null) || this.f8087b.equals(context);
    }

    /* renamed from: a */
    private Bitmap m5618a(String str, Bitmap bitmap) {
        synchronized (f8086a) {
            this.f8088c.get(str).m5558a(bitmap);
        }
        return bitmap;
    }
}
