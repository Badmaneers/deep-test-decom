package com.color.support.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.CheckBox;
import android.widget.ListView;

/* loaded from: classes.dex */
public class ColorListView extends ListView {

    /* renamed from: a */
    private InterfaceC1389bd f6131a;

    /* renamed from: b */
    private boolean f6132b;

    /* renamed from: c */
    private int f6133c;

    /* renamed from: d */
    private int f6134d;

    /* renamed from: e */
    private boolean f6135e;

    /* renamed from: f */
    private int f6136f;

    /* renamed from: g */
    private int f6137g;

    /* renamed from: h */
    private boolean f6138h;

    /* renamed from: i */
    private int f6139i;

    /* renamed from: j */
    private int f6140j;

    /* renamed from: k */
    private Runnable f6141k;

    public ColorListView(Context context) {
        this(context, null);
    }

    public ColorListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ColorListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6132b = true;
        this.f6133c = -2;
        this.f6134d = -2;
        this.f6135e = false;
        this.f6138h = true;
        this.f6139i = -1;
        this.f6140j = -1;
        this.f6141k = new RunnableC1388bc(this);
        this.f6136f = getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.oppo_listview_scrollchoice_left_offset);
        this.f6137g = getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.oppo_listview_scrollchoice_right_offset);
    }

    public void setCheckItemId(int i) {
        this.f6140j = i;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0 && m4523a(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4521a(int i, int i2) {
        setSelectionFromTop(i, (((getHeight() - getPaddingTop()) - getPaddingBottom()) - getChildAt(getChildCount() - 1).getHeight()) + i2);
    }

    /* renamed from: a */
    private boolean m4523a(MotionEvent motionEvent) {
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        int rawX = (int) motionEvent.getRawX();
        int[] iArr = new int[2];
        try {
            if (this.f6140j > 0) {
                CheckBox checkBox = (CheckBox) getChildAt(pointToPosition - getFirstVisiblePosition()).findViewById(this.f6140j);
                checkBox.getLocationOnScreen(iArr);
                int i = iArr[0] - this.f6136f;
                int i2 = iArr[0] + this.f6137g;
                if (checkBox.getVisibility() == 0 && rawX > i && rawX < i2 && pointToPosition > getHeaderViewsCount() - 1 && pointToPosition < getCount() - getFooterViewsCount()) {
                    this.f6132b = true;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f6132b = false;
                }
                return false;
            }
            this.f6132b = false;
            return false;
        } catch (Exception unused) {
            if (motionEvent.getActionMasked() == 0) {
                this.f6132b = false;
            }
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f6132b
            r1 = -1
            r2 = 0
            r3 = -2
            r4 = 1
            if (r0 == 0) goto L8f
            boolean r0 = r7.m4523a(r8)
            if (r0 == 0) goto L8f
            float r0 = r8.getX()
            int r0 = (int) r0
            float r5 = r8.getY()
            int r5 = (int) r5
            int r0 = r7.pointToPosition(r0, r5)
            int r5 = r8.getActionMasked()
            switch(r5) {
                case 0: goto L29;
                case 1: goto L24;
                case 2: goto L2b;
                default: goto L23;
            }
        L23:
            goto L8f
        L24:
            r7.f6133c = r3
            r7.f6134d = r3
            goto L8f
        L29:
            r7.f6135e = r4
        L2b:
            int r8 = r7.getCount()
            int r8 = r8 - r4
            if (r0 != r8) goto L35
            r7.m4521a(r0, r2)
        L35:
            boolean r8 = r7.f6135e
            if (r8 == 0) goto L8e
            int r8 = r7.f6133c
            if (r8 == r0) goto L8e
            if (r0 == r1) goto L8e
            com.color.support.widget.bd r8 = r7.f6131a
            if (r8 == 0) goto L8e
            java.lang.Runnable r8 = r7.f6141k
            r7.removeCallbacks(r8)
            int r8 = r7.getFirstVisiblePosition()
            int r8 = r0 - r8
            r7.getChildAt(r8)
            int r8 = r7.f6133c
            if (r8 == r3) goto L7a
            int r8 = r7.getFirstVisiblePosition()
            r5 = 50
            if (r0 != r8) goto L67
            if (r0 <= 0) goto L67
            r7.f6138h = r4
            java.lang.Runnable r8 = r7.f6141k
            r7.postDelayed(r8, r5)
            goto L7a
        L67:
            int r8 = r7.getLastVisiblePosition()
            if (r0 != r8) goto L7a
            int r8 = r7.getCount()
            if (r0 >= r8) goto L7a
            r7.f6138h = r2
            java.lang.Runnable r8 = r7.f6141k
            r7.postDelayed(r8, r5)
        L7a:
            int r8 = r7.f6134d
            if (r8 != r0) goto L88
            int r8 = r7.f6133c
            int r1 = r7.getFirstVisiblePosition()
            int r8 = r8 - r1
            r7.getChildAt(r8)
        L88:
            int r8 = r7.f6133c
            r7.f6134d = r8
            r7.f6133c = r0
        L8e:
            return r4
        L8f:
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L9b
            r5 = 3
            if (r0 == r5) goto L9b
            goto La7
        L9b:
            r7.f6138h = r4
            r7.f6133c = r3
            r7.f6134d = r3
            r7.f6135e = r2
            r7.f6132b = r4
            r7.f6139i = r1
        La7:
            boolean r7 = super.onTouchEvent(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.ColorListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setScrollMultiChoiceListener(InterfaceC1389bd interfaceC1389bd) {
        this.f6131a = interfaceC1389bd;
    }
}
