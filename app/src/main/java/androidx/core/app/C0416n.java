package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.core.content.C0420a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* renamed from: androidx.core.app.n */
/* loaded from: classes.dex */
public final class C0416n implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f2142a = new ArrayList<>();

    /* renamed from: b */
    private final Context f2143b;

    private C0416n(Context context) {
        this.f2143b = context;
    }

    /* renamed from: a */
    public static C0416n m1474a(Context context) {
        return new C0416n(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final C0416n m1475a(Activity activity) {
        Intent mo67f = ((InterfaceC0417o) activity).mo67f();
        if (mo67f == null) {
            mo67f = C0414l.m1469a(activity);
        }
        if (mo67f != null) {
            ComponentName component = mo67f.getComponent();
            if (component == null) {
                component = mo67f.resolveActivity(this.f2143b.getPackageManager());
            }
            m1473a(component);
            this.f2142a.add(mo67f);
        }
        return this;
    }

    /* renamed from: a */
    private C0416n m1473a(ComponentName componentName) {
        int size = this.f2142a.size();
        try {
            Intent m1470a = C0414l.m1470a(this.f2143b, componentName);
            while (m1470a != null) {
                this.f2142a.add(size, m1470a);
                m1470a = C0414l.m1470a(this.f2143b, m1470a.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f2142a.iterator();
    }

    /* renamed from: a */
    public final void m1476a() {
        if (this.f2142a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f2142a.toArray(new Intent[this.f2142a.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        C0420a.m1484a(this.f2143b, intentArr);
    }
}
