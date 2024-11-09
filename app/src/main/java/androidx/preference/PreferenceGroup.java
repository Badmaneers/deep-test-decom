package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.p020a.C0435o;
import androidx.p011b.C0328n;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: a */
    final C0328n<String, Long> f3278a;

    /* renamed from: b */
    private final Handler f3279b;

    /* renamed from: c */
    private List<Preference> f3280c;

    /* renamed from: d */
    private boolean f3281d;

    /* renamed from: e */
    private int f3282e;

    /* renamed from: f */
    private boolean f3283f;

    /* renamed from: g */
    private int f3284g;

    /* renamed from: h */
    private InterfaceC0810o f3285h;

    /* renamed from: i */
    private final Runnable f3286i;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3278a = new C0328n<>();
        this.f3279b = new Handler();
        this.f3281d = true;
        this.f3282e = 0;
        this.f3283f = false;
        this.f3284g = Integer.MAX_VALUE;
        this.f3285h = null;
        this.f3286i = new RunnableC0809n(this);
        this.f3280c = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PreferenceGroup, i, 0);
        int i2 = R.styleable.PreferenceGroup_orderingFromXml;
        this.f3281d = C0435o.m1543a(obtainStyledAttributes, i2, i2, true);
        if (obtainStyledAttributes.hasValue(R.styleable.PreferenceGroup_initialExpandedChildrenCount)) {
            int i3 = R.styleable.PreferenceGroup_initialExpandedChildrenCount;
            int m1536a = C0435o.m1536a(obtainStyledAttributes, i3, i3);
            if (m1536a != Integer.MAX_VALUE && !m2718m()) {
                Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
            }
            this.f3284g = m1536a;
        }
        obtainStyledAttributes.recycle();
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (byte) 0);
    }

    /* renamed from: c */
    public final int m2723c() {
        return this.f3280c.size();
    }

    @Override // androidx.preference.Preference
    /* renamed from: a */
    public final void mo2709a(boolean z) {
        super.mo2709a(z);
        int m2723c = m2723c();
        for (int i = 0; i < m2723c; i++) {
            this.f3280c.get(i).m2711b(z);
        }
    }

    /* loaded from: classes.dex */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0811p();

        /* renamed from: a */
        int f3287a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3287a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3287a);
        }
    }
}
