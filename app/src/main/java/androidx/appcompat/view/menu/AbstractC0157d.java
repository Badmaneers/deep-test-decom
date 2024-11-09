package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public abstract class AbstractC0157d implements InterfaceC0144ad {

    /* renamed from: a */
    protected Context f608a;

    /* renamed from: b */
    protected Context f609b;

    /* renamed from: c */
    protected C0168o f610c;

    /* renamed from: d */
    protected LayoutInflater f611d;

    /* renamed from: e */
    protected LayoutInflater f612e;

    /* renamed from: f */
    protected InterfaceC0146af f613f;

    /* renamed from: g */
    private InterfaceC0145ae f614g;

    /* renamed from: h */
    private int f615h;

    /* renamed from: i */
    private int f616i;

    /* renamed from: j */
    private int f617j;

    /* renamed from: a */
    public abstract void mo412a(C0172s c0172s, InterfaceC0147ag interfaceC0147ag);

    /* renamed from: a */
    public boolean mo414a(C0172s c0172s) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: b */
    public boolean mo389b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: b */
    public final boolean mo364b(C0172s c0172s) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final boolean mo368c(C0172s c0172s) {
        return false;
    }

    public AbstractC0157d(Context context, int i, int i2) {
        this.f608a = context;
        this.f611d = LayoutInflater.from(context);
        this.f615h = i;
        this.f616i = i2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public void mo357a(Context context, C0168o c0168o) {
        this.f609b = context;
        this.f612e = LayoutInflater.from(this.f609b);
        this.f610c = c0168o;
    }

    /* renamed from: a */
    public InterfaceC0146af mo410a(ViewGroup viewGroup) {
        if (this.f613f == null) {
            this.f613f = (InterfaceC0146af) this.f611d.inflate(this.f615h, viewGroup, false);
            this.f613f.mo343a(this.f610c);
            mo387a(true);
        }
        return this.f613f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public void mo387a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f613f;
        if (viewGroup == null) {
            return;
        }
        int i = 0;
        if (this.f610c != null) {
            this.f610c.m469m();
            ArrayList<C0172s> m468l = this.f610c.m468l();
            int size = m468l.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0172s c0172s = m468l.get(i3);
                if (mo414a(c0172s)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C0172s itemData = childAt instanceof InterfaceC0147ag ? ((InterfaceC0147ag) childAt).getItemData() : null;
                    View mo408a = mo408a(c0172s, childAt, viewGroup);
                    if (c0172s != itemData) {
                        mo408a.setPressed(false);
                        mo408a.jumpDrawablesToCurrentState();
                    }
                    if (mo408a != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) mo408a.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(mo408a);
                        }
                        ((ViewGroup) this.f613f).addView(mo408a, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo413a(viewGroup, i)) {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo413a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo385a(InterfaceC0145ae interfaceC0145ae) {
        this.f614g = interfaceC0145ae;
    }

    /* renamed from: a */
    public final InterfaceC0145ae m409a() {
        return this.f614g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public View mo408a(C0172s c0172s, View view, ViewGroup viewGroup) {
        InterfaceC0147ag interfaceC0147ag;
        if (view instanceof InterfaceC0147ag) {
            interfaceC0147ag = (InterfaceC0147ag) view;
        } else {
            interfaceC0147ag = (InterfaceC0147ag) this.f611d.inflate(this.f616i, viewGroup, false);
        }
        mo412a(c0172s, interfaceC0147ag);
        return (View) interfaceC0147ag;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public void mo386a(C0168o c0168o, boolean z) {
        if (this.f614g != null) {
            this.f614g.mo171a(c0168o, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public boolean mo388a(SubMenuC0153am subMenuC0153am) {
        if (this.f614g != null) {
            return this.f614g.mo172a(subMenuC0153am);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final int mo365c() {
        return this.f617j;
    }

    /* renamed from: a */
    public final void m411a(int i) {
        this.f617j = i;
    }
}
