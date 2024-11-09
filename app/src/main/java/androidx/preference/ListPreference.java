package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.p020a.C0435o;
import androidx.preference.Preference;
import com.coloros.neton.BuildConfig;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: a */
    private CharSequence[] f3235a;

    /* renamed from: b */
    private CharSequence[] f3236b;

    /* renamed from: c */
    private String f3237c;

    /* renamed from: d */
    private String f3238d;

    /* renamed from: e */
    private boolean f3239e;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPreference, i, 0);
        this.f3235a = C0435o.m1549d(obtainStyledAttributes, R.styleable.ListPreference_entries, R.styleable.ListPreference_android_entries);
        this.f3236b = C0435o.m1549d(obtainStyledAttributes, R.styleable.ListPreference_entryValues, R.styleable.ListPreference_android_entryValues);
        int i2 = R.styleable.ListPreference_useSimpleSummaryProvider;
        if (C0435o.m1543a(obtainStyledAttributes, i2, i2, false)) {
            m2708a(C0801f.m2734a());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.Preference, i, 0);
        this.f3238d = C0435o.m1546b(obtainStyledAttributes2, R.styleable.Preference_summary, R.styleable.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    private ListPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0435o.m1535a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle), (byte) 0);
    }

    /* renamed from: c */
    public final CharSequence[] m2700c() {
        return this.f3235a;
    }

    /* renamed from: e */
    public final CharSequence[] m2701e() {
        return this.f3236b;
    }

    @Override // androidx.preference.Preference
    /* renamed from: f */
    public final CharSequence mo2702f() {
        if (m2719n() != null) {
            return m2719n().mo2733a(this);
        }
        CharSequence m2704h = m2704h();
        CharSequence f = super.mo2702f();
        if (this.f3238d == null) {
            return f;
        }
        String str = this.f3238d;
        Object[] objArr = new Object[1];
        if (m2704h == null) {
            m2704h = BuildConfig.FLAVOR;
        }
        objArr[0] = m2704h;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, f)) {
            return f;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    /* renamed from: a */
    public final void m2699a(String str) {
        boolean z = !TextUtils.equals(this.f3237c, str);
        if (z || !this.f3239e) {
            this.f3237c = str;
            this.f3239e = true;
            m2712b(str);
            if (z) {
                mo2693b();
            }
        }
    }

    /* renamed from: g */
    public final String m2703g() {
        return this.f3237c;
    }

    /* renamed from: h */
    public final CharSequence m2704h() {
        int m2698r = m2698r();
        if (m2698r < 0 || this.f3235a == null) {
            return null;
        }
        return this.f3235a[m2698r];
    }

    /* renamed from: c */
    private int m2697c(String str) {
        if (str == null || this.f3236b == null) {
            return -1;
        }
        for (int length = this.f3236b.length - 1; length >= 0; length--) {
            if (this.f3236b[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: r */
    private int m2698r() {
        return m2697c(this.f3237c);
    }

    @Override // androidx.preference.Preference
    /* renamed from: a */
    protected final Object mo2694a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* loaded from: classes.dex */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0800e();

        /* renamed from: a */
        String f3240a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3240a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3240a);
        }
    }
}
