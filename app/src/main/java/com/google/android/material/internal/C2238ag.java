package com.google.android.material.internal;

import android.content.Context;
import android.text.TextPaint;
import com.google.android.material.p079h.AbstractC2226i;
import com.google.android.material.p079h.C2222e;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* renamed from: com.google.android.material.internal.ag */
/* loaded from: classes.dex */
public final class C2238ag {

    /* renamed from: c */
    private float f9925c;

    /* renamed from: e */
    private WeakReference<InterfaceC2240ai> f9927e;

    /* renamed from: f */
    private C2222e f9928f;

    /* renamed from: a */
    private final TextPaint f9923a = new TextPaint(1);

    /* renamed from: b */
    private final AbstractC2226i f9924b = new C2239ah(this);

    /* renamed from: d */
    private boolean f9926d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m7086a(C2238ag c2238ag) {
        c2238ag.f9926d = true;
        return true;
    }

    public C2238ag(InterfaceC2240ai interfaceC2240ai) {
        this.f9927e = new WeakReference<>(null);
        this.f9927e = new WeakReference<>(interfaceC2240ai);
    }

    /* renamed from: a */
    public final TextPaint m7089a() {
        return this.f9923a;
    }

    /* renamed from: b */
    public final void m7092b() {
        this.f9926d = true;
    }

    /* renamed from: a */
    public final float m7088a(String str) {
        if (!this.f9926d) {
            return this.f9925c;
        }
        this.f9925c = str == null ? 0.0f : this.f9923a.measureText((CharSequence) str, 0, str.length());
        this.f9926d = false;
        return this.f9925c;
    }

    /* renamed from: c */
    public final C2222e m7093c() {
        return this.f9928f;
    }

    /* renamed from: a */
    public final void m7091a(C2222e c2222e, Context context) {
        if (this.f9928f != c2222e) {
            this.f9928f = c2222e;
            if (c2222e != null) {
                c2222e.m7060b(context, this.f9923a, this.f9924b);
                InterfaceC2240ai interfaceC2240ai = this.f9927e.get();
                if (interfaceC2240ai != null) {
                    this.f9923a.drawableState = interfaceC2240ai.getState();
                }
                c2222e.m7057a(context, this.f9923a, this.f9924b);
                this.f9926d = true;
            }
            InterfaceC2240ai interfaceC2240ai2 = this.f9927e.get();
            if (interfaceC2240ai2 != null) {
                interfaceC2240ai2.mo6359b();
                interfaceC2240ai2.onStateChange(interfaceC2240ai2.getState());
            }
        }
    }

    /* renamed from: a */
    public final void m7090a(Context context) {
        this.f9928f.m7057a(context, this.f9923a, this.f9924b);
    }
}
