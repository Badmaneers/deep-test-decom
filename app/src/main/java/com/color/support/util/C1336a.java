package com.color.support.util;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: ColorChangeTextUtil.java */
/* renamed from: com.color.support.util.a */
/* loaded from: classes.dex */
public final class C1336a {

    /* renamed from: a */
    public static final float[] f5804a = {0.9f, 1.0f, 1.1f, 1.25f, 1.45f, 1.65f};

    /* renamed from: a */
    public static float m4370a(float f, float f2, int i) {
        if (i < 2) {
            return f;
        }
        if (i > f5804a.length) {
            i = f5804a.length;
        }
        float f3 = f / f2;
        switch (i) {
            case 2:
                return f2 < 1.1f ? f3 * 1.0f : f3 * 1.1f;
            case 3:
                return f2 < 1.1f ? f3 * 1.0f : f2 < 1.45f ? f3 * 1.1f : f3 * 1.25f;
            default:
                int i2 = i - 1;
                return f2 > f5804a[i2] ? f3 * f5804a[i2] : f3 * f2;
        }
    }

    /* renamed from: a */
    public static void m4372a(TextView textView) {
        if (textView != null) {
            if (C1341f.m4383a() < 12) {
                textView.getPaint().setFakeBoldText(true);
            } else {
                textView.setTypeface(Typeface.create("sans-serif-medium", 0));
            }
        }
    }

    /* renamed from: a */
    public static void m4371a(Paint paint) {
        if (paint != null) {
            if (C1341f.m4383a() < 12) {
                paint.setFakeBoldText(true);
            } else {
                paint.setTypeface(Typeface.create("sans-serif-medium", 0));
            }
        }
    }

    /* renamed from: b */
    public static void m4373b(TextView textView) {
        textView.setTextSize(0, m4370a(textView.getTextSize(), textView.getResources().getConfiguration().fontScale, 2));
    }
}
