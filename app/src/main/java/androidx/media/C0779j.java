package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.core.p023f.C0473d;
import java.util.HashMap;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.j */
/* loaded from: classes.dex */
public final class C0779j implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final String f3160a;

    /* renamed from: b */
    public final int f3161b;

    /* renamed from: c */
    public final int f3162c;

    /* renamed from: d */
    public final C0758ab f3163d;

    /* renamed from: e */
    public final Bundle f3164e;

    /* renamed from: f */
    public final InterfaceC0793x f3165f;

    /* renamed from: g */
    public final HashMap<String, List<C0473d<IBinder, Bundle>>> f3166g = new HashMap<>();

    /* renamed from: h */
    public C0778i f3167h;

    /* renamed from: i */
    final /* synthetic */ MediaBrowserServiceCompat f3168i;

    public C0779j(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, int i, int i2, Bundle bundle, InterfaceC0793x interfaceC0793x) {
        this.f3168i = mediaBrowserServiceCompat;
        this.f3160a = str;
        this.f3161b = i;
        this.f3162c = i2;
        this.f3163d = new C0758ab(str, i, i2);
        this.f3164e = bundle;
        this.f3165f = interfaceC0793x;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f3168i.f3124d.post(new RunnableC0780k(this));
    }
}
