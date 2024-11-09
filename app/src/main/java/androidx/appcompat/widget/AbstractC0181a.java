package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.core.p024g.C0507ah;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbsActionBarView.java */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0181a extends ViewGroup {

    /* renamed from: a */
    protected final C0208b f1084a;

    /* renamed from: b */
    protected final Context f1085b;

    /* renamed from: c */
    protected ActionMenuView f1086c;

    /* renamed from: d */
    protected ActionMenuPresenter f1087d;

    /* renamed from: e */
    protected int f1088e;

    /* renamed from: f */
    protected C0507ah f1089f;

    /* renamed from: g */
    private boolean f1090g;

    /* renamed from: h */
    private boolean f1091h;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m670a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    AbstractC0181a(Context context) {
        this(context, null);
    }

    AbstractC0181a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0181a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1084a = new C0208b(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f1085b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1085b = context;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f1087d != null) {
            this.f1087d.m547d();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1090g = false;
        }
        if (!this.f1090g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1090g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1090g = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1091h = false;
        }
        if (!this.f1091h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1091h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1091h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1088e = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.f1088e;
    }

    public int getAnimatedVisibility() {
        if (this.f1089f != null) {
            return this.f1084a.f1160a;
        }
        return getVisibility();
    }

    /* renamed from: a */
    public C0507ah mo510a(int i, long j) {
        if (this.f1089f != null) {
            this.f1089f.m1761c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0507ah m1753a = C0538w.m1887p(this).m1753a(1.0f);
            m1753a.m1754a(j);
            m1753a.m1756a(this.f1084a.m757a(m1753a, i));
            return m1753a;
        }
        C0507ah m1753a2 = C0538w.m1887p(this).m1753a(0.0f);
        m1753a2.m1754a(j);
        m1753a2.m1756a(this.f1084a.m757a(m1753a2, i));
        return m1753a2;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f1089f != null) {
                this.f1089f.m1761c();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean mo512a() {
        if (this.f1087d != null) {
            return this.f1087d.m550h();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m671a(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m672a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
