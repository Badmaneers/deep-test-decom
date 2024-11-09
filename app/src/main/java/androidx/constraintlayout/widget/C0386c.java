package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.R;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public final class C0386c {

    /* renamed from: a */
    private static final int[] f1963a = {0, 4, 8};

    /* renamed from: c */
    private static SparseIntArray f1964c;

    /* renamed from: b */
    private HashMap<Integer, C0387d> f1965b = new HashMap<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1964c = sparseIntArray;
        sparseIntArray.append(R.styleable.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f1964c.append(R.styleable.ConstraintSet_layout_editor_absoluteX, 6);
        f1964c.append(R.styleable.ConstraintSet_layout_editor_absoluteY, 7);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintGuide_begin, 17);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintGuide_end, 18);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintGuide_percent, 19);
        f1964c.append(R.styleable.ConstraintSet_android_orientation, 27);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f1964c.append(R.styleable.ConstraintSet_layout_goneMarginLeft, 13);
        f1964c.append(R.styleable.ConstraintSet_layout_goneMarginTop, 16);
        f1964c.append(R.styleable.ConstraintSet_layout_goneMarginRight, 14);
        f1964c.append(R.styleable.ConstraintSet_layout_goneMarginBottom, 11);
        f1964c.append(R.styleable.ConstraintSet_layout_goneMarginStart, 15);
        f1964c.append(R.styleable.ConstraintSet_layout_goneMarginEnd, 12);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintVertical_weight, 40);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintVertical_bias, 37);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintDimensionRatio, 5);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintLeft_creator, 75);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintTop_creator, 75);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintRight_creator, 75);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintBottom_creator, 75);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintBaseline_creator, 75);
        f1964c.append(R.styleable.ConstraintSet_android_layout_marginLeft, 24);
        f1964c.append(R.styleable.ConstraintSet_android_layout_marginRight, 28);
        f1964c.append(R.styleable.ConstraintSet_android_layout_marginStart, 31);
        f1964c.append(R.styleable.ConstraintSet_android_layout_marginEnd, 8);
        f1964c.append(R.styleable.ConstraintSet_android_layout_marginTop, 34);
        f1964c.append(R.styleable.ConstraintSet_android_layout_marginBottom, 2);
        f1964c.append(R.styleable.ConstraintSet_android_layout_width, 23);
        f1964c.append(R.styleable.ConstraintSet_android_layout_height, 21);
        f1964c.append(R.styleable.ConstraintSet_android_visibility, 22);
        f1964c.append(R.styleable.ConstraintSet_android_alpha, 43);
        f1964c.append(R.styleable.ConstraintSet_android_elevation, 44);
        f1964c.append(R.styleable.ConstraintSet_android_rotationX, 45);
        f1964c.append(R.styleable.ConstraintSet_android_rotationY, 46);
        f1964c.append(R.styleable.ConstraintSet_android_rotation, 60);
        f1964c.append(R.styleable.ConstraintSet_android_scaleX, 47);
        f1964c.append(R.styleable.ConstraintSet_android_scaleY, 48);
        f1964c.append(R.styleable.ConstraintSet_android_transformPivotX, 49);
        f1964c.append(R.styleable.ConstraintSet_android_transformPivotY, 50);
        f1964c.append(R.styleable.ConstraintSet_android_translationX, 51);
        f1964c.append(R.styleable.ConstraintSet_android_translationY, 52);
        f1964c.append(R.styleable.ConstraintSet_android_translationZ, 53);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintWidth_default, 54);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintHeight_default, 55);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintWidth_max, 56);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintHeight_max, 57);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintWidth_min, 58);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintHeight_min, 59);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintCircle, 61);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintCircleRadius, 62);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintCircleAngle, 63);
        f1964c.append(R.styleable.ConstraintSet_android_id, 38);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintWidth_percent, 69);
        f1964c.append(R.styleable.ConstraintSet_layout_constraintHeight_percent, 70);
        f1964c.append(R.styleable.ConstraintSet_chainUseRtl, 71);
        f1964c.append(R.styleable.ConstraintSet_barrierDirection, 72);
        f1964c.append(R.styleable.ConstraintSet_constraint_referenced_ids, 73);
        f1964c.append(R.styleable.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: a */
    public final void m1376a(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f1965b.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            C0388e c0388e = (C0388e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1965b.containsKey(Integer.valueOf(id))) {
                this.f1965b.put(Integer.valueOf(id), new C0387d((byte) 0));
            }
            C0387d c0387d = this.f1965b.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                C0387d.m1379a(c0387d, (ConstraintHelper) childAt, id, c0388e);
            }
            c0387d.m1377a(id, c0388e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1375a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1965b.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.f1965b.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0387d c0387d = this.f1965b.get(Integer.valueOf(id));
                if (childAt instanceof Barrier) {
                    c0387d.f2012at = 1;
                }
                if (c0387d.f2012at != -1 && c0387d.f2012at == 1) {
                    Barrier barrier = (Barrier) childAt;
                    barrier.setId(id);
                    barrier.setType(c0387d.f2011as);
                    barrier.setAllowsGoneWidget(c0387d.f2010ar);
                    if (c0387d.f2013au != null) {
                        barrier.setReferencedIds(c0387d.f2013au);
                    } else if (c0387d.f2014av != null) {
                        c0387d.f2013au = m1373a(barrier, c0387d.f2014av);
                        barrier.setReferencedIds(c0387d.f2013au);
                    }
                }
                C0384a c0384a = (C0384a) childAt.getLayoutParams();
                c0387d.m1380a(c0384a);
                childAt.setLayoutParams(c0384a);
                childAt.setVisibility(c0387d.f1975J);
                if (Build.VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(c0387d.f1986U);
                    childAt.setRotation(c0387d.f1989X);
                    childAt.setRotationX(c0387d.f1990Y);
                    childAt.setRotationY(c0387d.f1991Z);
                    childAt.setScaleX(c0387d.f1993aa);
                    childAt.setScaleY(c0387d.f1994ab);
                    if (!Float.isNaN(c0387d.f1995ac)) {
                        childAt.setPivotX(c0387d.f1995ac);
                    }
                    if (!Float.isNaN(c0387d.f1996ad)) {
                        childAt.setPivotY(c0387d.f1996ad);
                    }
                    childAt.setTranslationX(c0387d.f1997ae);
                    childAt.setTranslationY(c0387d.f1998af);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(c0387d.f1999ag);
                        if (c0387d.f1987V) {
                            childAt.setElevation(c0387d.f1988W);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0387d c0387d2 = this.f1965b.get(num);
            if (c0387d2.f2012at != -1 && c0387d2.f2012at == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                if (c0387d2.f2013au != null) {
                    barrier2.setReferencedIds(c0387d2.f2013au);
                } else if (c0387d2.f2014av != null) {
                    c0387d2.f2013au = m1373a(barrier2, c0387d2.f2014av);
                    barrier2.setReferencedIds(c0387d2.f2013au);
                }
                barrier2.setType(c0387d2.f2011as);
                C0384a m1359a = ConstraintLayout.m1359a();
                barrier2.m1356a();
                c0387d2.m1380a(m1359a);
                constraintLayout.addView(barrier2, m1359a);
            }
            if (c0387d2.f1992a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                C0384a m1359a2 = ConstraintLayout.m1359a();
                c0387d2.m1380a(m1359a2);
                constraintLayout.addView(guideline, m1359a2);
            }
        }
    }

    /* renamed from: a */
    public final void m1374a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    C0387d c0387d = new C0387d((byte) 0);
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, R.styleable.ConstraintSet);
                    int indexCount = obtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = obtainStyledAttributes.getIndex(i2);
                        int i3 = f1964c.get(index);
                        switch (i3) {
                            case 1:
                                c0387d.f2029p = m1372a(obtainStyledAttributes, index, c0387d.f2029p);
                                break;
                            case 2:
                                c0387d.f1972G = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1972G);
                                break;
                            case 3:
                                c0387d.f2028o = m1372a(obtainStyledAttributes, index, c0387d.f2028o);
                                break;
                            case 4:
                                c0387d.f2027n = m1372a(obtainStyledAttributes, index, c0387d.f2027n);
                                break;
                            case 5:
                                c0387d.f2036w = obtainStyledAttributes.getString(index);
                                break;
                            case 6:
                                c0387d.f1966A = obtainStyledAttributes.getDimensionPixelOffset(index, c0387d.f1966A);
                                break;
                            case 7:
                                c0387d.f1967B = obtainStyledAttributes.getDimensionPixelOffset(index, c0387d.f1967B);
                                break;
                            case 8:
                                c0387d.f1973H = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1973H);
                                break;
                            case 9:
                                c0387d.f2033t = m1372a(obtainStyledAttributes, index, c0387d.f2033t);
                                break;
                            case 10:
                                c0387d.f2032s = m1372a(obtainStyledAttributes, index, c0387d.f2032s);
                                break;
                            case 11:
                                c0387d.f1979N = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1979N);
                                break;
                            case 12:
                                c0387d.f1980O = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1980O);
                                break;
                            case 13:
                                c0387d.f1976K = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1976K);
                                break;
                            case 14:
                                c0387d.f1978M = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1978M);
                                break;
                            case 15:
                                c0387d.f1981P = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1981P);
                                break;
                            case 16:
                                c0387d.f1977L = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1977L);
                                break;
                            case 17:
                                c0387d.f2018e = obtainStyledAttributes.getDimensionPixelOffset(index, c0387d.f2018e);
                                break;
                            case 18:
                                c0387d.f2019f = obtainStyledAttributes.getDimensionPixelOffset(index, c0387d.f2019f);
                                break;
                            case 19:
                                c0387d.f2020g = obtainStyledAttributes.getFloat(index, c0387d.f2020g);
                                break;
                            case 20:
                                c0387d.f2034u = obtainStyledAttributes.getFloat(index, c0387d.f2034u);
                                break;
                            case 21:
                                c0387d.f2016c = obtainStyledAttributes.getLayoutDimension(index, c0387d.f2016c);
                                break;
                            case 22:
                                c0387d.f1975J = obtainStyledAttributes.getInt(index, c0387d.f1975J);
                                c0387d.f1975J = f1963a[c0387d.f1975J];
                                break;
                            case 23:
                                c0387d.f2015b = obtainStyledAttributes.getLayoutDimension(index, c0387d.f2015b);
                                break;
                            case 24:
                                c0387d.f1969D = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1969D);
                                break;
                            case 25:
                                c0387d.f2021h = m1372a(obtainStyledAttributes, index, c0387d.f2021h);
                                break;
                            case 26:
                                c0387d.f2022i = m1372a(obtainStyledAttributes, index, c0387d.f2022i);
                                break;
                            case 27:
                                c0387d.f1968C = obtainStyledAttributes.getInt(index, c0387d.f1968C);
                                break;
                            case 28:
                                c0387d.f1970E = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1970E);
                                break;
                            case 29:
                                c0387d.f2023j = m1372a(obtainStyledAttributes, index, c0387d.f2023j);
                                break;
                            case 30:
                                c0387d.f2024k = m1372a(obtainStyledAttributes, index, c0387d.f2024k);
                                break;
                            case 31:
                                c0387d.f1974I = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1974I);
                                break;
                            case 32:
                                c0387d.f2030q = m1372a(obtainStyledAttributes, index, c0387d.f2030q);
                                break;
                            case 33:
                                c0387d.f2031r = m1372a(obtainStyledAttributes, index, c0387d.f2031r);
                                break;
                            case 34:
                                c0387d.f1971F = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f1971F);
                                break;
                            case 35:
                                c0387d.f2026m = m1372a(obtainStyledAttributes, index, c0387d.f2026m);
                                break;
                            case 36:
                                c0387d.f2025l = m1372a(obtainStyledAttributes, index, c0387d.f2025l);
                                break;
                            case 37:
                                c0387d.f2035v = obtainStyledAttributes.getFloat(index, c0387d.f2035v);
                                break;
                            case 38:
                                c0387d.f2017d = obtainStyledAttributes.getResourceId(index, c0387d.f2017d);
                                break;
                            case 39:
                                c0387d.f1983R = obtainStyledAttributes.getFloat(index, c0387d.f1983R);
                                break;
                            case 40:
                                c0387d.f1982Q = obtainStyledAttributes.getFloat(index, c0387d.f1982Q);
                                break;
                            case 41:
                                c0387d.f1984S = obtainStyledAttributes.getInt(index, c0387d.f1984S);
                                break;
                            case 42:
                                c0387d.f1985T = obtainStyledAttributes.getInt(index, c0387d.f1985T);
                                break;
                            case 43:
                                c0387d.f1986U = obtainStyledAttributes.getFloat(index, c0387d.f1986U);
                                break;
                            case 44:
                                c0387d.f1987V = true;
                                c0387d.f1988W = obtainStyledAttributes.getDimension(index, c0387d.f1988W);
                                break;
                            case 45:
                                c0387d.f1990Y = obtainStyledAttributes.getFloat(index, c0387d.f1990Y);
                                break;
                            case 46:
                                c0387d.f1991Z = obtainStyledAttributes.getFloat(index, c0387d.f1991Z);
                                break;
                            case 47:
                                c0387d.f1993aa = obtainStyledAttributes.getFloat(index, c0387d.f1993aa);
                                break;
                            case 48:
                                c0387d.f1994ab = obtainStyledAttributes.getFloat(index, c0387d.f1994ab);
                                break;
                            case 49:
                                c0387d.f1995ac = obtainStyledAttributes.getFloat(index, c0387d.f1995ac);
                                break;
                            case 50:
                                c0387d.f1996ad = obtainStyledAttributes.getFloat(index, c0387d.f1996ad);
                                break;
                            case 51:
                                c0387d.f1997ae = obtainStyledAttributes.getDimension(index, c0387d.f1997ae);
                                break;
                            case 52:
                                c0387d.f1998af = obtainStyledAttributes.getDimension(index, c0387d.f1998af);
                                break;
                            case 53:
                                c0387d.f1999ag = obtainStyledAttributes.getDimension(index, c0387d.f1999ag);
                                break;
                            default:
                                switch (i3) {
                                    case 60:
                                        c0387d.f1989X = obtainStyledAttributes.getFloat(index, c0387d.f1989X);
                                        break;
                                    case 61:
                                        c0387d.f2037x = m1372a(obtainStyledAttributes, index, c0387d.f2037x);
                                        break;
                                    case 62:
                                        c0387d.f2038y = obtainStyledAttributes.getDimensionPixelSize(index, c0387d.f2038y);
                                        break;
                                    case 63:
                                        c0387d.f2039z = obtainStyledAttributes.getFloat(index, c0387d.f2039z);
                                        break;
                                    default:
                                        switch (i3) {
                                            case 69:
                                                c0387d.f2008ap = obtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 70:
                                                c0387d.f2009aq = obtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 71:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                break;
                                            case 72:
                                                c0387d.f2011as = obtainStyledAttributes.getInt(index, c0387d.f2011as);
                                                break;
                                            case 73:
                                                c0387d.f2014av = obtainStyledAttributes.getString(index);
                                                break;
                                            case 74:
                                                c0387d.f2010ar = obtainStyledAttributes.getBoolean(index, c0387d.f2010ar);
                                                break;
                                            case 75:
                                                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1964c.get(index));
                                                break;
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1964c.get(index));
                                                break;
                                        }
                                }
                        }
                    }
                    obtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0387d.f1992a = true;
                    }
                    this.f1965b.put(Integer.valueOf(c0387d.f2017d), c0387d);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private static int m1372a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    private static int[] m1373a(View view, String str) {
        int i;
        Object m1366a;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m1366a = ((ConstraintLayout) view.getParent()).m1366a(trim)) != null && (m1366a instanceof Integer)) {
                i = ((Integer) m1366a).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}
