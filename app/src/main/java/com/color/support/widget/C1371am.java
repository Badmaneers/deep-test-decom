package com.color.support.widget;

import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0834an;
import androidx.recyclerview.widget.AbstractC0856bi;
import androidx.recyclerview.widget.AbstractC0865br;
import androidx.recyclerview.widget.ColorRecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: ColorFlingLocateHelper.java */
/* renamed from: com.color.support.widget.am */
/* loaded from: classes.dex */
public final class C1371am {

    /* renamed from: a */
    private ColorRecyclerView f6924a;

    /* renamed from: c */
    private AbstractC0834an f6926c;

    /* renamed from: d */
    private AbstractC0856bi f6927d;

    /* renamed from: e */
    private Context f6928e;

    /* renamed from: b */
    private int f6925b = 0;

    /* renamed from: f */
    private AbstractC0865br f6929f = new C1372an(this);

    /* renamed from: a */
    public final void m4897a(ColorRecyclerView colorRecyclerView) {
        this.f6924a = colorRecyclerView;
        this.f6928e = colorRecyclerView.getContext();
    }

    /* renamed from: a */
    public final void m4896a(int i) {
        this.f6925b = i;
        this.f6924a.addOnScrollListener(this.f6929f);
    }

    /* renamed from: a */
    public final int m4895a() {
        return this.f6925b;
    }

    /* renamed from: a */
    private View m4890a(AbstractC0856bi abstractC0856bi) {
        int mo2975d;
        View view = null;
        if (!abstractC0856bi.mo2842g()) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        if (this.f6925b == 2) {
            AbstractC0834an m4893b = m4893b(abstractC0856bi);
            int m3121v = abstractC0856bi.m3121v();
            if (m3121v == 0) {
                return null;
            }
            int mo2975d2 = m4893b.mo2975d() + (m4893b.mo2981g() / 2);
            while (i2 < m3121v) {
                View m3111f = abstractC0856bi.m3111f(i2);
                int abs = Math.abs((m4893b.mo2968a(m3111f) + (m4893b.mo2978e(m3111f) / 2)) - mo2975d2);
                if (abs < i) {
                    view = m3111f;
                    i = abs;
                }
                i2++;
            }
            return view;
        }
        if (this.f6925b != 1) {
            return null;
        }
        AbstractC0834an m4893b2 = m4893b(abstractC0856bi);
        int m3121v2 = abstractC0856bi.m3121v();
        if (m3121v2 == 0) {
            return null;
        }
        if (abstractC0856bi instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) abstractC0856bi).m2850o() == abstractC0856bi.m3086F() - 1) {
                return null;
            }
        }
        if (m4892a(this.f6928e)) {
            mo2975d = m4893b2.mo2977e();
        } else {
            mo2975d = m4893b2.mo2975d();
        }
        while (i2 < m3121v2) {
            View m3111f2 = abstractC0856bi.m3111f(i2);
            int abs2 = Math.abs((m4892a(this.f6928e) ? m4893b2.mo2971b(m3111f2) : m4893b2.mo2968a(m3111f2)) - mo2975d);
            if (abs2 < i) {
                view = m3111f2;
                i = abs2;
            }
            i2++;
        }
        return view;
    }

    /* renamed from: b */
    private AbstractC0834an m4893b(AbstractC0856bi abstractC0856bi) {
        if (this.f6926c == null || this.f6926c.m2969a() != abstractC0856bi) {
            this.f6926c = AbstractC0834an.m2965a(abstractC0856bi);
        }
        return this.f6926c;
    }

    /* renamed from: b */
    private AbstractC0856bi m4894b() {
        if (this.f6927d == null || this.f6927d != this.f6924a.getLayoutManager()) {
            this.f6927d = this.f6924a.getLayoutManager();
        }
        return this.f6927d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m4898b(int r21) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.C1371am.m4898b(int):int");
    }

    /* renamed from: a */
    private static boolean m4892a(Context context) {
        return context != null && Build.VERSION.SDK_INT > 16 && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m4891a(C1371am c1371am) {
        View m4890a;
        int mo2968a;
        AbstractC0856bi m4894b = c1371am.m4894b();
        if (m4894b == null || (m4890a = c1371am.m4890a(m4894b)) == null) {
            return;
        }
        if (c1371am.f6925b == 2) {
            int mo2975d = c1371am.m4893b(m4894b).mo2975d() + (c1371am.m4893b(m4894b).mo2981g() / 2);
            int m3086F = m4894b.m3086F() - 1;
            if (AbstractC0856bi.m3069e(m4890a) == 0) {
                mo2975d = m4892a(c1371am.f6928e) ? c1371am.m4893b(m4894b).mo2977e() - (c1371am.m4893b(m4894b).mo2978e(m4890a) / 2) : c1371am.m4893b(m4894b).mo2975d() + (c1371am.m4893b(m4894b).mo2978e(m4890a) / 2);
            }
            if (AbstractC0856bi.m3069e(m4890a) == m3086F) {
                mo2975d = m4892a(c1371am.f6928e) ? c1371am.m4893b(m4894b).mo2975d() + (c1371am.m4893b(m4894b).mo2978e(m4890a) / 2) : c1371am.m4893b(m4894b).mo2977e() - (c1371am.m4893b(m4894b).mo2978e(m4890a) / 2);
            }
            int mo2968a2 = (c1371am.m4893b(m4894b).mo2968a(m4890a) + (c1371am.m4893b(m4894b).mo2978e(m4890a) / 2)) - mo2975d;
            if (Math.abs(mo2968a2) > 1.0f) {
                c1371am.f6924a.smoothScrollBy(mo2968a2, 0);
                return;
            }
            return;
        }
        if (c1371am.f6925b == 1) {
            if (m4892a(c1371am.f6928e)) {
                mo2968a = c1371am.m4893b(m4894b).mo2971b(m4890a) - c1371am.m4893b(m4894b).mo2977e();
            } else {
                mo2968a = c1371am.m4893b(m4894b).mo2968a(m4890a) - c1371am.m4893b(m4894b).mo2975d();
            }
            if (Math.abs(mo2968a) > 1.0f) {
                c1371am.f6924a.smoothScrollBy(mo2968a, 0);
            }
        }
    }
}
