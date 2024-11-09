package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.p011b.C0318a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransitionManager.java */
/* renamed from: androidx.transition.am */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1010am implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    AbstractC1001ad f4134a;

    /* renamed from: b */
    ViewGroup f4135b;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnAttachStateChangeListenerC1010am(AbstractC1001ad abstractC1001ad, ViewGroup viewGroup) {
        this.f4134a = abstractC1001ad;
        this.f4135b = viewGroup;
    }

    /* renamed from: a */
    private void m3526a() {
        this.f4135b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f4135b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m3526a();
        C1009al.f4131a.remove(this.f4135b);
        ArrayList<AbstractC1001ad> arrayList = C1009al.m3524a().get(this.f4135b);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC1001ad> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo3510e(this.f4135b);
            }
        }
        this.f4134a.m3494a(true);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m3526a();
        if (!C1009al.f4131a.remove(this.f4135b)) {
            return true;
        }
        C0318a<ViewGroup, ArrayList<AbstractC1001ad>> m3524a = C1009al.m3524a();
        ArrayList<AbstractC1001ad> arrayList = m3524a.get(this.f4135b);
        ArrayList arrayList2 = null;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            m3524a.put(this.f4135b, arrayList);
        } else if (arrayList.size() > 0) {
            arrayList2 = new ArrayList(arrayList);
        }
        arrayList.add(this.f4134a);
        this.f4134a.mo3484a(new C1011an(this, m3524a));
        this.f4134a.m3489a(this.f4135b, false);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC1001ad) it.next()).mo3510e(this.f4135b);
            }
        }
        this.f4134a.m3487a(this.f4135b);
        return true;
    }
}
