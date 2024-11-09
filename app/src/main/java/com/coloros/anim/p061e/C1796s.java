package com.coloros.anim.p061e;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.C1692an;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1712j;
import com.coloros.anim.p056c.p057a.C1713k;
import com.coloros.anim.p056c.p057a.C1714l;
import com.coloros.anim.p056c.p058b.InterfaceC1719b;
import com.coloros.anim.p056c.p059c.C1749g;
import com.coloros.anim.p056c.p059c.EnumC1750h;
import com.coloros.anim.p056c.p059c.EnumC1751i;
import com.coloros.anim.p062f.C1811g;
import com.coloros.anim.p063g.C1815c;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: LayerParser.java */
/* renamed from: com.coloros.anim.e.s */
/* loaded from: classes.dex */
public final class C1796s {
    /* renamed from: a */
    public static C1749g m5854a(C1638a c1638a) {
        Rect m5469e = c1638a.m5469e();
        return new C1749g(Collections.emptyList(), c1638a, "__container", -1L, EnumC1750h.PRE_COMP, -1L, null, Collections.emptyList(), new C1714l(), 0, 0, 0, 0.0f, 0.0f, m5469e.width(), m5469e.height(), null, null, Collections.emptyList(), EnumC1751i.NONE, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* renamed from: a */
    public static C1749g m5853a(JsonReader jsonReader, C1638a c1638a) {
        ArrayList arrayList;
        ?? r2;
        char c;
        EnumC1751i enumC1751i = EnumC1751i.NONE;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jsonReader.beginObject();
        boolean z = false;
        EnumC1751i enumC1751i2 = enumC1751i;
        EnumC1750h enumC1750h = null;
        String str = null;
        C1714l c1714l = null;
        C1712j c1712j = null;
        C1713k c1713k = null;
        C1704b c1704b = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        long j = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        long j2 = -1;
        float f3 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        float f4 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -995424086:
                    if (nextName.equals("parent")) {
                        r2 = 4;
                        break;
                    }
                    break;
                case -903568142:
                    if (nextName.equals("shapes")) {
                        r2 = 11;
                        break;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        r2 = 17;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        r2 = 12;
                        break;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        r2 = 16;
                        break;
                    }
                    break;
                case 3177:
                    if (nextName.equals("cl")) {
                        r2 = 21;
                        break;
                    }
                    break;
                case 3233:
                    if (nextName.equals("ef")) {
                        r2 = 13;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        r2 = 22;
                        break;
                    }
                    break;
                case 3367:
                    if (nextName.equals("ip")) {
                        r2 = 18;
                        break;
                    }
                    break;
                case 3432:
                    if (nextName.equals("ks")) {
                        r2 = 8;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        r2 = z;
                        break;
                    }
                    break;
                case 3553:
                    if (nextName.equals("op")) {
                        r2 = 19;
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        r2 = 7;
                        break;
                    }
                    break;
                case 3669:
                    if (nextName.equals("sh")) {
                        r2 = 6;
                        break;
                    }
                    break;
                case 3679:
                    if (nextName.equals("sr")) {
                        r2 = 14;
                        break;
                    }
                    break;
                case 3681:
                    if (nextName.equals("st")) {
                        r2 = 15;
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        r2 = 5;
                        break;
                    }
                    break;
                case 3705:
                    if (nextName.equals("tm")) {
                        r2 = 20;
                        break;
                    }
                    break;
                case 3712:
                    if (nextName.equals("tt")) {
                        r2 = 9;
                        break;
                    }
                    break;
                case 3717:
                    if (nextName.equals("ty")) {
                        r2 = 3;
                        break;
                    }
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        r2 = 1;
                        break;
                    }
                    break;
                case 108390670:
                    if (nextName.equals("refId")) {
                        r2 = 2;
                        break;
                    }
                    break;
                case 1441620890:
                    if (nextName.equals("masksProperties")) {
                        r2 = 10;
                        break;
                    }
                    break;
            }
            r2 = -1;
            switch (r2) {
                case 0:
                    str2 = jsonReader.nextString();
                    break;
                case 1:
                    j = jsonReader.nextInt();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    if (nextInt < EnumC1750h.UNKNOWN.ordinal()) {
                        enumC1750h = EnumC1750h.values()[nextInt];
                        break;
                    } else {
                        enumC1750h = EnumC1750h.UNKNOWN;
                        break;
                    }
                case 4:
                    j2 = jsonReader.nextInt();
                    break;
                case 5:
                    i = (int) (jsonReader.nextInt() * C1811g.m5901a());
                    break;
                case 6:
                    i2 = (int) (jsonReader.nextInt() * C1811g.m5901a());
                    break;
                case 7:
                    i3 = Color.parseColor(jsonReader.nextString());
                    break;
                case 8:
                    C1692an.m5562a("LayerParser::case ks: start!!!");
                    c1714l = C1780c.m5817a(jsonReader, c1638a);
                    C1692an.m5562a("LayerParser::case ks: end!!!");
                    break;
                case 9:
                    enumC1751i2 = EnumC1751i.values()[jsonReader.nextInt()];
                    c1638a.m5460a(1);
                    break;
                case 10:
                    C1692an.m5562a("LayerParser::case masksProperties: start!!!");
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList2.add(C1797t.m5855a(jsonReader, c1638a));
                    }
                    c1638a.m5460a(arrayList2.size());
                    jsonReader.endArray();
                    C1692an.m5562a("LayerParser::case masksProperties: end!!!");
                    break;
                case 11:
                    C1692an.m5562a("LayerParser::case shapes: start!!!");
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        InterfaceC1719b m5830a = C1784g.m5830a(jsonReader, c1638a);
                        if (m5830a != null) {
                            arrayList3.add(m5830a);
                        }
                    }
                    jsonReader.endArray();
                    C1692an.m5562a("LayerParser::case shapes: end!!!");
                    break;
                case 12:
                    C1692an.m5562a("LayerParser::case t: start!!!");
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != 97) {
                            if (hashCode == 100 && nextName2.equals("d")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (nextName2.equals("a")) {
                                c = 1;
                            }
                            c = 65535;
                        }
                        switch (c) {
                            case 0:
                                c1712j = C1781d.m5827f(jsonReader, c1638a);
                                break;
                            case 1:
                                jsonReader.beginArray();
                                if (jsonReader.hasNext()) {
                                    c1713k = C1779b.m5816a(jsonReader, c1638a);
                                }
                                while (jsonReader.hasNext()) {
                                    jsonReader.skipValue();
                                }
                                jsonReader.endArray();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    C1692an.m5562a("LayerParser::case t: end!!!");
                    break;
                case 13:
                    C1692an.m5562a("LayerParser::case ef: start!!!");
                    jsonReader.beginArray();
                    ArrayList arrayList4 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            if (((nextName3.hashCode() == 3519 && nextName3.equals("nm")) ? (char) 0 : (char) 65535) == 0) {
                                arrayList4.add(jsonReader.nextString());
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    c1638a.m5462a("EffectiveAnimation doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList4)));
                    C1692an.m5562a("LayerParser::case ef: end!!!");
                    break;
                case 14:
                    f3 = (float) jsonReader.nextDouble();
                    continue;
                case 15:
                    f2 = (float) jsonReader.nextDouble();
                    continue;
                case 16:
                    i4 = (int) (jsonReader.nextInt() * C1811g.m5901a());
                    continue;
                case 17:
                    i5 = (int) (jsonReader.nextInt() * C1811g.m5901a());
                    continue;
                case 18:
                    f4 = (float) jsonReader.nextDouble();
                    continue;
                case 19:
                    f = (float) jsonReader.nextDouble();
                    continue;
                case 20:
                    c1704b = C1781d.m5819a(jsonReader, c1638a, z);
                    continue;
                case 21:
                    str3 = jsonReader.nextString();
                    continue;
                case 22:
                    z2 = jsonReader.nextBoolean();
                    continue;
                default:
                    jsonReader.skipValue();
                    break;
            }
            z = false;
        }
        jsonReader.endObject();
        float f5 = f4 / f3;
        float f6 = f / f3;
        ArrayList arrayList5 = new ArrayList();
        if (f5 > 0.0f) {
            arrayList = arrayList5;
            arrayList.add(new C1815c(c1638a, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(f5)));
        } else {
            arrayList = arrayList5;
        }
        if (f6 <= 0.0f) {
            f6 = c1638a.m5472h();
        }
        arrayList.add(new C1815c(c1638a, Float.valueOf(1.0f), Float.valueOf(1.0f), null, f5, Float.valueOf(f6)));
        arrayList.add(new C1815c(c1638a, Float.valueOf(0.0f), Float.valueOf(0.0f), null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            c1638a.m5462a("Convert your Illustrator layers to shape layers.");
        }
        return new C1749g(arrayList3, c1638a, str2, j, enumC1750h, j2, str, arrayList2, c1714l, i, i2, i3, f3, f2, i4, i5, c1712j, c1713k, arrayList, enumC1751i2, c1704b, z2);
    }
}
