package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import androidx.core.p024g.C0507ah;
import androidx.core.widget.C0572j;
import java.lang.reflect.Field;

/* compiled from: DropDownListView.java */
/* renamed from: androidx.appcompat.widget.bk */
/* loaded from: classes.dex */
public class C0219bk extends ListView {

    /* renamed from: a */
    RunnableC0221bm f1201a;

    /* renamed from: b */
    private final Rect f1202b;

    /* renamed from: c */
    private int f1203c;

    /* renamed from: d */
    private int f1204d;

    /* renamed from: e */
    private int f1205e;

    /* renamed from: f */
    private int f1206f;

    /* renamed from: g */
    private int f1207g;

    /* renamed from: h */
    private Field f1208h;

    /* renamed from: i */
    private C0220bl f1209i;

    /* renamed from: j */
    private boolean f1210j;

    /* renamed from: k */
    private boolean f1211k;

    /* renamed from: l */
    private boolean f1212l;

    /* renamed from: m */
    private C0507ah f1213m;

    /* renamed from: n */
    private C0572j f1214n;

    public C0219bk(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1202b = new Rect();
        this.f1203c = 0;
        this.f1204d = 0;
        this.f1205e = 0;
        this.f1206f = 0;
        this.f1211k = z;
        setCacheColorHint(0);
        try {
            this.f1208h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1208h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1211k && this.f1210j) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1211k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1211k || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1211k || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.f1209i = drawable != null ? new C0220bl(drawable) : null;
        super.setSelector(this.f1209i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1203c = rect.left;
        this.f1204d = rect.top;
        this.f1205e = rect.right;
        this.f1206f = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f1201a != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m850a();
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1207g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f1201a != null) {
            RunnableC0221bm runnableC0221bm = this.f1201a;
            runnableC0221bm.f1216a.f1201a = null;
            runnableC0221bm.f1216a.removeCallbacks(runnableC0221bm);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public int mo595a(int i, int i2, int i3, int i4, int i5) {
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
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = i6;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        View view = null;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    private void setSelectorEnabled(boolean z) {
        if (this.f1209i != null) {
            this.f1209i.m851a(z);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1201a == null) {
            this.f1201a = new RunnableC0221bm(this);
            RunnableC0221bm runnableC0221bm = this.f1201a;
            runnableC0221bm.f1216a.post(runnableC0221bm);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m850a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1201a = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x001e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo596a(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0219bk.mo596a(android.view.MotionEvent, int):boolean");
    }

    public void setListSelectionHidden(boolean z) {
        this.f1210j = z;
    }

    /* renamed from: a */
    private void m850a() {
        Drawable selector = getSelector();
        if (selector != null && this.f1212l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1202b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1202b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
