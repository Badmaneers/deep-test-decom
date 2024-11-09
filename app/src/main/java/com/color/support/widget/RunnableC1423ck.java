package com.color.support.widget;

import android.view.ViewConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorNumberPicker.java */
/* renamed from: com.color.support.widget.ck */
/* loaded from: classes.dex */
public final class RunnableC1423ck implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ColorNumberPicker f7026a;

    /* renamed from: b */
    private final int f7027b = 1;

    /* renamed from: c */
    private final int f7028c = 2;

    /* renamed from: d */
    private int f7029d;

    /* renamed from: e */
    private int f7030e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1423ck(ColorNumberPicker colorNumberPicker) {
        this.f7026a = colorNumberPicker;
    }

    /* renamed from: a */
    public final void m4953a() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        this.f7030e = 0;
        this.f7029d = 0;
        this.f7026a.removeCallbacks(this);
        z = this.f7026a.f6280P;
        if (z) {
            this.f7026a.f6280P = false;
            ColorNumberPicker colorNumberPicker = this.f7026a;
            i2 = this.f7026a.f6278N;
            colorNumberPicker.invalidate(0, i2, this.f7026a.getRight(), this.f7026a.getBottom());
        }
        this.f7026a.f6281Q = false;
        z2 = this.f7026a.f6281Q;
        if (z2) {
            ColorNumberPicker colorNumberPicker2 = this.f7026a;
            int right = this.f7026a.getRight();
            i = this.f7026a.f6277M;
            colorNumberPicker2.invalidate(0, 0, right, i);
        }
    }

    /* renamed from: a */
    public final void m4954a(int i) {
        m4953a();
        this.f7030e = 1;
        this.f7029d = i;
        this.f7026a.postDelayed(this, ViewConfiguration.getTapTimeout());
    }

    /* renamed from: b */
    public final void m4955b(int i) {
        m4953a();
        this.f7030e = 2;
        this.f7029d = i;
        this.f7026a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        switch (this.f7030e) {
            case 1:
                switch (this.f7029d) {
                    case 1:
                        this.f7026a.f6280P = true;
                        ColorNumberPicker colorNumberPicker = this.f7026a;
                        i = this.f7026a.f6278N;
                        colorNumberPicker.invalidate(0, i, this.f7026a.getRight(), this.f7026a.getBottom());
                        return;
                    case 2:
                        this.f7026a.f6281Q = true;
                        ColorNumberPicker colorNumberPicker2 = this.f7026a;
                        int right = this.f7026a.getRight();
                        i2 = this.f7026a.f6277M;
                        colorNumberPicker2.invalidate(0, 0, right, i2);
                        return;
                    default:
                        return;
                }
            case 2:
                switch (this.f7029d) {
                    case 1:
                        z = this.f7026a.f6280P;
                        if (!z) {
                            this.f7026a.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ColorNumberPicker colorNumberPicker3 = this.f7026a;
                        z2 = this.f7026a.f6280P;
                        colorNumberPicker3.f6280P = true ^ z2;
                        ColorNumberPicker colorNumberPicker4 = this.f7026a;
                        i3 = this.f7026a.f6278N;
                        colorNumberPicker4.invalidate(0, i3, this.f7026a.getRight(), this.f7026a.getBottom());
                        return;
                    case 2:
                        z3 = this.f7026a.f6281Q;
                        if (!z3) {
                            this.f7026a.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ColorNumberPicker colorNumberPicker5 = this.f7026a;
                        z4 = this.f7026a.f6281Q;
                        colorNumberPicker5.f6281Q = true ^ z4;
                        ColorNumberPicker colorNumberPicker6 = this.f7026a;
                        int right2 = this.f7026a.getRight();
                        i4 = this.f7026a.f6277M;
                        colorNumberPicker6.invalidate(0, 0, right2, i4);
                        return;
                    default:
                        return;
                }
            default:
                return;
        }
    }
}
