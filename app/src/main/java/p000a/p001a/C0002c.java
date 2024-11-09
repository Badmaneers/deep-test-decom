package p000a.p001a;

import android.os.Build;
import android.util.Log;
import com.coloros.neton.BuildConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Timber.java */
/* renamed from: a.a.c */
/* loaded from: classes.dex */
public final class C0002c extends AbstractC0003d {

    /* renamed from: b */
    private static final Pattern f4b = Pattern.compile("(\\$\\d+)+$");

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p001a.AbstractC0003d
    /* renamed from: a */
    public final String mo7a() {
        String mo7a = super.mo7a();
        if (mo7a != null) {
            return mo7a;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length <= 5) {
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }
        String className = stackTrace[5].getClassName();
        Matcher matcher = f4b.matcher(className);
        if (matcher.find()) {
            className = matcher.replaceAll(BuildConfig.FLAVOR);
        }
        String substring = className.substring(className.lastIndexOf(46) + 1);
        return (substring.length() <= 23 || Build.VERSION.SDK_INT >= 24) ? substring : substring.substring(0, 23);
    }

    @Override // p000a.p001a.AbstractC0003d
    /* renamed from: a */
    protected final void mo4a(int i, String str, String str2) {
        int min;
        if (str2.length() < 4000) {
            if (i == 7) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(i, str, str2);
                return;
            }
        }
        int i2 = 0;
        int length = str2.length();
        while (i2 < length) {
            int indexOf = str2.indexOf(10, i2);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i2 + 4000);
                String substring = str2.substring(i2, min);
                if (i == 7) {
                    Log.wtf(str, substring);
                } else {
                    Log.println(i, str, substring);
                }
                if (min >= indexOf) {
                    break;
                } else {
                    i2 = min;
                }
            }
            i2 = min + 1;
        }
    }
}
