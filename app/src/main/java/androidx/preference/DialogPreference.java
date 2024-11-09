package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.p020a.C0435o;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: a */
    private CharSequence f3223a;

    /* renamed from: b */
    private CharSequence f3224b;

    /* renamed from: c */
    private Drawable f3225c;

    /* renamed from: d */
    private CharSequence f3226d;

    /* renamed from: e */
    private CharSequence f3227e;

    /* renamed from: f */
    private int f3228f;

    @Override // androidx.preference.Preference
    /* renamed from: a */
    public void mo2691a() {
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DialogPreference, i, 0);
        this.f3223a = C0435o.m1546b(obtainStyledAttributes, R.styleable.DialogPreference_dialogTitle, R.styleable.DialogPreference_android_dialogTitle);
        if (this.f3223a == null) {
            this.f3223a = m2716k();
        }
        this.f3224b = C0435o.m1546b(obtainStyledAttributes, R.styleable.DialogPreference_dialogMessage, R.styleable.DialogPreference_android_dialogMessage);
        int i2 = R.styleable.DialogPreference_dialogIcon;
        int i3 = R.styleable.DialogPreference_android_dialogIcon;
        Drawable drawable = obtainStyledAttributes.getDrawable(i2);
        this.f3225c = drawable == null ? obtainStyledAttributes.getDrawable(i3) : drawable;
        this.f3226d = C0435o.m1546b(obtainStyledAttributes, R.styleable.DialogPreference_positiveButtonText, R.styleable.DialogPreference_android_positiveButtonText);
        this.f3227e = C0435o.m1546b(obtainStyledAttributes, R.styleable.DialogPreference_negativeButtonText, R.styleable.DialogPreference_android_negativeButtonText);
        this.f3228f = C0435o.m1537a(obtainStyledAttributes, R.styleable.DialogPreference_dialogLayout, R.styleable.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    private DialogPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0435o.m1535a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle), (byte) 0);
    }
}
