package com.color.support.widget;

import com.color.support.widget.ExpandableRecyclerConnector;
import java.util.ArrayList;

/* compiled from: ExpandableRecyclerConnector.java */
/* renamed from: com.color.support.widget.fq */
/* loaded from: classes.dex */
public final class C1532fq {

    /* renamed from: d */
    private static ArrayList<C1532fq> f7281d = new ArrayList<>(5);

    /* renamed from: a */
    public C1533fr f7282a;

    /* renamed from: b */
    public ExpandableRecyclerConnector.GroupMetadata f7283b;

    /* renamed from: c */
    public int f7284c;

    /* renamed from: b */
    private void m5152b() {
        if (this.f7282a != null) {
            this.f7282a.m5157a();
            this.f7282a = null;
        }
        this.f7283b = null;
        this.f7284c = 0;
    }

    private C1532fq() {
    }

    /* renamed from: a */
    public static C1532fq m5151a(int i, int i2, int i3, int i4, ExpandableRecyclerConnector.GroupMetadata groupMetadata, int i5) {
        C1532fq m5153c = m5153c();
        m5153c.f7282a = C1533fr.m5155a(i2, i3, i4, i);
        m5153c.f7283b = groupMetadata;
        m5153c.f7284c = i5;
        return m5153c;
    }

    /* renamed from: c */
    private static C1532fq m5153c() {
        synchronized (f7281d) {
            if (f7281d.size() > 0) {
                C1532fq remove = f7281d.remove(0);
                remove.m5152b();
                return remove;
            }
            return new C1532fq();
        }
    }

    /* renamed from: a */
    public final void m5154a() {
        m5152b();
        synchronized (f7281d) {
            if (f7281d.size() < 5) {
                f7281d.add(this);
            }
        }
    }
}
