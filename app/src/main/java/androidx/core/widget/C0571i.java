package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.widget.ImageView;

/* compiled from: ImageViewCompat.java */
/* renamed from: androidx.core.widget.i */
/* loaded from: classes.dex */
public final class C0571i {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static ColorStateList m2039a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof InterfaceC0581s) {
            return ((InterfaceC0581s) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static PorterDuff.Mode m2040b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof InterfaceC0581s) {
            return ((InterfaceC0581s) imageView).getSupportImageTintMode();
        }
        return null;
    }
}
