package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1344i;

/* loaded from: classes.dex */
public class ColorRoundImageView extends ImageView {

    /* renamed from: A */
    private Drawable f6406A;

    /* renamed from: B */
    private Bitmap f6407B;

    /* renamed from: C */
    private float f6408C;

    /* renamed from: D */
    private int f6409D;

    /* renamed from: E */
    private Paint f6410E;

    /* renamed from: a */
    private final RectF f6411a;

    /* renamed from: b */
    private final RectF f6412b;

    /* renamed from: c */
    private int f6413c;

    /* renamed from: d */
    private Context f6414d;

    /* renamed from: e */
    private boolean f6415e;

    /* renamed from: f */
    private boolean f6416f;

    /* renamed from: g */
    private int f6417g;

    /* renamed from: h */
    private RectF f6418h;

    /* renamed from: i */
    private RectF f6419i;

    /* renamed from: j */
    private Drawable f6420j;

    /* renamed from: k */
    private Drawable f6421k;

    /* renamed from: l */
    private Bitmap f6422l;

    /* renamed from: m */
    private int f6423m;

    /* renamed from: n */
    private int f6424n;

    /* renamed from: o */
    private int f6425o;

    /* renamed from: p */
    private int f6426p;

    /* renamed from: q */
    private BitmapShader f6427q;

    /* renamed from: r */
    private int f6428r;

    /* renamed from: s */
    private int f6429s;

    /* renamed from: t */
    private int f6430t;

    /* renamed from: u */
    private Paint f6431u;

    /* renamed from: v */
    private Paint f6432v;

    /* renamed from: w */
    private Matrix f6433w;

    /* renamed from: x */
    private BitmapShader f6434x;

    /* renamed from: y */
    private int f6435y;

    /* renamed from: z */
    private float f6436z;

    public ColorRoundImageView(Context context) {
        super(context);
        this.f6411a = new RectF();
        this.f6412b = new RectF();
        this.f6433w = new Matrix();
        this.f6414d = context;
        this.f6431u = new Paint();
        this.f6431u.setAntiAlias(true);
        m4664a();
        this.f6432v = new Paint();
        this.f6432v.setAntiAlias(true);
        this.f6432v.setColor(getResources().getColor(R.color.color_roundimageview_outcircle_color));
        this.f6432v.setStrokeWidth(1.0f);
        this.f6432v.setStyle(Paint.Style.STROKE);
        this.f6413c = 0;
        this.f6435y = getResources().getDimensionPixelSize(R.dimen.color_roundimageview_default_radius);
        setupShader(getDrawable());
    }

    /* renamed from: a */
    private void m4664a() {
        this.f6410E = new Paint();
        this.f6410E.setStrokeWidth(2.0f);
        this.f6410E.setStyle(Paint.Style.STROKE);
        this.f6410E.setAntiAlias(true);
        this.f6410E.setColor(getResources().getColor(R.color.color_border));
    }

    public ColorRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6411a = new RectF();
        this.f6412b = new RectF();
        this.f6433w = new Matrix();
        this.f6414d = context;
        this.f6431u = new Paint();
        this.f6431u.setAntiAlias(true);
        this.f6431u.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        m4664a();
        this.f6432v = new Paint();
        this.f6432v.setAntiAlias(true);
        this.f6432v.setStrokeWidth(2.0f);
        this.f6432v.setStyle(Paint.Style.STROKE);
        this.f6421k = context.getResources().getDrawable(R.drawable.color_round_image_view_shadow);
        this.f6423m = this.f6421k.getIntrinsicWidth();
        this.f6424n = this.f6421k.getIntrinsicHeight();
        this.f6425o = (int) context.getResources().getDimension(R.dimen.color_roundimageView_src_width);
        this.f6426p = this.f6425o;
        this.f6432v.setColor(getResources().getColor(R.color.color_roundimageview_outcircle_color));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorRoundImageView);
        this.f6417g = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorRoundImageView_colorBorderRadius, (int) TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        this.f6413c = obtainStyledAttributes.getInt(R.styleable.ColorRoundImageView_colorType, 0);
        this.f6415e = obtainStyledAttributes.getBoolean(R.styleable.ColorRoundImageView_colorHasBorder, false);
        this.f6416f = obtainStyledAttributes.getBoolean(R.styleable.ColorRoundImageView_colorHasDefaultPic, true);
        m4665b();
        setupShader(getDrawable());
        obtainStyledAttributes.recycle();
    }

    public ColorRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6411a = new RectF();
        this.f6412b = new RectF();
        m4665b();
    }

    /* renamed from: b */
    private void m4665b() {
        this.f6412b.set(0.0f, 0.0f, this.f6423m, this.f6424n);
        this.f6430t = this.f6423m - this.f6425o;
        this.f6411a.set(this.f6412b);
        this.f6411a.inset(this.f6430t / 2, this.f6430t / 2);
    }

    public void setHasBorder(boolean z) {
        this.f6415e = z;
    }

    public void setHasDefaultPic(boolean z) {
        this.f6416f = z;
    }

    public void setBorderRectRadius(int i) {
        this.f6417g = i;
        invalidate();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onDraw(android.graphics.Canvas r6) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.ColorRoundImageView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f6413c == 1 || this.f6413c == 2) {
            this.f6418h = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            this.f6419i = new RectF(1.0f, 1.0f, getWidth() - 1.0f, getHeight() - 1.0f);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6413c == 0) {
            int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
            if (min == 0) {
                min = this.f6435y;
            }
            this.f6435y = min;
            this.f6436z = this.f6435y / 2.0f;
            setMeasuredDimension(this.f6435y, this.f6435y);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setupShader(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        setupShader(this.f6414d.getResources().getDrawable(i));
    }

    private void setupShader(Drawable drawable) {
        Bitmap bitmap;
        this.f6406A = getDrawable();
        if (this.f6406A == null || drawable == null) {
            if (this.f6420j != null || !this.f6416f) {
                return;
            }
            this.f6406A = getResources().getDrawable(R.drawable.color_ic_contact_picture);
            this.f6420j = getResources().getDrawable(R.drawable.color_ic_contact_picture);
        } else if (this.f6406A != drawable) {
            this.f6406A = drawable;
        }
        this.f6428r = this.f6406A.getIntrinsicWidth();
        this.f6429s = this.f6406A.getIntrinsicHeight();
        Drawable drawable2 = this.f6406A;
        if (drawable2 instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable2).getBitmap();
        } else {
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable2.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable2.draw(canvas);
            bitmap = createBitmap;
        }
        this.f6407B = bitmap;
        if (this.f6413c == 2) {
            this.f6433w.reset();
            float f = (float) ((this.f6425o * 1.0d) / this.f6428r);
            float f2 = (float) ((this.f6426p * 1.0d) / this.f6429s);
            if (f <= 1.0f) {
                f = 1.0f;
            }
            if (f2 <= 1.0f) {
                f2 = 1.0f;
            }
            float max = Math.max(f, f2);
            float f3 = (this.f6425o - (this.f6428r * max)) * 0.5f;
            float f4 = (this.f6426p - (this.f6429s * max)) * 0.5f;
            this.f6433w.setScale(max, max);
            this.f6433w.postTranslate(((int) (f3 + 0.5f)) + (this.f6430t / 2), ((int) (f4 + 0.5f)) + (this.f6430t / 2));
            Bitmap bitmap2 = this.f6407B;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f6427q = new BitmapShader(bitmap2, tileMode, tileMode);
            this.f6427q.setLocalMatrix(this.f6433w);
            this.f6431u.setShader(this.f6427q);
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f6423m, this.f6424n, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            this.f6417g = this.f6425o / 2;
            canvas2.drawPath(C1344i.m4397a().m4400a(this.f6411a, this.f6417g), this.f6431u);
            this.f6421k.setBounds(0, 0, this.f6423m, this.f6424n);
            this.f6421k.draw(canvas2);
            this.f6422l = createBitmap2;
            Bitmap bitmap3 = this.f6422l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            this.f6427q = new BitmapShader(bitmap3, tileMode2, tileMode2);
        }
        if (this.f6407B != null) {
            Bitmap bitmap4 = this.f6407B;
            Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
            this.f6434x = new BitmapShader(bitmap4, tileMode3, tileMode3);
        }
    }

    public void setType(int i) {
        if (this.f6413c != i) {
            this.f6413c = i;
            invalidate();
        }
    }
}
