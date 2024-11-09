package com.coloros.anim;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: EffectiveAnimationTask.java */
/* renamed from: com.coloros.anim.x */
/* loaded from: classes.dex */
public final class C1832x<T> extends FutureTask<C1829u<T>> {

    /* renamed from: a */
    final /* synthetic */ C1830v f8490a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1832x(C1830v c1830v, Callable<C1829u<T>> callable) {
        super(callable);
        this.f8490a = c1830v;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.f8490a.m5927a((C1829u) get());
        } catch (InterruptedException | ExecutionException e) {
            this.f8490a.m5927a(new C1829u(e));
        }
    }
}
