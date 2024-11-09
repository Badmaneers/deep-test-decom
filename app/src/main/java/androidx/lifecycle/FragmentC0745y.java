package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks2;
import android.os.Bundle;

/* compiled from: ReportFragment.java */
/* renamed from: androidx.lifecycle.y */
/* loaded from: classes.dex */
public final class FragmentC0745y extends Fragment {

    /* renamed from: a */
    private InterfaceC0746z f3095a;

    /* renamed from: a */
    public static void m2639a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0745y(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2640a(EnumC0729i.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        m2640a(EnumC0729i.ON_START);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        m2640a(EnumC0729i.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m2640a(EnumC0729i.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m2640a(EnumC0729i.ON_STOP);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m2640a(EnumC0729i.ON_DESTROY);
        this.f3095a = null;
    }

    /* renamed from: a */
    private void m2640a(EnumC0729i enumC0729i) {
        ComponentCallbacks2 activity = getActivity();
        if (activity instanceof InterfaceC0737q) {
            ((InterfaceC0737q) activity).m2626b().m2623a(enumC0729i);
        } else if (activity instanceof InterfaceC0733m) {
            AbstractC0728h mo31a = ((InterfaceC0733m) activity).mo31a();
            if (mo31a instanceof C0734n) {
                ((C0734n) mo31a).m2623a(enumC0729i);
            }
        }
    }
}
