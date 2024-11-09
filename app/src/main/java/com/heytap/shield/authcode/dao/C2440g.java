package com.heytap.shield.authcode.dao;

import android.database.Cursor;
import androidx.p032e.p033a.InterfaceC0646b;
import androidx.room.AbstractC0937af;
import androidx.room.C0938ag;
import androidx.room.p038a.C0927e;
import androidx.room.p038a.C0928f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: AuthenticationDb_Impl.java */
/* renamed from: com.heytap.shield.authcode.dao.g */
/* loaded from: classes.dex */
final class C2440g extends AbstractC0937af {

    /* renamed from: b */
    final /* synthetic */ AuthenticationDb_Impl f10716b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2440g(AuthenticationDb_Impl authenticationDb_Impl) {
        this.f10716b = authenticationDb_Impl;
    }

    @Override // androidx.room.AbstractC0937af
    /* renamed from: b */
    public final void mo3358b(InterfaceC0646b interfaceC0646b) {
        interfaceC0646b.mo2214c("CREATE TABLE IF NOT EXISTS `a_e` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `auth_code` TEXT, `is_enable` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `packageName` TEXT, `capability_name` TEXT, `expiration` INTEGER NOT NULL, `permission` BLOB, `last_update_time` INTEGER NOT NULL, `cache_time` INTEGER NOT NULL)");
        interfaceC0646b.mo2214c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        interfaceC0646b.mo2214c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4900734c010240a846af4887983ab420')");
    }

    @Override // androidx.room.AbstractC0937af
    /* renamed from: a */
    public final void mo3357a(InterfaceC0646b interfaceC0646b) {
        List list;
        List list2;
        List list3;
        interfaceC0646b.mo2214c("DROP TABLE IF EXISTS `a_e`");
        list = this.f10716b.f3936c;
        if (list != null) {
            list2 = this.f10716b.f3936c;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list3 = this.f10716b.f3936c;
                list3.get(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.AbstractC0937af
    /* renamed from: a */
    public final void mo3356a() {
        List list;
        List list2;
        List list3;
        list = this.f10716b.f3936c;
        if (list != null) {
            list2 = this.f10716b.f3936c;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list3 = this.f10716b.f3936c;
                list3.get(i);
            }
        }
    }

    @Override // androidx.room.AbstractC0937af
    /* renamed from: c */
    public final void mo3359c(InterfaceC0646b interfaceC0646b) {
        List list;
        List list2;
        List list3;
        this.f10716b.f3934a = interfaceC0646b;
        this.f10716b.m3404a(interfaceC0646b);
        list = this.f10716b.f3936c;
        if (list != null) {
            list2 = this.f10716b.f3936c;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list3 = this.f10716b.f3936c;
                list3.get(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.AbstractC0937af
    /* renamed from: d */
    public final C0938ag mo3360d(InterfaceC0646b interfaceC0646b) {
        HashMap hashMap = new HashMap(10);
        hashMap.put("id", new C0928f("id", "INTEGER", true, 1, null, 1));
        hashMap.put("auth_code", new C0928f("auth_code", "TEXT", false, 0, null, 1));
        hashMap.put("is_enable", new C0928f("is_enable", "INTEGER", true, 0, null, 1));
        hashMap.put("uid", new C0928f("uid", "INTEGER", true, 0, null, 1));
        hashMap.put("packageName", new C0928f("packageName", "TEXT", false, 0, null, 1));
        hashMap.put("capability_name", new C0928f("capability_name", "TEXT", false, 0, null, 1));
        hashMap.put("expiration", new C0928f("expiration", "INTEGER", true, 0, null, 1));
        hashMap.put("permission", new C0928f("permission", "BLOB", false, 0, null, 1));
        hashMap.put("last_update_time", new C0928f("last_update_time", "INTEGER", true, 0, null, 1));
        hashMap.put("cache_time", new C0928f("cache_time", "INTEGER", true, 0, null, 1));
        C0927e c0927e = new C0927e("a_e", hashMap, new HashSet(0), new HashSet(0));
        C0927e m3340a = C0927e.m3340a(interfaceC0646b, "a_e");
        if (!c0927e.equals(m3340a)) {
            return new C0938ag(false, "a_e(com.heytap.shield.authcode.dao.AuthenticationDbBean).\n Expected:\n" + c0927e + "\n Found:\n" + m3340a);
        }
        return new C0938ag(true, null);
    }

    @Override // androidx.room.AbstractC0937af
    /* renamed from: e */
    public final void mo3361e(InterfaceC0646b interfaceC0646b) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor mo2211b = interfaceC0646b.mo2211b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (mo2211b.moveToNext()) {
            try {
                arrayList.add(mo2211b.getString(0));
            } catch (Throwable th) {
                mo2211b.close();
                throw th;
            }
        }
        mo2211b.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                interfaceC0646b.mo2214c("DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }
}
