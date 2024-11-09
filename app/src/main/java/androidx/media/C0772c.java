package androidx.media;

import java.util.Arrays;

/* compiled from: AudioAttributesImplBase.java */
/* renamed from: androidx.media.c */
/* loaded from: classes.dex */
final class C0772c implements InterfaceC0756a {

    /* renamed from: a */
    int f3143a = 0;

    /* renamed from: b */
    int f3144b = 0;

    /* renamed from: c */
    int f3145c = 0;

    /* renamed from: d */
    int f3146d = -1;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3144b), Integer.valueOf(this.f3145c), Integer.valueOf(this.f3143a), Integer.valueOf(this.f3146d)});
    }

    public final boolean equals(Object obj) {
        int m2659a;
        if (!(obj instanceof C0772c)) {
            return false;
        }
        C0772c c0772c = (C0772c) obj;
        if (this.f3144b == c0772c.f3144b) {
            int i = this.f3145c;
            int i2 = c0772c.f3145c;
            if (c0772c.f3146d != -1) {
                m2659a = c0772c.f3146d;
            } else {
                m2659a = AudioAttributesCompat.m2659a(c0772c.f3145c, c0772c.f3143a);
            }
            if (m2659a == 6) {
                i2 |= 4;
            } else if (m2659a == 7) {
                i2 |= 1;
            }
            if (i == (i2 & 273) && this.f3143a == c0772c.f3143a && this.f3146d == c0772c.f3146d) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3146d != -1) {
            sb.append(" stream=");
            sb.append(this.f3146d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m2660a(this.f3143a));
        sb.append(" content=");
        sb.append(this.f3144b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3145c).toUpperCase());
        return sb.toString();
    }
}
