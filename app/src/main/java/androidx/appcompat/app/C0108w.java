package androidx.appcompat.app;

import android.graphics.Rect;
import androidx.appcompat.widget.InterfaceC0223bo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.w */
/* loaded from: classes.dex */
public final class C0108w implements InterfaceC0223bo {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f367a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0108w(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f367a = appCompatDelegateImpl;
    }

    @Override // androidx.appcompat.widget.InterfaceC0223bo
    /* renamed from: a */
    public final void mo251a(Rect rect) {
        rect.top = this.f367a.m126i(rect.top);
    }
}
