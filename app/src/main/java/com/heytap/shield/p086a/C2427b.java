package com.heytap.shield.p086a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: ServiceMap.java */
/* renamed from: com.heytap.shield.a.b */
/* loaded from: classes.dex */
public final class C2427b {

    /* renamed from: a */
    private static List<InterfaceC2426a> f10681a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private static Map<String, String> f10682b = new ConcurrentHashMap();

    /* renamed from: c */
    private static List<String> f10683c = new ArrayList(Arrays.asList("android.app.IActivityManager", "android.content.pm.IPackageManager", "android.view.IWindowManager"));

    /* renamed from: a */
    public static void m7729a() {
        Iterator<String> it = f10683c.iterator();
        while (it.hasNext()) {
            f10681a.add(new C2428c(it.next()));
        }
        f10682b.put("android.view.IWindowSession", "IWindowSession");
    }

    /* renamed from: a */
    public static String m7728a(String str, int i) {
        if (f10682b.containsKey(str)) {
            return f10682b.get(str);
        }
        for (InterfaceC2426a interfaceC2426a : f10681a) {
            if (TextUtils.equals(interfaceC2426a.mo7726a(), str)) {
                return interfaceC2426a.mo7727a(i);
            }
        }
        C2428c c2428c = new C2428c(str);
        f10681a.add(c2428c);
        return c2428c.mo7727a(i);
    }
}
