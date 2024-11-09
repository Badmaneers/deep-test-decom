package com.coloros.anim.p061e;

import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1705c;
import com.coloros.anim.p056c.p057a.C1706d;
import com.coloros.anim.p056c.p057a.C1708f;
import com.coloros.anim.p056c.p058b.C1722e;
import com.coloros.anim.p056c.p058b.C1723f;
import com.coloros.anim.p056c.p058b.EnumC1738u;
import com.coloros.anim.p056c.p058b.EnumC1739v;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientStrokeParser.java */
/* renamed from: com.coloros.anim.e.m */
/* loaded from: classes.dex */
public final class C1790m {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1722e m5839a(JsonReader jsonReader, C1638a c1638a) {
        char c;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str = null;
        int i = 0;
        C1705c c1705c = null;
        C1706d c1706d = null;
        C1708f c1708f = null;
        C1708f c1708f2 = null;
        C1704b c1704b = null;
        EnumC1738u enumC1738u = null;
        EnumC1739v enumC1739v = null;
        C1704b c1704b2 = null;
        boolean z4 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        c = 11;
                        break;
                    }
                    break;
                case 101:
                    if (nextName.equals("e")) {
                        c = 5;
                        break;
                    }
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 2;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 4;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 3;
                        break;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    z = z4;
                    str = jsonReader.nextString();
                    break;
                case 1:
                    z = z4;
                    jsonReader.beginObject();
                    int i2 = -1;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != 107) {
                            if (hashCode == 112 && nextName2.equals("p")) {
                                z2 = false;
                            }
                            z2 = -1;
                        } else {
                            if (nextName2.equals("k")) {
                                z2 = true;
                            }
                            z2 = -1;
                        }
                        switch (z2) {
                            case false:
                                i2 = jsonReader.nextInt();
                                break;
                            case true:
                                c1705c = C1781d.m5820a(jsonReader, c1638a, i2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    c1706d = C1781d.m5823b(jsonReader, c1638a);
                    continue;
                case 3:
                    z = z4;
                    i = jsonReader.nextInt() == 1 ? C1723f.f8153a : C1723f.f8154b;
                    break;
                case 4:
                    c1708f = C1781d.m5824c(jsonReader, c1638a);
                    continue;
                case 5:
                    c1708f2 = C1781d.m5824c(jsonReader, c1638a);
                    continue;
                case 6:
                    c1704b = C1781d.m5818a(jsonReader, c1638a);
                    continue;
                case 7:
                    z = z4;
                    enumC1738u = EnumC1738u.values()[jsonReader.nextInt() - 1];
                    break;
                case '\b':
                    z = z4;
                    enumC1739v = EnumC1739v.values()[jsonReader.nextInt() - 1];
                    break;
                case '\t':
                    z = z4;
                    f = (float) jsonReader.nextDouble();
                    break;
                case '\n':
                    z4 = jsonReader.nextBoolean();
                    continue;
                case 11:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        C1704b c1704b3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            C1704b c1704b4 = c1704b2;
                            int hashCode2 = nextName3.hashCode();
                            boolean z5 = z4;
                            if (hashCode2 != 110) {
                                if (hashCode2 == 118 && nextName3.equals("v")) {
                                    z3 = true;
                                }
                                z3 = -1;
                            } else {
                                if (nextName3.equals("n")) {
                                    z3 = false;
                                }
                                z3 = -1;
                            }
                            switch (z3) {
                                case false:
                                    str2 = jsonReader.nextString();
                                    break;
                                case true:
                                    c1704b3 = C1781d.m5818a(jsonReader, c1638a);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                            c1704b2 = c1704b4;
                            z4 = z5;
                        }
                        C1704b c1704b5 = c1704b2;
                        boolean z6 = z4;
                        jsonReader.endObject();
                        if (str2.equals("o")) {
                            c1704b2 = c1704b3;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                c1638a.m5459a();
                                arrayList.add(c1704b3);
                            }
                            c1704b2 = c1704b5;
                        }
                        z4 = z6;
                    }
                    C1704b c1704b6 = c1704b2;
                    z = z4;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    c1704b2 = c1704b6;
                    break;
                default:
                    z = z4;
                    jsonReader.skipValue();
                    break;
            }
            z4 = z;
        }
        return new C1722e(str, i, c1705c, c1706d, c1708f, c1708f2, c1704b, enumC1738u, enumC1739v, f, arrayList, c1704b2, z4);
    }
}
