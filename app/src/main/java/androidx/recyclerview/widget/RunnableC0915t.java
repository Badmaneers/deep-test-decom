package androidx.recyclerview.widget;

/* compiled from: FastScroller.java */
/* renamed from: androidx.recyclerview.widget.t */
/* loaded from: classes.dex */
public final class RunnableC0915t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0914s f3765a;

    public RunnableC0915t(C0914s c0914s) {
        this.f3765a = c0914s;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // java.lang.Runnable
    public final void run() {
        C0914s c0914s = this.f3765a;
        switch (c0914s.f3750j) {
            case 1:
                c0914s.f3749i.cancel();
            case 2:
                c0914s.f3750j = 3;
                c0914s.f3749i.setFloatValues(((Float) c0914s.f3749i.getAnimatedValue()).floatValue(), 0.0f);
                c0914s.f3749i.setDuration(500L);
                c0914s.f3749i.start();
                return;
            default:
                return;
        }
    }
}
