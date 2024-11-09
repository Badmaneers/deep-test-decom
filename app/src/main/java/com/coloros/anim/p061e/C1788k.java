package com.coloros.anim.p061e;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.coloros.anim.p056c.p058b.C1720c;
import com.coloros.anim.p062f.C1810f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientColorParser.java */
/* renamed from: com.coloros.anim.e.k */
/* loaded from: classes.dex */
public final class C1788k implements InterfaceC1778ag<C1720c> {

    /* renamed from: a */
    private int f8377a;

    public C1788k(int i) {
        this.f8377a = i;
    }

    /* renamed from: a */
    private void m5837a(C1720c c1720c, List<Float> list) {
        double d;
        int i = this.f8377a * 4;
        if (list.size() <= i) {
            return;
        }
        int size = (list.size() - i) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                dArr[i2] = list.get(i).floatValue();
            } else {
                dArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        for (int i3 = 0; i3 < c1720c.m5651c(); i3++) {
            int i4 = c1720c.m5650b()[i3];
            double d2 = c1720c.m5649a()[i3];
            int i5 = 1;
            while (true) {
                if (i5 < dArr.length) {
                    int i6 = i5 - 1;
                    double d3 = dArr[i6];
                    double d4 = dArr[i5];
                    if (dArr[i5] >= d2) {
                        d = C1810f.m5891a(dArr2[i6], dArr2[i5], (d2 - d3) / (d4 - d3));
                        break;
                    }
                    i5++;
                } else {
                    d = dArr2[dArr2.length - 1];
                    break;
                }
            }
            c1720c.m5650b()[i3] = Color.argb((int) (d * 255.0d), Color.red(i4), Color.green(i4), Color.blue(i4));
        }
    }

    @Override // com.coloros.anim.p061e.InterfaceC1778ag
    /* renamed from: a */
    public final /* synthetic */ C1720c mo5811a(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f8377a == -1) {
            this.f8377a = arrayList.size() / 4;
        }
        float[] fArr = new float[this.f8377a];
        int[] iArr = new int[this.f8377a];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f8377a * 4; i3++) {
            int i4 = i3 / 4;
            double floatValue = arrayList.get(i3).floatValue();
            switch (i3 % 4) {
                case 0:
                    fArr[i4] = (float) floatValue;
                    break;
                case 1:
                    i = (int) (floatValue * 255.0d);
                    break;
                case 2:
                    i2 = (int) (floatValue * 255.0d);
                    break;
                case 3:
                    iArr[i4] = Color.argb(255, i, i2, (int) (floatValue * 255.0d));
                    break;
            }
        }
        C1720c c1720c = new C1720c(fArr, iArr);
        m5837a(c1720c, arrayList);
        return c1720c;
    }
}
