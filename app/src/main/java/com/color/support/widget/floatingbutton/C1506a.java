package com.color.support.widget.floatingbutton;

/* compiled from: ColorFloatingButton.java */
/* renamed from: com.color.support.widget.floatingbutton.a */
/* loaded from: classes.dex */
final class C1506a implements InterfaceC1517l {

    /* renamed from: a */
    final /* synthetic */ ColorFloatingButton f7231a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1506a(ColorFloatingButton colorFloatingButton) {
        this.f7231a = colorFloatingButton;
    }

    @Override // com.color.support.widget.floatingbutton.InterfaceC1517l
    /* renamed from: a */
    public final boolean mo5133a(ColorFloatingButtonItem colorFloatingButtonItem) {
        InterfaceC1517l interfaceC1517l;
        InterfaceC1517l interfaceC1517l2;
        interfaceC1517l = this.f7231a.f7197u;
        if (interfaceC1517l == null) {
            return false;
        }
        interfaceC1517l2 = this.f7231a.f7197u;
        boolean mo5133a = interfaceC1517l2.mo5133a(colorFloatingButtonItem);
        if (!mo5133a) {
            this.f7231a.m5085c();
        }
        return mo5133a;
    }
}
