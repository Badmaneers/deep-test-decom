package p000a.p001a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: Timber.java */
/* renamed from: a.a.d */
/* loaded from: classes.dex */
public abstract class AbstractC0003d {

    /* renamed from: a */
    final ThreadLocal<String> f5a = new ThreadLocal<>();

    /* renamed from: a */
    protected abstract void mo4a(int i, String str, String str2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7a() {
        String str = this.f5a.get();
        if (str != null) {
            this.f5a.remove();
        }
        return str;
    }

    /* renamed from: a */
    public void mo5a(String str, Object... objArr) {
        m8a(3, null, str, objArr);
    }

    /* renamed from: a */
    public void mo6a(Throwable th) {
        m8a(5, th, null, new Object[0]);
    }

    /* renamed from: a */
    private void m8a(int i, Throwable th, String str, Object... objArr) {
        String str2;
        String mo7a = mo7a();
        if (str != null && str.length() == 0) {
            str = null;
        }
        if (str != null) {
            if (objArr != null && objArr.length > 0) {
                str = String.format(str, objArr);
            }
            if (th != null) {
                str2 = str + "\n" + m9b(th);
            } else {
                str2 = str;
            }
        } else if (th == null) {
            return;
        } else {
            str2 = m9b(th);
        }
        mo4a(i, mo7a, str2);
    }

    /* renamed from: b */
    private static String m9b(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
