package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.coloros.neton.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater.java */
/* renamed from: androidx.appcompat.app.ao */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0074ao implements View.OnClickListener {

    /* renamed from: a */
    private final View f213a;

    /* renamed from: b */
    private final String f214b;

    /* renamed from: c */
    private Method f215c;

    /* renamed from: d */
    private Context f216d;

    public ViewOnClickListenerC0074ao(View view, String str) {
        this.f213a = view;
        this.f214b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f215c == null) {
            Context context = this.f213a.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f214b, View.class)) != null) {
                        this.f215c = method;
                        this.f216d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f213a.getId();
            if (id == -1) {
                str = BuildConfig.FLAVOR;
            } else {
                str = " with id '" + this.f213a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f214b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f213a.getClass() + str);
        }
        try {
            this.f215c.invoke(this.f216d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
