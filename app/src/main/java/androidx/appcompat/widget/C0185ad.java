package androidx.appcompat.widget;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p024g.p025a.C0482c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityChooserView.java */
/* renamed from: androidx.appcompat.widget.ad */
/* loaded from: classes.dex */
public final class C0185ad extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1095a;

    public C0185ad(ActivityChooserView activityChooserView) {
        this.f1095a = activityChooserView;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        C0482c.m1635a(accessibilityNodeInfo).m1707v();
    }
}
