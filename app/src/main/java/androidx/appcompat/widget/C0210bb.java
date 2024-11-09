package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.p023f.C0478i;

/* compiled from: AppCompatTextClassifierHelper.java */
/* renamed from: androidx.appcompat.widget.bb */
/* loaded from: classes.dex */
final class C0210bb {

    /* renamed from: a */
    private TextView f1163a;

    /* renamed from: b */
    private TextClassifier f1164b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0210bb(TextView textView) {
        this.f1163a = (TextView) C0478i.m1620a(textView);
    }

    /* renamed from: a */
    public final void m760a(TextClassifier textClassifier) {
        this.f1164b = textClassifier;
    }

    /* renamed from: a */
    public final TextClassifier m759a() {
        if (this.f1164b == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1163a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
        return this.f1164b;
    }
}
