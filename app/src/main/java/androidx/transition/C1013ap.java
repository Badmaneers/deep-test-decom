package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* renamed from: androidx.transition.ap */
/* loaded from: classes.dex */
public class C1013ap extends AbstractC1001ad {

    /* renamed from: h */
    int f4138h;

    /* renamed from: j */
    private ArrayList<AbstractC1001ad> f4140j = new ArrayList<>();

    /* renamed from: k */
    private boolean f4141k = true;

    /* renamed from: i */
    boolean f4139i = false;

    /* renamed from: l */
    private int f4142l = 0;

    /* renamed from: a */
    public final C1013ap m3530a(int i) {
        switch (i) {
            case 0:
                this.f4141k = true;
                return this;
            case 1:
                this.f4141k = false;
                return this;
            default:
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: a */
    public final C1013ap m3531a(AbstractC1001ad abstractC1001ad) {
        m3529b(abstractC1001ad);
        if (this.f4099a >= 0) {
            abstractC1001ad.mo3482a(this.f4099a);
        }
        if ((this.f4142l & 1) != 0) {
            abstractC1001ad.mo3483a(m3504c());
        }
        if ((this.f4142l & 2) != 0) {
            abstractC1001ad.mo3491a(this.f4105g);
        }
        if ((this.f4142l & 4) != 0) {
            abstractC1001ad.mo3493a(m3515j());
        }
        if ((this.f4142l & 8) != 0) {
            abstractC1001ad.mo3490a(m3516k());
        }
        return this;
    }

    /* renamed from: b */
    private void m3529b(AbstractC1001ad abstractC1001ad) {
        this.f4140j.add(abstractC1001ad);
        abstractC1001ad.f4102d = this;
    }

    /* renamed from: m */
    public final int m3535m() {
        return this.f4140j.size();
    }

    /* renamed from: b */
    public final AbstractC1001ad m3532b(int i) {
        if (i < 0 || i >= this.f4140j.size()) {
            return null;
        }
        return this.f4140j.get(i);
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: c */
    public final C1013ap mo3482a(long j) {
        super.mo3482a(j);
        if (this.f4099a >= 0 && this.f4140j != null) {
            int size = this.f4140j.size();
            for (int i = 0; i < size; i++) {
                this.f4140j.get(i).mo3482a(j);
            }
        }
        return this;
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: b */
    public final C1013ap mo3483a(TimeInterpolator timeInterpolator) {
        this.f4142l |= 1;
        if (this.f4140j != null) {
            int size = this.f4140j.size();
            for (int i = 0; i < size; i++) {
                this.f4140j.get(i).mo3483a(timeInterpolator);
            }
        }
        return (C1013ap) super.mo3483a(timeInterpolator);
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final void mo3493a(AbstractC1068z abstractC1068z) {
        super.mo3493a(abstractC1068z);
        this.f4142l |= 4;
        if (this.f4140j != null) {
            for (int i = 0; i < this.f4140j.size(); i++) {
                this.f4140j.get(i).mo3493a(abstractC1068z);
            }
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final void mo3488a(ViewGroup viewGroup, C1018au c1018au, C1018au c1018au2, ArrayList<C1017at> arrayList, ArrayList<C1017at> arrayList2) {
        long b = m3498b();
        int size = this.f4140j.size();
        for (int i = 0; i < size; i++) {
            AbstractC1001ad abstractC1001ad = this.f4140j.get(i);
            if (b > 0 && (this.f4141k || i == 0)) {
                long m3498b = abstractC1001ad.m3498b();
                if (m3498b > 0) {
                    abstractC1001ad.mo3499b(m3498b + b);
                } else {
                    abstractC1001ad.mo3499b(b);
                }
            }
            abstractC1001ad.mo3488a(viewGroup, c1018au, c1018au2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: d */
    public final void mo3507d() {
        if (this.f4140j.isEmpty()) {
            m3512g();
            m3513h();
            return;
        }
        C1015ar c1015ar = new C1015ar(this);
        Iterator<AbstractC1001ad> it = this.f4140j.iterator();
        while (it.hasNext()) {
            it.next().mo3484a(c1015ar);
        }
        this.f4138h = this.f4140j.size();
        if (!this.f4141k) {
            for (int i = 1; i < this.f4140j.size(); i++) {
                this.f4140j.get(i - 1).mo3484a(new C1014aq(this, this.f4140j.get(i)));
            }
            AbstractC1001ad abstractC1001ad = this.f4140j.get(0);
            if (abstractC1001ad != null) {
                abstractC1001ad.mo3507d();
                return;
            }
            return;
        }
        Iterator<AbstractC1001ad> it2 = this.f4140j.iterator();
        while (it2.hasNext()) {
            it2.next().mo3507d();
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final void mo3492a(C1017at c1017at) {
        if (m3495a(c1017at.f4150b)) {
            Iterator<AbstractC1001ad> it = this.f4140j.iterator();
            while (it.hasNext()) {
                AbstractC1001ad next = it.next();
                if (next.m3495a(c1017at.f4150b)) {
                    next.mo3492a(c1017at);
                    c1017at.f4151c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: b */
    public final void mo3503b(C1017at c1017at) {
        if (m3495a(c1017at.f4150b)) {
            Iterator<AbstractC1001ad> it = this.f4140j.iterator();
            while (it.hasNext()) {
                AbstractC1001ad next = it.next();
                if (next.m3495a(c1017at.f4150b)) {
                    next.mo3503b(c1017at);
                    c1017at.f4151c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: c */
    public final void mo3506c(C1017at c1017at) {
        super.mo3506c(c1017at);
        int size = this.f4140j.size();
        for (int i = 0; i < size; i++) {
            this.f4140j.get(i).mo3506c(c1017at);
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: d */
    public final void mo3508d(View view) {
        super.mo3508d(view);
        int size = this.f4140j.size();
        for (int i = 0; i < size; i++) {
            this.f4140j.get(i).mo3508d(view);
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: e */
    public final void mo3510e(View view) {
        super.mo3510e(view);
        int size = this.f4140j.size();
        for (int i = 0; i < size; i++) {
            this.f4140j.get(i).mo3510e(view);
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: i */
    public final void mo3514i() {
        super.mo3514i();
        int size = this.f4140j.size();
        for (int i = 0; i < size; i++) {
            this.f4140j.get(i).mo3514i();
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final void mo3491a(AbstractC1012ao abstractC1012ao) {
        super.mo3491a(abstractC1012ao);
        this.f4142l |= 2;
        int size = this.f4140j.size();
        for (int i = 0; i < size; i++) {
            this.f4140j.get(i).mo3491a(abstractC1012ao);
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final void mo3490a(AbstractC1006ai abstractC1006ai) {
        super.mo3490a(abstractC1006ai);
        this.f4142l |= 8;
        int size = this.f4140j.size();
        for (int i = 0; i < size; i++) {
            this.f4140j.get(i).mo3490a(abstractC1006ai);
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final String mo3486a(String str) {
        String mo3486a = super.mo3486a(str);
        for (int i = 0; i < this.f4140j.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo3486a);
            sb.append("\n");
            sb.append(this.f4140j.get(i).mo3486a(str + "  "));
            mo3486a = sb.toString();
        }
        return mo3486a;
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: l */
    public final AbstractC1001ad clone() {
        C1013ap c1013ap = (C1013ap) super.clone();
        c1013ap.f4140j = new ArrayList<>();
        int size = this.f4140j.size();
        for (int i = 0; i < size; i++) {
            c1013ap.m3529b(this.f4140j.get(i).clone());
        }
        return c1013ap;
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC1001ad mo3501b(InterfaceC1007aj interfaceC1007aj) {
        return (C1013ap) super.mo3501b(interfaceC1007aj);
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1001ad mo3484a(InterfaceC1007aj interfaceC1007aj) {
        return (C1013ap) super.mo3484a(interfaceC1007aj);
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: c */
    public final /* synthetic */ AbstractC1001ad mo3505c(View view) {
        for (int i = 0; i < this.f4140j.size(); i++) {
            this.f4140j.get(i).mo3505c(view);
        }
        return (C1013ap) super.mo3505c(view);
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: b */
    public final /* synthetic */ AbstractC1001ad mo3500b(View view) {
        for (int i = 0; i < this.f4140j.size(); i++) {
            this.f4140j.get(i).mo3500b(view);
        }
        return (C1013ap) super.mo3500b(view);
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC1001ad mo3499b(long j) {
        return (C1013ap) super.mo3499b(j);
    }
}
