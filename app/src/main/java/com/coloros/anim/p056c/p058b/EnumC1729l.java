package com.coloros.anim.p056c.p058b;

/* compiled from: PolystarShape.java */
/* renamed from: com.coloros.anim.c.b.l */
/* loaded from: classes.dex */
public enum EnumC1729l {
    STAR(1),
    POLYGON(2);


    /* renamed from: c */
    private final int f8186c;

    EnumC1729l(int i) {
        this.f8186c = i;
    }

    /* renamed from: a */
    public static EnumC1729l m5692a(int i) {
        for (EnumC1729l enumC1729l : values()) {
            if (enumC1729l.f8186c == i) {
                return enumC1729l;
            }
        }
        return null;
    }
}
