package color.support.p043v7.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.core.p024g.C0538w;
import color.support.p041a.p042a.C1154b;
import java.lang.ref.WeakReference;

/* compiled from: ColorBasePopupWindow.java */
/* renamed from: color.support.v7.widget.q */
/* loaded from: classes.dex */
public class C1296q extends PopupWindow {

    /* renamed from: R */
    private static final int[] f5499R = {R.attr.state_above_anchor};

    /* renamed from: A */
    private int f5500A;

    /* renamed from: B */
    private int f5501B;

    /* renamed from: C */
    private int f5502C;

    /* renamed from: D */
    private float f5503D;

    /* renamed from: E */
    private int[] f5504E;

    /* renamed from: F */
    private int[] f5505F;

    /* renamed from: G */
    private Rect f5506G;

    /* renamed from: H */
    private Drawable f5507H;

    /* renamed from: I */
    private Drawable f5508I;

    /* renamed from: J */
    private Drawable f5509J;

    /* renamed from: K */
    private int f5510K;

    /* renamed from: L */
    private int f5511L;

    /* renamed from: M */
    private boolean f5512M;

    /* renamed from: N */
    private int f5513N;

    /* renamed from: O */
    private InterfaceC1298s f5514O;

    /* renamed from: P */
    private boolean f5515P;

    /* renamed from: Q */
    private int f5516Q;

    /* renamed from: S */
    private WeakReference<View> f5517S;

    /* renamed from: T */
    private final ViewTreeObserver.OnScrollChangedListener f5518T;

    /* renamed from: U */
    private int f5519U;

    /* renamed from: V */
    private int f5520V;

    /* renamed from: W */
    private int f5521W;

    /* renamed from: X */
    private boolean f5522X;

    /* renamed from: Y */
    private boolean f5523Y;

    /* renamed from: a */
    private Context f5524a;

    /* renamed from: b */
    private WindowManager f5525b;

    /* renamed from: c */
    private boolean f5526c;

    /* renamed from: d */
    private boolean f5527d;

    /* renamed from: e */
    private View f5528e;

    /* renamed from: f */
    private View f5529f;

    /* renamed from: g */
    private boolean f5530g;

    /* renamed from: h */
    private int f5531h;

    /* renamed from: i */
    private int f5532i;

    /* renamed from: j */
    private boolean f5533j;

    /* renamed from: k */
    private boolean f5534k;

    /* renamed from: l */
    private boolean f5535l;

    /* renamed from: m */
    private int f5536m;

    /* renamed from: n */
    private boolean f5537n;

    /* renamed from: o */
    private boolean f5538o;

    /* renamed from: p */
    private boolean f5539p;

    /* renamed from: q */
    private boolean f5540q;

    /* renamed from: r */
    private boolean f5541r;

    /* renamed from: s */
    private boolean f5542s;

    /* renamed from: t */
    private boolean f5543t;

    /* renamed from: u */
    private View.OnTouchListener f5544u;

    /* renamed from: v */
    private int f5545v;

    /* renamed from: w */
    private int f5546w;

    /* renamed from: x */
    private int f5547x;

    /* renamed from: y */
    private int f5548y;

    /* renamed from: z */
    private int f5549z;

    public C1296q(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f5531h = 0;
        this.f5532i = 1;
        this.f5533j = true;
        this.f5534k = false;
        this.f5535l = true;
        this.f5536m = -1;
        this.f5539p = true;
        this.f5540q = false;
        this.f5542s = true;
        this.f5543t = false;
        this.f5504E = new int[2];
        this.f5505F = new int[2];
        this.f5506G = new Rect();
        this.f5513N = 1000;
        this.f5515P = false;
        this.f5516Q = -1;
        this.f5518T = new ViewTreeObserverOnScrollChangedListenerC1297r(this);
        this.f5524a = context;
        this.f5525b = (WindowManager) context.getSystemService("window");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, color.support.p043v7.appcompat.R.styleable.PopupWindow, i, i2);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, color.support.p043v7.appcompat.R.styleable.PopupWindowCompat, i, i2);
        Drawable drawable = obtainStyledAttributes.getDrawable(color.support.p043v7.appcompat.R.styleable.PopupWindow_android_popupBackground);
        this.f5503D = obtainStyledAttributes2.getDimension(color.support.p043v7.appcompat.R.styleable.PopupWindowCompat_supportPopupElevation, 0.0f);
        this.f5522X = obtainStyledAttributes.getBoolean(color.support.p043v7.appcompat.R.styleable.PopupWindow_overlapAnchor, false);
        int resourceId = obtainStyledAttributes2.getResourceId(color.support.p043v7.appcompat.R.styleable.PopupWindowCompat_android_popupAnimationStyle, -1);
        this.f5516Q = resourceId == color.support.p043v7.appcompat.R.style.Animation_ColorSupport_PopupWindow ? -1 : resourceId;
        obtainStyledAttributes2.recycle();
        obtainStyledAttributes.recycle();
        setBackgroundDrawable(drawable);
    }

    public C1296q() {
        this((byte) 0);
    }

    private C1296q(byte b) {
        this((char) 0);
    }

    public C1296q(char c) {
        this.f5531h = 0;
        this.f5532i = 1;
        this.f5533j = true;
        this.f5534k = false;
        this.f5535l = true;
        this.f5536m = -1;
        this.f5539p = true;
        this.f5540q = false;
        this.f5542s = true;
        this.f5543t = false;
        this.f5504E = new int[2];
        this.f5505F = new int[2];
        this.f5506G = new Rect();
        this.f5513N = 1000;
        this.f5515P = false;
        this.f5516Q = -1;
        this.f5518T = new ViewTreeObserverOnScrollChangedListenerC1297r(this);
        setContentView(null);
        setWidth(0);
        setHeight(0);
        setFocusable(false);
    }

    @Override // android.widget.PopupWindow
    public Drawable getBackground() {
        return this.f5507H;
    }

    @Override // android.widget.PopupWindow
    public void setBackgroundDrawable(Drawable drawable) {
        this.f5507H = drawable;
        if (this.f5507H instanceof StateListDrawable) {
            this.f5509J = null;
            this.f5508I = null;
        }
    }

    @Override // android.widget.PopupWindow
    public float getElevation() {
        return this.f5503D;
    }

    @Override // android.widget.PopupWindow
    public void setElevation(float f) {
        this.f5503D = f;
    }

    @Override // android.widget.PopupWindow
    public int getAnimationStyle() {
        return this.f5516Q;
    }

    @Override // android.widget.PopupWindow
    public void setIgnoreCheekPress() {
        this.f5515P = true;
    }

    @Override // android.widget.PopupWindow
    public void setAnimationStyle(int i) {
        this.f5516Q = i;
    }

    @Override // android.widget.PopupWindow
    public View getContentView() {
        return this.f5528e;
    }

    @Override // android.widget.PopupWindow
    public void setContentView(View view) {
        if (isShowing()) {
            return;
        }
        this.f5528e = view;
        if (this.f5524a == null && this.f5528e != null) {
            this.f5524a = this.f5528e.getContext();
        }
        if (this.f5525b == null && this.f5528e != null) {
            this.f5525b = (WindowManager) this.f5524a.getSystemService("window");
        }
        if (this.f5524a == null || this.f5543t) {
            return;
        }
        setAttachedInDecor(this.f5524a.getApplicationInfo().targetSdkVersion >= 22);
    }

    @Override // android.widget.PopupWindow
    public void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.f5544u = onTouchListener;
    }

    @Override // android.widget.PopupWindow
    public boolean isFocusable() {
        return this.f5530g;
    }

    @Override // android.widget.PopupWindow
    public void setFocusable(boolean z) {
        this.f5530g = z;
    }

    @Override // android.widget.PopupWindow
    public int getInputMethodMode() {
        return this.f5531h;
    }

    @Override // android.widget.PopupWindow
    public void setInputMethodMode(int i) {
        this.f5531h = i;
    }

    @Override // android.widget.PopupWindow
    public void setSoftInputMode(int i) {
        this.f5532i = i;
    }

    @Override // android.widget.PopupWindow
    public int getSoftInputMode() {
        return this.f5532i;
    }

    @Override // android.widget.PopupWindow
    public boolean isTouchable() {
        return this.f5533j;
    }

    @Override // android.widget.PopupWindow
    public void setTouchable(boolean z) {
        this.f5533j = z;
    }

    @Override // android.widget.PopupWindow
    public boolean isOutsideTouchable() {
        return this.f5534k;
    }

    @Override // android.widget.PopupWindow
    public void setOutsideTouchable(boolean z) {
        this.f5534k = z;
    }

    @Override // android.widget.PopupWindow
    public boolean isClippingEnabled() {
        return this.f5535l;
    }

    @Override // android.widget.PopupWindow
    public void setClippingEnabled(boolean z) {
        this.f5535l = z;
    }

    public void setClipToScreenEnabled(boolean z) {
        this.f5538o = z;
        setClippingEnabled(!z);
    }

    @Override // android.widget.PopupWindow
    public boolean isSplitTouchEnabled() {
        return (this.f5536m >= 0 || this.f5524a == null) ? this.f5536m == 1 : this.f5524a.getApplicationInfo().targetSdkVersion >= 11;
    }

    @Override // android.widget.PopupWindow
    public void setSplitTouchEnabled(boolean z) {
        this.f5536m = z ? 1 : 0;
    }

    public boolean isLayoutInScreenEnabled() {
        return this.f5537n;
    }

    public void setLayoutInScreenEnabled(boolean z) {
        this.f5537n = z;
    }

    @Override // android.widget.PopupWindow
    public boolean isAttachedInDecor() {
        return this.f5542s;
    }

    @Override // android.widget.PopupWindow
    public void setAttachedInDecor(boolean z) {
        this.f5542s = z;
        this.f5543t = true;
    }

    public void setLayoutInsetDecor(boolean z) {
        this.f5540q = z;
    }

    @Override // android.widget.PopupWindow
    public void setWindowLayoutType(int i) {
        this.f5513N = i;
    }

    @Override // android.widget.PopupWindow
    public int getWindowLayoutType() {
        return this.f5513N;
    }

    @Override // android.widget.PopupWindow
    public void setTouchModal(boolean z) {
        this.f5541r = !z;
    }

    @Override // android.widget.PopupWindow
    public void setWindowLayoutMode(int i, int i2) {
        this.f5545v = i;
        this.f5548y = i2;
    }

    @Override // android.widget.PopupWindow
    public int getHeight() {
        return this.f5549z;
    }

    @Override // android.widget.PopupWindow
    public void setHeight(int i) {
        this.f5549z = i;
    }

    @Override // android.widget.PopupWindow
    public int getWidth() {
        return this.f5546w;
    }

    @Override // android.widget.PopupWindow
    public void setWidth(int i) {
        this.f5546w = i;
    }

    @Override // android.widget.PopupWindow
    public boolean isShowing() {
        return this.f5526c;
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
        showAtLocation(view.getWindowToken(), i, i2, i3);
    }

    public void showAtLocation(IBinder iBinder, int i, int i2, int i3) {
        if (isShowing() || this.f5528e == null) {
            return;
        }
        m4273d();
        this.f5526c = true;
        this.f5527d = false;
        WindowManager.LayoutParams m4258a = m4258a(iBinder);
        m4258a.windowAnimations = m4270c();
        m4269b(m4258a);
        if (i == 0) {
            i = 8388659;
        }
        m4258a.gravity = i;
        m4258a.x = i2;
        m4258a.y = i3;
        if (this.f5548y < 0) {
            int i4 = this.f5548y;
            this.f5500A = i4;
            m4258a.height = i4;
        }
        if (this.f5545v < 0) {
            int i5 = this.f5545v;
            this.f5547x = i5;
            m4258a.width = i5;
        }
        mo4278a(m4258a);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        showAsDropDown(view, 0, 0);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        showAsDropDown(view, i, i2, 8388659);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (isShowing() || this.f5528e == null) {
            return;
        }
        m4260a(view, i, i2, i3);
        this.f5526c = true;
        this.f5527d = true;
        WindowManager.LayoutParams m4258a = m4258a(view.getWindowToken());
        m4269b(m4258a);
        m4263a(m4264a(view, m4258a, i, i2, i3));
        if (this.f5548y < 0) {
            int i4 = this.f5548y;
            this.f5500A = i4;
            m4258a.height = i4;
        }
        if (this.f5545v < 0) {
            int i5 = this.f5545v;
            this.f5547x = i5;
            m4258a.width = i5;
        }
        m4258a.windowAnimations = m4270c();
        mo4278a(m4258a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4263a(boolean z) {
        if (z != this.f5512M) {
            this.f5512M = z;
            if (this.f5507H != null) {
                if (this.f5508I != null) {
                    if (this.f5512M) {
                        this.f5529f.setBackgroundDrawable(this.f5508I);
                        return;
                    } else {
                        this.f5529f.setBackgroundDrawable(this.f5509J);
                        return;
                    }
                }
                this.f5529f.refreshDrawableState();
            }
        }
    }

    @Override // android.widget.PopupWindow
    public boolean isAboveAnchor() {
        return this.f5512M;
    }

    /* renamed from: b */
    private void m4269b(WindowManager.LayoutParams layoutParams) {
        if (this.f5528e == null || this.f5524a == null || this.f5525b == null) {
            throw new IllegalStateException("You must specify a valid content view by calling setContentView() before attempting to show the popup.");
        }
        if (this.f5507H != null) {
            ViewGroup.LayoutParams layoutParams2 = this.f5528e.getLayoutParams();
            int i = (layoutParams2 == null || layoutParams2.height != -2) ? -1 : -2;
            C1299t c1299t = new C1299t(this, this.f5524a);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, i);
            c1299t.setBackgroundDrawable(this.f5507H);
            c1299t.addView(this.f5528e, layoutParams3);
            this.f5529f = c1299t;
        } else {
            this.f5529f = this.f5528e;
        }
        C0538w.m1839a(this.f5529f, this.f5503D);
        this.f5523Y = C1154b.m3812b(this.f5529f) == 2;
        this.f5501B = layoutParams.width;
        this.f5502C = layoutParams.height;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4278a(WindowManager.LayoutParams layoutParams) {
        if (this.f5524a != null) {
            layoutParams.packageName = this.f5524a.getPackageName();
        }
        this.f5529f.setFitsSystemWindows(this.f5540q);
        m4268b();
        this.f5525b.addView(this.f5529f, layoutParams);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private void m4268b() {
        View view;
        if (this.f5517S == null || (view = this.f5517S.get()) == null || !this.f5523Y) {
            return;
        }
        this.f5529f.setLayoutDirection(view.getLayoutDirection());
    }

    /* renamed from: a */
    private WindowManager.LayoutParams m4258a(IBinder iBinder) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        int i = this.f5546w;
        this.f5547x = i;
        layoutParams.width = i;
        int i2 = this.f5549z;
        this.f5500A = i2;
        layoutParams.height = i2;
        if (this.f5507H != null) {
            layoutParams.format = this.f5507H.getOpacity();
        } else {
            layoutParams.format = -3;
        }
        layoutParams.flags = m4257a(layoutParams.flags);
        layoutParams.type = this.f5513N;
        layoutParams.token = iBinder;
        layoutParams.softInputMode = this.f5532i;
        layoutParams.setTitle("PopupWindow:" + Integer.toHexString(hashCode()));
        return layoutParams;
    }

    /* renamed from: a */
    private int m4257a(int i) {
        int i2 = i & (-8815129);
        if (this.f5515P) {
            i2 |= 32768;
        }
        if (!this.f5530g) {
            i2 |= 8;
            if (this.f5531h == 1) {
                i2 |= 131072;
            }
        } else if (this.f5531h == 2) {
            i2 |= 131072;
        }
        if (!this.f5533j) {
            i2 |= 16;
        }
        if (this.f5534k) {
            i2 |= 262144;
        }
        if (!this.f5535l) {
            i2 |= 512;
        }
        if (isSplitTouchEnabled()) {
            i2 |= 8388608;
        }
        if (this.f5537n) {
            i2 |= 256;
        }
        if (this.f5540q) {
            i2 |= 65536;
        }
        if (this.f5541r) {
            i2 |= 32;
        }
        return this.f5542s ? i2 | 1073741824 : i2;
    }

    /* renamed from: c */
    private int m4270c() {
        if (this.f5516Q == -1) {
            if (this.f5527d) {
                return this.f5512M ? color.support.p043v7.appcompat.R.style.Animation_ColorSupport_DropDownUp : color.support.p043v7.appcompat.R.style.Animation_ColorSupport_DropDownDown;
            }
            return 0;
        }
        return this.f5516Q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public boolean m4264a(View view, WindowManager.LayoutParams layoutParams, int i, int i2, int i3) {
        int height = view.getHeight();
        int width = view.getWidth();
        int i4 = this.f5522X ? i2 - height : i2;
        view.getLocationInWindow(this.f5504E);
        boolean z = false;
        layoutParams.x = this.f5504E[0] + i;
        layoutParams.y = this.f5504E[1] + height + i4;
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7;
        if (absoluteGravity == 5) {
            layoutParams.x -= this.f5501B - width;
        }
        layoutParams.gravity = 51;
        view.getLocationOnScreen(this.f5505F);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int i5 = this.f5505F[1] + height + i4;
        View rootView = view.getRootView();
        if (i5 + this.f5502C > rect.bottom || (layoutParams.x + this.f5501B) - rootView.getWidth() > 0) {
            if (this.f5539p) {
                int scrollX = view.getScrollX();
                int scrollY = view.getScrollY();
                view.requestRectangleOnScreen(new Rect(scrollX, scrollY, this.f5501B + scrollX + i, this.f5502C + scrollY + height + i4), true);
            }
            view.getLocationInWindow(this.f5504E);
            layoutParams.x = this.f5504E[0] + i;
            layoutParams.y = this.f5504E[1] + height + i4;
            if (absoluteGravity == 5) {
                layoutParams.x -= this.f5501B - width;
            }
            view.getLocationOnScreen(this.f5505F);
            z = ((rect.bottom - this.f5505F[1]) - height) - i4 < (this.f5505F[1] - i4) - rect.top;
            if (z) {
                layoutParams.gravity = 83;
                layoutParams.y = (rootView.getHeight() - this.f5504E[1]) + i4;
            } else {
                layoutParams.y = this.f5504E[1] + height + i4;
            }
        }
        if (this.f5538o) {
            int i6 = rect.right - rect.left;
            int i7 = layoutParams.x + layoutParams.width;
            if (i7 > i6) {
                layoutParams.x -= i7 - i6;
            }
            if (layoutParams.x < rect.left) {
                layoutParams.x = rect.left;
                layoutParams.width = Math.min(layoutParams.width, i6);
            }
            if (z) {
                int i8 = (this.f5505F[1] + i4) - this.f5502C;
                if (i8 < 0) {
                    layoutParams.y += i8;
                }
            } else {
                layoutParams.y = Math.max(layoutParams.y, rect.top);
            }
        }
        layoutParams.gravity |= 268435456;
        this.f5510K = (this.f5504E[0] - layoutParams.x) + (height / 2);
        this.f5511L = (this.f5504E[1] - layoutParams.y) + (width / 2);
        return z;
    }

    @Override // android.widget.PopupWindow
    public int getMaxAvailableHeight(View view) {
        return getMaxAvailableHeight(view, 0);
    }

    @Override // android.widget.PopupWindow
    public int getMaxAvailableHeight(View view, int i) {
        return getMaxAvailableHeight(view, i, false);
    }

    @Override // android.widget.PopupWindow
    public int getMaxAvailableHeight(View view, int i, boolean z) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.f5504E;
        view.getLocationOnScreen(iArr);
        int i2 = rect.bottom;
        if (z) {
            i2 = view.getContext().getResources().getDisplayMetrics().heightPixels;
        }
        int max = Math.max((i2 - (iArr[1] + view.getHeight())) - i, (iArr[1] - rect.top) + i);
        if (this.f5507H == null) {
            return max;
        }
        this.f5507H.getPadding(this.f5506G);
        return max - (this.f5506G.top + this.f5506G.bottom);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (!isShowing() || this.f5529f == null) {
            return;
        }
        this.f5526c = false;
        m4273d();
        try {
            this.f5525b.removeViewImmediate(this.f5529f);
        } finally {
            if (this.f5529f != this.f5528e && (this.f5529f instanceof ViewGroup)) {
                ((ViewGroup) this.f5529f).removeView(this.f5528e);
            }
            this.f5529f = null;
            if (this.f5514O != null) {
                this.f5514O.mo4065a();
            }
        }
    }

    /* renamed from: a */
    public final void m4279a(InterfaceC1298s interfaceC1298s) {
        this.f5514O = interfaceC1298s;
    }

    @Override // android.widget.PopupWindow
    public void update() {
        if (!isShowing() || this.f5528e == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.f5529f.getLayoutParams();
        boolean z = false;
        int m4270c = m4270c();
        if (m4270c != layoutParams.windowAnimations) {
            layoutParams.windowAnimations = m4270c;
            z = true;
        }
        int m4257a = m4257a(layoutParams.flags);
        if (m4257a != layoutParams.flags) {
            layoutParams.flags = m4257a;
            z = true;
        }
        if (z) {
            m4268b();
            this.f5525b.updateViewLayout(this.f5529f, layoutParams);
        }
    }

    @Override // android.widget.PopupWindow
    public void update(int i, int i2) {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.f5529f.getLayoutParams();
        update(layoutParams.x, layoutParams.y, i, i2, false);
    }

    @Override // android.widget.PopupWindow
    public void update(int i, int i2, int i3, int i4) {
        update(i, i2, i3, i4, false);
    }

    @Override // android.widget.PopupWindow
    public void update(int i, int i2, int i3, int i4, boolean z) {
        if (i3 != -1) {
            this.f5547x = i3;
            setWidth(i3);
        }
        if (i4 != -1) {
            this.f5500A = i4;
            setHeight(i4);
        }
        if (!isShowing() || this.f5528e == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.f5529f.getLayoutParams();
        int i5 = this.f5545v < 0 ? this.f5545v : this.f5547x;
        if (i3 != -1 && layoutParams.width != i5) {
            this.f5547x = i5;
            layoutParams.width = i5;
            z = true;
        }
        int i6 = this.f5548y < 0 ? this.f5548y : this.f5500A;
        if (i4 != -1 && layoutParams.height != i6) {
            this.f5500A = i6;
            layoutParams.height = i6;
            z = true;
        }
        if (layoutParams.x != i) {
            layoutParams.x = i;
            z = true;
        }
        if (layoutParams.y != i2) {
            layoutParams.y = i2;
            z = true;
        }
        int m4270c = m4270c();
        if (m4270c != layoutParams.windowAnimations) {
            layoutParams.windowAnimations = m4270c;
            z = true;
        }
        int m4257a = m4257a(layoutParams.flags);
        if (m4257a != layoutParams.flags) {
            layoutParams.flags = m4257a;
            z = true;
        }
        if (z) {
            m4268b();
            this.f5525b.updateViewLayout(this.f5529f, layoutParams);
        }
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2) {
        m4261a(view, false, 0, 0, i, i2, this.f5521W);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        m4261a(view, true, i, i2, i3, i4, this.f5521W);
    }

    /* renamed from: a */
    private void m4261a(View view, boolean z, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i3;
        if (!isShowing() || this.f5528e == null) {
            return;
        }
        WeakReference<View> weakReference = this.f5517S;
        boolean z2 = true;
        boolean z3 = z && !(this.f5519U == i && this.f5520V == i2);
        if (weakReference == null || weakReference.get() != view || (z3 && !this.f5527d)) {
            m4260a(view, i, i2, i5);
        } else if (z3) {
            this.f5519U = i;
            this.f5520V = i2;
            this.f5521W = i5;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.f5529f.getLayoutParams();
        if (i7 == -1) {
            i7 = this.f5501B;
        } else {
            this.f5501B = i7;
        }
        int i8 = i7;
        if (i4 == -1) {
            i6 = this.f5502C;
        } else {
            this.f5502C = i4;
            i6 = i4;
        }
        int i9 = layoutParams.x;
        int i10 = layoutParams.y;
        if (z) {
            m4263a(m4264a(view, layoutParams, i, i2, i5));
        } else {
            m4263a(m4264a(view, layoutParams, this.f5519U, this.f5520V, this.f5521W));
        }
        int i11 = layoutParams.x;
        int i12 = layoutParams.y;
        if (i9 == layoutParams.x && i10 == layoutParams.y) {
            z2 = false;
        }
        update(i11, i12, i8, i6, z2);
    }

    /* renamed from: d */
    private void m4273d() {
        WeakReference<View> weakReference = this.f5517S;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            view.getViewTreeObserver().removeOnScrollChangedListener(this.f5518T);
        }
        this.f5517S = null;
    }

    /* renamed from: a */
    private void m4260a(View view, int i, int i2, int i3) {
        m4273d();
        this.f5517S = new WeakReference<>(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnScrollChangedListener(this.f5518T);
        }
        this.f5519U = i;
        this.f5520V = i2;
        this.f5521W = i3;
    }
}
