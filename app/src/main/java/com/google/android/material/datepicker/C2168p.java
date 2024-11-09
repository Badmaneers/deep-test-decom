package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.p023f.C0473d;
import androidx.recyclerview.widget.AbstractC0855bh;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes.dex */
final class C2168p extends AbstractC0855bh {

    /* renamed from: a */
    final /* synthetic */ C2163k f9638a;

    /* renamed from: b */
    private final Calendar f9639b = C2150at.m6855b();

    /* renamed from: c */
    private final Calendar f9640c = C2150at.m6855b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2168p(C2163k c2163k) {
        this.f9638a = c2163k;
    }

    @Override // androidx.recyclerview.widget.AbstractC0855bh
    /* renamed from: a */
    public final void mo3059a(Canvas canvas, RecyclerView recyclerView) {
        DateSelector dateSelector;
        C2156d c2156d;
        C2156d c2156d2;
        int width;
        C2156d c2156d3;
        if ((recyclerView.getAdapter() instanceof C2151au) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C2151au c2151au = (C2151au) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            dateSelector = this.f9638a.f9629g;
            for (C0473d<Long, Long> c0473d : dateSelector.mo6810d()) {
                if (c0473d.f2273a != null && c0473d.f2274b != null) {
                    this.f9639b.setTimeInMillis(c0473d.f2273a.longValue());
                    this.f9640c.setTimeInMillis(c0473d.f2274b.longValue());
                    int m6864d = c2151au.m6864d(this.f9639b.get(1));
                    int m6864d2 = c2151au.m6864d(this.f9640c.get(1));
                    View b = gridLayoutManager.mo2832b(m6864d);
                    View b2 = gridLayoutManager.mo2832b(m6864d2);
                    int m2791c = m6864d / gridLayoutManager.m2791c();
                    int m2791c2 = m6864d2 / gridLayoutManager.m2791c();
                    int i = m2791c;
                    while (i <= m2791c2) {
                        View b3 = gridLayoutManager.mo2832b(gridLayoutManager.m2791c() * i);
                        if (b3 != null) {
                            int top = b3.getTop();
                            c2156d = this.f9638a.f9623af;
                            int m6868a = top + c2156d.f9604d.m6868a();
                            int bottom = b3.getBottom();
                            c2156d2 = this.f9638a.f9623af;
                            int m6870b = bottom - c2156d2.f9604d.m6870b();
                            int left = i == m2791c ? b.getLeft() + (b.getWidth() / 2) : 0;
                            if (i == m2791c2) {
                                width = b2.getLeft() + (b2.getWidth() / 2);
                            } else {
                                width = recyclerView.getWidth();
                            }
                            c2156d3 = this.f9638a.f9623af;
                            canvas.drawRect(left, m6868a, width, m6870b, c2156d3.f9608h);
                        }
                        i++;
                    }
                }
            }
        }
    }
}
