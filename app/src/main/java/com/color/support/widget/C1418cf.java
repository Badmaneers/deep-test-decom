package com.color.support.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorNumberPicker.java */
/* renamed from: com.color.support.widget.cf */
/* loaded from: classes.dex */
public final class C1418cf extends AccessibilityNodeProvider {

    /* renamed from: a */
    final /* synthetic */ ColorNumberPicker f7020a;

    /* renamed from: b */
    private final Rect f7021b = new Rect();

    /* renamed from: c */
    private final int[] f7022c = new int[2];

    /* renamed from: d */
    private int f7023d = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1418cf(ColorNumberPicker colorNumberPicker) {
        this.f7020a = colorNumberPicker;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        SparseArray sparseArray;
        int i2;
        String str;
        String str2;
        sparseArray = this.f7020a.f6318e;
        i2 = this.f7020a.f6329p;
        String str3 = (String) sparseArray.get(i2);
        int scrollX = this.f7020a.getScrollX();
        int scrollY = this.f7020a.getScrollY();
        int scrollX2 = this.f7020a.getScrollX() + (this.f7020a.getRight() - this.f7020a.getLeft());
        int scrollY2 = this.f7020a.getScrollY() + (this.f7020a.getBottom() - this.f7020a.getTop());
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        obtain.setPackageName(this.f7020a.getContext().getPackageName());
        obtain.setSource(this.f7020a, 0);
        obtain.setParent(this.f7020a);
        str = this.f7020a.f6309au;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            str2 = this.f7020a.f6309au;
            sb.append(str2);
            str3 = sb.toString();
        }
        obtain.setText(str3);
        obtain.setClickable(true);
        obtain.setLongClickable(true);
        obtain.setEnabled(this.f7020a.isEnabled());
        Rect rect = this.f7021b;
        rect.set(scrollX, scrollY, scrollX2, scrollY2);
        obtain.setBoundsInParent(rect);
        int[] iArr = this.f7022c;
        this.f7020a.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        obtain.setBoundsInScreen(rect);
        if (this.f7023d != 0) {
            obtain.addAction(64);
        }
        if (this.f7023d == 0) {
            obtain.addAction(128);
        }
        if (this.f7020a.isEnabled()) {
            obtain.addAction(16);
        }
        return obtain;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        return super.findAccessibilityNodeInfosByText(str, i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        switch (i) {
            case -1:
                if (i2 == 64) {
                    if (this.f7023d == i) {
                        return false;
                    }
                    this.f7023d = i;
                    return true;
                }
                if (i2 == 128) {
                    if (this.f7023d != i) {
                        return false;
                    }
                    this.f7023d = RecyclerView.UNDEFINED_DURATION;
                    return true;
                }
                if (i2 == 4096) {
                    if (!this.f7020a.isEnabled()) {
                        return false;
                    }
                    this.f7020a.m4595a(true);
                    return true;
                }
                if (i2 == 8192) {
                    if (!this.f7020a.isEnabled()) {
                        return false;
                    }
                    this.f7020a.m4595a(false);
                    return true;
                }
                break;
            case 0:
                if (i2 == 16) {
                    return this.f7020a.isEnabled();
                }
                if (i2 == 64) {
                    if (this.f7023d == i) {
                        return false;
                    }
                    this.f7023d = i;
                    m4949b(i, 32768);
                    ColorNumberPicker colorNumberPicker = this.f7020a;
                    int right = this.f7020a.getRight();
                    i3 = this.f7020a.f6277M;
                    colorNumberPicker.invalidate(0, 0, right, i3);
                    return true;
                }
                if (i2 != 128 || this.f7023d != i) {
                    return false;
                }
                this.f7023d = RecyclerView.UNDEFINED_DURATION;
                m4949b(i, 65536);
                ColorNumberPicker colorNumberPicker2 = this.f7020a;
                int right2 = this.f7020a.getRight();
                i4 = this.f7020a.f6277M;
                colorNumberPicker2.invalidate(0, 0, right2, i4);
                return true;
        }
        return super.performAction(i, i2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4950a(int i, int i2) {
        m4949b(i, i2);
    }

    /* renamed from: b */
    private void m4949b(int i, int i2) {
        AccessibilityManager accessibilityManager;
        accessibilityManager = this.f7020a.f6284T;
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            obtain.setPackageName(this.f7020a.getContext().getPackageName());
            obtain.getText().add(null);
            obtain.setEnabled(this.f7020a.isEnabled());
            obtain.setSource(this.f7020a, i);
            this.f7020a.requestSendAccessibilityEvent(this.f7020a, obtain);
        }
    }
}
