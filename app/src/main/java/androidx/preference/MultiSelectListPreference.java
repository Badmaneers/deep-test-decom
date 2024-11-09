package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.core.content.p020a.C0435o;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: a */
    private CharSequence[] f3241a;

    /* renamed from: b */
    private CharSequence[] f3242b;

    /* renamed from: c */
    private Set<String> f3243c;

    private MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3243c = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MultiSelectListPreference, i, 0);
        this.f3241a = C0435o.m1549d(obtainStyledAttributes, R.styleable.MultiSelectListPreference_entries, R.styleable.MultiSelectListPreference_android_entries);
        this.f3242b = C0435o.m1549d(obtainStyledAttributes, R.styleable.MultiSelectListPreference_entryValues, R.styleable.MultiSelectListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
    }

    private MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0435o.m1535a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle), (byte) 0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: a */
    protected final Object mo2694a(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* loaded from: classes.dex */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0802g();

        /* renamed from: a */
        Set<String> f3244a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f3244a = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f3244a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3244a.size());
            parcel.writeStringArray((String[]) this.f3244a.toArray(new String[this.f3244a.size()]));
        }
    }
}
