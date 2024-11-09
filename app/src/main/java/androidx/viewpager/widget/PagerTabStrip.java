package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.content.C0420a;

/* loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: g */
    private int f4370g;

    /* renamed from: h */
    private int f4371h;

    /* renamed from: i */
    private int f4372i;

    /* renamed from: j */
    private int f4373j;

    /* renamed from: k */
    private int f4374k;

    /* renamed from: l */
    private int f4375l;

    /* renamed from: m */
    private final Paint f4376m;

    /* renamed from: n */
    private final Rect f4377n;

    /* renamed from: o */
    private int f4378o;

    /* renamed from: p */
    private boolean f4379p;

    /* renamed from: q */
    private boolean f4380q;

    /* renamed from: r */
    private int f4381r;

    /* renamed from: s */
    private boolean f4382s;

    /* renamed from: t */
    private float f4383t;

    /* renamed from: u */
    private float f4384u;

    /* renamed from: v */
    private int f4385v;

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4376m = new Paint();
        this.f4377n = new Rect();
        this.f4378o = 255;
        this.f4379p = false;
        this.f4380q = false;
        this.f4370g = this.f4393f;
        this.f4376m.setColor(this.f4370g);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4371h = (int) ((3.0f * f) + 0.5f);
        this.f4372i = (int) ((6.0f * f) + 0.5f);
        this.f4373j = (int) (64.0f * f);
        this.f4375l = (int) ((16.0f * f) + 0.5f);
        this.f4381r = (int) ((1.0f * f) + 0.5f);
        this.f4374k = (int) ((f * 32.0f) + 0.5f);
        this.f4385v = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f4389b.setFocusable(true);
        this.f4389b.setOnClickListener(new ViewOnClickListenerC1095b(this));
        this.f4391d.setFocusable(true);
        this.f4391d.setOnClickListener(new ViewOnClickListenerC1096c(this));
        if (getBackground() == null) {
            this.f4379p = true;
        }
    }

    public void setTabIndicatorColor(int i) {
        this.f4370g = i;
        this.f4376m.setColor(this.f4370g);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(C0420a.m1488c(getContext(), i));
    }

    public int getTabIndicatorColor() {
        return this.f4370g;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f4372i) {
            i4 = this.f4372i;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        if (i < this.f4373j) {
            i = this.f4373j;
        }
        super.setTextSpacing(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f4380q) {
            return;
        }
        this.f4379p = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.f4380q) {
            return;
        }
        this.f4379p = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4380q) {
            return;
        }
        this.f4379p = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.f4379p = z;
        this.f4380q = true;
        invalidate();
    }

    public boolean getDrawFullUnderline() {
        return this.f4379p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f4374k);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f4382s) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.f4383t = x;
                this.f4384u = y;
                this.f4382s = false;
                break;
            case 1:
                if (x >= this.f4390c.getLeft() - this.f4375l) {
                    if (x > this.f4390c.getRight() + this.f4375l) {
                        this.f4388a.setCurrentItem(this.f4388a.getCurrentItem() + 1);
                        break;
                    }
                } else {
                    this.f4388a.setCurrentItem(this.f4388a.getCurrentItem() - 1);
                    break;
                }
                break;
            case 2:
                if (Math.abs(x - this.f4383t) > this.f4385v || Math.abs(y - this.f4384u) > this.f4385v) {
                    this.f4382s = true;
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f4390c.getLeft() - this.f4375l;
        int right = this.f4390c.getRight() + this.f4375l;
        int i = height - this.f4371h;
        this.f4376m.setColor((this.f4378o << 24) | (this.f4370g & 16777215));
        float f = height;
        canvas.drawRect(left, i, right, f, this.f4376m);
        if (this.f4379p) {
            this.f4376m.setColor((-16777216) | (this.f4370g & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f4381r, getWidth() - getPaddingRight(), f, this.f4376m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* renamed from: a */
    public final void mo3657a(int i, float f, boolean z) {
        Rect rect = this.f4377n;
        int height = getHeight();
        int left = this.f4390c.getLeft() - this.f4375l;
        int right = this.f4390c.getRight() + this.f4375l;
        int i2 = height - this.f4371h;
        rect.set(left, i2, right, height);
        super.mo3657a(i, f, z);
        this.f4378o = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f4390c.getLeft() - this.f4375l, i2, this.f4390c.getRight() + this.f4375l, height);
        invalidate(rect);
    }
}
