package androidx.viewpager2.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.core.p024g.p025a.C0482c;
import androidx.recyclerview.widget.C0868bu;
import androidx.recyclerview.widget.C0876cb;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager2.java */
/* renamed from: androidx.viewpager2.widget.o */
/* loaded from: classes.dex */
public final class C1132o extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f4557a;

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final boolean mo3098a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1132o(ViewPager2 viewPager2) {
        this.f4557a = viewPager2;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final boolean mo3099a(C0868bu c0868bu, C0876cb c0876cb, int i, Bundle bundle) {
        if (this.f4557a.f4507f.mo3759c(i)) {
            return this.f4557a.f4507f.mo3761d(i);
        }
        return super.mo3099a(c0868bu, c0876cb, i, bundle);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo3095a(C0868bu c0868bu, C0876cb c0876cb, C0482c c0482c) {
        super.mo3095a(c0868bu, c0876cb, c0482c);
        this.f4557a.f4507f.mo3750a(c0482c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public final void mo2830a(C0876cb c0876cb, int[] iArr) {
        int offscreenPageLimit = this.f4557a.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.mo2830a(c0876cb, iArr);
            return;
        }
        int pageSize = this.f4557a.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }
}
