package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* compiled from: AudioAttributesImplApi21.java */
@TargetApi(21)
/* renamed from: androidx.media.b */
/* loaded from: classes.dex */
final class C0771b implements InterfaceC0756a {

    /* renamed from: a */
    AudioAttributes f3141a;

    /* renamed from: b */
    int f3142b = -1;

    public final int hashCode() {
        return this.f3141a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0771b) {
            return this.f3141a.equals(((C0771b) obj).f3141a);
        }
        return false;
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3141a;
    }
}
