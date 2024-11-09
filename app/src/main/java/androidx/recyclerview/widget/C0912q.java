package androidx.recyclerview.widget;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.q */
/* loaded from: classes.dex */
final class C0912q {

    /* renamed from: a */
    public AbstractC0879ce f3723a;

    /* renamed from: b */
    public AbstractC0879ce f3724b;

    /* renamed from: c */
    public int f3725c;

    /* renamed from: d */
    public int f3726d;

    /* renamed from: e */
    public int f3727e;

    /* renamed from: f */
    public int f3728f;

    private C0912q(AbstractC0879ce abstractC0879ce, AbstractC0879ce abstractC0879ce2) {
        this.f3723a = abstractC0879ce;
        this.f3724b = abstractC0879ce2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0912q(AbstractC0879ce abstractC0879ce, AbstractC0879ce abstractC0879ce2, int i, int i2, int i3, int i4) {
        this(abstractC0879ce, abstractC0879ce2);
        this.f3725c = i;
        this.f3726d = i2;
        this.f3727e = i3;
        this.f3728f = i4;
    }

    public final String toString() {
        return "ChangeInfo{oldHolder=" + this.f3723a + ", newHolder=" + this.f3724b + ", fromX=" + this.f3725c + ", fromY=" + this.f3726d + ", toX=" + this.f3727e + ", toY=" + this.f3728f + '}';
    }
}
