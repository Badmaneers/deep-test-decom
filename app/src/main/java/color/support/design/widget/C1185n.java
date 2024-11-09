package color.support.design.widget;

import androidx.viewpager.widget.InterfaceC1108o;
import java.lang.ref.WeakReference;

/* compiled from: ColorTabLayout.java */
/* renamed from: color.support.design.widget.n */
/* loaded from: classes.dex */
public final class C1185n implements InterfaceC1108o {

    /* renamed from: a */
    private final WeakReference<ColorTabLayout> f4818a;

    /* renamed from: b */
    private int f4819b;

    /* renamed from: c */
    private int f4820c;

    public C1185n(ColorTabLayout colorTabLayout) {
        this.f4818a = new WeakReference<>(colorTabLayout);
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: b */
    public final void mo3707b(int i) {
        this.f4819b = this.f4820c;
        this.f4820c = i;
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: a */
    public final void mo3705a(int i, float f) {
        ColorTabLayout colorTabLayout = this.f4818a.get();
        if (colorTabLayout != null) {
            colorTabLayout.m3861a(i, f, this.f4820c != 2 || this.f4819b == 1, (this.f4820c == 2 && this.f4819b == 0) ? false : true);
        }
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: a */
    public final void mo3704a(int i) {
        ColorTabLayout colorTabLayout = this.f4818a.get();
        if (colorTabLayout == null || colorTabLayout.getSelectedTabPosition() == i || i >= colorTabLayout.getTabCount()) {
            return;
        }
        colorTabLayout.m3864a(colorTabLayout.m3859a(i), this.f4820c == 0 || (this.f4820c == 2 && this.f4819b == 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3930a() {
        this.f4820c = 0;
        this.f4819b = 0;
    }
}
