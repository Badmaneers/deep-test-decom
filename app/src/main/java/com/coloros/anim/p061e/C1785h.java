package com.coloros.anim.p061e;

import android.util.JsonReader;
import com.coloros.anim.p056c.C1717b;
import com.coloros.anim.p056c.C1742c;

/* compiled from: DocumentDataParser.java */
/* renamed from: com.coloros.anim.e.h */
/* loaded from: classes.dex */
public final class C1785h implements InterfaceC1778ag<C1717b> {

    /* renamed from: a */
    public static final C1785h f8375a = new C1785h();

    private C1785h() {
    }

    @Override // com.coloros.anim.p061e.InterfaceC1778ag
    /* renamed from: a */
    public final /* synthetic */ C1717b mo5811a(JsonReader jsonReader, float f) {
        char c;
        int i = C1742c.f8244c;
        jsonReader.beginObject();
        int i2 = i;
        String str = null;
        String str2 = null;
        boolean z = true;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 102) {
                if (nextName.equals("f")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 106) {
                if (nextName.equals("j")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode == 3261) {
                if (nextName.equals("fc")) {
                    c = 7;
                }
                c = 65535;
            } else if (hashCode == 3452) {
                if (nextName.equals("lh")) {
                    c = 5;
                }
                c = 65535;
            } else if (hashCode == 3463) {
                if (nextName.equals("ls")) {
                    c = 6;
                }
                c = 65535;
            } else if (hashCode == 3543) {
                if (nextName.equals("of")) {
                    c = '\n';
                }
                c = 65535;
            } else if (hashCode == 3664) {
                if (nextName.equals("sc")) {
                    c = '\b';
                }
                c = 65535;
            } else if (hashCode == 3684) {
                if (nextName.equals("sw")) {
                    c = '\t';
                }
                c = 65535;
            } else if (hashCode != 3710) {
                switch (hashCode) {
                    case 115:
                        if (nextName.equals("s")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 116:
                        if (nextName.equals("t")) {
                            c = 0;
                            break;
                        }
                        break;
                }
                c = 65535;
            } else {
                if (nextName.equals("tr")) {
                    c = 4;
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
                    d = jsonReader.nextDouble();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    if (nextInt > C1742c.f8244c - 1 || nextInt < 0) {
                        i2 = C1742c.f8244c;
                        break;
                    } else {
                        i2 = C1742c.m5737a()[nextInt];
                        break;
                    }
                case 4:
                    i3 = jsonReader.nextInt();
                    break;
                case 5:
                    d2 = jsonReader.nextDouble();
                    break;
                case 6:
                    d3 = jsonReader.nextDouble();
                    break;
                case 7:
                    i4 = C1792o.m5840a(jsonReader);
                    break;
                case '\b':
                    i5 = C1792o.m5840a(jsonReader);
                    break;
                case '\t':
                    d4 = jsonReader.nextDouble();
                    break;
                case '\n':
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C1717b(str, str2, d, i2, i3, d2, d3, i4, i5, d4, z);
    }
}
