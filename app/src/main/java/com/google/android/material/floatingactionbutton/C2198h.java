package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;

/* compiled from: ExtendedFloatingActionButton.java */
/* renamed from: com.google.android.material.floatingactionbutton.h */
/* loaded from: classes.dex */
final class C2198h extends Property<View, Float> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2198h(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Float get(View view) {
        return Float.valueOf(view.getLayoutParams().width);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(View view, Float f) {
        View view2 = view;
        view2.getLayoutParams().width = f.intValue();
        view2.requestLayout();
    }
}
