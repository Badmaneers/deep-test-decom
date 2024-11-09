package color.support.p043v7.internal.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

/* loaded from: classes.dex */
public abstract class AdapterViewCompat<T extends Adapter> extends ViewGroup {

    /* renamed from: A */
    int f5073A;

    /* renamed from: B */
    int f5074B;

    /* renamed from: C */
    long f5075C;

    /* renamed from: D */
    boolean f5076D;

    /* renamed from: a */
    private int f5077a;

    /* renamed from: b */
    private View f5078b;

    /* renamed from: c */
    private boolean f5079c;

    /* renamed from: d */
    private boolean f5080d;

    /* renamed from: e */
    private AdapterViewCompat<T>.RunnableC1240g f5081e;

    /* renamed from: j */
    @ViewDebug.ExportedProperty(category = "scrolling")
    int f5082j;

    /* renamed from: k */
    int f5083k;

    /* renamed from: l */
    int f5084l;

    /* renamed from: m */
    long f5085m;

    /* renamed from: n */
    long f5086n;

    /* renamed from: o */
    boolean f5087o;

    /* renamed from: p */
    int f5088p;

    /* renamed from: q */
    boolean f5089q;

    /* renamed from: r */
    InterfaceC1239f f5090r;

    /* renamed from: s */
    InterfaceC1237d f5091s;

    /* renamed from: t */
    InterfaceC1238e f5092t;

    /* renamed from: u */
    boolean f5093u;

    /* renamed from: v */
    @ViewDebug.ExportedProperty(category = "list")
    int f5094v;

    /* renamed from: w */
    long f5095w;

    /* renamed from: x */
    @ViewDebug.ExportedProperty(category = "list")
    int f5096x;

    /* renamed from: y */
    long f5097y;

    /* renamed from: z */
    @ViewDebug.ExportedProperty(category = "list")
    int f5098z;

    public abstract T getAdapter();

    public abstract View getSelectedView();

    public abstract void setAdapter(T t);

    public abstract void setSelection(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdapterViewCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5082j = 0;
        this.f5085m = Long.MIN_VALUE;
        this.f5087o = false;
        this.f5089q = false;
        this.f5094v = -1;
        this.f5095w = Long.MIN_VALUE;
        this.f5096x = -1;
        this.f5097y = Long.MIN_VALUE;
        this.f5074B = -1;
        this.f5075C = Long.MIN_VALUE;
        this.f5076D = false;
    }

    public void setOnItemClickListener(InterfaceC1237d interfaceC1237d) {
        this.f5091s = interfaceC1237d;
    }

    public final InterfaceC1237d getOnItemClickListener() {
        return this.f5091s;
    }

    /* renamed from: a */
    public final boolean m4019a(View view) {
        if (this.f5091s == null) {
            return false;
        }
        playSoundEffect(0);
        if (view != null) {
            view.sendAccessibilityEvent(1);
        }
        return true;
    }

    public void setOnItemLongClickListener(InterfaceC1238e interfaceC1238e) {
        if (!isLongClickable()) {
            setLongClickable(true);
        }
        this.f5092t = interfaceC1238e;
    }

    public final InterfaceC1238e getOnItemLongClickListener() {
        return this.f5092t;
    }

    public void setOnItemSelectedListener(InterfaceC1239f interfaceC1239f) {
        this.f5090r = interfaceC1239f;
    }

    public final InterfaceC1239f getOnItemSelectedListener() {
        return this.f5090r;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f5077a = getHeight();
    }

    @ViewDebug.CapturedViewProperty
    public int getSelectedItemPosition() {
        return this.f5094v;
    }

    @ViewDebug.CapturedViewProperty
    public long getSelectedItemId() {
        return this.f5095w;
    }

    public Object getSelectedItem() {
        T adapter = getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        if (adapter == null || adapter.getCount() <= 0 || selectedItemPosition < 0) {
            return null;
        }
        return adapter.getItem(selectedItemPosition);
    }

    @ViewDebug.CapturedViewProperty
    public int getCount() {
        return this.f5098z;
    }

    public int getFirstVisiblePosition() {
        return this.f5082j;
    }

    public int getLastVisiblePosition() {
        return (this.f5082j + getChildCount()) - 1;
    }

    public void setEmptyView(View view) {
        this.f5078b = view;
        T adapter = getAdapter();
        m4017a(adapter == null || adapter.isEmpty());
    }

    public View getEmptyView() {
        return this.f5078b;
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        T adapter = getAdapter();
        boolean z2 = adapter == null || adapter.getCount() == 0;
        this.f5079c = z;
        if (!z) {
            this.f5080d = false;
        }
        super.setFocusable(z && !z2);
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean z) {
        T adapter = getAdapter();
        boolean z2 = false;
        boolean z3 = adapter == null || adapter.getCount() == 0;
        this.f5080d = z;
        if (z) {
            this.f5079c = true;
        }
        if (z && !z3) {
            z2 = true;
        }
        super.setFocusableInTouchMode(z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m4020b() {
        T adapter = getAdapter();
        boolean z = !(adapter == null || adapter.getCount() == 0);
        super.setFocusableInTouchMode(z && this.f5080d);
        super.setFocusable(z && this.f5079c);
        if (this.f5078b != null) {
            m4017a(adapter == null || adapter.isEmpty());
        }
    }

    /* renamed from: a */
    private void m4017a(boolean z) {
        if (z) {
            if (this.f5078b != null) {
                this.f5078b.setVisibility(0);
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            if (this.f5093u) {
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
                return;
            }
            return;
        }
        if (this.f5078b != null) {
            this.f5078b.setVisibility(8);
        }
        setVisibility(0);
    }

    /* renamed from: a */
    private long m4013a(int i) {
        T adapter = getAdapter();
        if (adapter == null || i < 0) {
            return Long.MIN_VALUE;
        }
        return adapter.getItemId(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5081e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterViewCompat.java */
    /* renamed from: color.support.v7.internal.widget.g */
    /* loaded from: classes.dex */
    public final class RunnableC1240g implements Runnable {
        private RunnableC1240g() {
        }

        /* synthetic */ RunnableC1240g(AdapterViewCompat adapterViewCompat, byte b) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!AdapterViewCompat.this.f5093u) {
                AdapterViewCompat.this.m4015a();
            } else if (AdapterViewCompat.this.getAdapter() != null) {
                AdapterViewCompat.this.post(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4021c() {
        if (this.f5090r != null) {
            if (this.f5089q || this.f5076D) {
                if (this.f5081e == null) {
                    this.f5081e = new RunnableC1240g(this, (byte) 0);
                }
                post(this.f5081e);
            } else {
                m4015a();
            }
        }
        if (this.f5096x == -1 || !isShown() || isInTouchMode()) {
            return;
        }
        sendAccessibilityEvent(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4015a() {
        int selectedItemPosition;
        if (this.f5090r != null && (selectedItemPosition = getSelectedItemPosition()) >= 0) {
            getSelectedView();
            getAdapter().getItemId(selectedItemPosition);
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        View selectedView = getSelectedView();
        return selectedView != null && selectedView.getVisibility() == 0 && selectedView.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean canAnimate() {
        return super.canAnimate() && this.f5098z > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4022d() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f5098z
            r2 = -9223372036854775808
            r4 = -1
            r5 = 1
            r6 = 0
            if (r1 <= 0) goto L97
            boolean r7 = r0.f5087o
            if (r7 == 0) goto L7d
            r0.f5087o = r6
            int r7 = r0.f5098z
            if (r7 == 0) goto L73
            long r8 = r0.f5085m
            int r10 = r0.f5084l
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 == 0) goto L73
            int r10 = java.lang.Math.max(r6, r10)
            int r7 = r7 - r5
            int r10 = java.lang.Math.min(r7, r10)
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 100
            long r11 = r11 + r13
            android.widget.Adapter r13 = r19.getAdapter()
            if (r13 == 0) goto L73
            r16 = r6
            r14 = r10
            r15 = r14
        L37:
            long r17 = android.os.SystemClock.uptimeMillis()
            int r17 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r17 > 0) goto L73
            long r17 = r13.getItemId(r10)
            int r17 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r17 != 0) goto L48
            goto L74
        L48:
            if (r14 != r7) goto L4d
            r17 = r5
            goto L4f
        L4d:
            r17 = r6
        L4f:
            if (r15 != 0) goto L54
            r18 = r5
            goto L56
        L54:
            r18 = r6
        L56:
            if (r17 == 0) goto L5a
            if (r18 != 0) goto L73
        L5a:
            if (r18 != 0) goto L6d
            if (r16 == 0) goto L61
            if (r17 != 0) goto L61
            goto L6d
        L61:
            if (r17 != 0) goto L67
            if (r16 != 0) goto L37
            if (r18 != 0) goto L37
        L67:
            int r15 = r15 + (-1)
            r16 = r5
            r10 = r15
            goto L37
        L6d:
            int r14 = r14 + 1
            r16 = r6
            r10 = r14
            goto L37
        L73:
            r10 = r4
        L74:
            if (r10 < 0) goto L7d
            if (r10 != r10) goto L7d
            r0.setNextSelectedPositionInt(r10)
            r7 = r5
            goto L7e
        L7d:
            r7 = r6
        L7e:
            if (r7 != 0) goto L95
            int r8 = r19.getSelectedItemPosition()
            if (r8 < r1) goto L88
            int r1 = r1 - r5
            goto L89
        L88:
            r1 = r8
        L89:
            if (r1 >= 0) goto L8c
            r1 = r6
        L8c:
            if (r1 < 0) goto L95
            r0.setNextSelectedPositionInt(r1)
            r19.m4023e()
            goto L98
        L95:
            r5 = r7
            goto L98
        L97:
            r5 = r6
        L98:
            if (r5 != 0) goto La7
            r0.f5096x = r4
            r0.f5097y = r2
            r0.f5094v = r4
            r0.f5095w = r2
            r0.f5087o = r6
            r19.m4023e()
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: color.support.p043v7.internal.widget.AdapterViewCompat.m4022d():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m4023e() {
        if (this.f5096x == this.f5074B && this.f5097y == this.f5075C) {
            return;
        }
        mo4021c();
        this.f5074B = this.f5096x;
        this.f5075C = this.f5097y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSelectedPositionInt(int i) {
        this.f5096x = i;
        this.f5097y = m4013a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNextSelectedPositionInt(int i) {
        this.f5094v = i;
        this.f5095w = m4013a(i);
        if (this.f5087o && this.f5088p == 0 && i >= 0) {
            this.f5084l = i;
            this.f5085m = this.f5095w;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m4024f() {
        if (getChildCount() > 0) {
            this.f5087o = true;
            this.f5086n = this.f5077a;
            if (this.f5096x >= 0) {
                View childAt = getChildAt(this.f5096x - this.f5082j);
                this.f5085m = this.f5095w;
                this.f5084l = this.f5094v;
                if (childAt != null) {
                    this.f5083k = childAt.getTop();
                }
                this.f5088p = 0;
                return;
            }
            View childAt2 = getChildAt(0);
            T adapter = getAdapter();
            if (this.f5082j >= 0 && this.f5082j < adapter.getCount()) {
                this.f5085m = adapter.getItemId(this.f5082j);
            } else {
                this.f5085m = -1L;
            }
            this.f5084l = this.f5082j;
            if (childAt2 != null) {
                this.f5083k = childAt2.getTop();
            }
            this.f5088p = 1;
        }
    }
}
