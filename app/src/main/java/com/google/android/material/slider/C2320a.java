package com.google.android.material.slider;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.p083l.C2314a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.java */
/* renamed from: com.google.android.material.slider.a */
/* loaded from: classes.dex */
public final class C2320a implements InterfaceC2325f {

    /* renamed from: a */
    final /* synthetic */ AttributeSet f10263a;

    /* renamed from: b */
    final /* synthetic */ int f10264b;

    /* renamed from: c */
    final /* synthetic */ Slider f10265c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2320a(Slider slider, AttributeSet attributeSet, int i) {
        this.f10265c = slider;
        this.f10263a = attributeSet;
        this.f10264b = i;
    }

    @Override // com.google.android.material.slider.InterfaceC2325f
    /* renamed from: a */
    public final C2314a mo7427a() {
        int i;
        C2314a m7376a;
        Context context = this.f10265c.getContext();
        AttributeSet attributeSet = this.f10263a;
        int[] iArr = R.styleable.Slider;
        int i2 = this.f10264b;
        i = Slider.f10213b;
        TypedArray m7095a = C2243al.m7095a(context, attributeSet, iArr, i2, i, new int[0]);
        m7376a = C2314a.m7376a(this.f10265c.getContext(), m7095a.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip));
        m7095a.recycle();
        return m7376a;
    }
}
