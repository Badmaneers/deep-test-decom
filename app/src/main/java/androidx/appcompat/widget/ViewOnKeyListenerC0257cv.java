package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchView.java */
/* renamed from: androidx.appcompat.widget.cv */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0257cv implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f1311a;

    public ViewOnKeyListenerC0257cv(SearchView searchView) {
        this.f1311a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f1311a.f972h == null) {
            return false;
        }
        if (this.f1311a.f963a.isPopupShowing() && this.f1311a.f963a.getListSelection() != -1) {
            return this.f1311a.m616a(i, keyEvent);
        }
        if ((TextUtils.getTrimmedLength(this.f1311a.f963a.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        this.f1311a.m615a(this.f1311a.f963a.getText().toString());
        return true;
    }
}
