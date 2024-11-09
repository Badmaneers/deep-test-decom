package androidx.core.p023f;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
/* renamed from: androidx.core.f.b */
/* loaded from: classes.dex */
public final class C0471b extends Writer {

    /* renamed from: a */
    private final String f2271a;

    /* renamed from: b */
    private StringBuilder f2272b = new StringBuilder(128);

    public C0471b(String str) {
        this.f2271a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1613a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1613a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m1613a();
            } else {
                this.f2272b.append(c);
            }
        }
    }

    /* renamed from: a */
    private void m1613a() {
        if (this.f2272b.length() > 0) {
            Log.d(this.f2271a, this.f2272b.toString());
            this.f2272b.delete(0, this.f2272b.length());
        }
    }
}
