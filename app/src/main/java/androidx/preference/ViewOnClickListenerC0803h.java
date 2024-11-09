package androidx.preference;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Preference.java */
/* renamed from: androidx.preference.h */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0803h implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Preference f3322a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0803h(Preference preference) {
        this.f3322a = preference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3322a.mo2690a(view);
    }
}
