package androidx.appcompat.app;

import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.ai */
/* loaded from: classes.dex */
public final class C0068ai extends AbstractC0066ag {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f206a;

    /* renamed from: c */
    private final C0080au f207c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0068ai(AppCompatDelegateImpl appCompatDelegateImpl, C0080au c0080au) {
        super(appCompatDelegateImpl);
        this.f206a = appCompatDelegateImpl;
        this.f207c = c0080au;
    }

    @Override // androidx.appcompat.app.AbstractC0066ag
    /* renamed from: a */
    public final int mo178a() {
        return this.f207c.m194a() ? 2 : 1;
    }

    @Override // androidx.appcompat.app.AbstractC0066ag
    /* renamed from: b */
    public final void mo179b() {
        this.f206a.m137t();
    }

    @Override // androidx.appcompat.app.AbstractC0066ag
    /* renamed from: c */
    final IntentFilter mo180c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }
}
