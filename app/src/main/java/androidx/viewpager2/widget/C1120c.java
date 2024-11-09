package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositeOnPageChangeCallback.java */
/* renamed from: androidx.viewpager2.widget.c */
/* loaded from: classes.dex */
final class C1120c extends AbstractC1133p {

    /* renamed from: a */
    private final List<AbstractC1133p> f4529a = new ArrayList(3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3729a(AbstractC1133p abstractC1133p) {
        this.f4529a.add(abstractC1133p);
    }

    @Override // androidx.viewpager2.widget.AbstractC1133p
    /* renamed from: a */
    public final void mo3728a(int i, float f, int i2) {
        try {
            Iterator<AbstractC1133p> it = this.f4529a.iterator();
            while (it.hasNext()) {
                it.next().mo3728a(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m3726a(e);
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC1133p
    /* renamed from: a */
    public final void mo3727a(int i) {
        try {
            Iterator<AbstractC1133p> it = this.f4529a.iterator();
            while (it.hasNext()) {
                it.next().mo3727a(i);
            }
        } catch (ConcurrentModificationException e) {
            m3726a(e);
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC1133p
    /* renamed from: b */
    public final void mo3730b(int i) {
        try {
            Iterator<AbstractC1133p> it = this.f4529a.iterator();
            while (it.hasNext()) {
                it.next().mo3730b(i);
            }
        } catch (ConcurrentModificationException e) {
            m3726a(e);
        }
    }

    /* renamed from: a */
    private static void m3726a(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
