package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    long f2446a;

    /* renamed from: b */
    boolean f2447b;

    /* renamed from: c */
    boolean f2448c;

    /* renamed from: d */
    boolean f2449d;

    /* renamed from: e */
    private final Runnable f2450e;

    /* renamed from: f */
    private final Runnable f2451f;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2446a = -1L;
        this.f2447b = false;
        this.f2448c = false;
        this.f2449d = false;
        this.f2450e = new RunnableC0568f(this);
        this.f2451f = new RunnableC0569g(this);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1982a();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1982a();
    }

    /* renamed from: a */
    private void m1982a() {
        removeCallbacks(this.f2450e);
        removeCallbacks(this.f2451f);
    }
}
