package com.google.android.material.textfield;

/* compiled from: TextInputLayout.java */
/* renamed from: com.google.android.material.textfield.ai */
/* loaded from: classes.dex */
final class RunnableC2371ai implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f10535a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2371ai(TextInputLayout textInputLayout) {
        this.f10535a = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10535a.f10461a.requestLayout();
    }
}
