package androidx.customview.p027a;

import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: FocusStrategy.java */
/* renamed from: androidx.customview.a.h */
/* loaded from: classes.dex */
final class C0589h<T> implements Comparator<T> {

    /* renamed from: a */
    private final Rect f2545a = new Rect();

    /* renamed from: b */
    private final Rect f2546b = new Rect();

    /* renamed from: c */
    private final boolean f2547c;

    /* renamed from: d */
    private final InterfaceC0587f<T> f2548d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0589h(boolean z, InterfaceC0587f<T> interfaceC0587f) {
        this.f2547c = z;
        this.f2548d = interfaceC0587f;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Rect rect = this.f2545a;
        Rect rect2 = this.f2546b;
        this.f2548d.mo2086a(t, rect);
        this.f2548d.mo2086a(t2, rect2);
        if (rect.top < rect2.top) {
            return -1;
        }
        if (rect.top > rect2.top) {
            return 1;
        }
        if (rect.left < rect2.left) {
            return this.f2547c ? 1 : -1;
        }
        if (rect.left > rect2.left) {
            return this.f2547c ? -1 : 1;
        }
        if (rect.bottom < rect2.bottom) {
            return -1;
        }
        if (rect.bottom > rect2.bottom) {
            return 1;
        }
        if (rect.right < rect2.right) {
            return this.f2547c ? 1 : -1;
        }
        if (rect.right > rect2.right) {
            return this.f2547c ? -1 : 1;
        }
        return 0;
    }
}
