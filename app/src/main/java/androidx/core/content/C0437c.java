package androidx.core.content;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: FileProvider.java */
/* renamed from: androidx.core.content.c */
/* loaded from: classes.dex */
final class C0437c implements InterfaceC0436b {

    /* renamed from: a */
    private final String f2175a;

    /* renamed from: b */
    private final HashMap<String, File> f2176b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0437c(String str) {
        this.f2175a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1551a(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        try {
            this.f2176b.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file)), e);
        }
    }

    @Override // androidx.core.content.InterfaceC0436b
    /* renamed from: a */
    public final File mo1550a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = this.f2176b.get(decode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (canonicalFile.getPath().startsWith(file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file2)));
        }
    }
}
