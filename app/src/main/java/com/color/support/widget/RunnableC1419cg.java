package com.color.support.widget;

/* compiled from: ColorNumberPicker.java */
/* renamed from: com.color.support.widget.cg */
/* loaded from: classes.dex */
final class RunnableC1419cg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ColorNumberPicker f7024a;

    /* renamed from: b */
    private boolean f7025b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1419cg(ColorNumberPicker colorNumberPicker) {
        this.f7024a = colorNumberPicker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ColorNumberPicker.m4606c(this.f7024a, this.f7025b);
        this.f7024a.postDelayed(this, ColorNumberPicker.m4611e(this.f7024a));
    }
}
