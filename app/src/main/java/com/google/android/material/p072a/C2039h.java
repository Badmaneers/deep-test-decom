package com.google.android.material.p072a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.p011b.C0328n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MotionSpec.java */
/* renamed from: com.google.android.material.a.h */
/* loaded from: classes.dex */
public final class C2039h {

    /* renamed from: a */
    private final C0328n<String, C2040i> f8986a = new C0328n<>();

    /* renamed from: b */
    private final C0328n<String, PropertyValuesHolder[]> f8987b = new C0328n<>();

    /* renamed from: a */
    private void m6249a(String str, C2040i c2040i) {
        this.f8986a.put(str, c2040i);
    }

    /* renamed from: b */
    public final boolean m6255b(String str) {
        return this.f8987b.get(str) != null;
    }

    /* renamed from: c */
    public final PropertyValuesHolder[] m6256c(String str) {
        if (!m6255b(str)) {
            throw new IllegalArgumentException();
        }
        return m6250a(this.f8987b.get(str));
    }

    /* renamed from: a */
    public final void m6254a(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f8987b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: a */
    private static PropertyValuesHolder[] m6250a(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    /* renamed from: a */
    public final <T> ObjectAnimator m6252a(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, m6256c(str));
        ofPropertyValuesHolder.setProperty(property);
        m6253a(str).m6259a((Animator) ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public final long m6251a() {
        int size = this.f8986a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C2040i m1062c = this.f8986a.m1062c(i);
            j = Math.max(j, m1062c.m6258a() + m1062c.m6260b());
        }
        return j;
    }

    /* renamed from: a */
    public static C2039h m6246a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m6245a(context, resourceId);
    }

    /* renamed from: a */
    public static C2039h m6245a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m6247a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m6247a(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: a */
    private static C2039h m6247a(List<Animator> list) {
        C2039h c2039h = new C2039h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m6248a(c2039h, list.get(i));
        }
        return c2039h;
    }

    /* renamed from: a */
    private static void m6248a(C2039h c2039h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c2039h.m6254a(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c2039h.m6249a(objectAnimator.getPropertyName(), C2040i.m6257a((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(animator)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2039h) {
            return this.f8986a.equals(((C2039h) obj).f8986a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8986a.hashCode();
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f8986a + "}\n";
    }

    /* renamed from: a */
    public final C2040i m6253a(String str) {
        if (!(this.f8986a.get(str) != null)) {
            throw new IllegalArgumentException();
        }
        return this.f8986a.get(str);
    }
}
