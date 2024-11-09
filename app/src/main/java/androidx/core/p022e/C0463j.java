package androidx.core.p022e;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* renamed from: androidx.core.e.j */
/* loaded from: classes.dex */
final class C0463j implements InterfaceC0465l {

    /* renamed from: a */
    static final C0463j f2264a = new C0463j();

    /* renamed from: b */
    private final boolean f2265b = true;

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0013. Please report as an issue. */
    @Override // androidx.core.p022e.InterfaceC0465l
    /* renamed from: a */
    public final int mo1609a(CharSequence charSequence, int i) {
        int i2 = i + 0;
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            switch (C0462i.m1607a(Character.getDirectionality(charSequence.charAt(i3)))) {
                case 0:
                    if (this.f2265b) {
                        return 0;
                    }
                    z = true;
                case 1:
                    if (!this.f2265b) {
                        return 1;
                    }
                    z = true;
                default:
            }
        }
        if (z) {
            return this.f2265b ? 1 : 0;
        }
        return 2;
    }

    private C0463j() {
    }
}
