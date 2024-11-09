package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: AppCompatHintHelper.java */
/* renamed from: androidx.appcompat.widget.am */
/* loaded from: classes.dex */
final class C0194am {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InputConnection m723a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof InterfaceC0296eg) {
                    editorInfo.hintText = ((InterfaceC0296eg) parent).m989a();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }
}
