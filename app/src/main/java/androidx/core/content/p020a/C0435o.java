package androidx.core.content.p020a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils.java */
/* renamed from: androidx.core.content.a.o */
/* loaded from: classes.dex */
public final class C0435o {
    /* renamed from: a */
    public static boolean m1544a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: a */
    public static float m1534a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m1544a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m1539a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1544a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static int m1538a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m1544a(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    /* renamed from: a */
    public static C0422b m1542a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (m1544a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return C0422b.m1494a(typedValue.data);
            }
            C0422b m1495a = C0422b.m1495a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (m1495a != null) {
                return m1495a;
            }
        }
        return C0422b.m1494a(0);
    }

    /* renamed from: b */
    public static int m1545b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m1544a(xmlPullParser, str)) {
            return typedArray.getResourceId(i, 0);
        }
        return 0;
    }

    /* renamed from: c */
    public static String m1548c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m1544a(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: a */
    public static TypedValue m1541a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (m1544a(xmlPullParser, str)) {
            return typedArray.peekValue(0);
        }
        return null;
    }

    /* renamed from: a */
    public static TypedArray m1540a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static boolean m1543a(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    /* renamed from: a */
    public static int m1536a(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    /* renamed from: a */
    public static int m1537a(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* renamed from: b */
    public static String m1546b(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* renamed from: c */
    public static CharSequence m1547c(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    /* renamed from: d */
    public static CharSequence[] m1549d(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* renamed from: a */
    public static int m1535a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }
}
