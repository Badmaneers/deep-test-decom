package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    private final ArrayList<C0670an> f2813a;

    /* renamed from: b */
    private Context f2814b;

    /* renamed from: c */
    private AbstractC0705q f2815c;

    /* renamed from: d */
    private int f2816d;

    /* renamed from: e */
    private TabHost.OnTabChangeListener f2817e;

    /* renamed from: f */
    private C0670an f2818f;

    /* renamed from: g */
    private boolean f2819g;

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0669am();

        /* renamed from: a */
        String f2820a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2820a = parcel.readString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2820a);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f2820a + "}";
        }
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.f2813a = new ArrayList<>();
        m2332a(context, (AttributeSet) null);
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2813a = new ArrayList<>();
        m2332a(context, attributeSet);
    }

    /* renamed from: a */
    private void m2332a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f2816d = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f2817e = onTabChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f2813a.size();
        AbstractC0671ao abstractC0671ao = null;
        for (int i = 0; i < size; i++) {
            C0670an c0670an = this.f2813a.get(i);
            c0670an.f2851d = this.f2815c.mo2472a(c0670an.f2848a);
            if (c0670an.f2851d != null && !c0670an.f2851d.f2742I) {
                if (c0670an.f2848a.equals(currentTabTag)) {
                    this.f2818f = c0670an;
                } else {
                    if (abstractC0671ao == null) {
                        abstractC0671ao = this.f2815c.mo2473a();
                    }
                    abstractC0671ao.mo2349b(c0670an.f2851d);
                }
            }
        }
        this.f2819g = true;
        AbstractC0671ao m2331a = m2331a(currentTabTag, abstractC0671ao);
        if (m2331a != null) {
            m2331a.mo2347b();
            this.f2815c.mo2479b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2819g = false;
    }

    @Override // android.view.View
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2820a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.view.View
    @Deprecated
    protected void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f2820a);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        AbstractC0671ao m2331a;
        if (this.f2819g && (m2331a = m2331a(str, (AbstractC0671ao) null)) != null) {
            m2331a.mo2347b();
        }
        if (this.f2817e != null) {
            this.f2817e.onTabChanged(str);
        }
    }

    /* renamed from: a */
    private AbstractC0671ao m2331a(String str, AbstractC0671ao abstractC0671ao) {
        C0670an m2330a = m2330a(str);
        if (this.f2818f != m2330a) {
            if (abstractC0671ao == null) {
                abstractC0671ao = this.f2815c.mo2473a();
            }
            if (this.f2818f != null && this.f2818f.f2851d != null) {
                abstractC0671ao.mo2349b(this.f2818f.f2851d);
            }
            if (m2330a != null) {
                if (m2330a.f2851d == null) {
                    m2330a.f2851d = this.f2815c.mo2483f().mo2468c(this.f2814b.getClassLoader(), m2330a.f2849b.getName());
                    m2330a.f2851d.m2301e(m2330a.f2850c);
                    abstractC0671ao.m2373a(this.f2816d, m2330a.f2851d, m2330a.f2848a);
                } else {
                    abstractC0671ao.m2376c(m2330a.f2851d);
                }
            }
            this.f2818f = m2330a;
        }
        return abstractC0671ao;
    }

    /* renamed from: a */
    private C0670an m2330a(String str) {
        int size = this.f2813a.size();
        for (int i = 0; i < size; i++) {
            C0670an c0670an = this.f2813a.get(i);
            if (c0670an.f2848a.equals(str)) {
                return c0670an;
            }
        }
        return null;
    }
}
