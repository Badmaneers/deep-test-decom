package com.coloros.anim.p061e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.coloros.anim.p063g.C1816d;

/* compiled from: ScaleXYParser.java */
/* renamed from: com.coloros.anim.e.aa */
/* loaded from: classes.dex */
public final class C1772aa implements InterfaceC1778ag<C1816d> {

    /* renamed from: a */
    public static final C1772aa f8372a = new C1772aa();

    private C1772aa() {
    }

    @Override // com.coloros.anim.p061e.InterfaceC1778ag
    /* renamed from: a */
    public final /* synthetic */ C1816d mo5811a(JsonReader jsonReader, float f) {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new C1816d((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
