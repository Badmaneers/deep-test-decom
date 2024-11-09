package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.p020a.C0435o;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: b */
    private final C0818x f3309b;

    /* renamed from: c */
    private CharSequence f3310c;

    /* renamed from: d */
    private CharSequence f3311d;

    private SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3309b = new C0818x(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SwitchPreferenceCompat, i, 0);
        m2726a(C0435o.m1546b(obtainStyledAttributes, R.styleable.SwitchPreferenceCompat_summaryOn, R.styleable.SwitchPreferenceCompat_android_summaryOn));
        m2728b((CharSequence) C0435o.m1546b(obtainStyledAttributes, R.styleable.SwitchPreferenceCompat_summaryOff, R.styleable.SwitchPreferenceCompat_android_summaryOff));
        this.f3310c = C0435o.m1546b(obtainStyledAttributes, R.styleable.SwitchPreferenceCompat_switchTextOn, R.styleable.SwitchPreferenceCompat_android_switchTextOn);
        mo2693b();
        this.f3311d = C0435o.m1546b(obtainStyledAttributes, R.styleable.SwitchPreferenceCompat_switchTextOff, R.styleable.SwitchPreferenceCompat_android_switchTextOff);
        mo2693b();
        m2731e(C0435o.m1543a(obtainStyledAttributes, R.styleable.SwitchPreferenceCompat_disableDependentsState, R.styleable.SwitchPreferenceCompat_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    /* renamed from: a */
    public final void mo2690a(View view) {
        super.mo2690a(view);
        if (((AccessibilityManager) m2722q().getSystemService("accessibility")).isEnabled()) {
            KeyEvent.Callback findViewById = view.findViewById(R.id.switchWidget);
            boolean z = findViewById instanceof SwitchCompat;
            if (z) {
                ((SwitchCompat) findViewById).setOnCheckedChangeListener(null);
            }
            if (findViewById instanceof Checkable) {
                ((Checkable) findViewById).setChecked(this.f3312a);
            }
            if (z) {
                SwitchCompat switchCompat = (SwitchCompat) findViewById;
                switchCompat.setTextOn(this.f3310c);
                switchCompat.setTextOff(this.f3311d);
                switchCompat.setOnCheckedChangeListener(this.f3309b);
            }
            m2727b(view.findViewById(android.R.id.summary));
        }
    }
}
