package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.p011b.C0318a;
import com.coloros.neton.BuildConfig;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VersionedParcelParcel.java */
/* renamed from: androidx.versionedparcelable.c */
/* loaded from: classes.dex */
public final class C1092c extends AbstractC1091b {

    /* renamed from: d */
    private final SparseIntArray f4362d;

    /* renamed from: e */
    private final Parcel f4363e;

    /* renamed from: f */
    private final int f4364f;

    /* renamed from: g */
    private final int f4365g;

    /* renamed from: h */
    private final String f4366h;

    /* renamed from: i */
    private int f4367i;

    /* renamed from: j */
    private int f4368j;

    /* renamed from: k */
    private int f4369k;

    public C1092c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new C0318a(), new C0318a(), new C0318a());
    }

    private C1092c(Parcel parcel, int i, int i2, String str, C0318a<String, Method> c0318a, C0318a<String, Method> c0318a2, C0318a<String, Class> c0318a3) {
        super(c0318a, c0318a2, c0318a3);
        this.f4362d = new SparseIntArray();
        this.f4367i = -1;
        this.f4368j = 0;
        this.f4369k = -1;
        this.f4363e = parcel;
        this.f4364f = i;
        this.f4365g = i2;
        this.f4368j = this.f4364f;
        this.f4366h = str;
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: b */
    public final boolean mo3644b(int i) {
        while (this.f4368j < this.f4365g) {
            if (this.f4369k == i) {
                return true;
            }
            if (String.valueOf(this.f4369k).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f4363e.setDataPosition(this.f4368j);
            int readInt = this.f4363e.readInt();
            this.f4369k = this.f4363e.readInt();
            this.f4368j += readInt;
        }
        return this.f4369k == i;
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: c */
    public final void mo3649c(int i) {
        mo3625a();
        this.f4367i = i;
        this.f4362d.put(i, this.f4363e.dataPosition());
        mo3626a(0);
        mo3626a(i);
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: a */
    public final void mo3625a() {
        if (this.f4367i >= 0) {
            int i = this.f4362d.get(this.f4367i);
            int dataPosition = this.f4363e.dataPosition();
            this.f4363e.setDataPosition(i);
            this.f4363e.writeInt(dataPosition - i);
            this.f4363e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: b */
    protected final AbstractC1091b mo3639b() {
        return new C1092c(this.f4363e, this.f4363e.dataPosition(), this.f4368j == this.f4364f ? this.f4365g : this.f4368j, this.f4366h + "  ", this.f4359a, this.f4360b, this.f4361c);
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: a */
    public final void mo3636a(byte[] bArr) {
        if (bArr != null) {
            this.f4363e.writeInt(bArr.length);
            this.f4363e.writeByteArray(bArr);
        } else {
            this.f4363e.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: a */
    public final void mo3626a(int i) {
        this.f4363e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: a */
    public final void mo3633a(String str) {
        this.f4363e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: a */
    public final void mo3628a(Parcelable parcelable) {
        this.f4363e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: a */
    public final void mo3634a(boolean z) {
        this.f4363e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: a */
    protected final void mo3631a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4363e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: f */
    protected final CharSequence mo3653f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4363e);
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: c */
    public final int mo3646c() {
        return this.f4363e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: d */
    public final String mo3651d() {
        return this.f4363e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: e */
    public final byte[] mo3652e() {
        int readInt = this.f4363e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4363e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: g */
    public final <T extends Parcelable> T mo3654g() {
        return (T) this.f4363e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC1091b
    /* renamed from: h */
    public final boolean mo3655h() {
        return this.f4363e.readInt() != 0;
    }
}
