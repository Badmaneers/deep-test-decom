package com.color.support.widget;

import android.view.MotionEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SecurityKeyboardView.java */
/* renamed from: com.color.support.widget.gm */
/* loaded from: classes.dex */
public final class C1555gm {

    /* renamed from: a */
    final float[] f7362a;

    /* renamed from: b */
    final float[] f7363b;

    /* renamed from: c */
    final long[] f7364c;

    /* renamed from: d */
    float f7365d;

    /* renamed from: e */
    float f7366e;

    private C1555gm() {
        this.f7362a = new float[4];
        this.f7363b = new float[4];
        this.f7364c = new long[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1555gm(byte b) {
        this();
    }

    /* renamed from: a */
    public final void m5190a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            m5189a(motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i), motionEvent.getHistoricalEventTime(i));
        }
        m5189a(motionEvent.getX(), motionEvent.getY(), eventTime);
    }

    /* renamed from: a */
    private void m5189a(float f, float f2, long j) {
        long[] jArr = this.f7364c;
        int i = -1;
        int i2 = 0;
        while (i2 < 4 && jArr[i2] != 0) {
            if (jArr[i2] < j - 200) {
                i = i2;
            }
            i2++;
        }
        if (i2 == 4 && i < 0) {
            i = 0;
        }
        if (i == i2) {
            i--;
        }
        float[] fArr = this.f7362a;
        float[] fArr2 = this.f7363b;
        if (i >= 0) {
            int i3 = i + 1;
            int i4 = (4 - i) - 1;
            System.arraycopy(fArr, i3, fArr, 0, i4);
            System.arraycopy(fArr2, i3, fArr2, 0, i4);
            System.arraycopy(jArr, i3, jArr, 0, i4);
            i2 -= i3;
        }
        fArr[i2] = f;
        fArr2[i2] = f2;
        jArr[i2] = j;
        int i5 = i2 + 1;
        if (i5 < 4) {
            jArr[i5] = 0;
        }
    }
}
