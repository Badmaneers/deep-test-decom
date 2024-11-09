package androidx.vectordrawable.p039a.p040a;

import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedVectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.d */
/* loaded from: classes.dex */
public final class C1072d implements Drawable.Callback {

    /* renamed from: a */
    final /* synthetic */ C1071c f4277a;

    public C1072d(C1071c c1071c) {
        this.f4277a = c1071c;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f4277a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f4277a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f4277a.unscheduleSelf(runnable);
    }
}
