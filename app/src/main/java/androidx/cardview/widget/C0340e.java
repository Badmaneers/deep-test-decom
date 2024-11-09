package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CardViewBaseImpl.java */
/* renamed from: androidx.cardview.widget.e */
/* loaded from: classes.dex */
public class C0340e implements InterfaceC0343h {

    /* renamed from: a */
    final RectF f1542a = new RectF();

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: g */
    public final void mo1105g(InterfaceC0342g interfaceC0342g) {
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: a */
    public void mo1091a() {
        C0345j.f1555a = new C0341f(this);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: f */
    public final void mo1104f(InterfaceC0342g interfaceC0342g) {
        Rect rect = new Rect();
        m1108j(interfaceC0342g).getPadding(rect);
        interfaceC0342g.mo1084a((int) Math.ceil(m1108j(interfaceC0342g).m1131d()), (int) Math.ceil(m1108j(interfaceC0342g).m1132e()));
        interfaceC0342g.mo1085a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: h */
    public final void mo1106h(InterfaceC0342g interfaceC0342g) {
        m1108j(interfaceC0342g).m1126a(interfaceC0342g.mo1088b());
        mo1104f(interfaceC0342g);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: a */
    public final void mo1097a(InterfaceC0342g interfaceC0342g, ColorStateList colorStateList) {
        m1108j(interfaceC0342g).m1125a(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: i */
    public final ColorStateList mo1107i(InterfaceC0342g interfaceC0342g) {
        return m1108j(interfaceC0342g).m1133f();
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: a */
    public final void mo1095a(InterfaceC0342g interfaceC0342g, float f) {
        m1108j(interfaceC0342g).m1124a(f);
        mo1104f(interfaceC0342g);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: d */
    public final float mo1102d(InterfaceC0342g interfaceC0342g) {
        return m1108j(interfaceC0342g).m1123a();
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: c */
    public final void mo1101c(InterfaceC0342g interfaceC0342g, float f) {
        m1108j(interfaceC0342g).m1128b(f);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: e */
    public final float mo1103e(InterfaceC0342g interfaceC0342g) {
        return m1108j(interfaceC0342g).m1127b();
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: b */
    public final void mo1099b(InterfaceC0342g interfaceC0342g, float f) {
        m1108j(interfaceC0342g).m1130c(f);
        mo1104f(interfaceC0342g);
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: a */
    public final float mo1094a(InterfaceC0342g interfaceC0342g) {
        return m1108j(interfaceC0342g).m1129c();
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: b */
    public final float mo1098b(InterfaceC0342g interfaceC0342g) {
        return m1108j(interfaceC0342g).m1131d();
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: c */
    public final float mo1100c(InterfaceC0342g interfaceC0342g) {
        return m1108j(interfaceC0342g).m1132e();
    }

    /* renamed from: j */
    private static C0345j m1108j(InterfaceC0342g interfaceC0342g) {
        return (C0345j) interfaceC0342g.mo1089c();
    }

    @Override // androidx.cardview.widget.InterfaceC0343h
    /* renamed from: a */
    public final void mo1096a(InterfaceC0342g interfaceC0342g, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0345j c0345j = new C0345j(context.getResources(), colorStateList, f, f2, f3);
        c0345j.m1126a(interfaceC0342g.mo1088b());
        interfaceC0342g.mo1086a(c0345j);
        mo1104f(interfaceC0342g);
    }
}
