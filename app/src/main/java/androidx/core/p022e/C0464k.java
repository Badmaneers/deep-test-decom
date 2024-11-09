package androidx.core.p022e;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* renamed from: androidx.core.e.k */
/* loaded from: classes.dex */
final class C0464k implements InterfaceC0465l {

    /* renamed from: a */
    static final C0464k f2266a = new C0464k();

    @Override // androidx.core.p022e.InterfaceC0465l
    /* renamed from: a */
    public final int mo1609a(CharSequence charSequence, int i) {
        int i2 = i + 0;
        int i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            i3 = C0462i.m1608b(Character.getDirectionality(charSequence.charAt(i4)));
        }
        return i3;
    }

    private C0464k() {
    }
}
