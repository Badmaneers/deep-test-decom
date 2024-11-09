package com.color.support.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CalendarView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.color.support.util.C1338c;
import com.coloros.neton.BuildConfig;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class ColorLunarDatePicker extends FrameLayout {

    /* renamed from: a */
    private static final String f6238a = "ColorLunarDatePicker";

    /* renamed from: c */
    private static String f6240c;

    /* renamed from: f */
    private final LinearLayout f6243f;

    /* renamed from: g */
    private final ColorNumberPicker f6244g;

    /* renamed from: h */
    private final ColorNumberPicker f6245h;

    /* renamed from: i */
    private final ColorNumberPicker f6246i;

    /* renamed from: j */
    private Locale f6247j;

    /* renamed from: k */
    private InterfaceC1414cb f6248k;

    /* renamed from: l */
    private String[] f6249l;

    /* renamed from: m */
    private int f6250m;

    /* renamed from: n */
    private C1413ca f6251n;

    /* renamed from: o */
    private C1413ca f6252o;

    /* renamed from: p */
    private boolean f6253p;

    /* renamed from: q */
    private boolean f6254q;

    /* renamed from: b */
    private static final String[] f6239b = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};

    /* renamed from: d */
    private static Calendar f6241d = Calendar.getInstance();

    /* renamed from: e */
    private static Calendar f6242e = Calendar.getInstance();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m4570a() {
    }

    public CalendarView getCalendarView() {
        return null;
    }

    public boolean getCalendarViewShown() {
        return false;
    }

    public void setCalendarViewShown(boolean z) {
    }

    static {
        f6241d.set(1910, 2, 10, 0, 0);
        f6242e.set(2036, 11, 31, 23, 59);
    }

    public ColorLunarDatePicker(Context context) {
        this(context, null);
    }

    public ColorLunarDatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.datePickerStyle);
    }

    public ColorLunarDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6250m = 12;
        this.f6253p = true;
        C1338c.m4375a(this, false);
        setCurrentLocale(Locale.getDefault());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, color.support.p043v7.appcompat.R.styleable.ColorLunarDatePicker, i, 0);
        this.f6254q = obtainStyledAttributes.getBoolean(color.support.p043v7.appcompat.R.styleable.ColorLunarDatePicker_colorYearIgnorable, false);
        obtainStyledAttributes.recycle();
        int i2 = color.support.p043v7.appcompat.R.layout.oppo_lunar_date_picker;
        this.f6249l = getResources().getStringArray(color.support.p043v7.appcompat.R.array.color_lunar_mounth);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i2, (ViewGroup) this, true);
        f6240c = getResources().getString(color.support.p043v7.appcompat.R.string.oppo_lunar_leap_string);
        C1411bz c1411bz = new C1411bz(this);
        this.f6243f = (LinearLayout) findViewById(color.support.p043v7.appcompat.R.id.pickers);
        this.f6244g = (ColorNumberPicker) findViewById(color.support.p043v7.appcompat.R.id.day);
        this.f6244g.setOnLongPressUpdateInterval(100L);
        this.f6244g.setOnValueChangedListener(c1411bz);
        this.f6245h = (ColorNumberPicker) findViewById(color.support.p043v7.appcompat.R.id.month);
        this.f6245h.setMinValue(0);
        this.f6245h.setMaxValue(this.f6250m - 1);
        this.f6245h.setDisplayedValues(this.f6249l);
        this.f6245h.setOnLongPressUpdateInterval(200L);
        this.f6245h.setOnValueChangedListener(c1411bz);
        this.f6246i = (ColorNumberPicker) findViewById(color.support.p043v7.appcompat.R.id.year);
        this.f6246i.setOnLongPressUpdateInterval(100L);
        this.f6246i.setOnValueChangedListener(c1411bz);
        this.f6246i.setIgnorable(this.f6254q);
        setSpinnersShown(true);
        setCalendarViewShown(true);
        this.f6251n.m4937c();
        this.f6251n.m4929a(1910, 0, 1);
        setMinDate(this.f6251n.m4928a());
        this.f6251n.m4937c();
        this.f6251n.m4934b();
        setMaxDate(this.f6251n.m4928a());
        this.f6252o.m4930a(System.currentTimeMillis());
        m4571a(this.f6252o.m4927a(1), this.f6252o.m4927a(2), this.f6252o.m4927a(5));
        m4576c();
        this.f6248k = null;
        if (this.f6246i.m4622b()) {
            String string = context.getResources().getString(color.support.p043v7.appcompat.R.string.picker_talkback_tip);
            this.f6246i.m4621a(string);
            this.f6245h.m4621a(string);
            this.f6244g.m4621a(string);
        }
    }

    /* renamed from: a */
    private static String m4568a(C1413ca c1413ca) {
        int[] m4944a = C1416cd.m4944a(c1413ca.m4927a(1), c1413ca.m4927a(2) + 1, c1413ca.m4927a(5));
        int i = m4944a[0];
        int i2 = m4944a[1];
        int i3 = m4944a[2];
        int i4 = m4944a[3];
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("年");
            sb.append(i4 == 0 ? f6240c : BuildConfig.FLAVOR);
            sb.append(f6239b[i2 - 1]);
            sb.append("月");
            sb.append(C1416cd.m4947c(i3));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i4 == 0 ? f6240c : BuildConfig.FLAVOR);
        sb2.append(f6239b[i2 - 1]);
        sb2.append("月");
        sb2.append(C1416cd.m4947c(i3));
        return sb2.toString();
    }

    public long getMinDate() {
        return f6241d.getTimeInMillis();
    }

    public void setMinDate(long j) {
        this.f6251n.m4930a(j);
        if (this.f6251n.m4927a(1) == f6241d.get(1) && this.f6251n.m4927a(6) != f6241d.get(6)) {
            Log.w(f6238a, "setMinDate failed!:" + this.f6251n.m4927a(1) + "<->" + f6241d.get(1) + ":" + this.f6251n.m4927a(6) + "<->" + f6241d.get(6));
            return;
        }
        f6241d.setTimeInMillis(j);
        if (this.f6252o.m4933a(f6241d)) {
            this.f6252o.m4930a(f6241d.getTimeInMillis());
        }
        m4576c();
    }

    public long getMaxDate() {
        return f6242e.getTimeInMillis();
    }

    public void setMaxDate(long j) {
        this.f6251n.m4930a(j);
        if (this.f6251n.m4927a(1) == f6242e.get(1) && this.f6251n.m4927a(6) != f6242e.get(6)) {
            Log.w(f6238a, "setMaxDate failed!:" + this.f6251n.m4927a(1) + "<->" + f6242e.get(1) + ":" + this.f6251n.m4927a(6) + "<->" + f6242e.get(6));
            return;
        }
        f6242e.setTimeInMillis(j);
        if (this.f6252o.m4938c(f6242e)) {
            this.f6252o.m4930a(f6242e.getTimeInMillis());
        }
        m4576c();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f6253p;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.f6253p == z) {
            return;
        }
        super.setEnabled(z);
        this.f6244g.setEnabled(z);
        this.f6245h.setEnabled(z);
        this.f6246i.setEnabled(z);
        this.f6253p = z;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.f6252o.m4928a(), 20));
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    public boolean getSpinnersShown() {
        return this.f6243f.isShown();
    }

    public void setSpinnersShown(boolean z) {
        this.f6243f.setVisibility(z ? 0 : 8);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.f6247j)) {
            return;
        }
        this.f6247j = locale;
        this.f6251n = m4567a(this.f6251n, locale);
        f6241d = m4569a(f6241d, locale);
        f6242e = m4569a(f6242e, locale);
        this.f6252o = m4567a(this.f6252o, locale);
    }

    /* renamed from: a */
    private static C1413ca m4567a(C1413ca c1413ca, Locale locale) {
        boolean z;
        if (c1413ca == null) {
            return new C1413ca(locale);
        }
        C1413ca c1413ca2 = new C1413ca(locale);
        z = c1413ca.f7012g;
        if (!z) {
            c1413ca2.m4930a(c1413ca.m4928a());
        } else {
            c1413ca2.m4931a(c1413ca);
        }
        return c1413ca2;
    }

    /* renamed from: a */
    private static Calendar m4569a(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
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
        m4571a(savedState.f6255a, savedState.f6256b, savedState.f6257c);
        m4576c();
    }

    /* renamed from: a */
    private void m4571a(int i, int i2, int i3) {
        this.f6252o.m4929a(i, i2, i3);
        m4574b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(C1413ca c1413ca) {
        this.f6252o.m4931a(c1413ca);
        m4574b();
    }

    /* renamed from: b */
    private void m4574b() {
        this.f6252o.m4932a(f6241d, f6242e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c2 A[LOOP:1: B:34:0x01c0->B:35:0x01c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4576c() {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.ColorLunarDatePicker.m4576c():void");
    }

    public int getYear() {
        return this.f6252o.m4927a(1);
    }

    public int getMonth() {
        return this.f6252o.m4927a(2);
    }

    public int getDayOfMonth() {
        return this.f6252o.m4927a(5);
    }

    public int[] getLunarDate() {
        return C1416cd.m4944a(this.f6252o.m4927a(1), this.f6252o.m4927a(2) + 1, this.f6252o.m4927a(5));
    }

    public int getLeapMonth() {
        return C1416cd.m4945b(this.f6252o.m4927a(1));
    }

    public InterfaceC1414cb getOnDateChangedListener() {
        return this.f6248k;
    }

    public void setOnDateChangedListener(InterfaceC1414cb interfaceC1414cb) {
        this.f6248k = interfaceC1414cb;
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1415cc();

        /* renamed from: a */
        private final int f6255a;

        /* renamed from: b */
        private final int f6256b;

        /* renamed from: c */
        private final int f6257c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i, int i2, int i3, byte b) {
            this(parcelable, i, i2, i3);
        }

        private SavedState(Parcelable parcelable, int i, int i2, int i3) {
            super(parcelable);
            this.f6255a = i;
            this.f6256b = i2;
            this.f6257c = i3;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f6255a = parcel.readInt();
            this.f6256b = parcel.readInt();
            this.f6257c = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6255a);
            parcel.writeInt(this.f6256b);
            parcel.writeInt(this.f6257c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* synthetic */ void m4580g(ColorLunarDatePicker colorLunarDatePicker) {
        colorLunarDatePicker.sendAccessibilityEvent(4);
        if (colorLunarDatePicker.f6248k != null) {
            colorLunarDatePicker.getYear();
            colorLunarDatePicker.getMonth();
            colorLunarDatePicker.getDayOfMonth();
        }
    }
}
