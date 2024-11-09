package androidx.p032e.p033a;

/* compiled from: SimpleSQLiteQuery.java */
/* renamed from: androidx.e.a.a */
/* loaded from: classes.dex */
public final class C0637a implements InterfaceC0653i {

    /* renamed from: a */
    private final String f2696a;

    /* renamed from: b */
    private final Object[] f2697b;

    private C0637a(String str) {
        this.f2696a = str;
        this.f2697b = null;
    }

    public C0637a(String str, byte b) {
        this(str);
    }

    @Override // androidx.p032e.p033a.InterfaceC0653i
    /* renamed from: b */
    public final String mo2206b() {
        return this.f2696a;
    }

    @Override // androidx.p032e.p033a.InterfaceC0653i
    /* renamed from: a */
    public final void mo2205a(InterfaceC0652h interfaceC0652h) {
        Object[] objArr = this.f2697b;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    interfaceC0652h.mo2226a(i);
                } else if (obj instanceof byte[]) {
                    interfaceC0652h.mo2230a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    interfaceC0652h.mo2227a(i, ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    interfaceC0652h.mo2227a(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    interfaceC0652h.mo2228a(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    interfaceC0652h.mo2228a(i, ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    interfaceC0652h.mo2228a(i, ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    interfaceC0652h.mo2228a(i, ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    interfaceC0652h.mo2229a(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    interfaceC0652h.mo2228a(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
            }
        }
    }
}
