package color.support.design.widget.blur;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import color.support.p043v7.appcompat.R;
import java.util.ArrayList;
import java.util.List;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class ColorBlurringView extends View {

    /* renamed from: a */
    final ViewTreeObserver.OnPreDrawListener f4721a;

    /* renamed from: b */
    private C1168d f4722b;

    /* renamed from: c */
    private InterfaceC1170f f4723c;

    /* renamed from: d */
    private View f4724d;

    /* renamed from: e */
    private int f4725e;

    /* renamed from: f */
    private int f4726f;

    /* renamed from: g */
    private Bitmap f4727g;

    /* renamed from: h */
    private Canvas f4728h;

    /* renamed from: i */
    private int f4729i;

    /* renamed from: j */
    private boolean f4730j;

    /* renamed from: k */
    private int f4731k;

    /* renamed from: l */
    private List<Object> f4732l;

    /* renamed from: m */
    private C1165a f4733m;

    /* renamed from: n */
    private int f4734n;

    /* renamed from: o */
    private boolean f4735o;

    public ColorBlurringView(Context context) {
        this(context, null);
    }

    public ColorBlurringView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorBlurringView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4729i = 1;
        this.f4731k = ResponseCode.CODE_4XX_BAD_REQUEST;
        this.f4732l = new ArrayList();
        this.f4733m = new C1165a();
        this.f4734n = 4;
        this.f4721a = new ViewTreeObserverOnPreDrawListenerC1171g(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ColorBlurringView);
        obtainStyledAttributes.getInt(R.styleable.ColorBlurringView_overlayColor, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.ColorBlurringView_color_blur_radius, 10);
        int i3 = obtainStyledAttributes.getInt(R.styleable.ColorBlurringView_downScaleFactor, 10);
        obtainStyledAttributes.recycle();
        this.f4722b = new C1169e().m3878a(i2).m3879b(i3).m3880c(getResources().getColor(R.color.blur_cover_color)).m3881d(this.f4734n).m3877a();
        this.f4735o = context.getPackageManager().hasSystemFeature("oppo.common.performance.animator.support");
    }

    public void setColorBlurConfig(C1168d c1168d) {
        this.f4722b = c1168d;
        this.f4723c = new C1167c(getContext(), c1168d);
    }

    public void setBlurRegionHeight(int i) {
        this.f4731k = i;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4722b == null) {
            Log.i("ColorBlurringView", "onAttachedToWindow: mColorBlurConfig == null");
        }
        this.f4723c = new C1167c(getContext(), this.f4722b);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4724d != null && this.f4724d.getViewTreeObserver().isAlive()) {
            this.f4724d.getViewTreeObserver().removeOnPreDrawListener(this.f4721a);
        }
        this.f4723c.mo3870a();
    }

    public void setBlurEnable(boolean z) {
        this.f4730j = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x006f, code lost:            if (r6.f4727g == null) goto L36;     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onDraw(android.graphics.Canvas r7) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: color.support.design.widget.blur.ColorBlurringView.onDraw(android.graphics.Canvas):void");
    }
}
