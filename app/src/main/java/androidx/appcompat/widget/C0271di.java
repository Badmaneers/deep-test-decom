package androidx.appcompat.widget;

import android.util.Property;

/* compiled from: SwitchCompat.java */
/* renamed from: androidx.appcompat.widget.di */
/* loaded from: classes.dex */
final class C0271di extends Property<SwitchCompat, Float> {
    public C0271di(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Float get(SwitchCompat switchCompat) {
        return Float.valueOf(switchCompat.f1011a);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(SwitchCompat switchCompat, Float f) {
        switchCompat.setThumbPosition(f.floatValue());
    }
}
