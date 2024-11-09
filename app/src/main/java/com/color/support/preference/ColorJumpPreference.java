package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorJumpPreference extends ColorPreference {

    /* renamed from: a */
    Context f5720a;

    /* renamed from: b */
    CharSequence f5721b;

    /* renamed from: c */
    CharSequence f5722c;

    /* renamed from: d */
    CharSequence f5723d;

    /* renamed from: e */
    Drawable f5724e;

    /* renamed from: f */
    private int f5725f;

    private ColorJumpPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5725f = 0;
        this.f5720a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorJumpPreference, i, 0);
        this.f5724e = obtainStyledAttributes.getDrawable(R.styleable.ColorJumpPreference_color_jump_mark);
        this.f5721b = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status1);
        this.f5722c = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status2);
        this.f5723d = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status3);
        this.f5725f = obtainStyledAttributes.getInt(R.styleable.ColorJumpPreference_colorClickStyle, 0);
        obtainStyledAttributes.recycle();
    }

    private ColorJumpPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public ColorJumpPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorJumpPreferenceStyle, (byte) 0);
    }
}
