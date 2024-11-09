package com.color.support.widget;

/* compiled from: ColorLoadProgress.java */
/* renamed from: com.color.support.widget.be */
/* loaded from: classes.dex */
final class RunnableC1390be implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ColorLoadProgress f6956a;

    private RunnableC1390be(ColorLoadProgress colorLoadProgress) {
        this.f6956a = colorLoadProgress;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC1390be(ColorLoadProgress colorLoadProgress, byte b) {
        this(colorLoadProgress);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6956a.sendAccessibilityEvent(4);
    }
}
