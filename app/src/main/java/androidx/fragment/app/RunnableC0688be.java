package androidx.fragment.app;

import android.view.View;
import androidx.core.p024g.C0538w;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: FragmentTransitionImpl.java */
/* renamed from: androidx.fragment.app.be */
/* loaded from: classes.dex */
public final class RunnableC0688be implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f2938a;

    /* renamed from: b */
    final /* synthetic */ Map f2939b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0685bb f2940c;

    public RunnableC0688be(AbstractC0685bb abstractC0685bb, ArrayList arrayList, Map map) {
        this.f2940c = abstractC0685bb;
        this.f2938a = arrayList;
        this.f2939b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.f2938a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f2938a.get(i);
            C0538w.m1854a(view, (String) this.f2939b.get(C0538w.m1890s(view)));
        }
    }
}
