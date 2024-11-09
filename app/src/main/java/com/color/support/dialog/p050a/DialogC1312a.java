package com.color.support.dialog.p050a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import color.support.p043v7.appcompat.R;

/* compiled from: ColorRotatingSpinnerDialog.java */
/* renamed from: com.color.support.dialog.a.a */
/* loaded from: classes.dex */
public final class DialogC1312a extends DialogC1317f {

    /* renamed from: g */
    private boolean f5562g;

    /* renamed from: h */
    private DialogInterface.OnCancelListener f5563h;

    /* renamed from: i */
    private LinearLayout f5564i;

    /* renamed from: j */
    private ViewGroup f5565j;

    /* renamed from: k */
    private TextView f5566k;

    /* renamed from: l */
    private boolean f5567l;

    public DialogC1312a(Context context) {
        super(context);
        this.f5562g = false;
        this.f5567l = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.color.support.dialog.p050a.DialogC1317f, color.support.p043v7.app.DialogInterfaceC1203m, androidx.appcompat.app.DialogInterfaceC0101p, androidx.appcompat.app.DialogC0072am, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.color_progress_dialog_rotating, (ViewGroup) null);
        this.f5564i = (LinearLayout) inflate.findViewById(R.id.body);
        Resources resources = getContext().getResources();
        if (this.f5562g) {
            this.f5564i.setPadding(0, resources.getDimensionPixelSize(R.dimen.color_loading_dialog_padding_top), 0, resources.getDimensionPixelSize(R.dimen.color_loading_cancelable_dialog_padding_bottom));
        } else {
            this.f5564i.setPadding(0, resources.getDimensionPixelSize(R.dimen.color_loading_dialog_padding_top), 0, resources.getDimensionPixelSize(R.dimen.color_loading_dialog_padding_bottom));
        }
        mo234a(inflate);
        if (this.f5562g) {
            mo235a(getContext().getString(android.R.string.cancel), new DialogInterfaceOnClickListenerC1313b(this));
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        if (this.f5565j == null) {
            this.f5565j = (ViewGroup) findViewById(R.id.parentPanel);
        }
        if (this.f5565j != null) {
            ViewGroup.LayoutParams layoutParams = this.f5565j.getLayoutParams();
            layoutParams.width = -2;
            this.f5565j.setLayoutParams(layoutParams);
            this.f5565j.setMinimumWidth(getContext().getResources().getDimensionPixelSize(R.dimen.color_loading_dialog_min_width) + this.f5565j.getPaddingLeft() + this.f5565j.getPaddingRight());
            this.f5565j.setOnClickListener(new ViewOnClickListenerC1314c(this));
            FrameLayout frameLayout = (FrameLayout) this.f5565j.getParent();
            if (frameLayout != null) {
                frameLayout.setOnClickListener(new ViewOnClickListenerC1315d(this));
            }
        }
        if (this.f5566k == null) {
            this.f5566k = (TextView) findViewById(R.id.alertTitle);
        }
        if (this.f5566k != null) {
            this.f5566k.setOnClickListener(new ViewOnClickListenerC1316e(this));
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.f5567l = z;
    }
}
