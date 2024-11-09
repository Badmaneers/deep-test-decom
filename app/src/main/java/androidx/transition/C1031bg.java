package androidx.transition;

import android.util.Property;
import android.view.View;

/* compiled from: ViewUtils.java */
/* renamed from: androidx.transition.bg */
/* loaded from: classes.dex */
final class C1031bg extends Property<View, Float> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1031bg(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Float get(View view) {
        return Float.valueOf(C1030bf.m3559c(view));
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(View view, Float f) {
        C1030bf.m3553a(view, f.floatValue());
    }
}
