package androidx.preference;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeekBarPreference.java */
/* renamed from: androidx.preference.u */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0815u implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ SeekBarPreference f3336a;

    public ViewOnKeyListenerC0815u(SeekBarPreference seekBarPreference) {
        this.f3336a = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if ((!this.f3336a.f3295e && (i == 21 || i == 22)) || i == 23 || i == 66) {
            return false;
        }
        if (this.f3336a.f3294d == null) {
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
        return this.f3336a.f3294d.onKeyDown(i, keyEvent);
    }
}
