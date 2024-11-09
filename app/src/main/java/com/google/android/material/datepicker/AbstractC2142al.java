package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment.java */
/* renamed from: com.google.android.material.datepicker.al */
/* loaded from: classes.dex */
abstract class AbstractC2142al<S> extends Fragment {

    /* renamed from: e */
    protected final LinkedHashSet<InterfaceC2141ak<S>> f9573e = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m6842a(InterfaceC2141ak<S> interfaceC2141ak) {
        return this.f9573e.add(interfaceC2141ak);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag */
    public final void m6843ag() {
        this.f9573e.clear();
    }
}
