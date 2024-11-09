package com.heytap.epona.p085a;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.SystemProperties;

/* compiled from: Logger.java */
/* renamed from: com.heytap.epona.a.b */
/* loaded from: classes.dex */
final class C2413b extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2413b(byte b) {
        this();
    }

    private C2413b() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        C2412a.m7711a(SystemProperties.getBoolean("persist.sys.assert.panic", false));
        C2412a.m7708a();
    }
}
