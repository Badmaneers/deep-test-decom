package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: a */
    private final Parcelable f2574a;

    /* renamed from: c */
    public static final AbsSavedState f2573c = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
        C05941() {
        }
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0595a();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: androidx.customview.view.AbsSavedState$1 */
    /* loaded from: classes.dex */
    final class C05941 extends AbsSavedState {
        C05941() {
        }
    }

    /* synthetic */ AbsSavedState(byte b) {
        this();
    }

    private AbsSavedState() {
        this.f2574a = null;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f2574a = parcelable == f2573c ? null : parcelable;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2574a = readParcelable == null ? f2573c : readParcelable;
    }

    /* renamed from: a */
    public final Parcelable m2149a() {
        return this.f2574a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2574a, i);
    }
}
