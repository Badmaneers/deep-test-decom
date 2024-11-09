package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.EnumC0729i;
import androidx.lifecycle.InterfaceC0727g;
import androidx.lifecycle.InterfaceC0733m;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0727g {

    /* renamed from: a */
    private final InterfaceC0974e f3945a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recreator(InterfaceC0974e interfaceC0974e) {
        this.f3945a = interfaceC0974e;
    }

    @Override // androidx.lifecycle.InterfaceC0731k
    /* renamed from: a */
    public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
        if (enumC0729i != EnumC0729i.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0733m.mo31a().mo2610b(this);
        Bundle m3417a = this.f3945a.mo34d().m3417a("androidx.savedstate.Restarter");
        if (m3417a == null) {
            return;
        }
        ArrayList<String> stringArrayList = m3417a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC0971b.class);
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        declaredConstructor.newInstance(new Object[0]);
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(next)), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("Class " + next + " wasn't found", e3);
            }
        }
    }
}
