package color.support.p043v7.widget.cardview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CardViewBaseImpl.java */
/* renamed from: color.support.v7.widget.cardview.d */
/* loaded from: classes.dex */
public class C1269d implements InterfaceC1272g {

    /* renamed from: a */
    private final RectF f5373a = new RectF();

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: f */
    public final void mo4162f(InterfaceC1271f interfaceC1271f) {
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: a */
    public void mo4148a() {
        C1275j.f5388a = new C1270e(this);
    }

    /* renamed from: i */
    private static void m4165i(InterfaceC1271f interfaceC1271f) {
        Rect rect = new Rect();
        m4166j(interfaceC1271f).getPadding(rect);
        interfaceC1271f.mo4168a((int) Math.ceil(m4166j(interfaceC1271f).m4196d()), (int) Math.ceil(m4166j(interfaceC1271f).m4197e()));
        interfaceC1271f.mo4169a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: g */
    public final void mo4163g(InterfaceC1271f interfaceC1271f) {
        m4166j(interfaceC1271f).m4191a(interfaceC1271f.mo4172c());
        m4165i(interfaceC1271f);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: a */
    public final void mo4155a(InterfaceC1271f interfaceC1271f, ColorStateList colorStateList) {
        m4166j(interfaceC1271f).m4190a(colorStateList);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: h */
    public final ColorStateList mo4164h(InterfaceC1271f interfaceC1271f) {
        return m4166j(interfaceC1271f).m4198f();
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: a */
    public final void mo4153a(InterfaceC1271f interfaceC1271f, float f) {
        m4166j(interfaceC1271f).m4189a(f);
        m4165i(interfaceC1271f);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: d */
    public final float mo4160d(InterfaceC1271f interfaceC1271f) {
        return m4166j(interfaceC1271f).m4188a();
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: c */
    public final void mo4159c(InterfaceC1271f interfaceC1271f, float f) {
        m4166j(interfaceC1271f).m4193b(f);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: e */
    public final float mo4161e(InterfaceC1271f interfaceC1271f) {
        return m4166j(interfaceC1271f).m4192b();
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: b */
    public final void mo4157b(InterfaceC1271f interfaceC1271f, float f) {
        m4166j(interfaceC1271f).m4195c(f);
        m4165i(interfaceC1271f);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: a */
    public final float mo4152a(InterfaceC1271f interfaceC1271f) {
        return m4166j(interfaceC1271f).m4194c();
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: b */
    public final float mo4156b(InterfaceC1271f interfaceC1271f) {
        return m4166j(interfaceC1271f).m4196d();
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: c */
    public final float mo4158c(InterfaceC1271f interfaceC1271f) {
        return m4166j(interfaceC1271f).m4197e();
    }

    /* renamed from: j */
    private static C1275j m4166j(InterfaceC1271f interfaceC1271f) {
        return (C1275j) interfaceC1271f.mo4167a();
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: a */
    public final void mo4154a(InterfaceC1271f interfaceC1271f, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1275j c1275j = new C1275j(context.getResources(), colorStateList, f, f2, f3);
        c1275j.m4191a(interfaceC1271f.mo4172c());
        interfaceC1271f.mo4170a(c1275j);
        m4165i(interfaceC1271f);
    }
}
