package androidx.transition;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ViewOverlayApi14.java */
/* renamed from: androidx.transition.bb */
/* loaded from: classes.dex */
public class C1026bb implements InterfaceC1029be {

    /* renamed from: a */
    protected C1027bc f4163a;

    public C1026bb(Context context, ViewGroup viewGroup, View view) {
        this.f4163a = new C1027bc(context, viewGroup, view, this);
    }

    @Override // androidx.transition.InterfaceC1029be
    /* renamed from: a */
    public final void mo3540a(Drawable drawable) {
        this.f4163a.m3548a(drawable);
    }

    @Override // androidx.transition.InterfaceC1029be
    /* renamed from: b */
    public final void mo3541b(Drawable drawable) {
        this.f4163a.m3550b(drawable);
    }

    /* renamed from: c */
    public static C1026bb m3545c(View view) {
        ViewGroup viewGroup;
        View view2 = view;
        while (true) {
            if (view2 == null) {
                viewGroup = null;
                break;
            }
            if (view2.getId() == 16908290 && (view2 instanceof ViewGroup)) {
                viewGroup = (ViewGroup) view2;
                break;
            }
            if (view2.getParent() instanceof ViewGroup) {
                view2 = (ViewGroup) view2.getParent();
            }
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C1027bc) {
                return ((C1027bc) childAt).f4168e;
            }
        }
        return new C1019av(viewGroup.getContext(), viewGroup, view);
    }
}
