package com.coloros.anim.p061e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1708f;
import com.coloros.anim.p056c.p057a.InterfaceC1715m;
import com.coloros.anim.p056c.p058b.C1730m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RectangleShapeParser.java */
/* renamed from: com.coloros.anim.e.y */
/* loaded from: classes.dex */
public final class C1802y {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1730m m5858a(JsonReader jsonReader, C1638a c1638a) {
        char c;
        boolean z = false;
        String str = null;
        InterfaceC1715m<PointF, PointF> interfaceC1715m = null;
        C1708f c1708f = null;
        C1704b c1704b = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 112) {
                if (nextName.equals("p")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 3324) {
                if (nextName.equals("hd")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode != 3519) {
                switch (hashCode) {
                    case 114:
                        if (nextName.equals("r")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 115:
                        if (nextName.equals("s")) {
                            c = 2;
                            break;
                        }
                        break;
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
                    interfaceC1715m = C1771a.m5810b(jsonReader, c1638a);
                    break;
                case 2:
                    c1708f = C1781d.m5824c(jsonReader, c1638a);
                    break;
                case 3:
                    c1704b = C1781d.m5818a(jsonReader, c1638a);
                    break;
                case 4:
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1730m(str, interfaceC1715m, c1708f, c1704b, z);
    }
}
