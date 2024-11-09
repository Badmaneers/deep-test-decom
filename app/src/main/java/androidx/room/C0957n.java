package androidx.room;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: InvalidationTracker.java */
/* renamed from: androidx.room.n */
/* loaded from: classes.dex */
final class C0957n {

    /* renamed from: a */
    final int[] f3907a;

    /* renamed from: b */
    final AbstractC0956m f3908b;

    /* renamed from: c */
    private final String[] f3909c;

    /* renamed from: d */
    private final Set<String> f3910d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0957n(AbstractC0956m abstractC0956m, int[] iArr, String[] strArr) {
        this.f3908b = abstractC0956m;
        this.f3907a = iArr;
        this.f3909c = strArr;
        if (iArr.length == 1) {
            HashSet hashSet = new HashSet();
            hashSet.add(this.f3909c[0]);
            this.f3910d = Collections.unmodifiableSet(hashSet);
            return;
        }
        this.f3910d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3397a(Set<Integer> set) {
        int length = this.f3907a.length;
        Set<String> set2 = null;
        for (int i = 0; i < length; i++) {
            if (set.contains(Integer.valueOf(this.f3907a[i]))) {
                if (length == 1) {
                    set2 = this.f3910d;
                } else {
                    if (set2 == null) {
                        set2 = new HashSet<>(length);
                    }
                    set2.add(this.f3909c[i]);
                }
            }
        }
        if (set2 != null) {
            this.f3908b.mo3395a(set2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3398a(String[] strArr) {
        Set<String> set;
        if (this.f3909c.length == 1) {
            for (String str : strArr) {
                if (str.equalsIgnoreCase(this.f3909c[0])) {
                    set = this.f3910d;
                    break;
                }
            }
            set = null;
        } else {
            HashSet hashSet = new HashSet();
            for (String str2 : strArr) {
                String[] strArr2 = this.f3909c;
                int length = strArr2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        String str3 = strArr2[i];
                        if (str3.equalsIgnoreCase(str2)) {
                            hashSet.add(str3);
                            break;
                        }
                        i++;
                    }
                }
            }
            if (hashSet.size() > 0) {
                set = hashSet;
            }
            set = null;
        }
        if (set != null) {
            this.f3908b.mo3395a(set);
        }
    }
}
