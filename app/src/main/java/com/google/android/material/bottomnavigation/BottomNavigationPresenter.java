package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0144ad;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.appcompat.view.menu.SubMenuC0153am;
import com.google.android.material.badge.C2065b;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes.dex */
public final class BottomNavigationPresenter implements InterfaceC0144ad {

    /* renamed from: a */
    private C0168o f9236a;

    /* renamed from: b */
    private BottomNavigationMenuView f9237b;

    /* renamed from: c */
    private boolean f9238c = false;

    /* renamed from: d */
    private int f9239d;

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
    public final void m6474a(BottomNavigationMenuView bottomNavigationMenuView) {
        this.f9237b = bottomNavigationMenuView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo357a(Context context, C0168o c0168o) {
        this.f9236a = c0168o;
        this.f9237b.mo343a(this.f9236a);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo387a(boolean z) {
        if (this.f9238c) {
            return;
        }
        if (z) {
            this.f9237b.m6471c();
        } else {
            this.f9237b.m6472d();
        }
    }

    /* renamed from: a */
    public final void m6473a() {
        this.f9239d = 1;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final int mo365c() {
        return this.f9239d;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: f */
    public final Parcelable mo390f() {
        SavedState savedState = new SavedState();
        savedState.f9240a = this.f9237b.getSelectedItemId();
        savedState.f9241b = C2065b.m6380a(this.f9237b.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo384a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f9237b.m6468a(savedState.f9240a);
            this.f9237b.setBadgeDrawables(C2065b.m6379a(this.f9237b.getContext(), savedState.f9241b));
        }
    }

    /* renamed from: b */
    public final void m6475b(boolean z) {
        this.f9238c = z;
    }

    /* loaded from: classes.dex */
    class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2086d();

        /* renamed from: a */
        int f9240a;

        /* renamed from: b */
        ParcelableSparseArray f9241b;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Parcel parcel) {
            this.f9240a = parcel.readInt();
            this.f9241b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9240a);
            parcel.writeParcelable(this.f9241b, 0);
        }
    }
}
