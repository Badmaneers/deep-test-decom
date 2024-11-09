package com.color.support.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.p025a.C0482c;
import androidx.customview.p027a.AbstractC0582a;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSimpleLock.java */
/* renamed from: com.color.support.widget.ea */
/* loaded from: classes.dex */
public final class C1467ea extends AbstractC0582a {

    /* renamed from: c */
    final /* synthetic */ ColorSimpleLock f7107c;

    /* renamed from: d */
    private Rect f7108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1467ea(ColorSimpleLock colorSimpleLock, View view) {
        super(view);
        this.f7107c = colorSimpleLock;
        this.f7108d = new Rect();
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final int mo2070a(float f, float f2) {
        int i;
        int i2;
        if (f < 0.0f) {
            return -2;
        }
        i = this.f7107c.f6532v;
        if (f > i || f2 < 0.0f) {
            return -2;
        }
        i2 = this.f7107c.f6528r;
        return f2 <= ((float) i2) ? 0 : -2;
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2077a(List<Integer> list) {
        for (int i = 0; i <= 0; i++) {
            list.add(0);
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2073a(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.getText().add(m5000b());
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2074a(int i, C0482c c0482c) {
        int i2;
        int i3;
        c0482c.m1676e(m5000b());
        c0482c.m1646a(16);
        Rect rect = this.f7108d;
        if (i >= 0 && i <= 0) {
            i2 = this.f7107c.f6532v;
            i3 = this.f7107c.f6528r;
            rect.set(0, 0, i2, i3);
        }
        c0482c.m1657b(this.f7108d);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: c */
    public final void mo1630c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1630c(view, accessibilityEvent);
    }

    /* renamed from: b */
    private CharSequence m5000b() {
        String str;
        LinkedList linkedList;
        String str2;
        int i;
        LinkedList linkedList2;
        String str3;
        str = this.f7107c.f6508Q;
        if (str != null) {
            linkedList = this.f7107c.f6506O;
            if (linkedList != null) {
                ColorSimpleLock colorSimpleLock = this.f7107c;
                str2 = this.f7107c.f6508Q;
                i = this.f7107c.f6505N;
                colorSimpleLock.f6508Q = str2.replace('y', String.valueOf(i).charAt(0));
                linkedList2 = this.f7107c.f6506O;
                int size = linkedList2.size();
                str3 = this.f7107c.f6508Q;
                return str3.replace('x', String.valueOf(size).charAt(0));
            }
        }
        return getClass().getSimpleName();
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: b */
    protected final boolean mo2084b(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        m2079a(i, 1);
        return false;
    }
}
