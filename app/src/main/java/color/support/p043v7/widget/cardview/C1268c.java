package color.support.p043v7.widget.cardview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: CardViewApi21Impl.java */
/* renamed from: color.support.v7.widget.cardview.c */
/* loaded from: classes.dex */
final class C1268c implements InterfaceC1272g {
    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: a */
    public final void mo4148a() {
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: a */
    public final void mo4154a(InterfaceC1271f interfaceC1271f, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        interfaceC1271f.mo4170a(new C1274i(colorStateList, f));
        View mo4173d = interfaceC1271f.mo4173d();
        mo4173d.setClipToOutline(true);
        mo4173d.setElevation(f2);
        mo4157b(interfaceC1271f, f3);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: a */
    public final void mo4153a(InterfaceC1271f interfaceC1271f, float f) {
        m4151j(interfaceC1271f).m4178a(f);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: b */
    public final void mo4157b(InterfaceC1271f interfaceC1271f, float f) {
        m4151j(interfaceC1271f).m4179a(f, interfaceC1271f.mo4171b(), interfaceC1271f.mo4172c());
        m4150i(interfaceC1271f);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: a */
    public final float mo4152a(InterfaceC1271f interfaceC1271f) {
        return m4151j(interfaceC1271f).m4177a();
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: d */
    public final float mo4160d(InterfaceC1271f interfaceC1271f) {
        return m4151j(interfaceC1271f).m4181b();
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: c */
    public final void mo4159c(InterfaceC1271f interfaceC1271f, float f) {
        interfaceC1271f.mo4173d().setElevation(f);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: e */
    public final float mo4161e(InterfaceC1271f interfaceC1271f) {
        return interfaceC1271f.mo4173d().getElevation();
    }

    /* renamed from: i */
    private static void m4150i(InterfaceC1271f interfaceC1271f) {
        if (!interfaceC1271f.mo4171b()) {
            interfaceC1271f.mo4169a(0, 0, 0, 0);
            return;
        }
        float m4177a = m4151j(interfaceC1271f).m4177a();
        float m4181b = m4151j(interfaceC1271f).m4181b();
        int ceil = (int) Math.ceil(C1275j.m4185b(m4177a, m4181b, interfaceC1271f.mo4172c()));
        int ceil2 = (int) Math.ceil(C1275j.m4183a(m4177a, m4181b, interfaceC1271f.mo4172c()));
        interfaceC1271f.mo4169a(ceil, ceil2, ceil, ceil2);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: a */
    public final void mo4155a(InterfaceC1271f interfaceC1271f, ColorStateList colorStateList) {
        m4151j(interfaceC1271f).m4180a(colorStateList);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: h */
    public final ColorStateList mo4164h(InterfaceC1271f interfaceC1271f) {
        return m4151j(interfaceC1271f).m4182c();
    }

    /* renamed from: j */
    private static C1274i m4151j(InterfaceC1271f interfaceC1271f) {
        return (C1274i) interfaceC1271f.mo4167a();
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: b */
    public final float mo4156b(InterfaceC1271f interfaceC1271f) {
        return m4151j(interfaceC1271f).m4181b() * 2.0f;
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: c */
    public final float mo4158c(InterfaceC1271f interfaceC1271f) {
        return m4151j(interfaceC1271f).m4181b() * 2.0f;
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: f */
    public final void mo4162f(InterfaceC1271f interfaceC1271f) {
        mo4157b(interfaceC1271f, m4151j(interfaceC1271f).m4177a());
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1272g
    /* renamed from: g */
    public final void mo4163g(InterfaceC1271f interfaceC1271f) {
        mo4157b(interfaceC1271f, m4151j(interfaceC1271f).m4177a());
    }
}
