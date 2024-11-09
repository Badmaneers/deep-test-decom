package com.google.android.material.textfield;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.C0228bt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialAutoCompleteTextView.java */
/* renamed from: com.google.android.material.textfield.z */
/* loaded from: classes.dex */
public final class C2401z implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ MaterialAutoCompleteTextView f10603a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2401z(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        this.f10603a = materialAutoCompleteTextView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        C0228bt c0228bt;
        C0228bt c0228bt2;
        C0228bt c0228bt3;
        C0228bt c0228bt4;
        C0228bt c0228bt5;
        C0228bt c0228bt6;
        if (i < 0) {
            c0228bt6 = this.f10603a.f10432a;
            item = c0228bt6.m876r();
        } else {
            item = this.f10603a.getAdapter().getItem(i);
        }
        MaterialAutoCompleteTextView.m7552a(this.f10603a, item);
        AdapterView.OnItemClickListener onItemClickListener = this.f10603a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                c0228bt2 = this.f10603a.f10432a;
                view = c0228bt2.m879u();
                c0228bt3 = this.f10603a.f10432a;
                i = c0228bt3.m877s();
                c0228bt4 = this.f10603a.f10432a;
                j = c0228bt4.m878t();
            }
            View view2 = view;
            int i2 = i;
            long j2 = j;
            c0228bt5 = this.f10603a.f10432a;
            onItemClickListener.onItemClick(c0228bt5.mo394g(), view2, i2, j2);
        }
        c0228bt = this.f10603a.f10432a;
        c0228bt.mo392d();
    }
}
