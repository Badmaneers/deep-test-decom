package androidx.vectordrawable.p039a.p040a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.t */
/* loaded from: classes.dex */
public final class C1088t extends Drawable.ConstantState {

    /* renamed from: a */
    int f4345a;

    /* renamed from: b */
    C1087s f4346b;

    /* renamed from: c */
    ColorStateList f4347c;

    /* renamed from: d */
    PorterDuff.Mode f4348d;

    /* renamed from: e */
    boolean f4349e;

    /* renamed from: f */
    Bitmap f4350f;

    /* renamed from: g */
    ColorStateList f4351g;

    /* renamed from: h */
    PorterDuff.Mode f4352h;

    /* renamed from: i */
    int f4353i;

    /* renamed from: j */
    boolean f4354j;

    /* renamed from: k */
    boolean f4355k;

    /* renamed from: l */
    Paint f4356l;

    public C1088t(C1088t c1088t) {
        this.f4347c = null;
        this.f4348d = C1081m.f4289a;
        if (c1088t != null) {
            this.f4345a = c1088t.f4345a;
            this.f4346b = new C1087s(c1088t.f4346b);
            if (c1088t.f4346b.f4330b != null) {
                this.f4346b.f4330b = new Paint(c1088t.f4346b.f4330b);
            }
            if (c1088t.f4346b.f4329a != null) {
                this.f4346b.f4329a = new Paint(c1088t.f4346b.f4329a);
            }
            this.f4347c = c1088t.f4347c;
            this.f4348d = c1088t.f4348d;
            this.f4349e = c1088t.f4349e;
        }
    }

    /* renamed from: a */
    public final void m3619a(int i, int i2) {
        this.f4350f.eraseColor(0);
        this.f4346b.m3617a(new Canvas(this.f4350f), i, i2);
    }

    public C1088t() {
        this.f4347c = null;
        this.f4348d = C1081m.f4289a;
        this.f4346b = new C1087s();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1081m(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1081m(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4345a;
    }
}
