package color.support.design.widget;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.p028d.p029a.p030a.C0596a;
import androidx.p028d.p029a.p030a.C0597b;
import androidx.p028d.p029a.p030a.C0598c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimationUtils.java */
/* renamed from: color.support.design.widget.a */
/* loaded from: classes.dex */
public final class C1163a {

    /* renamed from: a */
    static final Interpolator f4715a = new LinearInterpolator();

    /* renamed from: b */
    static final Interpolator f4716b = new C0597b();

    /* renamed from: c */
    static final Interpolator f4717c = new C0596a();

    /* renamed from: d */
    static final Interpolator f4718d = new C0598c();

    /* renamed from: e */
    static final Interpolator f4719e = new DecelerateInterpolator();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m3866a(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
