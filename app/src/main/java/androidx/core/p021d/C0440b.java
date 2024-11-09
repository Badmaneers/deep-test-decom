package androidx.core.p021d;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import androidx.core.content.p020a.AbstractC0432l;
import androidx.core.content.p020a.C0423c;
import androidx.core.graphics.C0552e;
import androidx.core.graphics.C0562o;
import androidx.p011b.C0324g;
import androidx.p011b.C0328n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import neton.client.Utils.ResponseCode;

/* compiled from: FontsContractCompat.java */
/* renamed from: androidx.core.d.b */
/* loaded from: classes.dex */
public final class C0440b {

    /* renamed from: a */
    static final C0324g<String, Typeface> f2183a = new C0324g<>(16);

    /* renamed from: d */
    private static final C0448j f2186d = new C0448j("fonts");

    /* renamed from: b */
    static final Object f2184b = new Object();

    /* renamed from: c */
    static final C0328n<String, ArrayList<InterfaceC0453o<C0447i>>> f2185c = new C0328n<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f2187e = new C0444f();

    /* renamed from: a */
    public static Typeface m1559a(Context context, C0439a c0439a, AbstractC0432l abstractC0432l, Handler handler, boolean z, int i, int i2) {
        String str = c0439a.m1558f() + "-" + i2;
        Typeface m1045a = f2183a.m1045a((C0324g<String, Typeface>) str);
        if (m1045a != null) {
            if (abstractC0432l != null) {
                abstractC0432l.mo789a(m1045a);
            }
            return m1045a;
        }
        if (z && i == -1) {
            C0447i m1560a = m1560a(context, c0439a, i2);
            if (abstractC0432l != null) {
                if (m1560a.f2203b == 0) {
                    abstractC0432l.m1533a(m1560a.f2202a, (Handler) null);
                } else {
                    abstractC0432l.m1532a(m1560a.f2203b, (Handler) null);
                }
            }
            return m1560a.f2202a;
        }
        CallableC0441c callableC0441c = new CallableC0441c(context, c0439a, i2, str);
        if (z) {
            try {
                return ((C0447i) f2186d.m1574a(callableC0441c, i)).f2202a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C0442d c0442d = abstractC0432l == null ? null : new C0442d(abstractC0432l, null);
        synchronized (f2184b) {
            ArrayList<InterfaceC0453o<C0447i>> arrayList = f2185c.get(str);
            if (arrayList != null) {
                if (c0442d != null) {
                    arrayList.add(c0442d);
                }
                return null;
            }
            if (c0442d != null) {
                ArrayList<InterfaceC0453o<C0447i>> arrayList2 = new ArrayList<>();
                arrayList2.add(c0442d);
                f2185c.put(str, arrayList2);
            }
            f2186d.m1577a(callableC0441c, new C0443e(str));
            return null;
        }
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m1562a(Context context, C0446h[] c0446hArr) {
        HashMap hashMap = new HashMap();
        for (C0446h c0446h : c0446hArr) {
            if (c0446h.m1572e() == 0) {
                Uri m1568a = c0446h.m1568a();
                if (!hashMap.containsKey(m1568a)) {
                    hashMap.put(m1568a, C0562o.m1977a(context, m1568a));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m1563a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static List<byte[]> m1561a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static C0446h[] m1564a(Context context, C0439a c0439a, String str) {
        Cursor query;
        Uri withAppendedId;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            if (Build.VERSION.SDK_INT > 16) {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0439a.m1555c()}, null, null);
            } else {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0439a.m1555c()}, null);
            }
            cursor = query;
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    arrayList2.add(new C0446h(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : ResponseCode.CODE_4XX_BAD_REQUEST, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C0446h[]) arrayList.toArray(new C0446h[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: a */
    public static C0447i m1560a(Context context, C0439a c0439a, int i) {
        List<List<byte[]>> m1504a;
        C0445g c0445g;
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String m1553a = c0439a.m1553a();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m1553a, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(String.valueOf(m1553a)));
            }
            if (!resolveContentProvider.packageName.equals(c0439a.m1554b())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + m1553a + ", but package was not " + c0439a.m1554b());
            }
            List<byte[]> m1561a = m1561a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(m1561a, f2187e);
            if (c0439a.m1556d() != null) {
                m1504a = c0439a.m1556d();
            } else {
                m1504a = C0423c.m1504a(resources, c0439a.m1557e());
            }
            int i2 = 0;
            while (true) {
                if (i2 >= m1504a.size()) {
                    resolveContentProvider = null;
                    break;
                }
                ArrayList arrayList = new ArrayList(m1504a.get(i2));
                Collections.sort(arrayList, f2187e);
                if (m1563a(m1561a, arrayList)) {
                    break;
                }
                i2++;
            }
            if (resolveContentProvider == null) {
                c0445g = new C0445g(1, null);
            } else {
                c0445g = new C0445g(0, m1564a(context, c0439a, resolveContentProvider.authority));
            }
            if (c0445g.m1566a() == 0) {
                Typeface m1945a = C0552e.m1945a(context, c0445g.m1567b(), i);
                return new C0447i(m1945a, m1945a != null ? 0 : -3);
            }
            return new C0447i(null, c0445g.m1566a() == 1 ? -2 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0447i(null, -1);
        }
    }
}
