package color.support.design.widget.blur;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.SparseArray;

/* compiled from: ImageHelper.java */
/* renamed from: color.support.design.widget.blur.i */
/* loaded from: classes.dex */
public class C1173i {

    /* renamed from: a */
    private static volatile C1173i f4761a;

    /* renamed from: b */
    private Paint f4762b;

    /* renamed from: c */
    private Bitmap f4763c;

    /* renamed from: d */
    private Canvas f4764d;

    /* renamed from: e */
    private SparseArray<Bitmap> f4765e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<Canvas> f4766f = new SparseArray<>();

    private C1173i() {
    }

    /* renamed from: a */
    public static C1173i m3884a() {
        if (f4761a == null) {
            synchronized (C1173i.class) {
                if (f4761a == null) {
                    f4761a = new C1173i();
                }
            }
        }
        return f4761a;
    }

    /* renamed from: a */
    public final Bitmap m3885a(Bitmap bitmap, float f) {
        if (this.f4765e == null) {
            this.f4765e = new SparseArray<>();
        }
        if (this.f4766f == null) {
            this.f4766f = new SparseArray<>();
        }
        if (this.f4762b == null) {
            Paint paint = new Paint();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(f);
            ColorMatrix colorMatrix2 = new ColorMatrix();
            colorMatrix2.postConcat(colorMatrix);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            this.f4762b = paint;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmap2 = this.f4765e.get(height);
        if (bitmap2 != null && bitmap2.getWidth() == width && bitmap2.getHeight() == height) {
            this.f4763c = bitmap2;
            this.f4764d = this.f4766f.get(height);
        } else {
            this.f4763c = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.f4765e.put(height, this.f4763c);
            Canvas canvas = new Canvas(this.f4763c);
            this.f4766f.put(height, canvas);
            this.f4764d = canvas;
        }
        if (this.f4764d == null && this.f4763c != null) {
            this.f4764d = new Canvas(this.f4763c);
        }
        this.f4764d.drawBitmap(bitmap, 0.0f, 0.0f, this.f4762b);
        return this.f4763c;
    }
}
