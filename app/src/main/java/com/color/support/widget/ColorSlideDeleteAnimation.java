package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.p024g.p026b.C0517b;

/* loaded from: classes.dex */
public abstract class ColorSlideDeleteAnimation {

    /* renamed from: a */
    private View f6537a;

    /* renamed from: b */
    private ValueAnimator f6538b;

    /* renamed from: c */
    private ObjectAnimator f6539c;

    /* renamed from: d */
    private AnimatorSet f6540d;

    /* renamed from: e */
    private ViewWrapper f6541e;

    /* renamed from: b */
    public abstract void mo4737b();

    public ColorSlideDeleteAnimation(View view, int i, int i2, int i3) {
        this.f6537a = view;
        this.f6538b = ValueAnimator.ofInt(i, i2);
        this.f6538b.setDuration(330L);
        this.f6538b.setInterpolator(C0517b.m1773a(0.3f, 0.0f, 0.1f, 1.0f));
        this.f6538b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.color.support.widget.ColorSlideDeleteAnimation.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ColorSlideDeleteAnimation.this.f6537a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
            }
        });
        this.f6541e = new ViewWrapper(this.f6537a);
        this.f6539c = ObjectAnimator.ofInt(this.f6541e, "height", i3, 0);
        this.f6539c.setInterpolator(C0517b.m1773a(0.3f, 0.0f, 0.1f, 1.0f));
        this.f6539c.setDuration(400L);
        this.f6539c.setStartDelay(10L);
        this.f6539c.addListener(new Animator.AnimatorListener() { // from class: com.color.support.widget.ColorSlideDeleteAnimation.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ColorSlideDeleteAnimation.this.mo4737b();
            }
        });
        this.f6540d = new AnimatorSet();
        this.f6540d.play(this.f6538b).with(this.f6539c);
    }

    /* renamed from: a */
    public final void m4736a() {
        this.f6540d.start();
    }

    /* loaded from: classes.dex */
    class ViewWrapper {

        /* renamed from: a */
        View f6544a;

        public ViewWrapper(View view) {
            this.f6544a = view;
        }

        public int getHeight() {
            return this.f6544a.getLayoutParams().height;
        }

        public void setHeight(int i) {
            this.f6544a.getLayoutParams().height = i;
            this.f6544a.requestLayout();
        }
    }
}
