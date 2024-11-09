package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.af */
/* loaded from: classes.dex */
public final class C0065af extends AbstractC0066ag {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f201a;

    /* renamed from: c */
    private final PowerManager f202c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0065af(AppCompatDelegateImpl appCompatDelegateImpl, Context context) {
        super(appCompatDelegateImpl);
        this.f201a = appCompatDelegateImpl;
        this.f202c = (PowerManager) context.getSystemService("power");
    }

    @Override // androidx.appcompat.app.AbstractC0066ag
    /* renamed from: a */
    public final int mo178a() {
        return (Build.VERSION.SDK_INT < 21 || !this.f202c.isPowerSaveMode()) ? 1 : 2;
    }

    @Override // androidx.appcompat.app.AbstractC0066ag
    /* renamed from: b */
    public final void mo179b() {
        this.f201a.m137t();
    }

    @Override // androidx.appcompat.app.AbstractC0066ag
    /* renamed from: c */
    final IntentFilter mo180c() {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }
}
