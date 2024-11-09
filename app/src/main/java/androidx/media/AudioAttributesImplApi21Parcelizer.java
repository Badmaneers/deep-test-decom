package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC1091b;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static C0771b read(AbstractC1091b abstractC1091b) {
        C0771b c0771b = new C0771b();
        c0771b.f3141a = (AudioAttributes) abstractC1091b.m3638b((AbstractC1091b) c0771b.f3141a, 1);
        c0771b.f3142b = abstractC1091b.m3637b(c0771b.f3142b, 2);
        return c0771b;
    }

    public static void write(C0771b c0771b, AbstractC1091b abstractC1091b) {
        abstractC1091b.m3629a(c0771b.f3141a, 1);
        abstractC1091b.m3627a(c0771b.f3142b, 2);
    }
}
