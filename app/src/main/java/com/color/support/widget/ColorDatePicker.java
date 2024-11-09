package com.color.support.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CalendarView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import color.support.p043v7.appcompat.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class ColorDatePicker extends FrameLayout {

    /* renamed from: a */
    private static final String f5950a = "ColorDatePicker";

    /* renamed from: b */
    private static char[] f5951b = {'d', 'M', 'y'};

    /* renamed from: c */
    private final LinearLayout f5952c;

    /* renamed from: d */
    private final ColorNumberPicker f5953d;

    /* renamed from: e */
    private final ColorNumberPicker f5954e;

    /* renamed from: f */
    private final ColorNumberPicker f5955f;

    /* renamed from: g */
    private final DateFormat f5956g;

    /* renamed from: h */
    private Context f5957h;

    /* renamed from: i */
    private Locale f5958i;

    /* renamed from: j */
    private InterfaceC1567n f5959j;

    /* renamed from: k */
    private String[] f5960k;

    /* renamed from: l */
    private int f5961l;

    /* renamed from: m */
    private C1566m f5962m;

    /* renamed from: n */
    private Calendar f5963n;

    /* renamed from: o */
    private Calendar f5964o;

    /* renamed from: p */
    private C1566m f5965p;

    /* renamed from: q */
    private boolean f5966q;

    /* renamed from: r */
    private C1565l f5967r;

    /* renamed from: s */
    private C1565l f5968s;

    /* renamed from: t */
    private C1565l f5969t;

    /* renamed from: u */
    private int f5970u;

    /* renamed from: v */
    private int f5971v;

    /* renamed from: w */
    private boolean f5972w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m4440a() {
    }

    public CalendarView getCalendarView() {
        return null;
    }

    public boolean getCalendarViewShown() {
        return false;
    }

    public void setCalendarViewShown(boolean z) {
    }

    public ColorDatePicker(Context context) {
        this(context, null);
    }

    public ColorDatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.oppoDatePickerStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0152, code lost:            if (m4443a(r6, r14) == false) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0129, code lost:            if (m4443a(r5, r14) == false) goto L11;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ColorDatePicker(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.ColorDatePicker.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public long getMinDate() {
        return this.f5963n.getTimeInMillis();
    }

    public void setMinDate(long j) {
        this.f5962m.m5280a(j);
        if (this.f5962m.m5276a(1) != this.f5963n.get(1) || this.f5962m.m5276a(6) == this.f5963n.get(6)) {
            this.f5963n.setTimeInMillis(j);
            if (this.f5965p.m5283a(this.f5963n)) {
                this.f5965p.m5280a(this.f5963n.getTimeInMillis());
            }
            m4451e();
        }
    }

    public long getMaxDate() {
        return this.f5964o.getTimeInMillis();
    }

    public void setMaxDate(long j) {
        this.f5962m.m5280a(j);
        if (this.f5962m.m5276a(1) != this.f5964o.get(1) || this.f5962m.m5276a(6) == this.f5964o.get(6)) {
            this.f5964o.setTimeInMillis(j);
            if (this.f5965p.m5286b(this.f5964o)) {
                this.f5965p.m5280a(this.f5964o.getTimeInMillis());
            }
            m4451e();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackground(int i) {
        setBackgroundDrawable(getContext().getResources().getDrawable(i));
    }

    public void setNormalColor(int i) {
        this.f5970u = i;
        m4445b();
    }

    public void setFocusColor(int i) {
        this.f5971v = i;
        m4445b();
    }

    /* renamed from: b */
    private void m4445b() {
        if (this.f5970u != -1) {
            this.f5953d.setPickerNormalColor(this.f5970u);
            this.f5954e.setPickerNormalColor(this.f5970u);
            this.f5955f.setPickerNormalColor(this.f5970u);
        }
        if (this.f5971v != -1) {
            this.f5953d.setPickerFocusColor(this.f5971v);
            this.f5954e.setPickerFocusColor(this.f5971v);
            this.f5955f.setPickerFocusColor(this.f5971v);
        }
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f5966q;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.f5966q == z) {
            return;
        }
        super.setEnabled(z);
        this.f5953d.setEnabled(z);
        this.f5954e.setEnabled(z);
        this.f5955f.setEnabled(z);
        this.f5966q = z;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean z;
        Calendar calendar;
        String formatDateTime;
        Calendar calendar2;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        z = this.f5965p.f7443b;
        if (!z) {
            Context context = this.f5957h;
            calendar2 = this.f5965p.f7442a;
            formatDateTime = DateUtils.formatDateTime(context, calendar2.getTimeInMillis(), 20);
        } else {
            Context context2 = this.f5957h;
            calendar = this.f5965p.f7442a;
            formatDateTime = DateUtils.formatDateTime(context2, calendar.getTimeInMillis(), 24);
        }
        accessibilityEvent.getText().add(formatDateTime);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    public boolean getSpinnersShown() {
        return this.f5952c.isShown();
    }

    public void setSpinnersShown(boolean z) {
        this.f5952c.setVisibility(z ? 0 : 8);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.f5958i)) {
            return;
        }
        this.f5958i = locale;
        this.f5962m = m4438a(this.f5962m, locale);
        this.f5963n = m4439a(this.f5963n, locale);
        this.f5964o = m4439a(this.f5964o, locale);
        this.f5965p = m4438a(this.f5965p, locale);
        this.f5961l = this.f5962m.m5287c(2) + 1;
        this.f5960k = new String[this.f5961l];
    }

    /* renamed from: a */
    private static C1566m m4438a(C1566m c1566m, Locale locale) {
        boolean z;
        if (c1566m == null) {
            return new C1566m(locale);
        }
        C1566m c1566m2 = new C1566m(locale);
        z = c1566m.f7443b;
        if (!z) {
            c1566m2.m5280a(c1566m.m5277a());
        } else {
            c1566m2.m5281a(c1566m);
        }
        return c1566m2;
    }

    /* renamed from: a */
    private static Calendar m4439a(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    /* renamed from: c */
    private void m4447c() {
        int length = android.text.format.DateFormat.getDateFormatOrder(getContext()).length;
        if (Locale.getDefault().getLanguage().equals("en")) {
            char[] cArr = f5951b;
            this.f5952c.removeAllViews();
            for (int i = 0; i < length; i++) {
                char c = cArr[i];
                if (c == 'M') {
                    this.f5952c.addView(this.f5954e);
                } else if (c == 'd') {
                    this.f5952c.addView(this.f5953d);
                    this.f5953d.setAlignPosition(2);
                } else if (c == 'y') {
                    this.f5952c.addView(this.f5955f);
                    this.f5955f.setAlignPosition(1);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getYear(), getMonth(), getDayOfMonth(), (byte) 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        m4441a(savedState.f5973a, savedState.f5974b, savedState.f5975c);
        m4451e();
    }

    /* renamed from: a */
    private boolean m4443a(String str, Calendar calendar) {
        try {
            calendar.setTime(this.f5956g.parse(str));
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m4441a(int i, int i2, int i3) {
        this.f5965p.m5279a(i, i2, i3);
        m4449d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(C1566m c1566m) {
        this.f5965p.m5281a(c1566m);
        m4449d();
    }

    /* renamed from: d */
    private void m4449d() {
        this.f5965p.m5282a(this.f5963n, this.f5964o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m4451e() {
        this.f5954e.setFormatter(this.f5968s);
        if (this.f5965p.m5276a(1) == this.f5963n.get(1) && this.f5965p.m5276a(1) != this.f5964o.get(1)) {
            this.f5954e.setMinValue(this.f5963n.get(2));
            this.f5954e.setMaxValue(this.f5963n.getActualMaximum(2));
            this.f5954e.setWrapSelectorWheel(this.f5963n.get(2) == 0);
        } else if (this.f5965p.m5276a(1) != this.f5963n.get(1) && this.f5965p.m5276a(1) == this.f5964o.get(1)) {
            this.f5954e.setMinValue(0);
            this.f5954e.setMaxValue(this.f5964o.get(2));
            this.f5954e.setWrapSelectorWheel(this.f5964o.get(2) == this.f5964o.getActualMaximum(2));
        } else if (this.f5965p.m5276a(1) == this.f5963n.get(1) && this.f5965p.m5276a(1) == this.f5964o.get(1)) {
            this.f5954e.setMinValue(this.f5963n.get(2));
            this.f5954e.setMaxValue(this.f5964o.get(2));
            this.f5954e.setWrapSelectorWheel(this.f5964o.get(2) == this.f5964o.getActualMaximum(2) && this.f5963n.get(2) == 0);
        } else {
            this.f5954e.setMinValue(this.f5965p.m5284b(2));
            this.f5954e.setMaxValue(this.f5965p.m5287c(2));
            this.f5954e.setWrapSelectorWheel(true);
        }
        if (this.f5965p.m5276a(1) == this.f5963n.get(1) && this.f5965p.m5276a(2) == this.f5963n.get(2) && (this.f5965p.m5276a(1) != this.f5964o.get(1) || this.f5965p.m5276a(2) != this.f5964o.get(2))) {
            this.f5953d.setMinValue(this.f5963n.get(5));
            this.f5953d.setMaxValue(this.f5963n.getActualMaximum(5));
            this.f5953d.setWrapSelectorWheel(this.f5963n.get(5) == 1);
        } else if ((this.f5965p.m5276a(1) != this.f5963n.get(1) || this.f5965p.m5276a(2) != this.f5963n.get(2)) && this.f5965p.m5276a(1) == this.f5964o.get(1) && this.f5965p.m5276a(2) == this.f5964o.get(2)) {
            this.f5953d.setMinValue(1);
            this.f5953d.setMaxValue(this.f5964o.get(5));
            this.f5953d.setWrapSelectorWheel(this.f5964o.get(5) == this.f5964o.getActualMaximum(5));
        } else if (this.f5965p.m5276a(1) == this.f5963n.get(1) && this.f5965p.m5276a(2) == this.f5963n.get(2) && this.f5965p.m5276a(1) == this.f5964o.get(1) && this.f5965p.m5276a(2) == this.f5964o.get(2)) {
            this.f5953d.setMinValue(this.f5963n.get(5));
            this.f5953d.setMaxValue(this.f5964o.get(5));
            ColorNumberPicker colorNumberPicker = this.f5953d;
            if (this.f5964o.get(5) == this.f5964o.getActualMaximum(5) && this.f5963n.get(5) == 1) {
                r3 = true;
            }
            colorNumberPicker.setWrapSelectorWheel(r3);
        } else {
            this.f5953d.setMinValue(this.f5965p.m5284b(5));
            this.f5953d.setMaxValue(this.f5965p.m5287c(5));
            this.f5953d.setWrapSelectorWheel(true);
        }
        Arrays.copyOfRange(this.f5960k, this.f5954e.getMinValue(), this.f5954e.getMaxValue() + 1);
        this.f5955f.setMinValue(this.f5963n.get(1));
        this.f5955f.setMaxValue(this.f5964o.get(1));
        this.f5955f.setWrapSelectorWheel(true);
        this.f5955f.setFormatter(this.f5967r);
        this.f5955f.setValue(this.f5965p.m5276a(1));
        this.f5954e.setValue(this.f5965p.m5276a(2));
        this.f5953d.setValue(this.f5965p.m5276a(5));
        this.f5953d.setFormatter(this.f5969t);
        if (this.f5953d.getValue() > 27) {
            this.f5953d.invalidate();
        }
    }

    public int getYear() {
        return this.f5965p.m5276a(1);
    }

    public int getMonth() {
        return this.f5965p.m5276a(2);
    }

    public int getDayOfMonth() {
        return this.f5965p.m5276a(5);
    }

    public InterfaceC1567n getOnDateChangedListener() {
        return this.f5959j;
    }

    public void setOnDateChangedListener(InterfaceC1567n interfaceC1567n) {
        this.f5959j = interfaceC1567n;
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1583o();

        /* renamed from: a */
        private final int f5973a;

        /* renamed from: b */
        private final int f5974b;

        /* renamed from: c */
        private final int f5975c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i, int i2, int i3, byte b) {
            this(parcelable, i, i2, i3);
        }

        private SavedState(Parcelable parcelable, int i, int i2, int i3) {
            super(parcelable);
            this.f5973a = i;
            this.f5974b = i2;
            this.f5975c = i3;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f5973a = parcel.readInt();
            this.f5974b = parcel.readInt();
            this.f5975c = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5973a);
            parcel.writeInt(this.f5974b);
            parcel.writeInt(this.f5975c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* synthetic */ void m4453g(ColorDatePicker colorDatePicker) {
        colorDatePicker.sendAccessibilityEvent(4);
        if (colorDatePicker.f5959j != null) {
            colorDatePicker.getYear();
            colorDatePicker.getMonth();
            colorDatePicker.getDayOfMonth();
        }
    }
}
