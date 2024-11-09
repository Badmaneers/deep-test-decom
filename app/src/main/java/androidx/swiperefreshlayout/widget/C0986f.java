package androidx.swiperefreshlayout.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: CircularProgressDrawable.java */
/* renamed from: androidx.swiperefreshlayout.widget.f */
/* loaded from: classes.dex */
final class C0986f {

    /* renamed from: i */
    int[] f4055i;

    /* renamed from: j */
    int f4056j;

    /* renamed from: k */
    float f4057k;

    /* renamed from: l */
    float f4058l;

    /* renamed from: m */
    float f4059m;

    /* renamed from: n */
    boolean f4060n;

    /* renamed from: o */
    Path f4061o;

    /* renamed from: q */
    float f4063q;

    /* renamed from: r */
    int f4064r;

    /* renamed from: s */
    int f4065s;

    /* renamed from: u */
    int f4067u;

    /* renamed from: a */
    final RectF f4047a = new RectF();

    /* renamed from: b */
    final Paint f4048b = new Paint();

    /* renamed from: c */
    final Paint f4049c = new Paint();

    /* renamed from: d */
    final Paint f4050d = new Paint();

    /* renamed from: e */
    float f4051e = 0.0f;

    /* renamed from: f */
    float f4052f = 0.0f;

    /* renamed from: g */
    float f4053g = 0.0f;

    /* renamed from: h */
    float f4054h = 5.0f;

    /* renamed from: p */
    float f4062p = 1.0f;

    /* renamed from: t */
    int f4066t = 255;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0986f() {
        this.f4048b.setStrokeCap(Paint.Cap.SQUARE);
        this.f4048b.setAntiAlias(true);
        this.f4048b.setStyle(Paint.Style.STROKE);
        this.f4049c.setStyle(Paint.Style.FILL);
        this.f4049c.setAntiAlias(true);
        this.f4050d.setColor(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3469a(int[] iArr) {
        this.f4055i = iArr;
        m3467a(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3467a(int i) {
        this.f4056j = i;
        this.f4067u = this.f4055i[this.f4056j];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m3465a() {
        return (this.f4056j + 1) % this.f4055i.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3466a(float f) {
        this.f4054h = f;
        this.f4048b.setStrokeWidth(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m3470b() {
        return this.f4055i[this.f4056j];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3468a(boolean z) {
        if (this.f4060n != z) {
            this.f4060n = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m3471c() {
        this.f4057k = this.f4051e;
        this.f4058l = this.f4052f;
        this.f4059m = this.f4053g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m3472d() {
        this.f4057k = 0.0f;
        this.f4058l = 0.0f;
        this.f4059m = 0.0f;
        this.f4051e = 0.0f;
        this.f4052f = 0.0f;
        this.f4053g = 0.0f;
    }
}
