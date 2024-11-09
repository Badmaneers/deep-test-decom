package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsBase.java */
/* renamed from: androidx.transition.bn */
/* loaded from: classes.dex */
class C1038bn {

    /* renamed from: a */
    private static Method f4180a;

    /* renamed from: b */
    private static boolean f4181b;

    /* renamed from: c */
    private static Field f4182c;

    /* renamed from: d */
    private static boolean f4183d;

    /* renamed from: a */
    public void mo3563a(View view, float f) {
        Float f2 = (Float) view.getTag(R.id.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: a */
    public float mo3562a(View view) {
        Float f = (Float) view.getTag(R.id.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: b */
    public void mo3564b(View view) {
        if (view.getTag(R.id.save_non_transition_alpha) == null) {
            view.setTag(R.id.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: c */
    public void mo3565c(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.save_non_transition_alpha, null);
        }
    }

    /* renamed from: a */
    public void mo3566a(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo3566a((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* renamed from: b */
    public void mo3567b(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo3567b((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }

    /* renamed from: a */
    public void mo3569a(View view, int i) {
        if (!f4183d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4182c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f4183d = true;
        }
        if (f4182c != null) {
            try {
                f4182c.setInt(view, (f4182c.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: a */
    public void mo3568a(View view, int i, int i2, int i3, int i4) {
        if (!f4181b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                f4180a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f4181b = true;
        }
        if (f4180a != null) {
            try {
                f4180a.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
