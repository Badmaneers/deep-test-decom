package com.heytap.shield.authcode;

import com.heytap.shield.p088b.C2448g;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PermissionTable.java */
/* renamed from: com.heytap.shield.authcode.c */
/* loaded from: classes.dex */
public final class C2433c {

    /* renamed from: a */
    private List<String> f10696a = new CopyOnWriteArrayList();

    public C2433c(String str) {
        this.f10696a.clear();
        this.f10696a.addAll(C2448g.m7804a(str, ","));
    }

    /* renamed from: a */
    public final boolean m7748a(String str) {
        if (this.f10696a.size() != 0) {
            return this.f10696a.contains(str);
        }
        return false;
    }
}
