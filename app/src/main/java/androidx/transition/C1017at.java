package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues.java */
/* renamed from: androidx.transition.at */
/* loaded from: classes.dex */
public final class C1017at {

    /* renamed from: b */
    public View f4150b;

    /* renamed from: a */
    public final Map<String, Object> f4149a = new HashMap();

    /* renamed from: c */
    final ArrayList<AbstractC1001ad> f4151c = new ArrayList<>();

    @Deprecated
    public C1017at() {
    }

    public C1017at(View view) {
        this.f4150b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1017at)) {
            return false;
        }
        C1017at c1017at = (C1017at) obj;
        return this.f4150b == c1017at.f4150b && this.f4149a.equals(c1017at.f4149a);
    }

    public final int hashCode() {
        return (this.f4150b.hashCode() * 31) + this.f4149a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4150b + "\n") + "    values:";
        for (String str2 : this.f4149a.keySet()) {
            str = str + "    " + str2 + ": " + this.f4149a.get(str2) + "\n";
        }
        return str;
    }
}
