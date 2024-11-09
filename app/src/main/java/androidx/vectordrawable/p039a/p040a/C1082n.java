package androidx.vectordrawable.p039a.p040a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.content.p020a.C0435o;
import androidx.core.graphics.C0543b;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: VectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.n */
/* loaded from: classes.dex */
final class C1082n extends AbstractC1086r {
    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1086r
    /* renamed from: a */
    public final boolean mo3609a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1082n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1082n(C1082n c1082n) {
        super(c1082n);
    }

    /* renamed from: a */
    public final void m3608a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        if (C0435o.m1544a(xmlPullParser, "pathData")) {
            TypedArray m1540a = C0435o.m1540a(resources, theme, attributeSet, C1069a.f4262d);
            String string = m1540a.getString(0);
            if (string != null) {
                this.f4325m = string;
            }
            String string2 = m1540a.getString(1);
            if (string2 != null) {
                this.f4324l = C0543b.m1911b(string2);
            }
            this.f4326n = C0435o.m1539a(m1540a, xmlPullParser, "fillType", 2, 0);
            m1540a.recycle();
        }
    }
}
