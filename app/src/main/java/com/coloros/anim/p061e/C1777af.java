package com.coloros.anim.p061e;

import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p058b.C1740w;
import com.coloros.anim.p056c.p058b.C1741x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeTrimPathParser.java */
/* renamed from: com.coloros.anim.e.af */
/* loaded from: classes.dex */
public final class C1777af {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1740w m5815a(JsonReader jsonReader, C1638a c1638a) {
        char c;
        String str = null;
        C1704b c1704b = null;
        C1704b c1704b2 = null;
        C1704b c1704b3 = null;
        int i = 0;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 101) {
                if (nextName.equals("e")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 109) {
                if (nextName.equals("m")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 115) {
                if (nextName.equals("s")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 3324) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 3;
                }
                c = 65535;
            } else {
                if (nextName.equals("hd")) {
                    c = 5;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    c1704b = C1781d.m5819a(jsonReader, c1638a, false);
                    break;
                case 1:
                    c1704b2 = C1781d.m5819a(jsonReader, c1638a, false);
                    break;
                case 2:
                    c1704b3 = C1781d.m5819a(jsonReader, c1638a, false);
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    i = C1741x.m5736a(jsonReader.nextInt());
                    break;
                case 5:
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1740w(str, i, c1704b, c1704b2, c1704b3, z);
    }
}
