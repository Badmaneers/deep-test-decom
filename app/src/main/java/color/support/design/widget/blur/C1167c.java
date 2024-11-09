package color.support.design.widget.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.color.support.util.C1338c;
import com.color.support.util.C1341f;

/* compiled from: ColorBlur.java */
/* renamed from: color.support.design.widget.blur.c */
/* loaded from: classes.dex */
public final class C1167c implements InterfaceC1170f {

    /* renamed from: a */
    private InterfaceC1170f f4740a;

    public C1167c(Context context, C1168d c1168d) {
        if (C1341f.m4383a() < 11 || Build.VERSION.SDK_INT < 26 || C1338c.m4376a(context)) {
            return;
        }
        this.f4740a = new C1172h(context, c1168d);
    }

    @Override // color.support.design.widget.blur.InterfaceC1170f
    /* renamed from: a */
    public final Bitmap mo3871a(Bitmap bitmap, boolean z, int i) {
        if (this.f4740a != null) {
            return this.f4740a.mo3871a(bitmap, z, i);
        }
        return null;
    }

    @Override // color.support.design.widget.blur.InterfaceC1170f
    /* renamed from: a */
    public final void mo3870a() {
        if (this.f4740a != null) {
            this.f4740a.mo3870a();
        }
    }
}
