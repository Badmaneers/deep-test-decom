package androidx.transition;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.core.p024g.C0538w;

/* compiled from: ViewUtils.java */
/* renamed from: androidx.transition.bh */
/* loaded from: classes.dex */
final class C1032bh extends Property<View, Rect> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1032bh(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Rect get(View view) {
        return C0538w.m1821E(view);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(View view, Rect rect) {
        C0538w.m1845a(view, rect);
    }
}
