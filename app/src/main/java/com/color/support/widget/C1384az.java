package com.color.support.widget;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorKeyboardView.java */
/* renamed from: com.color.support.widget.az */
/* loaded from: classes.dex */
public final class C1384az extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ ColorKeyboardView f6953a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1384az(ColorKeyboardView colorKeyboardView) {
        this.f6953a = colorKeyboardView;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        String str2;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        str = this.f6953a.f6127l;
        if (str != null) {
            str2 = this.f6953a.f6127l;
            accessibilityNodeInfo.setContentDescription(str2);
        }
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }
}
