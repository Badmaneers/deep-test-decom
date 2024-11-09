package androidx.room;

import java.util.Iterator;
import java.util.Map;

/* compiled from: MultiInstanceInvalidationClient.java */
/* renamed from: androidx.room.q */
/* loaded from: classes.dex */
final class RunnableC0960q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String[] f3925a;

    /* renamed from: b */
    final /* synthetic */ BinderC0959p f3926b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0960q(BinderC0959p binderC0959p, String[] strArr) {
        this.f3926b = binderC0959p;
        this.f3925a = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0953j c0953j = this.f3926b.f3924a.f3914d;
        String[] strArr = this.f3925a;
        synchronized (c0953j.f3893f) {
            Iterator<Map.Entry<AbstractC0956m, C0957n>> it = c0953j.f3893f.iterator();
            while (it.hasNext()) {
                Map.Entry<AbstractC0956m, C0957n> next = it.next();
                if (!next.getKey().mo3396a()) {
                    next.getValue().m3398a(strArr);
                }
            }
        }
    }
}
