package com.color.support.widget;

import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.ColorLinearLayoutManager;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpandableRecyclerConnector.java */
/* renamed from: com.color.support.widget.fm */
/* loaded from: classes.dex */
public final class C1528fm implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ boolean f7269a;

    /* renamed from: b */
    final /* synthetic */ int f7270b;

    /* renamed from: c */
    final /* synthetic */ boolean f7271c;

    /* renamed from: d */
    final /* synthetic */ View f7272d;

    /* renamed from: e */
    final /* synthetic */ C1529fn f7273e;

    /* renamed from: f */
    final /* synthetic */ C1505fl f7274f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1528fm(C1505fl c1505fl, boolean z, int i, boolean z2, View view, C1529fn c1529fn) {
        this.f7274f = c1505fl;
        this.f7269a = z;
        this.f7270b = i;
        this.f7271c = z2;
        this.f7272d = view;
        this.f7273e = c1529fn;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        WeakReference weakReference;
        boolean z;
        boolean z2;
        boolean z3;
        weakReference = this.f7274f.f7175a;
        ColorExpandableRecyclerView colorExpandableRecyclerView = (ColorExpandableRecyclerView) weakReference.get();
        if (colorExpandableRecyclerView == null) {
            C1505fl.m5047b(this.f7274f);
            return;
        }
        int n = ((ColorLinearLayoutManager) colorExpandableRecyclerView.getLayoutManager()).m2849n();
        int p = ((ColorLinearLayoutManager) colorExpandableRecyclerView.getLayoutManager()).m2851p();
        z = this.f7274f.f7176b;
        if (z || this.f7269a || (n <= this.f7270b && p >= this.f7270b)) {
            z2 = this.f7274f.f7176b;
            if (z2 || this.f7269a || !this.f7271c || this.f7270b != p) {
                z3 = this.f7274f.f7176b;
                if (!z3 && this.f7269a && this.f7271c && this.f7272d.getBottom() > colorExpandableRecyclerView.getBottom()) {
                    Log.d("ExpandableRecyclerConnector", "onAnimationUpdate3: " + this.f7272d.getBottom() + "," + colorExpandableRecyclerView.getBottom());
                    C1505fl.m5047b(this.f7274f);
                    return;
                }
                C1505fl.m5049d(this.f7274f);
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f7273e.f7279e = intValue;
                this.f7272d.getLayoutParams().height = intValue;
                colorExpandableRecyclerView.requestLayout();
                return;
            }
            Log.d("ExpandableRecyclerConnector", "onAnimationUpdate2: " + p + "," + this.f7270b);
            C1505fl.m5047b(this.f7274f);
            return;
        }
        Log.d("ExpandableRecyclerConnector", "onAnimationUpdate1: " + n + "," + p + "," + this.f7270b);
        C1505fl.m5047b(this.f7274f);
    }
}
