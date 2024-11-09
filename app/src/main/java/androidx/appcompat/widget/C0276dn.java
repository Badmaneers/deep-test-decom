package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.content.p020a.AbstractC0432l;
import androidx.core.content.p020a.C0431k;

/* compiled from: TintTypedArray.java */
/* renamed from: androidx.appcompat.widget.dn */
/* loaded from: classes.dex */
public final class C0276dn {

    /* renamed from: a */
    private final Context f1366a;

    /* renamed from: b */
    private final TypedArray f1367b;

    /* renamed from: c */
    private TypedValue f1368c;

    /* renamed from: a */
    public static C0276dn m943a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0276dn(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0276dn m944a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0276dn(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public static C0276dn m942a(Context context, int i, int[] iArr) {
        return new C0276dn(context, context.obtainStyledAttributes(i, iArr));
    }

    private C0276dn(Context context, TypedArray typedArray) {
        this.f1366a = context;
        this.f1367b = typedArray;
    }

    /* renamed from: a */
    public final Drawable m948a(int i) {
        int resourceId;
        if (this.f1367b.hasValue(i) && (resourceId = this.f1367b.getResourceId(i, 0)) != 0) {
            return C0057a.m46b(this.f1366a, resourceId);
        }
        return this.f1367b.getDrawable(i);
    }

    /* renamed from: b */
    public final Drawable m951b(int i) {
        int resourceId;
        if (!this.f1367b.hasValue(i) || (resourceId = this.f1367b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0192ak.m709b().m713b(this.f1366a, resourceId);
    }

    /* renamed from: a */
    public final Typeface m947a(int i, int i2, AbstractC0432l abstractC0432l) {
        int resourceId = this.f1367b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1368c == null) {
            this.f1368c = new TypedValue();
        }
        return C0431k.m1526a(this.f1366a, resourceId, this.f1368c, i2, abstractC0432l);
    }

    /* renamed from: a */
    public final int m945a() {
        return this.f1367b.length();
    }

    /* renamed from: c */
    public final CharSequence m954c(int i) {
        return this.f1367b.getText(i);
    }

    /* renamed from: d */
    public final String m956d(int i) {
        return this.f1367b.getString(i);
    }

    /* renamed from: a */
    public final boolean m949a(int i, boolean z) {
        return this.f1367b.getBoolean(i, z);
    }

    /* renamed from: a */
    public final int m946a(int i, int i2) {
        return this.f1367b.getInt(i, i2);
    }

    /* renamed from: e */
    public final float m957e(int i) {
        return this.f1367b.getFloat(i, -1.0f);
    }

    /* renamed from: b */
    public final int m950b(int i, int i2) {
        return this.f1367b.getColor(i, i2);
    }

    /* renamed from: f */
    public final ColorStateList m960f(int i) {
        int resourceId;
        ColorStateList m45a;
        return (!this.f1367b.hasValue(i) || (resourceId = this.f1367b.getResourceId(i, 0)) == 0 || (m45a = C0057a.m45a(this.f1366a, resourceId)) == null) ? this.f1367b.getColorStateList(i) : m45a;
    }

    /* renamed from: c */
    public final int m953c(int i, int i2) {
        return this.f1367b.getInteger(i, i2);
    }

    /* renamed from: g */
    public final float m961g(int i) {
        return this.f1367b.getDimension(i, -1.0f);
    }

    /* renamed from: d */
    public final int m955d(int i, int i2) {
        return this.f1367b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public final int m958e(int i, int i2) {
        return this.f1367b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public final int m959f(int i, int i2) {
        return this.f1367b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public final int m962g(int i, int i2) {
        return this.f1367b.getResourceId(i, i2);
    }

    /* renamed from: h */
    public final CharSequence[] m963h(int i) {
        return this.f1367b.getTextArray(i);
    }

    /* renamed from: i */
    public final boolean m964i(int i) {
        return this.f1367b.hasValue(i);
    }

    /* renamed from: b */
    public final void m952b() {
        this.f1367b.recycle();
    }
}
