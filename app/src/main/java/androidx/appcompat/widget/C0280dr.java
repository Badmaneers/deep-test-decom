package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.InterfaceC0130d;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0144ad;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.appcompat.view.menu.SubMenuC0153am;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Toolbar.java */
/* renamed from: androidx.appcompat.widget.dr */
/* loaded from: classes.dex */
public final class C0280dr implements InterfaceC0144ad {

    /* renamed from: a */
    C0168o f1372a;

    /* renamed from: b */
    C0172s f1373b;

    /* renamed from: c */
    final /* synthetic */ Toolbar f1374c;

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo384a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo385a(InterfaceC0145ae interfaceC0145ae) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo386a(C0168o c0168o, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final boolean mo388a(SubMenuC0153am subMenuC0153am) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: b */
    public final boolean mo389b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final int mo365c() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: f */
    public final Parcelable mo390f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0280dr(Toolbar toolbar) {
        this.f1374c = toolbar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo357a(Context context, C0168o c0168o) {
        if (this.f1372a != null && this.f1373b != null) {
            this.f1372a.mo399b(this.f1373b);
        }
        this.f1372a = c0168o;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo387a(boolean z) {
        if (this.f1373b != null) {
            boolean z2 = false;
            if (this.f1372a != null) {
                int size = this.f1372a.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (this.f1372a.getItem(i) == this.f1373b) {
                        z2 = true;
                        break;
                    }
                    i++;
                }
            }
            if (z2) {
                return;
            }
            mo368c(this.f1373b);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: b */
    public final boolean mo364b(C0172s c0172s) {
        this.f1374c.m665i();
        ViewParent parent = this.f1374c.f1051a.getParent();
        if (parent != this.f1374c) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1374c.f1051a);
            }
            this.f1374c.addView(this.f1374c.f1051a);
        }
        this.f1374c.f1052b = c0172s.getActionView();
        this.f1373b = c0172s;
        ViewParent parent2 = this.f1374c.f1052b.getParent();
        if (parent2 != this.f1374c) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(this.f1374c.f1052b);
            }
            C0281ds generateDefaultLayoutParams = this.f1374c.generateDefaultLayoutParams();
            generateDefaultLayoutParams.f285a = 8388611 | (this.f1374c.f1053c & 112);
            generateDefaultLayoutParams.f1375b = 2;
            this.f1374c.f1052b.setLayoutParams(generateDefaultLayoutParams);
            this.f1374c.addView(this.f1374c.f1052b);
        }
        this.f1374c.m667k();
        this.f1374c.requestLayout();
        c0172s.m489e(true);
        if (this.f1374c.f1052b instanceof InterfaceC0130d) {
            ((InterfaceC0130d) this.f1374c.f1052b).mo312a();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final boolean mo368c(C0172s c0172s) {
        if (this.f1374c.f1052b instanceof InterfaceC0130d) {
            ((InterfaceC0130d) this.f1374c.f1052b).mo313b();
        }
        this.f1374c.removeView(this.f1374c.f1052b);
        this.f1374c.removeView(this.f1374c.f1051a);
        this.f1374c.f1052b = null;
        this.f1374c.m668l();
        this.f1373b = null;
        this.f1374c.requestLayout();
        c0172s.m489e(false);
        return true;
    }
}
