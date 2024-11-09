package com.google.android.material.p072a;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.R;

/* compiled from: ChildrenAlphaProperty.java */
/* renamed from: com.google.android.material.a.d */
/* loaded from: classes.dex */
public final class C2035d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f8979a = new C2035d("childrenAlpha");

    @Override // android.util.Property
    public final /* synthetic */ Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(ViewGroup viewGroup, Float f) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(floatValue);
        }
    }

    private C2035d(String str) {
        super(Float.class, str);
    }
}
