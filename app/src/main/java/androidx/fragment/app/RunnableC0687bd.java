package androidx.fragment.app;

import android.view.View;
import androidx.core.p024g.C0538w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: FragmentTransitionImpl.java */
/* renamed from: androidx.fragment.app.bd */
/* loaded from: classes.dex */
public final class RunnableC0687bd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f2935a;

    /* renamed from: b */
    final /* synthetic */ Map f2936b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0685bb f2937c;

    public RunnableC0687bd(AbstractC0685bb abstractC0685bb, ArrayList arrayList, Map map) {
        this.f2937c = abstractC0685bb;
        this.f2935a = arrayList;
        this.f2936b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int size = this.f2935a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f2935a.get(i);
            String m1890s = C0538w.m1890s(view);
            if (m1890s != null) {
                Iterator it = this.f2936b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (m1890s.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                C0538w.m1854a(view, str);
            }
        }
    }
}
