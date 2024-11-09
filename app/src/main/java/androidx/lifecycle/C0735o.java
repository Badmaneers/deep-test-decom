package androidx.lifecycle;

/* compiled from: LifecycleRegistry.java */
/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
final /* synthetic */ class C0735o {

    /* renamed from: a */
    static final /* synthetic */ int[] f3083a;

    /* renamed from: b */
    static final /* synthetic */ int[] f3084b = new int[EnumC0730j.values().length];

    static {
        try {
            f3084b[EnumC0730j.INITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3084b[EnumC0730j.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3084b[EnumC0730j.STARTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3084b[EnumC0730j.RESUMED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f3084b[EnumC0730j.DESTROYED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f3083a = new int[EnumC0729i.values().length];
        try {
            f3083a[EnumC0729i.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f3083a[EnumC0729i.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f3083a[EnumC0729i.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f3083a[EnumC0729i.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f3083a[EnumC0729i.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f3083a[EnumC0729i.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f3083a[EnumC0729i.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
