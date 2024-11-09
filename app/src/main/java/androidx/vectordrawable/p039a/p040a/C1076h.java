package androidx.vectordrawable.p039a.p040a;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.p020a.C0435o;
import androidx.core.graphics.C0543b;
import androidx.core.graphics.C0545d;
import com.coloros.neton.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import neton.client.Utils.ResponseCode;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatorInflaterCompat.java */
/* renamed from: androidx.vectordrawable.a.a.h */
/* loaded from: classes.dex */
public final class C1076h {
    /* renamed from: a */
    private static boolean m3597a(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: a */
    public static Animator m3588a(Context context, Resources resources, Resources.Theme theme, int i) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                XmlResourceParser animation = resources.getAnimation(i);
                try {
                    Animator m3589a = m3589a(context, resources, theme, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
                    if (animation != null) {
                        animation.close();
                    }
                    return m3589a;
                } catch (IOException e) {
                    e = e;
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException2.initCause(e);
                    throw notFoundException2;
                } catch (Throwable th) {
                    th = th;
                    xmlResourceParser = animation;
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (XmlPullParserException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    private static PropertyValuesHolder m3592a(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m3597a(i7)) || (z2 && m3597a(i8))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0545d[] m1911b = C0543b.m1911b(string);
            C0545d[] m1911b2 = C0543b.m1911b(string2);
            if (m1911b != null || m1911b2 != null) {
                if (m1911b != null) {
                    C1077i c1077i = new C1077i();
                    if (m1911b2 == null) {
                        return PropertyValuesHolder.ofObject(str, c1077i, m1911b);
                    }
                    if (C0543b.m1908a(m1911b, m1911b2)) {
                        return PropertyValuesHolder.ofObject(str, c1077i, m1911b, m1911b2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (m1911b2 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofObject(str, new C1077i(), m1911b2);
                }
            }
            return propertyValuesHolder;
        }
        C1078j m3599a = i == 3 ? C1078j.m3599a() : null;
        if (z3) {
            if (z) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f);
            }
        } else if (z) {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (m3597a(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m3597a(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5);
            }
        } else if (z2) {
            if (i8 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (m3597a(i8)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i4);
        }
        PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolder;
        if (propertyValuesHolder2 == null || m3599a == null) {
            return propertyValuesHolder2;
        }
        propertyValuesHolder2.setEvaluator(m3599a);
        return propertyValuesHolder2;
    }

    /* renamed from: a */
    private static void m3594a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long m1539a = C0435o.m1539a(typedArray, xmlPullParser, "duration", 1, ResponseCode.CODE_3XX_MULTIPLE_CHOICES);
        long m1539a2 = C0435o.m1539a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m1539a3 = C0435o.m1539a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0435o.m1544a(xmlPullParser, "valueFrom") && C0435o.m1544a(xmlPullParser, "valueTo")) {
            if (m1539a3 == 4) {
                TypedValue peekValue = typedArray.peekValue(5);
                boolean z = peekValue != null;
                int i = z ? peekValue.type : 0;
                TypedValue peekValue2 = typedArray.peekValue(6);
                boolean z2 = peekValue2 != null;
                m1539a3 = ((z && m3597a(i)) || (z2 && m3597a(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder m3592a = m3592a(typedArray, m1539a3, 5, 6, BuildConfig.FLAVOR);
            if (m3592a != null) {
                valueAnimator.setValues(m3592a);
            }
        }
        valueAnimator.setDuration(m1539a);
        valueAnimator.setStartDelay(m1539a2);
        valueAnimator.setRepeatCount(C0435o.m1539a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0435o.m1539a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
            String m1548c = C0435o.m1548c(typedArray2, xmlPullParser, "pathData", 1);
            if (m1548c != null) {
                String m1548c2 = C0435o.m1548c(typedArray2, xmlPullParser, "propertyXName", 2);
                String m1548c3 = C0435o.m1548c(typedArray2, xmlPullParser, "propertyYName", 3);
                if (m1548c2 == null && m1548c3 == null) {
                    throw new InflateException(typedArray2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                m3595a(C0543b.m1906a(m1548c), objectAnimator, 0.5f * f, m1548c2, m1548c3);
                return;
            }
            objectAnimator.setPropertyName(C0435o.m1548c(typedArray2, xmlPullParser, "propertyName", 0));
        }
    }

    /* renamed from: a */
    private static void m3595a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / (min - 1);
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            if (i2 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            f4 += f3;
            int i3 = i + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i = i3;
            }
            i2++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator m3589a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.p039a.p040a.C1076h.m3589a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static PropertyValuesHolder[] m3598a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i;
        Keyframe ofInt;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType != 3) {
                int i2 = 1;
                if (eventType != 1) {
                    if (eventType != 2) {
                        xmlPullParser.next();
                    } else {
                        if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                            TypedArray m1540a = C0435o.m1540a(resources, theme, attributeSet, C1069a.f4267i);
                            String m1548c = C0435o.m1548c(m1540a, xmlPullParser, "propertyName", 3);
                            int i3 = 4;
                            int m1539a = C0435o.m1539a(m1540a, xmlPullParser, "valueType", 2, 4);
                            int i4 = m1539a;
                            ArrayList arrayList2 = null;
                            while (true) {
                                int next = xmlPullParser.next();
                                if (next != 3 && next != i2) {
                                    if (xmlPullParser.getName().equals("keyframe")) {
                                        if (i4 == i3) {
                                            TypedArray m1540a2 = C0435o.m1540a(resources, theme, Xml.asAttributeSet(xmlPullParser), C1069a.f4268j);
                                            TypedValue m1541a = C0435o.m1541a(m1540a2, xmlPullParser, "value");
                                            i4 = ((m1541a != null) && m3597a(m1541a.type)) ? 3 : 0;
                                            m1540a2.recycle();
                                        }
                                        TypedArray m1540a3 = C0435o.m1540a(resources, theme, Xml.asAttributeSet(xmlPullParser), C1069a.f4268j);
                                        float m1534a = C0435o.m1534a(m1540a3, xmlPullParser, "fraction", 3, -1.0f);
                                        TypedValue m1541a2 = C0435o.m1541a(m1540a3, xmlPullParser, "value");
                                        boolean z = m1541a2 != null;
                                        if (i4 == i3) {
                                            i = (z && m3597a(m1541a2.type)) ? 3 : 0;
                                        } else {
                                            i = i4;
                                        }
                                        if (z) {
                                            if (i != 3) {
                                                switch (i) {
                                                    case 0:
                                                        ofInt = Keyframe.ofFloat(m1534a, C0435o.m1534a(m1540a3, xmlPullParser, "value", 0, 0.0f));
                                                        break;
                                                    case 1:
                                                        break;
                                                    default:
                                                        ofInt = null;
                                                        break;
                                                }
                                            }
                                            ofInt = Keyframe.ofInt(m1534a, C0435o.m1539a(m1540a3, xmlPullParser, "value", 0, 0));
                                        } else if (i == 0) {
                                            ofInt = Keyframe.ofFloat(m1534a);
                                        } else {
                                            ofInt = Keyframe.ofInt(m1534a);
                                        }
                                        int m1545b = C0435o.m1545b(m1540a3, xmlPullParser, "interpolator", 1);
                                        if (m1545b > 0) {
                                            ofInt.setInterpolator(C1075g.m3587a(context, m1545b));
                                        }
                                        m1540a3.recycle();
                                        if (ofInt != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(ofInt);
                                        }
                                        xmlPullParser.next();
                                    }
                                    i2 = 1;
                                    i3 = 4;
                                }
                            }
                            if (arrayList2 == null || (size = arrayList2.size()) <= 0) {
                                propertyValuesHolder = null;
                            } else {
                                Keyframe keyframe = (Keyframe) arrayList2.get(0);
                                Keyframe keyframe2 = (Keyframe) arrayList2.get(size - 1);
                                float fraction = keyframe2.getFraction();
                                if (fraction < 1.0f) {
                                    if (fraction < 0.0f) {
                                        keyframe2.setFraction(1.0f);
                                    } else {
                                        arrayList2.add(arrayList2.size(), m3590a(keyframe2, 1.0f));
                                        size++;
                                    }
                                }
                                float fraction2 = keyframe.getFraction();
                                if (fraction2 != 0.0f) {
                                    if (fraction2 < 0.0f) {
                                        keyframe.setFraction(0.0f);
                                    } else {
                                        arrayList2.add(0, m3590a(keyframe, 0.0f));
                                        size++;
                                    }
                                }
                                Keyframe[] keyframeArr = new Keyframe[size];
                                arrayList2.toArray(keyframeArr);
                                for (int i5 = 0; i5 < size; i5++) {
                                    Keyframe keyframe3 = keyframeArr[i5];
                                    if (keyframe3.getFraction() < 0.0f) {
                                        if (i5 == 0) {
                                            keyframe3.setFraction(0.0f);
                                        } else {
                                            int i6 = size - 1;
                                            if (i5 == i6) {
                                                keyframe3.setFraction(1.0f);
                                            } else {
                                                int i7 = i5;
                                                for (int i8 = i5 + 1; i8 < i6 && keyframeArr[i8].getFraction() < 0.0f; i8++) {
                                                    i7 = i8;
                                                }
                                                m3596a(keyframeArr, keyframeArr[i7 + 1].getFraction() - keyframeArr[i5 - 1].getFraction(), i5, i7);
                                            }
                                        }
                                    }
                                }
                                propertyValuesHolder = PropertyValuesHolder.ofKeyframe(m1548c, keyframeArr);
                                if (i4 == 3) {
                                    propertyValuesHolder.setEvaluator(C1078j.m3599a());
                                }
                            }
                            if (propertyValuesHolder == null) {
                                propertyValuesHolder = m3592a(m1540a, m1539a, 0, 1, m1548c);
                            }
                            if (propertyValuesHolder != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(propertyValuesHolder);
                            }
                            m1540a.recycle();
                        }
                        xmlPullParser.next();
                    }
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        int size2 = arrayList.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size2];
        for (int i9 = 0; i9 < size2; i9++) {
            propertyValuesHolderArr[i9] = (PropertyValuesHolder) arrayList.get(i9);
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: a */
    private static Keyframe m3590a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static void m3596a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static ObjectAnimator m3591a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m3593a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: a */
    private static ValueAnimator m3593a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray m1540a = C0435o.m1540a(resources, theme, attributeSet, C1069a.f4265g);
        TypedArray m1540a2 = C0435o.m1540a(resources, theme, attributeSet, C1069a.f4269k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m3594a(valueAnimator, m1540a, m1540a2, f, xmlPullParser);
        int m1545b = C0435o.m1545b(m1540a, xmlPullParser, "interpolator", 0);
        if (m1545b > 0) {
            valueAnimator.setInterpolator(C1075g.m3587a(context, m1545b));
        }
        m1540a.recycle();
        if (m1540a2 != null) {
            m1540a2.recycle();
        }
        return valueAnimator;
    }
}
