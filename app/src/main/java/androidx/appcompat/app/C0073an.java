package androidx.appcompat.app;

import android.view.KeyEvent;
import androidx.core.p024g.InterfaceC0523h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDialog.java */
/* renamed from: androidx.appcompat.app.an */
/* loaded from: classes.dex */
public final class C0073an implements InterfaceC0523h {

    /* renamed from: a */
    final /* synthetic */ DialogC0072am f212a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0073an(DialogC0072am dialogC0072am) {
        this.f212a = dialogC0072am;
    }

    @Override // androidx.core.p024g.InterfaceC0523h
    /* renamed from: a */
    public final boolean mo187a(KeyEvent keyEvent) {
        return this.f212a.m185a(keyEvent);
    }
}
