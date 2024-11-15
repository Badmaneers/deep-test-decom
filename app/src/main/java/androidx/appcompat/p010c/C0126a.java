package androidx.appcompat.p010c;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* compiled from: AllCapsTransformationMethod.java */
/* renamed from: androidx.appcompat.c.a */
/* loaded from: classes.dex */
public final class C0126a implements TransformationMethod {

    /* renamed from: a */
    private Locale f440a;

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public C0126a(Context context) {
        this.f440a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f440a);
        }
        return null;
    }
}
