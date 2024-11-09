package com.coloros.anim.p056c.p058b;

/* compiled from: MergePaths.java */
/* renamed from: com.coloros.anim.c.b.j */
/* loaded from: classes.dex */
public enum EnumC1727j {
    MERGE,
    ADD,
    SUBTRACT,
    INTERSECT,
    EXCLUDE_INTERSECTIONS;

    /* renamed from: a */
    public static EnumC1727j m5681a(int i) {
        switch (i) {
            case 1:
                return MERGE;
            case 2:
                return ADD;
            case 3:
                return SUBTRACT;
            case 4:
                return INTERSECT;
            case 5:
                return EXCLUDE_INTERSECTIONS;
            default:
                return MERGE;
        }
    }
}
