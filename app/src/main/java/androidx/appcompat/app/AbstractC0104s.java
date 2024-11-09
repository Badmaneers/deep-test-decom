package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p011b.C0320c;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate.java */
/* renamed from: androidx.appcompat.app.s */
/* loaded from: classes.dex */
public abstract class AbstractC0104s {

    /* renamed from: a */
    private static int f361a = -100;

    /* renamed from: b */
    private static final C0320c<WeakReference<AbstractC0104s>> f362b = new C0320c<>();

    /* renamed from: c */
    private static final Object f363c = new Object();

    /* renamed from: a */
    public abstract AbstractC0059a mo97a();

    /* renamed from: a */
    public void mo99a(int i) {
    }

    /* renamed from: a */
    public abstract void mo101a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo102a(View view);

    /* renamed from: a */
    public abstract void mo103a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo106a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo110b();

    /* renamed from: b */
    public abstract <T extends View> T mo111b(int i);

    /* renamed from: b */
    public abstract void mo112b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo114c();

    /* renamed from: c */
    public abstract void mo115c(int i);

    /* renamed from: d */
    public abstract void mo116d();

    /* renamed from: d */
    public abstract boolean mo117d(int i);

    /* renamed from: e */
    public abstract void mo118e();

    /* renamed from: f */
    public abstract void mo120f();

    /* renamed from: g */
    public abstract void mo123g();

    /* renamed from: h */
    public void mo124h() {
    }

    /* renamed from: i */
    public abstract void mo127i();

    /* renamed from: j */
    public abstract void mo128j();

    /* renamed from: k */
    public abstract void mo129k();

    /* renamed from: l */
    public abstract void mo130l();

    /* renamed from: m */
    public int mo131m() {
        return -100;
    }

    /* renamed from: a */
    public static AbstractC0104s m244a(Activity activity, InterfaceC0103r interfaceC0103r) {
        return new AppCompatDelegateImpl(activity, interfaceC0103r);
    }

    /* renamed from: a */
    public static AbstractC0104s m245a(Dialog dialog, InterfaceC0103r interfaceC0103r) {
        return new AppCompatDelegateImpl(dialog, interfaceC0103r);
    }

    /* renamed from: n */
    public static int m249n() {
        return f361a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m246a(AbstractC0104s abstractC0104s) {
        synchronized (f363c) {
            m248c(abstractC0104s);
            f362b.add(new WeakReference<>(abstractC0104s));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m247b(AbstractC0104s abstractC0104s) {
        synchronized (f363c) {
            m248c(abstractC0104s);
        }
    }

    /* renamed from: c */
    private static void m248c(AbstractC0104s abstractC0104s) {
        synchronized (f363c) {
            Iterator<WeakReference<AbstractC0104s>> it = f362b.iterator();
            while (it.hasNext()) {
                AbstractC0104s abstractC0104s2 = it.next().get();
                if (abstractC0104s2 == abstractC0104s || abstractC0104s2 == null) {
                    it.remove();
                }
            }
        }
    }
}
