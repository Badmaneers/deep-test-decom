package com.google.p066a.p071d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonWriter.java */
/* renamed from: com.google.a.d.f */
/* loaded from: classes.dex */
public class C2006f implements Closeable, Flushable {

    /* renamed from: a */
    private static final String[] f8919a = new String[128];

    /* renamed from: b */
    private static final String[] f8920b;

    /* renamed from: c */
    private final Writer f8921c;

    /* renamed from: d */
    private final List<EnumC2004d> f8922d = new ArrayList();

    /* renamed from: e */
    private String f8923e;

    /* renamed from: f */
    private String f8924f;

    /* renamed from: g */
    private boolean f8925g;

    /* renamed from: h */
    private boolean f8926h;

    /* renamed from: i */
    private String f8927i;

    /* renamed from: j */
    private boolean f8928j;

    static {
        for (int i = 0; i <= 31; i++) {
            f8919a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        f8919a[34] = "\\\"";
        f8919a[92] = "\\\\";
        f8919a[9] = "\\t";
        f8919a[8] = "\\b";
        f8919a[10] = "\\n";
        f8919a[13] = "\\r";
        f8919a[12] = "\\f";
        String[] strArr = (String[]) f8919a.clone();
        f8920b = strArr;
        strArr[60] = "\\u003c";
        f8920b[62] = "\\u003e";
        f8920b[38] = "\\u0026";
        f8920b[61] = "\\u003d";
        f8920b[39] = "\\u0027";
    }

    public C2006f(Writer writer) {
        this.f8922d.add(EnumC2004d.EMPTY_DOCUMENT);
        this.f8924f = ":";
        this.f8928j = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f8921c = writer;
    }

    /* renamed from: c */
    public final void m6207c(String str) {
        if (str.length() == 0) {
            this.f8923e = null;
            this.f8924f = ":";
        } else {
            this.f8923e = str;
            this.f8924f = ": ";
        }
    }

    /* renamed from: b */
    public final void m6206b(boolean z) {
        this.f8925g = z;
    }

    /* renamed from: g */
    public final boolean m6210g() {
        return this.f8925g;
    }

    /* renamed from: c */
    public final void m6208c(boolean z) {
        this.f8926h = z;
    }

    /* renamed from: h */
    public final boolean m6211h() {
        return this.f8926h;
    }

    /* renamed from: d */
    public final void m6209d(boolean z) {
        this.f8928j = z;
    }

    /* renamed from: i */
    public final boolean m6212i() {
        return this.f8928j;
    }

    /* renamed from: b */
    public C2006f mo6098b() {
        m6203j();
        return m6199a(EnumC2004d.EMPTY_ARRAY, "[");
    }

    /* renamed from: c */
    public C2006f mo6100c() {
        return m6198a(EnumC2004d.EMPTY_ARRAY, EnumC2004d.NONEMPTY_ARRAY, "]");
    }

    /* renamed from: d */
    public C2006f mo6101d() {
        m6203j();
        return m6199a(EnumC2004d.EMPTY_OBJECT, "{");
    }

    /* renamed from: e */
    public C2006f mo6102e() {
        return m6198a(EnumC2004d.EMPTY_OBJECT, EnumC2004d.NONEMPTY_OBJECT, "}");
    }

    /* renamed from: a */
    private C2006f m6199a(EnumC2004d enumC2004d, String str) {
        m6202e(true);
        this.f8922d.add(enumC2004d);
        this.f8921c.write(str);
        return this;
    }

    /* renamed from: a */
    private C2006f m6198a(EnumC2004d enumC2004d, EnumC2004d enumC2004d2, String str) {
        EnumC2004d m6197a = m6197a();
        if (m6197a != enumC2004d2 && m6197a != enumC2004d) {
            throw new IllegalStateException("Nesting problem: " + this.f8922d);
        }
        if (this.f8927i != null) {
            throw new IllegalStateException("Dangling name: " + this.f8927i);
        }
        this.f8922d.remove(this.f8922d.size() - 1);
        if (m6197a == enumC2004d2) {
            m6204k();
        }
        this.f8921c.write(str);
        return this;
    }

    /* renamed from: a */
    private EnumC2004d m6197a() {
        int size = this.f8922d.size();
        if (size == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.f8922d.get(size - 1);
    }

    /* renamed from: a */
    private void m6200a(EnumC2004d enumC2004d) {
        this.f8922d.set(this.f8922d.size() - 1, enumC2004d);
    }

    /* renamed from: a */
    public C2006f mo6095a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f8927i != null) {
            throw new IllegalStateException();
        }
        if (this.f8922d.isEmpty()) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f8927i = str;
        return this;
    }

    /* renamed from: j */
    private void m6203j() {
        if (this.f8927i != null) {
            m6205l();
            m6201d(this.f8927i);
            this.f8927i = null;
        }
    }

    /* renamed from: b */
    public C2006f mo6099b(String str) {
        if (str == null) {
            return mo6103f();
        }
        m6203j();
        m6202e(false);
        m6201d(str);
        return this;
    }

    /* renamed from: f */
    public C2006f mo6103f() {
        if (this.f8927i != null) {
            if (this.f8928j) {
                m6203j();
            } else {
                this.f8927i = null;
                return this;
            }
        }
        m6202e(false);
        this.f8921c.write("null");
        return this;
    }

    /* renamed from: a */
    public C2006f mo6096a(boolean z) {
        m6203j();
        m6202e(false);
        this.f8921c.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public C2006f mo6093a(long j) {
        m6203j();
        m6202e(false);
        this.f8921c.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C2006f mo6094a(Number number) {
        if (number == null) {
            return mo6103f();
        }
        m6203j();
        String obj = number.toString();
        if (!this.f8925g && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        m6202e(false);
        this.f8921c.append((CharSequence) obj);
        return this;
    }

    public void flush() {
        if (this.f8922d.isEmpty()) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f8921c.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8921c.close();
        int size = this.f8922d.size();
        if (size > 1 || (size == 1 && this.f8922d.get(size - 1) != EnumC2004d.NONEMPTY_DOCUMENT)) {
            throw new IOException("Incomplete document");
        }
        this.f8922d.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6201d(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.f8926h
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.p066a.p071d.C2006f.f8920b
            goto L9
        L7:
            java.lang.String[] r0 = com.google.p066a.p071d.C2006f.f8919a
        L9:
            java.io.Writer r1 = r7.f8921c
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r8.length()
            r2 = 0
            r3 = r2
        L16:
            if (r2 >= r1) goto L45
            char r4 = r8.charAt(r2)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 >= r5) goto L25
            r4 = r0[r4]
            if (r4 != 0) goto L32
            goto L42
        L25:
            r5 = 8232(0x2028, float:1.1535E-41)
            if (r4 != r5) goto L2c
            java.lang.String r4 = "\\u2028"
            goto L32
        L2c:
            r5 = 8233(0x2029, float:1.1537E-41)
            if (r4 != r5) goto L42
            java.lang.String r4 = "\\u2029"
        L32:
            if (r3 >= r2) goto L3b
            java.io.Writer r5 = r7.f8921c
            int r6 = r2 - r3
            r5.write(r8, r3, r6)
        L3b:
            java.io.Writer r3 = r7.f8921c
            r3.write(r4)
            int r3 = r2 + 1
        L42:
            int r2 = r2 + 1
            goto L16
        L45:
            if (r3 >= r1) goto L4d
            java.io.Writer r0 = r7.f8921c
            int r1 = r1 - r3
            r0.write(r8, r3, r1)
        L4d:
            java.io.Writer r7 = r7.f8921c
            java.lang.String r8 = "\""
            r7.write(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p066a.p071d.C2006f.m6201d(java.lang.String):void");
    }

    /* renamed from: k */
    private void m6204k() {
        if (this.f8923e == null) {
            return;
        }
        this.f8921c.write("\n");
        for (int i = 1; i < this.f8922d.size(); i++) {
            this.f8921c.write(this.f8923e);
        }
    }

    /* renamed from: l */
    private void m6205l() {
        EnumC2004d m6197a = m6197a();
        if (m6197a == EnumC2004d.NONEMPTY_OBJECT) {
            this.f8921c.write(44);
        } else if (m6197a != EnumC2004d.EMPTY_OBJECT) {
            throw new IllegalStateException("Nesting problem: " + this.f8922d);
        }
        m6204k();
        m6200a(EnumC2004d.DANGLING_NAME);
    }

    /* renamed from: e */
    private void m6202e(boolean z) {
        switch (m6197a()) {
            case NONEMPTY_DOCUMENT:
                if (!this.f8925g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
            case EMPTY_DOCUMENT:
                break;
            case EMPTY_ARRAY:
                m6200a(EnumC2004d.NONEMPTY_ARRAY);
                m6204k();
                return;
            case NONEMPTY_ARRAY:
                this.f8921c.append(',');
                m6204k();
                return;
            case DANGLING_NAME:
                this.f8921c.append((CharSequence) this.f8924f);
                m6200a(EnumC2004d.NONEMPTY_OBJECT);
                return;
            default:
                throw new IllegalStateException("Nesting problem: " + this.f8922d);
        }
        if (!this.f8925g && !z) {
            throw new IllegalStateException("JSON must start with an array or an object.");
        }
        m6200a(EnumC2004d.NONEMPTY_DOCUMENT);
    }
}
