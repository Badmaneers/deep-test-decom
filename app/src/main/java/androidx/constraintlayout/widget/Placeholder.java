package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: a */
    private int f1894a;

    /* renamed from: b */
    private View f1895b;

    /* renamed from: c */
    private int f1896c;

    public Placeholder(Context context) {
        super(context);
        this.f1894a = -1;
        this.f1895b = null;
        this.f1896c = 4;
        m1368a((AttributeSet) null);
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1894a = -1;
        this.f1895b = null;
        this.f1896c = 4;
        m1368a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1894a = -1;
        this.f1895b = null;
        this.f1896c = 4;
        m1368a(attributeSet);
    }

    /* renamed from: a */
    private void m1368a(AttributeSet attributeSet) {
        super.setVisibility(this.f1896c);
        this.f1894a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_placeholder_content) {
                    this.f1894a = obtainStyledAttributes.getResourceId(index, this.f1894a);
                } else if (index == R.styleable.ConstraintLayout_placeholder_emptyVisibility) {
                    this.f1896c = obtainStyledAttributes.getInt(index, this.f1896c);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1896c = i;
    }

    public int getEmptyVisibility() {
        return this.f1896c;
    }

    public View getContent() {
        return this.f1895b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, "?".length(), rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    /* renamed from: a */
    public final void m1370a(ConstraintLayout constraintLayout) {
        if (this.f1894a == -1 && !isInEditMode()) {
            setVisibility(this.f1896c);
        }
        this.f1895b = constraintLayout.findViewById(this.f1894a);
        if (this.f1895b != null) {
            ((C0384a) this.f1895b.getLayoutParams()).f1924aa = true;
            this.f1895b.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f1894a == i) {
            return;
        }
        if (this.f1895b != null) {
            this.f1895b.setVisibility(0);
            ((C0384a) this.f1895b.getLayoutParams()).f1924aa = false;
            this.f1895b = null;
        }
        this.f1894a = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    /* renamed from: a */
    public final void m1369a() {
        if (this.f1895b == null) {
            return;
        }
        C0384a c0384a = (C0384a) getLayoutParams();
        C0384a c0384a2 = (C0384a) this.f1895b.getLayoutParams();
        c0384a2.f1935al.m1212e(0);
        c0384a.f1935al.m1222i(c0384a2.f1935al.m1233o());
        c0384a.f1935al.m1224j(c0384a2.f1935al.m1237q());
        c0384a2.f1935al.m1212e(8);
    }
}
