package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.p020a.C0435o;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    @Override // androidx.preference.Preference
    /* renamed from: l */
    public final boolean mo2717l() {
        return false;
    }

    private PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private PreferenceCategory(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0435o.m1535a(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), (byte) 0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: d */
    public final boolean mo2696d() {
        return !super.mo2717l();
    }
}
