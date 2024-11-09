package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import androidx.core.content.p020a.C0435o;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: b */
    private final C0817w f3306b;

    /* renamed from: c */
    private CharSequence f3307c;

    /* renamed from: d */
    private CharSequence f3308d;

    private SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3306b = new C0817w(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SwitchPreference, i, 0);
        m2726a(C0435o.m1546b(obtainStyledAttributes, R.styleable.SwitchPreference_summaryOn, R.styleable.SwitchPreference_android_summaryOn));
        m2728b((CharSequence) C0435o.m1546b(obtainStyledAttributes, R.styleable.SwitchPreference_summaryOff, R.styleable.SwitchPreference_android_summaryOff));
        this.f3307c = C0435o.m1546b(obtainStyledAttributes, R.styleable.SwitchPreference_switchTextOn, R.styleable.SwitchPreference_android_switchTextOn);
        mo2693b();
        this.f3308d = C0435o.m1546b(obtainStyledAttributes, R.styleable.SwitchPreference_switchTextOff, R.styleable.SwitchPreference_android_switchTextOff);
        mo2693b();
        m2731e(C0435o.m1543a(obtainStyledAttributes, R.styleable.SwitchPreference_disableDependentsState, R.styleable.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0435o.m1535a(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle), (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    /* renamed from: a */
    public final void mo2690a(View view) {
        super.mo2690a(view);
        if (((AccessibilityManager) m2722q().getSystemService("accessibility")).isEnabled()) {
            KeyEvent.Callback findViewById = view.findViewById(android.R.id.switch_widget);
            boolean z = findViewById instanceof Switch;
            if (z) {
                ((Switch) findViewById).setOnCheckedChangeListener(null);
            }
            if (findViewById instanceof Checkable) {
                ((Checkable) findViewById).setChecked(this.f3312a);
            }
            if (z) {
                Switch r0 = (Switch) findViewById;
                r0.setTextOn(this.f3307c);
                r0.setTextOff(this.f3308d);
                r0.setOnCheckedChangeListener(this.f3306b);
            }
            m2727b(view.findViewById(android.R.id.summary));
        }
    }
}
