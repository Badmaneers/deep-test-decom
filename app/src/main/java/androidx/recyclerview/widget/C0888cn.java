package androidx.recyclerview.widget;

import java.util.Arrays;

/* compiled from: StaggeredGridLayoutManager.java */
/* renamed from: androidx.recyclerview.widget.cn */
/* loaded from: classes.dex */
final class C0888cn {

    /* renamed from: a */
    int f3644a;

    /* renamed from: b */
    int f3645b;

    /* renamed from: c */
    boolean f3646c;

    /* renamed from: d */
    boolean f3647d;

    /* renamed from: e */
    boolean f3648e;

    /* renamed from: f */
    int[] f3649f;

    /* renamed from: g */
    final /* synthetic */ StaggeredGridLayoutManager f3650g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0888cn(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3650g = staggeredGridLayoutManager;
        m3242a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3242a() {
        this.f3644a = -1;
        this.f3645b = RecyclerView.UNDEFINED_DURATION;
        this.f3646c = false;
        this.f3647d = false;
        this.f3648e = false;
        if (this.f3649f != null) {
            Arrays.fill(this.f3649f, -1);
        }
    }
}
