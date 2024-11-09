package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.core.p024g.C0522g;
import androidx.core.p024g.InterfaceC0523h;

/* compiled from: AppCompatDialog.java */
/* renamed from: androidx.appcompat.app.am */
/* loaded from: classes.dex */
public class DialogC0072am extends Dialog implements InterfaceC0103r {

    /* renamed from: a */
    private AbstractC0104s f210a;

    /* renamed from: b */
    private final InterfaceC0523h f211b;

    public DialogC0072am(Context context, int i) {
        super(context, m183a(context, i));
        this.f211b = new C0073an(this);
        AbstractC0104s m184a = m184a();
        m184a.mo99a(m183a(context, i));
        m184a.mo114c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m184a().mo129k();
        super.onCreate(bundle);
        m184a().mo114c();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m184a().mo115c(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m184a().mo102a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m184a().mo103a(view, layoutParams);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m184a().mo111b(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m184a().mo106a(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m184a().mo106a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m184a().mo112b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        m184a().mo120f();
    }

    /* renamed from: b */
    public final boolean m186b() {
        return m184a().mo117d(1);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m184a().mo127i();
    }

    /* renamed from: a */
    private AbstractC0104s m184a() {
        if (this.f210a == null) {
            this.f210a = AbstractC0104s.m245a(this, this);
        }
        return this.f210a;
    }

    /* renamed from: a */
    private static int m183a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public final boolean m185a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0522g.m1782a(this.f211b, getWindow().getDecorView(), this, keyEvent);
    }
}
