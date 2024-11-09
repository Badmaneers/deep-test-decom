package com.color.support.widget;

import android.R;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.StringTokenizer;

/* compiled from: SecurityKeyboard.java */
/* renamed from: com.color.support.widget.gd */
/* loaded from: classes.dex */
public final class C1546gd {

    /* renamed from: u */
    private static final int[] f7316u = {R.attr.state_checkable, R.attr.state_checked};

    /* renamed from: v */
    private static final int[] f7317v = {R.attr.state_pressed, R.attr.state_checkable, R.attr.state_checked};

    /* renamed from: w */
    private static final int[] f7318w = {R.attr.state_checkable};

    /* renamed from: x */
    private static final int[] f7319x = {R.attr.state_pressed, R.attr.state_checkable};

    /* renamed from: y */
    private static final int[] f7320y = new int[0];

    /* renamed from: z */
    private static final int[] f7321z = {R.attr.state_pressed};

    /* renamed from: a */
    public int[] f7322a;

    /* renamed from: b */
    public CharSequence f7323b;

    /* renamed from: c */
    public Drawable f7324c;

    /* renamed from: d */
    public Drawable f7325d;

    /* renamed from: e */
    public int f7326e;

    /* renamed from: f */
    public int f7327f;

    /* renamed from: g */
    public int f7328g;

    /* renamed from: h */
    public boolean f7329h;

    /* renamed from: i */
    public int f7330i;

    /* renamed from: j */
    public int f7331j;

    /* renamed from: k */
    public boolean f7332k;

    /* renamed from: l */
    public boolean f7333l;

    /* renamed from: m */
    public CharSequence f7334m;

    /* renamed from: n */
    public CharSequence f7335n;

    /* renamed from: o */
    public CharSequence f7336o;

    /* renamed from: p */
    public int f7337p;

    /* renamed from: q */
    public boolean f7338q;

    /* renamed from: r */
    public int f7339r;

    /* renamed from: s */
    public boolean f7340s;

    /* renamed from: t */
    private C1545gc f7341t;

    public C1546gd(C1547ge c1547ge) {
        C1545gc c1545gc;
        this.f7336o = null;
        c1545gc = c1547ge.f7349h;
        this.f7341t = c1545gc;
        this.f7327f = c1547ge.f7343b;
        this.f7326e = c1547ge.f7342a;
        this.f7328g = c1547ge.f7344c;
        this.f7337p = c1547ge.f7347f;
    }

    public C1546gd(Resources resources, C1547ge c1547ge, int i, int i2, XmlResourceParser xmlResourceParser) {
        this(c1547ge);
        int i3;
        int i4;
        int i5;
        this.f7330i = i;
        this.f7331j = i2;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), color.support.p043v7.appcompat.R.styleable.SecurityKeyboard);
        int i6 = color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_colorKeyWidth;
        i3 = this.f7341t.f7307l;
        this.f7326e = C1545gc.m5159a(obtainAttributes, i6, i3, c1547ge.f7342a);
        int i7 = color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_colorKeyHeight;
        i4 = this.f7341t.f7308m;
        this.f7327f = C1545gc.m5159a(obtainAttributes, i7, i4, c1547ge.f7343b);
        int i8 = color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_colorHorizontalGap;
        i5 = this.f7341t.f7307l;
        this.f7328g = C1545gc.m5159a(obtainAttributes, i8, i5, c1547ge.f7344c);
        obtainAttributes.recycle();
        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key);
        this.f7330i += this.f7328g;
        TypedValue typedValue = new TypedValue();
        obtainAttributes2.getValue(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorCodes, typedValue);
        if (typedValue.type == 16 || typedValue.type == 17) {
            this.f7322a = new int[]{typedValue.data};
        } else if (typedValue.type == 3) {
            this.f7322a = m5176a(typedValue.string.toString());
        }
        this.f7325d = obtainAttributes2.getDrawable(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorIconPreview);
        if (this.f7325d != null) {
            this.f7325d.setBounds(0, 0, this.f7325d.getIntrinsicWidth(), this.f7325d.getIntrinsicHeight());
        }
        this.f7335n = obtainAttributes2.getText(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorPopupCharacters);
        this.f7339r = obtainAttributes2.getResourceId(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorPopupKeyboard, 0);
        this.f7340s = obtainAttributes2.getBoolean(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorIsRepeatable, false);
        this.f7338q = obtainAttributes2.getBoolean(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorIsModifier, false);
        this.f7329h = obtainAttributes2.getBoolean(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorIsSticky, false);
        this.f7337p = obtainAttributes2.getInt(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorKeyEdgeFlags, 0);
        this.f7337p = c1547ge.f7347f | this.f7337p;
        this.f7324c = obtainAttributes2.getDrawable(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorKeyIcon);
        if (this.f7324c != null) {
            this.f7324c.setBounds(0, 0, this.f7324c.getIntrinsicWidth(), this.f7324c.getIntrinsicHeight());
        }
        this.f7323b = obtainAttributes2.getText(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorKeyLabel);
        this.f7334m = obtainAttributes2.getText(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorKeyOutputText);
        this.f7336o = obtainAttributes2.getText(color.support.p043v7.appcompat.R.styleable.SecurityKeyboard_Key_colorKeyAnnounce);
        if (this.f7322a == null && !TextUtils.isEmpty(this.f7323b)) {
            this.f7322a = new int[]{this.f7323b.charAt(0)};
        }
        obtainAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m5178a() {
        this.f7332k = !this.f7332k;
        if (this.f7324c != null) {
            this.f7324c.setState(m5180b());
        }
    }

    /* renamed from: a */
    public final void m5179a(boolean z) {
        this.f7332k = !this.f7332k;
        if (this.f7329h && z) {
            this.f7333l = !this.f7333l;
        }
        if (this.f7324c != null) {
            this.f7324c.setState(m5180b());
        }
    }

    /* renamed from: a */
    private static int[] m5176a(String str) {
        int i;
        int i2 = 0;
        if (str.length() > 0) {
            i = 1;
            int i3 = 0;
            while (true) {
                i3 = str.indexOf(",", i3 + 1);
                if (i3 <= 0) {
                    break;
                }
                i++;
            }
        } else {
            i = 0;
        }
        int[] iArr = new int[i];
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            int i4 = i2 + 1;
            try {
                iArr[i2] = Integer.parseInt(stringTokenizer.nextToken());
            } catch (NumberFormatException unused) {
                Log.e("SecurityKeyboard", "Error parsing keycodes ".concat(String.valueOf(str)));
            }
            i2 = i4;
        }
        return iArr;
    }

    /* renamed from: a */
    public final int m5177a(int i, int i2) {
        int i3 = (this.f7330i + (this.f7326e / 2)) - i;
        int i4 = (this.f7331j + (this.f7327f / 2)) - i2;
        return (i3 * i3) + (i4 * i4);
    }

    /* renamed from: b */
    public final int[] m5180b() {
        int[] iArr = f7320y;
        if (this.f7333l) {
            if (this.f7332k) {
                return f7317v;
            }
            return f7316u;
        }
        if (!this.f7329h) {
            return this.f7332k ? f7321z : iArr;
        }
        if (this.f7332k) {
            return f7319x;
        }
        return f7318w;
    }
}
