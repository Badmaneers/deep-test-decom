package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.p008b.p009a.C0112a;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourceManagerInternal.java */
/* renamed from: androidx.appcompat.widget.cd */
/* loaded from: classes.dex */
public final class C0239cd implements InterfaceC0242cg {
    @Override // androidx.appcompat.widget.InterfaceC0242cg
    /* renamed from: a */
    public final Drawable mo898a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return C0112a.m253a(context, context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Exception e) {
            Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
            return null;
        }
    }
}
