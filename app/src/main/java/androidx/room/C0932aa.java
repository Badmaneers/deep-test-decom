package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import androidx.p002a.p003a.p004a.C0036a;
import androidx.p032e.p033a.InterfaceC0651g;
import androidx.p032e.p033a.p034a.C0643f;
import androidx.room.AbstractC0969z;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: RoomDatabase.java */
/* renamed from: androidx.room.aa */
/* loaded from: classes.dex */
public final class C0932aa<T extends AbstractC0969z> {

    /* renamed from: a */
    private final Class<T> f3827a;

    /* renamed from: b */
    private final String f3828b;

    /* renamed from: c */
    private final Context f3829c;

    /* renamed from: d */
    private ArrayList<Object> f3830d;

    /* renamed from: e */
    private Executor f3831e;

    /* renamed from: f */
    private Executor f3832f;

    /* renamed from: g */
    private InterfaceC0651g f3833g;

    /* renamed from: h */
    private boolean f3834h;

    /* renamed from: j */
    private boolean f3836j;

    /* renamed from: l */
    private boolean f3838l;

    /* renamed from: n */
    private Set<Integer> f3840n;

    /* renamed from: o */
    private Set<Integer> f3841o;

    /* renamed from: p */
    private String f3842p;

    /* renamed from: q */
    private File f3843q;

    /* renamed from: i */
    private int f3835i = C0933ab.f3844a;

    /* renamed from: k */
    private boolean f3837k = true;

    /* renamed from: m */
    private final C0934ac f3839m = new C0934ac();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0932aa(Context context, Class<T> cls, String str) {
        this.f3829c = context;
        this.f3827a = cls;
        this.f3828b = str;
    }

    /* renamed from: a */
    public final C0932aa<T> m3347a() {
        this.f3834h = true;
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    public final T m3348b() {
        ActivityManager activityManager;
        if (this.f3829c == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        if (this.f3827a == null) {
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        if (this.f3831e == null && this.f3832f == null) {
            Executor m11b = C0036a.m11b();
            this.f3832f = m11b;
            this.f3831e = m11b;
        } else if (this.f3831e != null && this.f3832f == null) {
            this.f3832f = this.f3831e;
        } else if (this.f3831e == null && this.f3832f != null) {
            this.f3831e = this.f3832f;
        }
        if (this.f3841o != null && this.f3840n != null) {
            for (Integer num : this.f3841o) {
                if (this.f3840n.contains(num)) {
                    throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ".concat(String.valueOf(num)));
                }
            }
        }
        if (this.f3833g == null) {
            this.f3833g = new C0643f();
        }
        if (this.f3842p != null || this.f3843q != null) {
            if (this.f3828b == null) {
                throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
            }
            if (this.f3842p != null && this.f3843q != null) {
                throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
            }
            this.f3833g = new C0941aj(this.f3842p, this.f3843q, this.f3833g);
        }
        Context context = this.f3829c;
        String str = this.f3828b;
        InterfaceC0651g interfaceC0651g = this.f3833g;
        C0934ac c0934ac = this.f3839m;
        ArrayList<Object> arrayList = this.f3830d;
        boolean z = this.f3834h;
        int i = this.f3835i;
        Context context2 = this.f3829c;
        if (i == C0933ab.f3844a) {
            if (Build.VERSION.SDK_INT >= 16 && (activityManager = (ActivityManager) context2.getSystemService("activity")) != null) {
                if (!(Build.VERSION.SDK_INT >= 19 ? activityManager.isLowRamDevice() : false)) {
                    i = C0933ab.f3846c;
                }
            }
            i = C0933ab.f3845b;
        }
        C0922a c0922a = new C0922a(context, str, interfaceC0651g, c0934ac, arrayList, z, i, this.f3831e, this.f3832f, this.f3836j, this.f3837k, this.f3838l, this.f3840n, this.f3842p, this.f3843q);
        T t = (T) C0968y.m3400a(this.f3827a, "_Impl");
        t.m3405a(c0922a);
        return t;
    }
}
