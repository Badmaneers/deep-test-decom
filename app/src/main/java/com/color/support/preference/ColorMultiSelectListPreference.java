package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.MultiSelectListPreference;
import color.support.p043v7.appcompat.R;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class ColorMultiSelectListPreference extends MultiSelectListPreference {

    /* renamed from: a */
    Context f5741a;

    /* renamed from: b */
    CharSequence f5742b;

    /* renamed from: c */
    CharSequence f5743c;

    /* renamed from: d */
    CharSequence f5744d;

    /* renamed from: e */
    Drawable f5745e;

    /* renamed from: f */
    private Set<String> f5746f;

    /* renamed from: g */
    private CharSequence f5747g;

    public ColorMultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5746f = new HashSet();
        this.f5741a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorJumpPreference, 0, 0);
        this.f5745e = obtainStyledAttributes.getDrawable(R.styleable.ColorJumpPreference_color_jump_mark);
        this.f5742b = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status1);
        this.f5743c = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status2);
        this.f5744d = obtainStyledAttributes.getText(R.styleable.ColorJumpPreference_color_jump_status3);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPreference, 0, 0);
        this.f5747g = obtainStyledAttributes2.getText(R.styleable.ColorPreference_colorAssignment);
        obtainStyledAttributes2.recycle();
    }
}
