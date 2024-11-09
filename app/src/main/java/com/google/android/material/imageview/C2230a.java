package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.InterfaceC2290c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeableImageView.java */
@TargetApi(21)
/* renamed from: com.google.android.material.imageview.a */
/* loaded from: classes.dex */
public final class C2230a extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ ShapeableImageView f9866a;

    /* renamed from: b */
    private Rect f9867b = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2230a(ShapeableImageView shapeableImageView) {
        this.f9866a = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C2303p c2303p;
        C2303p c2303p2;
        RectF rectF;
        RectF rectF2;
        C2303p c2303p3;
        RectF rectF3;
        c2303p = this.f9866a.f9863i;
        if (c2303p != null) {
            c2303p2 = this.f9866a.f9863i;
            rectF = this.f9866a.f9857c;
            if (c2303p2.m7303a(rectF)) {
                rectF2 = this.f9866a.f9857c;
                rectF2.round(this.f9867b);
                c2303p3 = this.f9866a.f9863i;
                InterfaceC2290c m7311i = c2303p3.m7311i();
                rectF3 = this.f9866a.f9857c;
                outline.setRoundRect(this.f9867b, m7311i.mo7225a(rectF3));
            }
        }
    }
}
