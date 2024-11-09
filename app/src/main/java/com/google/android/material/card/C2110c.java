package com.google.android.material.card;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialCardViewHelper.java */
/* renamed from: com.google.android.material.card.c */
/* loaded from: classes.dex */
public final class C2110c extends InsetDrawable {

    /* renamed from: a */
    final /* synthetic */ C2109b f9401a;

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2110c(C2109b c2109b, Drawable drawable, int i, int i2, int i3, int i4) {
        super(drawable, i, i2, i3, i4);
        this.f9401a = c2109b;
    }
}
