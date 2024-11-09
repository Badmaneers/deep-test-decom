package com.color.support.widget;

import com.coloros.neton.BuildConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.dj */
/* loaded from: classes.dex */
public final class RunnableC1449dj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1441db f7092a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1449dj(C1441db c1441db) {
        this.f7092a = c1441db;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        ColorSearchView colorSearchView;
        InterfaceC1455dp interfaceC1455dp;
        InterfaceC1455dp unused;
        ColorSearchViewAnimate.m4689g(this.f7092a.f7077a);
        atomicBoolean = this.f7092a.f7080d;
        atomicBoolean.set(false);
        colorSearchView = this.f7092a.f7077a.f6469d;
        colorSearchView.setQuery$609c24db(BuildConfig.FLAVOR);
        interfaceC1455dp = this.f7092a.f7077a.f6476k;
        if (interfaceC1455dp != null) {
            unused = this.f7092a.f7077a.f6476k;
        }
    }
}
