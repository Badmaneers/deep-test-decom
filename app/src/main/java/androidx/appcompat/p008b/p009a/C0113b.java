package androidx.appcompat.p008b.p009a;

import android.graphics.drawable.Animatable;

/* compiled from: AnimatedStateListDrawableCompat.java */
/* renamed from: androidx.appcompat.b.a.b */
/* loaded from: classes.dex */
final class C0113b extends AbstractC0118g {

    /* renamed from: a */
    private final Animatable f377a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0113b(Animatable animatable) {
        super((byte) 0);
        this.f377a = animatable;
    }

    @Override // androidx.appcompat.p008b.p009a.AbstractC0118g
    /* renamed from: a */
    public final void mo260a() {
        this.f377a.start();
    }

    @Override // androidx.appcompat.p008b.p009a.AbstractC0118g
    /* renamed from: b */
    public final void mo261b() {
        this.f377a.stop();
    }
}
