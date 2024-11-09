package androidx.appcompat.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

/* compiled from: ActivityChooserModel.java */
/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
public final class C0316y {

    /* renamed from: a */
    public final ComponentName f1457a;

    /* renamed from: b */
    public final long f1458b;

    /* renamed from: c */
    public final float f1459c;

    public C0316y(String str, long j, float f) {
        this(ComponentName.unflattenFromString(str), j, f);
    }

    public C0316y(ComponentName componentName, long j, float f) {
        this.f1457a = componentName;
        this.f1458b = j;
        this.f1459c = f;
    }

    public final int hashCode() {
        return (((((this.f1457a == null ? 0 : this.f1457a.hashCode()) + 31) * 31) + ((int) (this.f1458b ^ (this.f1458b >>> 32)))) * 31) + Float.floatToIntBits(this.f1459c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0316y c0316y = (C0316y) obj;
        if (this.f1457a == null) {
            if (c0316y.f1457a != null) {
                return false;
            }
        } else if (!this.f1457a.equals(c0316y.f1457a)) {
            return false;
        }
        return this.f1458b == c0316y.f1458b && Float.floatToIntBits(this.f1459c) == Float.floatToIntBits(c0316y.f1459c);
    }

    public final String toString() {
        return "[; activity:" + this.f1457a + "; time:" + this.f1458b + "; weight:" + new BigDecimal(this.f1459c) + "]";
    }
}
