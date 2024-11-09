package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.p023f.C0478i;
import androidx.lifecycle.InterfaceC0721af;

/* compiled from: FragmentController.java */
/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public final class C0702n {

    /* renamed from: a */
    private final AbstractC0704p<?> f2977a;

    /* renamed from: a */
    public static C0702n m2440a(AbstractC0704p<?> abstractC0704p) {
        return new C0702n((AbstractC0704p) C0478i.m1621a(abstractC0704p, "callbacks == null"));
    }

    private C0702n(AbstractC0704p<?> abstractC0704p) {
        this.f2977a = abstractC0704p;
    }

    /* renamed from: a */
    public final AbstractC0705q m2443a() {
        return this.f2977a.f2980b;
    }

    /* renamed from: a */
    public final Fragment m2442a(String str) {
        return this.f2977a.f2980b.m2554b(str);
    }

    /* renamed from: b */
    public final void m2450b() {
        this.f2977a.f2980b.m2547a(this.f2977a, this.f2977a, null);
    }

    /* renamed from: a */
    public final View m2441a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2977a.f2980b.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: c */
    public final void m2454c() {
        this.f2977a.f2980b.m2569l();
    }

    /* renamed from: d */
    public final Parcelable m2455d() {
        return this.f2977a.f2980b.m2568k();
    }

    /* renamed from: a */
    public final void m2445a(Parcelable parcelable) {
        if (!(this.f2977a instanceof InterfaceC0721af)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        this.f2977a.f2980b.m2540a(parcelable);
    }

    /* renamed from: e */
    public final void m2456e() {
        this.f2977a.f2980b.m2570m();
    }

    /* renamed from: f */
    public final void m2457f() {
        this.f2977a.f2980b.m2571n();
    }

    /* renamed from: g */
    public final void m2458g() {
        this.f2977a.f2980b.m2572o();
    }

    /* renamed from: h */
    public final void m2459h() {
        this.f2977a.f2980b.m2573p();
    }

    /* renamed from: i */
    public final void m2460i() {
        this.f2977a.f2980b.m2574q();
    }

    /* renamed from: j */
    public final void m2461j() {
        this.f2977a.f2980b.m2575r();
    }

    /* renamed from: k */
    public final void m2462k() {
        this.f2977a.f2980b.m2577t();
    }

    /* renamed from: a */
    public final void m2446a(boolean z) {
        this.f2977a.f2980b.m2548a(z);
    }

    /* renamed from: b */
    public final void m2452b(boolean z) {
        this.f2977a.f2980b.m2557b(z);
    }

    /* renamed from: a */
    public final void m2444a(Configuration configuration) {
        this.f2977a.f2980b.m2539a(configuration);
    }

    /* renamed from: l */
    public final void m2463l() {
        this.f2977a.f2980b.m2578u();
    }

    /* renamed from: a */
    public final boolean m2448a(Menu menu, MenuInflater menuInflater) {
        return this.f2977a.f2980b.m2550a(menu, menuInflater);
    }

    /* renamed from: a */
    public final boolean m2447a(Menu menu) {
        return this.f2977a.f2980b.m2549a(menu);
    }

    /* renamed from: a */
    public final boolean m2449a(MenuItem menuItem) {
        return this.f2977a.f2980b.m2551a(menuItem);
    }

    /* renamed from: b */
    public final boolean m2453b(MenuItem menuItem) {
        return this.f2977a.f2980b.m2558b(menuItem);
    }

    /* renamed from: b */
    public final void m2451b(Menu menu) {
        this.f2977a.f2980b.m2556b(menu);
    }

    /* renamed from: m */
    public final boolean m2464m() {
        return this.f2977a.f2980b.m2567j();
    }
}
