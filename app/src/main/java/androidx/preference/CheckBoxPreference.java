package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.p020a.C0435o;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: b */
    private final C0796a f3222b;

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private CheckBoxPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i);
        this.f3222b = new C0796a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CheckBoxPreference, i, 0);
        m2726a(C0435o.m1546b(obtainStyledAttributes, R.styleable.CheckBoxPreference_summaryOn, R.styleable.CheckBoxPreference_android_summaryOn));
        m2728b((CharSequence) C0435o.m1546b(obtainStyledAttributes, R.styleable.CheckBoxPreference_summaryOff, R.styleable.CheckBoxPreference_android_summaryOff));
        m2731e(C0435o.m1543a(obtainStyledAttributes, R.styleable.CheckBoxPreference_disableDependentsState, R.styleable.CheckBoxPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0435o.m1535a(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    /* renamed from: a */
    public final void mo2690a(View view) {
        super.mo2690a(view);
        if (((AccessibilityManager) m2722q().getSystemService("accessibility")).isEnabled()) {
            KeyEvent.Callback findViewById = view.findViewById(android.R.id.checkbox);
            boolean z = findViewById instanceof CompoundButton;
            if (z) {
                ((CompoundButton) findViewById).setOnCheckedChangeListener(null);
            }
            if (findViewById instanceof Checkable) {
                ((Checkable) findViewById).setChecked(this.f3312a);
            }
            if (z) {
                ((CompoundButton) findViewById).setOnCheckedChangeListener(this.f3222b);
            }
            m2727b(view.findViewById(android.R.id.summary));
        }
    }
}
