package com.coloros.anim.p061e;

import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1703a;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1706d;
import com.coloros.anim.p056c.p058b.C1736s;
import com.coloros.anim.p056c.p058b.EnumC1738u;
import com.coloros.anim.p056c.p058b.EnumC1739v;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeStrokeParser.java */
/* renamed from: com.coloros.anim.e.ae */
/* loaded from: classes.dex */
public final class C1776ae {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1736s m5814a(JsonReader jsonReader, C1638a c1638a) {
        char c;
        char c2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str = null;
        C1704b c1704b = null;
        C1703a c1703a = null;
        C1706d c1706d = null;
        C1704b c1704b2 = null;
        EnumC1738u enumC1738u = null;
        EnumC1739v enumC1739v = null;
        boolean z2 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode == 119) {
                if (nextName.equals("w")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 3324) {
                if (nextName.equals("hd")) {
                    c = 7;
                }
                c = 65535;
            } else if (hashCode == 3447) {
                if (nextName.equals("lc")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode == 3454) {
                if (nextName.equals("lj")) {
                    c = 5;
                }
                c = 65535;
            } else if (hashCode == 3487) {
                if (nextName.equals("ml")) {
                    c = 6;
                }
                c = 65535;
            } else if (hashCode != 3519) {
                switch (hashCode) {
                    case 99:
                        if (nextName.equals("c")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 100:
                        if (nextName.equals("d")) {
                            c = '\b';
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
                    c1703a = C1781d.m5828g(jsonReader, c1638a);
                    break;
                case 2:
                    c1704b2 = C1781d.m5818a(jsonReader, c1638a);
                    break;
                case 3:
                    c1706d = C1781d.m5823b(jsonReader, c1638a);
                    break;
                case 4:
                    enumC1738u = EnumC1738u.values()[jsonReader.nextInt() - 1];
                    break;
                case 5:
                    enumC1739v = EnumC1739v.values()[jsonReader.nextInt() - 1];
                    break;
                case 6:
                    f = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    z2 = jsonReader.nextBoolean();
                    break;
                case '\b':
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        C1704b c1704b3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            int hashCode2 = nextName2.hashCode();
                            if (hashCode2 != 110) {
                                if (hashCode2 == 118 && nextName2.equals("v")) {
                                    z = true;
                                }
                                z = -1;
                            } else {
                                if (nextName2.equals("n")) {
                                    z = false;
                                }
                                z = -1;
                            }
                            switch (z) {
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
                        }
                        jsonReader.endObject();
                        int hashCode3 = str2.hashCode();
                        if (hashCode3 == 100) {
                            if (str2.equals("d")) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        } else if (hashCode3 != 103) {
                            if (hashCode3 == 111 && str2.equals("o")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        } else {
                            if (str2.equals("g")) {
                                c2 = 2;
                            }
                            c2 = 65535;
                        }
                        switch (c2) {
                            case 0:
                                c1704b = c1704b3;
                                break;
                            case 1:
                            case 2:
                                c1638a.m5459a();
                                arrayList.add(c1704b3);
                                break;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1736s(str, c1704b, arrayList, c1703a, c1706d, c1704b2, enumC1738u, enumC1739v, f, z2);
    }
}
