package color.support.p043v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowManager;
import color.support.p043v7.appcompat.R;

/* compiled from: ColorPopupWindow.java */
/* renamed from: color.support.v7.widget.v */
/* loaded from: classes.dex */
public final class C1301v extends C1296q {

    /* renamed from: a */
    private InterfaceC1303x f5552a;

    /* renamed from: b */
    private InterfaceC1302w f5553b;

    /* renamed from: c */
    private boolean f5554c;

    public C1301v(Context context) {
        this(context, (byte) 0);
    }

    private C1301v(Context context, byte b) {
        this(context, R.attr.popupWindowStyle);
    }

    private C1301v(Context context, int i) {
        this(context, null, i, 0);
    }

    public C1301v(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5552a = null;
        this.f5553b = null;
        this.f5554c = false;
    }

    public C1301v() {
        this((byte) 0);
    }

    private C1301v(byte b) {
        this((char) 0);
    }

    private C1301v(char c) {
        super((char) 0);
        this.f5552a = null;
        this.f5553b = null;
        this.f5554c = false;
    }

    @Override // color.support.p043v7.widget.C1296q, android.widget.PopupWindow
    public final void dismiss() {
        if (this.f5554c) {
            return;
        }
        this.f5554c = true;
        if (this.f5553b != null) {
            this.f5553b.mo4107a(this);
        } else {
            m4282b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // color.support.p043v7.widget.C1296q
    /* renamed from: a */
    public final void mo4278a(WindowManager.LayoutParams layoutParams) {
        if (this.f5552a != null) {
            this.f5552a.mo4106a(layoutParams);
        }
        super.mo4278a(layoutParams);
    }

    /* renamed from: a */
    public final void m4281a(InterfaceC1303x interfaceC1303x) {
        this.f5552a = interfaceC1303x;
    }

    /* renamed from: a */
    public final void m4280a(InterfaceC1302w interfaceC1302w) {
        this.f5553b = interfaceC1302w;
    }

    /* renamed from: b */
    public final void m4282b() {
        super.dismiss();
        this.f5554c = false;
        if (this.f5553b != null) {
            this.f5553b.mo4109i();
        }
    }
}
