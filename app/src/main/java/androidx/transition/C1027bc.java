package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p024g.C0538w;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOverlayApi14.java */
/* renamed from: androidx.transition.bc */
/* loaded from: classes.dex */
public final class C1027bc extends ViewGroup {

    /* renamed from: a */
    static Method f4164a;

    /* renamed from: b */
    ViewGroup f4165b;

    /* renamed from: c */
    View f4166c;

    /* renamed from: d */
    ArrayList<Drawable> f4167d;

    /* renamed from: e */
    C1026bb f4168e;

    /* renamed from: f */
    private boolean f4169f;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    static {
        try {
            f4164a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1027bc(Context context, ViewGroup viewGroup, View view, C1026bb c1026bb) {
        super(context);
        this.f4167d = null;
        this.f4165b = viewGroup;
        this.f4166c = view;
        setRight(viewGroup.getWidth());
        setBottom(viewGroup.getHeight());
        viewGroup.addView(this);
        this.f4168e = c1026bb;
    }

    /* renamed from: a */
    public final void m3548a(Drawable drawable) {
        m3546a();
        if (this.f4167d == null) {
            this.f4167d = new ArrayList<>();
        }
        if (this.f4167d.contains(drawable)) {
            return;
        }
        this.f4167d.add(drawable);
        invalidate(drawable.getBounds());
        drawable.setCallback(this);
    }

    /* renamed from: b */
    public final void m3550b(Drawable drawable) {
        if (this.f4167d != null) {
            this.f4167d.remove(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(null);
            m3547b();
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        return this.f4167d != null && this.f4167d.contains(drawable);
    }

    /* renamed from: a */
    public final void m3549a(View view) {
        m3546a();
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != this.f4165b && viewGroup.getParent() != null && C0538w.m1822F(viewGroup)) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                this.f4165b.getLocationOnScreen(iArr2);
                C0538w.m1871d(view, iArr[0] - iArr2[0]);
                C0538w.m1869c(view, iArr[1] - iArr2[1]);
            }
            viewGroup.removeView(view);
            if (view.getParent() != null) {
                viewGroup.removeView(view);
            }
        }
        super.addView(view);
    }

    /* renamed from: b */
    public final void m3551b(View view) {
        super.removeView(view);
        m3547b();
    }

    /* renamed from: a */
    private void m3546a() {
        if (this.f4169f) {
            throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
        }
    }

    /* renamed from: b */
    private void m3547b() {
        if (getChildCount() == 0) {
            if (this.f4167d == null || this.f4167d.size() == 0) {
                this.f4169f = true;
                this.f4165b.removeView(this);
            }
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate(drawable.getBounds());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        this.f4165b.getLocationOnScreen(new int[2]);
        this.f4166c.getLocationOnScreen(new int[2]);
        canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
        canvas.clipRect(new Rect(0, 0, this.f4166c.getWidth(), this.f4166c.getHeight()));
        super.dispatchDraw(canvas);
        int size = this.f4167d == null ? 0 : this.f4167d.size();
        for (int i = 0; i < size; i++) {
            this.f4167d.get(i).draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (this.f4165b == null) {
            return null;
        }
        rect.offset(iArr[0], iArr[1]);
        if (this.f4165b instanceof ViewGroup) {
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f4165b.getLocationOnScreen(iArr2);
            this.f4166c.getLocationOnScreen(iArr3);
            int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
            rect.offset(iArr4[0], iArr4[1]);
            return super.invalidateChildInParent(iArr, rect);
        }
        invalidate(rect);
        return null;
    }
}
