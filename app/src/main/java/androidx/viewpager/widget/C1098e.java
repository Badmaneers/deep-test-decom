package androidx.viewpager.widget;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

/* compiled from: PagerTitleStrip.java */
/* renamed from: androidx.viewpager.widget.e */
/* loaded from: classes.dex */
final class C1098e extends SingleLineTransformationMethod {

    /* renamed from: a */
    private Locale f4471a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1098e(Context context) {
        this.f4471a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        CharSequence transformation = super.getTransformation(charSequence, view);
        if (transformation != null) {
            return transformation.toString().toUpperCase(this.f4471a);
        }
        return null;
    }
}
