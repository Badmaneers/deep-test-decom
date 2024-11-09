package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.AbstractC2026u;
import com.google.p066a.InterfaceC1903ag;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.y */
/* loaded from: classes.dex */
public final class C1962y {

    /* renamed from: a */
    public static final AbstractC1902af<Class> f8778a = new C1963z();

    /* renamed from: b */
    public static final InterfaceC1903ag f8779b = m6111a(Class.class, f8778a);

    /* renamed from: c */
    public static final AbstractC1902af<BitSet> f8780c = new C1917ak();

    /* renamed from: d */
    public static final InterfaceC1903ag f8781d = m6111a(BitSet.class, f8780c);

    /* renamed from: e */
    public static final AbstractC1902af<Boolean> f8782e = new C1928av();

    /* renamed from: f */
    public static final AbstractC1902af<Boolean> f8783f = new C1932az();

    /* renamed from: g */
    public static final InterfaceC1903ag f8784g = m6112a(Boolean.TYPE, Boolean.class, f8782e);

    /* renamed from: h */
    public static final AbstractC1902af<Number> f8785h = new C1934ba();

    /* renamed from: i */
    public static final InterfaceC1903ag f8786i = m6112a(Byte.TYPE, Byte.class, f8785h);

    /* renamed from: j */
    public static final AbstractC1902af<Number> f8787j = new C1935bb();

    /* renamed from: k */
    public static final InterfaceC1903ag f8788k = m6112a(Short.TYPE, Short.class, f8787j);

    /* renamed from: l */
    public static final AbstractC1902af<Number> f8789l = new C1936bc();

    /* renamed from: m */
    public static final InterfaceC1903ag f8790m = m6112a(Integer.TYPE, Integer.class, f8789l);

    /* renamed from: n */
    public static final AbstractC1902af<Number> f8791n = new C1937bd();

    /* renamed from: o */
    public static final AbstractC1902af<Number> f8792o = new C1938be();

    /* renamed from: p */
    public static final AbstractC1902af<Number> f8793p = new C1907aa();

    /* renamed from: q */
    public static final AbstractC1902af<Number> f8794q = new C1908ab();

    /* renamed from: r */
    public static final InterfaceC1903ag f8795r = m6111a(Number.class, f8794q);

    /* renamed from: s */
    public static final AbstractC1902af<Character> f8796s = new C1909ac();

    /* renamed from: t */
    public static final InterfaceC1903ag f8797t = m6112a(Character.TYPE, Character.class, f8796s);

    /* renamed from: u */
    public static final AbstractC1902af<String> f8798u = new C1910ad();

    /* renamed from: v */
    public static final AbstractC1902af<BigDecimal> f8799v = new C1911ae();

    /* renamed from: w */
    public static final AbstractC1902af<BigInteger> f8800w = new C1912af();

    /* renamed from: x */
    public static final InterfaceC1903ag f8801x = m6111a(String.class, f8798u);

    /* renamed from: y */
    public static final AbstractC1902af<StringBuilder> f8802y = new C1913ag();

    /* renamed from: z */
    public static final InterfaceC1903ag f8803z = m6111a(StringBuilder.class, f8802y);

    /* renamed from: A */
    public static final AbstractC1902af<StringBuffer> f8760A = new C1914ah();

    /* renamed from: B */
    public static final InterfaceC1903ag f8761B = m6111a(StringBuffer.class, f8760A);

    /* renamed from: C */
    public static final AbstractC1902af<URL> f8762C = new C1915ai();

    /* renamed from: D */
    public static final InterfaceC1903ag f8763D = m6111a(URL.class, f8762C);

    /* renamed from: E */
    public static final AbstractC1902af<URI> f8764E = new C1916aj();

    /* renamed from: F */
    public static final InterfaceC1903ag f8765F = m6111a(URI.class, f8764E);

    /* renamed from: G */
    public static final AbstractC1902af<InetAddress> f8766G = new C1918al();

    /* renamed from: H */
    public static final InterfaceC1903ag f8767H = new C1930ax(InetAddress.class, f8766G);

    /* renamed from: I */
    public static final AbstractC1902af<UUID> f8768I = new C1919am();

    /* renamed from: J */
    public static final InterfaceC1903ag f8769J = m6111a(UUID.class, f8768I);

    /* renamed from: K */
    public static final InterfaceC1903ag f8770K = new C1920an();

    /* renamed from: L */
    public static final AbstractC1902af<Calendar> f8771L = new C1922ap();

    /* renamed from: M */
    public static final InterfaceC1903ag f8772M = new C1929aw(Calendar.class, GregorianCalendar.class, f8771L);

    /* renamed from: N */
    public static final AbstractC1902af<Locale> f8773N = new C1923aq();

    /* renamed from: O */
    public static final InterfaceC1903ag f8774O = m6111a(Locale.class, f8773N);

    /* renamed from: P */
    public static final AbstractC1902af<AbstractC2026u> f8775P = new C1924ar();

    /* renamed from: Q */
    public static final InterfaceC1903ag f8776Q = m6111a(AbstractC2026u.class, f8775P);

    /* renamed from: R */
    public static final InterfaceC1903ag f8777R = new C1925as();

    /* renamed from: a */
    public static <TT> InterfaceC1903ag m6111a(Class<TT> cls, AbstractC1902af<TT> abstractC1902af) {
        return new C1926at(cls, abstractC1902af);
    }

    /* renamed from: a */
    public static <TT> InterfaceC1903ag m6112a(Class<TT> cls, Class<TT> cls2, AbstractC1902af<? super TT> abstractC1902af) {
        return new C1927au(cls, cls2, abstractC1902af);
    }
}
