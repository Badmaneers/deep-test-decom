package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import com.coloros.neton.BuildConfig;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: UtcDates.java */
/* renamed from: com.google.android.material.datepicker.at */
/* loaded from: classes.dex */
final class C2150at {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Calendar m6852a() {
        return m6853a(Calendar.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Calendar m6855b() {
        return m6856b((Calendar) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Calendar m6853a(Calendar calendar) {
        Calendar m6856b = m6856b(calendar);
        Calendar m6856b2 = m6856b((Calendar) null);
        m6856b2.set(m6856b.get(1), m6856b.get(2), m6856b.get(5));
        return m6856b2;
    }

    @TargetApi(24)
    /* renamed from: a */
    private static DateFormat m6848a(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    /* renamed from: a */
    private static java.text.DateFormat m6851a(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static SimpleDateFormat m6858c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", BuildConfig.FLAVOR), Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m6850a(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll("d", resources.getString(R.string.mtrl_picker_text_input_day_abbr)).replaceAll("M", resources.getString(R.string.mtrl_picker_text_input_month_abbr)).replaceAll("y", resources.getString(R.string.mtrl_picker_text_input_year_abbr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: a */
    public static DateFormat m6849a(Locale locale) {
        return m6848a("yMMMd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m6854b(Locale locale) {
        return m6848a("MMMd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: c */
    public static DateFormat m6857c(Locale locale) {
        return m6848a("MMMEd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: d */
    public static DateFormat m6859d(Locale locale) {
        return m6848a("yMMMEd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static java.text.DateFormat m6860e(Locale locale) {
        return m6851a(2, locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static java.text.DateFormat m6862g(Locale locale) {
        return m6851a(0, locale);
    }

    /* renamed from: a */
    private static int m6846a(String str, String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                i2 += i;
                while (i2 >= 0 && i2 < str.length() && str.charAt(i2) != '\'') {
                    i2 += i;
                }
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: b */
    private static Calendar m6856b(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m6847a(long j) {
        Calendar m6856b = m6856b((Calendar) null);
        m6856b.setTimeInMillis(j);
        return m6853a(m6856b).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static java.text.DateFormat m6861f(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m6851a(2, locale);
        String pattern = simpleDateFormat.toPattern();
        int m6846a = m6846a(pattern, "yY", 1, 0);
        if (m6846a < pattern.length()) {
            String str = "EMd";
            int m6846a2 = m6846a(pattern, "EMd", 1, m6846a);
            if (m6846a2 < pattern.length()) {
                str = "EMd,";
            }
            pattern = pattern.replace(pattern.substring(m6846a(pattern, str, -1, m6846a) + 1, m6846a2), " ").trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat;
    }
}
