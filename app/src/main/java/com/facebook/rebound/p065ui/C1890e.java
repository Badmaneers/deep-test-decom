package com.facebook.rebound.p065ui;

import android.view.View;
import android.widget.AdapterView;
import com.facebook.rebound.C1881l;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpringConfiguratorView.java */
/* renamed from: com.facebook.rebound.ui.e */
/* loaded from: classes.dex */
public final class C1890e implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ SpringConfiguratorView f8690a;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    private C1890e(SpringConfiguratorView springConfiguratorView) {
        this.f8690a = springConfiguratorView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1890e(SpringConfiguratorView springConfiguratorView, byte b) {
        this(springConfiguratorView);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        List list;
        C1881l c1881l;
        SpringConfiguratorView springConfiguratorView = this.f8690a;
        list = this.f8690a.f8672c;
        springConfiguratorView.f8683n = (C1881l) list.get(i);
        SpringConfiguratorView springConfiguratorView2 = this.f8690a;
        c1881l = this.f8690a.f8683n;
        SpringConfiguratorView.m6037b(springConfiguratorView2, c1881l);
    }
}
