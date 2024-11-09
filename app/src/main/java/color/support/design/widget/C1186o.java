package color.support.design.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0088c;
import androidx.appcompat.widget.C0287dy;
import androidx.core.content.p020a.C0431k;
import androidx.core.p024g.C0536u;
import androidx.core.p024g.C0538w;
import androidx.core.widget.C0577o;
import com.color.support.util.C1336a;
import com.color.support.util.C1338c;

/* compiled from: ColorTabLayout.java */
/* renamed from: color.support.design.widget.o */
/* loaded from: classes.dex */
public final class C1186o extends LinearLayout {

    /* renamed from: a */
    final /* synthetic */ ColorTabLayout f4821a;

    /* renamed from: b */
    private C1184m f4822b;

    /* renamed from: c */
    private TextView f4823c;

    /* renamed from: d */
    private ImageView f4824d;

    /* renamed from: e */
    private View f4825e;

    /* renamed from: f */
    private TextView f4826f;

    /* renamed from: g */
    private ImageView f4827g;

    /* renamed from: h */
    private int f4828h;

    /* renamed from: a */
    public static /* synthetic */ TextView m3931a(C1186o c1186o) {
        return c1186o.f4823c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1186o(ColorTabLayout colorTabLayout, Context context) {
        super(context);
        this.f4821a = colorTabLayout;
        this.f4828h = 1;
        if (colorTabLayout.f4695i != 0) {
            C0538w.m1846a(this, C0431k.m1529a(context.getResources(), colorTabLayout.f4695i, (Resources.Theme) null));
        }
        C0538w.m1863b(this, colorTabLayout.f4687a, colorTabLayout.f4688b, colorTabLayout.f4689c, colorTabLayout.f4690d);
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        C0538w.m1851a(this, C0536u.m1815a(getContext()));
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f4822b == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.f4822b.m3925g();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        if (z2 && z && Build.VERSION.SDK_INT < 16) {
            sendAccessibilityEvent(4);
        }
        m3931a(this);
        C1338c.m4375a(this.f4823c, !z);
        if (this.f4823c != null) {
            this.f4823c.setSelected(z);
        }
        if (this.f4824d != null) {
            this.f4824d.setSelected(z);
        }
        if (this.f4825e != null) {
            this.f4825e.setSelected(z);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f4823c != null) {
            this.f4823c.setEnabled(z);
        }
        if (this.f4824d != null) {
            this.f4824d.setEnabled(z);
        }
        if (this.f4825e != null) {
            this.f4825e.setEnabled(z);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbstractC0088c.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbstractC0088c.class.getName());
    }

    /* renamed from: a */
    public final void m3934a(C1184m c1184m) {
        if (c1184m != this.f4822b) {
            this.f4822b = c1184m;
            m3933a();
        }
    }

    /* renamed from: a */
    public final void m3933a() {
        C1184m c1184m = this.f4822b;
        View m3921c = c1184m != null ? c1184m.m3921c() : null;
        if (m3921c != null) {
            ViewParent parent = m3921c.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(m3921c);
                }
                addView(m3921c);
            }
            this.f4825e = m3921c;
            if (this.f4823c != null) {
                this.f4823c.setVisibility(8);
            }
            if (this.f4824d != null) {
                this.f4824d.setVisibility(8);
                this.f4824d.setImageDrawable(null);
            }
            this.f4826f = (TextView) m3921c.findViewById(R.id.text1);
            if (this.f4826f != null) {
                this.f4828h = C0577o.m2044a(this.f4826f);
            }
            this.f4827g = (ImageView) m3921c.findViewById(R.id.icon);
        } else {
            if (this.f4825e != null) {
                removeView(this.f4825e);
                this.f4825e = null;
            }
            this.f4826f = null;
            this.f4827g = null;
        }
        boolean z = false;
        if (this.f4825e == null) {
            if (this.f4824d == null) {
                ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(color.support.p043v7.appcompat.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                addView(imageView, 0);
                this.f4824d = imageView;
            }
            if (this.f4823c == null) {
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(color.support.p043v7.appcompat.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                addView(textView);
                this.f4823c = textView;
                this.f4828h = C0577o.m2044a(this.f4823c);
                C1336a.m4372a(textView);
            }
            this.f4823c.setTextSize(0, this.f4821a.f4693g);
            this.f4823c.setIncludeFontPadding(false);
            if (this.f4821a.f4692f != null) {
                this.f4823c.setTextColor(this.f4821a.f4692f);
            }
            m3932a(this.f4823c, this.f4824d);
        } else if (this.f4826f != null || this.f4827g != null) {
            m3932a(this.f4826f, this.f4827g);
        }
        if (c1184m != null && c1184m.m3926h()) {
            z = true;
        }
        setSelected(z);
    }

    /* renamed from: a */
    private void m3932a(TextView textView, ImageView imageView) {
        boolean z;
        C1179h c1179h;
        C1179h c1179h2;
        Drawable m3922d = this.f4822b != null ? this.f4822b.m3922d() : null;
        CharSequence m3924f = this.f4822b != null ? this.f4822b.m3924f() : null;
        CharSequence m3927i = this.f4822b != null ? this.f4822b.m3927i() : null;
        int i = 0;
        if (imageView != null) {
            if (m3922d != null) {
                imageView.setImageDrawable(m3922d);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
            imageView.setContentDescription(m3927i);
        }
        boolean z2 = !TextUtils.isEmpty(m3924f);
        if (textView != null) {
            if (z2) {
                textView.setText(m3924f);
                textView.setVisibility(0);
                z = this.f4821a.f4684U;
                if (z) {
                    c1179h = this.f4821a.f4710y;
                    if (c1179h != null) {
                        this.f4821a.f4684U = false;
                        c1179h2 = this.f4821a.f4710y;
                        c1179h2.requestLayout();
                    }
                }
                textView.setMaxLines(this.f4828h);
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
            textView.setContentDescription(m3927i);
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z2 && imageView.getVisibility() == 0) {
                i = this.f4821a.m3865b(8);
            }
            if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                imageView.requestLayout();
            }
        }
        C0287dy.m973a(this, z2 ? null : m3927i);
    }
}
