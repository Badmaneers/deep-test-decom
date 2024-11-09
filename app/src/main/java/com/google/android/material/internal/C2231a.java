package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.p025a.C0482c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CheckableImageButton.java */
/* renamed from: com.google.android.material.internal.a */
/* loaded from: classes.dex */
public final class C2231a extends C0479a {

    /* renamed from: a */
    final /* synthetic */ CheckableImageButton f9901a;

    public C2231a(CheckableImageButton checkableImageButton) {
        this.f9901a = checkableImageButton;
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: d */
    public final void mo1631d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1631d(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f9901a.isChecked());
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        super.mo1626a(view, c0482c);
        c0482c.m1654a(this.f9901a.m7069a());
        c0482c.m1662b(this.f9901a.isChecked());
    }
}
