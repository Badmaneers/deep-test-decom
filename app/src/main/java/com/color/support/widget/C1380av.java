package com.color.support.widget;

import android.graphics.Rect;
import android.widget.Button;
import com.color.support.p048c.p049a.C1310a;
import com.color.support.p048c.p049a.InterfaceC1311b;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorInternetLabel.java */
/* renamed from: com.color.support.widget.av */
/* loaded from: classes.dex */
public final class C1380av implements InterfaceC1311b {

    /* renamed from: a */
    final /* synthetic */ ColorInternetLabel f6941a;

    /* renamed from: b */
    private int f6942b = -1;

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final int mo4291a() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1380av(ColorInternetLabel colorInternetLabel) {
        this.f6941a = colorInternetLabel;
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final int mo4292a(float f, float f2) {
        int m4508a;
        m4508a = this.f6941a.m4508a((int) f, (int) f2);
        this.f6942b = m4508a;
        return m4508a;
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final void mo4294a(int i, Rect rect) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        if (i >= 0) {
            arrayList = this.f6941a.f6107p;
            if (arrayList != null) {
                arrayList2 = this.f6941a.f6107p;
                if (i < arrayList2.size()) {
                    arrayList3 = this.f6941a.f6107p;
                    int m4910e = ((C1381aw) arrayList3.get(i)).m4910e();
                    arrayList4 = this.f6941a.f6107p;
                    int m4912g = ((C1381aw) arrayList4.get(i)).m4912g();
                    arrayList5 = this.f6941a.f6107p;
                    int m4911f = ((C1381aw) arrayList5.get(i)).m4911f();
                    arrayList6 = this.f6941a.f6107p;
                    int m4913h = ((C1381aw) arrayList6.get(i)).m4913h();
                    if (m4910e > 0 || m4912g > 0) {
                        rect.set(m4910e, m4912g, m4911f, m4913h);
                    }
                }
            }
        }
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: b */
    public final CharSequence mo4296b(int i) {
        ArrayList arrayList;
        arrayList = this.f6941a.f6107p;
        String m4914i = ((C1381aw) arrayList.get(i)).m4914i();
        return m4914i != null ? m4914i : getClass().getSimpleName();
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final void mo4293a(int i) {
        InterfaceC1382ax interfaceC1382ax;
        C1310a c1310a;
        ArrayList arrayList;
        InterfaceC1382ax unused;
        interfaceC1382ax = this.f6941a.f6108q;
        if (interfaceC1382ax != null) {
            unused = this.f6941a.f6108q;
            arrayList = this.f6941a.f6107p;
            arrayList.get(i);
        }
        c1310a = this.f6941a.f6115z;
        c1310a.m2079a(i, 1);
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: b */
    public final int mo4295b() {
        ArrayList arrayList;
        arrayList = this.f6941a.f6107p;
        return arrayList.size();
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: c */
    public final CharSequence mo4297c() {
        return Button.class.getName();
    }
}
