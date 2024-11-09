package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOverlayApi14.java */
@SuppressLint({"ViewConstructor", "PrivateApi"})
/* renamed from: com.google.android.material.internal.ap */
/* loaded from: classes.dex */
public final class C2247ap extends ViewGroup {

    /* renamed from: a */
    static Method f9935a;

    /* renamed from: b */
    ViewGroup f9936b;

    /* renamed from: c */
    View f9937c;

    /* renamed from: d */
    ArrayList<Drawable> f9938d;

    /* renamed from: e */
    C2246ao f9939e;

    /* renamed from: f */
    private boolean f9940f;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    static {
        try {
            f9935a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2247ap(Context context, ViewGroup viewGroup, View view, C2246ao c2246ao) {
        super(context);
        this.f9938d = null;
        this.f9936b = viewGroup;
        this.f9937c = view;
        setRight(viewGroup.getWidth());
        setBottom(viewGroup.getHeight());
        viewGroup.addView(this);
        this.f9939e = c2246ao;
    }

    /* renamed from: b */
    public final void m7107b(Drawable drawable) {
        if (this.f9938d != null) {
            this.f9938d.remove(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(null);
            if (getChildCount() == 0) {
                if (this.f9938d == null || this.f9938d.size() == 0) {
                    this.f9940f = true;
                    this.f9936b.removeView(this);
                }
            }
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        return this.f9938d != null && this.f9938d.contains(drawable);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate(drawable.getBounds());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        this.f9936b.getLocationOnScreen(new int[2]);
        this.f9937c.getLocationOnScreen(new int[2]);
        canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
        canvas.clipRect(new Rect(0, 0, this.f9937c.getWidth(), this.f9937c.getHeight()));
        super.dispatchDraw(canvas);
        int size = this.f9938d == null ? 0 : this.f9938d.size();
        for (int i = 0; i < size; i++) {
            this.f9938d.get(i).draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (this.f9936b == null) {
            return null;
        }
        rect.offset(iArr[0], iArr[1]);
        if (this.f9936b != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f9936b.getLocationOnScreen(iArr2);
            this.f9937c.getLocationOnScreen(iArr3);
            int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
            rect.offset(iArr4[0], iArr4[1]);
            return super.invalidateChildInParent(iArr, rect);
        }
        invalidate(rect);
        return null;
    }

    /* renamed from: a */
    public final void m7106a(Drawable drawable) {
        if (!this.f9940f) {
            if (this.f9938d == null) {
                this.f9938d = new ArrayList<>();
            }
            if (this.f9938d.contains(drawable)) {
                return;
            }
            this.f9938d.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
            return;
        }
        throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
    }
}
