package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: CardViewApi21Impl.java */
/* renamed from: androidx.cardview.widget.d */
/* loaded from: classes.dex */
public final class C0339d implements InterfaceC0343h {
    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: a */
    public final void mo1091a() {
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: a */
    public final void mo1096a(InterfaceC0342g interfaceC0342g, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        interfaceC0342g.mo1086a(new C0344i(colorStateList, f));
        View mo1090d = interfaceC0342g.mo1090d();
        mo1090d.setClipToOutline(true);
        mo1090d.setElevation(f2);
        mo1099b(interfaceC0342g, f3);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: a */
    public final void mo1095a(InterfaceC0342g interfaceC0342g, float f) {
        m1093j(interfaceC0342g).m1113a(f);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: b */
    public final void mo1099b(InterfaceC0342g interfaceC0342g, float f) {
        m1093j(interfaceC0342g).m1114a(f, interfaceC0342g.mo1087a(), interfaceC0342g.mo1088b());
        mo1104f(interfaceC0342g);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: a */
    public final float mo1094a(InterfaceC0342g interfaceC0342g) {
        return m1093j(interfaceC0342g).m1112a();
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: d */
    public final float mo1102d(InterfaceC0342g interfaceC0342g) {
        return m1093j(interfaceC0342g).m1116b();
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: c */
    public final void mo1101c(InterfaceC0342g interfaceC0342g, float f) {
        interfaceC0342g.mo1090d().setElevation(f);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: e */
    public final float mo1103e(InterfaceC0342g interfaceC0342g) {
        return interfaceC0342g.mo1090d().getElevation();
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: f */
    public final void mo1104f(InterfaceC0342g interfaceC0342g) {
        if (!interfaceC0342g.mo1087a()) {
            interfaceC0342g.mo1085a(0, 0, 0, 0);
            return;
        }
        float m1112a = m1093j(interfaceC0342g).m1112a();
        float m1116b = m1093j(interfaceC0342g).m1116b();
        int ceil = (int) Math.ceil(C0345j.m1120b(m1112a, m1116b, interfaceC0342g.mo1088b()));
        int ceil2 = (int) Math.ceil(C0345j.m1118a(m1112a, m1116b, interfaceC0342g.mo1088b()));
        interfaceC0342g.mo1085a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: a */
    public final void mo1097a(InterfaceC0342g interfaceC0342g, ColorStateList colorStateList) {
        m1093j(interfaceC0342g).m1115a(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: i */
    public final ColorStateList mo1107i(InterfaceC0342g interfaceC0342g) {
        return m1093j(interfaceC0342g).m1117c();
    }

    /* renamed from: j */
    private static C0344i m1093j(InterfaceC0342g interfaceC0342g) {
        return (C0344i) interfaceC0342g.mo1089c();
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: b */
    public final float mo1098b(InterfaceC0342g interfaceC0342g) {
        return m1093j(interfaceC0342g).m1116b() * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: c */
    public final float mo1100c(InterfaceC0342g interfaceC0342g) {
        return m1093j(interfaceC0342g).m1116b() * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: g */
    public final void mo1105g(InterfaceC0342g interfaceC0342g) {
        mo1099b(interfaceC0342g, m1093j(interfaceC0342g).m1112a());
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: h */
    public final void mo1106h(InterfaceC0342g interfaceC0342g) {
        mo1099b(interfaceC0342g, m1093j(interfaceC0342g).m1112a());
    }
}
