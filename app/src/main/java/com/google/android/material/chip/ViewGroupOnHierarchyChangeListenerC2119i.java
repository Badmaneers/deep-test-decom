package com.google.android.material.chip;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ChipGroup.java */
/* renamed from: com.google.android.material.chip.i */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC2119i implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    final /* synthetic */ ChipGroup f9504a;

    /* renamed from: b */
    private ViewGroup.OnHierarchyChangeListener f9505b;

    private ViewGroupOnHierarchyChangeListenerC2119i(ChipGroup chipGroup) {
        this.f9504a = chipGroup;
    }

    public /* synthetic */ ViewGroupOnHierarchyChangeListenerC2119i(ChipGroup chipGroup, byte b) {
        this(chipGroup);
    }

    /* renamed from: a */
    public static /* synthetic */ ViewGroup.OnHierarchyChangeListener m6767a(ViewGroupOnHierarchyChangeListenerC2119i viewGroupOnHierarchyChangeListenerC2119i, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        viewGroupOnHierarchyChangeListenerC2119i.f9505b = onHierarchyChangeListener;
        return onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        C2116f c2116f;
        int hashCode;
        if (view == this.f9504a && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                if (Build.VERSION.SDK_INT >= 17) {
                    hashCode = View.generateViewId();
                } else {
                    hashCode = view2.hashCode();
                }
                view2.setId(hashCode);
            }
            c2116f = this.f9504a.f9432g;
            ((Chip) view2).setOnCheckedChangeListenerInternal(c2116f);
        }
        if (this.f9505b != null) {
            this.f9505b.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.f9504a && (view2 instanceof Chip)) {
            ((Chip) view2).setOnCheckedChangeListenerInternal(null);
        }
        if (this.f9505b != null) {
            this.f9505b.onChildViewRemoved(view, view2);
        }
    }
}
