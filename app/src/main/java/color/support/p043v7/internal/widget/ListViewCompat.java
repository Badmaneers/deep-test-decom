package color.support.p043v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0546a;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ListViewCompat extends ListView {

    /* renamed from: f */
    private static final int[] f5195f = {0};

    /* renamed from: a */
    final Rect f5196a;

    /* renamed from: b */
    int f5197b;

    /* renamed from: c */
    int f5198c;

    /* renamed from: d */
    int f5199d;

    /* renamed from: e */
    int f5200e;

    /* renamed from: g */
    private Field f5201g;

    /* renamed from: h */
    private C1230am f5202h;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4061a() {
        return false;
    }

    public ListViewCompat(Context context) {
        this(context, null);
    }

    public ListViewCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListViewCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5196a = new Rect();
        this.f5197b = 0;
        this.f5198c = 0;
        this.f5199d = 0;
        this.f5200e = 0;
        try {
            this.f5201g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f5201g.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.f5202h = drawable != null ? new C1230am(drawable) : null;
        super.setSelector(this.f5202h);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f5197b = rect.left;
        this.f5198c = rect.top;
        this.f5199d = rect.right;
        this.f5200e = rect.bottom;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null) {
            if (mo4061a() && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    /* renamed from: a */
    public final int m4059a(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i3 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = i3;
        int i5 = 0;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            if (i6 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i2) {
                return i2;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSelectorEnabled(boolean z) {
        if (this.f5202h != null) {
            this.f5202h.m4066a(z);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f5196a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f5196a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m4060a(int i, View view, float f, float f2) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        Rect rect = this.f5196a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f5197b;
        rect.top -= this.f5198c;
        rect.right += this.f5199d;
        rect.bottom += this.f5200e;
        try {
            boolean z2 = this.f5201g.getBoolean(this);
            if (view.isEnabled() != z2) {
                this.f5201g.set(this, Boolean.valueOf(!z2));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if (z) {
            Rect rect2 = this.f5196a;
            float exactCenterX = rect2.exactCenterX();
            float exactCenterY = rect2.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C0546a.m1919a(selector, exactCenterX, exactCenterY);
        }
        Drawable selector2 = getSelector();
        if (selector2 == null || i == -1) {
            return;
        }
        C0546a.m1919a(selector2, f, f2);
    }
}
