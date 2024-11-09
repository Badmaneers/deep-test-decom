package com.coloros.anim.p061e;

import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1710h;
import com.coloros.anim.p056c.p058b.C1735r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapePathParser.java */
/* renamed from: com.coloros.anim.e.ad */
/* loaded from: classes.dex */
public final class C1775ad {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1735r m5813a(JsonReader jsonReader, C1638a c1638a) {
        char c;
        String str = null;
        C1710h c1710h = null;
        int i = 0;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 3324) {
                if (nextName.equals("hd")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode == 3432) {
                if (nextName.equals("ks")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 3519) {
                if (hashCode == 104415 && nextName.equals("ind")) {
                    c = 1;
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
                    i = jsonReader.nextInt();
                    break;
                case 2:
                    c1710h = C1781d.m5826e(jsonReader, c1638a);
                    break;
                case 3:
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1735r(str, i, c1710h, z);
    }
}
