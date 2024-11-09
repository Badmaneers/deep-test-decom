package com.google.p066a.p071d;

import com.google.p066a.p068b.AbstractC1988q;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* compiled from: JsonReader.java */
/* renamed from: com.google.a.d.a */
/* loaded from: classes.dex */
public class C2001a implements Closeable {

    /* renamed from: a */
    private static final char[] f8881a = ")]}'\n".toCharArray();

    /* renamed from: c */
    private final Reader f8883c;

    /* renamed from: l */
    private EnumC2005e f8892l;

    /* renamed from: m */
    private String f8893m;

    /* renamed from: n */
    private String f8894n;

    /* renamed from: o */
    private int f8895o;

    /* renamed from: p */
    private int f8896p;

    /* renamed from: q */
    private boolean f8897q;

    /* renamed from: b */
    private final C2009i f8882b = new C2009i();

    /* renamed from: d */
    private boolean f8884d = false;

    /* renamed from: e */
    private final char[] f8885e = new char[1024];

    /* renamed from: f */
    private int f8886f = 0;

    /* renamed from: g */
    private int f8887g = 0;

    /* renamed from: h */
    private int f8888h = 1;

    /* renamed from: i */
    private int f8889i = 1;

    /* renamed from: j */
    private EnumC2004d[] f8890j = new EnumC2004d[32];

    /* renamed from: k */
    private int f8891k = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ String m6184e(C2001a c2001a) {
        c2001a.f8893m = null;
        return null;
    }

    static {
        AbstractC1988q.f8855a = new C2002b();
    }

    public C2001a(Reader reader) {
        m6173a(EnumC2004d.EMPTY_DOCUMENT);
        this.f8897q = false;
        this.f8883c = reader;
    }

    /* renamed from: a */
    public final void m6195a(boolean z) {
        this.f8884d = z;
    }

    /* renamed from: p */
    public final boolean m6196p() {
        return this.f8884d;
    }

    /* renamed from: a */
    public void mo6076a() {
        m6174a(EnumC2005e.BEGIN_ARRAY);
    }

    /* renamed from: b */
    public void mo6077b() {
        m6174a(EnumC2005e.END_ARRAY);
    }

    /* renamed from: c */
    public void mo6078c() {
        m6174a(EnumC2005e.BEGIN_OBJECT);
    }

    /* renamed from: d */
    public void mo6079d() {
        m6174a(EnumC2005e.END_OBJECT);
    }

    /* renamed from: a */
    private void m6174a(EnumC2005e enumC2005e) {
        mo6081f();
        if (this.f8892l != enumC2005e) {
            throw new IllegalStateException("Expected " + enumC2005e + " but was " + mo6081f() + " at line " + m6188r() + " column " + m6189s());
        }
        m6186o();
    }

    /* renamed from: e */
    public boolean mo6080e() {
        mo6081f();
        return (this.f8892l == EnumC2005e.END_OBJECT || this.f8892l == EnumC2005e.END_ARRAY) ? false : true;
    }

    /* renamed from: f */
    public EnumC2005e mo6081f() {
        if (this.f8892l != null) {
            return this.f8892l;
        }
        int i = 0;
        switch (this.f8890j[this.f8891k - 1]) {
            case EMPTY_DOCUMENT:
                if (this.f8884d) {
                    m6182d(true);
                    this.f8886f--;
                    if (this.f8886f + f8881a.length <= this.f8887g || m6175a(f8881a.length)) {
                        while (true) {
                            if (i < f8881a.length) {
                                if (this.f8885e[this.f8886f + i] == f8881a[i]) {
                                    i++;
                                }
                            } else {
                                this.f8886f += f8881a.length;
                            }
                        }
                    }
                }
                this.f8890j[this.f8891k - 1] = EnumC2004d.NONEMPTY_DOCUMENT;
                EnumC2005e m6187q = m6187q();
                if (this.f8884d || this.f8892l == EnumC2005e.BEGIN_ARRAY || this.f8892l == EnumC2005e.BEGIN_OBJECT) {
                    return m6187q;
                }
                throw new IOException("Expected JSON document to start with '[' or '{' but was " + this.f8892l + " at line " + m6188r() + " column " + m6189s());
            case EMPTY_ARRAY:
                return m6178b(true);
            case NONEMPTY_ARRAY:
                return m6178b(false);
            case EMPTY_OBJECT:
                return m6181c(true);
            case DANGLING_NAME:
                int m6182d = m6182d(true);
                if (m6182d != 58) {
                    if (m6182d == 61) {
                        m6190t();
                        if ((this.f8886f < this.f8887g || m6175a(1)) && this.f8885e[this.f8886f] == '>') {
                            this.f8886f++;
                        }
                    } else {
                        throw m6179b("Expected ':'");
                    }
                }
                this.f8890j[this.f8891k - 1] = EnumC2004d.NONEMPTY_OBJECT;
                return m6187q();
            case NONEMPTY_OBJECT:
                return m6181c(false);
            case NONEMPTY_DOCUMENT:
                if (m6182d(false) == -1) {
                    return EnumC2005e.END_DOCUMENT;
                }
                this.f8886f--;
                if (!this.f8884d) {
                    throw m6179b("Expected EOF");
                }
                return m6187q();
            case CLOSED:
                throw new IllegalStateException("JsonReader is closed");
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: o */
    private EnumC2005e m6186o() {
        mo6081f();
        EnumC2005e enumC2005e = this.f8892l;
        this.f8892l = null;
        this.f8894n = null;
        this.f8893m = null;
        return enumC2005e;
    }

    /* renamed from: g */
    public String mo6082g() {
        mo6081f();
        if (this.f8892l != EnumC2005e.NAME) {
            throw new IllegalStateException("Expected a name but was " + mo6081f() + " at line " + m6188r() + " column " + m6189s());
        }
        String str = this.f8893m;
        m6186o();
        return str;
    }

    /* renamed from: h */
    public String mo6083h() {
        mo6081f();
        if (this.f8892l != EnumC2005e.STRING && this.f8892l != EnumC2005e.NUMBER) {
            throw new IllegalStateException("Expected a string but was " + mo6081f() + " at line " + m6188r() + " column " + m6189s());
        }
        String str = this.f8894n;
        m6186o();
        return str;
    }

    /* renamed from: i */
    public boolean mo6084i() {
        mo6081f();
        if (this.f8892l != EnumC2005e.BOOLEAN) {
            throw new IllegalStateException("Expected a boolean but was " + this.f8892l + " at line " + m6188r() + " column " + m6189s());
        }
        boolean z = this.f8894n == "true";
        m6186o();
        return z;
    }

    /* renamed from: j */
    public void mo6085j() {
        mo6081f();
        if (this.f8892l != EnumC2005e.NULL) {
            throw new IllegalStateException("Expected null but was " + this.f8892l + " at line " + m6188r() + " column " + m6189s());
        }
        m6186o();
    }

    /* renamed from: k */
    public double mo6086k() {
        mo6081f();
        if (this.f8892l != EnumC2005e.STRING && this.f8892l != EnumC2005e.NUMBER) {
            throw new IllegalStateException("Expected a double but was " + this.f8892l + " at line " + m6188r() + " column " + m6189s());
        }
        double parseDouble = Double.parseDouble(this.f8894n);
        if (parseDouble >= 1.0d && this.f8894n.startsWith("0")) {
            throw new C2008h("JSON forbids octal prefixes: " + this.f8894n + " at line " + m6188r() + " column " + m6189s());
        }
        if (!this.f8884d && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new C2008h("JSON forbids NaN and infinities: " + this.f8894n + " at line " + m6188r() + " column " + m6189s());
        }
        m6186o();
        return parseDouble;
    }

    /* renamed from: l */
    public long mo6087l() {
        long j;
        mo6081f();
        if (this.f8892l != EnumC2005e.STRING && this.f8892l != EnumC2005e.NUMBER) {
            throw new IllegalStateException("Expected a long but was " + this.f8892l + " at line " + m6188r() + " column " + m6189s());
        }
        try {
            j = Long.parseLong(this.f8894n);
        } catch (NumberFormatException unused) {
            double parseDouble = Double.parseDouble(this.f8894n);
            long j2 = (long) parseDouble;
            if (j2 != parseDouble) {
                throw new NumberFormatException("Expected a long but was " + this.f8894n + " at line " + m6188r() + " column " + m6189s());
            }
            j = j2;
        }
        if (j >= 1 && this.f8894n.startsWith("0")) {
            throw new C2008h("JSON forbids octal prefixes: " + this.f8894n + " at line " + m6188r() + " column " + m6189s());
        }
        m6186o();
        return j;
    }

    /* renamed from: m */
    public int mo6088m() {
        int i;
        mo6081f();
        if (this.f8892l != EnumC2005e.STRING && this.f8892l != EnumC2005e.NUMBER) {
            throw new IllegalStateException("Expected an int but was " + this.f8892l + " at line " + m6188r() + " column " + m6189s());
        }
        try {
            i = Integer.parseInt(this.f8894n);
        } catch (NumberFormatException unused) {
            double parseDouble = Double.parseDouble(this.f8894n);
            int i2 = (int) parseDouble;
            if (i2 != parseDouble) {
                throw new NumberFormatException("Expected an int but was " + this.f8894n + " at line " + m6188r() + " column " + m6189s());
            }
            i = i2;
        }
        if (i >= 1 && this.f8894n.startsWith("0")) {
            throw new C2008h("JSON forbids octal prefixes: " + this.f8894n + " at line " + m6188r() + " column " + m6189s());
        }
        m6186o();
        return i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8894n = null;
        this.f8892l = null;
        this.f8890j[0] = EnumC2004d.CLOSED;
        this.f8891k = 1;
        this.f8883c.close();
    }

    /* renamed from: n */
    public void mo6089n() {
        this.f8897q = true;
        int i = 0;
        do {
            try {
                EnumC2005e m6186o = m6186o();
                if (m6186o != EnumC2005e.BEGIN_ARRAY && m6186o != EnumC2005e.BEGIN_OBJECT) {
                    if (m6186o == EnumC2005e.END_ARRAY || m6186o == EnumC2005e.END_OBJECT) {
                        i--;
                    }
                }
                i++;
            } finally {
                this.f8897q = false;
            }
        } while (i != 0);
    }

    /* renamed from: a */
    private void m6173a(EnumC2004d enumC2004d) {
        if (this.f8891k == this.f8890j.length) {
            EnumC2004d[] enumC2004dArr = new EnumC2004d[this.f8891k * 2];
            System.arraycopy(this.f8890j, 0, enumC2004dArr, 0, this.f8891k);
            this.f8890j = enumC2004dArr;
        }
        EnumC2004d[] enumC2004dArr2 = this.f8890j;
        int i = this.f8891k;
        this.f8891k = i + 1;
        enumC2004dArr2[i] = enumC2004d;
    }

    /* renamed from: b */
    private EnumC2005e m6178b(boolean z) {
        if (z) {
            this.f8890j[this.f8891k - 1] = EnumC2004d.NONEMPTY_ARRAY;
        } else {
            int m6182d = m6182d(true);
            if (m6182d != 44) {
                if (m6182d != 59) {
                    if (m6182d == 93) {
                        this.f8891k--;
                        EnumC2005e enumC2005e = EnumC2005e.END_ARRAY;
                        this.f8892l = enumC2005e;
                        return enumC2005e;
                    }
                    throw m6179b("Unterminated array");
                }
                m6190t();
            }
        }
        int m6182d2 = m6182d(true);
        if (m6182d2 != 44 && m6182d2 != 59) {
            if (m6182d2 != 93) {
                this.f8886f--;
                return m6187q();
            }
            if (z) {
                this.f8891k--;
                EnumC2005e enumC2005e2 = EnumC2005e.END_ARRAY;
                this.f8892l = enumC2005e2;
                return enumC2005e2;
            }
        }
        m6190t();
        this.f8886f--;
        this.f8894n = "null";
        EnumC2005e enumC2005e3 = EnumC2005e.NULL;
        this.f8892l = enumC2005e3;
        return enumC2005e3;
    }

    /* renamed from: c */
    private EnumC2005e m6181c(boolean z) {
        if (z) {
            if (m6182d(true) == 125) {
                this.f8891k--;
                EnumC2005e enumC2005e = EnumC2005e.END_OBJECT;
                this.f8892l = enumC2005e;
                return enumC2005e;
            }
            this.f8886f--;
        } else {
            int m6182d = m6182d(true);
            if (m6182d != 44 && m6182d != 59) {
                if (m6182d == 125) {
                    this.f8891k--;
                    EnumC2005e enumC2005e2 = EnumC2005e.END_OBJECT;
                    this.f8892l = enumC2005e2;
                    return enumC2005e2;
                }
                throw m6179b("Unterminated object");
            }
        }
        int m6182d2 = m6182d(true);
        if (m6182d2 != 34) {
            if (m6182d2 == 39) {
                m6190t();
            } else {
                m6190t();
                this.f8886f--;
                this.f8893m = m6185e(false);
                if (this.f8893m.length() == 0) {
                    throw m6179b("Expected name");
                }
                this.f8890j[this.f8891k - 1] = EnumC2004d.DANGLING_NAME;
                EnumC2005e enumC2005e3 = EnumC2005e.NAME;
                this.f8892l = enumC2005e3;
                return enumC2005e3;
            }
        }
        this.f8893m = m6171a((char) m6182d2);
        this.f8890j[this.f8891k - 1] = EnumC2004d.DANGLING_NAME;
        EnumC2005e enumC2005e32 = EnumC2005e.NAME;
        this.f8892l = enumC2005e32;
        return enumC2005e32;
    }

    /* renamed from: q */
    private EnumC2005e m6187q() {
        int m6182d = m6182d(true);
        if (m6182d != 34) {
            if (m6182d != 39) {
                if (m6182d == 91) {
                    m6173a(EnumC2004d.EMPTY_ARRAY);
                    EnumC2005e enumC2005e = EnumC2005e.BEGIN_ARRAY;
                    this.f8892l = enumC2005e;
                    return enumC2005e;
                }
                if (m6182d == 123) {
                    m6173a(EnumC2004d.EMPTY_OBJECT);
                    EnumC2005e enumC2005e2 = EnumC2005e.BEGIN_OBJECT;
                    this.f8892l = enumC2005e2;
                    return enumC2005e2;
                }
                this.f8886f--;
                return m6193w();
            }
            m6190t();
        }
        this.f8894n = m6171a((char) m6182d);
        EnumC2005e enumC2005e3 = EnumC2005e.STRING;
        this.f8892l = enumC2005e3;
        return enumC2005e3;
    }

    /* renamed from: a */
    private boolean m6175a(int i) {
        char[] cArr = this.f8885e;
        int i2 = this.f8888h;
        int i3 = this.f8889i;
        int i4 = this.f8886f;
        int i5 = i3;
        int i6 = i2;
        for (int i7 = 0; i7 < i4; i7++) {
            if (cArr[i7] == '\n') {
                i6++;
                i5 = 1;
            } else {
                i5++;
            }
        }
        this.f8888h = i6;
        this.f8889i = i5;
        if (this.f8887g != this.f8886f) {
            this.f8887g -= this.f8886f;
            System.arraycopy(cArr, this.f8886f, cArr, 0, this.f8887g);
        } else {
            this.f8887g = 0;
        }
        this.f8886f = 0;
        do {
            int read = this.f8883c.read(cArr, this.f8887g, cArr.length - this.f8887g);
            if (read == -1) {
                return false;
            }
            this.f8887g += read;
            if (this.f8888h == 1 && this.f8889i == 1 && this.f8887g > 0 && cArr[0] == 65279) {
                this.f8886f++;
                this.f8889i--;
            }
        } while (this.f8887g < i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public int m6188r() {
        int i = this.f8888h;
        for (int i2 = 0; i2 < this.f8886f; i2++) {
            if (this.f8885e[i2] == '\n') {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public int m6189s() {
        int i = this.f8889i;
        for (int i2 = 0; i2 < this.f8886f; i2++) {
            i = this.f8885e[i2] == '\n' ? 1 : i + 1;
        }
        return i;
    }

    /* renamed from: d */
    private int m6182d(boolean z) {
        char[] cArr = this.f8885e;
        int i = this.f8886f;
        int i2 = this.f8887g;
        while (true) {
            if (i == i2) {
                this.f8886f = i;
                if (!m6175a(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input at line " + m6188r() + " column " + m6189s());
                }
                i = this.f8886f;
                i2 = this.f8887g;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c != '\r' && c != ' ') {
                if (c == '#') {
                    this.f8886f = i3;
                    m6190t();
                    m6191u();
                    i = this.f8886f;
                    i2 = this.f8887g;
                } else if (c == '/') {
                    this.f8886f = i3;
                    if (i3 == i2) {
                        this.f8886f--;
                        boolean m6175a = m6175a(2);
                        this.f8886f++;
                        if (!m6175a) {
                            return c;
                        }
                    }
                    m6190t();
                    char c2 = cArr[this.f8886f];
                    if (c2 == '*') {
                        this.f8886f++;
                        if (!m6176a("*/")) {
                            throw m6179b("Unterminated comment");
                        }
                        i = this.f8886f + 2;
                        i2 = this.f8887g;
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f8886f++;
                        m6191u();
                        i = this.f8886f;
                        i2 = this.f8887g;
                    }
                } else {
                    switch (c) {
                        case '\t':
                        case '\n':
                            break;
                        default:
                            this.f8886f = i3;
                            return c;
                    }
                }
            }
            i = i3;
        }
    }

    /* renamed from: t */
    private void m6190t() {
        if (!this.f8884d) {
            throw m6179b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: u */
    private void m6191u() {
        char c;
        do {
            if (this.f8886f >= this.f8887g && !m6175a(1)) {
                return;
            }
            char[] cArr = this.f8885e;
            int i = this.f8886f;
            this.f8886f = i + 1;
            c = cArr[i];
            if (c == '\r') {
                return;
            }
        } while (c != '\n');
    }

    /* renamed from: a */
    private boolean m6176a(String str) {
        int i;
        while (true) {
            if (this.f8886f + str.length() > this.f8887g && !m6175a(str.length())) {
                return false;
            }
            while (i < str.length()) {
                i = this.f8885e[this.f8886f + i] == str.charAt(i) ? i + 1 : 0;
            }
            return true;
            this.f8886f++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:            if (r1 != null) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:            r1 = new java.lang.StringBuilder();     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:            r1.append(r0, r4, r2 - r4);        r8.f8886f = r2;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m6171a(char r9) {
        /*
            r8 = this;
            char[] r0 = r8.f8885e
            r1 = 0
        L3:
            int r2 = r8.f8886f
            int r3 = r8.f8887g
        L7:
            r4 = r2
        L8:
            r5 = 1
            if (r2 >= r3) goto L4f
            int r6 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r9) goto L2f
            r8.f8886f = r6
            boolean r9 = r8.f8897q
            if (r9 == 0) goto L1a
            java.lang.String r8 = "skipped!"
            return r8
        L1a:
            if (r1 != 0) goto L25
            com.google.a.d.i r8 = r8.f8882b
            int r6 = r6 - r4
            int r6 = r6 - r5
            java.lang.String r8 = r8.m6213a(r0, r4, r6)
            return r8
        L25:
            int r6 = r6 - r4
            int r6 = r6 - r5
            r1.append(r0, r4, r6)
            java.lang.String r8 = r1.toString()
            return r8
        L2f:
            r7 = 92
            if (r2 != r7) goto L4d
            r8.f8886f = r6
            if (r1 != 0) goto L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L3c:
            int r6 = r6 - r4
            int r6 = r6 - r5
            r1.append(r0, r4, r6)
            char r2 = r8.m6192v()
            r1.append(r2)
            int r2 = r8.f8886f
            int r3 = r8.f8887g
            goto L7
        L4d:
            r2 = r6
            goto L8
        L4f:
            if (r1 != 0) goto L56
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L56:
            int r3 = r2 - r4
            r1.append(r0, r4, r3)
            r8.f8886f = r2
            boolean r2 = r8.m6175a(r5)
            if (r2 == 0) goto L64
            goto L3
        L64:
            java.lang.String r9 = "Unterminated string"
            java.io.IOException r8 = r8.m6179b(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p066a.p071d.C2001a.m6171a(char):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0017. Please report as an issue. */
    /* renamed from: e */
    private String m6185e(boolean z) {
        this.f8895o = -1;
        int i = 0;
        this.f8896p = 0;
        String str = null;
        int i2 = 0;
        StringBuilder sb = null;
        while (true) {
            if (this.f8886f + i2 < this.f8887g) {
                switch (this.f8885e[this.f8886f + i2]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        m6190t();
                        break;
                    default:
                        i2++;
                }
            } else if (i2 < this.f8885e.length) {
                if (!m6175a(i2 + 1)) {
                    this.f8885e[this.f8887g] = 0;
                }
            } else {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f8885e, this.f8886f, i2);
                this.f8896p += i2;
                this.f8886f += i2;
                if (m6175a(1)) {
                    i2 = 0;
                }
            }
        }
        i = i2;
        if (z && sb == null) {
            this.f8895o = this.f8886f;
        } else if (this.f8897q) {
            str = "skipped!";
        } else if (sb == null) {
            str = this.f8882b.m6213a(this.f8885e, this.f8886f, i);
        } else {
            sb.append(this.f8885e, this.f8886f, i);
            str = sb.toString();
        }
        this.f8896p += i;
        this.f8886f += i;
        return str;
    }

    public String toString() {
        return getClass().getSimpleName() + " at line " + m6188r() + " column " + m6189s();
    }

    /* renamed from: v */
    private char m6192v() {
        int i;
        if (this.f8886f == this.f8887g && !m6175a(1)) {
            throw m6179b("Unterminated escape sequence");
        }
        char[] cArr = this.f8885e;
        int i2 = this.f8886f;
        this.f8886f = i2 + 1;
        char c = cArr[i2];
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        switch (c) {
            case 't':
                return '\t';
            case 'u':
                if (this.f8886f + 4 > this.f8887g && !m6175a(4)) {
                    throw m6179b("Unterminated escape sequence");
                }
                char c2 = 0;
                int i3 = this.f8886f;
                int i4 = i3 + 4;
                while (i3 < i4) {
                    char c3 = this.f8885e[i3];
                    char c4 = (char) (c2 << 4);
                    if (c3 >= '0' && c3 <= '9') {
                        i = c3 - '0';
                    } else if (c3 >= 'a' && c3 <= 'f') {
                        i = (c3 - 'a') + 10;
                    } else {
                        if (c3 < 'A' || c3 > 'F') {
                            throw new NumberFormatException("\\u" + this.f8882b.m6213a(this.f8885e, this.f8886f, 4));
                        }
                        i = (c3 - 'A') + 10;
                    }
                    c2 = (char) (c4 + i);
                    i3++;
                }
                this.f8886f += 4;
                return c2;
            default:
                return c;
        }
    }

    /* renamed from: w */
    private EnumC2005e m6193w() {
        this.f8894n = m6185e(true);
        if (this.f8896p == 0) {
            throw m6179b("Expected literal value");
        }
        this.f8892l = m6194x();
        if (this.f8892l == EnumC2005e.STRING) {
            m6190t();
        }
        return this.f8892l;
    }

    /* renamed from: x */
    private EnumC2005e m6194x() {
        if (this.f8895o == -1) {
            return EnumC2005e.STRING;
        }
        if (this.f8896p == 4 && (('n' == this.f8885e[this.f8895o] || 'N' == this.f8885e[this.f8895o]) && (('u' == this.f8885e[this.f8895o + 1] || 'U' == this.f8885e[this.f8895o + 1]) && (('l' == this.f8885e[this.f8895o + 2] || 'L' == this.f8885e[this.f8895o + 2]) && ('l' == this.f8885e[this.f8895o + 3] || 'L' == this.f8885e[this.f8895o + 3]))))) {
            this.f8894n = "null";
            return EnumC2005e.NULL;
        }
        if (this.f8896p == 4 && (('t' == this.f8885e[this.f8895o] || 'T' == this.f8885e[this.f8895o]) && (('r' == this.f8885e[this.f8895o + 1] || 'R' == this.f8885e[this.f8895o + 1]) && (('u' == this.f8885e[this.f8895o + 2] || 'U' == this.f8885e[this.f8895o + 2]) && ('e' == this.f8885e[this.f8895o + 3] || 'E' == this.f8885e[this.f8895o + 3]))))) {
            this.f8894n = "true";
            return EnumC2005e.BOOLEAN;
        }
        if (this.f8896p == 5 && (('f' == this.f8885e[this.f8895o] || 'F' == this.f8885e[this.f8895o]) && (('a' == this.f8885e[this.f8895o + 1] || 'A' == this.f8885e[this.f8895o + 1]) && (('l' == this.f8885e[this.f8895o + 2] || 'L' == this.f8885e[this.f8895o + 2]) && (('s' == this.f8885e[this.f8895o + 3] || 'S' == this.f8885e[this.f8895o + 3]) && ('e' == this.f8885e[this.f8895o + 4] || 'E' == this.f8885e[this.f8895o + 4])))))) {
            this.f8894n = "false";
            return EnumC2005e.BOOLEAN;
        }
        this.f8894n = this.f8882b.m6213a(this.f8885e, this.f8895o, this.f8896p);
        return m6170a(this.f8885e, this.f8895o, this.f8896p);
    }

    /* renamed from: a */
    private static EnumC2005e m6170a(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        char c;
        char c2 = cArr[i];
        if (c2 == '-') {
            int i5 = i + 1;
            i3 = i5;
            c2 = cArr[i5];
        } else {
            i3 = i;
        }
        if (c2 == '0') {
            i4 = i3 + 1;
            c = cArr[i4];
        } else if (c2 >= '1' && c2 <= '9') {
            i4 = i3 + 1;
            c = cArr[i4];
            while (c >= '0' && c <= '9') {
                i4++;
                c = cArr[i4];
            }
        } else {
            return EnumC2005e.STRING;
        }
        if (c == '.') {
            i4++;
            c = cArr[i4];
            while (c >= '0' && c <= '9') {
                i4++;
                c = cArr[i4];
            }
        }
        if (c == 'e' || c == 'E') {
            int i6 = i4 + 1;
            char c3 = cArr[i6];
            if (c3 == '+' || c3 == '-') {
                i6++;
                c3 = cArr[i6];
            }
            if (c3 >= '0' && c3 <= '9') {
                i4 = i6 + 1;
                char c4 = cArr[i4];
                while (c4 >= '0' && c4 <= '9') {
                    i4++;
                    c4 = cArr[i4];
                }
            } else {
                return EnumC2005e.STRING;
            }
        }
        if (i4 == i + i2) {
            return EnumC2005e.NUMBER;
        }
        return EnumC2005e.STRING;
    }

    /* renamed from: b */
    private IOException m6179b(String str) {
        throw new C2008h(str + " at line " + m6188r() + " column " + m6189s());
    }
}
