package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: CardViewBaseImpl.java */
/* renamed from: androidx.cardview.widget.f */
/* loaded from: classes.dex */
final class C0341f implements InterfaceC0346k {

    /* renamed from: a */
    final /* synthetic */ C0340e f1543a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0341f(C0340e c0340e) {
        this.f1543a = c0340e;
    }

    @Override // androidx.cardview.widget.InterfaceC0346k
    /* renamed from: a */
    public final void mo1092a(Canvas canvas, RectF rectF, float f, Paint paint) {
        float f2 = 2.0f * f;
        float width = (rectF.width() - f2) - 1.0f;
        float height = (rectF.height() - f2) - 1.0f;
        if (f >= 1.0f) {
            float f3 = f + 0.5f;
            float f4 = -f3;
            this.f1543a.f1542a.set(f4, f4, f3, f3);
            int save = canvas.save();
            canvas.translate(rectF.left + f3, rectF.top + f3);
            canvas.drawArc(this.f1543a.f1542a, 180.0f, 90.0f, true, paint);
            canvas.translate(width, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(this.f1543a.f1542a, 180.0f, 90.0f, true, paint);
            canvas.translate(height, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(this.f1543a.f1542a, 180.0f, 90.0f, true, paint);
            canvas.translate(width, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(this.f1543a.f1542a, 180.0f, 90.0f, true, paint);
            canvas.restoreToCount(save);
            canvas.drawRect((rectF.left + f3) - 1.0f, rectF.top, (rectF.right - f3) + 1.0f, rectF.top + f3, paint);
            canvas.drawRect((rectF.left + f3) - 1.0f, rectF.bottom - f3, (rectF.right - f3) + 1.0f, rectF.bottom, paint);
        }
        canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
    }
}
