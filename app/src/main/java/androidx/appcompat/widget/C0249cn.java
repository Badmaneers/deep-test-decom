package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.app.AbstractC0088c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollingTabContainerView.java */
/* renamed from: androidx.appcompat.widget.cn */
/* loaded from: classes.dex */
public final class C0249cn extends LinearLayout {

    /* renamed from: a */
    final /* synthetic */ ScrollingTabContainerView f1296a;

    /* renamed from: b */
    private final int[] f1297b;

    /* renamed from: c */
    private AbstractC0088c f1298c;

    /* renamed from: d */
    private TextView f1299d;

    /* renamed from: e */
    private ImageView f1300e;

    /* renamed from: f */
    private View f1301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249cn(ScrollingTabContainerView scrollingTabContainerView, Context context, AbstractC0088c abstractC0088c) {
        super(context, null, R.attr.actionBarTabStyle);
        this.f1296a = scrollingTabContainerView;
        this.f1297b = new int[]{android.R.attr.background};
        this.f1298c = abstractC0088c;
        C0276dn m944a = C0276dn.m944a(context, null, this.f1297b, R.attr.actionBarTabStyle, 0);
        if (m944a.m964i(0)) {
            setBackgroundDrawable(m944a.m948a(0));
        }
        m944a.m952b();
        setGravity(8388627);
        m909b();
    }

    /* renamed from: a */
    public final void m911a(AbstractC0088c abstractC0088c) {
        this.f1298c = abstractC0088c;
        m909b();
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        if (z2 && z) {
            sendAccessibilityEvent(4);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1296a.f931c <= 0 || getMeasuredWidth() <= this.f1296a.f931c) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f1296a.f931c, 1073741824), i2);
    }

    /* renamed from: b */
    private void m909b() {
        AbstractC0088c abstractC0088c = this.f1298c;
        View m229c = abstractC0088c.m229c();
        if (m229c != null) {
            ViewParent parent = m229c.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(m229c);
                }
                addView(m229c);
            }
            this.f1301f = m229c;
            if (this.f1299d != null) {
                this.f1299d.setVisibility(8);
            }
            if (this.f1300e != null) {
                this.f1300e.setVisibility(8);
                this.f1300e.setImageDrawable(null);
                return;
            }
            return;
        }
        if (this.f1301f != null) {
            removeView(this.f1301f);
            this.f1301f = null;
        }
        Drawable m227a = abstractC0088c.m227a();
        CharSequence m228b = abstractC0088c.m228b();
        if (m227a != null) {
            if (this.f1300e == null) {
                AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                appCompatImageView.setLayoutParams(layoutParams);
                addView(appCompatImageView, 0);
                this.f1300e = appCompatImageView;
            }
            this.f1300e.setImageDrawable(m227a);
            this.f1300e.setVisibility(0);
        } else if (this.f1300e != null) {
            this.f1300e.setVisibility(8);
            this.f1300e.setImageDrawable(null);
        }
        boolean z = !TextUtils.isEmpty(m228b);
        if (z) {
            if (this.f1299d == null) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 16;
                appCompatTextView.setLayoutParams(layoutParams2);
                addView(appCompatTextView);
                this.f1299d = appCompatTextView;
            }
            this.f1299d.setText(m228b);
            this.f1299d.setVisibility(0);
        } else if (this.f1299d != null) {
            this.f1299d.setVisibility(8);
            this.f1299d.setText((CharSequence) null);
        }
        if (this.f1300e != null) {
            this.f1300e.setContentDescription(abstractC0088c.m230d());
        }
        C0287dy.m973a(this, z ? null : abstractC0088c.m230d());
    }

    /* renamed from: a */
    public final AbstractC0088c m910a() {
        return this.f1298c;
    }
}
