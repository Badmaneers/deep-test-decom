package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.app.C0086b;

/* compiled from: Toolbar.java */
/* renamed from: androidx.appcompat.widget.ds */
/* loaded from: classes.dex */
public class C0281ds extends C0086b {

    /* renamed from: b */
    int f1375b;

    public C0281ds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1375b = 0;
    }

    public C0281ds(int i, int i2) {
        super(i, i2);
        this.f1375b = 0;
        this.f285a = 8388627;
    }

    public C0281ds(C0281ds c0281ds) {
        super((C0086b) c0281ds);
        this.f1375b = 0;
        this.f1375b = c0281ds.f1375b;
    }

    public C0281ds(C0086b c0086b) {
        super(c0086b);
        this.f1375b = 0;
    }

    public C0281ds(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1375b = 0;
        m966a(marginLayoutParams);
    }

    public C0281ds(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1375b = 0;
    }

    /* renamed from: a */
    void m966a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }
}
