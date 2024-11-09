package com.coloros.anim.p061e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.coloros.anim.C1638a;
import com.coloros.anim.p052a.p054b.C1670i;
import com.coloros.anim.p063g.C1815c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KeyframesParser.java */
/* renamed from: com.coloros.anim.e.r */
/* loaded from: classes.dex */
final class C1795r {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> List<C1815c<T>> m5851a(JsonReader jsonReader, C1638a c1638a, float f, InterfaceC1778ag<T> interfaceC1778ag) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            c1638a.m5462a("EffectiveAnimation doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 107 && nextName.equals("k")) {
                c = 0;
            }
            if (c == 0) {
                if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == JsonToken.NUMBER) {
                        arrayList.add(C1794q.m5847a(jsonReader, c1638a, f, interfaceC1778ag, false));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(C1794q.m5847a(jsonReader, c1638a, f, interfaceC1778ag, true));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(C1794q.m5847a(jsonReader, c1638a, f, interfaceC1778ag, false));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        m5852a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static <T> void m5852a(List<? extends C1815c<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C1815c<T> c1815c = list.get(i2);
            i2++;
            C1815c<T> c1815c2 = list.get(i2);
            c1815c.f8426e = Float.valueOf(c1815c2.f8424c);
            if (c1815c.f8425d == null && c1815c2.f8422a != null) {
                c1815c.f8425d = c1815c2.f8422a;
                if (c1815c instanceof C1670i) {
                    ((C1670i) c1815c).m5528a();
                }
            }
        }
        C1815c<T> c1815c3 = list.get(i);
        if ((c1815c3.f8422a == null || c1815c3.f8425d == null) && list.size() > 1) {
            list.remove(c1815c3);
        }
    }
}
