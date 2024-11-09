package androidx.core.content.p020a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.R;
import androidx.core.p021d.C0439a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import neton.client.Utils.ResponseCode;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat.java */
/* renamed from: androidx.core.content.a.c */
/* loaded from: classes.dex */
public final class C0423c {
    /* renamed from: a */
    public static InterfaceC0424d m1503a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m1507b(xmlPullParser, resources);
        }
        m1506a(xmlPullParser);
        return null;
    }

    /* renamed from: b */
    private static InterfaceC0424d m1507b(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamily);
        String string = obtainAttributes.getString(R.styleable.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchTimeout, ResponseCode.CODE_5XX_INTERNAL_SERVER_ERROR);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m1506a(xmlPullParser);
            }
            return new C0427g(new C0439a(string, string2, string3, m1504a(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m1508c(xmlPullParser, resources));
                } else {
                    m1506a(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0425e((C0426f[]) arrayList.toArray(new C0426f[arrayList.size()]));
    }

    /* renamed from: a */
    public static List<List<byte[]>> m1504a(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(m1505a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m1505a(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m1505a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: c */
    private static C0426f m1508c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(R.styleable.FontFamilyFont_fontWeight) ? R.styleable.FontFamilyFont_fontWeight : R.styleable.FontFamilyFont_android_fontWeight, ResponseCode.CODE_4XX_BAD_REQUEST);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(R.styleable.FontFamilyFont_fontStyle) ? R.styleable.FontFamilyFont_fontStyle : R.styleable.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(R.styleable.FontFamilyFont_ttcIndex) ? R.styleable.FontFamilyFont_ttcIndex : R.styleable.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(R.styleable.FontFamilyFont_fontVariationSettings) ? R.styleable.FontFamilyFont_fontVariationSettings : R.styleable.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(R.styleable.FontFamilyFont_font) ? R.styleable.FontFamilyFont_font : R.styleable.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m1506a(xmlPullParser);
        }
        return new C0426f(string2, i, z, string, i3, resourceId);
    }

    /* renamed from: a */
    private static void m1506a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }
}
