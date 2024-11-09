package com.coloros.anim.p061e;

import android.util.JsonReader;
import com.coloros.anim.p056c.p058b.C1726i;
import com.coloros.anim.p056c.p058b.EnumC1727j;

/* compiled from: MergePathsParser.java */
/* renamed from: com.coloros.anim.e.u */
/* loaded from: classes.dex */
final class C1798u {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1726i m5856a(JsonReader jsonReader) {
        char c;
        String str = null;
        boolean z = false;
        EnumC1727j enumC1727j = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 3324) {
                if (nextName.equals("hd")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 3488) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (nextName.equals("mm")) {
                    c = 1;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    enumC1727j = EnumC1727j.m5681a(jsonReader.nextInt());
                    break;
                case 2:
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1726i(str, enumC1727j, z);
    }
}
