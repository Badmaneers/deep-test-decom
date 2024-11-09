package com.heytap.tingle.ipc;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.heytap.shield.C2441b;
import p000a.p001a.C0000a;

/* loaded from: classes.dex */
public class MasterProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C0000a.m3a("SlaveProvider onCreate", new Object[0]);
        C2441b.m7776b().m7777a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if ("sendBinder".equals(str)) {
            bundle2.putBinder("com.heytap.epona.ext_binder", BinderC2466f.m7810c());
        }
        return bundle2;
    }
}
