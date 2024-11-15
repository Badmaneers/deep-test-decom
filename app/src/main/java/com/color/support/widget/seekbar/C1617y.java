package com.color.support.widget.seekbar;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: SeekBarHelper.java */
/* renamed from: com.color.support.widget.seekbar.y */
/* loaded from: classes.dex */
public final class C1617y {

    /* renamed from: a */
    static final int f7731a = Color.argb(12, 0, 0, 0);

    /* renamed from: b */
    static final int f7732b = Color.parseColor("#4D4D4D");

    /* renamed from: c */
    static final int f7733c = Color.argb(76, 255, 255, 255);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5418a(View view, ColorStateList colorStateList, int i) {
        return colorStateList == null ? i : colorStateList.getColorForState(view.getDrawableState(), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5417a(View view, ColorStateList colorStateList) {
        return m5418a(view, colorStateList, f7731a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5419a(MotionEvent motionEvent, View view) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= ((float) view.getPaddingLeft()) && x <= ((float) (view.getWidth() - view.getPaddingRight())) && y >= 0.0f && y <= ((float) view.getHeight());
    }
}
