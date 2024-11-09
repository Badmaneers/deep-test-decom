package androidx.room;

import android.content.Context;
import androidx.p032e.p033a.InterfaceC0651g;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: DatabaseConfiguration.java */
/* renamed from: androidx.room.a */
/* loaded from: classes.dex */
public final class C0922a {

    /* renamed from: a */
    public final InterfaceC0651g f3784a;

    /* renamed from: b */
    public final Context f3785b;

    /* renamed from: c */
    public final String f3786c;

    /* renamed from: d */
    public final C0934ac f3787d;

    /* renamed from: e */
    public final List<Object> f3788e;

    /* renamed from: f */
    public final boolean f3789f;

    /* renamed from: g */
    public final int f3790g;

    /* renamed from: h */
    public final Executor f3791h;

    /* renamed from: i */
    public final Executor f3792i;

    /* renamed from: j */
    public final boolean f3793j;

    /* renamed from: k */
    public final boolean f3794k;

    /* renamed from: l */
    public final boolean f3795l;

    /* renamed from: m */
    public final String f3796m;

    /* renamed from: n */
    public final File f3797n;

    /* renamed from: o */
    private final Set<Integer> f3798o;

    public C0922a(Context context, String str, InterfaceC0651g interfaceC0651g, C0934ac c0934ac, List<Object> list, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f3784a = interfaceC0651g;
        this.f3785b = context;
        this.f3786c = str;
        this.f3787d = c0934ac;
        this.f3788e = list;
        this.f3789f = z;
        this.f3790g = i;
        this.f3791h = executor;
        this.f3792i = executor2;
        this.f3793j = z2;
        this.f3794k = z3;
        this.f3795l = z4;
        this.f3798o = set;
        this.f3796m = str2;
        this.f3797n = file;
    }

    /* renamed from: a */
    public final boolean m3333a(int i, int i2) {
        return !((i > i2) && this.f3795l) && this.f3794k && (this.f3798o == null || !this.f3798o.contains(Integer.valueOf(i)));
    }
}
