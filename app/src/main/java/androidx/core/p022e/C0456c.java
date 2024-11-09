package androidx.core.p022e;

/* compiled from: BidiFormatter.java */
/* renamed from: androidx.core.e.c */
/* loaded from: classes.dex */
final class C0456c {

    /* renamed from: a */
    private static final byte[] f2236a = new byte[1792];

    /* renamed from: b */
    private final CharSequence f2237b;

    /* renamed from: c */
    private final boolean f2238c = false;

    /* renamed from: d */
    private final int f2239d;

    /* renamed from: e */
    private int f2240e;

    /* renamed from: f */
    private char f2241f;

    static {
        for (int i = 0; i < 1792; i++) {
            f2236a[i] = Character.getDirectionality(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0456c(CharSequence charSequence) {
        this.f2237b = charSequence;
        this.f2239d = charSequence.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009d, code lost:            if (r13.f2241f == '&') goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:            if (r13.f2240e >= r13.f2239d) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a5, code lost:            r6 = r13.f2237b;        r7 = r13.f2240e;        r13.f2240e = r7 + 1;        r6 = r6.charAt(r7);        r13.f2241f = r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b5, code lost:            if (r6 != ';') goto L95;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00bc. Please report as an issue. */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m1590a() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p022e.C0456c.m1590a():int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0018. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0015. Please report as an issue. */
    /* renamed from: b */
    public final int m1591b() {
        this.f2240e = this.f2239d;
        int i = 0;
        int i2 = 0;
        while (this.f2240e > 0) {
            byte m1587c = m1587c();
            if (m1587c != 9) {
                switch (m1587c) {
                    case 0:
                        if (i2 != 0) {
                            if (i != 0) {
                                break;
                            } else {
                                i = i2;
                                break;
                            }
                        } else {
                            return -1;
                        }
                    case 1:
                    case 2:
                        if (i2 != 0) {
                            if (i != 0) {
                                break;
                            } else {
                                i = i2;
                                break;
                            }
                        } else {
                            return 1;
                        }
                    default:
                        switch (m1587c) {
                            case 14:
                            case 15:
                                if (i != i2) {
                                    i2--;
                                    break;
                                } else {
                                    return -1;
                                }
                            case 16:
                            case 17:
                                if (i != i2) {
                                    i2--;
                                    break;
                                } else {
                                    return 1;
                                }
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i != 0) {
                                    break;
                                } else {
                                    i = i2;
                                    break;
                                }
                        }
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static byte m1586a(char c) {
        return c < 1792 ? f2236a[c] : Character.getDirectionality(c);
    }

    /* renamed from: c */
    private byte m1587c() {
        this.f2241f = this.f2237b.charAt(this.f2240e - 1);
        if (Character.isLowSurrogate(this.f2241f)) {
            int codePointBefore = Character.codePointBefore(this.f2237b, this.f2240e);
            this.f2240e -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f2240e--;
        byte m1586a = m1586a(this.f2241f);
        if (!this.f2238c) {
            return m1586a;
        }
        if (this.f2241f == '>') {
            return m1588d();
        }
        return this.f2241f == ';' ? m1589e() : m1586a;
    }

    /* renamed from: d */
    private byte m1588d() {
        int i = this.f2240e;
        while (this.f2240e > 0) {
            CharSequence charSequence = this.f2237b;
            int i2 = this.f2240e - 1;
            this.f2240e = i2;
            this.f2241f = charSequence.charAt(i2);
            if (this.f2241f != '<') {
                if (this.f2241f == '>') {
                    break;
                }
                if (this.f2241f == '\"' || this.f2241f == '\'') {
                    char c = this.f2241f;
                    while (this.f2240e > 0) {
                        CharSequence charSequence2 = this.f2237b;
                        int i3 = this.f2240e - 1;
                        this.f2240e = i3;
                        char charAt = charSequence2.charAt(i3);
                        this.f2241f = charAt;
                        if (charAt == c) {
                            break;
                        }
                    }
                }
            } else {
                return (byte) 12;
            }
        }
        this.f2240e = i;
        this.f2241f = '>';
        return (byte) 13;
    }

    /* renamed from: e */
    private byte m1589e() {
        int i = this.f2240e;
        while (this.f2240e > 0) {
            CharSequence charSequence = this.f2237b;
            int i2 = this.f2240e - 1;
            this.f2240e = i2;
            this.f2241f = charSequence.charAt(i2);
            if (this.f2241f == '&') {
                return (byte) 12;
            }
            if (this.f2241f == ';') {
                break;
            }
        }
        this.f2240e = i;
        this.f2241f = ';';
        return (byte) 13;
    }
}
