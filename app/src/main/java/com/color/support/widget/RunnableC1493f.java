package com.color.support.widget;

/* compiled from: ColorCircleProgressBar.java */
/* renamed from: com.color.support.widget.f */
/* loaded from: classes.dex */
final class RunnableC1493f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ColorCircleProgressBar f7154a;

    private RunnableC1493f(ColorCircleProgressBar colorCircleProgressBar) {
        this.f7154a = colorCircleProgressBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC1493f(ColorCircleProgressBar colorCircleProgressBar, byte b) {
        this(colorCircleProgressBar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7154a.sendAccessibilityEvent(4);
    }
}
