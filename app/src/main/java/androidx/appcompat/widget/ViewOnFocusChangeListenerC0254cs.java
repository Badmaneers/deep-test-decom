package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchView.java */
/* renamed from: androidx.appcompat.widget.cs */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0254cs implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f1308a;

    public ViewOnFocusChangeListenerC0254cs(SearchView searchView) {
        this.f1308a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (this.f1308a.f970f != null) {
            this.f1308a.f970f.onFocusChange(this.f1308a, z);
        }
    }
}
