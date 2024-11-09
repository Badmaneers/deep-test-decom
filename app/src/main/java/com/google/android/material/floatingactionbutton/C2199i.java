package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;

/* compiled from: ExtendedFloatingActionButton.java */
/* renamed from: com.google.android.material.floatingactionbutton.i */
/* loaded from: classes.dex */
final class C2199i extends Property<View, Float> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2199i(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Float get(View view) {
        return Float.valueOf(view.getLayoutParams().height);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(View view, Float f) {
        View view2 = view;
        view2.getLayoutParams().height = f.intValue();
        view2.requestLayout();
    }
}