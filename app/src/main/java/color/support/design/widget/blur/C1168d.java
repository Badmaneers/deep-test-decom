package color.support.design.widget.blur;

import android.util.Log;

/* compiled from: ColorBlurConfig.java */
/* renamed from: color.support.design.widget.blur.d */
/* loaded from: classes.dex */
public final class C1168d {

    /* renamed from: a */
    public static final C1168d f4741a = new C1168d(10, 10, 0, 1);

    /* renamed from: b */
    private final int f4742b;

    /* renamed from: c */
    private final int f4743c;

    /* renamed from: d */
    private final int f4744d;

    /* renamed from: e */
    private final int f4745e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1168d(int i, int i2, int i3, int i4, byte b) {
        this(i, i2, i3, i4);
    }

    private C1168d(int i, int i2, int i3, int i4) {
        this.f4742b = i;
        this.f4743c = i2;
        this.f4744d = i3;
        this.f4745e = i4;
    }

    /* renamed from: a */
    public final int m3873a() {
        return this.f4742b;
    }

    /* renamed from: b */
    public final int m3874b() {
        return this.f4743c;
    }

    /* renamed from: c */
    public final int m3875c() {
        return this.f4744d;
    }

    /* renamed from: d */
    public final int m3876d() {
        return this.f4745e;
    }

    /* renamed from: a */
    public static void m3872a(int i) {
        if (i <= 0) {
            Log.i("ColorBlurConfig", "mDownScaleFactor must be greater than 0.");
        }
    }
}
