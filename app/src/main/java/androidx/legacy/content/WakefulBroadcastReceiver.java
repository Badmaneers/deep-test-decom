package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
/* loaded from: classes.dex */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<PowerManager.WakeLock> f3035a = new SparseArray<>();

    /* renamed from: b */
    private static int f3036b = 1;
}
