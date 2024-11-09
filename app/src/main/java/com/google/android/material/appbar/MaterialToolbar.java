package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2299l;
import com.google.android.material.theme.p084a.C2402a;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: e */
    private static final int f9049e = R.style.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9049e), attributeSet, i);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C2295h c2295h = new C2295h();
            c2295h.m7282g(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c2295h.m7276a(context2);
            c2295h.m7288r(C0538w.m1888q(this));
            C0538w.m1846a(this, c2295h);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2299l.m7293a(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C2299l.m7294a(this, f);
    }
}
