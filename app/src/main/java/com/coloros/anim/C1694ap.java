package com.coloros.anim;

import android.util.Pair;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PerformanceTracker.java */
/* renamed from: com.coloros.anim.ap */
/* loaded from: classes.dex */
public final class C1694ap implements Comparator<Pair<String, Float>> {

    /* renamed from: a */
    final /* synthetic */ C1693ao f8055a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1694ap(C1693ao c1693ao) {
        this.f8055a = c1693ao;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
        float floatValue = ((Float) pair.second).floatValue();
        float floatValue2 = ((Float) pair2.second).floatValue();
        if (floatValue2 > floatValue) {
            return 1;
        }
        return floatValue > floatValue2 ? -1 : 0;
    }
}
