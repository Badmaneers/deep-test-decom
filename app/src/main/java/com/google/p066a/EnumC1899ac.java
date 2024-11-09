package com.google.p066a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: LongSerializationPolicy.java */
/* renamed from: com.google.a.ac */
/* loaded from: classes.dex */
public abstract class EnumC1899ac {

    /* renamed from: a */
    public static final EnumC1899ac f8691a;

    /* renamed from: b */
    public static final EnumC1899ac f8692b;

    /* renamed from: c */
    private static final /* synthetic */ EnumC1899ac[] f8693c;

    private EnumC1899ac(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ EnumC1899ac(String str, int i, byte b) {
        this(str, i);
    }

    public static EnumC1899ac valueOf(String str) {
        return (EnumC1899ac) Enum.valueOf(EnumC1899ac.class, str);
    }

    public static EnumC1899ac[] values() {
        return (EnumC1899ac[]) f8693c.clone();
    }

    static {
        final String str = "DEFAULT";
        f8691a = new EnumC1899ac(str) { // from class: com.google.a.ad
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                byte b = 0;
            }
        };
        final String str2 = "STRING";
        f8692b = new EnumC1899ac(str2) { // from class: com.google.a.ae
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i = 1;
                byte b = 0;
            }
        };
        f8693c = new EnumC1899ac[]{f8691a, f8692b};
    }
}
