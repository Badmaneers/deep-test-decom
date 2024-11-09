package androidx.room;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MultiInstanceInvalidationClient.java */
/* renamed from: androidx.room.p */
/* loaded from: classes.dex */
public final class BinderC0959p extends AbstractBinderC0947d {

    /* renamed from: a */
    final /* synthetic */ C0958o f3924a;

    public BinderC0959p(C0958o c0958o) {
        this.f3924a = c0958o;
    }

    @Override // androidx.room.InterfaceC0946c
    /* renamed from: a */
    public final void mo3374a(String[] strArr) {
        this.f3924a.f3917g.execute(new RunnableC0960q(this, strArr));
    }
}
