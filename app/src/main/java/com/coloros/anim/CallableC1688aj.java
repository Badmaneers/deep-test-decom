package com.coloros.anim;

import java.util.concurrent.Callable;

/* compiled from: EffectiveCompositionFactory.java */
/* renamed from: com.coloros.anim.aj */
/* loaded from: classes.dex */
final class CallableC1688aj implements Callable<C1829u<C1638a>> {

    /* renamed from: a */
    final /* synthetic */ C1638a f8038a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1688aj(C1638a c1638a) {
        this.f8038a = c1638a;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C1829u<C1638a> call() {
        return new C1829u<>(this.f8038a);
    }
}
