package com.color.support.p048c.p049a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.p025a.C0482c;
import androidx.customview.p027a.AbstractC0582a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: ColorViewExplorerByTouchHelper.java */
/* renamed from: com.color.support.c.a.a */
/* loaded from: classes.dex */
public final class C1310a extends AbstractC0582a {

    /* renamed from: c */
    private final Rect f5559c;

    /* renamed from: d */
    private View f5560d;

    /* renamed from: e */
    private InterfaceC1311b f5561e;

    public C1310a(View view) {
        super(view);
        this.f5559c = new Rect();
        this.f5560d = null;
        this.f5561e = null;
        this.f5560d = view;
    }

    /* renamed from: b */
    public final void m4290b() {
        int focusedVirtualView = getFocusedVirtualView();
        if (focusedVirtualView != Integer.MIN_VALUE) {
            mo1623a(this.f5560d).mo1719a(focusedVirtualView, 128, null);
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final int mo2070a(float f, float f2) {
        int mo4292a = this.f5561e.mo4292a(f, f2);
        return mo4292a >= 0 ? mo4292a : RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2077a(List<Integer> list) {
        for (int i = 0; i < this.f5561e.mo4295b(); i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2073a(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription(this.f5561e.mo4296b(i));
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2074a(int i, C0482c c0482c) {
        Rect rect = this.f5559c;
        if (i >= 0 && i < this.f5561e.mo4295b()) {
            this.f5561e.mo4294a(i, rect);
        }
        c0482c.m1676e(this.f5561e.mo4296b(i));
        c0482c.m1657b(this.f5559c);
        if (this.f5561e.mo4297c() != null) {
            c0482c.m1660b(this.f5561e.mo4297c());
        }
        c0482c.m1646a(16);
        if (i == this.f5561e.mo4291a()) {
            c0482c.m1682g(true);
        }
        if (i == -1) {
            c0482c.m1690j(false);
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: b */
    protected final boolean mo2084b(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        this.f5561e.mo4293a(i);
        return true;
    }

    /* renamed from: a */
    public final void m4289a(InterfaceC1311b interfaceC1311b) {
        this.f5561e = interfaceC1311b;
    }
}
