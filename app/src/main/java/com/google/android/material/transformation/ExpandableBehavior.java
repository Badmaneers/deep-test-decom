package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.AbstractC0391c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p024g.C0538w;
import com.google.android.material.p077f.InterfaceC2181b;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC0391c<View> {

    /* renamed from: a */
    private int f10607a;

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public abstract boolean mo1413a(View view, View view2);

    /* renamed from: a */
    public abstract boolean mo7694a(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
        this.f10607a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10607a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1414a(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC2181b interfaceC2181b;
        if (!C0538w.m1819C(view)) {
            List<View> m1403b = coordinatorLayout.m1403b(view);
            int size = m1403b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    interfaceC2181b = null;
                    break;
                }
                View view2 = m1403b.get(i2);
                if (mo1413a(view, view2)) {
                    interfaceC2181b = (InterfaceC2181b) view2;
                    break;
                }
                i2++;
            }
            if (interfaceC2181b != null && m7693a(interfaceC2181b.mo6911a())) {
                this.f10607a = interfaceC2181b.mo6911a() ? 1 : 2;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2403a(this, view, this.f10607a, interfaceC2181b));
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1419a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC2181b interfaceC2181b = (InterfaceC2181b) view2;
        if (!m7693a(interfaceC2181b.mo6911a())) {
            return false;
        }
        this.f10607a = interfaceC2181b.mo6911a() ? 1 : 2;
        return mo7694a((View) interfaceC2181b, view, interfaceC2181b.mo6911a(), true);
    }

    /* renamed from: a */
    private boolean m7693a(boolean z) {
        return z ? this.f10607a == 0 || this.f10607a == 2 : this.f10607a == 1;
    }
}
