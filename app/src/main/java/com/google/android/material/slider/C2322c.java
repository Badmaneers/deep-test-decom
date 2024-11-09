package com.google.android.material.slider;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.widget.SeekBar;
import androidx.core.p018b.C0418a;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;
import androidx.core.p024g.p025a.C0486g;
import androidx.customview.p027a.AbstractC0582a;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.java */
/* renamed from: com.google.android.material.slider.c */
/* loaded from: classes.dex */
public final class C2322c extends AbstractC0582a {

    /* renamed from: c */
    Rect f10268c;

    /* renamed from: d */
    final /* synthetic */ Slider f10269d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2322c(Slider slider) {
        super(slider);
        this.f10269d = slider;
        this.f10268c = new Rect();
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final int mo2070a(float f, float f2) {
        for (int i = 0; i < this.f10269d.getValues().size(); i++) {
            m7428d(i);
            if (this.f10268c.contains((int) f, (int) f2)) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2077a(List<Integer> list) {
        for (int i = 0; i < this.f10269d.getValues().size(); i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2074a(int i, C0482c c0482c) {
        float f;
        float f2;
        ArrayList arrayList;
        String m7408d;
        String m7408d2;
        float f3;
        float f4;
        c0482c.m1649a(C0483d.f2295H);
        float floatValue = this.f10269d.getValues().get(i).floatValue();
        if (this.f10269d.isEnabled()) {
            f3 = this.f10269d.f10216C;
            if (floatValue > f3) {
                c0482c.m1646a(8192);
            }
            f4 = this.f10269d.f10217D;
            if (floatValue < f4) {
                c0482c.m1646a(4096);
            }
        }
        f = this.f10269d.f10216C;
        f2 = this.f10269d.f10217D;
        c0482c.m1650a(C0486g.m1716a(f, f2, floatValue));
        c0482c.m1660b((CharSequence) SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (this.f10269d.getContentDescription() != null) {
            sb.append(this.f10269d.getContentDescription());
            sb.append(",");
        }
        arrayList = this.f10269d.f10218E;
        if (arrayList.size() > 1) {
            Context context = this.f10269d.getContext();
            int i2 = R.string.mtrl_slider_range_content_description;
            m7408d = this.f10269d.m7408d(this.f10269d.getMinimumValue());
            m7408d2 = this.f10269d.m7408d(this.f10269d.getMaximumValue());
            sb.append(context.getString(i2, m7408d, m7408d2));
        }
        c0482c.m1676e(sb.toString());
        m7428d(i);
        c0482c.m1657b(this.f10268c);
    }

    /* renamed from: d */
    private void m7428d(int i) {
        int i2;
        float m7387a;
        int i3;
        int m7415g;
        int i4;
        int i5;
        int i6;
        int i7;
        i2 = this.f10269d.f10251t;
        m7387a = this.f10269d.m7387a(this.f10269d.getValues().get(i).floatValue());
        i3 = this.f10269d.f10223J;
        int i8 = i2 + ((int) (m7387a * i3));
        m7415g = this.f10269d.m7415g();
        Rect rect = this.f10268c;
        i4 = this.f10269d.f10253v;
        i5 = this.f10269d.f10253v;
        i6 = this.f10269d.f10253v;
        i7 = this.f10269d.f10253v;
        rect.set(i8 - i4, m7415g - i5, i8 + i6, m7415g + i7);
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: b */
    protected final boolean mo2084b(int i, int i2, Bundle bundle) {
        float m7426n;
        ArrayList arrayList;
        float f;
        float f2;
        boolean m7397a;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean m7397a2;
        if (!this.f10269d.isEnabled()) {
            return false;
        }
        if (i2 == 4096 || i2 == 8192) {
            m7426n = this.f10269d.m7426n();
            if (i2 == 8192) {
                m7426n = -m7426n;
            }
            if (C0538w.m1878h(this.f10269d) == 1) {
                m7426n = -m7426n;
            }
            arrayList = this.f10269d.f10218E;
            float floatValue = ((Float) arrayList.get(i)).floatValue() + m7426n;
            f = this.f10269d.f10216C;
            f2 = this.f10269d.f10217D;
            float m1477a = C0418a.m1477a(floatValue, f, f2);
            m7397a = this.f10269d.m7397a(i, m1477a);
            if (!m7397a) {
                return false;
            }
            this.f10269d.m7414f();
            this.f10269d.postInvalidate();
            arrayList2 = this.f10269d.f10218E;
            if (arrayList2.indexOf(Float.valueOf(m1477a)) != i) {
                arrayList3 = this.f10269d.f10218E;
                m2079a(arrayList3.indexOf(Float.valueOf(m1477a)), 8);
            } else {
                m2072a(i);
            }
            return true;
        }
        if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
            return false;
        }
        m7397a2 = this.f10269d.m7397a(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
        if (!m7397a2) {
            return false;
        }
        this.f10269d.m7414f();
        this.f10269d.postInvalidate();
        m2072a(i);
        return true;
    }
}
