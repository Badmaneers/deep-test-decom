package com.coloros.anim;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import com.coloros.anim.p056c.C1759d;
import com.coloros.anim.p061e.C1786i;
import com.coloros.anim.p062f.C1806b;
import com.coloros.anim.p062f.C1811g;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: EffectiveCompositionFactory.java */
/* renamed from: com.coloros.anim.ac */
/* loaded from: classes.dex */
public final class C1681ac {

    /* renamed from: a */
    private static final Map<String, C1830v<C1638a>> f8027a = new HashMap();

    /* renamed from: a */
    public static C1830v<C1638a> m5546a(Context context, String str) {
        if (C1806b.f8389b) {
            C1806b.m5866b("EffectiveCompositionFactory::fromUrl url = " + str.toString());
        }
        return m5548a("url_".concat(String.valueOf(str)), new CallableC1682ad(context, str));
    }

    /* renamed from: b */
    public static C1830v<C1638a> m5554b(Context context, String str) {
        if (C1806b.f8389b) {
            C1806b.m5866b("EffectiveCompositionFactory::fromAsset fileName = " + str.toString());
        }
        return m5548a(str, new CallableC1685ag(context.getApplicationContext(), str));
    }

    /* renamed from: c */
    public static C1829u<C1638a> m5555c(Context context, String str) {
        if (C1806b.f8389b) {
            C1806b.m5866b("EffectiveCompositionFactory::fromAssetSync fileName = " + str.toString());
        }
        try {
            String concat = "asset_".concat(String.valueOf(str));
            if (str.endsWith(".zip")) {
                return m5544a(new ZipInputStream(context.getAssets().open(str)), concat);
            }
            return m5543a(context.getAssets().open(str), concat);
        } catch (IOException e) {
            return new C1829u<>((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C1830v<C1638a> m5545a(Context context, int i) {
        if (C1806b.f8389b) {
            C1806b.m5866b("EffectiveCompositionFactory::fromRawRes.");
        }
        return m5548a(m5549a(i), new CallableC1686ah(context.getApplicationContext(), i));
    }

    /* renamed from: b */
    public static C1829u<C1638a> m5551b(Context context, int i) {
        if (C1806b.f8389b) {
            C1806b.m5866b("EffectiveCompositionFactory::fromRawResSync.");
        }
        try {
            return m5543a(context.getResources().openRawResource(i), m5549a(i));
        } catch (Resources.NotFoundException e) {
            return new C1829u<>((Throwable) e);
        }
    }

    /* renamed from: a */
    private static String m5549a(int i) {
        return "rawRes_".concat(String.valueOf(i));
    }

    /* renamed from: a */
    public static C1829u<C1638a> m5543a(InputStream inputStream, String str) {
        if (C1806b.f8389b) {
            C1806b.m5866b("EffectiveCompositionFactory::fromJsonInputStreamSync cacheKey = ".concat(String.valueOf(str)));
        }
        return m5552b(inputStream, str);
    }

    /* renamed from: b */
    private static C1829u<C1638a> m5552b(InputStream inputStream, String str) {
        try {
            return m5541a(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            C1811g.m5907a(inputStream);
        }
    }

    /* renamed from: a */
    public static C1830v<C1638a> m5547a(JsonReader jsonReader) {
        if (C1806b.f8389b) {
            C1806b.m5866b("EffectiveCompositionFactory::fromJsonReader cacheKey = " + ((String) null));
        }
        return m5548a((String) null, new CallableC1687ai(jsonReader));
    }

    /* renamed from: a */
    public static C1829u<C1638a> m5541a(JsonReader jsonReader, String str) {
        if (C1806b.f8389b) {
            C1806b.m5866b("EffectiveCompositionFactory::fromJsonReaderSync cacheKey = ".concat(String.valueOf(str)));
        }
        return m5542a(jsonReader, str, true);
    }

    /* renamed from: a */
    private static C1829u<C1638a> m5542a(JsonReader jsonReader, String str, boolean z) {
        try {
            try {
                C1638a m5831a = C1786i.m5831a(jsonReader);
                C1759d.m5783a().m5785a(str, m5831a);
                C1829u<C1638a> c1829u = new C1829u<>(m5831a);
                if (z) {
                    C1811g.m5907a(jsonReader);
                }
                return c1829u;
            } catch (Exception e) {
                C1829u<C1638a> c1829u2 = new C1829u<>(e);
                if (z) {
                    C1811g.m5907a(jsonReader);
                }
                return c1829u2;
            }
        } catch (Throwable th) {
            if (z) {
                C1811g.m5907a(jsonReader);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static C1829u<C1638a> m5544a(ZipInputStream zipInputStream, String str) {
        if (C1806b.f8389b) {
            C1806b.m5866b("EffectiveCompositionFactory::fromZipStreamSync cacheKey = ".concat(String.valueOf(str)));
        }
        try {
            return m5553b(zipInputStream, str);
        } finally {
            C1811g.m5907a(zipInputStream);
        }
    }

    /* renamed from: b */
    private static C1829u<C1638a> m5553b(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        if (C1806b.f8389b) {
            C1806b.m5866b("EffectiveCompositionFactory::fromZipStreamSyncInternal cacheKey = ".concat(String.valueOf(str)));
        }
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (C1806b.f8389b) {
                StringBuilder sb = new StringBuilder("EffectiveCompositionFactory::fromZipStreamSyncInternal entry == null ? ");
                sb.append(nextEntry == null);
                C1806b.m5866b(sb.toString());
            }
            C1638a c1638a = null;
            while (nextEntry != null) {
                if (C1806b.f8389b) {
                    C1806b.m5866b("EffectiveCompositionFactory::fromZipStreamSyncInternal entry.getName() = " + nextEntry.getName());
                }
                if (!nextEntry.getName().contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        c1638a = m5542a(new JsonReader(new InputStreamReader(zipInputStream)), null, false).m5924a();
                    } else if (nextEntry.getName().contains(".png")) {
                        String[] split = nextEntry.getName().split("/");
                        hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c1638a == null) {
                return new C1829u<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C1689ak m5540a = m5540a(c1638a, (String) entry.getKey());
                if (m5540a != null) {
                    m5540a.m5558a((Bitmap) entry.getValue());
                }
            }
            for (Map.Entry<String, C1689ak> entry2 : c1638a.m5477m().entrySet()) {
                if (entry2.getValue().m5560c() == null) {
                    return new C1829u<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().m5559b()));
                }
            }
            C1759d.m5783a().m5785a(str, c1638a);
            return new C1829u<>(c1638a);
        } catch (IOException e) {
            return new C1829u<>((Throwable) e);
        }
    }

    /* renamed from: a */
    private static C1689ak m5540a(C1638a c1638a, String str) {
        for (C1689ak c1689ak : c1638a.m5477m().values()) {
            if (c1689ak.m5559b().equals(str)) {
                return c1689ak;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C1830v<C1638a> m5548a(String str, Callable<C1829u<C1638a>> callable) {
        C1638a m5784a = str == null ? null : C1759d.m5783a().m5784a(str);
        if (m5784a != null) {
            C1806b.m5866b("EffectiveCompositionFactory::cachdComposition isn't null, cacheKey is ".concat(String.valueOf(str)));
            return new C1830v<>(new CallableC1688aj(m5784a), true);
        }
        if (str != null && f8027a.containsKey(str)) {
            return f8027a.get(str);
        }
        C1830v<C1638a> c1830v = new C1830v<>(callable);
        c1830v.m5932a(new C1683ae(str));
        c1830v.m5934c(new C1684af(str));
        f8027a.put(str, c1830v);
        return c1830v;
    }
}
