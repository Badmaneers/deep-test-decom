package com.coloros.anim.p061e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1708f;
import com.coloros.anim.p056c.p057a.InterfaceC1715m;
import com.coloros.anim.p056c.p058b.C1718a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CircleShapeParser.java */
/* renamed from: com.coloros.anim.e.e */
/* loaded from: classes.dex */
public final class C1782e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1718a m5829a(JsonReader jsonReader, C1638a c1638a, int i) {
        char c;
        boolean z = i == 3;
        boolean z2 = false;
        String str = null;
        InterfaceC1715m<PointF, PointF> interfaceC1715m = null;
        C1708f c1708f = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 100) {
                if (nextName.equals("d")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode == 112) {
                if (nextName.equals("p")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 115) {
                if (nextName.equals("s")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 3324) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (nextName.equals("hd")) {
                    c = 3;
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
                    z2 = jsonReader.nextBoolean();
                    break;
                case 4:
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1718a(str, interfaceC1715m, c1708f, z, z2);
    }
}
