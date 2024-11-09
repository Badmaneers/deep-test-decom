package androidx.transition;

import androidx.p011b.C0318a;
import java.util.ArrayList;

/* compiled from: TransitionManager.java */
/* renamed from: androidx.transition.an */
/* loaded from: classes.dex */
final class C1011an extends C1008ak {

    /* renamed from: a */
    final /* synthetic */ C0318a f4136a;

    /* renamed from: b */
    final /* synthetic */ ViewOnAttachStateChangeListenerC1010am f4137b;

    public C1011an(ViewOnAttachStateChangeListenerC1010am viewOnAttachStateChangeListenerC1010am, C0318a c0318a) {
        this.f4137b = viewOnAttachStateChangeListenerC1010am;
        this.f4136a = c0318a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: a */
    public final void mo3520a(AbstractC1001ad abstractC1001ad) {
        ((ArrayList) this.f4136a.get(this.f4137b.f4135b)).remove(abstractC1001ad);
        abstractC1001ad.mo3501b(this);
    }
}
