package com.heytap.epona.ipc.remote;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public class DispatcherProvider extends ContentProvider {
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
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -388087951) {
            if (str.equals("com.heytap.epona.Dispatcher.REGISTER_TRANSFER")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 272846363) {
            if (hashCode == 581077383 && str.equals("com.heytap.epona.Dispatcher.REMOTE_SNAPSHOT")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("com.heytap.epona.Dispatcher.FIND_TRANSFER")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                Bundle bundle2 = new Bundle();
                if (bundle != null) {
                    bundle2.putBinder("com.heytap.epona.Dispatcher.TRANSFER_VALUE", C2424a.m7720a().m7723a(bundle.getString("com.heytap.epona.Dispatcher.TRANSFER_KEY")));
                }
                return bundle2;
            case 1:
                String callingPackage = getCallingPackage();
                Bundle bundle3 = new Bundle();
                if (bundle != null) {
                    bundle3.putBoolean("REGISTER_TRANSFER_RESULT", C2424a.m7720a().m7724a(bundle.getString("com.heytap.epona.Dispatcher.TRANSFER_KEY"), bundle.getBinder("com.heytap.epona.Dispatcher.TRANSFER_VALUE"), callingPackage));
                }
                return bundle3;
            case 2:
                Bundle bundle4 = new Bundle();
                bundle4.putString("REMOTE_SNAPSHOT", C2424a.m7720a().m7725b());
                return bundle4;
            default:
                return super.call(str, str2, bundle);
        }
    }
}
