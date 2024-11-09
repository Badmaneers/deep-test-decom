package com.color.support.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import color.support.p043v7.appcompat.R;

/* compiled from: ColorSlideMenuItem.java */
/* renamed from: com.color.support.widget.eb */
/* loaded from: classes.dex */
public final class C1468eb {

    /* renamed from: b */
    private Context f7110b;

    /* renamed from: c */
    private Drawable f7111c;

    /* renamed from: d */
    private Drawable f7112d;

    /* renamed from: f */
    private int f7114f;

    /* renamed from: a */
    int[] f7109a = {R.drawable.color_slide_delete_background, R.drawable.color_slide_copy_background, R.drawable.color_slide_rename_background};

    /* renamed from: e */
    private CharSequence f7113e = null;

    public C1468eb(Context context, Drawable drawable) {
        this.f7114f = 54;
        this.f7110b = context;
        this.f7112d = drawable;
        this.f7111c = context.getResources().getDrawable(R.drawable.color_slide_copy_background);
        this.f7114f = this.f7110b.getResources().getDimensionPixelSize(R.dimen.color_slideview_menuitem_width);
    }

    /* renamed from: a */
    public final CharSequence m5001a() {
        return this.f7113e;
    }

    /* renamed from: a */
    public final void m5004a(CharSequence charSequence) {
        this.f7113e = charSequence;
    }

    /* renamed from: a */
    public final void m5002a(int i) {
        this.f7114f = i;
    }

    /* renamed from: b */
    public final int m5005b() {
        return this.f7114f;
    }

    /* renamed from: a */
    public final void m5003a(Drawable drawable) {
        this.f7112d = drawable;
    }

    /* renamed from: b */
    public final void m5006b(int i) {
        this.f7112d = this.f7110b.getResources().getDrawable(i);
    }

    /* renamed from: c */
    public final Drawable m5007c() {
        return this.f7112d;
    }
}
