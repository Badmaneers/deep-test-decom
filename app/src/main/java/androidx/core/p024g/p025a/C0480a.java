package androidx.core.p024g.p025a;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* renamed from: androidx.core.g.a.a */
/* loaded from: classes.dex */
public final class C0480a extends ClickableSpan {

    /* renamed from: a */
    private final int f2281a;

    /* renamed from: b */
    private final C0482c f2282b;

    /* renamed from: c */
    private final int f2283c;

    public C0480a(int i, C0482c c0482c, int i2) {
        this.f2281a = i;
        this.f2282b = c0482c;
        this.f2283c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2281a);
        this.f2282b.m1655a(this.f2283c, bundle);
    }
}
