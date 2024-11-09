package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.p020a.C0435o;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: a */
    private String f3233a;

    private EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.EditTextPreference, i, 0);
        int i2 = R.styleable.EditTextPreference_useSimpleSummaryProvider;
        if (C0435o.m1543a(obtainStyledAttributes, i2, i2, false)) {
            m2708a(C0799d.m2732a());
        }
        obtainStyledAttributes.recycle();
    }

    private EditTextPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0435o.m1535a(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle), (byte) 0);
    }

    /* renamed from: c */
    public final String m2695c() {
        return this.f3233a;
    }

    @Override // androidx.preference.Preference
    /* renamed from: a */
    protected final Object mo2694a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    /* renamed from: d */
    public final boolean mo2696d() {
        return TextUtils.isEmpty(this.f3233a) || super.mo2696d();
    }

    /* loaded from: classes.dex */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0798c();

        /* renamed from: a */
        String f3234a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3234a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3234a);
        }
    }
}
