package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.C0276dn;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, InterfaceC0146af, InterfaceC0170q {

    /* renamed from: a */
    private static final int[] f523a = {R.attr.background, R.attr.divider};

    /* renamed from: b */
    private C0168o f524b;

    /* renamed from: c */
    private int f525c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0276dn m944a = C0276dn.m944a(context, attributeSet, f523a, i, 0);
        if (m944a.m964i(0)) {
            setBackgroundDrawable(m944a.m948a(0));
        }
        if (m944a.m964i(1)) {
            setDivider(m944a.m948a(1));
        }
        m944a.m952b();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0146af
    /* renamed from: a */
    public final void mo343a(C0168o c0168o) {
        this.f524b = c0168o;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0170q
    /* renamed from: a */
    public final boolean mo344a(C0172s c0172s) {
        return this.f524b.m453a(c0172s, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo344a((C0172s) getAdapter().getItem(i));
    }

    public final int getWindowAnimations() {
        return this.f525c;
    }
}
