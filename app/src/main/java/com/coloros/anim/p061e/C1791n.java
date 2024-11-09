package com.coloros.anim.p061e;

import android.util.JsonReader;

/* compiled from: IntegerParser.java */
/* renamed from: com.coloros.anim.e.n */
/* loaded from: classes.dex */
public final class C1791n implements InterfaceC1778ag<Integer> {

    /* renamed from: a */
    public static final C1791n f8378a = new C1791n();

    private C1791n() {
    }

    @Override // com.coloros.anim.p061e.InterfaceC1778ag
    /* renamed from: a */
    public final /* synthetic */ Integer mo5811a(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(C1792o.m5842b(jsonReader) * f));
    }
}
