package androidx.core.p022e;

import android.os.Build;
import android.text.TextUtils;
import com.coloros.neton.BuildConfig;
import java.util.Locale;

/* compiled from: TextUtilsCompat.java */
/* renamed from: androidx.core.e.p */
/* loaded from: classes.dex */
public final class C0469p {

    /* renamed from: a */
    private static final Locale f2270a = new Locale(BuildConfig.FLAVOR, BuildConfig.FLAVOR);

    /* renamed from: a */
    public static int m1611a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f2270a)) {
            String m1593a = C0457d.m1593a(locale);
            if (m1593a == null) {
                switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                    case 1:
                    case 2:
                        return 1;
                    default:
                        return 0;
                }
            }
            if (m1593a.equalsIgnoreCase("Arab") || m1593a.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
