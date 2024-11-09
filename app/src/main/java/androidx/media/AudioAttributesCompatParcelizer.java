package androidx.media;

import androidx.versionedparcelable.AbstractC1091b;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1091b abstractC1091b) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3120a = (InterfaceC0756a) abstractC1091b.m3647c((AbstractC1091b) audioAttributesCompat.f3120a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1091b abstractC1091b) {
        abstractC1091b.m3630a(audioAttributesCompat.f3120a);
    }
}
