package color.support.p043v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.DialogInterfaceC0101p;
import color.support.p043v7.appcompat.R;

/* compiled from: AlertDialog.java */
/* renamed from: color.support.v7.app.m */
/* loaded from: classes.dex */
public class DialogInterfaceC1203m extends DialogInterfaceC0101p implements DialogInterface {

    /* renamed from: b */
    final AlertController f4992b;

    public DialogInterfaceC1203m(Context context) {
        this(context, 0);
    }

    public DialogInterfaceC1203m(Context context, int i) {
        super(context, m4000b(context, i));
        this.f4992b = new ColorAlertController(getContext(), this, getWindow());
    }

    /* renamed from: b */
    public static int m4000b(Context context, int i) {
        if (((i >>> 24) & 255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAlertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0101p
    /* renamed from: a */
    public final ListView mo233a() {
        return this.f4992b.f4873e;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0101p, androidx.appcompat.app.DialogC0072am, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f4992b.m3959a(charSequence);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0101p
    /* renamed from: a */
    public final void mo234a(View view) {
        this.f4992b.m3962b(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0101p
    /* renamed from: a */
    public final void mo235a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f4992b.m3954a(-1, charSequence, onClickListener, (Message) null, (Drawable) null);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0101p, androidx.appcompat.app.DialogC0072am, android.app.Dialog
    public void onCreate(Bundle bundle) {
        this.f4992b.m3952a();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0101p, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f4992b;
        if (alertController.f4883o != null && alertController.f4883o.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0101p, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f4992b;
        if (alertController.f4883o != null && alertController.f4883o.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
