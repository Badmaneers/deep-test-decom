package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import neton.MediaType;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: a */
    private static final String[] f2149a = {"_display_name", "_size"};

    /* renamed from: b */
    private static final File f2150b = new File("/");

    /* renamed from: c */
    private static HashMap<String, InterfaceC0436b> f2151c = new HashMap<>();

    /* renamed from: d */
    private InterfaceC0436b f2152d;

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.f2152d = m1481a(context, providerInfo.authority);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File mo1550a = this.f2152d.mo1550a(uri);
        if (strArr == null) {
            strArr = f2149a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = mo1550a.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(mo1550a.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File mo1550a = this.f2152d.mo1550a(uri);
        int lastIndexOf = mo1550a.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return MediaType.OCTET_STREAM;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo1550a.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : MediaType.OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f2152d.mo1550a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File mo1550a = this.f2152d.mo1550a(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(mo1550a, i);
    }

    /* renamed from: a */
    private static InterfaceC0436b m1481a(Context context, String str) {
        InterfaceC0436b interfaceC0436b;
        synchronized (f2151c) {
            InterfaceC0436b interfaceC0436b2 = f2151c.get(str);
            interfaceC0436b = interfaceC0436b2;
            if (interfaceC0436b2 == null) {
                try {
                    C0437c c0437c = new C0437c(str);
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                    if (resolveContentProvider == null) {
                        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(String.valueOf(str)));
                    }
                    XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                    if (loadXmlMetaData != null) {
                        while (true) {
                            int next = loadXmlMetaData.next();
                            if (next == 1) {
                                break;
                            }
                            if (next == 2) {
                                String name = loadXmlMetaData.getName();
                                File file = null;
                                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                                if ("root-path".equals(name)) {
                                    file = f2150b;
                                } else if ("files-path".equals(name)) {
                                    file = context.getFilesDir();
                                } else if ("cache-path".equals(name)) {
                                    file = context.getCacheDir();
                                } else if ("external-path".equals(name)) {
                                    file = Environment.getExternalStorageDirectory();
                                } else if ("external-files-path".equals(name)) {
                                    File[] m1485a = C0420a.m1485a(context);
                                    if (m1485a.length > 0) {
                                        file = m1485a[0];
                                    }
                                } else if ("external-cache-path".equals(name)) {
                                    File[] m1487b = C0420a.m1487b(context);
                                    if (m1487b.length > 0) {
                                        file = m1487b[0];
                                    }
                                } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                                    File[] externalMediaDirs = context.getExternalMediaDirs();
                                    if (externalMediaDirs.length > 0) {
                                        file = externalMediaDirs[0];
                                    }
                                }
                                if (file != null) {
                                    c0437c.m1551a(attributeValue, m1482a(file, attributeValue2));
                                }
                            }
                        }
                        f2151c.put(str, c0437c);
                        interfaceC0436b = c0437c;
                    } else {
                        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                    }
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return interfaceC0436b;
    }

    /* renamed from: a */
    private static File m1482a(File file, String... strArr) {
        File file2 = file;
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                file2 = new File(file2, str);
            }
        }
        return file2;
    }
}
