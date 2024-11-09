package com.color.support.widget;

import android.animation.Animator;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ErrorEditTextHelper.java */
/* renamed from: com.color.support.widget.fc */
/* loaded from: classes.dex */
public final class C1496fc implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ C1490ex f7157a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1496fc(C1490ex c1490ex) {
        this.f7157a = c1490ex;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        EditText editText;
        EditText editText2;
        float f;
        EditText editText3;
        editText = this.f7157a.f7131b;
        editText2 = this.f7157a.f7131b;
        editText.setSelection(editText2.length());
        f = this.f7157a.f7151v;
        if (f <= 0.0f) {
            C1490ex c1490ex = this.f7157a;
            editText3 = this.f7157a.f7131b;
            c1490ex.f7151v = editText3.getHeight();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7157a.m5022b(true, true, true);
        C1490ex.m5031f(this.f7157a);
    }
}
