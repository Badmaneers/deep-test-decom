package com.coloros.anim;

import android.util.JsonReader;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EffectiveCompositionFactory.java */
/* renamed from: com.coloros.anim.ai */
/* loaded from: classes.dex */
public final class CallableC1687ai implements Callable<C1829u<C1638a>> {

    /* renamed from: a */
    final /* synthetic */ JsonReader f8036a;

    /* renamed from: b */
    final /* synthetic */ String f8037b = null;

    public CallableC1687ai(JsonReader jsonReader) {
        this.f8036a = jsonReader;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C1829u<C1638a> call() {
        return C1681ac.m5541a(this.f8036a, this.f8037b);
    }
}
