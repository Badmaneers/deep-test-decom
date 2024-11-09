package com.coloros.anim.p061e;

import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1703a;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1713k;

/* compiled from: AnimatableTextPropertiesParser.java */
/* renamed from: com.coloros.anim.e.b */
/* loaded from: classes.dex */
public final class C1779b {
    /* renamed from: a */
    public static C1713k m5816a(JsonReader jsonReader, C1638a c1638a) {
        char c;
        jsonReader.beginObject();
        C1713k c1713k = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ((nextName.hashCode() == 97 && nextName.equals("a")) ? false : -1) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                C1703a c1703a = null;
                C1703a c1703a2 = null;
                C1704b c1704b = null;
                C1704b c1704b2 = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    int hashCode = nextName2.hashCode();
                    if (hashCode == 116) {
                        if (nextName2.equals("t")) {
                            c = 3;
                        }
                        c = 65535;
                    } else if (hashCode == 3261) {
                        if (nextName2.equals("fc")) {
                            c = 0;
                        }
                        c = 65535;
                    } else if (hashCode != 3664) {
                        if (hashCode == 3684 && nextName2.equals("sw")) {
                            c = 2;
                        }
                        c = 65535;
                    } else {
                        if (nextName2.equals("sc")) {
                            c = 1;
                        }
                        c = 65535;
                    }
                    switch (c) {
                        case 0:
                            c1703a = C1781d.m5828g(jsonReader, c1638a);
                            break;
                        case 1:
                            c1703a2 = C1781d.m5828g(jsonReader, c1638a);
                            break;
                        case 2:
                            c1704b = C1781d.m5818a(jsonReader, c1638a);
                            break;
                        case 3:
                            c1704b2 = C1781d.m5818a(jsonReader, c1638a);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                c1713k = new C1713k(c1703a, c1703a2, c1704b, c1704b2);
            }
        }
        jsonReader.endObject();
        return c1713k == null ? new C1713k(null, null, null, null) : c1713k;
    }
}
