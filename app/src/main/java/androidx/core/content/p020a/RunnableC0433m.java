package androidx.core.content.p020a;

import android.graphics.Typeface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourcesCompat.java */
/* renamed from: androidx.core.content.a.m */
/* loaded from: classes.dex */
public final class RunnableC0433m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Typeface f2171a;

    /* renamed from: b */
    final /* synthetic */ AbstractC0432l f2172b;

    public RunnableC0433m(AbstractC0432l abstractC0432l, Typeface typeface) {
        this.f2172b = abstractC0432l;
        this.f2171a = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2172b.mo789a(this.f2171a);
    }
}
