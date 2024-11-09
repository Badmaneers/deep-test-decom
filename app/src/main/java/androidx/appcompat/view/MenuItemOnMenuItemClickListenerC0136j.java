package androidx.appcompat.view;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: SupportMenuInflater.java */
/* renamed from: androidx.appcompat.view.j */
/* loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC0136j implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private static final Class<?>[] f468a = {MenuItem.class};

    /* renamed from: b */
    private Object f469b;

    /* renamed from: c */
    private Method f470c;

    public MenuItemOnMenuItemClickListenerC0136j(Object obj, String str) {
        this.f469b = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f470c = cls.getMethod(str, f468a);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f470c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f470c.invoke(this.f469b, menuItem)).booleanValue();
            }
            this.f470c.invoke(this.f469b, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
