package com.google.android.material.textfield;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.p025a.C0482c;
import com.coloros.neton.BuildConfig;

/* compiled from: TextInputLayout.java */
/* renamed from: com.google.android.material.textfield.ak */
/* loaded from: classes.dex */
public class C2373ak extends C0479a {

    /* renamed from: a */
    private final TextInputLayout f10537a;

    public C2373ak(TextInputLayout textInputLayout) {
        this.f10537a = textInputLayout;
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public void mo1626a(View view, C0482c c0482c) {
        super.mo1626a(view, c0482c);
        EditText editText = this.f10537a.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = this.f10537a.getHint();
        CharSequence helperText = this.f10537a.getHelperText();
        CharSequence error = this.f10537a.getError();
        int counterMaxLength = this.f10537a.getCounterMaxLength();
        CharSequence counterOverflowDescription = this.f10537a.getCounterOverflowDescription();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        boolean z3 = !TextUtils.isEmpty(helperText);
        boolean z4 = !TextUtils.isEmpty(error);
        boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
        String charSequence = z2 ? hint.toString() : BuildConfig.FLAVOR;
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : BuildConfig.FLAVOR);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        if (z4) {
            helperText = error;
        } else if (!z3) {
            helperText = BuildConfig.FLAVOR;
        }
        sb3.append((Object) helperText);
        String sb4 = sb3.toString();
        if (z) {
            c0482c.m1668c(text);
        } else if (!TextUtils.isEmpty(sb4)) {
            c0482c.m1668c(sb4);
        }
        if (!TextUtils.isEmpty(sb4)) {
            if (Build.VERSION.SDK_INT >= 26) {
                c0482c.m1678f(sb4);
            } else {
                if (z) {
                    sb4 = ((Object) text) + ", " + sb4;
                }
                c0482c.m1668c(sb4);
            }
            c0482c.m1696m(z ? false : true);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        c0482c.m1665c(counterMaxLength);
        if (z5) {
            if (z4) {
                counterOverflowDescription = error;
            }
            c0482c.m1681g(counterOverflowDescription);
        }
    }
}
