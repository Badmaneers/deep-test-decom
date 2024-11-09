package androidx.core.content.p020a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.core.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ColorStateListInflaterCompat.java */
/* renamed from: androidx.core.content.a.a */
/* loaded from: classes.dex */
public final class C0421a {
    /* renamed from: a */
    public static ColorStateList m1490a(Resources resources, int i, Resources.Theme theme) {
        try {
            return m1491a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static ColorStateList m1491a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return m1492a(resources, xmlPullParser, asAttributeSet, theme);
    }

    /* renamed from: a */
    public static ColorStateList m1492a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        return m1493b(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: b */
    private static ColorStateList m1493b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        TypedArray obtainStyledAttributes;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = R.styleable.ColorStateListItem;
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr3);
                } else {
                    obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr3, 0, 0);
                }
                int color2 = obtainStyledAttributes.getColor(R.styleable.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (obtainStyledAttributes.hasValue(R.styleable.ColorStateListItem_android_alpha)) {
                    f = obtainStyledAttributes.getFloat(R.styleable.ColorStateListItem_android_alpha, 1.0f);
                } else if (obtainStyledAttributes.hasValue(R.styleable.ColorStateListItem_alpha)) {
                    f = obtainStyledAttributes.getFloat(R.styleable.ColorStateListItem_alpha, 1.0f);
                }
                obtainStyledAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr4, i3);
                iArr2 = C0430j.m1523a(iArr2, i2, (Math.round(Color.alpha(color2) * f) << 24) | (color2 & 16777215));
                iArr = (int[][]) C0430j.m1524a(iArr, i2, trimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr5 = new int[i2];
        int[][] iArr6 = new int[i2];
        System.arraycopy(iArr2, 0, iArr5, 0, i2);
        System.arraycopy(iArr, 0, iArr6, 0, i2);
        return new ColorStateList(iArr6, iArr5);
    }
}
