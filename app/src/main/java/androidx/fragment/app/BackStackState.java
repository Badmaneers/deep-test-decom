package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.EnumC0730j;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0683b();

    /* renamed from: a */
    final int[] f2718a;

    /* renamed from: b */
    final ArrayList<String> f2719b;

    /* renamed from: c */
    final int[] f2720c;

    /* renamed from: d */
    final int[] f2721d;

    /* renamed from: e */
    final int f2722e;

    /* renamed from: f */
    final int f2723f;

    /* renamed from: g */
    final String f2724g;

    /* renamed from: h */
    final int f2725h;

    /* renamed from: i */
    final int f2726i;

    /* renamed from: j */
    final CharSequence f2727j;

    /* renamed from: k */
    final int f2728k;

    /* renamed from: l */
    final CharSequence f2729l;

    /* renamed from: m */
    final ArrayList<String> f2730m;

    /* renamed from: n */
    final ArrayList<String> f2731n;

    /* renamed from: o */
    final boolean f2732o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BackStackState(C0656a c0656a) {
        int size = c0656a.f2852d.size();
        this.f2718a = new int[size * 5];
        if (!c0656a.f2859k) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2719b = new ArrayList<>(size);
        this.f2720c = new int[size];
        this.f2721d = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C0672ap c0672ap = c0656a.f2852d.get(i);
            int i3 = i2 + 1;
            this.f2718a[i2] = c0672ap.f2870a;
            this.f2719b.add(c0672ap.f2871b != null ? c0672ap.f2871b.f2771o : null);
            int i4 = i3 + 1;
            this.f2718a[i3] = c0672ap.f2872c;
            int i5 = i4 + 1;
            this.f2718a[i4] = c0672ap.f2873d;
            int i6 = i5 + 1;
            this.f2718a[i5] = c0672ap.f2874e;
            this.f2718a[i6] = c0672ap.f2875f;
            this.f2720c[i] = c0672ap.f2876g.ordinal();
            this.f2721d[i] = c0672ap.f2877h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f2722e = c0656a.f2857i;
        this.f2723f = c0656a.f2858j;
        this.f2724g = c0656a.f2861m;
        this.f2725h = c0656a.f2823c;
        this.f2726i = c0656a.f2862n;
        this.f2727j = c0656a.f2863o;
        this.f2728k = c0656a.f2864p;
        this.f2729l = c0656a.f2865q;
        this.f2730m = c0656a.f2866r;
        this.f2731n = c0656a.f2867s;
        this.f2732o = c0656a.f2868t;
    }

    public BackStackState(Parcel parcel) {
        this.f2718a = parcel.createIntArray();
        this.f2719b = parcel.createStringArrayList();
        this.f2720c = parcel.createIntArray();
        this.f2721d = parcel.createIntArray();
        this.f2722e = parcel.readInt();
        this.f2723f = parcel.readInt();
        this.f2724g = parcel.readString();
        this.f2725h = parcel.readInt();
        this.f2726i = parcel.readInt();
        this.f2727j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2728k = parcel.readInt();
        this.f2729l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2730m = parcel.createStringArrayList();
        this.f2731n = parcel.createStringArrayList();
        this.f2732o = parcel.readInt() != 0;
    }

    /* renamed from: a */
    public final C0656a m2243a(LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s) {
        C0656a c0656a = new C0656a(layoutInflaterFactory2C0707s);
        int i = 0;
        int i2 = 0;
        while (i < this.f2718a.length) {
            C0672ap c0672ap = new C0672ap();
            int i3 = i + 1;
            c0672ap.f2870a = this.f2718a[i];
            if (LayoutInflaterFactory2C0707s.f2988b) {
                Log.v("FragmentManager", "Instantiate " + c0656a + " op #" + i2 + " base fragment #" + this.f2718a[i3]);
            }
            String str = this.f2719b.get(i2);
            if (str != null) {
                c0672ap.f2871b = layoutInflaterFactory2C0707s.f3000g.get(str);
            } else {
                c0672ap.f2871b = null;
            }
            c0672ap.f2876g = EnumC0730j.values()[this.f2720c[i2]];
            c0672ap.f2877h = EnumC0730j.values()[this.f2721d[i2]];
            int i4 = i3 + 1;
            c0672ap.f2872c = this.f2718a[i3];
            int i5 = i4 + 1;
            c0672ap.f2873d = this.f2718a[i4];
            int i6 = i5 + 1;
            c0672ap.f2874e = this.f2718a[i5];
            c0672ap.f2875f = this.f2718a[i6];
            c0656a.f2853e = c0672ap.f2872c;
            c0656a.f2854f = c0672ap.f2873d;
            c0656a.f2855g = c0672ap.f2874e;
            c0656a.f2856h = c0672ap.f2875f;
            c0656a.m2375a(c0672ap);
            i2++;
            i = i6 + 1;
        }
        c0656a.f2857i = this.f2722e;
        c0656a.f2858j = this.f2723f;
        c0656a.f2861m = this.f2724g;
        c0656a.f2823c = this.f2725h;
        c0656a.f2859k = true;
        c0656a.f2862n = this.f2726i;
        c0656a.f2863o = this.f2727j;
        c0656a.f2864p = this.f2728k;
        c0656a.f2865q = this.f2729l;
        c0656a.f2866r = this.f2730m;
        c0656a.f2867s = this.f2731n;
        c0656a.f2868t = this.f2732o;
        c0656a.m2339a(1);
        return c0656a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2718a);
        parcel.writeStringList(this.f2719b);
        parcel.writeIntArray(this.f2720c);
        parcel.writeIntArray(this.f2721d);
        parcel.writeInt(this.f2722e);
        parcel.writeInt(this.f2723f);
        parcel.writeString(this.f2724g);
        parcel.writeInt(this.f2725h);
        parcel.writeInt(this.f2726i);
        TextUtils.writeToParcel(this.f2727j, parcel, 0);
        parcel.writeInt(this.f2728k);
        TextUtils.writeToParcel(this.f2729l, parcel, 0);
        parcel.writeStringList(this.f2730m);
        parcel.writeStringList(this.f2731n);
        parcel.writeInt(this.f2732o ? 1 : 0);
    }
}
