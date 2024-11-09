package com.color.support.widget.seekbar;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.p025a.C0482c;
import androidx.customview.p027a.AbstractC0582a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorAbsorbSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.h */
/* loaded from: classes.dex */
public final class C1600h extends AbstractC0582a {

    /* renamed from: c */
    final /* synthetic */ ColorAbsorbSeekBar f7713c;

    /* renamed from: d */
    private Rect f7714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600h(ColorAbsorbSeekBar colorAbsorbSeekBar, View view) {
        super(view);
        this.f7713c = colorAbsorbSeekBar;
        this.f7714d = new Rect();
    }

    @Override // androidx.customview.p027a.AbstractC0582a, androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        super.mo1626a(view, c0482c);
        if (this.f7713c.isEnabled()) {
            int progress = this.f7713c.getProgress();
            if (progress > 0) {
                c0482c.m1646a(8192);
            }
            if (progress < this.f7713c.getMax()) {
                c0482c.m1646a(4096);
            }
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final int mo2070a(float f, float f2) {
        return (f < 0.0f || f > ((float) this.f7713c.getWidth()) || f2 < 0.0f || f2 > ((float) this.f7713c.getHeight())) ? -1 : 0;
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
        i2 = this.f7713c.f7599f;
        accessibilityEvent.setItemCount(i2);
        i3 = this.f7713c.f7598e;
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
        i2 = this.f7713c.f7598e;
        sb.append(i2);
        c0482c.m1676e(sb.toString());
        c0482c.m1660b((CharSequence) ColorAbsorbSeekBar.class.getName());
        Rect rect = this.f7714d;
        rect.left = 0;
        rect.top = 0;
        rect.right = this.f7713c.getWidth();
        rect.bottom = this.f7713c.getHeight();
        c0482c.m1657b(rect);
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: b */
    protected final boolean mo2084b(int i, int i2, Bundle bundle) {
        m2079a(i, 4);
        return false;
    }
}
