package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SecurityKeyboard.java */
/* renamed from: com.color.support.widget.gc */
/* loaded from: classes.dex */
public final class C1545gc {

    /* renamed from: s */
    private static float f7295s = 1.8f;

    /* renamed from: a */
    private int f7296a;

    /* renamed from: b */
    private int f7297b;

    /* renamed from: c */
    private int f7298c;

    /* renamed from: d */
    private int f7299d;

    /* renamed from: e */
    private int f7300e;

    /* renamed from: f */
    private C1546gd[] f7301f;

    /* renamed from: g */
    private int[] f7302g;

    /* renamed from: h */
    private int f7303h;

    /* renamed from: i */
    private int f7304i;

    /* renamed from: j */
    private List<C1546gd> f7305j;

    /* renamed from: k */
    private List<C1546gd> f7306k;

    /* renamed from: l */
    private int f7307l;

    /* renamed from: m */
    private int f7308m;

    /* renamed from: n */
    private int f7309n;

    /* renamed from: o */
    private int f7310o;

    /* renamed from: p */
    private int f7311p;

    /* renamed from: q */
    private int[][] f7312q;

    /* renamed from: r */
    private int f7313r;

    /* renamed from: t */
    private ArrayList<C1547ge> f7314t;

    /* renamed from: u */
    private int f7315u;

    public C1545gc(Context context, int i) {
        this(context, i, (byte) 0);
    }

    private C1545gc(Context context, int i, byte b) {
        this.f7300e = 0;
        this.f7301f = new C1546gd[]{null, null};
        this.f7302g = new int[]{-1, -1};
        this.f7314t = new ArrayList<>();
        this.f7315u = 0;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f7307l = displayMetrics.widthPixels;
        this.f7308m = displayMetrics.heightPixels;
        this.f7296a = 0;
        this.f7297b = this.f7307l / 10;
        this.f7299d = 0;
        this.f7298c = this.f7297b;
        this.f7305j = new ArrayList();
        this.f7306k = new ArrayList();
        this.f7309n = 0;
        m5161a(context, context.getResources().getXml(i));
        m5163b(context);
    }

    public C1545gc(Context context, int i, CharSequence charSequence, int i2) {
        this(context, i);
        this.f7304i = 0;
        C1547ge c1547ge = new C1547ge(this);
        c1547ge.f7343b = this.f7298c;
        c1547ge.f7342a = this.f7297b;
        c1547ge.f7344c = this.f7296a;
        c1547ge.f7345d = this.f7299d;
        c1547ge.f7347f = 12;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            char charAt = charSequence.charAt(i6);
            if (i3 >= Integer.MAX_VALUE || this.f7297b + i5 + i2 > this.f7307l) {
                i4 += this.f7299d + this.f7298c;
                i3 = 0;
                i5 = 0;
            }
            C1546gd c1546gd = new C1546gd(c1547ge);
            c1546gd.f7330i = i5;
            c1546gd.f7331j = i4;
            c1546gd.f7323b = String.valueOf(charAt);
            c1546gd.f7322a = new int[]{charAt};
            i3++;
            i5 += c1546gd.f7326e + c1546gd.f7328g;
            this.f7305j.add(c1546gd);
            c1547ge.f7346e.add(c1546gd);
            if (i5 > this.f7304i) {
                this.f7304i = i5;
            }
        }
        this.f7303h = i4 + this.f7298c;
        this.f7314t.add(c1547ge);
    }

    /* renamed from: a */
    public final List<C1546gd> m5168a() {
        return this.f7305j;
    }

    /* renamed from: b */
    public final int m5171b() {
        return this.f7303h;
    }

    /* renamed from: c */
    public final int m5172c() {
        return this.f7304i;
    }

    /* renamed from: a */
    public final void m5169a(int i) {
        for (C1546gd c1546gd : this.f7301f) {
            if (c1546gd != null) {
                if (i == 1 || i == 2) {
                    c1546gd.f7333l = true;
                } else if (i == 0) {
                    c1546gd.f7333l = false;
                }
            }
        }
        this.f7300e = i;
    }

    /* renamed from: d */
    public final int m5173d() {
        return this.f7300e;
    }

    /* renamed from: e */
    public final int m5174e() {
        return this.f7302g[0];
    }

    /* renamed from: a */
    public final int[] m5170a(int i, int i2) {
        int i3;
        if (this.f7312q == null) {
            this.f7310o = ((this.f7304i + 10) - 1) / 10;
            this.f7311p = ((this.f7303h + 5) - 1) / 5;
            this.f7312q = new int[50];
            int[] iArr = new int[this.f7305j.size()];
            int i4 = this.f7310o * 10;
            int i5 = this.f7311p * 5;
            int i6 = 0;
            while (i6 < i4) {
                int i7 = 0;
                while (i7 < i5) {
                    int i8 = 0;
                    for (int i9 = 0; i9 < this.f7305j.size(); i9++) {
                        C1546gd c1546gd = this.f7305j.get(i9);
                        if (c1546gd.m5177a(i6, i7) < this.f7313r || c1546gd.m5177a((this.f7310o + i6) - 1, i7) < this.f7313r || c1546gd.m5177a((this.f7310o + i6) - 1, (this.f7311p + i7) - 1) < this.f7313r || c1546gd.m5177a(i6, (this.f7311p + i7) - 1) < this.f7313r) {
                            iArr[i8] = i9;
                            i8++;
                        }
                    }
                    int[] iArr2 = new int[i8];
                    System.arraycopy(iArr, 0, iArr2, 0, i8);
                    this.f7312q[((i7 / this.f7311p) * 10) + (i6 / this.f7310o)] = iArr2;
                    i7 += this.f7311p;
                }
                i6 += this.f7310o;
            }
        }
        if (i >= 0 && i < this.f7304i && i2 >= 0 && i2 < this.f7303h && (i3 = ((i2 / this.f7311p) * 10) + (i / this.f7310o)) < 50) {
            return this.f7312q[i3];
        }
        return new int[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x003c, code lost:            r2 = r15.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0040, code lost:            if (r2 == 1) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0042, code lost:            if (r2 != 3) goto L86;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004e, code lost:            if (r15.getName().equals("Row") == false) goto L87;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5161a(android.content.Context r14, android.content.res.XmlResourceParser r15) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.C1545gc.m5161a(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5159a(TypedArray typedArray, int i, int i2, int i3) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return i3;
        }
        if (peekValue.type == 5) {
            return typedArray.getDimensionPixelOffset(i, i3);
        }
        return peekValue.type == 6 ? Math.round(typedArray.getFraction(i, i2, i2, i3)) : i3;
    }

    /* renamed from: f */
    public final int m5175f() {
        return this.f7315u;
    }

    /* renamed from: a */
    public static float m5158a(Context context) {
        float f;
        if (context.getResources().getConfiguration().orientation == 1) {
            f = context.getResources().getDisplayMetrics().widthPixels / 360.0f;
        } else {
            f = context.getResources().getDisplayMetrics().heightPixels / 360.0f;
        }
        float f2 = context.getResources().getDisplayMetrics().densityDpi / 160.0f;
        Log.d("SecurityKeyboard", "defaultDensity: " + f + " densityNow: " + f2);
        return f / f2;
    }

    /* renamed from: b */
    private void m5163b(Context context) {
        float m5158a = m5158a(context);
        int size = this.f7314t.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C1547ge c1547ge = this.f7314t.get(i);
            int size2 = c1547ge.f7346e.size();
            c1547ge.f7345d = (int) (c1547ge.f7345d * m5158a);
            c1547ge.f7344c = (int) (c1547ge.f7344c * m5158a);
            c1547ge.f7343b = (int) (c1547ge.f7343b * m5158a);
            c1547ge.f7342a = (int) (c1547ge.f7342a * m5158a);
            int i3 = 0;
            int i4 = i2;
            for (int i5 = 0; i5 < size2; i5++) {
                C1546gd c1546gd = c1547ge.f7346e.get(i5);
                c1546gd.f7328g = (int) (c1546gd.f7328g * m5158a);
                int i6 = i3 + c1546gd.f7328g;
                c1546gd.f7330i = i6;
                c1546gd.f7331j = (int) (c1546gd.f7331j * m5158a);
                c1546gd.f7326e = (int) (c1546gd.f7326e * m5158a);
                c1546gd.f7327f = (int) (c1546gd.f7327f * m5158a);
                i3 = i6 + c1546gd.f7326e;
                if (i3 > i4) {
                    i4 = i3;
                }
            }
            i++;
            i2 = i4;
        }
        this.f7304i = i2;
        this.f7303h = (int) (this.f7303h * m5158a);
    }
}
