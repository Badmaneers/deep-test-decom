package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: ViewModelStore.java */
/* renamed from: androidx.lifecycle.ae */
/* loaded from: classes.dex */
public final class C0720ae {

    /* renamed from: a */
    private final HashMap<String, AbstractC0716aa> f3063a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2604a(String str, AbstractC0716aa abstractC0716aa) {
        AbstractC0716aa put = this.f3063a.put(str, abstractC0716aa);
        if (put != null) {
            put.mo2362a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC0716aa m2602a(String str) {
        return this.f3063a.get(str);
    }

    /* renamed from: a */
    public final void m2603a() {
        Iterator<AbstractC0716aa> it = this.f3063a.values().iterator();
        while (it.hasNext()) {
            it.next().m2599d();
        }
        this.f3063a.clear();
    }
}
