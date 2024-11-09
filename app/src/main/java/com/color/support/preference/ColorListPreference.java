package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorListPreference extends ListPreference {

    /* renamed from: a */
    Context f5726a;

    /* renamed from: b */
    CharSequence f5727b;

    /* renamed from: c */
    CharSequence f5728c;

    /* renamed from: d */
    CharSequence f5729d;

    /* renamed from: e */
    Drawable f5730e;

    /* renamed from: f */
    private CharSequence f5731f;

    public ColorListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5726a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorJumpPreference, 0, 0);
        this.f5730e = obtainStyledAttributes.getDrawable(R.styleable.ColorJumpPreference_color_jump_mark);
        this.f5727b = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status1);
        this.f5728c = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status2);
        this.f5729d = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status3);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPreference, 0, 0);
        this.f5731f = obtainStyledAttributes2.getText(R.styleable.ColorPreference_colorAssignment);
        obtainStyledAttributes2.recycle();
    }
}
