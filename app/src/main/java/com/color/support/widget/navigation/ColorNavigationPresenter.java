package com.color.support.widget.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0144ad;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.appcompat.view.menu.SubMenuC0153am;

/* loaded from: classes.dex */
public final class ColorNavigationPresenter implements InterfaceC0144ad {

    /* renamed from: a */
    private C0168o f7480a;

    /* renamed from: b */
    private ColorNavigationMenuView f7481b;

    /* renamed from: c */
    private boolean f7482c = false;

    /* renamed from: d */
    private int f7483d;

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
    /* renamed from: b */
    public final boolean mo364b(C0172s c0172s) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final boolean mo368c(C0172s c0172s) {
        return false;
    }

    /* renamed from: a */
    public final void m5306a(ColorNavigationMenuView colorNavigationMenuView) {
        this.f7481b = colorNavigationMenuView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo357a(Context context, C0168o c0168o) {
        this.f7481b.mo343a(this.f7480a);
        this.f7480a = c0168o;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo387a(boolean z) {
        if (this.f7482c) {
            return;
        }
        if (z) {
            this.f7481b.m5299a();
        } else {
            this.f7481b.m5303b();
        }
    }

    /* renamed from: a */
    public final void m5305a() {
        this.f7483d = 3;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final int mo365c() {
        return this.f7483d;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: f */
    public final Parcelable mo390f() {
        SavedState savedState = new SavedState();
        savedState.f7484a = this.f7481b.getSelectedItemId();
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo384a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f7481b.m5300a(((SavedState) parcelable).f7484a);
        }
    }

    /* renamed from: b */
    public final void m5307b(boolean z) {
        this.f7482c = z;
    }

    /* loaded from: classes.dex */
    class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1573f();

        /* renamed from: a */
        int f7484a;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Parcel parcel) {
            this.f7484a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7484a);
        }
    }
}
