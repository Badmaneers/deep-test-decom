package androidx.core.widget;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.core.p022e.C0458e;
import androidx.core.p022e.C0459f;
import androidx.core.p022e.C0460g;
import androidx.core.p023f.C0478i;
import java.lang.reflect.Field;

/* compiled from: TextViewCompat.java */
/* renamed from: androidx.core.widget.o */
/* loaded from: classes.dex */
public final class C0577o {

    /* renamed from: a */
    private static Field f2521a;

    /* renamed from: b */
    private static boolean f2522b;

    /* renamed from: c */
    private static Field f2523c;

    /* renamed from: d */
    private static boolean f2524d;

    /* renamed from: a */
    private static Field m2047a(String str) {
        Field field;
        try {
            field = TextView.class.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        try {
            field.setAccessible(true);
        } catch (NoSuchFieldException unused2) {
            Log.e("TextViewCompat", "Could not retrieve " + str + " field.");
            return field;
        }
        return field;
    }

    /* renamed from: a */
    private static int m2045a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d("TextViewCompat", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* renamed from: a */
    public static void m2049a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            boolean z = textView.getLayoutDirection() == 1;
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
            return;
        }
        textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static int m2044a(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f2524d) {
            f2523c = m2047a("mMaxMode");
            f2524d = true;
        }
        if (f2523c == null || m2045a(f2523c, textView) != 1) {
            return -1;
        }
        if (!f2522b) {
            f2521a = m2047a("mMaximum");
            f2522b = true;
        }
        if (f2521a != null) {
            return m2045a(f2521a, textView);
        }
        return -1;
    }

    /* renamed from: a */
    public static void m2048a(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: b */
    public static Drawable[] m2052b(TextView textView) {
        if (Build.VERSION.SDK_INT >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            boolean z = textView.getLayoutDirection() == 1;
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (z) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
        return textView.getCompoundDrawables();
    }

    /* renamed from: a */
    public static ActionMode.Callback m2046a(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC0578p)) ? callback : new ActionModeCallbackC0578p(callback, textView);
    }

    /* renamed from: b */
    public static void m2051b(TextView textView, int i) {
        int i2;
        C0478i.m1619a(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: c */
    public static void m2054c(TextView textView, int i) {
        int i2;
        C0478i.m1619a(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: d */
    public static void m2055d(TextView textView, int i) {
        C0478i.m1619a(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* renamed from: c */
    public static C0459f m2053c(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0459f(textView.getTextMetricsParams());
        }
        C0460g c0460g = new C0460g(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            c0460g.m1603a(textView.getBreakStrategy());
            c0460g.m1605b(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else {
                if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
                    byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
                    if (directionality == 1 || directionality == 2) {
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    }
                } else {
                    boolean z = textView.getLayoutDirection() == 1;
                    switch (textView.getTextDirection()) {
                        case 2:
                            textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                            break;
                        case 3:
                            textDirectionHeuristic = TextDirectionHeuristics.LTR;
                            break;
                        case 4:
                            textDirectionHeuristic = TextDirectionHeuristics.RTL;
                            break;
                        case 5:
                            textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                            break;
                        case 6:
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        default:
                            if (!z) {
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                break;
                            }
                        case 7:
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                    }
                }
            }
            c0460g.m1604a(textDirectionHeuristic);
        }
        return c0460g.m1602a();
    }

    /* renamed from: a */
    public static void m2050a(TextView textView, C0458e c0458e) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(c0458e.m1595a());
        } else {
            if (!m2053c(textView).m1598a(c0458e.m1596b())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(c0458e);
        }
    }
}
