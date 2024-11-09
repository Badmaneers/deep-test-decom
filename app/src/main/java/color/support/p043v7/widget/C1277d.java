package color.support.p043v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.p022e.C0469p;
import androidx.core.widget.C0576n;
import androidx.recyclerview.widget.RecyclerView;
import color.support.p043v7.appcompat.R;
import color.support.p043v7.internal.widget.ColorSpinner;
import java.lang.reflect.Method;

/* compiled from: ColorBaseListPopupWindow.java */
/* renamed from: color.support.v7.widget.d */
/* loaded from: classes.dex */
public class C1277d {

    /* renamed from: a */
    private static Method f5406a;

    /* renamed from: C */
    private boolean f5409C;

    /* renamed from: D */
    private int f5410D;

    /* renamed from: b */
    private Context f5411b;

    /* renamed from: c */
    protected C1296q f5412c;

    /* renamed from: e */
    private ListAdapter f5414e;

    /* renamed from: f */
    private C1281h f5415f;

    /* renamed from: i */
    private int f5418i;

    /* renamed from: j */
    private int f5419j;

    /* renamed from: k */
    private boolean f5420k;

    /* renamed from: o */
    private View f5424o;

    /* renamed from: q */
    private DataSetObserver f5426q;

    /* renamed from: r */
    private View f5427r;

    /* renamed from: s */
    private Drawable f5428s;

    /* renamed from: t */
    private AdapterView.OnItemClickListener f5429t;

    /* renamed from: u */
    private AdapterView.OnItemSelectedListener f5430u;

    /* renamed from: z */
    private Runnable f5435z;

    /* renamed from: g */
    private int f5416g = -2;

    /* renamed from: h */
    private int f5417h = -2;

    /* renamed from: l */
    private int f5421l = 0;

    /* renamed from: m */
    private boolean f5422m = false;

    /* renamed from: n */
    private boolean f5423n = false;

    /* renamed from: d */
    int f5413d = Integer.MAX_VALUE;

    /* renamed from: p */
    private int f5425p = 0;

    /* renamed from: v */
    private final RunnableC1289p f5431v = new RunnableC1289p(this, (byte) 0);

    /* renamed from: w */
    private final ViewOnTouchListenerC1288o f5432w = new ViewOnTouchListenerC1288o(this);

    /* renamed from: x */
    private final C1287n f5433x = new C1287n(this, (byte) 0);

    /* renamed from: y */
    private final RunnableC1285l f5434y = new RunnableC1285l(this, (byte) 0);

    /* renamed from: A */
    private Handler f5407A = new Handler();

    /* renamed from: B */
    private Rect f5408B = new Rect();

    static {
        try {
            f5406a = C1296q.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("BaseListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }

    public C1277d(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f5411b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPopupWindow, i, 0);
        this.f5418i = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f5419j = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f5419j != 0) {
            this.f5420k = true;
        }
        obtainStyledAttributes.recycle();
        this.f5412c = mo4204a(context, attributeSet, i, 0);
        this.f5412c.setInputMethodMode(1);
        this.f5410D = C0469p.m1611a(this.f5411b.getResources().getConfiguration().locale);
    }

    /* renamed from: a */
    public void mo4084a(ListAdapter listAdapter) {
        if (this.f5426q == null) {
            this.f5426q = new C1286m(this, (byte) 0);
        } else if (this.f5414e != null) {
            this.f5414e.unregisterDataSetObserver(this.f5426q);
        }
        this.f5414e = listAdapter;
        if (this.f5414e != null) {
            listAdapter.registerDataSetObserver(this.f5426q);
        }
        if (this.f5415f != null) {
            this.f5415f.setAdapter((ListAdapter) new C1280g(this, this.f5414e));
        }
    }

    /* renamed from: k */
    public final void m4219k() {
        this.f5425p = 0;
    }

    /* renamed from: l */
    public final void m4220l() {
        this.f5409C = true;
        this.f5412c.setFocusable(true);
    }

    /* renamed from: d */
    public final Drawable m4213d() {
        return this.f5412c.getBackground();
    }

    /* renamed from: a */
    public final void m4206a(Drawable drawable) {
        this.f5412c.setBackgroundDrawable(drawable);
    }

    /* renamed from: m */
    public final View m4221m() {
        return this.f5427r;
    }

    /* renamed from: c */
    public final void m4212c(View view) {
        this.f5427r = view;
    }

    /* renamed from: f */
    public final int m4217f() {
        return this.f5418i;
    }

    /* renamed from: b */
    public final void m4209b(int i) {
        this.f5418i = i;
    }

    /* renamed from: e */
    public final int m4215e() {
        if (this.f5420k) {
            return this.f5419j;
        }
        return 0;
    }

    /* renamed from: a */
    public final void m4205a(int i) {
        this.f5419j = i;
        this.f5420k = true;
    }

    /* renamed from: n */
    public final int m4222n() {
        return this.f5417h;
    }

    /* renamed from: c */
    public final void m4211c(int i) {
        this.f5417h = i;
    }

    /* renamed from: d */
    public final void m4214d(int i) {
        Drawable background = this.f5412c.getBackground();
        if (background != null) {
            background.getPadding(this.f5408B);
            this.f5417h = this.f5408B.left + this.f5408B.right + i;
        } else {
            this.f5417h = i;
        }
    }

    /* renamed from: e */
    public final void m4216e(int i) {
        this.f5416g = i;
    }

    /* renamed from: a */
    public final void m4207a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f5429t = onItemClickListener;
    }

    /* renamed from: h */
    public void mo4108h() {
        int i;
        int i2;
        int i3;
        int i4;
        int mo4110j = mo4110j();
        boolean m4225q = m4225q();
        if (this.f5412c.isShowing()) {
            if (this.f5417h == -1) {
                i4 = -1;
            } else {
                if (this.f5417h == -2) {
                    i3 = this.f5427r.getWidth();
                } else {
                    i3 = this.f5417h;
                }
                i4 = i3;
            }
            if (this.f5416g == -1) {
                if (!m4225q) {
                    mo4110j = -1;
                }
                if (m4225q) {
                    this.f5412c.setWindowLayoutMode(this.f5417h != -1 ? 0 : -1, 0);
                } else {
                    this.f5412c.setWindowLayoutMode(this.f5417h == -1 ? -1 : 0, -1);
                }
            } else if (this.f5416g != -2) {
                mo4110j = this.f5416g;
            }
            int i5 = mo4110j;
            this.f5412c.setOutsideTouchable((this.f5423n || this.f5422m) ? false : true);
            this.f5412c.update(this.f5427r, this.f5418i, this.f5419j, i4, i5);
            return;
        }
        if (this.f5417h == -1) {
            i = -1;
        } else {
            if (this.f5417h == -2) {
                this.f5412c.setWidth(this.f5427r.getWidth());
            } else {
                this.f5412c.setWidth(this.f5417h);
            }
            i = 0;
        }
        if (this.f5416g == -1) {
            i2 = -1;
        } else {
            if (this.f5416g == -2) {
                this.f5412c.setHeight(mo4110j);
            } else {
                this.f5412c.setHeight(this.f5416g);
            }
            i2 = 0;
        }
        this.f5412c.setWindowLayoutMode(i, i2);
        if (this.f5427r instanceof ColorSpinner) {
            m4200a(false);
        } else {
            m4200a(true);
        }
        this.f5412c.setOutsideTouchable((this.f5423n || this.f5422m) ? false : true);
        this.f5412c.setTouchInterceptor(this.f5432w);
        C0576n.m2042a(this.f5412c, this.f5427r, this.f5418i, this.f5419j, this.f5421l);
        this.f5415f.setSelection(-1);
        if (!this.f5409C || this.f5415f.isInTouchMode()) {
            m4224p();
        }
        if (this.f5409C) {
            return;
        }
        this.f5407A.post(this.f5434y);
    }

    /* renamed from: a */
    public void mo4081a() {
        this.f5412c.dismiss();
        if (this.f5424o != null) {
            ViewParent parent = this.f5424o.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f5424o);
            }
        }
        this.f5412c.setContentView(null);
        this.f5415f = null;
        this.f5407A.removeCallbacks(this.f5431v);
    }

    /* renamed from: a */
    public final void m4208a(InterfaceC1298s interfaceC1298s) {
        this.f5412c.m4279a(interfaceC1298s);
    }

    /* renamed from: o */
    public final void m4223o() {
        this.f5412c.setInputMethodMode(2);
    }

    /* renamed from: f */
    public final void m4218f(int i) {
        C1281h c1281h = this.f5415f;
        if (!this.f5412c.isShowing() || c1281h == null) {
            return;
        }
        c1281h.f5440f = false;
        c1281h.setSelection(i);
        if (Build.VERSION.SDK_INT < 11 || c1281h.getChoiceMode() == 0) {
            return;
        }
        c1281h.setItemChecked(i, true);
    }

    /* renamed from: p */
    public final void m4224p() {
        C1281h c1281h = this.f5415f;
        if (c1281h != null) {
            c1281h.f5440f = true;
            c1281h.requestLayout();
        }
    }

    /* renamed from: b */
    public final boolean m4210b() {
        return this.f5412c.isShowing();
    }

    /* renamed from: q */
    public final boolean m4225q() {
        return this.f5412c.getInputMethodMode() == 2;
    }

    /* renamed from: r */
    public final ListView m4226r() {
        return this.f5415f;
    }

    /* renamed from: j */
    public int mo4110j() {
        int i;
        int makeMeasureSpec;
        int i2 = 0;
        if (this.f5415f == null) {
            Context context = this.f5411b;
            this.f5435z = new RunnableC1278e(this);
            this.f5415f = new C1281h(context, !this.f5409C);
            if (this.f5428s != null) {
                this.f5415f.setSelector(this.f5428s);
            }
            this.f5415f.setAdapter((ListAdapter) new C1280g(this, this.f5414e));
            this.f5415f.setOnItemClickListener(this.f5429t);
            this.f5415f.setFocusable(true);
            this.f5415f.setFocusableInTouchMode(true);
            this.f5415f.setOnItemSelectedListener(new C1279f(this));
            this.f5415f.setOnScrollListener(this.f5433x);
            if (this.f5430u != null) {
                this.f5415f.setOnItemSelectedListener(this.f5430u);
            }
            View view = this.f5415f;
            View view2 = this.f5424o;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.f5425p) {
                    case 0:
                        linearLayout.addView(view2);
                        linearLayout.addView(view, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view, layoutParams);
                        linearLayout.addView(view2);
                        break;
                    default:
                        Log.e("BaseListPopupWindow", "Invalid hint position " + this.f5425p);
                        break;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(this.f5417h, RecyclerView.UNDEFINED_DURATION), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
            }
            this.f5412c.setContentView(view);
        } else {
            this.f5412c.getContentView();
            View view3 = this.f5424o;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f5412c.getBackground();
        if (background != null) {
            background.getPadding(this.f5408B);
            i2 = this.f5408B.top + this.f5408B.bottom;
            if (!this.f5420k) {
                this.f5419j = -this.f5408B.top;
            }
        } else {
            this.f5408B.setEmpty();
        }
        this.f5412c.getInputMethodMode();
        int maxAvailableHeight = this.f5412c.getMaxAvailableHeight(this.f5427r, this.f5419j);
        if (this.f5422m || this.f5416g == -1) {
            return maxAvailableHeight + i2;
        }
        switch (this.f5417h) {
            case -2:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5411b.getResources().getDisplayMetrics().widthPixels - (this.f5408B.left + this.f5408B.right), RecyclerView.UNDEFINED_DURATION);
                break;
            case -1:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5411b.getResources().getDisplayMetrics().widthPixels - (this.f5408B.left + this.f5408B.right), 1073741824);
                break;
            default:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5417h, 1073741824);
                break;
        }
        int a2 = this.f5415f.m4059a(makeMeasureSpec, maxAvailableHeight - i);
        if (a2 > 0) {
            i += i2;
        }
        return a2 + i;
    }

    /* renamed from: a */
    private void m4200a(boolean z) {
        if (f5406a != null) {
            try {
                f5406a.invoke(this.f5412c, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("BaseListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: a */
    C1296q mo4204a(Context context, AttributeSet attributeSet, int i, int i2) {
        return new C1296q(context, attributeSet, i, i2);
    }
}
