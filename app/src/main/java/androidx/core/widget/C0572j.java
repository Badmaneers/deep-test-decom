package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* compiled from: ListViewAutoScrollHelper.java */
/* renamed from: androidx.core.widget.j */
/* loaded from: classes.dex */
public final class C0572j extends AbstractViewOnTouchListenerC0563a {

    /* renamed from: f */
    private final ListView f2516f;

    public C0572j(ListView listView) {
        super(listView);
        this.f2516f = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0563a
    /* renamed from: a */
    public final void mo2021a(int i) {
        View childAt;
        ListView listView = this.f2516f;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null) {
            return;
        }
        listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0563a
    /* renamed from: b */
    public final boolean mo2023b(int i) {
        ListView listView = this.f2516f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
