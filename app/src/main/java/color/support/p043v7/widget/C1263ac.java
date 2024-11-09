package color.support.p043v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.app.C0086b;
import androidx.appcompat.widget.C0281ds;

/* compiled from: Toolbar.java */
/* renamed from: color.support.v7.widget.ac */
/* loaded from: classes.dex */
public final class C1263ac extends C0281ds {

    /* renamed from: c */
    int f5358c;

    /* renamed from: d */
    boolean f5359d;

    public C1263ac(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5358c = 0;
        this.f5359d = false;
    }

    public C1263ac(int i, int i2) {
        super(i, i2);
        this.f5358c = 0;
        this.f5359d = false;
        this.f285a = 8388627;
    }

    public C1263ac(C1263ac c1263ac) {
        super((C0281ds) c1263ac);
        this.f5358c = 0;
        this.f5359d = false;
        this.f5358c = c1263ac.f5358c;
    }

    public C1263ac(C0086b c0086b) {
        super(c0086b);
        this.f5358c = 0;
        this.f5359d = false;
    }

    public C1263ac(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5358c = 0;
        this.f5359d = false;
        m4143a(marginLayoutParams);
    }

    public C1263ac(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5358c = 0;
        this.f5359d = false;
    }

    /* renamed from: a */
    final void m4143a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }
}
