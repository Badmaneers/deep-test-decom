package com.coloros.anim.p061e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.coloros.anim.C1638a;
import com.coloros.anim.p052a.p054b.C1670i;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1707e;
import com.coloros.anim.p056c.p057a.C1711i;
import com.coloros.anim.p056c.p057a.InterfaceC1715m;
import com.coloros.anim.p062f.C1811g;
import com.coloros.anim.p063g.C1815c;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* renamed from: com.coloros.anim.e.a */
/* loaded from: classes.dex */
public final class C1771a {
    /* renamed from: a */
    public static C1707e m5809a(JsonReader jsonReader, C1638a c1638a) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(new C1670i(c1638a, C1794q.m5847a(jsonReader, c1638a, C1811g.m5901a(), C1799v.f8382a, jsonReader.peek() == JsonToken.BEGIN_OBJECT)));
            }
            jsonReader.endArray();
            C1795r.m5852a(arrayList);
        } else {
            arrayList.add(new C1815c(C1792o.m5843b(jsonReader, C1811g.m5901a())));
        }
        return new C1707e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0042. Please report as an issue. */
    /* renamed from: b */
    public static InterfaceC1715m<PointF, PointF> m5810b(JsonReader jsonReader, C1638a c1638a) {
        char c;
        jsonReader.beginObject();
        C1707e c1707e = null;
        C1704b c1704b = null;
        C1704b c1704b2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != 107) {
                switch (hashCode) {
                    case 120:
                        if (nextName.equals("x")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 121:
                        if (nextName.equals("y")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                c = 65535;
            } else {
                if (nextName.equals("k")) {
                    c = 0;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    c1707e = m5809a(jsonReader, c1638a);
                    break;
                case 1:
                    if (jsonReader.peek() != JsonToken.STRING) {
                        c1704b = C1781d.m5818a(jsonReader, c1638a);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                case 2:
                    if (jsonReader.peek() != JsonToken.STRING) {
                        c1704b2 = C1781d.m5818a(jsonReader, c1638a);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            c1638a.m5462a("EffectiveAnimation doesn't support expressions.");
        }
        return c1707e != null ? c1707e : new C1711i(c1704b, c1704b2);
    }
}
