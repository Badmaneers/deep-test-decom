package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.p006a.p007a.C0057a;
import com.google.android.material.R;
import com.google.android.material.p072a.C2032a;

/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes.dex */
public final class C2362a extends AbstractC2398w {

    /* renamed from: d */
    private final TextWatcher f10522d;

    /* renamed from: e */
    private final InterfaceC2374al f10523e;

    /* renamed from: f */
    private AnimatorSet f10524f;

    /* renamed from: g */
    private ValueAnimator f10525g;

    public C2362a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f10522d = new C2377b(this);
        this.f10523e = new C2378c(this);
    }

    @Override // com.google.android.material.textfield.AbstractC2398w
    /* renamed from: a */
    public final void mo7621a() {
        this.f10573a.setEndIconDrawable(C0057a.m46b(this.f10574b, R.drawable.mtrl_ic_cancel));
        this.f10573a.setEndIconContentDescription(this.f10573a.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f10573a.setEndIconOnClickListener(new ViewOnClickListenerC2380e(this));
        this.f10573a.m7609a(this.f10523e);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C2032a.f8976d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C2384i(this));
        ValueAnimator m7616a = m7616a(0.0f, 1.0f);
        this.f10524f = new AnimatorSet();
        this.f10524f.playTogether(ofFloat, m7616a);
        this.f10524f.addListener(new C2381f(this));
        this.f10525g = m7616a(1.0f, 0.0f);
        this.f10525g.addListener(new C2382g(this));
    }

    @Override // com.google.android.material.textfield.AbstractC2398w
    /* renamed from: a */
    public final void mo7622a(boolean z) {
        if (this.f10573a.getSuffixText() == null) {
            return;
        }
        m7620b(z);
    }

    /* renamed from: b */
    public void m7620b(boolean z) {
        boolean z2 = this.f10573a.m7614c() == z;
        if (z) {
            this.f10525g.cancel();
            this.f10524f.start();
            if (z2) {
                this.f10524f.end();
                return;
            }
            return;
        }
        this.f10524f.cancel();
        this.f10525g.start();
        if (z2) {
            this.f10525g.end();
        }
    }

    /* renamed from: a */
    private ValueAnimator m7616a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C2032a.f8973a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new C2383h(this));
        return ofFloat;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m7619a(Editable editable) {
        return editable.length() > 0;
    }
}
