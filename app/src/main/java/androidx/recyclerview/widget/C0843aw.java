package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.aw */
/* loaded from: classes.dex */
public final class C0843aw implements InterfaceC0901f {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f3511a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0843aw(RecyclerView recyclerView) {
        this.f3511a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0901f
    /* renamed from: a */
    public final int mo2994a() {
        return this.f3511a.getChildCount();
    }

    @Override // androidx.recyclerview.widget.InterfaceC0901f
    /* renamed from: a */
    public final void mo2997a(View view, int i) {
        this.f3511a.addView(view, i);
        this.f3511a.dispatchChildAttached(view);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0901f
    /* renamed from: a */
    public final int mo2995a(View view) {
        return this.f3511a.indexOfChild(view);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0901f
    /* renamed from: a */
    public final void mo2996a(int i) {
        View childAt = this.f3511a.getChildAt(i);
        if (childAt != null) {
            this.f3511a.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        this.f3511a.removeViewAt(i);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0901f
    /* renamed from: b */
    public final View mo2999b(int i) {
        return this.f3511a.getChildAt(i);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0901f
    /* renamed from: b */
    public final AbstractC0879ce mo3000b(View view) {
        return RecyclerView.getChildViewHolderInt(view);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0901f
    /* renamed from: a */
    public final void mo2998a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.m3221o() && !childViewHolderInt.m3208b()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + this.f3511a.exceptionLabel());
            }
            childViewHolderInt.m3216j();
        }
        this.f3511a.attachViewToParent(view, i, layoutParams);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0901f
    /* renamed from: c */
    public final void mo3002c(int i) {
        AbstractC0879ce childViewHolderInt;
        View mo2999b = mo2999b(i);
        if (mo2999b != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(mo2999b)) != null) {
            if (childViewHolderInt.m3221o() && !childViewHolderInt.m3208b()) {
                throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + this.f3511a.exceptionLabel());
            }
            childViewHolderInt.m3206b(256);
        }
        this.f3511a.detachViewFromParent(i);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0901f
    /* renamed from: c */
    public final void mo3003c(View view) {
        AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.m3201a(this.f3511a);
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC0901f
    /* renamed from: d */
    public final void mo3004d(View view) {
        AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.m3207b(this.f3511a);
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC0901f
    /* renamed from: b */
    public final void mo3001b() {
        int childCount = this.f3511a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View mo2999b = mo2999b(i);
            this.f3511a.dispatchChildDetached(mo2999b);
            mo2999b.clearAnimation();
        }
        this.f3511a.removeAllViews();
    }
}
