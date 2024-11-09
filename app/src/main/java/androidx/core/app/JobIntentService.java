package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: e */
    static final Object f2107e = new Object();

    /* renamed from: f */
    static final HashMap<ComponentName, Object> f2108f = new HashMap<>();

    /* renamed from: a */
    boolean f2109a = false;

    /* renamed from: b */
    boolean f2110b = false;

    /* renamed from: c */
    boolean f2111c = false;

    /* renamed from: d */
    final ArrayList<Object> f2112d;

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2112d = null;
        } else {
            this.f2112d = new ArrayList<>();
        }
    }
}
