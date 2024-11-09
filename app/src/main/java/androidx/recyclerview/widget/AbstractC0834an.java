package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* compiled from: OrientationHelper.java */
/* renamed from: androidx.recyclerview.widget.an */
/* loaded from: classes.dex */
public abstract class AbstractC0834an {

    /* renamed from: a */
    protected final AbstractC0856bi f3502a;

    /* renamed from: b */
    final Rect f3503b;

    /* renamed from: c */
    private int f3504c;

    /* renamed from: a */
    public abstract int mo2968a(View view);

    /* renamed from: a */
    public abstract void mo2970a(int i);

    /* renamed from: b */
    public abstract int mo2971b(View view);

    /* renamed from: c */
    public abstract int mo2974c(View view);

    /* renamed from: d */
    public abstract int mo2975d();

    /* renamed from: d */
    public abstract int mo2976d(View view);

    /* renamed from: e */
    public abstract int mo2977e();

    /* renamed from: e */
    public abstract int mo2978e(View view);

    /* renamed from: f */
    public abstract int mo2979f();

    /* renamed from: f */
    public abstract int mo2980f(View view);

    /* renamed from: g */
    public abstract int mo2981g();

    /* renamed from: h */
    public abstract int mo2982h();

    /* renamed from: i */
    public abstract int mo2983i();

    /* renamed from: j */
    public abstract int mo2984j();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC0834an(AbstractC0856bi abstractC0856bi, byte b) {
        this(abstractC0856bi);
    }

    private AbstractC0834an(AbstractC0856bi abstractC0856bi) {
        this.f3504c = RecyclerView.UNDEFINED_DURATION;
        this.f3503b = new Rect();
        this.f3502a = abstractC0856bi;
    }

    /* renamed from: a */
    public final AbstractC0856bi m2969a() {
        return this.f3502a;
    }

    /* renamed from: b */
    public final void m2972b() {
        this.f3504c = mo2981g();
    }

    /* renamed from: c */
    public final int m2973c() {
        if (Integer.MIN_VALUE == this.f3504c) {
            return 0;
        }
        return mo2981g() - this.f3504c;
    }

    /* renamed from: a */
    public static AbstractC0834an m2966a(AbstractC0856bi abstractC0856bi, int i) {
        switch (i) {
            case 0:
                return m2965a(abstractC0856bi);
            case 1:
                return m2967b(abstractC0856bi);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    /* renamed from: a */
    public static AbstractC0834an m2965a(AbstractC0856bi abstractC0856bi) {
        return new C0835ao(abstractC0856bi);
    }

    /* renamed from: b */
    public static AbstractC0834an m2967b(AbstractC0856bi abstractC0856bi) {
        return new C0836ap(abstractC0856bi);
    }
}
