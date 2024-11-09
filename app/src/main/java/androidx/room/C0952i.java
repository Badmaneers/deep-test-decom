package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InvalidationLiveDataContainer.java */
/* renamed from: androidx.room.i */
/* loaded from: classes.dex */
public final class C0952i {

    /* renamed from: a */
    final Set<LiveData> f3885a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b */
    private final AbstractC0969z f3886b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0952i(AbstractC0969z abstractC0969z) {
        this.f3886b = abstractC0969z;
    }
}
