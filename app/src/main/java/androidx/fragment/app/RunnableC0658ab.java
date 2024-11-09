package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.p024g.ViewOnAttachStateChangeListenerC0535t;

/* compiled from: FragmentManagerImpl.java */
/* renamed from: androidx.fragment.app.ab */
/* loaded from: classes.dex */
final class RunnableC0658ab extends AnimationSet implements Runnable {

    /* renamed from: a */
    private final ViewGroup f2826a;

    /* renamed from: b */
    private final View f2827b;

    /* renamed from: c */
    private boolean f2828c;

    /* renamed from: d */
    private boolean f2829d;

    /* renamed from: e */
    private boolean f2830e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0658ab(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2830e = true;
        this.f2826a = viewGroup;
        this.f2827b = view;
        addAnimation(animation);
        this.f2826a.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f2830e = true;
        if (this.f2828c) {
            return !this.f2829d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f2828c = true;
            ViewOnAttachStateChangeListenerC0535t.m1813a(this.f2826a, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f2830e = true;
        if (this.f2828c) {
            return !this.f2829d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f2828c = true;
            ViewOnAttachStateChangeListenerC0535t.m1813a(this.f2826a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f2828c && this.f2830e) {
            this.f2830e = false;
            this.f2826a.post(this);
        } else {
            this.f2826a.endViewTransition(this.f2827b);
            this.f2829d = true;
        }
    }
}
