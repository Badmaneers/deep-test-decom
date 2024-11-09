package com.coloros.anim.p061e;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;

/* compiled from: ColorParser.java */
/* renamed from: com.coloros.anim.e.f */
/* loaded from: classes.dex */
public final class C1783f implements InterfaceC1778ag<Integer> {

    /* renamed from: a */
    public static final C1783f f8374a = new C1783f();

    private C1783f() {
    }

    @Override // com.coloros.anim.p061e.InterfaceC1778ag
    /* renamed from: a */
    public final /* synthetic */ Integer mo5811a(JsonReader jsonReader, float f) {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        double nextDouble = jsonReader.nextDouble();
        double nextDouble2 = jsonReader.nextDouble();
        double nextDouble3 = jsonReader.nextDouble();
        double nextDouble4 = jsonReader.nextDouble();
        if (z) {
            jsonReader.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d && nextDouble4 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            nextDouble4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
