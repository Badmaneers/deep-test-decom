package androidx.appcompat.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

/* compiled from: ActivityChooserModel.java */
/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public final class C0314w implements Comparable<C0314w> {

    /* renamed from: a */
    public final ResolveInfo f1455a;

    /* renamed from: b */
    public float f1456b;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C0314w c0314w) {
        return Float.floatToIntBits(c0314w.f1456b) - Float.floatToIntBits(this.f1456b);
    }

    public C0314w(ResolveInfo resolveInfo) {
        this.f1455a = resolveInfo;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1456b) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.f1456b) == Float.floatToIntBits(((C0314w) obj).f1456b);
    }

    public final String toString() {
        return "[resolveInfo:" + this.f1455a.toString() + "; weight:" + new BigDecimal(this.f1456b) + "]";
    }
}
