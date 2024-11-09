package com.color.support.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.core.p024g.C0538w;
import com.color.support.p048c.p049a.C1310a;
import com.color.support.p048c.p049a.InterfaceC1311b;
import com.color.support.util.C1336a;
import com.color.support.widget.p051a.C1357a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ColorInternetLabel extends View {

    /* renamed from: x */
    private static final int[] f6089x = new int[0];

    /* renamed from: y */
    private static final int[] f6090y = {R.attr.state_pressed};

    /* renamed from: A */
    private InterfaceC1311b f6091A;

    /* renamed from: a */
    private int f6092a;

    /* renamed from: b */
    private int f6093b;

    /* renamed from: c */
    private int f6094c;

    /* renamed from: d */
    private int f6095d;

    /* renamed from: e */
    private int f6096e;

    /* renamed from: f */
    private int f6097f;

    /* renamed from: g */
    private int f6098g;

    /* renamed from: h */
    private int f6099h;

    /* renamed from: i */
    private int f6100i;

    /* renamed from: j */
    private int f6101j;

    /* renamed from: k */
    private int f6102k;

    /* renamed from: l */
    private int f6103l;

    /* renamed from: m */
    private String f6104m;

    /* renamed from: n */
    private Drawable f6105n;

    /* renamed from: o */
    private ArrayList<Integer> f6106o;

    /* renamed from: p */
    private ArrayList<C1381aw> f6107p;

    /* renamed from: q */
    private InterfaceC1382ax f6108q;

    /* renamed from: r */
    private int f6109r;

    /* renamed from: s */
    private int f6110s;

    /* renamed from: t */
    private int f6111t;

    /* renamed from: u */
    private int f6112u;

    /* renamed from: v */
    private int f6113v;

    /* renamed from: w */
    private int f6114w;

    /* renamed from: z */
    private C1310a f6115z;

    public ColorInternetLabel(Context context) {
        this(context, null);
    }

    public ColorInternetLabel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, color.support.p043v7.appcompat.R.attr.colorInternetLabelStyle);
    }

    public ColorInternetLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6092a = -1;
        this.f6093b = -1;
        this.f6094c = -1;
        this.f6095d = -1;
        this.f6096e = -1;
        this.f6097f = 0;
        this.f6098g = -1;
        this.f6099h = -1;
        this.f6100i = -1;
        this.f6101j = -1;
        this.f6102k = -1;
        this.f6103l = 0;
        this.f6104m = null;
        this.f6105n = null;
        this.f6107p = new ArrayList<>();
        this.f6109r = -1;
        this.f6110s = 0;
        this.f6111t = 5;
        this.f6113v = -1;
        this.f6114w = -1;
        this.f6091A = new C1380av(this);
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        this.f6112u = defaultDisplay.getWidth();
        defaultDisplay.getHeight();
        if (-1 == this.f6092a) {
            this.f6092a = getResources().getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.color_internet_label_paddingleft);
        }
        if (-1 == this.f6093b) {
            this.f6093b = getResources().getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.color_internet_label_button_gap);
        }
        if (-1 == this.f6094c) {
            this.f6094c = getResources().getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.color_internet_label_button_paddingleft);
        }
        this.f6095d = ((this.f6112u - (this.f6092a * 2)) - this.f6093b) / 2;
        this.f6096e = ((this.f6112u - (this.f6092a * 2)) - (this.f6093b * 2)) / 3;
        if (this.f6104m == null) {
            this.f6104m = getResources().getString(color.support.p043v7.appcompat.R.string.color_internet_label_apostrophe);
        }
        if (-1 == this.f6099h) {
            this.f6099h = getResources().getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.color_internet_label_button_height);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, color.support.p043v7.appcompat.R.styleable.ColorInternetLabel, i, 0);
        this.f6097f = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.ColorInternetLabel_colorButtonTextSize, getResources().getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.color_internet_lable_textsize));
        this.f6098g = obtainStyledAttributes.getColor(color.support.p043v7.appcompat.R.styleable.ColorInternetLabel_colorButtonTextColor, getResources().getColor(color.support.p043v7.appcompat.R.color.colorHintTextColor));
        this.f6105n = obtainStyledAttributes.getDrawable(color.support.p043v7.appcompat.R.styleable.ColorInternetLabel_colorWhiteButton);
        this.f6100i = this.f6095d - (this.f6094c * 2);
        this.f6101j = this.f6096e - (this.f6094c * 2);
        obtainStyledAttributes.recycle();
        this.f6097f = (int) C1336a.m4370a(this.f6097f, getResources().getConfiguration().fontScale, 4);
        this.f6115z = new C1310a(this);
        this.f6115z.m4289a(this.f6091A);
        C0538w.m1849a(this, this.f6115z);
        C0538w.m1840a((View) this, 1);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        TextPaint textPaint;
        if (this.f6106o != null) {
            if (this.f6109r > 0) {
                this.f6110s = Math.min(this.f6106o.size(), this.f6109r);
            } else if (this.f6106o.size() > this.f6111t) {
                this.f6110s = this.f6111t;
            } else {
                this.f6110s = this.f6106o.size();
            }
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f6110s; i7++) {
                if (this.f6106o.get(i7).intValue() == 0) {
                    i5++;
                }
                if (this.f6106o.get(i7).intValue() == 1) {
                    i6++;
                }
            }
            int i8 = (i5 * 2) + (i6 * 3);
            for (int i9 = 0; i9 < i8 && i8 <= this.f6107p.size(); i9++) {
                String m4860a = this.f6107p.get(i9).m4908d().m4860a();
                textPaint = this.f6107p.get(i9).f6945c;
                if (m4860a == null) {
                    m4860a = null;
                } else if (((int) textPaint.measureText(m4860a)) > this.f6100i) {
                    String str = this.f6104m;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= m4860a.length() - 1) {
                            break;
                        }
                        str = m4860a.substring(0, i10);
                        if (((int) textPaint.measureText(str)) < this.f6100i) {
                            i10++;
                        } else if (i10 > 1) {
                            str = m4860a.substring(0, i10 - 1);
                            textPaint.measureText(str);
                        }
                    }
                    m4860a = str + this.f6104m;
                }
                this.f6107p.get(i9).m4903a(m4860a);
            }
        }
        this.f6103l = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < this.f6110s) {
            int i16 = i13 * (this.f6099h + this.f6093b);
            int i17 = i16 + this.f6099h;
            if (this.f6106o != null && this.f6106o.get(i13).intValue() == 0) {
                int i18 = 0;
                while (i18 < 2) {
                    if (i18 == 0) {
                        i11 = this.f6092a;
                        i12 = this.f6095d + i11;
                    }
                    if (i18 == 1) {
                        int i19 = i12 + this.f6093b;
                        i4 = this.f6112u - this.f6092a;
                        i3 = i19;
                    } else {
                        i3 = i11;
                        i4 = i12;
                    }
                    this.f6105n.setState(this.f6107p.get(this.f6103l).m4907c());
                    m4511a(i3, i16, i4, i17, canvas);
                    i18++;
                    i11 = i3;
                    i12 = i4;
                }
            }
            int i20 = i11;
            int i21 = i12;
            if (this.f6106o != null && this.f6106o.get(i13).intValue() == 1) {
                int i22 = i14;
                int i23 = 0;
                while (i23 < 3) {
                    if (i23 != 2) {
                        i22 = this.f6092a + ((this.f6096e + this.f6093b) * i23);
                        i15 = i22 + this.f6096e;
                    }
                    if (i23 == 2) {
                        i2 = i15 + this.f6093b;
                        i = this.f6112u - this.f6092a;
                    } else {
                        i = i15;
                        i2 = i22;
                    }
                    this.f6105n.setState(this.f6107p.get(this.f6103l).m4907c());
                    m4511a(i2, i16, i, i17, canvas);
                    i23++;
                    i22 = i2;
                    i15 = i;
                }
                i14 = i22;
            }
            i13++;
            i11 = i20;
            i12 = i21;
        }
        m4512a(canvas);
    }

    /* renamed from: a */
    private void m4512a(Canvas canvas) {
        TextPaint textPaint;
        TextPaint textPaint2;
        TextPaint textPaint3;
        TextPaint textPaint4;
        TextPaint textPaint5;
        for (int i = 0; i < this.f6107p.size(); i++) {
            if (this.f6107p.get(i).m4908d().m4861b() == -1) {
                textPaint5 = this.f6107p.get(i).f6945c;
                textPaint5.setColor(this.f6098g);
            } else {
                textPaint = this.f6107p.get(i).f6945c;
                textPaint.setColor(this.f6107p.get(i).m4908d().m4861b());
            }
            textPaint2 = this.f6107p.get(i).f6945c;
            Paint.FontMetricsInt fontMetricsInt = textPaint2.getFontMetricsInt();
            String m4914i = this.f6107p.get(i).m4914i();
            if (m4914i != null) {
                textPaint3 = this.f6107p.get(i).f6945c;
                int m4910e = this.f6107p.get(i).m4910e() + this.f6094c + ((((this.f6107p.get(i).m4911f() - this.f6107p.get(i).m4910e()) - (this.f6094c * 2)) - ((int) textPaint3.measureText(m4914i))) / 2);
                int m4912g = this.f6107p.get(i).m4912g() + (((this.f6099h - (fontMetricsInt.bottom - fontMetricsInt.top)) / 2) - fontMetricsInt.top);
                textPaint4 = this.f6107p.get(i).f6945c;
                canvas.drawText(m4914i, m4910e, m4912g, textPaint4);
            }
        }
    }

    /* renamed from: a */
    private void m4511a(int i, int i2, int i3, int i4, Canvas canvas) {
        this.f6105n.setBounds(i, i2, i3, i4);
        if (this.f6105n != null) {
            this.f6105n.draw(canvas);
        }
        if (this.f6103l < this.f6107p.size()) {
            this.f6107p.get(this.f6103l).m4902a(i);
            this.f6107p.get(this.f6103l).m4906c(i2);
            this.f6107p.get(this.f6103l).m4905b(i3);
            this.f6107p.get(this.f6103l).m4909d(i4);
        }
        this.f6103l++;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0061. Please report as an issue. */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.f6113v = m4508a(x, y);
        if (motionEvent.getPointerId(motionEvent.getActionIndex()) > 0) {
            if (this.f6113v >= 0 && this.f6114w >= 0 && this.f6114w == this.f6113v) {
                z3 = this.f6107p.get(this.f6114w).f6951i;
                if (z3) {
                    if (this.f6108q != null) {
                        this.f6107p.get(this.f6114w);
                    }
                    this.f6107p.get(this.f6114w).m4904b();
                }
            }
            invalidate();
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    this.f6114w = m4508a(x, y);
                    if (-1 == this.f6114w) {
                        return true;
                    }
                    if (this.f6114w >= 0) {
                        this.f6107p.get(this.f6114w).m4901a();
                    }
                    invalidate();
                    return true;
                case 1:
                    if (this.f6114w >= 0) {
                        if (this.f6108q != null) {
                            this.f6107p.get(this.f6114w);
                        }
                        z2 = this.f6107p.get(this.f6114w).f6951i;
                        if (z2) {
                            this.f6107p.get(this.f6114w).m4904b();
                        }
                    }
                    invalidate();
                    return true;
                default:
                    return true;
            }
        }
        if (this.f6114w >= 0) {
            z = this.f6107p.get(this.f6114w).f6951i;
            if (z) {
                this.f6107p.get(this.f6114w).m4904b();
                invalidate();
            }
        }
        return true;
    }

    /* renamed from: a */
    public int m4508a(int i, int i2) {
        int size;
        if (this.f6107p == null || (size = this.f6107p.size()) <= 0) {
            return -1;
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f6107p.get(i3).m4910e() < i && this.f6107p.get(i3).m4911f() > i && this.f6107p.get(i3).m4912g() < i2 && this.f6107p.get(i3).m4913h() > i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6113v = -1;
        this.f6114w = -1;
    }

    public void setItemClickListener(InterfaceC1382ax interfaceC1382ax) {
        this.f6108q = interfaceC1382ax;
    }

    public void setLine(int i) {
        if (i > this.f6111t) {
            i = this.f6111t;
        }
        this.f6109r = i;
    }

    public int getLine() {
        return this.f6110s;
    }

    public void setTitleSize(int i) {
        this.f6102k = i;
    }

    public int getViewHeight() {
        int size;
        if (this.f6109r > 0) {
            size = Math.min(this.f6106o.size(), this.f6109r);
        } else if (this.f6106o.size() > this.f6111t) {
            size = this.f6111t;
        } else {
            size = this.f6106o.size();
        }
        if (size > 0) {
            return (this.f6099h * size) + ((size - 1) * this.f6093b);
        }
        return -1;
    }

    public void setItemButton(ArrayList<C1357a> arrayList) {
        TextPaint textPaint;
        boolean z;
        TextPaint textPaint2;
        this.f6106o = new ArrayList<>();
        if (arrayList != null) {
            this.f6107p = new ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f6107p.add(new C1381aw(this, arrayList.get(i)));
            }
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                int i3 = i2 + 2;
                if (i3 < size) {
                    String str = arrayList.get(i2).m4860a() + arrayList.get(i2 + 1).m4860a() + arrayList.get(i3).m4860a();
                    textPaint = this.f6107p.get(i2).f6945c;
                    if (textPaint.measureText(str) > this.f6101j * 3) {
                        this.f6106o.add(0);
                    } else {
                        int i4 = i2;
                        while (true) {
                            if (i4 > i3) {
                                z = false;
                                break;
                            }
                            textPaint2 = this.f6107p.get(i4).f6945c;
                            if (((int) textPaint2.measureText(arrayList.get(i4).m4860a())) >= this.f6101j) {
                                z = true;
                                break;
                            }
                            i4++;
                        }
                        if (z) {
                            this.f6106o.add(0);
                        } else {
                            this.f6106o.add(1);
                            i2 += 3;
                        }
                    }
                    i2 = i3;
                } else if (i2 + 1 < size) {
                    this.f6106o.add(0);
                }
            }
            arrayList.clear();
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f6115z == null || !this.f6115z.m2082a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public void clearAccessibilityFocus() {
        if (this.f6115z != null) {
            this.f6115z.m4290b();
        }
    }
}
