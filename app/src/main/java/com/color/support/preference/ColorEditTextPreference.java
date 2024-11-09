package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorEditTextPreference extends EditTextPreference {

    /* renamed from: a */
    private Context f5701a;

    /* renamed from: b */
    private CharSequence f5702b;

    /* renamed from: c */
    private CharSequence f5703c;

    /* renamed from: d */
    private CharSequence f5704d;

    /* renamed from: e */
    private Drawable f5705e;

    /* renamed from: f */
    private boolean f5706f;

    /* renamed from: g */
    private Drawable f5707g;

    /* renamed from: h */
    private CharSequence f5708h;

    public ColorEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5706f = true;
        this.f5701a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorJumpPreference, 0, 0);
        this.f5705e = obtainStyledAttributes.getDrawable(R.styleable.ColorJumpPreference_color_jump_mark);
        this.f5702b = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status1);
        this.f5703c = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status2);
        this.f5704d = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status3);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPreference, 0, 0);
        this.f5706f = obtainStyledAttributes2.getBoolean(R.styleable.ColorPreference_colorShowDivider, this.f5706f);
        this.f5707g = obtainStyledAttributes2.getDrawable(R.styleable.ColorPreference_colorDividerDrawable);
        this.f5708h = obtainStyledAttributes2.getText(R.styleable.ColorPreference_colorAssignment);
        obtainStyledAttributes2.recycle();
    }
}
