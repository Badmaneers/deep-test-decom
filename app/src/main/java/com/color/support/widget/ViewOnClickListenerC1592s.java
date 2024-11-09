package com.color.support.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import androidx.core.p024g.p025a.C0482c;
import androidx.customview.p027a.AbstractC0582a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: ColorEditText.java */
/* renamed from: com.color.support.widget.s */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1592s extends AbstractC0582a implements View.OnClickListener {

    /* renamed from: c */
    final /* synthetic */ ColorEditText f7576c;

    /* renamed from: d */
    private View f7577d;

    /* renamed from: e */
    private Context f7578e;

    /* renamed from: f */
    private Rect f7579f;

    /* renamed from: g */
    private Rect f7580g;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC1592s(ColorEditText colorEditText, View view) {
        super(view);
        this.f7576c = colorEditText;
        this.f7577d = null;
        this.f7578e = null;
        this.f7579f = null;
        this.f7580g = null;
        this.f7577d = view;
        this.f7578e = this.f7577d.getContext();
    }

    /* renamed from: b */
    private void m5337b() {
        this.f7579f = new Rect();
        this.f7579f.left = this.f7576c.getDeleteButtonLeft();
        this.f7579f.right = this.f7576c.getWidth();
        this.f7579f.top = 0;
        this.f7579f.bottom = this.f7576c.getHeight();
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final int mo2070a(float f, float f2) {
        if (this.f7579f == null) {
            m5337b();
        }
        if (f < this.f7579f.left || f > this.f7579f.right || f2 < this.f7579f.top || f2 > this.f7579f.bottom || !this.f7576c.m4486a()) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        return 0;
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2073a(int i, AccessibilityEvent accessibilityEvent) {
        String str;
        str = this.f7576c.f6026p;
        accessibilityEvent.setContentDescription(str);
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2074a(int i, C0482c c0482c) {
        Rect rect;
        String str;
        if (i == 0) {
            str = this.f7576c.f6026p;
            c0482c.m1676e(str);
            c0482c.m1660b((CharSequence) Button.class.getName());
            c0482c.m1646a(16);
        }
        if (i == 0) {
            if (this.f7579f == null) {
                m5337b();
            }
            rect = this.f7579f;
        } else {
            rect = new Rect();
        }
        c0482c.m1657b(rect);
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2077a(List<Integer> list) {
        if (this.f7576c.m4486a()) {
            list.add(0);
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: b */
    protected final boolean mo2084b(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        if (i != 0 || !this.f7576c.m4486a()) {
            return true;
        }
        this.f7576c.m4470b();
        return true;
    }
}
