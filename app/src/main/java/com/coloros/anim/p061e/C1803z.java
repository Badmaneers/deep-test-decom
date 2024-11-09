package com.coloros.anim.p061e;

import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1714l;
import com.coloros.anim.p056c.p058b.C1731n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RepeaterParser.java */
/* renamed from: com.coloros.anim.e.z */
/* loaded from: classes.dex */
public final class C1803z {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1731n m5859a(JsonReader jsonReader, C1638a c1638a) {
        char c;
        boolean z = false;
        String str = null;
        C1704b c1704b = null;
        C1704b c1704b2 = null;
        C1714l c1714l = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 99) {
                if (nextName.equals("c")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 3324) {
                if (nextName.equals("hd")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode != 3519) {
                if (hashCode == 3710 && nextName.equals("tr")) {
                    c = 3;
                }
                c = 65535;
            } else {
                if (nextName.equals("nm")) {
                    c = 0;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    c1704b = C1781d.m5819a(jsonReader, c1638a, false);
                    break;
                case 2:
                    c1704b2 = C1781d.m5819a(jsonReader, c1638a, false);
                    break;
                case 3:
                    c1714l = C1780c.m5817a(jsonReader, c1638a);
                    break;
                case 4:
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1731n(str, c1704b, c1704b2, c1714l, z);
    }
}
