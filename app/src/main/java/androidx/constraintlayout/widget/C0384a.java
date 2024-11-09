package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.p014a.p015a.C0357j;
import androidx.constraintlayout.p014a.p015a.C0362o;

/* compiled from: ConstraintLayout.java */
/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public class C0384a extends ViewGroup.MarginLayoutParams {

    /* renamed from: A */
    public float f1897A;

    /* renamed from: B */
    public String f1898B;

    /* renamed from: C */
    float f1899C;

    /* renamed from: D */
    int f1900D;

    /* renamed from: E */
    public float f1901E;

    /* renamed from: F */
    public float f1902F;

    /* renamed from: G */
    public int f1903G;

    /* renamed from: H */
    public int f1904H;

    /* renamed from: I */
    public int f1905I;

    /* renamed from: J */
    public int f1906J;

    /* renamed from: K */
    public int f1907K;

    /* renamed from: L */
    public int f1908L;

    /* renamed from: M */
    public int f1909M;

    /* renamed from: N */
    public int f1910N;

    /* renamed from: O */
    public float f1911O;

    /* renamed from: P */
    public float f1912P;

    /* renamed from: Q */
    public int f1913Q;

    /* renamed from: R */
    public int f1914R;

    /* renamed from: S */
    public int f1915S;

    /* renamed from: T */
    public boolean f1916T;

    /* renamed from: U */
    public boolean f1917U;

    /* renamed from: V */
    boolean f1918V;

    /* renamed from: W */
    boolean f1919W;

    /* renamed from: X */
    boolean f1920X;

    /* renamed from: Y */
    boolean f1921Y;

    /* renamed from: Z */
    boolean f1922Z;

    /* renamed from: a */
    public int f1923a;

    /* renamed from: aa */
    boolean f1924aa;

    /* renamed from: ab */
    int f1925ab;

    /* renamed from: ac */
    int f1926ac;

    /* renamed from: ad */
    int f1927ad;

    /* renamed from: ae */
    int f1928ae;

    /* renamed from: af */
    int f1929af;

    /* renamed from: ag */
    int f1930ag;

    /* renamed from: ah */
    float f1931ah;

    /* renamed from: ai */
    int f1932ai;

    /* renamed from: aj */
    int f1933aj;

    /* renamed from: ak */
    float f1934ak;

    /* renamed from: al */
    C0357j f1935al;

    /* renamed from: am */
    public boolean f1936am;

    /* renamed from: b */
    public int f1937b;

    /* renamed from: c */
    public float f1938c;

    /* renamed from: d */
    public int f1939d;

    /* renamed from: e */
    public int f1940e;

    /* renamed from: f */
    public int f1941f;

    /* renamed from: g */
    public int f1942g;

    /* renamed from: h */
    public int f1943h;

    /* renamed from: i */
    public int f1944i;

    /* renamed from: j */
    public int f1945j;

    /* renamed from: k */
    public int f1946k;

    /* renamed from: l */
    public int f1947l;

    /* renamed from: m */
    public int f1948m;

    /* renamed from: n */
    public int f1949n;

    /* renamed from: o */
    public float f1950o;

    /* renamed from: p */
    public int f1951p;

    /* renamed from: q */
    public int f1952q;

    /* renamed from: r */
    public int f1953r;

    /* renamed from: s */
    public int f1954s;

    /* renamed from: t */
    public int f1955t;

    /* renamed from: u */
    public int f1956u;

    /* renamed from: v */
    public int f1957v;

    /* renamed from: w */
    public int f1958w;

    /* renamed from: x */
    public int f1959x;

    /* renamed from: y */
    public int f1960y;

    /* renamed from: z */
    public float f1961z;

    public C0384a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f1923a = -1;
        this.f1937b = -1;
        this.f1938c = -1.0f;
        this.f1939d = -1;
        this.f1940e = -1;
        this.f1941f = -1;
        this.f1942g = -1;
        this.f1943h = -1;
        this.f1944i = -1;
        this.f1945j = -1;
        this.f1946k = -1;
        this.f1947l = -1;
        this.f1948m = -1;
        this.f1949n = 0;
        this.f1950o = 0.0f;
        this.f1951p = -1;
        this.f1952q = -1;
        this.f1953r = -1;
        this.f1954s = -1;
        this.f1955t = -1;
        this.f1956u = -1;
        this.f1957v = -1;
        this.f1958w = -1;
        this.f1959x = -1;
        this.f1960y = -1;
        this.f1961z = 0.5f;
        this.f1897A = 0.5f;
        this.f1898B = null;
        this.f1899C = 0.0f;
        this.f1900D = 1;
        this.f1901E = -1.0f;
        this.f1902F = -1.0f;
        this.f1903G = 0;
        this.f1904H = 0;
        this.f1905I = 0;
        this.f1906J = 0;
        this.f1907K = 0;
        this.f1908L = 0;
        this.f1909M = 0;
        this.f1910N = 0;
        this.f1911O = 1.0f;
        this.f1912P = 1.0f;
        this.f1913Q = -1;
        this.f1914R = -1;
        this.f1915S = -1;
        this.f1916T = false;
        this.f1917U = false;
        this.f1918V = true;
        this.f1919W = true;
        this.f1920X = false;
        this.f1921Y = false;
        this.f1922Z = false;
        this.f1924aa = false;
        this.f1925ab = -1;
        this.f1926ac = -1;
        this.f1927ad = -1;
        this.f1928ae = -1;
        this.f1929af = -1;
        this.f1930ag = -1;
        this.f1931ah = 0.5f;
        this.f1935al = new C0357j();
        this.f1936am = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = C0385b.f1962a.get(index);
            switch (i3) {
                case 0:
                    break;
                case 1:
                    this.f1915S = obtainStyledAttributes.getInt(index, this.f1915S);
                    break;
                case 2:
                    this.f1948m = obtainStyledAttributes.getResourceId(index, this.f1948m);
                    if (this.f1948m == -1) {
                        this.f1948m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.f1949n = obtainStyledAttributes.getDimensionPixelSize(index, this.f1949n);
                    break;
                case 4:
                    this.f1950o = obtainStyledAttributes.getFloat(index, this.f1950o) % 360.0f;
                    if (this.f1950o < 0.0f) {
                        this.f1950o = (360.0f - this.f1950o) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    this.f1923a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1923a);
                    break;
                case 6:
                    this.f1937b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1937b);
                    break;
                case 7:
                    this.f1938c = obtainStyledAttributes.getFloat(index, this.f1938c);
                    break;
                case 8:
                    this.f1939d = obtainStyledAttributes.getResourceId(index, this.f1939d);
                    if (this.f1939d == -1) {
                        this.f1939d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    this.f1940e = obtainStyledAttributes.getResourceId(index, this.f1940e);
                    if (this.f1940e == -1) {
                        this.f1940e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    this.f1941f = obtainStyledAttributes.getResourceId(index, this.f1941f);
                    if (this.f1941f == -1) {
                        this.f1941f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    this.f1942g = obtainStyledAttributes.getResourceId(index, this.f1942g);
                    if (this.f1942g == -1) {
                        this.f1942g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    this.f1943h = obtainStyledAttributes.getResourceId(index, this.f1943h);
                    if (this.f1943h == -1) {
                        this.f1943h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    this.f1944i = obtainStyledAttributes.getResourceId(index, this.f1944i);
                    if (this.f1944i == -1) {
                        this.f1944i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    this.f1945j = obtainStyledAttributes.getResourceId(index, this.f1945j);
                    if (this.f1945j == -1) {
                        this.f1945j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    this.f1946k = obtainStyledAttributes.getResourceId(index, this.f1946k);
                    if (this.f1946k == -1) {
                        this.f1946k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    this.f1947l = obtainStyledAttributes.getResourceId(index, this.f1947l);
                    if (this.f1947l == -1) {
                        this.f1947l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    this.f1951p = obtainStyledAttributes.getResourceId(index, this.f1951p);
                    if (this.f1951p == -1) {
                        this.f1951p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    this.f1952q = obtainStyledAttributes.getResourceId(index, this.f1952q);
                    if (this.f1952q == -1) {
                        this.f1952q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    this.f1953r = obtainStyledAttributes.getResourceId(index, this.f1953r);
                    if (this.f1953r == -1) {
                        this.f1953r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    this.f1954s = obtainStyledAttributes.getResourceId(index, this.f1954s);
                    if (this.f1954s == -1) {
                        this.f1954s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    this.f1955t = obtainStyledAttributes.getDimensionPixelSize(index, this.f1955t);
                    break;
                case 22:
                    this.f1956u = obtainStyledAttributes.getDimensionPixelSize(index, this.f1956u);
                    break;
                case 23:
                    this.f1957v = obtainStyledAttributes.getDimensionPixelSize(index, this.f1957v);
                    break;
                case 24:
                    this.f1958w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1958w);
                    break;
                case 25:
                    this.f1959x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1959x);
                    break;
                case 26:
                    this.f1960y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1960y);
                    break;
                case 27:
                    this.f1916T = obtainStyledAttributes.getBoolean(index, this.f1916T);
                    break;
                case 28:
                    this.f1917U = obtainStyledAttributes.getBoolean(index, this.f1917U);
                    break;
                case 29:
                    this.f1961z = obtainStyledAttributes.getFloat(index, this.f1961z);
                    break;
                case 30:
                    this.f1897A = obtainStyledAttributes.getFloat(index, this.f1897A);
                    break;
                case 31:
                    this.f1905I = obtainStyledAttributes.getInt(index, 0);
                    if (this.f1905I == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    this.f1906J = obtainStyledAttributes.getInt(index, 0);
                    if (this.f1906J == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        this.f1907K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1907K);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.f1907K) == -2) {
                            this.f1907K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        this.f1909M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1909M);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.f1909M) == -2) {
                            this.f1909M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    this.f1911O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1911O));
                    break;
                case 36:
                    try {
                        this.f1908L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1908L);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.f1908L) == -2) {
                            this.f1908L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        this.f1910N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1910N);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.f1910N) == -2) {
                            this.f1910N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    this.f1912P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1912P));
                    break;
                default:
                    switch (i3) {
                        case 44:
                            this.f1898B = obtainStyledAttributes.getString(index);
                            this.f1899C = Float.NaN;
                            this.f1900D = -1;
                            if (this.f1898B != null) {
                                int length = this.f1898B.length();
                                int indexOf = this.f1898B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String substring = this.f1898B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        this.f1900D = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        this.f1900D = 1;
                                    }
                                    i = indexOf + 1;
                                }
                                int indexOf2 = this.f1898B.indexOf(58);
                                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                    String substring2 = this.f1898B.substring(i, indexOf2);
                                    String substring3 = this.f1898B.substring(indexOf2 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring2);
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (this.f1900D == 1) {
                                                    this.f1899C = Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                } else {
                                                    this.f1899C = Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String substring4 = this.f1898B.substring(i);
                                    if (substring4.length() > 0) {
                                        this.f1899C = Float.parseFloat(substring4);
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            this.f1901E = obtainStyledAttributes.getFloat(index, this.f1901E);
                            break;
                        case 46:
                            this.f1902F = obtainStyledAttributes.getFloat(index, this.f1902F);
                            break;
                        case 47:
                            this.f1903G = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.f1904H = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.f1913Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1913Q);
                            break;
                        case 50:
                            this.f1914R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1914R);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        m1371a();
    }

    /* renamed from: a */
    public final void m1371a() {
        this.f1921Y = false;
        this.f1918V = true;
        this.f1919W = true;
        if (this.width == -2 && this.f1916T) {
            this.f1918V = false;
            this.f1905I = 1;
        }
        if (this.height == -2 && this.f1917U) {
            this.f1919W = false;
            this.f1906J = 1;
        }
        if (this.width == 0 || this.width == -1) {
            this.f1918V = false;
            if (this.width == 0 && this.f1905I == 1) {
                this.width = -2;
                this.f1916T = true;
            }
        }
        if (this.height == 0 || this.height == -1) {
            this.f1919W = false;
            if (this.height == 0 && this.f1906J == 1) {
                this.height = -2;
                this.f1917U = true;
            }
        }
        if (this.f1938c == -1.0f && this.f1923a == -1 && this.f1937b == -1) {
            return;
        }
        this.f1921Y = true;
        this.f1918V = true;
        this.f1919W = true;
        if (!(this.f1935al instanceof C0362o)) {
            this.f1935al = new C0362o();
        }
        ((C0362o) this.f1935al).m1270a(this.f1915S);
    }

    public C0384a() {
        super(-2, -2);
        this.f1923a = -1;
        this.f1937b = -1;
        this.f1938c = -1.0f;
        this.f1939d = -1;
        this.f1940e = -1;
        this.f1941f = -1;
        this.f1942g = -1;
        this.f1943h = -1;
        this.f1944i = -1;
        this.f1945j = -1;
        this.f1946k = -1;
        this.f1947l = -1;
        this.f1948m = -1;
        this.f1949n = 0;
        this.f1950o = 0.0f;
        this.f1951p = -1;
        this.f1952q = -1;
        this.f1953r = -1;
        this.f1954s = -1;
        this.f1955t = -1;
        this.f1956u = -1;
        this.f1957v = -1;
        this.f1958w = -1;
        this.f1959x = -1;
        this.f1960y = -1;
        this.f1961z = 0.5f;
        this.f1897A = 0.5f;
        this.f1898B = null;
        this.f1899C = 0.0f;
        this.f1900D = 1;
        this.f1901E = -1.0f;
        this.f1902F = -1.0f;
        this.f1903G = 0;
        this.f1904H = 0;
        this.f1905I = 0;
        this.f1906J = 0;
        this.f1907K = 0;
        this.f1908L = 0;
        this.f1909M = 0;
        this.f1910N = 0;
        this.f1911O = 1.0f;
        this.f1912P = 1.0f;
        this.f1913Q = -1;
        this.f1914R = -1;
        this.f1915S = -1;
        this.f1916T = false;
        this.f1917U = false;
        this.f1918V = true;
        this.f1919W = true;
        this.f1920X = false;
        this.f1921Y = false;
        this.f1922Z = false;
        this.f1924aa = false;
        this.f1925ab = -1;
        this.f1926ac = -1;
        this.f1927ad = -1;
        this.f1928ae = -1;
        this.f1929af = -1;
        this.f1930ag = -1;
        this.f1931ah = 0.5f;
        this.f1935al = new C0357j();
        this.f1936am = false;
    }

    public C0384a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1923a = -1;
        this.f1937b = -1;
        this.f1938c = -1.0f;
        this.f1939d = -1;
        this.f1940e = -1;
        this.f1941f = -1;
        this.f1942g = -1;
        this.f1943h = -1;
        this.f1944i = -1;
        this.f1945j = -1;
        this.f1946k = -1;
        this.f1947l = -1;
        this.f1948m = -1;
        this.f1949n = 0;
        this.f1950o = 0.0f;
        this.f1951p = -1;
        this.f1952q = -1;
        this.f1953r = -1;
        this.f1954s = -1;
        this.f1955t = -1;
        this.f1956u = -1;
        this.f1957v = -1;
        this.f1958w = -1;
        this.f1959x = -1;
        this.f1960y = -1;
        this.f1961z = 0.5f;
        this.f1897A = 0.5f;
        this.f1898B = null;
        this.f1899C = 0.0f;
        this.f1900D = 1;
        this.f1901E = -1.0f;
        this.f1902F = -1.0f;
        this.f1903G = 0;
        this.f1904H = 0;
        this.f1905I = 0;
        this.f1906J = 0;
        this.f1907K = 0;
        this.f1908L = 0;
        this.f1909M = 0;
        this.f1910N = 0;
        this.f1911O = 1.0f;
        this.f1912P = 1.0f;
        this.f1913Q = -1;
        this.f1914R = -1;
        this.f1915S = -1;
        this.f1916T = false;
        this.f1917U = false;
        this.f1918V = true;
        this.f1919W = true;
        this.f1920X = false;
        this.f1921Y = false;
        this.f1922Z = false;
        this.f1924aa = false;
        this.f1925ab = -1;
        this.f1926ac = -1;
        this.f1927ad = -1;
        this.f1928ae = -1;
        this.f1929af = -1;
        this.f1930ag = -1;
        this.f1931ah = 0.5f;
        this.f1935al = new C0357j();
        this.f1936am = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    @android.annotation.TargetApi(17)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void resolveLayoutDirection(int r6) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0384a.resolveLayoutDirection(int):void");
    }
}
