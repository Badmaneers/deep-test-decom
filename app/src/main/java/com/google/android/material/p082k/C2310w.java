package com.google.android.material.p082k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.p081j.C2282a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapePath.java */
/* renamed from: com.google.android.material.k.w */
/* loaded from: classes.dex */
public final class C2310w extends AbstractC2287ac {

    /* renamed from: a */
    final /* synthetic */ List f10166a;

    /* renamed from: b */
    final /* synthetic */ Matrix f10167b;

    /* renamed from: c */
    final /* synthetic */ C2309v f10168c;

    public C2310w(C2309v c2309v, List list, Matrix matrix) {
        this.f10168c = c2309v;
        this.f10166a = list;
        this.f10167b = matrix;
    }

    @Override // com.google.android.material.p082k.AbstractC2287ac
    /* renamed from: a */
    public final void mo7231a(Matrix matrix, C2282a c2282a, int i, Canvas canvas) {
        Iterator it = this.f10166a.iterator();
        while (it.hasNext()) {
            ((AbstractC2287ac) it.next()).mo7231a(this.f10167b, c2282a, i, canvas);
        }
    }
}
