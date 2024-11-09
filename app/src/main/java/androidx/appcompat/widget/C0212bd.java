package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import androidx.core.content.p020a.AbstractC0432l;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextHelper.java */
/* renamed from: androidx.appcompat.widget.bd */
/* loaded from: classes.dex */
public final class C0212bd extends AbstractC0432l {

    /* renamed from: a */
    private final WeakReference<C0211bc> f1178a;

    /* renamed from: b */
    private final int f1179b;

    /* renamed from: c */
    private final int f1180c;

    @Override // androidx.core.content.p020a.AbstractC0432l
    /* renamed from: a */
    public final void mo788a(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0212bd(C0211bc c0211bc, int i, int i2) {
        this.f1178a = new WeakReference<>(c0211bc);
        this.f1179b = i;
        this.f1180c = i2;
    }

    @Override // androidx.core.content.p020a.AbstractC0432l
    /* renamed from: a */
    public final void mo789a(Typeface typeface) {
        C0211bc c0211bc = this.f1178a.get();
        if (c0211bc == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.f1179b != -1) {
            typeface = Typeface.create(typeface, this.f1179b, (this.f1180c & 2) != 0);
        }
        c0211bc.m774a(new RunnableC0213be(this, this.f1178a, typeface));
    }
}
