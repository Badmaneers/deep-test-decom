package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;

/* compiled from: BadgeUtils.java */
/* renamed from: com.google.android.material.badge.b */
/* loaded from: classes.dex */
public final class C2065b {

    /* renamed from: a */
    public static final boolean f9124a;

    static {
        f9124a = Build.VERSION.SDK_INT < 18;
    }

    /* renamed from: a */
    public static void m6381a(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    /* renamed from: a */
    public static void m6382a(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        m6384c(badgeDrawable, view, frameLayout);
        if (f9124a) {
            frameLayout.setForeground(badgeDrawable);
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    /* renamed from: b */
    public static void m6383b(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        if (badgeDrawable == null) {
            return;
        }
        if (f9124a) {
            frameLayout.setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    /* renamed from: c */
    public static void m6384c(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        (f9124a ? frameLayout : view).getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.m6358a(view, frameLayout);
    }

    /* renamed from: a */
    public static ParcelableSparseArray m6380a(SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            BadgeDrawable valueAt = sparseArray.valueAt(i);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(keyAt, valueAt.m6357a());
        }
        return parcelableSparseArray;
    }

    /* renamed from: a */
    public static SparseArray<BadgeDrawable> m6379a(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i);
            if (savedState == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(keyAt, BadgeDrawable.m6343a(context, savedState));
        }
        return sparseArray;
    }
}
