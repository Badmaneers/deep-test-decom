package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.R;

/* compiled from: AlertDialog.java */
/* renamed from: androidx.appcompat.app.p */
/* loaded from: classes.dex */
public class DialogInterfaceC0101p extends DialogC0072am implements DialogInterface {

    /* renamed from: a */
    final AlertController f358a;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogInterfaceC0101p(Context context, int i) {
        super(context, m232a(context, i));
        this.f358a = new AlertController(getContext(), this, getWindow());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m232a(Context context, int i) {
        if (((i >>> 24) & 255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public ListView mo233a() {
        return this.f358a.f85b;
    }

    @Override // androidx.appcompat.app.DialogC0072am, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f358a.m59a(charSequence);
    }

    /* renamed from: a */
    public void mo234a(View view) {
        this.f358a.m61b(view);
    }

    /* renamed from: a */
    public void mo235a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f358a.m55a(-1, charSequence, onClickListener, (Message) null, (Drawable) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0072am, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f358a.m53a();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f358a;
        if (alertController.f92i != null && alertController.f92i.m2013a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f358a;
        if (alertController.f92i != null && alertController.f92i.m2013a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
