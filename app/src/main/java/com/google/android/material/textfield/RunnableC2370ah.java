package com.google.android.material.textfield;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: TextInputLayout.java */
/* renamed from: com.google.android.material.textfield.ah */
/* loaded from: classes.dex */
final class RunnableC2370ah implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f10534a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2370ah(TextInputLayout textInputLayout) {
        this.f10534a = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckableImageButton checkableImageButton;
        CheckableImageButton checkableImageButton2;
        checkableImageButton = this.f10534a.f10476ag;
        checkableImageButton.performClick();
        checkableImageButton2 = this.f10534a.f10476ag;
        checkableImageButton2.jumpDrawablesToCurrentState();
    }
}
