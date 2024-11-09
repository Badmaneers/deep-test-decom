package androidx.core.p024g.p025a;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* compiled from: AccessibilityRecordCompat.java */
/* renamed from: androidx.core.g.a.k */
/* loaded from: classes.dex */
public final class C0490k {

    /* renamed from: a */
    private final AccessibilityRecord f2334a;

    /* renamed from: a */
    public static void m1721a(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }

    @Deprecated
    public final int hashCode() {
        if (this.f2334a == null) {
            return 0;
        }
        return this.f2334a.hashCode();
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0490k)) {
            return false;
        }
        C0490k c0490k = (C0490k) obj;
        if (this.f2334a == null) {
            if (c0490k.f2334a != null) {
                return false;
            }
        } else if (!this.f2334a.equals(c0490k.f2334a)) {
            return false;
        }
        return true;
    }
}
