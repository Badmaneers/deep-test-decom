package color.support.p043v7.internal.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.IntProperty;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import color.support.p041a.p042a.C1154b;
import color.support.p043v7.appcompat.R;
import color.support.p043v7.widget.C1301v;
import color.support.p043v7.widget.ViewOnTouchListenerC1288o;
import com.color.support.widget.InterfaceC1479em;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.w */
/* loaded from: classes.dex */
public final class C1256w extends C1246m {

    /* renamed from: b */
    final /* synthetic */ ColorSpinner f5279b;

    /* renamed from: e */
    private final IntProperty<Drawable> f5280e;

    /* renamed from: f */
    private final ViewOnTouchListenerC1288o f5281f;

    /* renamed from: g */
    private final ColorDrawable f5282g;

    /* renamed from: h */
    private final int f5283h;

    /* renamed from: i */
    private int f5284i;

    /* renamed from: j */
    private boolean f5285j;

    /* renamed from: k */
    private C1301v f5286k;

    /* renamed from: l */
    private int f5287l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256w(ColorSpinner colorSpinner, Context context, AttributeSet attributeSet, int i) {
        super(colorSpinner, context, attributeSet, i);
        this.f5279b = colorSpinner;
        this.f5280e = new C1257x(this, "alpha");
        this.f5281f = new C1229al(this, (byte) 0);
        this.f5282g = new ColorDrawable();
        this.f5284i = -1;
        this.f5285j = false;
        this.f5286k = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Window, i, 0);
        this.f5283h = (int) (obtainStyledAttributes.getFloat(R.styleable.Window_android_backgroundDimAmount, 0.0f) * 255.0f);
        obtainStyledAttributes.recycle();
        m4207a(new C1220ac(this, colorSpinner));
        this.f5287l = colorSpinner.getResources().getDimensionPixelSize(R.dimen.color_spinner_popupwindow_max_height);
    }

    @Override // color.support.p043v7.widget.C1277d
    /* renamed from: h */
    public final void mo4108h() {
        super.mo4108h();
        m4104s();
    }

    @Override // color.support.p043v7.widget.C1277d, color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: a */
    public final void mo4081a() {
        this.f5412c.dismiss();
    }

    @Override // color.support.p043v7.internal.widget.C1246m, color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: a */
    public final void mo4083a(int i, int i2) {
        AnimatorSet animatorSet;
        Interpolator interpolator;
        Interpolator interpolator2;
        Interpolator interpolator3;
        AnimatorSet animatorSet2;
        AnimatorSet animatorSet3;
        boolean z;
        ViewTreeObserver viewTreeObserver;
        AnimatorSet animatorSet4;
        AnimatorSet animatorSet5;
        boolean b = m4210b();
        m4094g();
        m4223o();
        mo4108h();
        ListView r = m4226r();
        r.setDivider(null);
        r.setChoiceMode(1);
        r.setTextDirection(i);
        r.setBackgroundColor(this.f5279b.getResources().getColor(R.color.color_spinner_popupwindow_listview_bg_color));
        m4097a(r);
        C1154b.m3810a(r, i2);
        m4218f(this.f5279b.getSelectedItemPosition());
        m4104s();
        m4105t();
        ListView r2 = m4226r();
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        r2.setLayoutParams(layoutParams);
        if (r2.getWidth() == 0 || r2.getHeight() == 0) {
            r2.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 0), View.MeasureSpec.makeMeasureSpec(layoutParams.height, RecyclerView.UNDEFINED_DURATION));
        }
        animatorSet = this.f5279b.f5178N;
        if (animatorSet != null) {
            animatorSet5 = this.f5279b.f5178N;
            animatorSet5.end();
        }
        ColorSpinner colorSpinner = this.f5279b;
        ListView r3 = m4226r();
        Drawable d = m4213d();
        AnimatorSet animatorSet6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        interpolator = ColorSpinner.f5173I;
        ofFloat.setInterpolator(interpolator);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new C1224ag(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 102);
        ofInt.setDuration(350L);
        ofInt.setStartDelay(150L);
        interpolator2 = ColorSpinner.f5176L;
        ofInt.setInterpolator(interpolator2);
        ofInt.addUpdateListener(new C1225ah(this, d));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(350L);
        ofFloat2.setStartDelay(150L);
        interpolator3 = ColorSpinner.f5175K;
        ofFloat2.setInterpolator(interpolator3);
        ofFloat2.addUpdateListener(new C1226ai(this, r3));
        animatorSet6.play(ofFloat).with(ofInt).with(ofFloat2);
        animatorSet6.addListener(new C1227aj(this, r3, d));
        colorSpinner.f5178N = animatorSet6;
        animatorSet2 = this.f5279b.f5178N;
        animatorSet2.addListener(new C1228ak(this, null));
        animatorSet3 = this.f5279b.f5178N;
        animatorSet3.start();
        z = this.f5279b.f5186V;
        if (z) {
            ColorSpinner.m4053h(this.f5279b);
            animatorSet4 = this.f5279b.f5178N;
            animatorSet4.end();
        }
        if (b || (viewTreeObserver = this.f5279b.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1221ad viewTreeObserverOnGlobalLayoutListenerC1221ad = new ViewTreeObserverOnGlobalLayoutListenerC1221ad(this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1221ad);
        m4208a(new C1222ae(this, viewTreeObserverOnGlobalLayoutListenerC1221ad));
    }

    @Override // color.support.p043v7.widget.C1300u, color.support.p043v7.widget.InterfaceC1303x
    /* renamed from: a */
    public final void mo4106a(WindowManager.LayoutParams layoutParams) {
        layoutParams.windowAnimations = 0;
    }

    @Override // color.support.p043v7.widget.C1300u, color.support.p043v7.widget.InterfaceC1302w
    /* renamed from: a */
    public final void mo4107a(C1301v c1301v) {
        InterfaceC1479em interfaceC1479em;
        AnimatorSet animatorSet;
        Interpolator interpolator;
        Interpolator interpolator2;
        Interpolator interpolator3;
        AnimatorSet animatorSet2;
        boolean z;
        AnimatorSet animatorSet3;
        boolean z2;
        AnimatorSet animatorSet4;
        AnimatorSet animatorSet5;
        InterfaceC1479em unused;
        this.f5286k = c1301v;
        interfaceC1479em = this.f5279b.f5187W;
        if (interfaceC1479em != null && this.f5285j) {
            unused = this.f5279b.f5187W;
            return;
        }
        C1301v c1301v2 = this.f5286k;
        animatorSet = this.f5279b.f5178N;
        if (animatorSet != null) {
            animatorSet5 = this.f5279b.f5178N;
            animatorSet5.end();
        }
        ColorSpinner colorSpinner = this.f5279b;
        AnimatorSet animatorSet6 = new AnimatorSet();
        ListView r = m4226r();
        Drawable d = m4213d();
        ValueAnimator ofInt = ValueAnimator.ofInt(102, 0);
        interpolator = ColorSpinner.f5176L;
        ofInt.setInterpolator(interpolator);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new C1258y(this, d));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        interpolator2 = ColorSpinner.f5175K;
        ofFloat.setInterpolator(interpolator2);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new C1259z(this, r));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setDuration(300L);
        interpolator3 = ColorSpinner.f5173I;
        ofFloat2.setInterpolator(interpolator3);
        ofFloat2.addUpdateListener(new C1218aa(this));
        animatorSet6.play(ofInt).with(ofFloat).with(ofFloat2);
        animatorSet6.addListener(new C1219ab(this));
        colorSpinner.f5178N = animatorSet6;
        animatorSet2 = this.f5279b.f5178N;
        z = this.f5279b.f5185U;
        animatorSet2.addListener(new C1228ak(this, z ? null : c1301v2));
        animatorSet3 = this.f5279b.f5178N;
        animatorSet3.start();
        z2 = this.f5279b.f5185U;
        if (z2) {
            ColorSpinner.m4057j(this.f5279b);
            c1301v2.m4282b();
            animatorSet4 = this.f5279b.f5178N;
            animatorSet4.end();
        }
    }

    @Override // color.support.p043v7.widget.C1300u, color.support.p043v7.widget.InterfaceC1302w
    /* renamed from: i */
    public final void mo4109i() {
        boolean z;
        z = this.f5279b.f5184T;
        if (!z || this.f5284i == -1) {
            return;
        }
        ColorSpinner.m4046c(this.f5279b);
        this.f5279b.setSelection(this.f5284i);
        this.f5284i = -1;
    }

    @Override // color.support.p043v7.widget.C1277d
    /* renamed from: j */
    public final int mo4110j() {
        int i;
        if (this.f5279b.f5138G == -1) {
            m4211c(this.f5279b.getContext().getResources().getDisplayMetrics().widthPixels);
        }
        i = this.f5279b.f5180P;
        if (i == -1) {
            m4216e(this.f5412c.getMaxAvailableHeight(m4221m(), m4215e(), false));
        }
        return super.mo4110j();
    }

    /* renamed from: a */
    public void m4097a(ListView listView) {
        if (listView == null) {
            return;
        }
        listView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1223af(this, listView));
    }

    /* renamed from: s */
    private void m4104s() {
        this.f5412c.setTouchInterceptor(this.f5281f);
        this.f5412c.setAnimationStyle(0);
    }

    /* renamed from: t */
    public void m4105t() {
        this.f5282g.setColor(this.f5279b.getResources().getColor(R.color.color_spiner_background_color));
        this.f5282g.setAlpha(this.f5283h);
        this.f5412c.setBackgroundDrawable(this.f5282g);
    }

    /* renamed from: a */
    public static /* synthetic */ int m4095a(View view) {
        int height = view.getHeight();
        return height == 0 ? view.getMeasuredHeight() : height;
    }

    /* renamed from: b */
    public static /* synthetic */ int m4101b(View view) {
        int width = view.getWidth();
        return width == 0 ? view.getMeasuredWidth() : width;
    }
}
