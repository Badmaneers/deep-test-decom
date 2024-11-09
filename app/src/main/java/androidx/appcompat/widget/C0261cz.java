package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* compiled from: SearchView.java */
/* renamed from: androidx.appcompat.widget.cz */
/* loaded from: classes.dex */
final class C0261cz {

    /* renamed from: a */
    private Method f1315a;

    /* renamed from: b */
    private Method f1316b;

    /* renamed from: c */
    private Method f1317c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0261cz() {
        try {
            this.f1315a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f1315a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            this.f1316b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f1316b.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            this.f1317c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.f1317c.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m912a(AutoCompleteTextView autoCompleteTextView) {
        if (this.f1315a != null) {
            try {
                this.f1315a.invoke(autoCompleteTextView, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m913b(AutoCompleteTextView autoCompleteTextView) {
        if (this.f1316b != null) {
            try {
                this.f1316b.invoke(autoCompleteTextView, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m914c(AutoCompleteTextView autoCompleteTextView) {
        if (this.f1317c != null) {
            try {
                this.f1317c.invoke(autoCompleteTextView, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }
}
