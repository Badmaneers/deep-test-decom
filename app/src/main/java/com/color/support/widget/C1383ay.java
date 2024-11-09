package com.color.support.widget;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorKeyboardView.java */
/* renamed from: com.color.support.widget.ay */
/* loaded from: classes.dex */
public final class C1383ay extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ ColorKeyboardView f6952a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1383ay(ColorKeyboardView colorKeyboardView) {
        this.f6952a = colorKeyboardView;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        String str2;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        str = this.f6952a.f6126k;
        if (str != null) {
            str2 = this.f6952a.f6126k;
            accessibilityNodeInfo.setContentDescription(str2);
        }
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }
}
