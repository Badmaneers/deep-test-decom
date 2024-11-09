package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchView.java */
/* renamed from: androidx.appcompat.widget.cq */
/* loaded from: classes.dex */
public final class C0252cq implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ SearchView f1306a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C0252cq(SearchView searchView) {
        this.f1306a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f1306a.m617b(charSequence);
    }
}
