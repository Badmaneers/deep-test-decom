package com.coloros.anim.p061e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1706d;
import com.coloros.anim.p056c.p057a.C1707e;
import com.coloros.anim.p056c.p057a.C1709g;
import com.coloros.anim.p056c.p057a.C1711i;
import com.coloros.anim.p056c.p057a.C1714l;
import com.coloros.anim.p056c.p057a.InterfaceC1715m;
import com.coloros.anim.p063g.C1815c;
import com.coloros.anim.p063g.C1816d;

/* compiled from: AnimatableTransformParser.java */
/* renamed from: com.coloros.anim.e.c */
/* loaded from: classes.dex */
public final class C1780c {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C1714l m5817a(JsonReader jsonReader, C1638a c1638a) {
        char c;
        boolean z = false;
        boolean z2 = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z2) {
            jsonReader.beginObject();
        }
        C1704b c1704b = null;
        C1707e c1707e = null;
        InterfaceC1715m<PointF, PointF> interfaceC1715m = null;
        C1709g c1709g = null;
        C1704b c1704b2 = null;
        C1704b c1704b3 = null;
        C1706d c1706d = null;
        C1704b c1704b4 = null;
        C1704b c1704b5 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case 97:
                    if (nextName.equals("a")) {
                        c = 0;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 5;
                        break;
                    }
                    break;
                case 112:
                    if (nextName.equals("p")) {
                        c = 1;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        c = 4;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3242:
                    if (nextName.equals("eo")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3656:
                    if (nextName.equals("rz")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3662:
                    if (nextName.equals("sa")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3672:
                    if (nextName.equals("sk")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3676:
                    if (nextName.equals("so")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("k")) {
                            c1707e = C1771a.m5809a(jsonReader, c1638a);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case 1:
                    interfaceC1715m = C1771a.m5810b(jsonReader, c1638a);
                    continue;
                case 2:
                    c1709g = C1781d.m5825d(jsonReader, c1638a);
                    continue;
                case 3:
                    c1638a.m5462a("EffectiveAnimation doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    c1706d = C1781d.m5823b(jsonReader, c1638a);
                    continue;
                case 6:
                    c1704b4 = C1781d.m5819a(jsonReader, c1638a, false);
                    continue;
                case 7:
                    c1704b5 = C1781d.m5819a(jsonReader, c1638a, false);
                    continue;
                case '\b':
                    c1704b2 = C1781d.m5819a(jsonReader, c1638a, false);
                    continue;
                case '\t':
                    c1704b3 = C1781d.m5819a(jsonReader, c1638a, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            C1704b m5819a = C1781d.m5819a(jsonReader, c1638a, false);
            if (m5819a.mo5630c().isEmpty()) {
                m5819a.mo5630c().add(new C1815c(c1638a, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c1638a.m5472h())));
            } else if (((C1815c) m5819a.mo5630c().get(0)).f8422a == 0) {
                m5819a.mo5630c().set(0, new C1815c(c1638a, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c1638a.m5472h())));
            }
            c1704b = m5819a;
        }
        if (z2) {
            jsonReader.endObject();
        }
        C1707e c1707e2 = c1707e == null || (c1707e.mo5629b() && c1707e.mo5630c().get(0).f8422a.equals(0.0f, 0.0f)) ? null : c1707e;
        InterfaceC1715m<PointF, PointF> interfaceC1715m2 = interfaceC1715m == null || (!(interfaceC1715m instanceof C1711i) && interfaceC1715m.mo5629b() && interfaceC1715m.mo5630c().get(0).f8422a.equals(0.0f, 0.0f)) ? null : interfaceC1715m;
        C1704b c1704b6 = c1704b == null || (c1704b.mo5629b() && (((Float) ((C1815c) c1704b.mo5630c().get(0)).f8422a).floatValue() > 0.0f ? 1 : (((Float) ((C1815c) c1704b.mo5630c().get(0)).f8422a).floatValue() == 0.0f ? 0 : -1)) == 0) ? null : c1704b;
        C1709g c1709g2 = c1709g == null || (c1709g.mo5629b() && ((C1816d) ((C1815c) c1709g.mo5630c().get(0)).f8422a).m5923c()) ? null : c1709g;
        C1704b c1704b7 = c1704b2 == null || (c1704b2.mo5629b() && (((Float) ((C1815c) c1704b2.mo5630c().get(0)).f8422a).floatValue() > 0.0f ? 1 : (((Float) ((C1815c) c1704b2.mo5630c().get(0)).f8422a).floatValue() == 0.0f ? 0 : -1)) == 0) ? null : c1704b2;
        if (c1704b3 == null || (c1704b3.mo5629b() && ((Float) ((C1815c) c1704b3.mo5630c().get(0)).f8422a).floatValue() == 0.0f)) {
            z = true;
        }
        return new C1714l(c1707e2, interfaceC1715m2, c1709g2, c1704b6, c1706d, c1704b4, c1704b5, c1704b7, z ? null : c1704b3);
    }
}
