package com.coloros.anim.p061e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;

/* compiled from: PointFParser.java */
/* renamed from: com.coloros.anim.e.w */
/* loaded from: classes.dex */
public final class C1800w implements InterfaceC1778ag<PointF> {

    /* renamed from: a */
    public static final C1800w f8383a = new C1800w();

    private C1800w() {
    }

    @Override // com.coloros.anim.p061e.InterfaceC1778ag
    /* renamed from: a */
    public final /* synthetic */ PointF mo5811a(JsonReader jsonReader, float f) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return C1792o.m5843b(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return C1792o.m5843b(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(peek)));
    }
}
