package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransition.java */
/* renamed from: androidx.fragment.app.as */
/* loaded from: classes.dex */
public final class RunnableC0675as implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Object f2882a;

    /* renamed from: b */
    final /* synthetic */ AbstractC0685bb f2883b;

    /* renamed from: c */
    final /* synthetic */ View f2884c;

    /* renamed from: d */
    final /* synthetic */ Fragment f2885d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f2886e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f2887f;

    /* renamed from: g */
    final /* synthetic */ ArrayList f2888g;

    /* renamed from: h */
    final /* synthetic */ Object f2889h;

    public RunnableC0675as(Object obj, AbstractC0685bb abstractC0685bb, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f2882a = obj;
        this.f2883b = abstractC0685bb;
        this.f2884c = view;
        this.f2885d = fragment;
        this.f2886e = arrayList;
        this.f2887f = arrayList2;
        this.f2888g = arrayList3;
        this.f2889h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2882a != null) {
            this.f2883b.mo2415c(this.f2882a, this.f2884c);
            this.f2887f.addAll(C0673aq.m2387a(this.f2883b, this.f2882a, this.f2885d, (ArrayList<View>) this.f2886e, this.f2884c));
        }
        if (this.f2888g != null) {
            if (this.f2889h != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f2884c);
                this.f2883b.mo2413b(this.f2889h, this.f2888g, arrayList);
            }
            this.f2888g.clear();
            this.f2888g.add(this.f2884c);
        }
    }
}
