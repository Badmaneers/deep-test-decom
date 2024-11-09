package com.oppo.support.widget;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* compiled from: OppoTouchSearchView.java */
/* renamed from: com.oppo.support.widget.d */
/* loaded from: classes.dex */
final class C2471d {

    /* renamed from: a */
    CharSequence f10828a;

    /* renamed from: b */
    CharSequence f10829b;

    /* renamed from: c */
    CharSequence f10830c;

    /* renamed from: d */
    int f10831d;

    /* renamed from: e */
    int f10832e;

    /* renamed from: f */
    public Drawable f10833f;

    /* renamed from: g */
    String f10834g;

    /* renamed from: h */
    final /* synthetic */ OppoTouchSearchView f10835h;

    /* renamed from: i */
    private TextPaint f10836i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2471d(OppoTouchSearchView oppoTouchSearchView) {
        this.f10835h = oppoTouchSearchView;
        this.f10829b = null;
        this.f10830c = null;
        this.f10833f = null;
        this.f10834g = null;
        this.f10836i = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2471d(OppoTouchSearchView oppoTouchSearchView, Drawable drawable, String str) {
        this.f10835h = oppoTouchSearchView;
        this.f10829b = null;
        this.f10830c = null;
        this.f10833f = null;
        this.f10834g = null;
        this.f10836i = null;
        this.f10833f = drawable;
        this.f10834g = str;
        this.f10836i = new TextPaint(1);
        this.f10836i.setTextSize(OppoTouchSearchView.m7822c(oppoTouchSearchView) == 0 ? OppoTouchSearchView.m7824d(oppoTouchSearchView) : r3);
        OppoTouchSearchView.m7812a(oppoTouchSearchView, OppoTouchSearchView.m7826e(oppoTouchSearchView));
        if (OppoTouchSearchView.m7828f(oppoTouchSearchView) == null) {
            OppoTouchSearchView.m7812a(oppoTouchSearchView, OppoTouchSearchView.m7830g(oppoTouchSearchView));
        }
        if (OppoTouchSearchView.m7832h(oppoTouchSearchView) != null) {
            this.f10836i.setTypeface(OppoTouchSearchView.m7832h(oppoTouchSearchView));
        }
    }

    /* renamed from: a */
    public final Drawable m7838a() {
        if (this.f10833f != null) {
            return this.f10833f;
        }
        return null;
    }
}
