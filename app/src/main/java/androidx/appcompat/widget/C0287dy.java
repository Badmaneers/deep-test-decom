package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* compiled from: TooltipCompat.java */
/* renamed from: androidx.appcompat.widget.dy */
/* loaded from: classes.dex */
public final class C0287dy {
    /* renamed from: a */
    public static void m973a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            ViewOnAttachStateChangeListenerC0288dz.m974a(view, charSequence);
        }
    }
}
