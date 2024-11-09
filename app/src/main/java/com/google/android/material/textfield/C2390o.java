package com.google.android.material.textfield;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import androidx.core.p024g.p025a.C0482c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.o */
/* loaded from: classes.dex */
public final class C2390o extends C2373ak {

    /* renamed from: a */
    final /* synthetic */ C2387l f10564a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2390o(C2387l c2387l, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f10564a = c2387l;
    }

    @Override // com.google.android.material.textfield.C2373ak, androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        super.mo1626a(view, c0482c);
        c0482c.m1660b((CharSequence) Spinner.class.getName());
        if (c0482c.m1708w()) {
            c0482c.m1678f((CharSequence) null);
        }
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: c */
    public final void mo1630c(View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityManager accessibilityManager;
        super.mo1630c(view, accessibilityEvent);
        AutoCompleteTextView m7634a = C2387l.m7634a(this.f10564a.f10573a.getEditText());
        if (accessibilityEvent.getEventType() == 1) {
            accessibilityManager = this.f10564a.f10558m;
            if (accessibilityManager.isTouchExplorationEnabled()) {
                C2387l.m7636a(this.f10564a, m7634a);
            }
        }
    }
}
