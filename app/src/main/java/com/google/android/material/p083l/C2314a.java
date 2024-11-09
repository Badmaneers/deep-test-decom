package com.google.android.material.p083l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.core.graphics.C0542a;
import com.google.android.material.R;
import com.google.android.material.internal.C2238ag;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.InterfaceC2240ai;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p082k.C2293f;
import com.google.android.material.p082k.C2294g;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2300m;

/* compiled from: TooltipDrawable.java */
/* renamed from: com.google.android.material.l.a */
/* loaded from: classes.dex */
public class C2314a extends C2295h implements InterfaceC2240ai {

    /* renamed from: a */
    private static final int f10180a = R.style.Widget_MaterialComponents_Tooltip;

    /* renamed from: b */
    private static final int f10181b = R.attr.tooltipStyle;

    /* renamed from: c */
    private CharSequence f10182c;

    /* renamed from: d */
    private final Context f10183d;

    /* renamed from: e */
    private final Paint.FontMetrics f10184e;

    /* renamed from: f */
    private final C2238ag f10185f;

    /* renamed from: g */
    private final View.OnLayoutChangeListener f10186g;

    /* renamed from: h */
    private final Rect f10187h;

    /* renamed from: i */
    private int f10188i;

    /* renamed from: j */
    private int f10189j;

    /* renamed from: k */
    private int f10190k;

    /* renamed from: l */
    private int f10191l;

    /* renamed from: m */
    private int f10192m;

    /* renamed from: n */
    private int f10193n;

    /* renamed from: a */
    public static C2314a m7376a(Context context, int i) {
        C2314a c2314a = new C2314a(context, i);
        TypedArray m7095a = C2243al.m7095a(c2314a.f10183d, null, R.styleable.Tooltip, 0, i, new int[0]);
        c2314a.f10192m = c2314a.f10183d.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        c2314a.setShapeAppearanceModel(c2314a.m7258L().m7313k().m7335b(c2314a.m7378c()).m7327a());
        c2314a.m7381a(m7095a.getText(R.styleable.Tooltip_android_text));
        c2314a.f10185f.m7091a(C2221d.m7048c(c2314a.f10183d, m7095a, R.styleable.Tooltip_android_textAppearance), c2314a.f10183d);
        int m7041a = C2220c.m7041a(c2314a.f10183d, R.attr.colorOnBackground, C2314a.class.getCanonicalName());
        c2314a.m7282g(ColorStateList.valueOf(m7095a.getColor(R.styleable.Tooltip_backgroundTint, C0542a.m1900a(C0542a.m1904b(m7041a, 153), C0542a.m1904b(C2220c.m7041a(c2314a.f10183d, android.R.attr.colorBackground, C2314a.class.getCanonicalName()), 229)))));
        c2314a.m7283h(ColorStateList.valueOf(C2220c.m7041a(c2314a.f10183d, R.attr.colorSurface, C2314a.class.getCanonicalName())));
        c2314a.f10188i = m7095a.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
        c2314a.f10189j = m7095a.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
        c2314a.f10190k = m7095a.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
        c2314a.f10191l = m7095a.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
        m7095a.recycle();
        return c2314a;
    }

    private C2314a(Context context, int i) {
        super(context, null, 0, i);
        this.f10184e = new Paint.FontMetrics();
        this.f10185f = new C2238ag(this);
        this.f10186g = new ViewOnLayoutChangeListenerC2315b(this);
        this.f10187h = new Rect();
        this.f10183d = context;
        this.f10185f.m7089a().density = context.getResources().getDisplayMetrics().density;
        this.f10185f.m7089a().setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: a */
    public final void m7381a(CharSequence charSequence) {
        if (TextUtils.equals(this.f10182c, charSequence)) {
            return;
        }
        this.f10182c = charSequence;
        this.f10185f.m7092b();
        invalidateSelf();
    }

    /* renamed from: a */
    public final void m7380a(View view) {
        if (view == null) {
            return;
        }
        m7379c(view);
        view.addOnLayoutChangeListener(this.f10186g);
    }

    /* renamed from: b */
    public final void m7382b(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f10186g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f10188i * 2) + (this.f10182c == null ? 0.0f : this.f10185f.m7088a(this.f10182c.toString())), this.f10189j);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f10185f.m7089a().getTextSize(), this.f10190k);
    }

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(m7375a(), (float) (-((this.f10192m * Math.sqrt(2.0d)) - this.f10192m)));
        super.draw(canvas);
        if (this.f10182c != null) {
            float centerY = getBounds().centerY();
            this.f10185f.m7089a().getFontMetrics(this.f10184e);
            int i = (int) (centerY - ((this.f10184e.descent + this.f10184e.ascent) / 2.0f));
            if (this.f10185f.m7093c() != null) {
                this.f10185f.m7089a().drawableState = getState();
                this.f10185f.m7090a(this.f10183d);
            }
            canvas.drawText(this.f10182c, 0, this.f10182c.length(), r0.centerX(), i, this.f10185f.m7089a());
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(m7258L().m7313k().m7335b(m7378c()).m7327a());
    }

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable, com.google.android.material.internal.InterfaceC2240ai
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.InterfaceC2240ai
    /* renamed from: b */
    public final void mo6359b() {
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m7379c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f10193n = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f10187h);
    }

    /* renamed from: a */
    private float m7375a() {
        if (((this.f10187h.right - getBounds().right) - this.f10193n) - this.f10191l < 0) {
            return ((this.f10187h.right - getBounds().right) - this.f10193n) - this.f10191l;
        }
        if (((this.f10187h.left - getBounds().left) - this.f10193n) + this.f10191l > 0) {
            return ((this.f10187h.left - getBounds().left) - this.f10193n) + this.f10191l;
        }
        return 0.0f;
    }

    /* renamed from: c */
    private C2293f m7378c() {
        float f = -m7375a();
        float width = ((float) (getBounds().width() - (this.f10192m * Math.sqrt(2.0d)))) / 2.0f;
        return new C2300m(new C2294g(this.f10192m), Math.min(Math.max(f, -width), width));
    }
}
