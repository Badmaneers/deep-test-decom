package com.coloros.anim;

import android.content.Context;
import com.coloros.anim.p060d.C1769c;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EffectiveCompositionFactory.java */
/* renamed from: com.coloros.anim.ad */
/* loaded from: classes.dex */
public final class CallableC1682ad implements Callable<C1829u<C1638a>> {

    /* renamed from: a */
    final /* synthetic */ Context f8028a;

    /* renamed from: b */
    final /* synthetic */ String f8029b;

    public CallableC1682ad(Context context, String str) {
        this.f8028a = context;
        this.f8029b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C1829u<C1638a> call() {
        return C1769c.m5808a(this.f8028a, this.f8029b);
    }
}
