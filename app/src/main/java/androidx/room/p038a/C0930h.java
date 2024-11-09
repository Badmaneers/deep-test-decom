package androidx.room.p038a;

/* compiled from: TableInfo.java */
/* renamed from: androidx.room.a.h */
/* loaded from: classes.dex */
final class C0930h implements Comparable<C0930h> {

    /* renamed from: a */
    final int f3820a;

    /* renamed from: b */
    final int f3821b;

    /* renamed from: c */
    final String f3822c;

    /* renamed from: d */
    final String f3823d;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C0930h c0930h) {
        C0930h c0930h2 = c0930h;
        int i = this.f3820a - c0930h2.f3820a;
        return i == 0 ? this.f3821b - c0930h2.f3821b : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0930h(int i, int i2, String str, String str2) {
        this.f3820a = i;
        this.f3821b = i2;
        this.f3822c = str;
        this.f3823d = str2;
    }
}
