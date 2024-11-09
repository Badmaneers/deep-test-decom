package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings.java */
/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
final class C2159g {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m6872a(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2150at.m6849a(locale).format(new Date(j));
        }
        return C2150at.m6860e(locale).format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m6873b(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2150at.m6854b(locale).format(new Date(j));
        }
        return C2150at.m6861f(locale).format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m6871a(long j) {
        Calendar m6853a = C2150at.m6853a(Calendar.getInstance());
        Calendar m6855b = C2150at.m6855b();
        m6855b.setTimeInMillis(j);
        if (m6853a.get(1) == m6855b.get(1)) {
            return m6873b(j, Locale.getDefault());
        }
        return m6872a(j, Locale.getDefault());
    }
}
