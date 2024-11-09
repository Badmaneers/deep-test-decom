package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: a */
    protected boolean f3312a;

    /* renamed from: b */
    private CharSequence f3313b;

    /* renamed from: c */
    private CharSequence f3314c;

    /* renamed from: d */
    private boolean f3315d;

    /* renamed from: e */
    private boolean f3316e;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private TwoStatePreference(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    /* renamed from: a */
    public void mo2691a() {
        super.mo2691a();
        boolean z = !this.f3312a;
        Boolean.valueOf(z);
        if (m2720o()) {
            m2730d(z);
        }
    }

    /* renamed from: c */
    public final boolean m2729c() {
        return this.f3312a;
    }

    /* renamed from: d */
    public final void m2730d(boolean z) {
        boolean z2 = this.f3312a != z;
        if (z2 || !this.f3315d) {
            this.f3312a = z;
            this.f3315d = true;
            m2713c(z);
            if (z2) {
                mo2709a(mo2696d());
                mo2693b();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: d */
    public final boolean mo2696d() {
        return (this.f3316e ? this.f3312a : !this.f3312a) || super.mo2696d();
    }

    /* renamed from: a */
    public final void m2726a(CharSequence charSequence) {
        this.f3313b = charSequence;
        if (this.f3312a) {
            mo2693b();
        }
    }

    /* renamed from: b */
    public final void m2728b(CharSequence charSequence) {
        this.f3314c = charSequence;
        if (this.f3312a) {
            return;
        }
        mo2693b();
    }

    /* renamed from: e */
    public final void m2731e(boolean z) {
        this.f3316e = z;
    }

    @Override // androidx.preference.Preference
    /* renamed from: a */
    protected final Object mo2694a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2727b(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 1
            boolean r1 = r3.f3312a
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r3.f3313b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r3.f3313b
            r4.setText(r0)
        L1a:
            r0 = r2
            goto L2e
        L1c:
            boolean r1 = r3.f3312a
            if (r1 != 0) goto L2e
            java.lang.CharSequence r1 = r3.f3314c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2e
            java.lang.CharSequence r0 = r3.f3314c
            r4.setText(r0)
            goto L1a
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r3 = r3.mo2702f()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L3e
            r4.setText(r3)
            r0 = r2
        L3e:
            r3 = 8
            if (r0 != 0) goto L43
            r3 = r2
        L43:
            int r0 = r4.getVisibility()
            if (r3 == r0) goto L4c
            r4.setVisibility(r3)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.m2727b(android.view.View):void");
    }

    /* loaded from: classes.dex */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0819y();

        /* renamed from: a */
        boolean f3317a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3317a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3317a ? 1 : 0);
        }
    }
}
