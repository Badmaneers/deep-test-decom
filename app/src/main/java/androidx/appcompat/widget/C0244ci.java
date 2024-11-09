package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.vectordrawable.p039a.p040a.C1081m;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourceManagerInternal.java */
/* renamed from: androidx.appcompat.widget.ci */
/* loaded from: classes.dex */
public final class C0244ci implements InterfaceC0242cg {
    @Override // androidx.appcompat.widget.InterfaceC0242cg
    /* renamed from: a */
    public final Drawable mo898a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return C1081m.m3604a(context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Exception e) {
            Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
            return null;
        }
    }
}
