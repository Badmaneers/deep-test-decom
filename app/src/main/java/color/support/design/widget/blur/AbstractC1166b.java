package color.support.design.widget.blur;

import android.os.AsyncTask;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: ColorBaseColorBlurEngine.java */
/* renamed from: color.support.design.widget.blur.b */
/* loaded from: classes.dex */
abstract class AbstractC1166b implements InterfaceC1170f {

    /* renamed from: a */
    final List<AsyncTask> f4738a = new LinkedList();

    /* renamed from: b */
    final C1168d f4739b;

    public AbstractC1166b(C1168d c1168d) {
        this.f4739b = c1168d;
    }

    @Override // color.support.design.widget.blur.InterfaceC1170f
    /* renamed from: a */
    public void mo3870a() {
        Iterator<AsyncTask> it = this.f4738a.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
        this.f4738a.clear();
    }
}
