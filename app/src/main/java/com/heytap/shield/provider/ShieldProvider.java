package com.heytap.shield.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.heytap.shield.C2441b;
import com.heytap.shield.p088b.C2443b;

/* loaded from: classes.dex */
public class ShieldProvider extends ContentProvider {
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
    public boolean onCreate() {
        return false;
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
    public Bundle call(String str, String str2, Bundle bundle) {
        if ("open_auth".equals(str) && bundle != null) {
            boolean z = bundle.getBoolean("status");
            C2443b.m7789a("Provider Caller " + getCallingPackage() + " open : " + z);
            if (z) {
                C2441b.m7776b().m7778a(getCallingPackage());
            } else {
                C2441b.m7776b().m7780b(getCallingPackage());
            }
        }
        return super.call(str, str2, bundle);
    }
}
