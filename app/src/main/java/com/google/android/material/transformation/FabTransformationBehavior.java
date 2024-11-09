package com.google.android.material.transformation;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.C0394f;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.p072a.C2032a;
import com.google.android.material.p072a.C2040i;
import com.google.android.material.p072a.C2041j;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: a */
    private final Rect f10609a;

    /* renamed from: b */
    private final RectF f10610b;

    /* renamed from: c */
    private final RectF f10611c;

    /* renamed from: d */
    private final int[] f10612d;

    /* renamed from: e */
    private float f10613e;

    /* renamed from: f */
    private float f10614f;

    /* renamed from: a */
    protected abstract C2409g mo7705a(Context context, boolean z);

    public FabTransformationBehavior() {
        this.f10609a = new Rect();
        this.f10610b = new RectF();
        this.f10611c = new RectF();
        this.f10612d = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10609a = new Rect();
        this.f10610b = new RectF();
        this.f10611c = new RectF();
        this.f10612d = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1413a(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1412a(C0394f c0394f) {
        if (c0394f.f2087h == 0) {
            c0394f.f2087h = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0387 A[LOOP:0: B:70:0x0385->B:71:0x0387, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a5  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final android.animation.AnimatorSet mo7696b(android.view.View r26, android.view.View r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.mo7696b(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    /* renamed from: a */
    private static Pair<C2040i, C2040i> m7699a(float f, float f2, boolean z, C2409g c2409g) {
        C2040i m6253a;
        C2040i m6253a2;
        if (f == 0.0f || f2 == 0.0f) {
            m6253a = c2409g.f10634a.m6253a("translationXLinear");
            m6253a2 = c2409g.f10634a.m6253a("translationYLinear");
        } else if ((z && f2 < 0.0f) || (!z && f2 > 0.0f)) {
            m6253a = c2409g.f10634a.m6253a("translationXCurveUpwards");
            m6253a2 = c2409g.f10634a.m6253a("translationYCurveUpwards");
        } else {
            m6253a = c2409g.f10634a.m6253a("translationXCurveDownwards");
            m6253a2 = c2409g.f10634a.m6253a("translationYCurveDownwards");
        }
        return new Pair<>(m6253a, m6253a2);
    }

    /* renamed from: a */
    private float m7697a(View view, View view2, C2041j c2041j) {
        float centerX;
        RectF rectF = this.f10610b;
        RectF rectF2 = this.f10611c;
        m7704b(view, rectF);
        m7702a(view2, rectF2);
        int i = c2041j.f8993a & 7;
        if (i == 1) {
            centerX = rectF2.centerX() - rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left - rectF.left;
        } else {
            centerX = i != 5 ? 0.0f : rectF2.right - rectF.right;
        }
        return centerX + c2041j.f8994b;
    }

    /* renamed from: b */
    private float m7703b(View view, View view2, C2041j c2041j) {
        float centerY;
        RectF rectF = this.f10610b;
        RectF rectF2 = this.f10611c;
        m7704b(view, rectF);
        m7702a(view2, rectF2);
        int i = c2041j.f8993a & 112;
        if (i == 16) {
            centerY = rectF2.centerY() - rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top - rectF.top;
        } else {
            centerY = i != 80 ? 0.0f : rectF2.bottom - rectF.bottom;
        }
        return centerY + c2041j.f8995c;
    }

    /* renamed from: a */
    private void m7702a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f10612d);
        rectF.offsetTo(r3[0], r3[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: b */
    private void m7704b(View view, RectF rectF) {
        m7702a(view, rectF);
        rectF.offset(this.f10613e, this.f10614f);
    }

    /* renamed from: a */
    private static float m7698a(C2409g c2409g, C2040i c2040i, float f) {
        long m6258a = c2040i.m6258a();
        long m6260b = c2040i.m6260b();
        C2040i m6253a = c2409g.f10634a.m6253a("expansion");
        return C2032a.m6240a(f, 0.0f, c2040i.m6261c().getInterpolation(((float) (((m6253a.m6258a() + m6253a.m6260b()) + 17) - m6258a)) / ((float) m6260b)));
    }

    /* renamed from: a */
    private static ViewGroup m7700a(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: a */
    private static void m7701a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j);
        list.add(createCircularReveal);
    }
}
