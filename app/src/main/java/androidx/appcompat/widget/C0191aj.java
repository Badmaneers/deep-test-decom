package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.widget.C0567e;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* renamed from: androidx.appcompat.widget.aj */
/* loaded from: classes.dex */
final class C0191aj {

    /* renamed from: a */
    private final CompoundButton f1111a;

    /* renamed from: b */
    private ColorStateList f1112b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1113c = null;

    /* renamed from: d */
    private boolean f1114d = false;

    /* renamed from: e */
    private boolean f1115e = false;

    /* renamed from: f */
    private boolean f1116f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0191aj(CompoundButton compoundButton) {
        this.f1111a = compoundButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:3:0x000d, B:5:0x0015, B:8:0x001d, B:11:0x0031, B:13:0x0039, B:15:0x0041, B:16:0x0050, B:18:0x0058, B:19:0x0063, B:21:0x006b, B:23:0x007f, B:24:0x0083, B:26:0x0087), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:3:0x000d, B:5:0x0015, B:8:0x001d, B:11:0x0031, B:13:0x0039, B:15:0x0041, B:16:0x0050, B:18:0x0058, B:19:0x0063, B:21:0x006b, B:23:0x007f, B:24:0x0083, B:26:0x0087), top: B:2:0x000d }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m703a(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f1111a
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = androidx.appcompat.R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L90
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto L2e
            int r5 = androidx.appcompat.R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L90
            int r5 = r4.getResourceId(r5, r2)     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto L2e
            android.widget.CompoundButton r0 = r3.f1111a     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L90
            android.widget.CompoundButton r1 = r3.f1111a     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L90
            android.content.Context r1 = r1.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L90
            android.graphics.drawable.Drawable r5 = androidx.appcompat.p006a.p007a.C0057a.m46b(r1, r5)     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L90
            r0.setButtonDrawable(r5)     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L90
            r5 = 1
            goto L2f
        L2e:
            r5 = r2
        L2f:
            if (r5 != 0) goto L50
            int r5 = androidx.appcompat.R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L90
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto L50
            int r5 = androidx.appcompat.R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L90
            int r5 = r4.getResourceId(r5, r2)     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto L50
            android.widget.CompoundButton r0 = r3.f1111a     // Catch: java.lang.Throwable -> L90
            android.widget.CompoundButton r1 = r3.f1111a     // Catch: java.lang.Throwable -> L90
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L90
            android.graphics.drawable.Drawable r5 = androidx.appcompat.p006a.p007a.C0057a.m46b(r1, r5)     // Catch: java.lang.Throwable -> L90
            r0.setButtonDrawable(r5)     // Catch: java.lang.Throwable -> L90
        L50:
            int r5 = androidx.appcompat.R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L90
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto L63
            android.widget.CompoundButton r5 = r3.f1111a     // Catch: java.lang.Throwable -> L90
            int r0 = androidx.appcompat.R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L90
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch: java.lang.Throwable -> L90
            androidx.core.widget.C0567e.m2036a(r5, r0)     // Catch: java.lang.Throwable -> L90
        L63:
            int r5 = androidx.appcompat.R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L90
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto L8c
            android.widget.CompoundButton r3 = r3.f1111a     // Catch: java.lang.Throwable -> L90
            int r5 = androidx.appcompat.R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L90
            r0 = -1
            int r5 = r4.getInt(r5, r0)     // Catch: java.lang.Throwable -> L90
            r0 = 0
            android.graphics.PorterDuff$Mode r5 = androidx.appcompat.widget.C0218bj.m846a(r5, r0)     // Catch: java.lang.Throwable -> L90
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L90
            r1 = 21
            if (r0 < r1) goto L83
            r3.setButtonTintMode(r5)     // Catch: java.lang.Throwable -> L90
            goto L8c
        L83:
            boolean r0 = r3 instanceof androidx.core.widget.InterfaceC0579q     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L8c
            androidx.core.widget.q r3 = (androidx.core.widget.InterfaceC0579q) r3     // Catch: java.lang.Throwable -> L90
            r3.setSupportButtonTintMode(r5)     // Catch: java.lang.Throwable -> L90
        L8c:
            r4.recycle()
            return
        L90:
            r3 = move-exception
            r4.recycle()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0191aj.m703a(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m701a(ColorStateList colorStateList) {
        this.f1112b = colorStateList;
        this.f1114d = true;
        m698d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final ColorStateList m700a() {
        return this.f1112b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m702a(PorterDuff.Mode mode) {
        this.f1113c = mode;
        this.f1115e = true;
        m698d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final PorterDuff.Mode m704b() {
        return this.f1113c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m705c() {
        if (this.f1116f) {
            this.f1116f = false;
        } else {
            this.f1116f = true;
            m698d();
        }
    }

    /* renamed from: d */
    private void m698d() {
        Drawable m2037b = C0567e.m2037b(this.f1111a);
        if (m2037b != null) {
            if (this.f1114d || this.f1115e) {
                Drawable mutate = C0546a.m1933f(m2037b).mutate();
                if (this.f1114d) {
                    C0546a.m1922a(mutate, this.f1112b);
                }
                if (this.f1115e) {
                    C0546a.m1925a(mutate, this.f1113c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1111a.getDrawableState());
                }
                this.f1111a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m699a(int i) {
        Drawable m2037b;
        return (Build.VERSION.SDK_INT >= 17 || (m2037b = C0567e.m2037b(this.f1111a)) == null) ? i : i + m2037b.getIntrinsicWidth();
    }
}
