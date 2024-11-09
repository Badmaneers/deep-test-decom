package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager2.java */
/* renamed from: androidx.viewpager2.widget.w */
/* loaded from: classes.dex */
public final class C1140w extends RecyclerView {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f4566a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140w(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f4566a = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (this.f4566a.f4507f.mo3765h()) {
            return this.f4566a.f4507f.mo3766i();
        }
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setFromIndex(this.f4566a.f4503b);
        accessibilityEvent.setToIndex(this.f4566a.f4503b);
        this.f4566a.f4507f.mo3748a(accessibilityEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f4566a.m3721d() && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4566a.m3721d() && super.onInterceptTouchEvent(motionEvent);
    }
}
