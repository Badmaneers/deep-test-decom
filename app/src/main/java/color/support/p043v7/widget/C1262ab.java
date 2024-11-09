package color.support.p043v7.widget;

import android.content.Context;
import android.os.Parcelable;
import android.widget.ImageButton;
import androidx.appcompat.view.InterfaceC0130d;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0144ad;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.appcompat.view.menu.SubMenuC0153am;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Toolbar.java */
/* renamed from: color.support.v7.widget.ab */
/* loaded from: classes.dex */
public final class C1262ab implements InterfaceC0144ad {

    /* renamed from: a */
    C0168o f5355a;

    /* renamed from: b */
    C0172s f5356b;

    /* renamed from: c */
    final /* synthetic */ Toolbar f5357c;

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

    private C1262ab(Toolbar toolbar) {
        this.f5357c = toolbar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1262ab(Toolbar toolbar, byte b) {
        this(toolbar);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo357a(Context context, C0168o c0168o) {
        if (this.f5355a != null && this.f5356b != null) {
            this.f5355a.mo399b(this.f5356b);
        }
        this.f5355a = c0168o;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo387a(boolean z) {
        if (this.f5356b != null) {
            boolean z2 = false;
            if (this.f5355a != null) {
                int size = this.f5355a.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (this.f5355a.getItem(i) == this.f5356b) {
                        z2 = true;
                        break;
                    }
                    i++;
                }
            }
            if (z2) {
                return;
            }
            mo368c(this.f5356b);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: b */
    public final boolean mo364b(C0172s c0172s) {
        ImageButton imageButton;
        int i;
        ImageButton imageButton2;
        Toolbar.m4130b(this.f5357c);
        imageButton = this.f5357c.f5340n;
        if (imageButton.getParent() != this.f5357c) {
            Toolbar toolbar = this.f5357c;
            imageButton2 = this.f5357c.f5340n;
            toolbar.addView(imageButton2);
        }
        this.f5357c.f5331e = c0172s.getActionView();
        this.f5356b = c0172s;
        if (this.f5357c.f5331e.getParent() != this.f5357c) {
            C1263ac m4137m = Toolbar.m4137m();
            i = this.f5357c.f5345s;
            m4137m.f285a = 8388611 | (i & 112);
            m4137m.f5358c = 2;
            this.f5357c.f5331e.setLayoutParams(m4137m);
            this.f5357c.addView(this.f5357c.f5331e);
        }
        this.f5357c.setChildVisibilityForExpandedActionView(true);
        this.f5357c.requestLayout();
        c0172s.m489e(true);
        if (this.f5357c.f5331e instanceof InterfaceC0130d) {
            ((InterfaceC0130d) this.f5357c.f5331e).mo312a();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final boolean mo368c(C0172s c0172s) {
        ImageButton imageButton;
        if (this.f5357c.f5331e instanceof InterfaceC0130d) {
            ((InterfaceC0130d) this.f5357c.f5331e).mo313b();
        }
        this.f5357c.removeView(this.f5357c.f5331e);
        Toolbar toolbar = this.f5357c;
        imageButton = this.f5357c.f5340n;
        toolbar.removeView(imageButton);
        this.f5357c.f5331e = null;
        this.f5357c.setChildVisibilityForExpandedActionView(false);
        this.f5356b = null;
        this.f5357c.requestLayout();
        c0172s.m489e(false);
        return true;
    }
}
