package com.coloros.anim.p061e;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import androidx.p011b.C0329o;
import com.coloros.anim.C1638a;
import com.coloros.anim.C1689ak;
import com.coloros.anim.C1692an;
import com.coloros.anim.p056c.C1760e;
import com.coloros.anim.p056c.C1761f;
import com.coloros.anim.p056c.C1764i;
import com.coloros.anim.p056c.p058b.C1734q;
import com.coloros.anim.p056c.p059c.C1749g;
import com.coloros.anim.p056c.p059c.EnumC1750h;
import com.coloros.anim.p062f.C1811g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: EffectiveCompositionParser.java */
/* renamed from: com.coloros.anim.e.i */
/* loaded from: classes.dex */
public final class C1786i {
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x00e0. Please report as an issue. */
    /* renamed from: a */
    public static C1638a m5831a(JsonReader jsonReader) {
        float f;
        char c;
        HashMap hashMap;
        ArrayList arrayList;
        JsonReader jsonReader2 = jsonReader;
        float m5901a = C1811g.m5901a();
        LongSparseArray<C1749g> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C0329o<C1761f> c0329o = new C0329o<>();
        C1638a c1638a = new C1638a();
        jsonReader.beginObject();
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -1408207997:
                    f = f4;
                    if (nextName.equals("assets")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1109732030:
                    f = f4;
                    if (nextName.equals("layers")) {
                        c = 6;
                        break;
                    }
                    break;
                case 104:
                    f = f4;
                    if (nextName.equals("h")) {
                        c = 1;
                        break;
                    }
                    break;
                case 118:
                    f = f4;
                    if (nextName.equals("v")) {
                        c = 5;
                        break;
                    }
                    break;
                case 119:
                    f = f4;
                    if (nextName.equals("w")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3276:
                    f = f4;
                    if (nextName.equals("fr")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3367:
                    f = f4;
                    if (nextName.equals("ip")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3553:
                    f = f4;
                    if (nextName.equals("op")) {
                        c = 3;
                        break;
                    }
                    break;
                case 94623709:
                    f = f4;
                    if (nextName.equals("chars")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 97615364:
                    f = f4;
                    if (nextName.equals("fonts")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 839250809:
                    f = f4;
                    if (nextName.equals("markers")) {
                        c = '\n';
                        break;
                    }
                    break;
                default:
                    f = f4;
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    i = jsonReader.nextInt();
                    f4 = f;
                    break;
                case 1:
                    i2 = jsonReader.nextInt();
                    f4 = f;
                    break;
                case 2:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = (float) jsonReader.nextDouble();
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = (float) jsonReader.nextDouble();
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 5:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!C1811g.m5908a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))) {
                        c1638a.m5462a("EffectiveAnimation only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    C1692an.m5562a("parseLayers start!!!");
                    m5833a(jsonReader2, c1638a, arrayList2, longSparseArray);
                    C1692an.m5562a("parseLayers end!!!");
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    C1692an.m5562a("parseAssets start!!!");
                    m5834a(jsonReader2, c1638a, hashMap2, hashMap3);
                    C1692an.m5562a("parseAssets end!!!");
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case '\b':
                    C1692an.m5562a("parseFonts start!!!");
                    m5836a(jsonReader2, hashMap4);
                    C1692an.m5562a("parseFonts end!!!");
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case '\t':
                    C1692an.m5562a("parseChars start!!!");
                    m5832a(jsonReader2, c1638a, c0329o);
                    C1692an.m5562a("parseChars end!!!");
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case '\n':
                    C1692an.m5562a("parseMarkers start!!!");
                    m5835a(jsonReader2, arrayList3);
                    C1692an.m5562a("parseMarkers end!!!");
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    jsonReader.skipValue();
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
            }
            jsonReader2 = jsonReader;
        }
        jsonReader.endObject();
        c1638a.m5461a(new Rect(0, 0, (int) (i * m5901a), (int) (i2 * m5901a)), f2, f3, f4, arrayList2, longSparseArray, hashMap2, hashMap3, c0329o, hashMap4, arrayList3);
        C1692an.m5562a("CompositionParser::parse end!!!");
        return c1638a;
    }

    /* renamed from: a */
    private static void m5833a(JsonReader jsonReader, C1638a c1638a, List<C1749g> list, LongSparseArray<C1749g> longSparseArray) {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            C1749g m5853a = C1796s.m5853a(jsonReader, c1638a);
            if (m5853a.m5766k() == EnumC1750h.IMAGE) {
                i++;
            }
            list.add(m5853a);
            longSparseArray.put(m5853a.m5760e(), m5853a);
            if (i > 4) {
                C1692an.m5563b("You have " + i + " images. EffectiveAnimation should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    /* renamed from: a */
    private static void m5834a(JsonReader jsonReader, C1638a c1638a, Map<String, List<C1749g>> map, Map<String, C1689ak> map2) {
        char c;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == -1109732030) {
                    if (nextName.equals("layers")) {
                        c = 1;
                    }
                    c = 65535;
                } else if (hashCode == 104) {
                    if (nextName.equals("h")) {
                        c = 3;
                    }
                    c = 65535;
                } else if (hashCode == 112) {
                    if (nextName.equals("p")) {
                        c = 4;
                    }
                    c = 65535;
                } else if (hashCode == 117) {
                    if (nextName.equals("u")) {
                        c = 5;
                    }
                    c = 65535;
                } else if (hashCode != 119) {
                    if (hashCode == 3355 && nextName.equals("id")) {
                        c = 0;
                    }
                    c = 65535;
                } else {
                    if (nextName.equals("w")) {
                        c = 2;
                    }
                    c = 65535;
                }
                switch (c) {
                    case 0:
                        str = jsonReader.nextString();
                        break;
                    case 1:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            C1749g m5853a = C1796s.m5853a(jsonReader, c1638a);
                            longSparseArray.put(m5853a.m5760e(), m5853a);
                            arrayList.add(m5853a);
                        }
                        jsonReader.endArray();
                        break;
                    case 2:
                        i = jsonReader.nextInt();
                        break;
                    case 3:
                        i2 = jsonReader.nextInt();
                        break;
                    case 4:
                        str2 = jsonReader.nextString();
                        break;
                    case 5:
                        str3 = jsonReader.nextString();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                C1689ak c1689ak = new C1689ak(i, i2, str, str2, str3);
                map2.put(c1689ak.m5557a(), c1689ak);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    /* renamed from: a */
    private static void m5836a(JsonReader jsonReader, Map<String, C1760e> map) {
        char c;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (!((nextName.hashCode() == 3322014 && nextName.equals("list")) ? false : -1)) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    float f = 0.0f;
                    String str2 = null;
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode == -1866931350) {
                            if (nextName2.equals("fFamily")) {
                                c = 0;
                            }
                            c = 65535;
                        } else if (hashCode == -1408684838) {
                            if (nextName2.equals("ascent")) {
                                c = 3;
                            }
                            c = 65535;
                        } else if (hashCode != -1294566165) {
                            if (hashCode == 96619537 && nextName2.equals("fName")) {
                                c = 1;
                            }
                            c = 65535;
                        } else {
                            if (nextName2.equals("fStyle")) {
                                c = 2;
                            }
                            c = 65535;
                        }
                        switch (c) {
                            case 0:
                                str = jsonReader.nextString();
                                break;
                            case 1:
                                str2 = jsonReader.nextString();
                                break;
                            case 2:
                                str3 = jsonReader.nextString();
                                break;
                            case 3:
                                f = (float) jsonReader.nextDouble();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    C1760e c1760e = new C1760e(str, str2, str3, f);
                    map.put(c1760e.m5787b(), c1760e);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    /* renamed from: a */
    private static void m5832a(JsonReader jsonReader, C1638a c1638a, C0329o<C1761f> c0329o) {
        char c;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            double d = 0.0d;
            double d2 = 0.0d;
            char c2 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == -1866931350) {
                    if (nextName.equals("fFamily")) {
                        c = 4;
                    }
                    c = 65535;
                } else if (hashCode == 119) {
                    if (nextName.equals("w")) {
                        c = 2;
                    }
                    c = 65535;
                } else if (hashCode == 3173) {
                    if (nextName.equals("ch")) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode == 3076010) {
                    if (nextName.equals("data")) {
                        c = 5;
                    }
                    c = 65535;
                } else if (hashCode != 3530753) {
                    if (hashCode == 109780401 && nextName.equals("style")) {
                        c = 3;
                    }
                    c = 65535;
                } else {
                    if (nextName.equals("size")) {
                        c = 1;
                    }
                    c = 65535;
                }
                switch (c) {
                    case 0:
                        c2 = jsonReader.nextString().charAt(0);
                        break;
                    case 1:
                        d2 = jsonReader.nextDouble();
                        break;
                    case 2:
                        d = jsonReader.nextDouble();
                        break;
                    case 3:
                        str = jsonReader.nextString();
                        break;
                    case 4:
                        str2 = jsonReader.nextString();
                        break;
                    case 5:
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            if ("shapes".equals(jsonReader.nextName())) {
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add((C1734q) C1784g.m5830a(jsonReader, c1638a));
                                }
                                jsonReader.endArray();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            C1761f c1761f = new C1761f(arrayList, c2, d2, d, str, str2);
            c0329o.m1071b(c1761f.hashCode(), c1761f);
        }
        jsonReader.endArray();
    }

    /* renamed from: a */
    private static void m5835a(JsonReader jsonReader, List<C1764i> list) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str = null;
            jsonReader.beginObject();
            float f = 0.0f;
            float f2 = 0.0f;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != 3178) {
                    if (hashCode != 3214) {
                        if (hashCode == 3705 && nextName.equals("tm")) {
                            c = 1;
                        }
                    } else if (nextName.equals("dr")) {
                        c = 2;
                    }
                } else if (nextName.equals("cm")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        str = jsonReader.nextString();
                        break;
                    case 1:
                        f = (float) jsonReader.nextDouble();
                        break;
                    case 2:
                        f2 = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new C1764i(str, f, f2));
        }
        jsonReader.endArray();
    }
}
