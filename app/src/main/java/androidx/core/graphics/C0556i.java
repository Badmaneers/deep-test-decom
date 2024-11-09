package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi28Impl.java */
/* renamed from: androidx.core.graphics.i */
/* loaded from: classes.dex */
public final class C0556i extends C0555h {
    @Override // androidx.core.graphics.C0555h
    /* renamed from: a */
    protected final Typeface mo1966a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2436a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2442g.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.C0555h
    /* renamed from: a */
    protected final Method mo1967a(Class<?> cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
