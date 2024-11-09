package androidx.appcompat.widget;

import android.graphics.Typeface;
import java.lang.ref.WeakReference;

/* compiled from: AppCompatTextHelper.java */
/* renamed from: androidx.appcompat.widget.be */
/* loaded from: classes.dex */
final class RunnableC0213be implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0212bd f1181a;

    /* renamed from: b */
    private final WeakReference<C0211bc> f1182b;

    /* renamed from: c */
    private final Typeface f1183c;

    public RunnableC0213be(C0212bd c0212bd, WeakReference<C0211bc> weakReference, Typeface typeface) {
        this.f1181a = c0212bd;
        this.f1182b = weakReference;
        this.f1183c = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0211bc c0211bc = this.f1182b.get();
        if (c0211bc == null) {
            return;
        }
        c0211bc.m772a(this.f1183c);
    }
}
