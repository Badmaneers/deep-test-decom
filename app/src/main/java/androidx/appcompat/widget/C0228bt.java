package androidx.appcompat.widget;

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
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.InterfaceC0149ai;
import androidx.core.p024g.C0538w;
import androidx.core.widget.C0576n;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow.java */
/* renamed from: androidx.appcompat.widget.bt */
/* loaded from: classes.dex */
public class C0228bt implements InterfaceC0149ai {

    /* renamed from: a */
    private static Method f1230a;

    /* renamed from: b */
    private static Method f1231b;

    /* renamed from: h */
    private static Method f1232h;

    /* renamed from: A */
    private Drawable f1233A;

    /* renamed from: B */
    private AdapterView.OnItemClickListener f1234B;

    /* renamed from: C */
    private AdapterView.OnItemSelectedListener f1235C;

    /* renamed from: D */
    private final ViewOnTouchListenerC0234bz f1236D;

    /* renamed from: E */
    private final C0233by f1237E;

    /* renamed from: F */
    private final RunnableC0231bw f1238F;

    /* renamed from: G */
    private Runnable f1239G;

    /* renamed from: H */
    private final Rect f1240H;

    /* renamed from: I */
    private Rect f1241I;

    /* renamed from: J */
    private boolean f1242J;

    /* renamed from: c */
    C0219bk f1243c;

    /* renamed from: d */
    int f1244d;

    /* renamed from: e */
    final RunnableC0236ca f1245e;

    /* renamed from: f */
    final Handler f1246f;

    /* renamed from: g */
    PopupWindow f1247g;

    /* renamed from: i */
    private Context f1248i;

    /* renamed from: j */
    private ListAdapter f1249j;

    /* renamed from: k */
    private int f1250k;

    /* renamed from: l */
    private int f1251l;

    /* renamed from: m */
    private int f1252m;

    /* renamed from: n */
    private int f1253n;

    /* renamed from: o */
    private int f1254o;

    /* renamed from: p */
    private boolean f1255p;

    /* renamed from: q */
    private boolean f1256q;

    /* renamed from: r */
    private boolean f1257r;

    /* renamed from: s */
    private boolean f1258s;

    /* renamed from: t */
    private int f1259t;

    /* renamed from: u */
    private boolean f1260u;

    /* renamed from: v */
    private boolean f1261v;

    /* renamed from: w */
    private View f1262w;

    /* renamed from: x */
    private int f1263x;

    /* renamed from: y */
    private DataSetObserver f1264y;

    /* renamed from: z */
    private View f1265z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1230a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1232h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1231b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0228bt(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public C0228bt(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0228bt(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1250k = -2;
        this.f1251l = -2;
        this.f1254o = 1002;
        this.f1256q = true;
        this.f1259t = 0;
        this.f1260u = false;
        this.f1261v = false;
        this.f1244d = Integer.MAX_VALUE;
        this.f1263x = 0;
        this.f1245e = new RunnableC0236ca(this);
        this.f1236D = new ViewOnTouchListenerC0234bz(this);
        this.f1237E = new C0233by(this);
        this.f1238F = new RunnableC0231bw(this);
        this.f1240H = new Rect();
        this.f1248i = context;
        this.f1246f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPopupWindow, i, i2);
        this.f1252m = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f1253n = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f1253n != 0) {
            this.f1255p = true;
        }
        obtainStyledAttributes.recycle();
        this.f1247g = new C0196ao(context, attributeSet, i, i2);
        this.f1247g.setInputMethodMode(1);
    }

    /* renamed from: a */
    public void mo745a(ListAdapter listAdapter) {
        if (this.f1264y == null) {
            this.f1264y = new C0232bx(this);
        } else if (this.f1249j != null) {
            this.f1249j.unregisterDataSetObserver(this.f1264y);
        }
        this.f1249j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1264y);
        }
        if (this.f1243c != null) {
            this.f1243c.setAdapter(this.f1249j);
        }
    }

    /* renamed from: i */
    public final void m867i() {
        this.f1263x = 0;
    }

    /* renamed from: j */
    public final void m868j() {
        this.f1242J = true;
        this.f1247g.setFocusable(true);
    }

    /* renamed from: k */
    public final boolean m869k() {
        return this.f1242J;
    }

    /* renamed from: b */
    public final Drawable m860b() {
        return this.f1247g.getBackground();
    }

    /* renamed from: a */
    public final void m857a(Drawable drawable) {
        this.f1247g.setBackgroundDrawable(drawable);
    }

    /* renamed from: l */
    public final void m870l() {
        this.f1247g.setAnimationStyle(0);
    }

    /* renamed from: m */
    public final View m871m() {
        return this.f1265z;
    }

    /* renamed from: b */
    public final void m862b(View view) {
        this.f1265z = view;
    }

    /* renamed from: f */
    public final int m866f() {
        return this.f1252m;
    }

    /* renamed from: b */
    public final void m861b(int i) {
        this.f1252m = i;
    }

    /* renamed from: c */
    public final int m863c() {
        if (this.f1255p) {
            return this.f1253n;
        }
        return 0;
    }

    /* renamed from: a */
    public final void m855a(int i) {
        this.f1253n = i;
        this.f1255p = true;
    }

    /* renamed from: a */
    public final void m856a(Rect rect) {
        this.f1241I = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: d */
    public final void m864d(int i) {
        this.f1259t = i;
    }

    /* renamed from: n */
    public final int m872n() {
        return this.f1251l;
    }

    /* renamed from: e */
    public final void m865e(int i) {
        Drawable background = this.f1247g.getBackground();
        if (background != null) {
            background.getPadding(this.f1240H);
            this.f1251l = this.f1240H.left + this.f1240H.right + i;
        } else {
            this.f1251l = i;
        }
    }

    /* renamed from: a */
    public final void m858a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1234B = onItemClickListener;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: d */
    public final void mo392d() {
        this.f1247g.dismiss();
        if (this.f1262w != null) {
            ViewParent parent = this.f1262w.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1262w);
            }
        }
        this.f1247g.setContentView(null);
        this.f1243c = null;
        this.f1246f.removeCallbacks(this.f1245e);
    }

    /* renamed from: a */
    public final void m859a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1247g.setOnDismissListener(onDismissListener);
    }

    /* renamed from: o */
    public final void m873o() {
        this.f1247g.setInputMethodMode(2);
    }

    /* renamed from: p */
    public final void m874p() {
        C0219bk c0219bk = this.f1243c;
        if (c0219bk != null) {
            c0219bk.setListSelectionHidden(true);
            c0219bk.requestLayout();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: e */
    public final boolean mo393e() {
        return this.f1247g.isShowing();
    }

    /* renamed from: q */
    public final boolean m875q() {
        return this.f1247g.getInputMethodMode() == 2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: g */
    public final ListView mo394g() {
        return this.f1243c;
    }

    /* renamed from: a */
    C0219bk mo590a(Context context, boolean z) {
        return new C0219bk(context, z);
    }

    /* renamed from: v */
    public final void m880v() {
        this.f1258s = true;
        this.f1257r = true;
    }

    /* renamed from: a */
    private int m854a(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            if (f1231b != null) {
                try {
                    return ((Integer) f1231b.invoke(this.f1247g, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.f1247g.getMaxAvailableHeight(view, i);
        }
        return this.f1247g.getMaxAvailableHeight(view, i, z);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: a_ */
    public final void mo391a_() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int makeMeasureSpec;
        int i6;
        int i7;
        if (this.f1243c == null) {
            Context context = this.f1248i;
            this.f1239G = new RunnableC0229bu(this);
            this.f1243c = mo590a(context, !this.f1242J);
            if (this.f1233A != null) {
                this.f1243c.setSelector(this.f1233A);
            }
            this.f1243c.setAdapter(this.f1249j);
            this.f1243c.setOnItemClickListener(this.f1234B);
            this.f1243c.setFocusable(true);
            this.f1243c.setFocusableInTouchMode(true);
            this.f1243c.setOnItemSelectedListener(new C0230bv(this));
            this.f1243c.setOnScrollListener(this.f1237E);
            if (this.f1235C != null) {
                this.f1243c.setOnItemSelectedListener(this.f1235C);
            }
            View view = this.f1243c;
            View view2 = this.f1262w;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.f1263x) {
                    case 0:
                        linearLayout.addView(view2);
                        linearLayout.addView(view, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view, layoutParams);
                        linearLayout.addView(view2);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.f1263x);
                        break;
                }
                if (this.f1251l >= 0) {
                    i6 = this.f1251l;
                    i7 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i6, i7), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
            }
            this.f1247g.setContentView(view);
        } else {
            this.f1247g.getContentView();
            View view3 = this.f1262w;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f1247g.getBackground();
        if (background != null) {
            background.getPadding(this.f1240H);
            i2 = this.f1240H.top + this.f1240H.bottom;
            if (!this.f1255p) {
                this.f1253n = -this.f1240H.top;
            }
        } else {
            this.f1240H.setEmpty();
            i2 = 0;
        }
        int m854a = m854a(this.f1265z, this.f1253n, this.f1247g.getInputMethodMode() == 2);
        if (this.f1260u || this.f1250k == -1) {
            i3 = m854a + i2;
        } else {
            switch (this.f1251l) {
                case -2:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1248i.getResources().getDisplayMetrics().widthPixels - (this.f1240H.left + this.f1240H.right), RecyclerView.UNDEFINED_DURATION);
                    break;
                case -1:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1248i.getResources().getDisplayMetrics().widthPixels - (this.f1240H.left + this.f1240H.right), 1073741824);
                    break;
                default:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1251l, 1073741824);
                    break;
            }
            int mo595a = this.f1243c.mo595a(makeMeasureSpec, 0, -1, m854a - i, -1);
            if (mo595a > 0) {
                i += i2 + this.f1243c.getPaddingTop() + this.f1243c.getPaddingBottom();
            }
            i3 = mo595a + i;
        }
        boolean m875q = m875q();
        C0576n.m2041a(this.f1247g, this.f1254o);
        if (this.f1247g.isShowing()) {
            if (C0538w.m1822F(this.f1265z)) {
                if (this.f1251l == -1) {
                    i5 = -1;
                } else if (this.f1251l == -2) {
                    i5 = this.f1265z.getWidth();
                } else {
                    i5 = this.f1251l;
                }
                if (this.f1250k == -1) {
                    if (!m875q) {
                        i3 = -1;
                    }
                    if (m875q) {
                        this.f1247g.setWidth(this.f1251l == -1 ? -1 : 0);
                        this.f1247g.setHeight(0);
                    } else {
                        this.f1247g.setWidth(this.f1251l == -1 ? -1 : 0);
                        this.f1247g.setHeight(-1);
                    }
                } else if (this.f1250k != -2) {
                    i3 = this.f1250k;
                }
                this.f1247g.setOutsideTouchable((this.f1261v || this.f1260u) ? false : true);
                this.f1247g.update(this.f1265z, this.f1252m, this.f1253n, i5 < 0 ? -1 : i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        if (this.f1251l == -1) {
            i4 = -1;
        } else if (this.f1251l == -2) {
            i4 = this.f1265z.getWidth();
        } else {
            i4 = this.f1251l;
        }
        if (this.f1250k == -1) {
            i3 = -1;
        } else if (this.f1250k != -2) {
            i3 = this.f1250k;
        }
        this.f1247g.setWidth(i4);
        this.f1247g.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            if (f1230a != null) {
                try {
                    f1230a.invoke(this.f1247g, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1247g.setIsClippedToScreen(true);
        }
        this.f1247g.setOutsideTouchable((this.f1261v || this.f1260u) ? false : true);
        this.f1247g.setTouchInterceptor(this.f1236D);
        if (this.f1258s) {
            C0576n.m2043a(this.f1247g, this.f1257r);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            if (f1232h != null) {
                try {
                    f1232h.invoke(this.f1247g, this.f1241I);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.f1247g.setEpicenterBounds(this.f1241I);
        }
        C0576n.m2042a(this.f1247g, this.f1265z, this.f1252m, this.f1253n, this.f1259t);
        this.f1243c.setSelection(-1);
        if (!this.f1242J || this.f1243c.isInTouchMode()) {
            m874p();
        }
        if (this.f1242J) {
            return;
        }
        this.f1246f.post(this.f1238F);
    }

    /* renamed from: r */
    public final Object m876r() {
        if (this.f1247g.isShowing()) {
            return this.f1243c.getSelectedItem();
        }
        return null;
    }

    /* renamed from: s */
    public final int m877s() {
        if (this.f1247g.isShowing()) {
            return this.f1243c.getSelectedItemPosition();
        }
        return -1;
    }

    /* renamed from: t */
    public final long m878t() {
        if (this.f1247g.isShowing()) {
            return this.f1243c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: u */
    public final View m879u() {
        if (this.f1247g.isShowing()) {
            return this.f1243c.getSelectedView();
        }
        return null;
    }
}
