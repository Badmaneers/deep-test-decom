package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class ColorPanelPreferenceLinearLayoutManager extends LinearLayoutManager {
    public ColorPanelPreferenceLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final int mo2743a(C0876cb c0876cb) {
        return super.mo2743a(c0876cb) + this.f3535q.getScrollY();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final int mo2744b(C0876cb c0876cb) {
        return super.mo2744b(c0876cb) + this.f3535q.getScrollY();
    }
}
