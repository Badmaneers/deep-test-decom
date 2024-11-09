package androidx.core.p022e;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* renamed from: androidx.core.e.m */
/* loaded from: classes.dex */
abstract class AbstractC0466m implements InterfaceC0461h {

    /* renamed from: a */
    private final InterfaceC0465l f2267a;

    /* renamed from: a */
    protected abstract boolean mo1610a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0466m(InterfaceC0465l interfaceC0465l) {
        this.f2267a = interfaceC0465l;
    }

    @Override // androidx.core.p022e.InterfaceC0461h
    /* renamed from: a */
    public final boolean mo1606a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (this.f2267a == null) {
            return mo1610a();
        }
        switch (this.f2267a.mo1609a(charSequence, i)) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return mo1610a();
        }
    }
}
