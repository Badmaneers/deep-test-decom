package com.coloros.anim.p061e;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonUtils.java */
/* renamed from: com.coloros.anim.e.o */
/* loaded from: classes.dex */
final class C1792o {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5840a(JsonReader jsonReader) {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<PointF> m5841a(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(m5843b(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static PointF m5843b(JsonReader jsonReader, float f) {
        switch (C1793p.f8379a[jsonReader.peek().ordinal()]) {
            case 1:
                return m5844c(jsonReader, f);
            case 2:
                return m5845d(jsonReader, f);
            case 3:
                return m5846e(jsonReader, f);
            default:
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
        }
    }

    /* renamed from: c */
    private static PointF m5844c(JsonReader jsonReader, float f) {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    /* renamed from: d */
    private static PointF m5845d(JsonReader jsonReader, float f) {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0014. Please report as an issue. */
    /* renamed from: e */
    private static PointF m5846e(JsonReader jsonReader, float f) {
        jsonReader.beginObject();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 120:
                    if (nextName.equals("x")) {
                        c = 0;
                        break;
                    }
                    break;
                case 121:
                    if (nextName.equals("y")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    f2 = m5842b(jsonReader);
                    break;
                case 1:
                    f3 = m5842b(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m5842b(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        switch (C1793p.f8379a[peek.ordinal()]) {
            case 1:
                return (float) jsonReader.nextDouble();
            case 2:
                jsonReader.beginArray();
                float nextDouble = (float) jsonReader.nextDouble();
                while (jsonReader.hasNext()) {
                    jsonReader.skipValue();
                }
                jsonReader.endArray();
                return nextDouble;
            default:
                throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(peek)));
        }
    }
}
