package com.color.support.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.AbstractC0391c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class StatementBehavior extends AbstractC0391c {

    /* renamed from: a */
    public int f5839a;

    /* renamed from: b */
    private View f5840b;

    /* renamed from: c */
    private View f5841c;

    /* renamed from: d */
    private View f5842d;

    /* renamed from: e */
    private int f5843e;

    /* renamed from: f */
    private int f5844f;

    /* renamed from: g */
    private int f5845g;

    /* renamed from: h */
    private int[] f5846h;

    /* renamed from: i */
    private ViewGroup.LayoutParams f5847i;

    /* renamed from: j */
    private int f5848j;

    /* renamed from: k */
    private int f5849k;

    /* renamed from: l */
    private int f5850l;

    /* renamed from: m */
    private int f5851m;

    /* renamed from: n */
    private int f5852n;

    /* renamed from: o */
    private int f5853o;

    /* renamed from: p */
    private int f5854p;

    /* renamed from: q */
    private float f5855q;

    /* renamed from: r */
    private float f5856r;

    /* renamed from: s */
    private Resources f5857s;

    public StatementBehavior() {
        this.f5846h = new int[2];
    }

    public StatementBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5846h = new int[2];
        this.f5857s = context.getResources();
        this.f5848j = this.f5857s.getDimensionPixelOffset(R.dimen.preference_divider_margin_horizontal) * 2;
        this.f5851m = this.f5857s.getDimensionPixelOffset(R.dimen.preference_line_alpha_range_change_offset);
        this.f5854p = this.f5857s.getDimensionPixelOffset(R.dimen.preference_divider_width_change_offset);
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1421a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (this.f5849k <= 0) {
            view.getLocationOnScreen(this.f5846h);
            this.f5849k = this.f5846h[1];
            this.f5841c = view3;
            this.f5840b = view.findViewById(R.id.divider_line);
            this.f5839a = this.f5840b.getWidth();
            this.f5847i = this.f5840b.getLayoutParams();
            this.f5850l = this.f5849k - this.f5851m;
            this.f5853o = this.f5849k - this.f5857s.getDimensionPixelOffset(R.dimen.preference_divider_width_start_count_offset);
            this.f5852n = this.f5853o - this.f5854p;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        view3.setOnScrollChangeListener(new ViewOnScrollChangeListenerC1352d(this));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m4408a(StatementBehavior statementBehavior) {
        statementBehavior.f5842d = null;
        if (statementBehavior.f5841c instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) statementBehavior.f5841c;
            if (viewGroup.getChildCount() > 0) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    if (viewGroup.getChildAt(i).getVisibility() == 0) {
                        statementBehavior.f5842d = viewGroup.getChildAt(i);
                        break;
                    }
                    i++;
                }
            }
        }
        if (statementBehavior.f5842d == null) {
            statementBehavior.f5842d = statementBehavior.f5841c;
        }
        statementBehavior.f5842d.getLocationOnScreen(statementBehavior.f5846h);
        statementBehavior.f5843e = statementBehavior.f5846h[1];
        statementBehavior.f5844f = 0;
        if (statementBehavior.f5843e < statementBehavior.f5850l) {
            statementBehavior.f5844f = statementBehavior.f5851m;
        } else if (statementBehavior.f5843e > statementBehavior.f5849k) {
            statementBehavior.f5844f = 0;
        } else {
            statementBehavior.f5844f = statementBehavior.f5849k - statementBehavior.f5843e;
        }
        statementBehavior.f5845g = statementBehavior.f5844f;
        if (statementBehavior.f5855q <= 1.0f) {
            statementBehavior.f5855q = Math.abs(statementBehavior.f5845g) / statementBehavior.f5851m;
            statementBehavior.f5840b.setAlpha(statementBehavior.f5855q);
        }
        if (statementBehavior.f5843e < statementBehavior.f5852n) {
            statementBehavior.f5844f = statementBehavior.f5854p;
        } else if (statementBehavior.f5843e > statementBehavior.f5853o) {
            statementBehavior.f5844f = 0;
        } else {
            statementBehavior.f5844f = statementBehavior.f5853o - statementBehavior.f5843e;
        }
        statementBehavior.f5845g = statementBehavior.f5844f;
        statementBehavior.f5856r = Math.abs(statementBehavior.f5845g) / statementBehavior.f5854p;
        statementBehavior.f5847i.width = (int) (statementBehavior.f5839a - (statementBehavior.f5848j * (1.0f - statementBehavior.f5856r)));
        statementBehavior.f5840b.setLayoutParams(statementBehavior.f5847i);
    }
}
