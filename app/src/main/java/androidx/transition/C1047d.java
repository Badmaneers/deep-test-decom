package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p024g.C0538w;
import java.util.Map;

/* compiled from: ChangeBounds.java */
/* renamed from: androidx.transition.d */
/* loaded from: classes.dex */
public final class C1047d extends AbstractC1001ad {

    /* renamed from: h */
    private static final String[] f4204h = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: i */
    private static final Property<Drawable, PointF> f4205i = new C1048e(PointF.class, "boundsOrigin");

    /* renamed from: j */
    private static final Property<C1058o, PointF> f4206j = new C1050g(PointF.class, "topLeft");

    /* renamed from: k */
    private static final Property<C1058o, PointF> f4207k = new C1051h(PointF.class, "bottomRight");

    /* renamed from: l */
    private static final Property<View, PointF> f4208l = new C1052i(PointF.class, "bottomRight");

    /* renamed from: m */
    private static final Property<View, PointF> f4209m = new C1053j(PointF.class, "topLeft");

    /* renamed from: n */
    private static final Property<View, PointF> f4210n = new C1054k(PointF.class, "position");

    /* renamed from: r */
    private static C0999ab f4211r = new C0999ab();

    /* renamed from: o */
    private int[] f4212o = new int[2];

    /* renamed from: p */
    private boolean f4213p = false;

    /* renamed from: q */
    private boolean f4214q = false;

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final String[] mo3497a() {
        return f4204h;
    }

    /* renamed from: d */
    private void m3577d(C1017at c1017at) {
        View view = c1017at.f4150b;
        if (!C0538w.m1819C(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c1017at.f4149a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c1017at.f4149a.put("android:changeBounds:parent", c1017at.f4150b.getParent());
        if (this.f4214q) {
            c1017at.f4150b.getLocationInWindow(this.f4212o);
            c1017at.f4149a.put("android:changeBounds:windowX", Integer.valueOf(this.f4212o[0]));
            c1017at.f4149a.put("android:changeBounds:windowY", Integer.valueOf(this.f4212o[1]));
        }
        if (this.f4213p) {
            c1017at.f4149a.put("android:changeBounds:clip", C0538w.m1821E(view));
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final void mo3492a(C1017at c1017at) {
        m3577d(c1017at);
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: b */
    public final void mo3503b(C1017at c1017at) {
        m3577d(c1017at);
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final Animator mo3481a(ViewGroup viewGroup, C1017at c1017at, C1017at c1017at2) {
        PropertyValuesHolder ofFloat;
        int i;
        View view;
        int i2;
        ObjectAnimator objectAnimator;
        Animator m3536a;
        C1017at b;
        if (c1017at == null || c1017at2 == null) {
            return null;
        }
        Map<String, Object> map = c1017at.f4149a;
        Map<String, Object> map2 = c1017at2.f4149a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c1017at2.f4150b;
        if (!this.f4214q || ((b = m3502b(viewGroup2, true)) != null ? viewGroup3 == b.f4150b : viewGroup2 == viewGroup3)) {
            Rect rect = (Rect) c1017at.f4149a.get("android:changeBounds:bounds");
            Rect rect2 = (Rect) c1017at2.f4149a.get("android:changeBounds:bounds");
            int i3 = rect.left;
            int i4 = rect2.left;
            int i5 = rect.top;
            int i6 = rect2.top;
            int i7 = rect.right;
            int i8 = rect2.right;
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            Rect rect3 = (Rect) c1017at.f4149a.get("android:changeBounds:clip");
            Rect rect4 = (Rect) c1017at2.f4149a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (i7 != i8 || i9 != i10) {
                    i++;
                }
            }
            if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            if (!this.f4213p) {
                view = view2;
                C1030bf.m3555a(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        m3536a = C1067y.m3584a(view, f4210n, m3515j().mo3518a(i3, i5, i4, i6));
                    } else {
                        C1058o c1058o = new C1058o(view);
                        ObjectAnimator m3584a = C1067y.m3584a(c1058o, f4206j, m3515j().mo3518a(i3, i5, i4, i6));
                        ObjectAnimator m3584a2 = C1067y.m3584a(c1058o, f4207k, m3515j().mo3518a(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(m3584a, m3584a2);
                        animatorSet.addListener(new C1055l(this, c1058o));
                        m3536a = animatorSet;
                    }
                } else if (i3 != i4 || i5 != i6) {
                    m3536a = C1067y.m3584a(view, f4209m, m3515j().mo3518a(i3, i5, i4, i6));
                } else {
                    m3536a = C1067y.m3584a(view, f4208l, m3515j().mo3518a(i7, i9, i8, i10));
                }
            } else {
                view = view2;
                C1030bf.m3555a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator m3584a3 = (i3 == i4 && i5 == i6) ? null : C1067y.m3584a(view, f4210n, m3515j().mo3518a(i3, i5, i4, i6));
                if (rect3 == null) {
                    i2 = 0;
                    rect3 = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                }
                Rect rect5 = rect4 == null ? new Rect(i2, i2, i13, i14) : rect4;
                if (rect3.equals(rect5)) {
                    objectAnimator = null;
                } else {
                    C0538w.m1845a(view, rect3);
                    C0999ab c0999ab = f4211r;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect3;
                    objArr[1] = rect5;
                    objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", c0999ab, objArr);
                    objectAnimator.addListener(new C1056m(this, view, rect4, i4, i6, i8, i10));
                }
                m3536a = C1016as.m3536a(m3584a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C1022ay.m3543a(viewGroup4, true);
                mo3484a(new C1057n(this, viewGroup4));
            }
            return m3536a;
        }
        int intValue = ((Integer) c1017at.f4149a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) c1017at.f4149a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) c1017at2.f4149a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) c1017at2.f4149a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f4212o);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float m3559c = C1030bf.m3559c(view2);
        C1030bf.m3553a(view2, 0.0f);
        C1030bf.m3552a(viewGroup).mo3540a(bitmapDrawable);
        Path mo3518a = m3515j().mo3518a(intValue - this.f4212o[0], intValue2 - this.f4212o[1], intValue3 - this.f4212o[0], intValue4 - this.f4212o[1]);
        Property<Drawable, PointF> property = f4205i;
        if (Build.VERSION.SDK_INT >= 21) {
            ofFloat = PropertyValuesHolder.ofObject(property, (TypeConverter) null, mo3518a);
        } else {
            ofFloat = PropertyValuesHolder.ofFloat(new C0998aa(property, mo3518a), 0.0f, 1.0f);
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, ofFloat);
        ofPropertyValuesHolder.addListener(new C1049f(this, viewGroup, bitmapDrawable, view2, m3559c));
        return ofPropertyValuesHolder;
    }
}
