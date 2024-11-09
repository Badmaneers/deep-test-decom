package androidx.transition;

import android.graphics.PointF;
import android.view.View;

/* compiled from: ChangeBounds.java */
/* renamed from: androidx.transition.o */
/* loaded from: classes.dex */
final class C1058o {

    /* renamed from: a */
    private int f4234a;

    /* renamed from: b */
    private int f4235b;

    /* renamed from: c */
    private int f4236c;

    /* renamed from: d */
    private int f4237d;

    /* renamed from: e */
    private View f4238e;

    /* renamed from: f */
    private int f4239f;

    /* renamed from: g */
    private int f4240g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1058o(View view) {
        this.f4238e = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3579a(PointF pointF) {
        this.f4234a = Math.round(pointF.x);
        this.f4235b = Math.round(pointF.y);
        this.f4239f++;
        if (this.f4239f == this.f4240g) {
            m3578a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3580b(PointF pointF) {
        this.f4236c = Math.round(pointF.x);
        this.f4237d = Math.round(pointF.y);
        this.f4240g++;
        if (this.f4239f == this.f4240g) {
            m3578a();
        }
    }

    /* renamed from: a */
    private void m3578a() {
        C1030bf.m3555a(this.f4238e, this.f4234a, this.f4235b, this.f4236c, this.f4237d);
        this.f4239f = 0;
        this.f4240g = 0;
    }
}
