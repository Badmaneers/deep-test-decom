package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.p023f.C0473d;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    private final Calendar f9539a;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9539a = C2150at.m6855b();
        if (C2177y.m6900b(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        C0538w.m1849a(this, new C2176x(this));
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C2137ag) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C2137ag) super.getAdapter()).f9561b.m6819b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((C2137ag) super.getAdapter()).f9561b.m6819b());
        return true;
    }

    /* renamed from: a */
    public final C2137ag m6813a() {
        return (C2137ag) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C2137ag)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C2137ag.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int m6838b;
        int m6812a;
        int m6838b2;
        int m6812a2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C2137ag c2137ag = (C2137ag) super.getAdapter();
        DateSelector<?> dateSelector = c2137ag.f9562c;
        C2156d c2156d = c2137ag.f9563d;
        Long item = c2137ag.getItem(c2137ag.f9561b.m6819b());
        Long item2 = c2137ag.getItem(c2137ag.m6836a());
        for (C0473d<Long, Long> c0473d : dateSelector.mo6810d()) {
            if (c0473d.f2273a != null && c0473d.f2274b != null) {
                long longValue = c0473d.f2273a.longValue();
                long longValue2 = c0473d.f2274b.longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                int i = 1;
                if (item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue()) {
                    return;
                }
                if (longValue >= item.longValue()) {
                    materialCalendarGridView.f9539a.setTimeInMillis(longValue);
                    m6838b = c2137ag.m6838b(materialCalendarGridView.f9539a.get(5));
                    m6812a = m6812a(materialCalendarGridView.getChildAt(m6838b));
                } else {
                    m6838b = c2137ag.f9561b.m6819b();
                    m6812a = m6838b % c2137ag.f9561b.f9542c == 0 ? 0 : materialCalendarGridView.getChildAt(m6838b - 1).getRight();
                }
                if (longValue2 > item2.longValue()) {
                    m6838b2 = c2137ag.m6836a();
                    if ((m6838b2 + 1) % c2137ag.f9561b.f9542c == 0) {
                        m6812a2 = getWidth();
                    } else {
                        m6812a2 = materialCalendarGridView.getChildAt(m6838b2).getRight();
                    }
                } else {
                    materialCalendarGridView.f9539a.setTimeInMillis(longValue2);
                    m6838b2 = c2137ag.m6838b(materialCalendarGridView.f9539a.get(5));
                    m6812a2 = m6812a(materialCalendarGridView.getChildAt(m6838b2));
                }
                int itemId = (int) c2137ag.getItemId(m6838b);
                int itemId2 = (int) c2137ag.getItemId(m6838b2);
                while (itemId <= itemId2) {
                    int numColumns = getNumColumns() * itemId;
                    int numColumns2 = (getNumColumns() + numColumns) - i;
                    View childAt = materialCalendarGridView.getChildAt(numColumns);
                    canvas.drawRect(numColumns > m6838b ? 0 : m6812a, childAt.getTop() + c2156d.f9601a.m6868a(), m6838b2 > numColumns2 ? getWidth() : m6812a2, childAt.getBottom() - c2156d.f9601a.m6870b(), c2156d.f9608h);
                    itemId++;
                    materialCalendarGridView = this;
                    i = 1;
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* renamed from: a */
    private static int m6812a(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((C2137ag) super.getAdapter()).f9561b.m6819b()) {
            super.setSelection(((C2137ag) super.getAdapter()).f9561b.m6819b());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((C2137ag) super.getAdapter()).m6836a());
        } else if (i == 130) {
            setSelection(((C2137ag) super.getAdapter()).f9561b.m6819b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final /* bridge */ /* synthetic */ ListAdapter getAdapter2() {
        return (C2137ag) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final /* bridge */ /* synthetic */ ListAdapter getAdapter() {
        return (C2137ag) super.getAdapter();
    }
}
