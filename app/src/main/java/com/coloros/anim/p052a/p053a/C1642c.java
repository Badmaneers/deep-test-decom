package com.coloros.anim.p052a.p053a;

import android.graphics.Path;
import com.coloros.anim.p062f.C1811g;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompoundTrimPathContent.java */
/* renamed from: com.coloros.anim.a.a.c */
/* loaded from: classes.dex */
public final class C1642c {

    /* renamed from: a */
    private List<C1661v> f7865a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5489a(C1661v c1661v) {
        this.f7865a.add(c1661v);
    }

    /* renamed from: a */
    public final void m5488a(Path path) {
        for (int size = this.f7865a.size() - 1; size >= 0; size--) {
            C1811g.m5906a(path, this.f7865a.get(size));
        }
    }
}
