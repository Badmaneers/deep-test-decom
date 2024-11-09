package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.p020a.C0435o;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: b */
    private boolean f3288b;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0435o.m1535a(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), (byte) 0);
        this.f3288b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    /* renamed from: a */
    public final void mo2691a() {
        if (m2714i() == null && m2715j() == null && m2723c() != 0) {
        }
    }
}
