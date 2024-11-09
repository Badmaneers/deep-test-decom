package androidx.core.p022e;

import android.text.SpannableStringBuilder;
import com.coloros.neton.BuildConfig;
import java.util.Locale;

/* compiled from: BidiFormatter.java */
/* renamed from: androidx.core.e.a */
/* loaded from: classes.dex */
public final class C0454a {

    /* renamed from: f */
    private final boolean f2230f;

    /* renamed from: g */
    private final int f2231g;

    /* renamed from: h */
    private final InterfaceC0461h f2232h;

    /* renamed from: a */
    static final InterfaceC0461h f2225a = C0462i.f2260c;

    /* renamed from: d */
    private static final String f2228d = Character.toString(8206);

    /* renamed from: e */
    private static final String f2229e = Character.toString(8207);

    /* renamed from: b */
    static final C0454a f2226b = new C0454a(false, 2, f2225a);

    /* renamed from: c */
    static final C0454a f2227c = new C0454a(true, 2, f2225a);

    /* renamed from: a */
    public static C0454a m1578a() {
        return new C0455b().m1585a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0454a(boolean z, int i, InterfaceC0461h interfaceC0461h) {
        this.f2230f = z;
        this.f2231g = i;
        this.f2232h = interfaceC0461h;
    }

    /* renamed from: a */
    private CharSequence m1579a(CharSequence charSequence, InterfaceC0461h interfaceC0461h) {
        String str;
        String str2;
        if (charSequence == null) {
            return null;
        }
        boolean mo1606a = interfaceC0461h.mo1606a(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f2231g & 2) != 0) {
            boolean mo1606a2 = (mo1606a ? C0462i.f2259b : C0462i.f2258a).mo1606a(charSequence, charSequence.length());
            if (!this.f2230f && (mo1606a2 || m1582c(charSequence) == 1)) {
                str2 = f2228d;
            } else {
                str2 = (!this.f2230f || (mo1606a2 && m1582c(charSequence) != -1)) ? BuildConfig.FLAVOR : f2229e;
            }
            spannableStringBuilder.append((CharSequence) str2);
        }
        if (mo1606a != this.f2230f) {
            spannableStringBuilder.append(mo1606a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean mo1606a3 = (mo1606a ? C0462i.f2259b : C0462i.f2258a).mo1606a(charSequence, charSequence.length());
        if (!this.f2230f && (mo1606a3 || m1581b(charSequence) == 1)) {
            str = f2228d;
        } else {
            str = (!this.f2230f || (mo1606a3 && m1581b(charSequence) != -1)) ? BuildConfig.FLAVOR : f2229e;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public final String m1584a(String str) {
        InterfaceC0461h interfaceC0461h = this.f2232h;
        if (str == null) {
            return null;
        }
        return m1579a(str, interfaceC0461h).toString();
    }

    /* renamed from: a */
    public final CharSequence m1583a(CharSequence charSequence) {
        return m1579a(charSequence, this.f2232h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m1580a(Locale locale) {
        return C0469p.m1611a(locale) == 1;
    }

    /* renamed from: b */
    private static int m1581b(CharSequence charSequence) {
        return new C0456c(charSequence).m1591b();
    }

    /* renamed from: c */
    private static int m1582c(CharSequence charSequence) {
        return new C0456c(charSequence).m1590a();
    }
}
