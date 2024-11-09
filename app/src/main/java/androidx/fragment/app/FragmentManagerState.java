package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0664ah();

    /* renamed from: a */
    ArrayList<FragmentState> f2794a;

    /* renamed from: b */
    ArrayList<String> f2795b;

    /* renamed from: c */
    BackStackState[] f2796c;

    /* renamed from: d */
    String f2797d;

    /* renamed from: e */
    int f2798e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
        this.f2797d = null;
    }

    public FragmentManagerState(Parcel parcel) {
        this.f2797d = null;
        this.f2794a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f2795b = parcel.createStringArrayList();
        this.f2796c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f2797d = parcel.readString();
        this.f2798e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f2794a);
        parcel.writeStringList(this.f2795b);
        parcel.writeTypedArray(this.f2796c, i);
        parcel.writeString(this.f2797d);
        parcel.writeInt(this.f2798e);
    }
}
