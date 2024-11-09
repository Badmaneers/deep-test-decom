package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.p024g.C0538w;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private TypedValue f897a;

    /* renamed from: b */
    private TypedValue f898b;

    /* renamed from: c */
    private TypedValue f899c;

    /* renamed from: d */
    private TypedValue f900d;

    /* renamed from: e */
    private TypedValue f901e;

    /* renamed from: f */
    private TypedValue f902f;

    /* renamed from: g */
    private final Rect f903g;

    /* renamed from: h */
    private InterfaceC0215bg f904h;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f903g = new Rect();
    }

    /* renamed from: a */
    public final void m582a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(InterfaceC0215bg interfaceC0215bg) {
        this.f904h = interfaceC0215bg;
    }

    /* renamed from: a */
    public final void m581a(int i, int i2, int i3, int i4) {
        this.f903g.set(i, i2, i3, i4);
        if (C0538w.m1819C(this)) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public TypedValue getMinWidthMajor() {
        if (this.f897a == null) {
            this.f897a = new TypedValue();
        }
        return this.f897a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f898b == null) {
            this.f898b = new TypedValue();
        }
        return this.f898b;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f899c == null) {
            this.f899c = new TypedValue();
        }
        return this.f899c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f900d == null) {
            this.f900d = new TypedValue();
        }
        return this.f900d;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f901e == null) {
            this.f901e = new TypedValue();
        }
        return this.f901e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f902f == null) {
            this.f902f = new TypedValue();
        }
        return this.f902f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f904h != null) {
            this.f904h.mo252a();
        }
    }
}
