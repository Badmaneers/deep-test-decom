package androidx.core.p023f;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: ObjectsCompat.java */
/* renamed from: androidx.core.f.c */
/* loaded from: classes.dex */
public final class C0472c {
    /* renamed from: a */
    public static boolean m1615a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    public static int m1614a(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
