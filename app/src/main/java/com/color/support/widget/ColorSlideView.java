package com.color.support.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.core.p024g.p026b.C0517b;
import androidx.dynamicanimation.p031a.C0610ab;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1336a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ColorSlideView extends LinearLayout {

    /* renamed from: a */
    private static Rect f6545a = new Rect();

    /* renamed from: A */
    private Paint f6546A;

    /* renamed from: B */
    private int f6547B;

    /* renamed from: C */
    private int f6548C;

    /* renamed from: D */
    private int f6549D;

    /* renamed from: E */
    private int f6550E;

    /* renamed from: F */
    private int f6551F;

    /* renamed from: G */
    private int f6552G;

    /* renamed from: H */
    private int f6553H;

    /* renamed from: I */
    private int f6554I;

    /* renamed from: J */
    private int f6555J;

    /* renamed from: K */
    private VelocityTracker f6556K;

    /* renamed from: L */
    private int f6557L;

    /* renamed from: M */
    private boolean f6558M;

    /* renamed from: N */
    private boolean f6559N;

    /* renamed from: O */
    private boolean f6560O;

    /* renamed from: P */
    private boolean f6561P;

    /* renamed from: Q */
    private boolean f6562Q;

    /* renamed from: R */
    private int f6563R;

    /* renamed from: S */
    private int f6564S;

    /* renamed from: T */
    private int f6565T;

    /* renamed from: U */
    private int f6566U;

    /* renamed from: V */
    private int f6567V;

    /* renamed from: W */
    private boolean f6568W;

    /* renamed from: aa */
    private boolean f6569aa;

    /* renamed from: ab */
    private int f6570ab;

    /* renamed from: ac */
    private int f6571ac;

    /* renamed from: ad */
    private boolean f6572ad;

    /* renamed from: ae */
    private int f6573ae;

    /* renamed from: af */
    private int f6574af;

    /* renamed from: ag */
    private int f6575ag;

    /* renamed from: ah */
    private boolean f6576ah;

    /* renamed from: ai */
    private int f6577ai;

    /* renamed from: aj */
    private InterfaceC1474eh f6578aj;

    /* renamed from: ak */
    private InterfaceC1477ek f6579ak;

    /* renamed from: al */
    private Runnable f6580al;

    /* renamed from: am */
    private InterfaceC1476ej f6581am;

    /* renamed from: an */
    private ArrayList<C1468eb> f6582an;

    /* renamed from: b */
    private Paint f6583b;

    /* renamed from: c */
    private Context f6584c;

    /* renamed from: d */
    private LinearLayout f6585d;

    /* renamed from: e */
    private Scroller f6586e;

    /* renamed from: f */
    private Interpolator f6587f;

    /* renamed from: g */
    private InterfaceC1475ei f6588g;

    /* renamed from: h */
    private View f6589h;

    /* renamed from: i */
    private int f6590i;

    /* renamed from: j */
    private boolean f6591j;

    /* renamed from: k */
    private boolean f6592k;

    /* renamed from: l */
    private boolean f6593l;

    /* renamed from: m */
    private boolean f6594m;

    /* renamed from: n */
    private boolean f6595n;

    /* renamed from: o */
    private boolean f6596o;

    /* renamed from: p */
    private int f6597p;

    /* renamed from: q */
    private int f6598q;

    /* renamed from: r */
    private String f6599r;

    /* renamed from: s */
    private int f6600s;

    /* renamed from: t */
    private Drawable f6601t;

    /* renamed from: u */
    private int f6602u;

    /* renamed from: v */
    private int f6603v;

    /* renamed from: w */
    private Drawable f6604w;

    /* renamed from: x */
    private ValueAnimator f6605x;

    /* renamed from: y */
    private C0610ab f6606y;

    /* renamed from: z */
    private Layout f6607z;

    /* renamed from: a */
    private static long m4740a(int i, int i2) {
        return i2 | (i << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Runnable m4742a(ColorSlideView colorSlideView) {
        colorSlideView.f6580al = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ boolean m4751d(ColorSlideView colorSlideView) {
        colorSlideView.f6561P = false;
        return false;
    }

    public ColorSlideView(Context context) {
        super(context);
        this.f6590i = 0;
        this.f6591j = false;
        this.f6592k = true;
        this.f6593l = false;
        this.f6594m = true;
        this.f6595n = false;
        this.f6596o = false;
        this.f6597p = 0;
        this.f6598q = 0;
        this.f6600s = 0;
        this.f6603v = 0;
        this.f6607z = null;
        this.f6550E = 0;
        this.f6551F = 0;
        this.f6555J = 8;
        this.f6556K = null;
        this.f6557L = -1;
        this.f6558M = false;
        this.f6559N = false;
        this.f6560O = false;
        this.f6561P = false;
        this.f6562Q = true;
        this.f6564S = 0;
        this.f6565T = -1;
        this.f6566U = 18;
        this.f6567V = 20;
        this.f6568W = true;
        this.f6569aa = true;
        m4746b();
    }

    public ColorSlideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6590i = 0;
        this.f6591j = false;
        this.f6592k = true;
        this.f6593l = false;
        this.f6594m = true;
        this.f6595n = false;
        this.f6596o = false;
        this.f6597p = 0;
        this.f6598q = 0;
        this.f6600s = 0;
        this.f6603v = 0;
        this.f6607z = null;
        this.f6550E = 0;
        this.f6551F = 0;
        this.f6555J = 8;
        this.f6556K = null;
        this.f6557L = -1;
        this.f6558M = false;
        this.f6559N = false;
        this.f6560O = false;
        this.f6561P = false;
        this.f6562Q = true;
        this.f6564S = 0;
        this.f6565T = -1;
        this.f6566U = 18;
        this.f6567V = 20;
        this.f6568W = true;
        this.f6569aa = true;
        m4746b();
    }

    public void setDeleteEnable(boolean z) {
        if (this.f6591j == z) {
            return;
        }
        this.f6591j = z;
        if (z) {
            this.f6582an.add(0, new C1468eb(this.f6584c, this.f6584c.getResources().getDrawable(R.drawable.color_slide_view_delete)));
            if (this.f6583b != null) {
                C1468eb c1468eb = this.f6582an.get(0);
                int measureText = c1468eb.m5001a() != null ? ((int) this.f6583b.measureText((String) c1468eb.m5001a())) + (this.f6603v * 2) : 0;
                if (measureText > c1468eb.m5005b()) {
                    c1468eb.m5002a(measureText);
                }
            }
        } else {
            this.f6582an.remove(0);
        }
        m4743a();
    }

    public void setDeleteItemText(CharSequence charSequence) {
        int measureText;
        if (this.f6591j) {
            C1468eb c1468eb = this.f6582an.get(0);
            c1468eb.m5004a(charSequence);
            if (this.f6583b == null || (measureText = ((int) this.f6583b.measureText((String) c1468eb.m5001a())) + (this.f6603v * 2)) <= c1468eb.m5005b()) {
                return;
            }
            c1468eb.m5002a(measureText);
            m4743a();
        }
    }

    public void setCanStartDeleteAnimation(boolean z) {
        this.f6562Q = z;
    }

    public void setDeleteItemIcon(int i) {
        if (this.f6591j) {
            this.f6582an.get(0).m5006b(i);
        }
    }

    public void setDeleteItemIcon(Drawable drawable) {
        if (this.f6591j) {
            this.f6582an.get(0).m5003a(drawable);
        }
    }

    public void setDeleteItemText(int i) {
        setDeleteItemText(this.f6584c.getText(i));
    }

    public CharSequence getDeleteItemText() {
        if (this.f6591j) {
            return this.f6582an.get(0).m5001a();
        }
        return null;
    }

    /* renamed from: a */
    private void m4743a() {
        this.f6590i = 0;
        this.f6598q = this.f6582an.size();
        for (int i = 0; i < this.f6598q; i++) {
            this.f6590i += this.f6582an.get(i).m5005b();
        }
        this.f6590i += getResources().getDimensionPixelSize(R.dimen.color_slide_view_item_padding) * 2;
    }

    /* renamed from: b */
    private void m4746b() {
        this.f6584c = getContext();
        if (Build.VERSION.SDK_INT < 21) {
            setLayerType(1, null);
        }
        int m4370a = (int) C1336a.m4370a(getResources().getDimensionPixelSize(R.dimen.TD08), getResources().getConfiguration().fontScale, 2);
        this.f6555J = getResources().getDimensionPixelSize(R.dimen.color_slideview_touch_slop);
        this.f6574af = getResources().getDimensionPixelSize(R.dimen.color_slideview_over_slide_delete);
        this.f6575ag = getResources().getDimensionPixelSize(R.dimen.color_slideview_quick_delete);
        this.f6583b = new TextPaint();
        this.f6583b.setColor(this.f6584c.getResources().getColor(R.color.color_slideview_textcolor));
        this.f6583b.setTextSize(m4370a);
        this.f6603v = this.f6584c.getResources().getDimensionPixelSize(R.dimen.f5032M5);
        this.f6566U = this.f6584c.getResources().getDimensionPixelSize(R.dimen.f5030M3);
        this.f6567V = this.f6584c.getResources().getDimensionPixelSize(R.dimen.color_slideview_group_round_radius);
        this.f6583b.setAntiAlias(true);
        this.f6583b.setTextAlign(Paint.Align.CENTER);
        this.f6582an = new ArrayList<>();
        this.f6554I = ViewConfiguration.get(this.f6584c).getScaledMaximumFlingVelocity();
        setDeleteEnable(true);
        this.f6546A = new TextPaint();
        this.f6546A.setStrokeWidth(1.0f);
        this.f6546A.setColor(this.f6584c.getResources().getColor(R.color.color_slideview_delete_divider_color));
        this.f6546A.setAntiAlias(true);
        this.f6601t = getContext().getResources().getDrawable(R.drawable.oppo_divider_horizontal_default);
        this.f6587f = C0517b.m1773a(0.133f, 0.0f, 0.3f, 1.0f);
        this.f6586e = new Scroller(this.f6584c, this.f6587f);
        setOrientation(0);
        setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        m4743a();
        this.f6599r = this.f6584c.getString(R.string.color_slide_delete);
        this.f6563R = this.f6584c.getResources().getColor(R.color.color_slideview_backcolor);
        this.f6604w = new ColorDrawable(this.f6563R);
        this.f6563R &= 16777215;
        this.f6605x = ObjectAnimator.ofInt(this.f6604w, "Alpha", 0, 210);
        this.f6605x.setInterpolator(this.f6587f);
        this.f6605x.addUpdateListener(new C1469ec(this));
        this.f6577ai = getResources().getDimensionPixelSize(R.dimen.color_slide_view_item_padding);
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        if ((this.f6594m || this.f6595n) && this.f6598q > 0) {
            canvas.save();
            if (this.f6600s > 0) {
                canvas.drawColor((this.f6600s << 24) | this.f6563R);
            }
            int i = isLayoutRtl() ? -1 : 1;
            if (isLayoutRtl()) {
                canvas.translate(getWidth(), 0.0f);
            }
            if (this.f6607z == null) {
                this.f6607z = new StaticLayout(this.f6599r, (TextPaint) this.f6583b, this.f6590i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            }
            int m4741a = (int) (m4741a(canvas) >>> 32);
            if (m4741a >= 0) {
                Paint paint = new Paint();
                int color2 = getResources().getColor(R.color.color_slide_view_item_background_color);
                if (this.f6600s > 0) {
                    paint.setColor((color2 & 16777215) | (this.f6600s << 24));
                } else {
                    paint.setColor(color2);
                }
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawRect((getWidth() - (getSlideViewScrollX() * i)) * i, 0.0f, getWidth() * i, getHeight(), paint);
                int lineTop = this.f6607z.getLineTop(m4741a + 1) - this.f6607z.getLineDescent(m4741a);
                Paint.FontMetrics fontMetrics = this.f6583b.getFontMetrics();
                int ceil = ((int) Math.ceil(fontMetrics.descent)) - ((int) Math.ceil(fontMetrics.ascent));
                for (int i2 = 0; i2 < this.f6598q; i2++) {
                    this.f6582an.get(i2);
                    Drawable m5007c = this.f6582an.get(i2).m5007c();
                    int slideViewScrollX = (getSlideViewScrollX() * i <= this.f6590i || this.f6561P) ? 0 : (getSlideViewScrollX() * i) - this.f6590i;
                    int slideViewScrollX2 = (getSlideViewScrollX() * i <= this.f6590i || !this.f6561P) ? 0 : (getSlideViewScrollX() * i) - this.f6590i;
                    if (this.f6576ah && this.f6572ad) {
                        width = (this.f6598q + 1 == 0 || getWidth() - (this.f6573ae * i) == 0) ? 0 : (getWidth() - (this.f6573ae * i)) + this.f6577ai + (((this.f6598q - i2) * ((this.f6573ae * i) - this.f6590i)) / (this.f6598q + 1)) + ((((((this.f6598q - i2) * ((this.f6573ae * i) - this.f6590i)) / (this.f6598q + 1)) * (getSlideViewScrollX() - this.f6573ae)) * i) / (getWidth() - (this.f6573ae * i)));
                    } else {
                        width = (getWidth() - (getSlideViewScrollX() * i)) + this.f6577ai + (((this.f6598q - i2) * slideViewScrollX) / (this.f6598q + 1)) + slideViewScrollX2;
                    }
                    int i3 = width * i;
                    for (int i4 = this.f6598q - 1; i4 > i2; i4--) {
                        i3 += this.f6582an.get(i4).m5005b() * i;
                    }
                    int height = getHeight();
                    this.f6582an.get(i2);
                    if (this.f6582an.get(i2).m5001a() != null) {
                        canvas.drawText((String) this.f6582an.get(i2).m5001a(), ((this.f6582an.get(i2).m5005b() * i) / 2) + i3, ((height / 2) + lineTop) - (ceil / 2), this.f6583b);
                    }
                    if (m5007c != null) {
                        int intrinsicWidth = m5007c.getIntrinsicWidth();
                        int intrinsicHeight = m5007c.getIntrinsicHeight();
                        int m5005b = i3 + (((this.f6582an.get(i2).m5005b() - intrinsicWidth) * i) / 2);
                        int i5 = (height - intrinsicHeight) / 2;
                        int i6 = (intrinsicWidth * i) + m5005b;
                        if (m5005b > i6) {
                            i6 = m5005b;
                            m5005b = i6;
                        }
                        m5007c.setBounds(m5005b, i5, i6, intrinsicHeight + i5);
                        m5007c.draw(canvas);
                    }
                }
            }
            canvas.restore();
        }
        if (this.f6596o) {
            canvas.save();
            this.f6601t.setBounds(0, getHeight() - this.f6601t.getIntrinsicHeight(), getWidth(), getHeight());
            this.f6601t.draw(canvas);
            canvas.restore();
        }
    }

    public void setUseDefaultBackground(boolean z) {
        this.f6568W = z;
    }

    public void setGroupOffset(int i) {
        this.f6566U = i;
    }

    public void setMenuDividerEnable(boolean z) {
        this.f6569aa = z;
    }

    /* renamed from: a */
    private long m4741a(Canvas canvas) {
        synchronized (f6545a) {
            if (!canvas.getClipBounds(f6545a)) {
                return m4740a(0, -1);
            }
            int i = f6545a.top;
            int i2 = f6545a.bottom;
            int max = Math.max(i, 0);
            int min = Math.min(this.f6607z.getLineTop(this.f6607z.getLineCount()), i2);
            if (max >= min) {
                return m4740a(0, -1);
            }
            return m4740a(m4738a(max), m4738a(min));
        }
    }

    /* renamed from: a */
    private int m4738a(int i) {
        int lineCount = this.f6607z.getLineCount();
        int i2 = -1;
        while (lineCount - i2 > 1) {
            int i3 = (lineCount + i2) / 2;
            if (this.f6607z.getLineTop(i3) > i) {
                lineCount = i3;
            } else {
                i2 = i3;
            }
        }
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public void setContentView(View view) {
        if (this.f6558M) {
            this.f6585d.addView(view, new LinearLayout.LayoutParams(-1, -1));
            this.f6589h = this;
        } else {
            addView(view, new LinearLayout.LayoutParams(-1, -1));
            this.f6589h = view;
        }
    }

    public View getContentView() {
        return this.f6589h;
    }

    public void setSlideEnable(boolean z) {
        this.f6594m = z;
    }

    public boolean getSlideEnable() {
        return this.f6594m;
    }

    public void setDrawItemEnable(boolean z) {
        this.f6595n = z;
    }

    public boolean getDrawItemEnable() {
        return this.f6595n;
    }

    public void setDiverEnable(boolean z) {
        this.f6596o = z;
        invalidate();
    }

    public boolean getDiverEnable() {
        return this.f6596o;
    }

    public void setDiver(int i) {
        setDiver(getContext().getResources().getDrawable(i));
    }

    public void setDiver(Drawable drawable) {
        if (drawable != null) {
            this.f6596o = true;
        } else {
            this.f6596o = false;
        }
        if (this.f6601t != drawable) {
            this.f6601t = drawable;
            invalidate();
        }
    }

    public Drawable getDiver() {
        return this.f6601t;
    }

    @Override // android.view.View
    public boolean hasFocusable() {
        return getVisibility() == 0 && isFocusable();
    }

    public void setOnSlideListener(InterfaceC1475ei interfaceC1475ei) {
        this.f6588g = interfaceC1475ei;
    }

    public Scroller getScroll() {
        return this.f6586e;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int scrollX;
        int i;
        int i2;
        if (!this.f6594m) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f6560O = false;
            this.f6559N = false;
            this.f6557L = -1;
            return false;
        }
        if (action != 0) {
            if (this.f6560O) {
                return true;
            }
            if (this.f6559N) {
                return false;
            }
        }
        if (this.f6558M) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f6589h.getScrollX();
        }
        if (action == 0) {
            this.f6557L = motionEvent.getPointerId(0);
            if (this.f6556K == null) {
                this.f6556K = VelocityTracker.obtain();
            } else {
                this.f6556K.clear();
            }
            this.f6556K.addMovement(motionEvent);
            int x = (int) motionEvent.getX();
            this.f6552G = x;
            this.f6548C = x;
            int y = (int) motionEvent.getY();
            this.f6553H = y;
            this.f6549D = y;
            this.f6559N = false;
        } else if (action == 2 && (i = this.f6557L) != -1) {
            int findPointerIndex = motionEvent.findPointerIndex(i);
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int i3 = x2 - this.f6548C;
            int abs = Math.abs(i3);
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int abs2 = Math.abs(y2 - this.f6553H);
            this.f6548C = x2;
            this.f6549D = y2;
            if (abs > this.f6547B && abs * 0.5f > abs2) {
                this.f6560O = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f6548C = i3 > 0 ? this.f6552G + this.f6547B : this.f6552G - this.f6547B;
                this.f6549D = y2;
            } else if (abs2 > this.f6547B) {
                this.f6559N = true;
            }
            if (this.f6560O) {
                m4750d();
                this.f6556K.addMovement(motionEvent);
                if (Math.abs(scrollX) >= this.f6590i || this.f6598q == 1) {
                    i2 = scrollX - ((i3 * 3) / 7);
                } else {
                    i2 = scrollX - ((i3 * 4) / 7);
                }
                if ((getLayoutDirection() != 1 && i2 < 0) || (getLayoutDirection() == 1 && i2 > 0)) {
                    i2 = 0;
                } else if (Math.abs(i2) > this.f6590i) {
                    i2 = getLayoutDirection() == 1 ? -this.f6590i : this.f6590i;
                }
                if (this.f6558M) {
                    scrollTo(i2, 0);
                } else {
                    this.f6589h.scrollTo(i2, 0);
                }
            }
        }
        return this.f6560O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0351, code lost:            r0 = true;     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.ColorSlideView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: c */
    private void m4749c() {
        m4752e();
        this.f6560O = false;
        this.f6559N = false;
    }

    /* renamed from: d */
    private void m4750d() {
        if (this.f6556K == null) {
            this.f6556K = VelocityTracker.obtain();
        }
    }

    /* renamed from: e */
    private void m4752e() {
        if (this.f6556K != null) {
            this.f6556K.recycle();
            this.f6556K = null;
        }
    }

    /* renamed from: a */
    private void m4744a(View view) {
        this.f6572ad = true;
        this.f6570ab = getSlideViewScrollX();
        this.f6571ac = getLayoutDirection() == 1 ? -getWidth() : getWidth();
        this.f6602u = getMeasuredHeight();
        new C1472ef(this, view, this.f6570ab, this.f6571ac, getHeight()).m4736a();
    }

    public int getHolderWidth() {
        return this.f6590i;
    }

    /* renamed from: b */
    private void m4747b(int i) {
        int slideViewScrollX = getSlideViewScrollX();
        int i2 = i - slideViewScrollX;
        int abs = Math.abs(i2) * 3;
        this.f6586e.startScroll(slideViewScrollX, 0, i2, 0, abs > 200 ? 200 : abs);
        invalidate();
    }

    public int getSlideViewScrollX() {
        if (this.f6558M) {
            return getScrollX();
        }
        return this.f6589h.getScrollX();
    }

    public void setSlideViewScrollX(int i) {
        if (this.f6558M) {
            scrollTo(i, getScrollY());
        } else {
            View view = this.f6589h;
            view.scrollTo(i, view.getScrollY());
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f6586e.computeScrollOffset()) {
            if (this.f6558M) {
                scrollTo(this.f6586e.getCurrX(), this.f6586e.getCurrY());
            } else {
                this.f6589h.scrollTo(this.f6586e.getCurrX(), this.f6586e.getCurrY());
            }
            postInvalidate();
        }
    }

    public boolean isLayoutRtl() {
        return Build.VERSION.SDK_INT > 16 && getLayoutDirection() == 1;
    }

    public void setOnDeleteItemClickListener(InterfaceC1474eh interfaceC1474eh) {
        this.f6578aj = interfaceC1474eh;
    }

    public void setOnSmoothScrollListener(InterfaceC1477ek interfaceC1477ek) {
        this.f6579ak = interfaceC1477ek;
    }

    public void setOnSlideMenuItemClickListener(InterfaceC1476ej interfaceC1476ej) {
        this.f6581am = interfaceC1476ej;
    }
}
