package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.ag */
/* loaded from: classes.dex */
public abstract class AbstractC0066ag {

    /* renamed from: a */
    private BroadcastReceiver f203a;

    /* renamed from: b */
    final /* synthetic */ AppCompatDelegateImpl f204b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo178a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo179b();

    /* renamed from: c */
    abstract IntentFilter mo180c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0066ag(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f204b = appCompatDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m181d() {
        m182e();
        IntentFilter mo180c = mo180c();
        if (mo180c == null || mo180c.countActions() == 0) {
            return;
        }
        if (this.f203a == null) {
            this.f203a = new C0067ah(this);
        }
        this.f204b.f148b.registerReceiver(this.f203a, mo180c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m182e() {
        if (this.f203a != null) {
            try {
                this.f204b.f148b.unregisterReceiver(this.f203a);
            } catch (IllegalArgumentException unused) {
            }
            this.f203a = null;
        }
    }
}
