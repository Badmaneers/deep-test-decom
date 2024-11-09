package androidx.appcompat.widget;

import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListPopupWindow.java */
/* renamed from: androidx.appcompat.widget.ca */
/* loaded from: classes.dex */
public final class RunnableC0236ca implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0228bt f1273a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0236ca(C0228bt c0228bt) {
        this.f1273a = c0228bt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1273a.f1243c == null || !C0538w.m1822F(this.f1273a.f1243c) || this.f1273a.f1243c.getCount() <= this.f1273a.f1243c.getChildCount() || this.f1273a.f1243c.getChildCount() > this.f1273a.f1244d) {
            return;
        }
        this.f1273a.f1247g.setInputMethodMode(2);
        this.f1273a.mo391a_();
    }
}
