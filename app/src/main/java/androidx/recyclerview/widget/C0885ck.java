package androidx.recyclerview.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapHelper.java */
/* renamed from: androidx.recyclerview.widget.ck */
/* loaded from: classes.dex */
public final class C0885ck extends AbstractC0865br {

    /* renamed from: a */
    boolean f3640a = false;

    /* renamed from: b */
    final /* synthetic */ AbstractC0884cj f3641b;

    public C0885ck(AbstractC0884cj abstractC0884cj) {
        this.f3641b = abstractC0884cj;
    }

    @Override // androidx.recyclerview.widget.AbstractC0865br
    /* renamed from: a */
    public final void mo3136a(RecyclerView recyclerView, int i) {
        super.mo3136a(recyclerView, i);
        if (i == 0 && this.f3640a) {
            this.f3640a = false;
            this.f3641b.m3239a();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0865br
    /* renamed from: a */
    public final void mo3137a(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f3640a = true;
    }
}
