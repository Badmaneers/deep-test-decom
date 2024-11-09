package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;
import com.google.android.material.p072a.C2032a;
import com.google.android.material.p073b.C2063a;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2303p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.l */
/* loaded from: classes.dex */
public final class C2387l extends AbstractC2398w {

    /* renamed from: d */
    private static final boolean f10549d;

    /* renamed from: e */
    private final TextWatcher f10550e;

    /* renamed from: f */
    private final C2373ak f10551f;

    /* renamed from: g */
    private final InterfaceC2374al f10552g;

    /* renamed from: h */
    private boolean f10553h;

    /* renamed from: i */
    private boolean f10554i;

    /* renamed from: j */
    private long f10555j;

    /* renamed from: k */
    private StateListDrawable f10556k;

    /* renamed from: l */
    private C2295h f10557l;

    /* renamed from: m */
    private AccessibilityManager f10558m;

    /* renamed from: n */
    private ValueAnimator f10559n;

    /* renamed from: o */
    private ValueAnimator f10560o;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2398w
    /* renamed from: a */
    public final boolean mo7649a(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2398w
    /* renamed from: b */
    public final boolean mo7650b() {
        return true;
    }

    static {
        f10549d = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2387l(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f10550e = new C2388m(this);
        this.f10551f = new C2390o(this, this.f10573a);
        this.f10552g = new C2391p(this);
        this.f10553h = false;
        this.f10554i = false;
        this.f10555j = Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2398w
    /* renamed from: a */
    public final void mo7621a() {
        float dimensionPixelOffset = this.f10574b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f10574b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f10574b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C2295h m7635a = m7635a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C2295h m7635a2 = m7635a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f10557l = m7635a;
        this.f10556k = new StateListDrawable();
        this.f10556k.addState(new int[]{android.R.attr.state_above_anchor}, m7635a);
        this.f10556k.addState(new int[0], m7635a2);
        this.f10573a.setEndIconDrawable(C0057a.m46b(this.f10574b, f10549d ? R.drawable.mtrl_dropdown_arrow : R.drawable.mtrl_ic_arrow_drop_down));
        this.f10573a.setEndIconContentDescription(this.f10573a.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f10573a.setEndIconOnClickListener(new ViewOnClickListenerC2392q(this));
        this.f10573a.m7609a(this.f10552g);
        this.f10560o = m7632a(67, 0.0f, 1.0f);
        this.f10559n = m7632a(50, 1.0f, 0.0f);
        this.f10559n.addListener(new C2396u(this));
        C0538w.m1840a((View) this.f10575c, 2);
        this.f10558m = (AccessibilityManager) this.f10574b.getSystemService("accessibility");
    }

    /* renamed from: a */
    private C2295h m7635a(float f, float f2, float f3, int i) {
        C2303p m7327a = C2303p.m7297a().m7336c(f).m7339d(f).m7344f(f2).m7342e(f2).m7327a();
        C2295h m7241a = C2295h.m7241a(this.f10574b, f3);
        m7241a.setShapeAppearanceModel(m7327a);
        m7241a.m7275a(i, i);
        return m7241a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m7644c() {
        long currentTimeMillis = System.currentTimeMillis() - this.f10555j;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7640b(boolean z) {
        if (this.f10554i != z) {
            this.f10554i = z;
            this.f10560o.cancel();
            this.f10559n.start();
        }
    }

    /* renamed from: a */
    private ValueAnimator m7632a(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C2032a.f8973a);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new C2397v(this));
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ AutoCompleteTextView m7634a(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        return (AutoCompleteTextView) editText;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m7636a(C2387l c2387l, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (c2387l.m7644c()) {
                c2387l.f10553h = false;
            }
            if (!c2387l.f10553h) {
                if (f10549d) {
                    c2387l.m7640b(!c2387l.f10554i);
                } else {
                    c2387l.f10554i = !c2387l.f10554i;
                    c2387l.f10575c.toggle();
                }
                if (c2387l.f10554i) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                } else {
                    autoCompleteTextView.dismissDropDown();
                    return;
                }
            }
            c2387l.f10553h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m7639b(C2387l c2387l, AutoCompleteTextView autoCompleteTextView) {
        if (f10549d) {
            int boxBackgroundMode = c2387l.f10573a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(c2387l.f10557l);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(c2387l.f10556k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m7643c(C2387l c2387l, AutoCompleteTextView autoCompleteTextView) {
        LayerDrawable layerDrawable;
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = c2387l.f10573a.getBoxBackgroundMode();
            C2295h boxBackground = c2387l.f10573a.getBoxBackground();
            int m7042a = C2220c.m7042a(autoCompleteTextView, R.attr.colorControlHighlight);
            int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
            if (boxBackgroundMode == 2) {
                int m7042a2 = C2220c.m7042a(autoCompleteTextView, R.attr.colorSurface);
                C2295h c2295h = new C2295h(boxBackground.m7258L());
                int m6339a = C2063a.m6339a(m7042a, m7042a2, 0.1f);
                c2295h.m7282g(new ColorStateList(iArr, new int[]{m6339a, 0}));
                if (f10549d) {
                    c2295h.setTint(m7042a2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m6339a, m7042a2});
                    C2295h c2295h2 = new C2295h(boxBackground.m7258L());
                    c2295h2.setTint(-1);
                    layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2295h, c2295h2), boxBackground});
                } else {
                    layerDrawable = new LayerDrawable(new Drawable[]{c2295h, boxBackground});
                }
                C0538w.m1846a(autoCompleteTextView, layerDrawable);
                return;
            }
            if (boxBackgroundMode == 1) {
                int boxBackgroundColor = c2387l.f10573a.getBoxBackgroundColor();
                int[] iArr2 = {C2063a.m6339a(m7042a, boxBackgroundColor, 0.1f), boxBackgroundColor};
                if (f10549d) {
                    C0538w.m1846a(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), boxBackground, boxBackground));
                    return;
                }
                C2295h c2295h3 = new C2295h(boxBackground.m7258L());
                c2295h3.m7282g(new ColorStateList(iArr, iArr2));
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{boxBackground, c2295h3});
                int m1883l = C0538w.m1883l(autoCompleteTextView);
                int paddingTop = autoCompleteTextView.getPaddingTop();
                int m1884m = C0538w.m1884m(autoCompleteTextView);
                int paddingBottom = autoCompleteTextView.getPaddingBottom();
                C0538w.m1846a(autoCompleteTextView, layerDrawable2);
                C0538w.m1863b(autoCompleteTextView, m1883l, paddingTop, m1884m, paddingBottom);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m7645d(C2387l c2387l, AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC2393r(c2387l, autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2394s(c2387l));
        if (f10549d) {
            autoCompleteTextView.setOnDismissListener(new C2395t(c2387l));
        }
    }
}
