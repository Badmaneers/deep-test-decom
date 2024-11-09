package androidx.media;

import android.text.TextUtils;
import androidx.core.p023f.C0472c;

/* compiled from: MediaSessionManagerImplBase.java */
/* renamed from: androidx.media.ah */
/* loaded from: classes.dex */
final class C0764ah implements InterfaceC0759ac {

    /* renamed from: a */
    private String f3131a;

    /* renamed from: b */
    private int f3132b;

    /* renamed from: c */
    private int f3133c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0764ah(String str, int i, int i2) {
        this.f3131a = str;
        this.f3132b = i;
        this.f3133c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0764ah)) {
            return false;
        }
        C0764ah c0764ah = (C0764ah) obj;
        return TextUtils.equals(this.f3131a, c0764ah.f3131a) && this.f3132b == c0764ah.f3132b && this.f3133c == c0764ah.f3133c;
    }

    public final int hashCode() {
        return C0472c.m1614a(this.f3131a, Integer.valueOf(this.f3132b), Integer.valueOf(this.f3133c));
    }
}
