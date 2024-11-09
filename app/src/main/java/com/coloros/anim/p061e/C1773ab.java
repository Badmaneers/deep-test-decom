package com.coloros.anim.p061e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.coloros.anim.p056c.C1702a;
import com.coloros.anim.p056c.p058b.C1732o;
import com.coloros.anim.p062f.C1810f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeDataParser.java */
/* renamed from: com.coloros.anim.e.ab */
/* loaded from: classes.dex */
public final class C1773ab implements InterfaceC1778ag<C1732o> {

    /* renamed from: a */
    public static final C1773ab f8373a = new C1773ab();

    private C1773ab() {
    }

    @Override // com.coloros.anim.p061e.InterfaceC1778ag
    /* renamed from: a */
    public final /* synthetic */ C1732o mo5811a(JsonReader jsonReader, float f) {
        char c;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 99) {
                if (nextName.equals("c")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode == 105) {
                if (nextName.equals("i")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 111) {
                if (hashCode == 118 && nextName.equals("v")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (nextName.equals("o")) {
                    c = 3;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    z = jsonReader.nextBoolean();
                    break;
                case 1:
                    list = C1792o.m5841a(jsonReader, f);
                    break;
                case 2:
                    list2 = C1792o.m5841a(jsonReader, f);
                    break;
                case 3:
                    list3 = C1792o.m5841a(jsonReader, f);
                    break;
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new C1732o(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = list.get(i);
            int i2 = i - 1;
            arrayList.add(new C1702a(C1810f.m5896a(list.get(i2), list3.get(i2)), C1810f.m5896a(pointF2, list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = list.get(0);
            int i3 = size - 1;
            arrayList.add(new C1702a(C1810f.m5896a(list.get(i3), list3.get(i3)), C1810f.m5896a(pointF3, list2.get(0)), pointF3));
        }
        return new C1732o(pointF, z, arrayList);
    }
}
