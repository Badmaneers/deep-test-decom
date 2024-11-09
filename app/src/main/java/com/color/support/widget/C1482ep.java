package com.color.support.widget;

import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.Button;
import com.color.support.p048c.p049a.C1310a;
import com.color.support.p048c.p049a.InterfaceC1311b;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSupportMenuView.java */
/* renamed from: com.color.support.widget.ep */
/* loaded from: classes.dex */
public final class C1482ep implements InterfaceC1311b {

    /* renamed from: a */
    final /* synthetic */ ColorSupportMenuView f7123a;

    /* renamed from: b */
    private int f7124b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1482ep(ColorSupportMenuView colorSupportMenuView) {
        this.f7123a = colorSupportMenuView;
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final int mo4292a(float f, float f2) {
        int m4753a;
        m4753a = this.f7123a.m4753a((int) f, (int) f2);
        this.f7124b = m4753a;
        return m4753a;
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final void mo4294a(int i, Rect rect) {
        Paint paint;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int unused;
        int unused2;
        paint = this.f7123a.f6621l;
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        i2 = this.f7123a.f6631v;
        i3 = this.f7123a.f6631v;
        i4 = this.f7123a.f6618i;
        int i15 = i3 + i4;
        i5 = this.f7123a.f6614e;
        int i16 = (i2 / 2) + (i15 * (i % i5));
        if (this.f7123a.isLayoutRtl()) {
            int width = this.f7123a.getWidth();
            i10 = this.f7123a.f6618i;
            i11 = this.f7123a.f6631v;
            int i17 = i10 + (i11 / 2);
            i12 = this.f7123a.f6631v;
            i13 = this.f7123a.f6618i;
            int i18 = i12 + i13;
            i14 = this.f7123a.f6614e;
            i16 = width - (i17 + (i18 * (i % i14)));
        }
        i6 = this.f7123a.f6618i;
        int i19 = i6 + i16;
        unused = this.f7123a.f6625p;
        unused2 = this.f7123a.f6614e;
        i7 = this.f7123a.f6614e;
        int i20 = i < i7 ? this.f7123a.f6625p : this.f7123a.f6633x;
        i8 = this.f7123a.f6617h;
        i9 = this.f7123a.f6628s;
        rect.set(i16, i20, i19, (((i8 + i20) + i9) + fontMetricsInt.bottom) - fontMetricsInt.top);
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: b */
    public final CharSequence mo4296b(int i) {
        List list;
        list = this.f7123a.f6615f;
        String m5008a = ((C1480en) list.get(i)).m5008a();
        return m5008a != null ? m5008a : getClass().getSimpleName();
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final void mo4293a(int i) {
        List list;
        C1310a c1310a;
        List list2;
        list = this.f7123a.f6615f;
        if (((C1480en) list.get(i)).m5011c() != null) {
            list2 = this.f7123a.f6615f;
            list2.get(i);
        }
        c1310a = this.f7123a.f6612A;
        c1310a.m2079a(i, 1);
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final int mo4291a() {
        int i;
        i = this.f7123a.f6620k;
        return i;
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: b */
    public final int mo4295b() {
        int i;
        i = this.f7123a.f6629t;
        return i;
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: c */
    public final CharSequence mo4297c() {
        return Button.class.getName();
    }
}
