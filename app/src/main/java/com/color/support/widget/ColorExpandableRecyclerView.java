package com.color.support.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0845ay;
import androidx.recyclerview.widget.AbstractC0851bd;
import androidx.recyclerview.widget.AbstractC0855bh;
import androidx.recyclerview.widget.AbstractC0856bi;
import androidx.recyclerview.widget.ColorLinearLayoutManager;
import androidx.recyclerview.widget.ColorRecyclerView;
import com.color.support.widget.ExpandableRecyclerConnector;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ColorExpandableRecyclerView extends ColorRecyclerView {

    /* renamed from: g */
    private InterfaceC1365ag f6039g;

    /* renamed from: h */
    private ExpandableRecyclerConnector f6040h;

    /* renamed from: i */
    private InterfaceC1367ai f6041i;

    /* renamed from: j */
    private InterfaceC1366ah f6042j;

    /* renamed from: k */
    private InterfaceC1368aj f6043k;

    /* renamed from: l */
    private InterfaceC1369ak f6044l;

    public ColorExpandableRecyclerView(Context context) {
        super(context);
        setItemAnimator(null);
    }

    public ColorExpandableRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setItemAnimator(null);
    }

    public ColorExpandableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setItemAnimator(null);
    }

    @Override // androidx.recyclerview.widget.ColorRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(AbstractC0856bi abstractC0856bi) {
        if (!(abstractC0856bi instanceof ColorLinearLayoutManager)) {
            throw new RuntimeException("only ColorLinearLayoutManager");
        }
        if (((ColorLinearLayoutManager) abstractC0856bi).m2844i() != 1) {
            throw new RuntimeException("only vertical orientation");
        }
        super.setLayoutManager(abstractC0856bi);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(AbstractC0851bd abstractC0851bd) {
        if (abstractC0851bd != null) {
            throw new RuntimeException("not set ItemAnimator");
        }
        super.setItemAnimator(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addItemDecoration(AbstractC0855bh abstractC0855bh) {
        addItemDecoration(abstractC0855bh, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addItemDecoration(AbstractC0855bh abstractC0855bh, int i) {
        if (abstractC0855bh != null) {
            throw new RuntimeException("not set itemDecoration");
        }
        super.addItemDecoration(null, i);
    }

    public void setAdapter(InterfaceC1365ag interfaceC1365ag) {
        this.f6039g = interfaceC1365ag;
        this.f6040h = new ExpandableRecyclerConnector(interfaceC1365ag, this);
        super.setAdapter(this.f6040h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m4489a(int i) {
        C1532fq m4802e = this.f6040h.m4802e(i);
        if (m4802e.f7282a.f7289d == 2) {
            if (this.f6041i != null && this.f6041i.m4889a()) {
                m4802e.m5154a();
                return true;
            }
            if (!(m4802e.f7283b != null)) {
                int i2 = m4802e.f7282a.f7286a;
                ExpandableRecyclerConnector expandableRecyclerConnector = this.f6040h;
                C1533fr m5155a = C1533fr.m5155a(2, i2, -1, -1);
                C1532fq m4798a = expandableRecyclerConnector.m4798a(m5155a);
                m5155a.m5157a();
                if (m4798a != null) {
                    expandableRecyclerConnector.m4800a(m4798a);
                }
            } else {
                if (this.f6040h.m4801d(m4802e.f7282a.f7286a)) {
                    this.f6040h.m4803e();
                }
            }
            r1 = true;
        } else if (this.f6042j != null) {
            return this.f6042j.m4888a();
        }
        m4802e.m5154a();
        return r1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC0845ay abstractC0845ay) {
        throw new RuntimeException("adapter instansof ColorExpandableRecyclerAdapter");
    }

    public void setOnGroupClickListener(InterfaceC1367ai interfaceC1367ai) {
        this.f6041i = interfaceC1367ai;
    }

    public void setOnChildClickListener(InterfaceC1366ah interfaceC1366ah) {
        this.f6042j = interfaceC1366ah;
    }

    public void setOnGroupCollapseListener(InterfaceC1368aj interfaceC1368aj) {
        this.f6043k = interfaceC1368aj;
    }

    public void setOnGroupExpandListener(InterfaceC1369ak interfaceC1369ak) {
        this.f6044l = interfaceC1369ak;
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1370al();

        /* renamed from: a */
        ArrayList<ExpandableRecyclerConnector.GroupMetadata> f6045a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(Parcelable parcelable, ArrayList<ExpandableRecyclerConnector.GroupMetadata> arrayList) {
            super(parcelable);
            this.f6045a = arrayList;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f6045a = new ArrayList<>();
            parcel.readList(this.f6045a, ExpandableRecyclerConnector.class.getClassLoader());
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeList(this.f6045a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f6040h != null ? this.f6040h.m4804f() : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f6040h == null || savedState.f6045a == null) {
            return;
        }
        this.f6040h.m4799a(savedState.f6045a);
    }
}
