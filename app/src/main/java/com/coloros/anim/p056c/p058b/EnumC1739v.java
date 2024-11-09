package com.coloros.anim.p056c.p058b;

import android.graphics.Paint;

/* compiled from: ShapeStroke.java */
/* renamed from: com.coloros.anim.c.b.v */
/* loaded from: classes.dex */
public enum EnumC1739v {
    MITER,
    ROUND,
    BEVEL;

    /* renamed from: a */
    public final Paint.Join m5729a() {
        switch (this) {
            case BEVEL:
                return Paint.Join.BEVEL;
            case MITER:
                return Paint.Join.MITER;
            case ROUND:
                return Paint.Join.ROUND;
            default:
                return null;
        }
    }
}
