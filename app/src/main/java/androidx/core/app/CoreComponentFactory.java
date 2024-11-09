package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m1450a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m1450a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m1450a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m1450a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m1450a(super.instantiateService(classLoader, str, intent));
    }

    /* renamed from: a */
    private static <T> T m1450a(T t) {
        T t2;
        return (!(t instanceof InterfaceC0413k) || (t2 = (T) ((InterfaceC0413k) t).m1468a()) == null) ? t : t2;
    }
}
