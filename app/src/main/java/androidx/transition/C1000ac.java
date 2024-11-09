package androidx.transition;

import android.view.ViewGroup;

/* compiled from: Scene.java */
/* renamed from: androidx.transition.ac */
/* loaded from: classes.dex */
public final class C1000ac {

    /* renamed from: a */
    private ViewGroup f4085a;

    /* renamed from: b */
    private Runnable f4086b;

    /* renamed from: a */
    public final void m3475a() {
        if (m3474a(this.f4085a) != this || this.f4086b == null) {
            return;
        }
        this.f4086b.run();
    }

    /* renamed from: a */
    public static C1000ac m3474a(ViewGroup viewGroup) {
        return (C1000ac) viewGroup.getTag(R.id.transition_current_scene);
    }
}
