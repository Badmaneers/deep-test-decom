package com.coloros.anim.p061e;

import android.graphics.Path;
import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1705c;
import com.coloros.anim.p056c.p057a.C1706d;
import com.coloros.anim.p056c.p057a.C1708f;
import com.coloros.anim.p056c.p058b.C1721d;
import com.coloros.anim.p056c.p058b.C1723f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientFillParser.java */
/* renamed from: com.coloros.anim.e.l */
/* loaded from: classes.dex */
public final class C1789l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1721d m5838a(JsonReader jsonReader, C1638a c1638a) {
        char c;
        boolean z;
        Path.FillType fillType = Path.FillType.WINDING;
        int i = 0;
        boolean z2 = false;
        String str = null;
        C1705c c1705c = null;
        C1706d c1706d = null;
        C1708f c1708f = null;
        C1708f c1708f2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 101) {
                if (nextName.equals("e")) {
                    c = 5;
                }
                c = 65535;
            } else if (hashCode == 103) {
                if (nextName.equals("g")) {
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
                    c = 7;
                }
                c = 65535;
            } else if (hashCode != 3519) {
                switch (hashCode) {
                    case 114:
                        if (nextName.equals("r")) {
                            c = 6;
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
                    jsonReader.beginObject();
                    int i2 = -1;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode2 = nextName2.hashCode();
                        if (hashCode2 != 107) {
                            if (hashCode2 == 112 && nextName2.equals("p")) {
                                z = false;
                            }
                            z = -1;
                        } else {
                            if (nextName2.equals("k")) {
                                z = true;
                            }
                            z = -1;
                        }
                        switch (z) {
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
                    break;
                case 3:
                    i = jsonReader.nextInt() == 1 ? C1723f.f8153a : C1723f.f8154b;
                    break;
                case 4:
                    c1708f = C1781d.m5824c(jsonReader, c1638a);
                    break;
                case 5:
                    c1708f2 = C1781d.m5824c(jsonReader, c1638a);
                    break;
                case 6:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z2 = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1721d(str, i, fillType, c1705c, c1706d, c1708f, c1708f2, z2);
    }
}
