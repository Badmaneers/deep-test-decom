package com.coloros.anim;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EffectiveCompositionFactory.java */
/* renamed from: com.coloros.anim.ah */
/* loaded from: classes.dex */
public final class CallableC1686ah implements Callable<C1829u<C1638a>> {

    /* renamed from: a */
    final /* synthetic */ Context f8034a;

    /* renamed from: b */
    final /* synthetic */ int f8035b;

    public CallableC1686ah(Context context, int i) {
        this.f8034a = context;
        this.f8035b = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C1829u<C1638a> call() {
        return C1681ac.m5551b(this.f8034a, this.f8035b);
    }
}
