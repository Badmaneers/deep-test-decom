package com.coloros.anim.p052a.p053a;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import com.coloros.anim.p056c.p058b.C1726i;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* renamed from: com.coloros.anim.a.a.m */
/* loaded from: classes.dex */
public final class C1652m implements InterfaceC1650k, InterfaceC1654o {

    /* renamed from: d */
    private final String f7924d;

    /* renamed from: f */
    private final C1726i f7926f;

    /* renamed from: a */
    private final Path f7921a = new Path();

    /* renamed from: b */
    private final Path f7922b = new Path();

    /* renamed from: c */
    private final Path f7923c = new Path();

    /* renamed from: e */
    private final List<InterfaceC1654o> f7925e = new ArrayList();

    public C1652m(C1726i c1726i) {
        if (Build.VERSION.SDK_INT < 19) {
            throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
        }
        this.f7924d = c1726i.m5678a();
        this.f7926f = c1726i;
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1650k
    /* renamed from: a */
    public final void mo5498a(ListIterator<InterfaceC1643d> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC1643d previous = listIterator.previous();
            if (previous instanceof InterfaceC1654o) {
                this.f7925e.add((InterfaceC1654o) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
        for (int i = 0; i < this.f7925e.size(); i++) {
            this.f7925e.get(i).mo5485a(list, list2);
        }
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1654o
    /* renamed from: e */
    public final Path mo5495e() {
        this.f7923c.reset();
        if (this.f7926f.m5680c()) {
            return this.f7923c;
        }
        switch (this.f7926f.m5679b()) {
            case MERGE:
                for (int i = 0; i < this.f7925e.size(); i++) {
                    this.f7923c.addPath(this.f7925e.get(i).mo5495e());
                }
                break;
            case ADD:
                m5499a(Path.Op.UNION);
                break;
            case SUBTRACT:
                m5499a(Path.Op.REVERSE_DIFFERENCE);
                break;
            case INTERSECT:
                m5499a(Path.Op.INTERSECT);
                break;
            case EXCLUDE_INTERSECTIONS:
                m5499a(Path.Op.XOR);
                break;
        }
        return this.f7923c;
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7924d;
    }

    @TargetApi(19)
    /* renamed from: a */
    private void m5499a(Path.Op op) {
        this.f7922b.reset();
        this.f7921a.reset();
        for (int size = this.f7925e.size() - 1; size > 0; size--) {
            InterfaceC1654o interfaceC1654o = this.f7925e.get(size);
            if (interfaceC1654o instanceof C1644e) {
                C1644e c1644e = (C1644e) interfaceC1654o;
                List<InterfaceC1654o> m5493c = c1644e.m5493c();
                for (int size2 = m5493c.size() - 1; size2 >= 0; size2--) {
                    Path mo5495e = m5493c.get(size2).mo5495e();
                    mo5495e.transform(c1644e.m5494d());
                    this.f7922b.addPath(mo5495e);
                }
            } else {
                this.f7922b.addPath(interfaceC1654o.mo5495e());
            }
        }
        InterfaceC1654o interfaceC1654o2 = this.f7925e.get(0);
        if (interfaceC1654o2 instanceof C1644e) {
            C1644e c1644e2 = (C1644e) interfaceC1654o2;
            List<InterfaceC1654o> m5493c2 = c1644e2.m5493c();
            for (int i = 0; i < m5493c2.size(); i++) {
                Path mo5495e2 = m5493c2.get(i).mo5495e();
                mo5495e2.transform(c1644e2.m5494d());
                this.f7921a.addPath(mo5495e2);
            }
        } else {
            this.f7921a.set(interfaceC1654o2.mo5495e());
        }
        this.f7923c.op(this.f7921a, this.f7922b, op);
    }
}
