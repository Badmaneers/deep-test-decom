package com.color.support.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;
import androidx.customview.p027a.AbstractC0582a;
import color.support.p043v7.appcompat.R;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLockPatternView.java */
/* renamed from: com.color.support.widget.bw */
/* loaded from: classes.dex */
public final class C1408bw extends AbstractC0582a {

    /* renamed from: c */
    final /* synthetic */ ColorLockPatternView f6999c;

    /* renamed from: d */
    private Rect f7000d;

    /* renamed from: e */
    private final SparseArray<C1409bx> f7001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408bw(ColorLockPatternView colorLockPatternView, View view) {
        super(view);
        this.f6999c = colorLockPatternView;
        this.f7000d = new Rect();
        this.f7001e = new SparseArray<>();
        for (int i = 1; i < 10; i++) {
            this.f7001e.put(i, new C1409bx(this, m4923e(i)));
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2077a(List<Integer> list) {
        boolean z;
        z = this.f6999c.f6223q;
        if (z) {
            for (int i = 1; i < 10; i++) {
                list.add(Integer.valueOf(i));
            }
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2073a(int i, AccessibilityEvent accessibilityEvent) {
        C1409bx c1409bx = this.f7001e.get(i);
        if (c1409bx != null) {
            accessibilityEvent.getText().add(c1409bx.f7002a);
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2074a(int i, C0482c c0482c) {
        boolean z;
        float m4543b;
        float m4551c;
        float f;
        float f2;
        float f3;
        float f4;
        C1405bt[][] unused;
        c0482c.m1668c(m4923e(i));
        c0482c.m1676e(m4923e(i));
        z = this.f6999c.f6223q;
        if (z) {
            c0482c.m1669c(true);
            if (m4922d(i)) {
                c0482c.m1649a(C0483d.f2303e);
                c0482c.m1685h(m4922d(i));
            }
        }
        int i2 = i - 1;
        Rect rect = this.f7000d;
        int i3 = i2 / 3;
        unused = this.f6999c.f6207a;
        m4543b = this.f6999c.m4543b(i2 % 3);
        m4551c = this.f6999c.m4551c(i3);
        f = this.f6999c.f6226t;
        f2 = this.f6999c.f6224r;
        float f5 = f * f2 * 0.5f;
        f3 = this.f6999c.f6225s;
        f4 = this.f6999c.f6224r;
        float f6 = f3 * f4 * 0.5f;
        rect.left = (int) (m4543b - f6);
        rect.right = (int) (m4543b + f6);
        rect.top = (int) (m4551c - f5);
        rect.bottom = (int) (m4551c + f5);
        c0482c.m1657b(rect);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: c */
    public final void mo1630c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.mo1630c(view, accessibilityEvent);
        z = this.f6999c.f6223q;
        if (z) {
            return;
        }
        accessibilityEvent.setContentDescription(this.f6999c.getContext().getText(R.string.lockscreen_access_pattern_area));
    }

    /* renamed from: d */
    private boolean m4922d(int i) {
        boolean[][] zArr;
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        int i2 = i - 1;
        zArr = this.f6999c.f6215i;
        return !zArr[i2 / 3][i2 % 3];
    }

    /* renamed from: e */
    private CharSequence m4923e(int i) {
        return this.f6999c.getResources().getString(R.string.lockscreen_access_pattern_cell_added_verbose, String.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:            r2 = r1.f6999c.m4545b(r2);     */
    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final int mo2070a(float r2, float r3) {
        /*
            r1 = this;
            com.color.support.widget.ColorLockPatternView r0 = r1.f6999c
            int r3 = com.color.support.widget.ColorLockPatternView.m4546b(r0, r3)
            if (r3 < 0) goto L22
            com.color.support.widget.ColorLockPatternView r0 = r1.f6999c
            int r2 = com.color.support.widget.ColorLockPatternView.m4553c(r0, r2)
            if (r2 < 0) goto L22
            com.color.support.widget.ColorLockPatternView r1 = r1.f6999c
            boolean[][] r1 = com.color.support.widget.ColorLockPatternView.m4557g(r1)
            r1 = r1[r3]
            boolean r1 = r1[r2]
            int r3 = r3 * 3
            int r3 = r3 + r2
            int r3 = r3 + 1
            if (r1 == 0) goto L22
            return r3
        L22:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.C1408bw.mo2070a(float, float):int");
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: b */
    protected final boolean mo2084b(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        m2072a(i);
        m2079a(i, 1);
        return true;
    }
}
