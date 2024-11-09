package color.support.p043v7.widget.cardview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.color.support.util.C1344i;

/* compiled from: CardViewBaseImpl.java */
/* renamed from: color.support.v7.widget.cardview.e */
/* loaded from: classes.dex */
final class C1270e implements InterfaceC1276k {

    /* renamed from: a */
    final /* synthetic */ C1269d f5374a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1270e(C1269d c1269d) {
        this.f5374a = c1269d;
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1276k
    /* renamed from: a */
    public final void mo4149a(Canvas canvas, RectF rectF, float f, Paint paint) {
        canvas.drawPath(C1344i.m4397a().m4400a(rectF, f), paint);
    }
}
