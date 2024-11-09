package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC2344s {

    /* renamed from: a */
    private TextView f10301a;

    /* renamed from: b */
    private Button f10302b;

    /* renamed from: c */
    private int f10303c;

    /* renamed from: d */
    private int f10304d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
        this.f10303c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
        this.f10304d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10301a = (TextView) findViewById(R.id.snackbar_text);
        this.f10302b = (Button) findViewById(R.id.snackbar_action);
    }

    public TextView getMessageView() {
        return this.f10301a;
    }

    public Button getActionView() {
        return this.f10302b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:            if (m7449a(1, r0, r0 - r1) != false) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:            r4 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:            if (m7449a(0, r0, r0) != false) goto L26;     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f10303c
            if (r0 <= 0) goto L1a
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f10303c
            if (r0 <= r1) goto L1a
            int r8 = r7.f10303c
            r0 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            super.onMeasure(r8, r9)
        L1a:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.R.dimen.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.google.android.material.R.dimen.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f10301a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3e
            r2 = r4
            goto L3f
        L3e:
            r2 = r3
        L3f:
            if (r2 == 0) goto L58
            int r5 = r7.f10304d
            if (r5 <= 0) goto L58
            android.widget.Button r5 = r7.f10302b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f10304d
            if (r5 <= r6) goto L58
            int r1 = r0 - r1
            boolean r0 = r7.m7449a(r4, r0, r1)
            if (r0 == 0) goto L63
            goto L64
        L58:
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            r0 = r1
        L5c:
            boolean r0 = r7.m7449a(r3, r0, r0)
            if (r0 == 0) goto L63
            goto L64
        L63:
            r4 = r3
        L64:
            if (r4 == 0) goto L69
            super.onMeasure(r8, r9)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private boolean m7449a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f10301a.getPaddingTop() == i2 && this.f10301a.getPaddingBottom() == i3) {
            return z;
        }
        m7448a(this.f10301a, i2, i3);
        return true;
    }

    /* renamed from: a */
    private static void m7448a(View view, int i, int i2) {
        if (C0538w.m1895x(view)) {
            C0538w.m1863b(view, C0538w.m1883l(view), i, C0538w.m1884m(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    @Override // com.google.android.material.snackbar.InterfaceC2344s
    /* renamed from: a */
    public final void mo7450a() {
        this.f10301a.setAlpha(0.0f);
        this.f10301a.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
        if (this.f10302b.getVisibility() == 0) {
            this.f10302b.setAlpha(0.0f);
            this.f10302b.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
        }
    }

    @Override // com.google.android.material.snackbar.InterfaceC2344s
    /* renamed from: b */
    public final void mo7451b() {
        this.f10301a.setAlpha(1.0f);
        this.f10301a.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        if (this.f10302b.getVisibility() == 0) {
            this.f10302b.setAlpha(1.0f);
            this.f10302b.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.f10304d = i;
    }
}
