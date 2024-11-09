package com.color.support.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.p024g.C0538w;
import com.color.support.p048c.p049a.C1310a;
import com.color.support.p048c.p049a.InterfaceC1311b;
import com.color.support.util.C1336a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ColorSupportMenuView extends View {

    /* renamed from: a */
    static final int[] f6608a = {R.attr.state_enabled};

    /* renamed from: b */
    static final int[] f6609b = {-16842910};

    /* renamed from: c */
    static final int[] f6610c = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: d */
    static final int[] f6611d = {-16842919, R.attr.state_enabled};

    /* renamed from: A */
    private C1310a f6612A;

    /* renamed from: B */
    private InterfaceC1311b f6613B;

    /* renamed from: e */
    private int f6614e;

    /* renamed from: f */
    private List<C1480en> f6615f;

    /* renamed from: g */
    private Rect f6616g;

    /* renamed from: h */
    private int f6617h;

    /* renamed from: i */
    private int f6618i;

    /* renamed from: j */
    private boolean f6619j;

    /* renamed from: k */
    private int f6620k;

    /* renamed from: l */
    private Paint f6621l;

    /* renamed from: m */
    private float f6622m;

    /* renamed from: n */
    private int f6623n;

    /* renamed from: o */
    private int f6624o;

    /* renamed from: p */
    private int f6625p;

    /* renamed from: q */
    private int f6626q;

    /* renamed from: r */
    private int f6627r;

    /* renamed from: s */
    private int f6628s;

    /* renamed from: t */
    private int f6629t;

    /* renamed from: u */
    private Drawable f6630u;

    /* renamed from: v */
    private int f6631v;

    /* renamed from: w */
    private int f6632w;

    /* renamed from: x */
    private int f6633x;

    /* renamed from: y */
    private int f6634y;

    /* renamed from: z */
    private int f6635z;

    public ColorSupportMenuView(Context context) {
        this(context, null);
    }

    public ColorSupportMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorSupportMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6614e = 5;
        this.f6615f = new ArrayList();
        this.f6616g = new Rect();
        this.f6619j = false;
        this.f6620k = -1;
        this.f6622m = 30.0f;
        this.f6629t = 0;
        this.f6613B = new C1482ep(this);
        this.f6621l = new Paint();
        this.f6621l.setTextAlign(Paint.Align.CENTER);
        this.f6621l.setAntiAlias(true);
        this.f6632w = (int) getResources().getDimension(color.support.p043v7.appcompat.R.dimen.color_support_menu_width);
        this.f6625p = (int) getResources().getDimension(color.support.p043v7.appcompat.R.dimen.color_support_menu_padding_top);
        this.f6626q = (int) getResources().getDimension(color.support.p043v7.appcompat.R.dimen.color_support_menu_padding_bottom);
        this.f6627r = (int) getResources().getDimension(color.support.p043v7.appcompat.R.dimen.color_support_menu_view_padding_bottom);
        this.f6617h = (int) getResources().getDimension(color.support.p043v7.appcompat.R.dimen.color_support_menu_item_height);
        this.f6618i = (int) getResources().getDimension(color.support.p043v7.appcompat.R.dimen.color_support_menu_item_width);
        this.f6628s = (int) getResources().getDimension(color.support.p043v7.appcompat.R.dimen.color_support_menu_text_padding_top);
        this.f6634y = (int) getResources().getDimension(color.support.p043v7.appcompat.R.dimen.color_support_menu_text_max_length);
        this.f6635z = (int) getResources().getDimension(color.support.p043v7.appcompat.R.dimen.color_support_menu_text_padding_side);
        this.f6622m = (int) getResources().getDimension(color.support.p043v7.appcompat.R.dimen.color_support_menu_item_textsize);
        this.f6624o = getResources().getColor(color.support.p043v7.appcompat.R.color.color_support_menu_textcolor_select);
        this.f6623n = getResources().getColor(color.support.p043v7.appcompat.R.color.color_support_menu_textcolor_normal);
        this.f6630u = getResources().getDrawable(color.support.p043v7.appcompat.R.drawable.color_support_menu_item_cover);
        this.f6622m = (int) C1336a.m4370a(this.f6622m, getResources().getConfiguration().fontScale, 4);
        this.f6621l.setTextSize(this.f6622m);
        setClickable(true);
        this.f6612A = new C1310a(this);
        this.f6612A.m4289a(this.f6613B);
        C0538w.m1849a(this, this.f6612A);
        C0538w.m1840a((View) this, 1);
    }

    public void setColorSupportMenuItem(List<C1480en> list) {
        this.f6615f = list;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        if (size > 10) {
            this.f6629t = 10;
            this.f6615f = this.f6615f.subList(0, 10);
        } else if (size == 7) {
            this.f6629t = 6;
            this.f6615f = this.f6615f.subList(0, this.f6629t);
        } else if (size == 9) {
            this.f6629t = 8;
            this.f6615f = this.f6615f.subList(0, this.f6629t);
        } else {
            this.f6629t = size;
        }
        if (size > 5) {
            this.f6614e = size / 2;
        } else {
            this.f6614e = 5;
        }
        for (int i = 0; i < this.f6629t; i++) {
            Drawable m5010b = this.f6615f.get(i).m5010b();
            StateListDrawable stateListDrawable = new StateListDrawable();
            m5010b.setState(f6610c);
            stateListDrawable.addState(f6610c, m5010b.getCurrent());
            m5010b.setState(f6608a);
            stateListDrawable.addState(f6608a, m5010b.getCurrent());
            m5010b.setState(f6609b);
            stateListDrawable.addState(f6609b, m5010b.getCurrent());
            m5010b.setState(f6611d);
            stateListDrawable.addState(f6611d, m5010b.getCurrent());
            this.f6615f.get(i).m5009a(stateListDrawable);
            this.f6615f.get(i).m5010b().setCallback(this);
            m4756a();
        }
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        Drawable m5010b;
        if (this.f6620k >= 0 && this.f6620k < this.f6629t && (m5010b = this.f6615f.get(this.f6620k).m5010b()) != null && m5010b.isStateful()) {
            m5010b.setState(getDrawableState());
        }
        super.drawableStateChanged();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f6629t <= 0) {
            return;
        }
        if (this.f6629t <= this.f6614e) {
            this.f6631v = (getWidth() - (this.f6618i * this.f6629t)) / this.f6629t;
        } else {
            this.f6631v = (getWidth() - (this.f6618i * this.f6614e)) / this.f6614e;
        }
        this.f6634y = (this.f6631v + this.f6618i) - (this.f6635z * 2);
        for (int i2 = 0; i2 < this.f6629t; i2++) {
            Rect rect = this.f6616g;
            int i3 = (this.f6631v / 2) + ((this.f6631v + this.f6618i) * (i2 % this.f6614e));
            if (isLayoutRtl()) {
                i3 = getWidth() - ((this.f6618i + (this.f6631v / 2)) + ((this.f6631v + this.f6618i) * (i2 % this.f6614e)));
            }
            if (i2 < this.f6614e) {
                i = this.f6625p;
            } else {
                i = this.f6633x + this.f6625p;
            }
            rect.set(i3, i, this.f6618i + i3, this.f6617h + i);
            C1480en c1480en = this.f6615f.get(i2);
            c1480en.m5010b().setBounds(this.f6616g);
            c1480en.m5010b().draw(canvas);
            this.f6621l.setColor(this.f6623n);
            int i4 = -this.f6621l.getFontMetricsInt().top;
            int i5 = this.f6616g.left + (this.f6618i / 2);
            int i6 = this.f6616g.bottom + this.f6628s + i4;
            String m5008a = c1480en.m5008a();
            int breakText = this.f6621l.breakText(m5008a, true, this.f6634y, null);
            if (breakText != m5008a.length()) {
                m5008a = m5008a.substring(0, breakText - 1) + "...";
            }
            canvas.drawText(m5008a, i5, i6, this.f6621l);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        Paint.FontMetricsInt fontMetricsInt = this.f6621l.getFontMetricsInt();
        this.f6633x = this.f6625p + this.f6617h + this.f6628s + (fontMetricsInt.bottom - fontMetricsInt.top) + this.f6626q;
        if (this.f6629t <= this.f6614e) {
            i3 = this.f6633x;
        } else {
            i3 = this.f6633x * 2;
        }
        setMeasuredDimension(this.f6632w, i3);
    }

    public boolean isLayoutRtl() {
        return Build.VERSION.SDK_INT > 16 && getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m4753a(float f, float f2) {
        int width;
        if (this.f6629t <= 0) {
            return -1;
        }
        if (this.f6629t <= this.f6614e) {
            if (isLayoutRtl()) {
                f = getWidth() - f;
            }
            width = (int) (f / (getWidth() / this.f6629t));
        } else {
            if (isLayoutRtl()) {
                f = getWidth() - f;
            }
            width = (int) (f / (getWidth() / this.f6614e));
            if (f2 > this.f6633x) {
                width += this.f6614e;
            }
        }
        if (width < this.f6629t) {
            return width;
        }
        return -1;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    this.f6619j = true;
                    invalidate();
                    return true;
                case 1:
                    if (this.f6620k >= 0) {
                        this.f6615f.get(this.f6620k);
                    }
                    m4756a();
                    return false;
                default:
                    return true;
            }
        }
        m4756a();
        return false;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        if (motionEvent.getPointerCount() == 1 && y >= 0.0f) {
            if (motionEvent.getAction() == 0) {
                this.f6620k = m4753a(motionEvent.getX(), motionEvent.getY());
            }
        } else {
            m4756a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m4756a() {
        Iterator<C1480en> it = this.f6615f.iterator();
        while (it.hasNext()) {
            Drawable m5010b = it.next().m5010b();
            if (m5010b != null && m5010b.isStateful()) {
                m5010b.setState(f6611d);
            }
        }
        this.f6619j = false;
        invalidate();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f6612A == null || !this.f6612A.m2082a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public void clearAccessibilityFocus() {
        if (this.f6612A != null) {
            this.f6612A.m4290b();
        }
    }
}
