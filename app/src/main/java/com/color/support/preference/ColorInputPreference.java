package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import android.text.TextUtils;
import android.util.AttributeSet;
import color.support.p043v7.appcompat.R;
import com.color.support.view.ColorScrolledEditText;
import com.color.support.widget.ColorEditText;

/* loaded from: classes.dex */
public class ColorInputPreference extends ColorPreference {

    /* renamed from: a */
    private ColorEditText f5709a;

    /* renamed from: b */
    private CharSequence f5710b;

    /* renamed from: c */
    private CharSequence f5711c;

    /* renamed from: d */
    private Context f5712d;

    /* renamed from: e */
    private boolean f5713e;

    /* renamed from: f */
    private int f5714f;

    /* renamed from: g */
    private int f5715g;

    /* renamed from: h */
    private int f5716h;

    /* renamed from: i */
    private int f5717i;

    /* renamed from: j */
    private int f5718j;

    public ColorInputPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorInputPreferenceStyle);
    }

    private ColorInputPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private ColorInputPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i);
        this.f5712d = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorInputPreference, i, 0);
        this.f5710b = obtainStyledAttributes.getText(R.styleable.ColorInputPreference_colorContent);
        this.f5711c = obtainStyledAttributes.getText(R.styleable.ColorInputPreference_colorHint);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.Preference, i, 0);
        this.f5713e = obtainStyledAttributes2.getText(R.styleable.Preference_android_title) != null;
        obtainStyledAttributes2.recycle();
        this.f5714f = context.getResources().getDimensionPixelSize(R.dimen.color_input_edit_text_has_title_padding_top);
        this.f5715g = context.getResources().getDimensionPixelSize(R.dimen.color_input_edit_text_has_title_padding_bottom);
        this.f5716h = context.getResources().getDimensionPixelSize(R.dimen.color_input_edit_text_no_title_padding_top);
        this.f5717i = context.getResources().getDimensionPixelOffset(R.dimen.color_input_edit_text_no_title_padding_bottom);
        this.f5718j = context.getResources().getDimensionPixelOffset(R.dimen.color_input_preference_padding_end);
        this.f5709a = new ColorScrolledEditText(context, attributeSet);
        this.f5709a.setId(android.R.id.input);
        this.f5709a.setBackgroundResource(0);
        this.f5709a.setMaxLines(5);
        this.f5709a.setFastDeletable(true);
        this.f5709a.setVerticalScrollBarEnabled(false);
        this.f5709a.setLineSpacing(0.0f, 1.1f);
        this.f5709a.setGravity(8388627);
        this.f5709a.setTextSize(0, this.f5712d.getResources().getDimensionPixelSize(R.dimen.color_input_preference_text_size));
        if (this.f5713e) {
            this.f5709a.setTextColor(this.f5712d.getResources().getColor(R.color.color_preference_secondary_text_color_normal));
            this.f5709a.setPaddingRelative(0, this.f5714f, this.f5718j, this.f5715g);
        } else {
            this.f5709a.setPaddingRelative(0, this.f5716h, this.f5718j, this.f5717i);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: a */
    protected final Object mo2694a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    /* renamed from: d */
    public final boolean mo2696d() {
        return TextUtils.isEmpty(this.f5710b) || super.mo2696d();
    }

    /* loaded from: classes.dex */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1331a();

        /* renamed from: a */
        String f5719a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5719a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f5719a);
        }
    }
}
