package androidx.swiperefreshlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.shapes.OvalShape;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CircleImageView.java */
/* renamed from: androidx.swiperefreshlayout.widget.b */
/* loaded from: classes.dex */
public final class C0982b extends OvalShape {

    /* renamed from: a */
    final /* synthetic */ C0981a f4031a;

    /* renamed from: b */
    private RadialGradient f4032b;

    /* renamed from: c */
    private Paint f4033c = new Paint();

    public C0982b(C0981a c0981a, int i) {
        this.f4031a = c0981a;
        c0981a.f4029a = i;
        m3455a((int) rect().width());
    }

    @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    protected final void onResize(float f, float f2) {
        super.onResize(f, f2);
        m3455a((int) f);
    }

    @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    public final void draw(Canvas canvas, Paint paint) {
        float width = this.f4031a.getWidth() / 2;
        float height = this.f4031a.getHeight() / 2;
        canvas.drawCircle(width, height, width, this.f4033c);
        canvas.drawCircle(width, height, r0 - this.f4031a.f4029a, paint);
    }

    /* renamed from: a */
    private void m3455a(int i) {
        float f = i / 2;
        this.f4032b = new RadialGradient(f, f, this.f4031a.f4029a, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
        this.f4033c.setShader(this.f4032b);
    }
}
