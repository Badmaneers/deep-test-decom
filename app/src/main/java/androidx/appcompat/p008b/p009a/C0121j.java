package androidx.appcompat.p008b.p009a;

import android.graphics.drawable.Drawable;

/* compiled from: DrawableContainer.java */
/* renamed from: androidx.appcompat.b.a.j */
/* loaded from: classes.dex */
final class C0121j implements Drawable.Callback {

    /* renamed from: a */
    private Drawable.Callback f400a;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
    }

    /* renamed from: a */
    public final C0121j m281a(Drawable.Callback callback) {
        this.f400a = callback;
        return this;
    }

    /* renamed from: a */
    public final Drawable.Callback m280a() {
        Drawable.Callback callback = this.f400a;
        this.f400a = null;
        return callback;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (this.f400a != null) {
            this.f400a.scheduleDrawable(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.f400a != null) {
            this.f400a.unscheduleDrawable(drawable, runnable);
        }
    }
}
