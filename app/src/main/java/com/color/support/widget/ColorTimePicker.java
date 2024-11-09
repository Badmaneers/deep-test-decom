package com.color.support.widget;

import android.content.Context;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1338c;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class ColorTimePicker extends FrameLayout {

    /* renamed from: a */
    private String[] f6693a;

    /* renamed from: b */
    private Calendar f6694b;

    /* renamed from: c */
    private Calendar f6695c;

    /* renamed from: d */
    private Calendar f6696d;

    /* renamed from: e */
    private SimpleDateFormat f6697e;

    /* renamed from: f */
    private int f6698f;

    /* renamed from: g */
    private int f6699g;

    /* renamed from: h */
    private int f6700h;

    /* renamed from: i */
    private int f6701i;

    /* renamed from: j */
    private long f6702j;

    /* renamed from: k */
    private Date f6703k;

    /* renamed from: l */
    private Context f6704l;

    /* renamed from: m */
    private String[] f6705m;

    /* renamed from: n */
    private String[] f6706n;

    /* renamed from: o */
    private String f6707o;

    /* renamed from: p */
    private String f6708p;

    /* renamed from: q */
    private ColorNumberPicker f6709q;

    /* renamed from: r */
    private ColorNumberPicker f6710r;

    /* renamed from: s */
    private ColorNumberPicker f6711s;

    /* renamed from: t */
    private ColorNumberPicker f6712t;

    /* renamed from: u */
    private int f6713u;

    /* renamed from: v */
    private boolean f6714v;

    /* renamed from: w */
    private InterfaceC1489ew f6715w;

    public void setOnTimeChangeListener(InterfaceC1489ew interfaceC1489ew) {
        this.f6715w = interfaceC1489ew;
    }

    public ColorTimePicker(Context context) {
        this(context, null);
    }

    public ColorTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6701i = -1;
        this.f6713u = -1;
        C1338c.m4375a(this, false);
        this.f6704l = context;
        this.f6706n = this.f6704l.getResources().getStringArray(R.array.oppo_time_picker_ampm);
        this.f6707o = this.f6704l.getResources().getString(R.string.color_time_picker_today);
        this.f6708p = this.f6704l.getResources().getString(R.string.color_time_picker_day);
        this.f6694b = Calendar.getInstance();
        this.f6695c = Calendar.getInstance();
        this.f6698f = this.f6695c.get(1);
        this.f6699g = this.f6695c.get(2);
        this.f6700h = this.f6695c.get(5);
        this.f6697e = new SimpleDateFormat("yyyy MMM dd" + this.f6708p + " E", Locale.getDefault());
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f6704l).inflate(R.layout.color_time_picker, (ViewGroup) this, true);
        this.f6709q = (ColorNumberPicker) viewGroup.findViewById(R.id.color_time_picker_date);
        this.f6710r = (ColorNumberPicker) viewGroup.findViewById(R.id.color_time_picker_hour);
        this.f6711s = (ColorNumberPicker) viewGroup.findViewById(R.id.color_time_picker_minute);
        this.f6712t = (ColorNumberPicker) viewGroup.findViewById(R.id.color_time_picker_ampm);
        if (Locale.getDefault().getLanguage().equals("en") && this.f6712t != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f6712t.getParent();
            viewGroup2.removeView(this.f6712t);
            viewGroup2.addView(this.f6712t);
            if (!m4774a()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6711s.getLayoutParams();
                layoutParams.weight = 0.0f;
                this.f6711s.setLayoutParams(layoutParams);
                this.f6711s.setAlignPosition(0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f6712t.getLayoutParams();
                layoutParams2.weight = 1.0f;
                this.f6712t.setLayoutParams(layoutParams2);
                this.f6712t.setAlignPosition(1);
            }
        }
        if (this.f6710r.m4622b()) {
            String string = context.getResources().getString(R.string.picker_talkback_tip);
            if (this.f6709q != null) {
                this.f6709q.m4621a(string);
            }
            if (this.f6710r != null) {
                this.f6710r.m4621a(context.getResources().getString(R.string.color_hour) + string);
            }
            if (this.f6711s != null) {
                this.f6711s.m4621a(context.getResources().getString(R.string.color_minute) + string);
            }
            if (this.f6712t != null) {
                this.f6712t.m4621a(context.getResources().getString(R.string.color_minute) + string);
            }
        }
    }

    public void setColorTimePicker(Calendar calendar) {
        this.f6696d = calendar;
        getColorTimePicker();
    }

    public View getColorTimePicker() {
        Calendar calendar;
        int i;
        if (this.f6696d != null) {
            calendar = this.f6696d;
            i = calendar.get(1);
        } else {
            calendar = this.f6695c;
            i = this.f6695c.get(1);
        }
        int i2 = i;
        int i3 = calendar.get(2) + 1;
        int i4 = calendar.get(5);
        int i5 = calendar.get(11);
        int i6 = calendar.get(9);
        int i7 = calendar.get(12);
        this.f6694b.setTimeZone(calendar.getTimeZone());
        this.f6697e.setTimeZone(calendar.getTimeZone());
        int i8 = i3 - 1;
        this.f6694b.set(i2, i8, i4, i5, i7);
        int i9 = 36500;
        for (int i10 = 0; i10 < 100; i10++) {
            i9 += m4771a((i2 - 50) + i10);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 50; i12++) {
            i11 += m4771a((i2 - 50) + i12);
        }
        this.f6705m = new String[i9];
        this.f6693a = (String[]) this.f6705m.clone();
        if (i3 > 2 && !m4777b(i2 - 50) && m4777b(i2)) {
            i11++;
        }
        if (i3 > 2 && m4777b(i2 - 50)) {
            i11--;
        }
        int i13 = i11;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeZone(calendar.getTimeZone());
        int i14 = i9;
        calendar2.set(i2, i8, i4, i5, i7);
        if (m4777b(i2) && i3 == 2 && i4 == 29) {
            calendar2.add(5, 1);
        }
        calendar2.add(1, -50);
        this.f6702j = calendar2.getTimeInMillis();
        this.f6703k = new Date();
        if (m4774a()) {
            this.f6710r.setMaxValue(23);
            this.f6710r.setMinValue(0);
            this.f6712t.setVisibility(8);
        } else {
            this.f6710r.setMaxValue(12);
            this.f6710r.setMinValue(1);
            this.f6712t.setMaxValue(this.f6706n.length - 1);
            this.f6712t.setMinValue(0);
            this.f6712t.setDisplayedValues(this.f6706n);
            this.f6712t.setVisibility(0);
            this.f6712t.setWrapSelectorWheel(false);
        }
        this.f6710r.m4620a();
        this.f6710r.setWrapSelectorWheel(true);
        if (m4774a()) {
            this.f6710r.setValue(i5);
        } else {
            if (i6 > 0) {
                this.f6710r.setValue(i5 - 12);
            } else {
                this.f6710r.setValue(i5);
            }
            this.f6712t.setValue(i6);
            this.f6713u = i6;
        }
        this.f6712t.setOnValueChangedListener(new C1484er(this));
        this.f6710r.setOnValueChangedListener(new C1485es(this));
        this.f6711s.setMinValue(0);
        if (this.f6714v) {
            this.f6711s.setMinValue(0);
            this.f6711s.setMaxValue(11);
            String[] strArr = new String[12];
            int i15 = 0;
            for (int i16 = 12; i15 < i16; i16 = 12) {
                int i17 = i15 * 5;
                StringBuilder sb = i17 < 10 ? new StringBuilder("0") : new StringBuilder();
                sb.append(i17);
                strArr[i15] = sb.toString();
                i15++;
            }
            this.f6711s.setDisplayedValues(strArr);
            int i18 = i7 / 5;
            this.f6711s.setValue(i18);
            this.f6694b.set(12, Integer.parseInt(strArr[i18]));
        } else {
            this.f6711s.setMaxValue(59);
            this.f6711s.setValue(i7);
        }
        this.f6711s.m4620a();
        this.f6711s.setWrapSelectorWheel(true);
        this.f6711s.setOnValueChangedListener(new C1486et(this));
        this.f6709q.setMinValue(1);
        this.f6709q.setMaxValue(i14);
        this.f6709q.setWrapSelectorWheel(false);
        this.f6709q.setValue(i13);
        this.f6709q.setFormatter(new C1488ev(this));
        this.f6709q.setOnValueChangedListener(new C1487eu(this));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m4774a() {
        String string = Settings.System.getString(this.f6704l.getContentResolver(), "time_12_24");
        return string != null && string.equals("24");
    }

    /* renamed from: a */
    private static int m4771a(int i) {
        return m4777b(i) ? 366 : 365;
    }

    /* renamed from: b */
    private static boolean m4777b(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % ResponseCode.CODE_4XX_BAD_REQUEST == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public Date m4779c(int i) {
        try {
            return this.f6697e.parse(this.f6693a[i - 1]);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ String m4778c(ColorTimePicker colorTimePicker, int i) {
        colorTimePicker.f6703k.setTime(colorTimePicker.f6702j + (i * 86400000));
        if (colorTimePicker.f6703k.getYear() + 1900 == colorTimePicker.f6698f && colorTimePicker.f6703k.getMonth() == colorTimePicker.f6699g && colorTimePicker.f6703k.getDate() == colorTimePicker.f6700h) {
            colorTimePicker.f6701i = i;
        } else {
            colorTimePicker.f6701i = -1;
        }
        return colorTimePicker.f6697e.format(Long.valueOf(colorTimePicker.f6703k.getTime()));
    }
}
