package com.color.support.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.oppo.util.ColorOSHapticFeedbackUtils;
import neton.client.Utils.ResponseCode;

/* compiled from: ColorNumberPicker.java */
/* renamed from: com.color.support.widget.cl */
/* loaded from: classes.dex */
final class HandlerC1424cl extends Handler {

    /* renamed from: a */
    final /* synthetic */ ColorNumberPicker f7031a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1424cl(ColorNumberPicker colorNumberPicker, Looper looper) {
        super(looper);
        this.f7031a = colorNumberPicker;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        SparseArray sparseArray;
        String str;
        String str2;
        switch (message.what) {
            case 0:
                r0.f6285U.m4403b(r0.getContext(), this.f7031a.f6291ac);
                ColorOSHapticFeedbackUtils.performHapticFeedback(this.f7031a, ResponseCode.CODE_3XX_FOUND, 0);
                break;
            case 1:
                sparseArray = this.f7031a.f6318e;
                String str3 = (String) sparseArray.get(((Integer) message.obj).intValue());
                if (!TextUtils.isEmpty(str3)) {
                    str = this.f7031a.f6309au;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        str2 = this.f7031a.f6309au;
                        sb.append(str2);
                        str3 = sb.toString();
                    }
                    this.f7031a.announceForAccessibility(str3);
                    break;
                } else {
                    return;
                }
        }
        super.handleMessage(message);
    }
}
