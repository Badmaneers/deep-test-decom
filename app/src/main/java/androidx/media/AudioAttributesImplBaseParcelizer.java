package androidx.media;

import androidx.versionedparcelable.AbstractC1091b;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static C0772c read(AbstractC1091b abstractC1091b) {
        C0772c c0772c = new C0772c();
        c0772c.f3143a = abstractC1091b.m3637b(c0772c.f3143a, 1);
        c0772c.f3144b = abstractC1091b.m3637b(c0772c.f3144b, 2);
        c0772c.f3145c = abstractC1091b.m3637b(c0772c.f3145c, 3);
        c0772c.f3146d = abstractC1091b.m3637b(c0772c.f3146d, 4);
        return c0772c;
    }

    public static void write(C0772c c0772c, AbstractC1091b abstractC1091b) {
        abstractC1091b.m3627a(c0772c.f3143a, 1);
        abstractC1091b.m3627a(c0772c.f3144b, 2);
        abstractC1091b.m3627a(c0772c.f3145c, 3);
        abstractC1091b.m3627a(c0772c.f3146d, 4);
    }
}
