package com.color.support.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: SecurityKeyboardView.java */
/* renamed from: com.color.support.widget.gh */
/* loaded from: classes.dex */
final class C1550gh extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ SecurityKeyboardView f7352a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1550gh(SecurityKeyboardView securityKeyboardView) {
        this.f7352a = securityKeyboardView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        C1555gm c1555gm;
        float min;
        float min2;
        C1555gm c1555gm2;
        C1555gm c1555gm3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        boolean z5;
        z = this.f7352a.f6829al;
        int i9 = 0;
        if (z) {
            return false;
        }
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        int width = this.f7352a.getWidth() / 2;
        int height = this.f7352a.getHeight() / 2;
        c1555gm = this.f7352a.f6830am;
        float[] fArr = c1555gm.f7362a;
        float[] fArr2 = c1555gm.f7363b;
        long[] jArr = c1555gm.f7364c;
        float f3 = fArr[0];
        float f4 = fArr2[0];
        long j = jArr[0];
        while (i9 < 4 && jArr[i9] != 0) {
            i9++;
        }
        boolean z6 = true;
        int i10 = 1;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (i10 < i9) {
            float f7 = abs;
            int i11 = i9;
            int i12 = (int) (jArr[i10] - j);
            if (i12 != 0) {
                float f8 = i12;
                float f9 = ((fArr[i10] - f3) / f8) * 1000.0f;
                if (f6 != 0.0f) {
                    f9 = (f6 + f9) * 0.5f;
                }
                float f10 = ((fArr2[i10] - f4) / f8) * 1000.0f;
                f5 = f5 == 0.0f ? f10 : (f5 + f10) * 0.5f;
                f6 = f9;
            }
            i10++;
            abs = f7;
            i9 = i11;
        }
        float f11 = abs;
        if (f6 < 0.0f) {
            min = Math.max(f6, -3.4028235E38f);
        } else {
            min = Math.min(f6, Float.MAX_VALUE);
        }
        c1555gm.f7366e = min;
        if (f5 < 0.0f) {
            min2 = Math.max(f5, -3.4028235E38f);
        } else {
            min2 = Math.min(f5, Float.MAX_VALUE);
        }
        c1555gm.f7365d = min2;
        c1555gm2 = this.f7352a.f6830am;
        float f12 = c1555gm2.f7366e;
        c1555gm3 = this.f7352a.f6830am;
        float f13 = c1555gm3.f7365d;
        i = this.f7352a.f6831an;
        if (f <= i || abs2 >= f11 || x <= width) {
            i2 = this.f7352a.f6831an;
            if (f >= (-i2) || abs2 >= f11 || x >= (-width)) {
                i3 = this.f7352a.f6831an;
                if (f2 >= (-i3) || f11 >= abs2) {
                    i4 = height;
                } else {
                    i4 = height;
                    if (y < (-i4)) {
                        z3 = this.f7352a.f6832ao;
                        if (!z3 || f13 <= f2 / 4.0f) {
                            return true;
                        }
                    }
                }
                i5 = this.f7352a.f6831an;
                if (f2 <= i5 || f11 >= abs2 / 2.0f || y <= i4) {
                    z6 = false;
                } else {
                    z2 = this.f7352a.f6832ao;
                    if (!z2 || f13 >= f2 / 4.0f) {
                        return true;
                    }
                }
            } else {
                z4 = this.f7352a.f6832ao;
                if (!z4 || f12 <= f / 4.0f) {
                    return true;
                }
            }
        } else {
            z5 = this.f7352a.f6832ao;
            if (!z5 || f12 >= f / 4.0f) {
                return true;
            }
        }
        if (!z6) {
            return false;
        }
        SecurityKeyboardView securityKeyboardView = this.f7352a;
        i6 = this.f7352a.f6794W;
        i7 = this.f7352a.f6783L;
        i8 = this.f7352a.f6784M;
        securityKeyboardView.m4823a(i6, i7, i8, motionEvent.getEventTime());
        return false;
    }
}
