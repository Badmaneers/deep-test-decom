package com.color.support.widget.floatingbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ColorFloatingButtonItem implements Parcelable {
    public static final Parcelable.Creator<ColorFloatingButtonItem> CREATOR = new C1520o();

    /* renamed from: a */
    private final int f7212a;

    /* renamed from: b */
    private final String f7213b;

    /* renamed from: c */
    private final int f7214c;

    /* renamed from: d */
    private final int f7215d;

    /* renamed from: e */
    private final Drawable f7216e;

    /* renamed from: f */
    private ColorStateList f7217f;

    /* renamed from: g */
    private ColorStateList f7218g;

    /* renamed from: h */
    private ColorStateList f7219h;

    /* renamed from: i */
    private boolean f7220i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ ColorFloatingButtonItem(C1521p c1521p, byte b) {
        this(c1521p);
    }

    private ColorFloatingButtonItem(C1521p c1521p) {
        String str;
        int i;
        int i2;
        Drawable drawable;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        boolean z;
        int i3;
        this.f7217f = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        this.f7218g = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        this.f7219h = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        str = c1521p.f7256d;
        this.f7213b = str;
        i = c1521p.f7257e;
        this.f7214c = i;
        i2 = c1521p.f7254b;
        this.f7215d = i2;
        drawable = c1521p.f7255c;
        this.f7216e = drawable;
        colorStateList = c1521p.f7258f;
        this.f7217f = colorStateList;
        colorStateList2 = c1521p.f7259g;
        this.f7218g = colorStateList2;
        colorStateList3 = c1521p.f7260h;
        this.f7219h = colorStateList3;
        z = c1521p.f7261i;
        this.f7220i = z;
        i3 = c1521p.f7253a;
        this.f7212a = i3;
    }

    /* renamed from: a */
    public final int m5120a() {
        return this.f7212a;
    }

    /* renamed from: a */
    public final String m5121a(Context context) {
        if (this.f7213b != null) {
            return this.f7213b;
        }
        if (this.f7214c != Integer.MIN_VALUE) {
            return context.getString(this.f7214c);
        }
        return null;
    }

    /* renamed from: b */
    public final Drawable m5123b(Context context) {
        if (this.f7216e != null) {
            return this.f7216e;
        }
        if (this.f7215d != Integer.MIN_VALUE) {
            return C0057a.m46b(context, this.f7215d);
        }
        return null;
    }

    /* renamed from: b */
    public final ColorStateList m5122b() {
        return this.f7217f;
    }

    /* renamed from: c */
    public final ColorStateList m5124c() {
        return this.f7218g;
    }

    /* renamed from: d */
    public final ColorStateList m5126d() {
        return this.f7219h;
    }

    /* renamed from: e */
    public final boolean m5127e() {
        return this.f7220i;
    }

    /* renamed from: c */
    public final ColorFloatingButtonLabel m5125c(Context context) {
        ColorFloatingButtonLabel colorFloatingButtonLabel = new ColorFloatingButtonLabel(context);
        colorFloatingButtonLabel.setColorFloatingButtonItem(this);
        return colorFloatingButtonLabel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7213b);
        parcel.writeInt(this.f7214c);
        parcel.writeInt(this.f7215d);
        parcel.writeInt(this.f7212a);
    }

    public ColorFloatingButtonItem(Parcel parcel) {
        this.f7217f = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        this.f7218g = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        this.f7219h = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        this.f7213b = parcel.readString();
        this.f7214c = parcel.readInt();
        this.f7215d = parcel.readInt();
        this.f7216e = null;
        this.f7212a = parcel.readInt();
    }
}
