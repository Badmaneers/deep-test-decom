package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.p011b.C0324g;

/* compiled from: ResourceManagerInternal.java */
/* renamed from: androidx.appcompat.widget.cf */
/* loaded from: classes.dex */
final class C0241cf extends C0324g<Integer, PorterDuffColorFilter> {
    public C0241cf() {
        super(6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final PorterDuffColorFilter m900a(int i, PorterDuff.Mode mode) {
        return m1045a((C0241cf) Integer.valueOf(m899b(i, mode)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final PorterDuffColorFilter m901a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
        return m1046a((C0241cf) Integer.valueOf(m899b(i, mode)), (Integer) porterDuffColorFilter);
    }

    /* renamed from: b */
    private static int m899b(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
