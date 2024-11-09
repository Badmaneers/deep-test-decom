package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.p011b.C0318a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: VersionedParcel.java */
/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
public abstract class AbstractC1091b {

    /* renamed from: a */
    protected final C0318a<String, Method> f4359a;

    /* renamed from: b */
    protected final C0318a<String, Method> f4360b;

    /* renamed from: c */
    protected final C0318a<String, Class> f4361c;

    /* renamed from: a */
    protected abstract void mo3625a();

    /* renamed from: a */
    protected abstract void mo3626a(int i);

    /* renamed from: a */
    protected abstract void mo3628a(Parcelable parcelable);

    /* renamed from: a */
    protected abstract void mo3631a(CharSequence charSequence);

    /* renamed from: a */
    protected abstract void mo3633a(String str);

    /* renamed from: a */
    protected abstract void mo3634a(boolean z);

    /* renamed from: a */
    protected abstract void mo3636a(byte[] bArr);

    /* renamed from: b */
    protected abstract AbstractC1091b mo3639b();

    /* renamed from: b */
    protected abstract boolean mo3644b(int i);

    /* renamed from: c */
    protected abstract int mo3646c();

    /* renamed from: c */
    protected abstract void mo3649c(int i);

    /* renamed from: d */
    protected abstract String mo3651d();

    /* renamed from: e */
    protected abstract byte[] mo3652e();

    /* renamed from: f */
    protected abstract CharSequence mo3653f();

    /* renamed from: g */
    protected abstract <T extends Parcelable> T mo3654g();

    /* renamed from: h */
    protected abstract boolean mo3655h();

    public AbstractC1091b(C0318a<String, Method> c0318a, C0318a<String, Method> c0318a2, C0318a<String, Class> c0318a3) {
        this.f4359a = c0318a;
        this.f4360b = c0318a2;
        this.f4361c = c0318a3;
    }

    /* renamed from: a */
    public final void m3635a(boolean z, int i) {
        mo3649c(i);
        mo3634a(z);
    }

    /* renamed from: b */
    public final void m3643b(byte[] bArr) {
        mo3649c(2);
        mo3636a(bArr);
    }

    /* renamed from: a */
    public final void m3632a(CharSequence charSequence, int i) {
        mo3649c(i);
        mo3631a(charSequence);
    }

    /* renamed from: a */
    public final void m3627a(int i, int i2) {
        mo3649c(i2);
        mo3626a(i);
    }

    /* renamed from: b */
    public final void m3642b(String str) {
        mo3649c(7);
        mo3633a(str);
    }

    /* renamed from: a */
    public final void m3629a(Parcelable parcelable, int i) {
        mo3649c(i);
        mo3628a(parcelable);
    }

    /* renamed from: b */
    public final boolean m3645b(boolean z, int i) {
        return !mo3644b(i) ? z : mo3655h();
    }

    /* renamed from: b */
    public final int m3637b(int i, int i2) {
        return !mo3644b(i2) ? i : mo3646c();
    }

    /* renamed from: c */
    public final String m3648c(String str) {
        return !mo3644b(7) ? str : mo3651d();
    }

    /* renamed from: c */
    public final byte[] m3650c(byte[] bArr) {
        return !mo3644b(2) ? bArr : mo3652e();
    }

    /* renamed from: b */
    public final <T extends Parcelable> T m3638b(T t, int i) {
        return !mo3644b(i) ? t : (T) mo3654g();
    }

    /* renamed from: b */
    public final CharSequence m3640b(CharSequence charSequence, int i) {
        return !mo3644b(i) ? charSequence : mo3653f();
    }

    /* renamed from: a */
    public final void m3630a(InterfaceC1093d interfaceC1093d) {
        mo3649c(1);
        m3641b(interfaceC1093d);
    }

    /* renamed from: b */
    public final void m3641b(InterfaceC1093d interfaceC1093d) {
        if (interfaceC1093d == null) {
            mo3633a((String) null);
            return;
        }
        m3624d(interfaceC1093d);
        AbstractC1091b mo3639b = mo3639b();
        m3622a((AbstractC1091b) interfaceC1093d, mo3639b);
        mo3639b.mo3625a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private void m3624d(InterfaceC1093d interfaceC1093d) {
        try {
            mo3633a(m3623b((Class<? extends InterfaceC1093d>) interfaceC1093d.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(interfaceC1093d.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    public final <T extends InterfaceC1093d> T m3647c(T t) {
        return !mo3644b(1) ? t : (T) m3656i();
    }

    /* renamed from: i */
    public final <T extends InterfaceC1093d> T m3656i() {
        String mo3651d = mo3651d();
        if (mo3651d == null) {
            return null;
        }
        return (T) m3620a(mo3651d, mo3639b());
    }

    /* renamed from: a */
    private <T extends InterfaceC1093d> void m3622a(T t, AbstractC1091b abstractC1091b) {
        try {
            m3621a(t.getClass()).invoke(null, t, abstractC1091b);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private Method m3621a(Class cls) {
        Method method = this.f4360b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class m3623b = m3623b((Class<? extends InterfaceC1093d>) cls);
        System.currentTimeMillis();
        Method declaredMethod = m3623b.getDeclaredMethod("write", cls, AbstractC1091b.class);
        this.f4360b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    private Class m3623b(Class<? extends InterfaceC1093d> cls) {
        Class cls2 = this.f4361c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f4361c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: a */
    private <T extends InterfaceC1093d> T m3620a(String str, AbstractC1091b abstractC1091b) {
        try {
            Method method = this.f4359a.get(str);
            if (method == null) {
                System.currentTimeMillis();
                method = Class.forName(str, true, AbstractC1091b.class.getClassLoader()).getDeclaredMethod("read", AbstractC1091b.class);
                this.f4359a.put(str, method);
            }
            return (T) method.invoke(null, abstractC1091b);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }
}
