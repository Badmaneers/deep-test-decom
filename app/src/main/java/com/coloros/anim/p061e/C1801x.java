package com.coloros.anim.p061e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.InterfaceC1715m;
import com.coloros.anim.p056c.p058b.C1728k;
import com.coloros.anim.p056c.p058b.EnumC1729l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PolystarShapeParser.java */
/* renamed from: com.coloros.anim.e.x */
/* loaded from: classes.dex */
public final class C1801x {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1728k m5857a(JsonReader jsonReader, C1638a c1638a) {
        char c;
        boolean z = false;
        String str = null;
        EnumC1729l enumC1729l = null;
        C1704b c1704b = null;
        InterfaceC1715m<PointF, PointF> interfaceC1715m = null;
        C1704b c1704b2 = null;
        C1704b c1704b3 = null;
        C1704b c1704b4 = null;
        C1704b c1704b5 = null;
        C1704b c1704b6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals("p")) {
                        c = 3;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3555:
                    if (nextName.equals("or")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    enumC1729l = EnumC1729l.m5692a(jsonReader.nextInt());
                    break;
                case 2:
                    c1704b = C1781d.m5819a(jsonReader, c1638a, false);
                    break;
                case 3:
                    interfaceC1715m = C1771a.m5810b(jsonReader, c1638a);
                    break;
                case 4:
                    c1704b2 = C1781d.m5819a(jsonReader, c1638a, false);
                    break;
                case 5:
                    c1704b4 = C1781d.m5818a(jsonReader, c1638a);
                    break;
                case 6:
                    c1704b6 = C1781d.m5819a(jsonReader, c1638a, false);
                    break;
                case 7:
                    c1704b3 = C1781d.m5818a(jsonReader, c1638a);
                    break;
                case '\b':
                    c1704b5 = C1781d.m5819a(jsonReader, c1638a, false);
                    break;
                case '\t':
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1728k(str, enumC1729l, c1704b, interfaceC1715m, c1704b2, c1704b3, c1704b4, c1704b5, c1704b6, z);
    }
}
