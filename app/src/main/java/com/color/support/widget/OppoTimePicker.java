package com.color.support.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1338c;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class OppoTimePicker extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ boolean f6746a = !OppoTimePicker.class.desiredAssertionStatus();

    /* renamed from: b */
    private static final InterfaceC1543ga f6747b = new C1537fv();

    /* renamed from: c */
    private final ColorNumberPicker f6748c;

    /* renamed from: d */
    private final ColorNumberPicker f6749d;

    /* renamed from: e */
    private final ColorNumberPicker f6750e;

    /* renamed from: f */
    private final Button f6751f;

    /* renamed from: g */
    private final String[] f6752g;

    /* renamed from: h */
    private boolean f6753h;

    /* renamed from: i */
    private boolean f6754i;

    /* renamed from: j */
    private TextView f6755j;

    /* renamed from: k */
    private TextView f6756k;

    /* renamed from: l */
    private boolean f6757l;

    /* renamed from: m */
    private InterfaceC1543ga f6758m;

    /* renamed from: n */
    private Calendar f6759n;

    /* renamed from: o */
    private Locale f6760o;

    /* renamed from: p */
    private ViewGroup f6761p;

    public OppoTimePicker(Context context) {
        this(context, null);
    }

    public OppoTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.oppoTimePickerStyle);
    }

    public OppoTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6757l = true;
        C1338c.m4375a(this, false);
        setCurrentLocale(Locale.getDefault());
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (!f6746a && layoutInflater == null) {
            throw new AssertionError();
        }
        layoutInflater.inflate(R.layout.oppo_time_picker, (ViewGroup) this, true);
        this.f6755j = (TextView) findViewById(R.id.oppo_timepicker_minute_text);
        this.f6756k = (TextView) findViewById(R.id.oppo_timepicker_hour_text);
        this.f6761p = (ViewGroup) findViewById(R.id.minute_layout);
        this.f6748c = (ColorNumberPicker) findViewById(R.id.hour);
        this.f6748c.m4620a();
        this.f6748c.setOnValueChangedListener(new C1538fw(this));
        this.f6755j.setTextAlignment(5);
        this.f6756k.setTextAlignment(5);
        this.f6749d = (ColorNumberPicker) findViewById(R.id.minute);
        this.f6749d.m4620a();
        this.f6749d.setMinValue(0);
        this.f6749d.setMaxValue(59);
        this.f6749d.setOnLongPressUpdateInterval(100L);
        this.f6749d.setOnValueChangedListener(new C1539fx(this));
        this.f6752g = getContext().getResources().getStringArray(R.array.oppo_time_picker_ampm);
        View findViewById = findViewById(R.id.amPm);
        if (findViewById instanceof Button) {
            this.f6750e = null;
            this.f6751f = (Button) findViewById;
            this.f6751f.setOnClickListener(new ViewOnClickListenerC1540fy(this));
        } else {
            this.f6751f = null;
            this.f6750e = (ColorNumberPicker) findViewById;
            this.f6750e.setMinValue(0);
            this.f6750e.setMaxValue(1);
            this.f6750e.setDisplayedValues(this.f6752g);
            this.f6750e.setOnValueChangedListener(new C1541fz(this));
        }
        m4807a();
        m4810b();
        setOnTimeChangedListener(f6747b);
        setCurrentHour(Integer.valueOf(this.f6759n.get(11)));
        setCurrentMinute(Integer.valueOf(this.f6759n.get(12)));
        if (!isEnabled()) {
            setEnabled(false);
        }
        if (Locale.getDefault().getLanguage().equals("en") && this.f6750e != null) {
            ViewGroup viewGroup = (ViewGroup) this.f6750e.getParent();
            viewGroup.removeView(this.f6750e);
            this.f6750e.setAlignPosition(1);
            viewGroup.addView(this.f6750e);
        }
        if (this.f6748c.m4622b()) {
            String string = context.getResources().getString(R.string.picker_talkback_tip);
            this.f6748c.m4621a(context.getString(R.string.color_hour) + string);
            this.f6749d.m4621a(context.getString(R.string.color_minute) + string);
            if (this.f6750e != null) {
                this.f6750e.m4621a(string);
            }
        }
    }

    public void setTextVisibility(boolean z) {
        if (z) {
            this.f6755j.setVisibility(0);
            this.f6756k.setVisibility(0);
        } else {
            this.f6755j.setVisibility(8);
            this.f6756k.setVisibility(8);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.f6757l == z) {
            return;
        }
        super.setEnabled(z);
        this.f6749d.setEnabled(z);
        this.f6748c.setEnabled(z);
        if (this.f6750e != null) {
            this.f6750e.setEnabled(z);
        } else {
            this.f6751f.setEnabled(z);
        }
        this.f6757l = z;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f6757l;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.f6760o)) {
            return;
        }
        this.f6760o = locale;
        this.f6759n = Calendar.getInstance(locale);
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1544gb();

        /* renamed from: a */
        private final int f6762a;

        /* renamed from: b */
        private final int f6763b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i, int i2, byte b) {
            this(parcelable, i, i2);
        }

        private SavedState(Parcelable parcelable, int i, int i2) {
            super(parcelable);
            this.f6762a = i;
            this.f6763b = i2;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f6762a = parcel.readInt();
            this.f6763b = parcel.readInt();
        }

        /* renamed from: a */
        final int m4815a() {
            return this.f6762a;
        }

        /* renamed from: b */
        final int m4816b() {
            return this.f6763b;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6762a);
            parcel.writeInt(this.f6763b);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getCurrentHour().intValue(), getCurrentMinute().intValue(), (byte) 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentHour(Integer.valueOf(savedState.m4815a()));
        setCurrentMinute(Integer.valueOf(savedState.m4816b()));
    }

    public void setOnTimeChangedListener(InterfaceC1543ga interfaceC1543ga) {
        this.f6758m = interfaceC1543ga;
    }

    public Integer getCurrentHour() {
        int value = this.f6748c.getValue();
        if (this.f6753h) {
            return Integer.valueOf(value);
        }
        if (this.f6754i) {
            return Integer.valueOf(value % 12);
        }
        return Integer.valueOf((value % 12) + 12);
    }

    public void setCurrentHour(Integer num) {
        if (num == null || num == getCurrentHour()) {
            return;
        }
        if (!this.f6753h) {
            if (num.intValue() >= 12) {
                this.f6754i = false;
                if (num.intValue() > 12) {
                    num = Integer.valueOf(num.intValue() - 12);
                }
            } else {
                this.f6754i = true;
                if (num.intValue() == 0) {
                    num = 12;
                }
            }
            m4810b();
        }
        this.f6748c.setValue(num.intValue());
        m4814d();
    }

    public void setIs24HourView(Boolean bool) {
        if (this.f6753h == bool.booleanValue()) {
            return;
        }
        int intValue = getCurrentHour().intValue();
        this.f6753h = bool.booleanValue();
        m4807a();
        setCurrentHour(Integer.valueOf(intValue));
        m4810b();
        this.f6748c.requestLayout();
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.f6749d.getValue());
    }

    public void setCurrentMinute(Integer num) {
        if (num.equals(getCurrentMinute())) {
            return;
        }
        this.f6749d.setValue(num.intValue());
        m4814d();
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f6748c.getBaseline();
    }

    public boolean isLayoutRtl() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    /* renamed from: c */
    private void m4812c() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6748c.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f6761p.getLayoutParams();
        if (this.f6753h) {
            if (!isLayoutRtl()) {
                layoutParams.weight = 1.0f;
                layoutParams2.weight = 1.0f;
            }
            this.f6748c.setLayoutParams(layoutParams);
            this.f6761p.setLayoutParams(layoutParams2);
            return;
        }
        if (Locale.getDefault().getLanguage().equals("en")) {
            layoutParams.weight = 1.0f;
            layoutParams2.weight = 0.0f;
        } else {
            layoutParams.weight = 0.0f;
            if (this.f6753h && !isLayoutRtl()) {
                layoutParams2.weight = 1.0f;
            }
        }
        this.f6748c.setLayoutParams(layoutParams);
        this.f6761p.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m4814d() {
        if (this.f6758m != null) {
            getCurrentHour().intValue();
            getCurrentMinute().intValue();
        }
    }

    public void setRowNumber(int i) {
        if (i <= 0 || this.f6748c == null || this.f6749d == null || this.f6750e == null) {
            return;
        }
        this.f6748c.setPickerRowNumber(i);
        this.f6749d.setPickerRowNumber(i);
        this.f6750e.setPickerRowNumber(i);
    }

    /* renamed from: a */
    private void m4807a() {
        if (this.f6753h) {
            this.f6748c.setMinValue(0);
            this.f6748c.setMaxValue(23);
        } else {
            this.f6748c.setMinValue(1);
            this.f6748c.setMaxValue(12);
        }
        this.f6748c.setWrapSelectorWheel(true);
        this.f6749d.setWrapSelectorWheel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4810b() {
        if (this.f6753h) {
            if (this.f6750e != null) {
                this.f6750e.setVisibility(8);
                m4812c();
            } else {
                this.f6751f.setVisibility(8);
            }
        } else {
            int i = !this.f6754i ? 1 : 0;
            if (this.f6750e != null) {
                this.f6750e.setValue(i);
                this.f6750e.setVisibility(0);
                m4812c();
            } else {
                this.f6751f.setText(this.f6752g[i]);
                this.f6751f.setVisibility(0);
            }
        }
        m4812c();
    }
}
