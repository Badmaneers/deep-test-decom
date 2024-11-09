package com.coloros.anim;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EffectiveCompositionFactory.java */
/* renamed from: com.coloros.anim.ag */
/* loaded from: classes.dex */
public final class CallableC1685ag implements Callable<C1829u<C1638a>> {

    /* renamed from: a */
    final /* synthetic */ Context f8032a;

    /* renamed from: b */
    final /* synthetic */ String f8033b;

    public CallableC1685ag(Context context, String str) {
        this.f8032a = context;
        this.f8033b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C1829u<C1638a> call() {
        return C1681ac.m5555c(this.f8032a, this.f8033b);
    }
}
