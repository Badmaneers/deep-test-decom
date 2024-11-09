package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.vectordrawable.p039a.p040a.C1071c;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourceManagerInternal.java */
/* renamed from: androidx.appcompat.widget.ce */
/* loaded from: classes.dex */
public final class C0240ce implements InterfaceC0242cg {
    @Override // androidx.appcompat.widget.InterfaceC0242cg
    /* renamed from: a */
    public final Drawable mo898a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return C1071c.m3585a(context, context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Exception e) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
            return null;
        }
    }
}
