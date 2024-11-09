package androidx.fragment.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.InterfaceC0056f;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC0728h;
import androidx.lifecycle.C0720ae;
import androidx.lifecycle.InterfaceC0721af;
import java.io.PrintWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentActivity.java */
/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public final class C0700l extends AbstractC0704p<FragmentActivity> implements InterfaceC0056f, InterfaceC0721af {

    /* renamed from: a */
    final /* synthetic */ FragmentActivity f2976a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0700l(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f2976a = fragmentActivity;
    }

    @Override // androidx.lifecycle.InterfaceC0733m
    /* renamed from: a */
    public final AbstractC0728h mo31a() {
        return this.f2976a.f2786b;
    }

    @Override // androidx.lifecycle.InterfaceC0721af
    /* renamed from: b */
    public final C0720ae mo32b() {
        return this.f2976a.mo32b();
    }

    @Override // androidx.activity.InterfaceC0056f
    /* renamed from: c */
    public final OnBackPressedDispatcher mo33c() {
        return this.f2976a.mo33c();
    }

    @Override // androidx.fragment.app.AbstractC0704p
    /* renamed from: a */
    public final void mo2433a(String str, PrintWriter printWriter, String[] strArr) {
        this.f2976a.dump(str, null, printWriter, strArr);
    }

    @Override // androidx.fragment.app.AbstractC0704p
    /* renamed from: d */
    public final boolean mo2434d() {
        return !this.f2976a.isFinishing();
    }

    @Override // androidx.fragment.app.AbstractC0704p
    /* renamed from: e */
    public final LayoutInflater mo2435e() {
        return this.f2976a.getLayoutInflater().cloneInContext(this.f2976a);
    }

    @Override // androidx.fragment.app.AbstractC0704p
    /* renamed from: f */
    public final void mo2436f() {
        this.f2976a.mo66e();
    }

    @Override // androidx.fragment.app.AbstractC0704p
    /* renamed from: g */
    public final boolean mo2437g() {
        return this.f2976a.getWindow() != null;
    }

    @Override // androidx.fragment.app.AbstractC0704p
    /* renamed from: h */
    public final int mo2438h() {
        Window window = this.f2976a.getWindow();
        if (window == null) {
            return 0;
        }
        return window.getAttributes().windowAnimations;
    }

    @Override // androidx.fragment.app.AbstractC0704p, androidx.fragment.app.AbstractC0701m
    /* renamed from: a */
    public final View mo2431a(int i) {
        return this.f2976a.findViewById(i);
    }

    @Override // androidx.fragment.app.AbstractC0704p, androidx.fragment.app.AbstractC0701m
    /* renamed from: b_ */
    public final boolean mo2432b_() {
        Window window = this.f2976a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0704p
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ FragmentActivity mo2439i() {
        return this.f2976a;
    }
}
