package androidx.room;

import androidx.p032e.p033a.C0649e;
import androidx.p032e.p033a.InterfaceC0647c;
import androidx.p032e.p033a.InterfaceC0651g;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SQLiteCopyOpenHelperFactory.java */
/* renamed from: androidx.room.aj */
/* loaded from: classes.dex */
public final class C0941aj implements InterfaceC0651g {

    /* renamed from: a */
    private final String f3872a;

    /* renamed from: b */
    private final File f3873b;

    /* renamed from: c */
    private final InterfaceC0651g f3874c;

    public C0941aj(String str, File file, InterfaceC0651g interfaceC0651g) {
        this.f3872a = str;
        this.f3873b = file;
        this.f3874c = interfaceC0651g;
    }

    @Override // androidx.p032e.p033a.InterfaceC0651g
    /* renamed from: a */
    public final InterfaceC0647c mo2225a(C0649e c0649e) {
        return new C0940ai(c0649e.f2712a, this.f3872a, this.f3873b, c0649e.f2714c.f2711a, this.f3874c.mo2225a(c0649e));
    }
}
