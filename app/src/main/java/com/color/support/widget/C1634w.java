package com.color.support.widget;

import android.widget.ExpandableListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorExpandableListView.java */
/* renamed from: com.color.support.widget.w */
/* loaded from: classes.dex */
public final class C1634w implements ExpandableListView.OnGroupClickListener {

    /* renamed from: a */
    final /* synthetic */ ColorExpandableListView f7806a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1634w(ColorExpandableListView colorExpandableListView) {
        this.f7806a = colorExpandableListView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:            if (r2.onGroupClick(r9, r10, r11, r12) == false) goto L6;     */
    @Override // android.widget.ExpandableListView.OnGroupClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGroupClick(android.widget.ExpandableListView r9, android.view.View r10, int r11, long r12) {
        /*
            r8 = this;
            com.color.support.widget.ColorExpandableListView r0 = r8.f7806a
            android.widget.ExpandableListView$OnGroupClickListener r0 = com.color.support.widget.ColorExpandableListView.m4487a(r0)
            r1 = 1
            if (r0 == 0) goto L19
            com.color.support.widget.ColorExpandableListView r0 = r8.f7806a
            android.widget.ExpandableListView$OnGroupClickListener r2 = com.color.support.widget.ColorExpandableListView.m4487a(r0)
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            boolean r10 = r2.onGroupClick(r3, r4, r5, r6)
            if (r10 != 0) goto L69
        L19:
            com.color.support.widget.ColorExpandableListView r10 = r8.f7806a
            com.color.support.widget.ColorExpandableListView r12 = r8.f7806a
            int r12 = r12.getLastVisiblePosition()
            long r12 = r10.getExpandableListPosition(r12)
            int r10 = android.widget.ExpandableListView.getPackedPositionGroup(r12)
            r12 = 0
            if (r10 != r11) goto L53
            com.color.support.widget.ColorExpandableListView r10 = r8.f7806a
            com.color.support.widget.ColorExpandableListView r13 = r8.f7806a
            int r13 = r13.getChildCount()
            int r13 = r13 - r1
            android.view.View r10 = r10.getChildAt(r13)
            int r10 = r10.getBottom()
            com.color.support.widget.ColorExpandableListView r13 = r8.f7806a
            int r13 = r13.getHeight()
            com.color.support.widget.ColorExpandableListView r0 = r8.f7806a
            int r0 = r0.getListPaddingBottom()
            int r13 = r13 - r0
            if (r10 < r13) goto L53
            boolean r10 = r9.isGroupExpanded(r11)
            if (r10 != 0) goto L53
            return r12
        L53:
            com.color.support.widget.ColorExpandableListView r10 = r8.f7806a
            r10.playSoundEffect(r12)
            boolean r9 = r9.isGroupExpanded(r11)
            if (r9 == 0) goto L64
            com.color.support.widget.ColorExpandableListView r8 = r8.f7806a
            r8.collapseGroup(r11)
            goto L69
        L64:
            com.color.support.widget.ColorExpandableListView r8 = r8.f7806a
            r8.expandGroup(r11)
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.C1634w.onGroupClick(android.widget.ExpandableListView, android.view.View, int, long):boolean");
    }
}
