package com.google.android.material.p079h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.p020a.C0431k;
import com.google.android.material.R;

/* compiled from: TextAppearance.java */
/* renamed from: com.google.android.material.h.e */
/* loaded from: classes.dex */
public final class C2222e {

    /* renamed from: a */
    public final float f9819a;

    /* renamed from: b */
    public final ColorStateList f9820b;

    /* renamed from: c */
    public final ColorStateList f9821c;

    /* renamed from: d */
    public final ColorStateList f9822d;

    /* renamed from: e */
    public final int f9823e;

    /* renamed from: f */
    public final int f9824f;

    /* renamed from: g */
    public final String f9825g;

    /* renamed from: h */
    public final boolean f9826h;

    /* renamed from: i */
    public final ColorStateList f9827i;

    /* renamed from: j */
    public final float f9828j;

    /* renamed from: k */
    public final float f9829k;

    /* renamed from: l */
    public final float f9830l;

    /* renamed from: m */
    private final int f9831m;

    /* renamed from: n */
    private boolean f9832n = false;

    /* renamed from: o */
    private Typeface f9833o;

    /* renamed from: a */
    public static /* synthetic */ boolean m7052a(C2222e c2222e) {
        c2222e.f9832n = true;
        return true;
    }

    public C2222e(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.TextAppearance);
        this.f9819a = obtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f);
        this.f9820b = C2221d.m7045a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColor);
        this.f9821c = C2221d.m7045a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
        this.f9822d = C2221d.m7045a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
        this.f9823e = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.f9824f = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int i2 = R.styleable.TextAppearance_fontFamily;
        i2 = obtainStyledAttributes.hasValue(i2) ? i2 : R.styleable.TextAppearance_android_fontFamily;
        this.f9831m = obtainStyledAttributes.getResourceId(i2, 0);
        this.f9825g = obtainStyledAttributes.getString(i2);
        this.f9826h = obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.f9827i = C2221d.m7045a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
        this.f9828j = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f9829k = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f9830l = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private Typeface m7050a(Context context) {
        if (this.f9832n) {
            return this.f9833o;
        }
        if (!context.isRestricted()) {
            try {
                this.f9833o = C0431k.m1525a(context, this.f9831m);
                if (this.f9833o != null) {
                    this.f9833o = Typeface.create(this.f9833o, this.f9823e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f9825g, e);
            }
        }
        m7054b();
        this.f9832n = true;
        return this.f9833o;
    }

    /* renamed from: a */
    public final void m7058a(Context context, AbstractC2226i abstractC2226i) {
        if (C2225h.m7061a()) {
            m7050a(context);
        } else {
            m7054b();
        }
        if (this.f9831m == 0) {
            this.f9832n = true;
        }
        if (this.f9832n) {
            abstractC2226i.mo6647a(this.f9833o, true);
            return;
        }
        try {
            C0431k.m1530a(context, this.f9831m, new C2223f(this, abstractC2226i));
        } catch (Resources.NotFoundException unused) {
            this.f9832n = true;
            abstractC2226i.mo6646a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f9825g, e);
            this.f9832n = true;
            abstractC2226i.mo6646a(-3);
        }
    }

    /* renamed from: c */
    private void m7055c(Context context, TextPaint textPaint, AbstractC2226i abstractC2226i) {
        m7059a(textPaint, m7056a());
        m7058a(context, new C2224g(this, textPaint, abstractC2226i));
    }

    /* renamed from: a */
    public final Typeface m7056a() {
        m7054b();
        return this.f9833o;
    }

    /* renamed from: b */
    private void m7054b() {
        if (this.f9833o == null && this.f9825g != null) {
            this.f9833o = Typeface.create(this.f9825g, this.f9823e);
        }
        if (this.f9833o == null) {
            switch (this.f9824f) {
                case 1:
                    this.f9833o = Typeface.SANS_SERIF;
                    break;
                case 2:
                    this.f9833o = Typeface.SERIF;
                    break;
                case 3:
                    this.f9833o = Typeface.MONOSPACE;
                    break;
                default:
                    this.f9833o = Typeface.DEFAULT;
                    break;
            }
            this.f9833o = Typeface.create(this.f9833o, this.f9823e);
        }
    }

    /* renamed from: a */
    public final void m7057a(Context context, TextPaint textPaint, AbstractC2226i abstractC2226i) {
        m7060b(context, textPaint, abstractC2226i);
        textPaint.setColor(this.f9820b != null ? this.f9820b.getColorForState(textPaint.drawableState, this.f9820b.getDefaultColor()) : -16777216);
        textPaint.setShadowLayer(this.f9830l, this.f9828j, this.f9829k, this.f9827i != null ? this.f9827i.getColorForState(textPaint.drawableState, this.f9827i.getDefaultColor()) : 0);
    }

    /* renamed from: b */
    public final void m7060b(Context context, TextPaint textPaint, AbstractC2226i abstractC2226i) {
        if (C2225h.m7061a()) {
            m7059a(textPaint, m7050a(context));
        } else {
            m7055c(context, textPaint, abstractC2226i);
        }
    }

    /* renamed from: a */
    public final void m7059a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f9823e;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f9819a);
    }
}
