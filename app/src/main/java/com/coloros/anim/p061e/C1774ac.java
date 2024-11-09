package com.coloros.anim.p061e;

import android.graphics.Path;
import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1703a;
import com.coloros.anim.p056c.p057a.C1706d;
import com.coloros.anim.p056c.p058b.C1733p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeFillParser.java */
/* renamed from: com.coloros.anim.e.ac */
/* loaded from: classes.dex */
public final class C1774ac {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1733p m5812a(JsonReader jsonReader, C1638a c1638a) {
        char c;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        C1703a c1703a = null;
        C1706d c1706d = null;
        int i = 1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == -396065730) {
                if (nextName.equals("fillEnabled")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode == 99) {
                if (nextName.equals("c")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 114) {
                if (nextName.equals("r")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode != 3324) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
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
                    str = jsonReader.nextString();
                    break;
                case 1:
                    c1703a = C1781d.m5828g(jsonReader, c1638a);
                    break;
                case 2:
                    c1706d = C1781d.m5823b(jsonReader, c1638a);
                    break;
                case 3:
                    z = jsonReader.nextBoolean();
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    break;
                case 5:
                    z2 = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1733p(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c1703a, c1706d, z2);
    }
}
