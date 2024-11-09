package com.heytap.shield.p086a;

import com.coloros.neton.BuildConfig;
import java.lang.reflect.Field;
import java.util.HashMap;

/* compiled from: SystemServiceMap.java */
/* renamed from: com.heytap.shield.a.c */
/* loaded from: classes.dex */
public final class C2428c implements InterfaceC2426a {

    /* renamed from: a */
    private HashMap<Integer, String> f10684a = new HashMap<>();

    /* renamed from: b */
    private String f10685b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2428c(String str) {
        this.f10685b = str;
        m7730b();
    }

    /* renamed from: b */
    private void m7730b() {
        try {
            Class<?> cls = Class.forName(this.f10685b + "$Stub");
            for (Field field : cls.getDeclaredFields()) {
                if (field.getName().startsWith("TRANSACTION_")) {
                    field.setAccessible(true);
                    this.f10684a.put(Integer.valueOf(field.getInt(cls)), field.getName().replaceFirst("TRANSACTION_", BuildConfig.FLAVOR));
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override // com.heytap.shield.p086a.InterfaceC2426a
    /* renamed from: a */
    public final String mo7727a(int i) {
        if (this.f10684a.containsKey(Integer.valueOf(i))) {
            return this.f10684a.get(Integer.valueOf(i));
        }
        return null;
    }

    @Override // com.heytap.shield.p086a.InterfaceC2426a
    /* renamed from: a */
    public final String mo7726a() {
        return this.f10685b;
    }
}
