package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0667ak();

    /* renamed from: a */
    final String f2799a;

    /* renamed from: b */
    final String f2800b;

    /* renamed from: c */
    final boolean f2801c;

    /* renamed from: d */
    final int f2802d;

    /* renamed from: e */
    final int f2803e;

    /* renamed from: f */
    final String f2804f;

    /* renamed from: g */
    final boolean f2805g;

    /* renamed from: h */
    final boolean f2806h;

    /* renamed from: i */
    final boolean f2807i;

    /* renamed from: j */
    final Bundle f2808j;

    /* renamed from: k */
    final boolean f2809k;

    /* renamed from: l */
    final int f2810l;

    /* renamed from: m */
    Bundle f2811m;

    /* renamed from: n */
    Fragment f2812n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FragmentState(Fragment fragment) {
        this.f2799a = fragment.getClass().getName();
        this.f2800b = fragment.f2771o;
        this.f2801c = fragment.f2778v;
        this.f2802d = fragment.f2738E;
        this.f2803e = fragment.f2739F;
        this.f2804f = fragment.f2740G;
        this.f2805g = fragment.f2743J;
        this.f2806h = fragment.f2777u;
        this.f2807i = fragment.f2742I;
        this.f2808j = fragment.f2772p;
        this.f2809k = fragment.f2741H;
        this.f2810l = fragment.f2759Z.ordinal();
    }

    public FragmentState(Parcel parcel) {
        this.f2799a = parcel.readString();
        this.f2800b = parcel.readString();
        this.f2801c = parcel.readInt() != 0;
        this.f2802d = parcel.readInt();
        this.f2803e = parcel.readInt();
        this.f2804f = parcel.readString();
        this.f2805g = parcel.readInt() != 0;
        this.f2806h = parcel.readInt() != 0;
        this.f2807i = parcel.readInt() != 0;
        this.f2808j = parcel.readBundle();
        this.f2809k = parcel.readInt() != 0;
        this.f2811m = parcel.readBundle();
        this.f2810l = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2799a);
        sb.append(" (");
        sb.append(this.f2800b);
        sb.append(")}:");
        if (this.f2801c) {
            sb.append(" fromLayout");
        }
        if (this.f2803e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2803e));
        }
        if (this.f2804f != null && !this.f2804f.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2804f);
        }
        if (this.f2805g) {
            sb.append(" retainInstance");
        }
        if (this.f2806h) {
            sb.append(" removing");
        }
        if (this.f2807i) {
            sb.append(" detached");
        }
        if (this.f2809k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2799a);
        parcel.writeString(this.f2800b);
        parcel.writeInt(this.f2801c ? 1 : 0);
        parcel.writeInt(this.f2802d);
        parcel.writeInt(this.f2803e);
        parcel.writeString(this.f2804f);
        parcel.writeInt(this.f2805g ? 1 : 0);
        parcel.writeInt(this.f2806h ? 1 : 0);
        parcel.writeInt(this.f2807i ? 1 : 0);
        parcel.writeBundle(this.f2808j);
        parcel.writeInt(this.f2809k ? 1 : 0);
        parcel.writeBundle(this.f2811m);
        parcel.writeInt(this.f2810l);
    }
}
