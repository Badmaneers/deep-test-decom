package com.color.support.widget.seekbar;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.p025a.C0482c;
import androidx.customview.p027a.AbstractC0582a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSectionSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.p */
/* loaded from: classes.dex */
public final class C1608p extends AbstractC0582a {

    /* renamed from: c */
    final /* synthetic */ ColorSectionSeekBar f7721c;

    /* renamed from: d */
    private Rect f7722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608p(ColorSectionSeekBar colorSectionSeekBar, View view) {
        super(view);
        this.f7721c = colorSectionSeekBar;
        this.f7722d = new Rect();
    }

    @Override // androidx.customview.p027a.AbstractC0582a, androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        float f;
        int start;
        int i;
        int i2;
        float f2;
        int end;
        int i3;
        int i4;
        super.mo1626a(view, c0482c);
        if (this.f7721c.isEnabled()) {
            f = this.f7721c.f7659x;
            start = this.f7721c.getStart();
            i = this.f7721c.f7627H;
            int i5 = start + i;
            i2 = this.f7721c.f7649n;
            if (f > i5 - i2) {
                c0482c.m1646a(8192);
            }
            f2 = this.f7721c.f7659x;
            int width = this.f7721c.getWidth();
            end = this.f7721c.getEnd();
            int i6 = width - end;
            i3 = this.f7721c.f7627H;
            i4 = this.f7721c.f7649n;
            if (f2 < i6 - (i3 - i4)) {
                c0482c.m1646a(4096);
            }
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final int mo2070a(float f, float f2) {
        return (f < 0.0f || f > ((float) this.f7721c.getWidth()) || f2 < 0.0f || f2 > ((float) this.f7721c.getHeight())) ? -1 : 0;
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
        int i2;
        int i3;
        accessibilityEvent.getText().add(getClass().getSimpleName());
        i2 = this.f7721c.f7637b;
        accessibilityEvent.setItemCount(i2);
        i3 = this.f7721c.f7640e;
        accessibilityEvent.setCurrentItemIndex(i3);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: c */
    public final void mo1630c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1630c(view, accessibilityEvent);
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2074a(int i, C0482c c0482c) {
        int i2;
        StringBuilder sb = new StringBuilder();
        i2 = this.f7721c.f7640e;
        sb.append(i2);
        c0482c.m1676e(sb.toString());
        c0482c.m1660b((CharSequence) ColorSectionSeekBar.class.getName());
        Rect rect = this.f7722d;
        rect.left = 0;
        rect.top = 0;
        rect.right = this.f7721c.getWidth();
        rect.bottom = this.f7721c.getHeight();
        c0482c.m1657b(rect);
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: b */
    protected final boolean mo2084b(int i, int i2, Bundle bundle) {
        m2079a(i, 4);
        return false;
    }
}
