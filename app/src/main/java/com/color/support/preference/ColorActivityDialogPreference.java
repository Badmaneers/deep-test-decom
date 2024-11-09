package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorActivityDialogPreference extends ListPreference {

    /* renamed from: a */
    Context f5694a;

    /* renamed from: b */
    CharSequence f5695b;

    /* renamed from: c */
    CharSequence f5696c;

    /* renamed from: d */
    CharSequence f5697d;

    /* renamed from: e */
    Drawable f5698e;

    /* renamed from: f */
    private boolean f5699f;

    /* renamed from: g */
    private CharSequence f5700g;

    private ColorActivityDialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f5699f = true;
        this.f5694a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorJumpPreference, i, 0);
        this.f5698e = obtainStyledAttributes.getDrawable(R.styleable.ColorJumpPreference_color_jump_mark);
        this.f5695b = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status1);
        this.f5696c = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status2);
        this.f5697d = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status3);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPreference, i, 0);
        this.f5699f = obtainStyledAttributes2.getBoolean(R.styleable.ColorPreference_colorShowDivider, this.f5699f);
        this.f5700g = obtainStyledAttributes2.getText(R.styleable.ColorPreference_colorAssignment);
        obtainStyledAttributes2.recycle();
    }

    private ColorActivityDialogPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public ColorActivityDialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorActivityDialogPreferenceStyle, (byte) 0);
    }
}
