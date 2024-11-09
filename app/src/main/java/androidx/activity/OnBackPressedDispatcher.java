package androidx.activity;

import androidx.lifecycle.AbstractC0728h;
import androidx.lifecycle.EnumC0729i;
import androidx.lifecycle.EnumC0730j;
import androidx.lifecycle.InterfaceC0731k;
import androidx.lifecycle.InterfaceC0733m;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    final ArrayDeque<AbstractC0054d> f45a;

    /* renamed from: b */
    private final Runnable f46b;

    public OnBackPressedDispatcher() {
        this(null);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f45a = new ArrayDeque<>();
        this.f46b = runnable;
    }

    /* renamed from: a */
    public final void m37a(InterfaceC0733m interfaceC0733m, AbstractC0054d abstractC0054d) {
        AbstractC0728h mo31a = interfaceC0733m.mo31a();
        if (mo31a.mo2608a() == EnumC0730j.DESTROYED) {
            return;
        }
        abstractC0054d.m39a(new LifecycleOnBackPressedCancellable(mo31a, abstractC0054d));
    }

    /* renamed from: a */
    public final void m36a() {
        Iterator<AbstractC0054d> descendingIterator = this.f45a.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC0054d next = descendingIterator.next();
            if (next.m41a()) {
                next.mo44c();
                return;
            }
        }
        if (this.f46b != null) {
            this.f46b.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements InterfaceC0051a, InterfaceC0731k {

        /* renamed from: b */
        private final AbstractC0728h f48b;

        /* renamed from: c */
        private final AbstractC0054d f49c;

        /* renamed from: d */
        private InterfaceC0051a f50d;

        LifecycleOnBackPressedCancellable(AbstractC0728h abstractC0728h, AbstractC0054d abstractC0054d) {
            this.f48b = abstractC0728h;
            this.f49c = abstractC0054d;
            abstractC0728h.mo2609a(this);
        }

        @Override // androidx.lifecycle.InterfaceC0731k
        /* renamed from: a */
        public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
            if (enumC0729i == EnumC0729i.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                AbstractC0054d abstractC0054d = this.f49c;
                onBackPressedDispatcher.f45a.add(abstractC0054d);
                C0055e c0055e = new C0055e(onBackPressedDispatcher, abstractC0054d);
                abstractC0054d.m39a(c0055e);
                this.f50d = c0055e;
                return;
            }
            if (enumC0729i == EnumC0729i.ON_STOP) {
                if (this.f50d != null) {
                    this.f50d.mo38a();
                }
            } else if (enumC0729i == EnumC0729i.ON_DESTROY) {
                mo38a();
            }
        }

        @Override // androidx.activity.InterfaceC0051a
        /* renamed from: a */
        public final void mo38a() {
            this.f48b.mo2610b(this);
            this.f49c.m43b(this);
            if (this.f50d != null) {
                this.f50d.mo38a();
                this.f50d = null;
            }
        }
    }
}
