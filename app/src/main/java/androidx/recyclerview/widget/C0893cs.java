package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* renamed from: androidx.recyclerview.widget.cs */
/* loaded from: classes.dex */
final class C0893cs {

    /* renamed from: a */
    final InterfaceC0895cu f3659a;

    /* renamed from: b */
    C0894ct f3660b = new C0894ct();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0893cs(InterfaceC0895cu interfaceC0895cu) {
        this.f3659a = interfaceC0895cu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final View m3261a(int i, int i2, int i3, int i4) {
        int mo3126a = this.f3659a.mo3126a();
        int mo3129b = this.f3659a.mo3129b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View mo3128a = this.f3659a.mo3128a(i);
            this.f3660b.m3265a(mo3126a, mo3129b, this.f3659a.mo3127a(mo3128a), this.f3659a.mo3130b(mo3128a));
            if (i3 != 0) {
                this.f3660b.f3661a = 0;
                this.f3660b.m3264a(i3);
                if (this.f3660b.m3266a()) {
                    return mo3128a;
                }
            }
            if (i4 != 0) {
                this.f3660b.f3661a = 0;
                this.f3660b.m3264a(i4);
                if (this.f3660b.m3266a()) {
                    view = mo3128a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m3262a(View view) {
        this.f3660b.m3265a(this.f3659a.mo3126a(), this.f3659a.mo3129b(), this.f3659a.mo3127a(view), this.f3659a.mo3130b(view));
        this.f3660b.f3661a = 0;
        this.f3660b.m3264a(24579);
        return this.f3660b.m3266a();
    }
}
