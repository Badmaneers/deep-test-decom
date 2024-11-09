package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import neton.client.dns.IpInfo;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityChooserModel.java */
/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
public class C0313v extends DataSetObservable {

    /* renamed from: a */
    static final String f1439a = "v";

    /* renamed from: e */
    private static final Object f1440e = new Object();

    /* renamed from: f */
    private static final Map<String, C0313v> f1441f = new HashMap();

    /* renamed from: b */
    final Context f1442b;

    /* renamed from: c */
    final String f1443c;

    /* renamed from: d */
    boolean f1444d;

    /* renamed from: g */
    private final Object f1445g;

    /* renamed from: h */
    private final List<C0314w> f1446h;

    /* renamed from: i */
    private final List<C0316y> f1447i;

    /* renamed from: j */
    private Intent f1448j;

    /* renamed from: k */
    private InterfaceC0315x f1449k;

    /* renamed from: l */
    private int f1450l;

    /* renamed from: m */
    private boolean f1451m;

    /* renamed from: n */
    private boolean f1452n;

    /* renamed from: o */
    private boolean f1453o;

    /* renamed from: p */
    private InterfaceC0317z f1454p;

    /* renamed from: a */
    public final int m998a() {
        int size;
        synchronized (this.f1445g) {
            m992e();
            size = this.f1446h.size();
        }
        return size;
    }

    /* renamed from: a */
    public final ResolveInfo m1000a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f1445g) {
            m992e();
            resolveInfo = this.f1446h.get(i).f1455a;
        }
        return resolveInfo;
    }

    /* renamed from: a */
    public final int m999a(ResolveInfo resolveInfo) {
        synchronized (this.f1445g) {
            m992e();
            List<C0314w> list = this.f1446h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f1455a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public final Intent m1001b(int i) {
        synchronized (this.f1445g) {
            if (this.f1448j == null) {
                return null;
            }
            m992e();
            C0314w c0314w = this.f1446h.get(i);
            ComponentName componentName = new ComponentName(c0314w.f1455a.activityInfo.packageName, c0314w.f1455a.activityInfo.name);
            Intent intent = new Intent(this.f1448j);
            intent.setComponent(componentName);
            if (this.f1454p != null) {
                new Intent(intent);
                if (this.f1454p.m1005a()) {
                    return null;
                }
            }
            m990a(new C0316y(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: b */
    public final ResolveInfo m1002b() {
        synchronized (this.f1445g) {
            m992e();
            if (this.f1446h.isEmpty()) {
                return null;
            }
            return this.f1446h.get(0).f1455a;
        }
    }

    /* renamed from: c */
    public final void m1004c(int i) {
        synchronized (this.f1445g) {
            m992e();
            C0314w c0314w = this.f1446h.get(i);
            C0314w c0314w2 = this.f1446h.get(0);
            m990a(new C0316y(new ComponentName(c0314w.f1455a.activityInfo.packageName, c0314w.f1455a.activityInfo.name), System.currentTimeMillis(), c0314w2 != null ? (c0314w2.f1456b - c0314w.f1456b) + 5.0f : 1.0f));
        }
    }

    /* renamed from: d */
    private void m991d() {
        if (!this.f1451m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f1452n) {
            this.f1452n = false;
            if (TextUtils.isEmpty(this.f1443c)) {
                return;
            }
            new AsyncTaskC0182aa(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f1447i), this.f1443c);
        }
    }

    /* renamed from: c */
    public final int m1003c() {
        int size;
        synchronized (this.f1445g) {
            m992e();
            size = this.f1447i.size();
        }
        return size;
    }

    /* renamed from: e */
    private void m992e() {
        boolean m994g = m994g() | m995h();
        m996i();
        if (m994g) {
            m993f();
            notifyChanged();
        }
    }

    /* renamed from: f */
    private boolean m993f() {
        if (this.f1449k == null || this.f1448j == null || this.f1446h.isEmpty() || this.f1447i.isEmpty()) {
            return false;
        }
        Collections.unmodifiableList(this.f1447i);
        return true;
    }

    /* renamed from: g */
    private boolean m994g() {
        if (!this.f1453o || this.f1448j == null) {
            return false;
        }
        this.f1453o = false;
        this.f1446h.clear();
        List<ResolveInfo> queryIntentActivities = this.f1442b.getPackageManager().queryIntentActivities(this.f1448j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f1446h.add(new C0314w(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: h */
    private boolean m995h() {
        if (!this.f1444d || !this.f1452n || TextUtils.isEmpty(this.f1443c)) {
            return false;
        }
        this.f1444d = false;
        this.f1451m = true;
        m997j();
        return true;
    }

    /* renamed from: a */
    private boolean m990a(C0316y c0316y) {
        boolean add = this.f1447i.add(c0316y);
        if (add) {
            this.f1452n = true;
            m996i();
            m991d();
            m993f();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: i */
    private void m996i() {
        int size = this.f1447i.size() - this.f1450l;
        if (size <= 0) {
            return;
        }
        this.f1452n = true;
        for (int i = 0; i < size; i++) {
            this.f1447i.remove(0);
        }
    }

    /* renamed from: j */
    private void m997j() {
        try {
            FileInputStream openFileInput = this.f1442b.openFileInput(this.f1443c);
            try {
                try {
                    try {
                        XmlPullParser newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                        }
                        if (!"historical-records".equals(newPullParser.getName())) {
                            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                        }
                        List<C0316y> list = this.f1447i;
                        list.clear();
                        while (true) {
                            int next = newPullParser.next();
                            if (next == 1) {
                                if (openFileInput != null) {
                                    try {
                                        openFileInput.close();
                                        return;
                                    } catch (IOException unused) {
                                        return;
                                    }
                                }
                                return;
                            }
                            if (next != 3 && next != 4) {
                                if (!"historical-record".equals(newPullParser.getName())) {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                                list.add(new C0316y(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, IpInfo.WEIGHT))));
                            }
                        }
                    } catch (IOException e) {
                        Log.e(f1439a, "Error reading historical recrod file: " + this.f1443c, e);
                        if (openFileInput != null) {
                            try {
                                openFileInput.close();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                } catch (XmlPullParserException e2) {
                    Log.e(f1439a, "Error reading historical recrod file: " + this.f1443c, e2);
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
        }
    }
}
