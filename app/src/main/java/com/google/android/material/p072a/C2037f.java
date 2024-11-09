package com.google.android.material.p072a;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: ImageMatrixProperty.java */
/* renamed from: com.google.android.material.a.f */
/* loaded from: classes.dex */
public final class C2037f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f8982a;

    @Override // android.util.Property
    public final /* synthetic */ Matrix get(ImageView imageView) {
        this.f8982a.set(imageView.getImageMatrix());
        return this.f8982a;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    public C2037f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f8982a = new Matrix();
    }
}
