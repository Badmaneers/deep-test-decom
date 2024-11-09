package androidx.appcompat.p006a.p007a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0238cc;
import androidx.core.content.C0420a;
import androidx.core.content.p020a.C0421a;
import java.util.WeakHashMap;

/* compiled from: AppCompatResources.java */
@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.a.a.a */
/* loaded from: classes.dex */
public final class C0057a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f60a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0058b>> f61b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f62c = new Object();

    /* renamed from: a */
    public static ColorStateList m45a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList m48d = m48d(context, i);
        if (m48d != null) {
            return m48d;
        }
        ColorStateList m47c = m47c(context, i);
        if (m47c == null) {
            return C0420a.m1486b(context, i);
        }
        synchronized (f62c) {
            SparseArray<C0058b> sparseArray = f61b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f61b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0058b(m47c, context.getResources().getConfiguration()));
        }
        return m47c;
    }

    /* renamed from: b */
    public static Drawable m46b(Context context, int i) {
        return C0238cc.m886a().m891a(context, i);
    }

    /* renamed from: d */
    private static ColorStateList m48d(Context context, int i) {
        C0058b c0058b;
        synchronized (f62c) {
            SparseArray<C0058b> sparseArray = f61b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0058b = sparseArray.get(i)) != null) {
                if (c0058b.f64b.equals(context.getResources().getConfiguration())) {
                    return c0058b.f63a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    private static ColorStateList m47c(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValue = f60a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f60a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return C0421a.m1491a(resources2, resources2.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }
}
