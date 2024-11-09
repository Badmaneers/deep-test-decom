package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0276dn;
import com.google.android.material.R;

/* loaded from: classes.dex */
public class TabItem extends View {

    /* renamed from: a */
    public final CharSequence f10340a;

    /* renamed from: b */
    public final Drawable f10341b;

    /* renamed from: c */
    public final int f10342c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0276dn m943a = C0276dn.m943a(context, attributeSet, R.styleable.TabItem);
        this.f10340a = m943a.m954c(R.styleable.TabItem_android_text);
        this.f10341b = m943a.m948a(R.styleable.TabItem_android_icon);
        this.f10342c = m943a.m962g(R.styleable.TabItem_android_layout, 0);
        m943a.m952b();
    }
}
