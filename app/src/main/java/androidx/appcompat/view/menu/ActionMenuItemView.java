package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0287dy;
import androidx.appcompat.widget.InterfaceC0308q;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, InterfaceC0147ag, InterfaceC0308q {

    /* renamed from: a */
    C0172s f512a;

    /* renamed from: b */
    InterfaceC0170q f513b;

    /* renamed from: c */
    AbstractC0156c f514c;

    /* renamed from: e */
    private CharSequence f515e;

    /* renamed from: f */
    private Drawable f516f;

    /* renamed from: g */
    private AbstractViewOnAttachStateChangeListenerC0224bp f517g;

    /* renamed from: h */
    private boolean f518h;

    /* renamed from: i */
    private boolean f519i;

    /* renamed from: j */
    private int f520j;

    /* renamed from: k */
    private int f521k;

    /* renamed from: l */
    private int f522l;

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    /* renamed from: a */
    public final boolean mo339a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f518h = m336e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionMenuItemView, i, 0);
        this.f520j = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f522l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f521k = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f518h = m336e();
        m337f();
    }

    /* renamed from: e */
    private boolean m336e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f521k = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    public C0172s getItemData() {
        return this.f512a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    /* renamed from: a */
    public final void mo338a(C0172s c0172s) {
        this.f512a = c0172s;
        setIcon(c0172s.getIcon());
        setTitle(c0172s.m479a((InterfaceC0147ag) this));
        setId(c0172s.getItemId());
        setVisibility(c0172s.isVisible() ? 0 : 8);
        setEnabled(c0172s.isEnabled());
        if (c0172s.hasSubMenu() && this.f517g == null) {
            this.f517g = new C0155b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f512a.hasSubMenu() && this.f517g != null && this.f517g.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f513b != null) {
            this.f513b.mo344a(this.f512a);
        }
    }

    public void setItemInvoker(InterfaceC0170q interfaceC0170q) {
        this.f513b = interfaceC0170q;
    }

    public void setPopupCallback(AbstractC0156c abstractC0156c) {
        this.f514c = abstractC0156c;
    }

    public void setExpandedFormat(boolean z) {
        if (this.f519i != z) {
            this.f519i = z;
            if (this.f512a != null) {
                this.f512a.f712a.m467k();
            }
        }
    }

    /* renamed from: f */
    private void m337f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f515e);
        if (this.f516f != null && (!this.f512a.m494i() || (!this.f518h && !this.f519i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f515e : null);
        CharSequence contentDescription = this.f512a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f512a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f512a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C0287dy.m973a(this, z3 ? null : this.f512a.getTitle());
        } else {
            C0287dy.m973a(this, tooltipText);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f516f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f522l) {
                float f = this.f522l / intrinsicWidth;
                intrinsicWidth = this.f522l;
                intrinsicHeight = (int) (intrinsicHeight * f);
            }
            if (intrinsicHeight > this.f522l) {
                float f2 = this.f522l / intrinsicHeight;
                intrinsicHeight = this.f522l;
                intrinsicWidth = (int) (intrinsicWidth * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m337f();
    }

    /* renamed from: b */
    public final boolean m340b() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.f515e = charSequence;
        m337f();
    }

    @Override // androidx.appcompat.widget.InterfaceC0308q
    /* renamed from: c */
    public final boolean mo341c() {
        return m340b() && this.f512a.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.InterfaceC0308q
    /* renamed from: d */
    public final boolean mo342d() {
        return m340b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        boolean m340b = m340b();
        if (m340b && this.f521k >= 0) {
            super.setPadding(this.f521k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f520j) : this.f520j;
        if (mode != 1073741824 && this.f520j > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (m340b || this.f516f == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f516f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
