package com.google.android.material.bottomappbar;

import android.graphics.Rect;
import android.view.View;
import androidx.coordinatorlayout.widget.C0394f;
import com.google.android.material.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C2250as;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomAppBar.java */
/* renamed from: com.google.android.material.bottomappbar.j */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC2080j implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ BottomAppBar.Behavior f9187a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnLayoutChangeListenerC2080j(BottomAppBar.Behavior behavior) {
        this.f9187a = behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        WeakReference weakReference;
        Rect rect;
        Rect rect2;
        int i9;
        int bottomInset;
        int leftInset;
        int rightInset;
        int i10;
        int i11;
        weakReference = this.f9187a.f9168b;
        BottomAppBar bottomAppBar = (BottomAppBar) weakReference.get();
        if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
            view.removeOnLayoutChangeListener(this);
            return;
        }
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        rect = this.f9187a.f9167a;
        floatingActionButton.m6945b(rect);
        rect2 = this.f9187a.f9167a;
        int height = rect2.height();
        bottomAppBar.m6439a(height);
        C0394f c0394f = (C0394f) view.getLayoutParams();
        i9 = this.f9187a.f9169c;
        if (i9 == 0) {
            int dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2);
            bottomInset = bottomAppBar.getBottomInset();
            c0394f.bottomMargin = bottomInset + dimensionPixelOffset;
            leftInset = bottomAppBar.getLeftInset();
            c0394f.leftMargin = leftInset;
            rightInset = bottomAppBar.getRightInset();
            c0394f.rightMargin = rightInset;
            if (C2250as.m7112a(floatingActionButton)) {
                int i12 = c0394f.leftMargin;
                i11 = bottomAppBar.f9150h;
                c0394f.leftMargin = i12 + i11;
            } else {
                int i13 = c0394f.rightMargin;
                i10 = bottomAppBar.f9150h;
                c0394f.rightMargin = i13 + i10;
            }
        }
    }
}
