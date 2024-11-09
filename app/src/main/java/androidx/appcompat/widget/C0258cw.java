package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchView.java */
/* renamed from: androidx.appcompat.widget.cw */
/* loaded from: classes.dex */
public final class C0258cw implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f1312a;

    public C0258cw(SearchView searchView) {
        this.f1312a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f1312a.m621d();
        return true;
    }
}
