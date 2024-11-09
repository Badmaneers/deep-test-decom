package color.support.design.widget.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ColorRenderScriptColorBlur.java */
/* renamed from: color.support.design.widget.blur.h */
/* loaded from: classes.dex */
class C1172h extends AbstractC1166b {

    /* renamed from: c */
    private static final String f4751c = "h";

    /* renamed from: d */
    private final Object f4752d;

    /* renamed from: e */
    private final RenderScript f4753e;

    /* renamed from: f */
    private final ScriptIntrinsicBlur f4754f;

    /* renamed from: g */
    private Allocation f4755g;

    /* renamed from: h */
    private Allocation f4756h;

    /* renamed from: i */
    private int f4757i;

    /* renamed from: j */
    private int f4758j;

    /* renamed from: k */
    private Bitmap f4759k;

    /* renamed from: l */
    private Map<Integer, Bitmap> f4760l;

    public C1172h(Context context, C1168d c1168d) {
        super(c1168d);
        this.f4752d = new Object();
        this.f4760l = new HashMap();
        this.f4753e = RenderScript.create(context);
        this.f4754f = ScriptIntrinsicBlur.create(this.f4753e, Element.U8_4(this.f4753e));
    }

    @Override // color.support.design.widget.blur.InterfaceC1170f
    /* renamed from: a */
    public final Bitmap mo3871a(Bitmap bitmap, boolean z, int i) {
        return m3882a(bitmap);
    }

    @Override // color.support.design.widget.blur.AbstractC1166b, color.support.design.widget.blur.InterfaceC1170f
    /* renamed from: a */
    public final void mo3870a() {
        super.mo3870a();
        synchronized (this.f4752d) {
            if (this.f4753e != null) {
                this.f4753e.destroy();
            }
            if (this.f4754f != null) {
                this.f4754f.destroy();
            }
            m3883b();
        }
    }

    /* renamed from: a */
    private Bitmap m3882a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmap2 = this.f4760l.get(Integer.valueOf(height));
        if (bitmap2 != null && bitmap2.getWidth() == width && bitmap2.getHeight() == height) {
            this.f4759k = bitmap2;
        } else {
            this.f4759k = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.f4760l.put(Integer.valueOf(height), this.f4759k);
        }
        synchronized (this.f4752d) {
            if (this.f4755g == null || this.f4757i != width || this.f4758j != height) {
                this.f4757i = width;
                this.f4758j = height;
                m3883b();
                this.f4755g = Allocation.createFromBitmap(this.f4753e, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                this.f4756h = Allocation.createTyped(this.f4753e, this.f4755g.getType());
            }
            this.f4755g.copyFrom(bitmap);
            this.f4754f.setRadius(this.f4739b.m3873a());
            this.f4754f.setInput(this.f4755g);
            this.f4754f.forEach(this.f4756h);
            this.f4756h.copyTo(this.f4759k);
        }
        return this.f4759k;
    }

    /* renamed from: b */
    private void m3883b() {
        if (this.f4755g != null) {
            this.f4755g.destroy();
            this.f4755g = null;
        }
        if (this.f4756h != null) {
            this.f4756h.destroy();
            this.f4756h = null;
        }
    }
}
