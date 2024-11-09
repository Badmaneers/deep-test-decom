package androidx.activity;

/* compiled from: OnBackPressedDispatcher.java */
/* renamed from: androidx.activity.e */
/* loaded from: classes.dex */
final class C0055e implements InterfaceC0051a {

    /* renamed from: a */
    final /* synthetic */ OnBackPressedDispatcher f56a;

    /* renamed from: b */
    private final AbstractC0054d f57b;

    public C0055e(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC0054d abstractC0054d) {
        this.f56a = onBackPressedDispatcher;
        this.f57b = abstractC0054d;
    }

    @Override // androidx.activity.InterfaceC0051a
    /* renamed from: a */
    public final void mo38a() {
        this.f56a.f45a.remove(this.f57b);
        this.f57b.m43b(this);
    }
}
