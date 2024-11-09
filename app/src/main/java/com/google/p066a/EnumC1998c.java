package com.google.p066a;

import java.lang.reflect.Field;

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
/* compiled from: FieldNamingPolicy.java */
/* renamed from: com.google.a.c */
/* loaded from: classes.dex */
public abstract class EnumC1998c implements InterfaceC2014i {

    /* renamed from: a */
    public static final EnumC1998c f8872a;

    /* renamed from: b */
    public static final EnumC1998c f8873b;

    /* renamed from: c */
    public static final EnumC1998c f8874c;

    /* renamed from: d */
    public static final EnumC1998c f8875d;

    /* renamed from: e */
    public static final EnumC1998c f8876e;

    /* renamed from: f */
    private static final /* synthetic */ EnumC1998c[] f8877f;

    private EnumC1998c(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ EnumC1998c(String str, int i, byte b) {
        this(str, i);
    }

    public static EnumC1998c valueOf(String str) {
        return (EnumC1998c) Enum.valueOf(EnumC1998c.class, str);
    }

    public static EnumC1998c[] values() {
        return (EnumC1998c[]) f8877f.clone();
    }

    static {
        final String str = "IDENTITY";
        f8872a = new EnumC1998c(str) { // from class: com.google.a.d
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                byte b = 0;
            }

            @Override // com.google.p066a.InterfaceC2014i
            /* renamed from: a */
            public final String mo6167a(Field field) {
                return field.getName();
            }
        };
        final String str2 = "UPPER_CAMEL_CASE";
        f8873b = new EnumC1998c(str2) { // from class: com.google.a.e
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i = 1;
                byte b = 0;
            }

            @Override // com.google.p066a.InterfaceC2014i
            /* renamed from: a */
            public final String mo6167a(Field field) {
                return EnumC1998c.m6161a(field.getName());
            }
        };
        final String str3 = "UPPER_CAMEL_CASE_WITH_SPACES";
        f8874c = new EnumC1998c(str3) { // from class: com.google.a.f
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i = 2;
                byte b = 0;
            }

            @Override // com.google.p066a.InterfaceC2014i
            /* renamed from: a */
            public final String mo6167a(Field field) {
                return EnumC1998c.m6161a(EnumC1998c.m6162a(field.getName(), " "));
            }
        };
        final String str4 = "LOWER_CASE_WITH_UNDERSCORES";
        f8875d = new EnumC1998c(str4) { // from class: com.google.a.g
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i = 3;
                byte b = 0;
            }

            @Override // com.google.p066a.InterfaceC2014i
            /* renamed from: a */
            public final String mo6167a(Field field) {
                return EnumC1998c.m6162a(field.getName(), "_").toLowerCase();
            }
        };
        final String str5 = "LOWER_CASE_WITH_DASHES";
        f8876e = new EnumC1998c(str5) { // from class: com.google.a.h
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i = 4;
                byte b = 0;
            }

            @Override // com.google.p066a.InterfaceC2014i
            /* renamed from: a */
            public final String mo6167a(Field field) {
                return EnumC1998c.m6162a(field.getName(), "-").toLowerCase();
            }
        };
        f8877f = new EnumC1998c[]{f8872a, f8873b, f8874c, f8875d, f8876e};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ String m6161a(String str) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        while (i < str.length() - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (i == str.length()) {
            return sb.toString();
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        int i2 = i + 1;
        if (i2 < str.length()) {
            valueOf = upperCase + str.substring(i2);
        } else {
            valueOf = String.valueOf(upperCase);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ String m6162a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
