package com.coloros.anim.p056c.p058b;

import android.graphics.Paint;

/* compiled from: ShapeStroke.java */
/* renamed from: com.coloros.anim.c.b.u */
/* loaded from: classes.dex */
public enum EnumC1738u {
    BUTT,
    ROUND,
    UNKNOWN;

    /* renamed from: a */
    public final Paint.Cap m5728a() {
        switch (this) {
            case BUTT:
                return Paint.Cap.BUTT;
            case ROUND:
                return Paint.Cap.ROUND;
            default:
                return Paint.Cap.SQUARE;
        }
    }
}
