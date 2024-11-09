package androidx.core.content.p020a;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: ResourcesCompat.java */
/* renamed from: androidx.core.content.a.l */
/* loaded from: classes.dex */
public abstract class AbstractC0432l {
    /* renamed from: a */
    public abstract void mo788a(int i);

    /* renamed from: a */
    public abstract void mo789a(Typeface typeface);

    /* renamed from: a */
    public final void m1533a(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new RunnableC0433m(this, typeface));
    }

    /* renamed from: a */
    public final void m1532a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new RunnableC0434n(this, i));
    }
}
