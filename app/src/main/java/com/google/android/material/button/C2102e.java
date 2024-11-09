package com.google.android.material.button;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialButtonToggleGroup.java */
/* renamed from: com.google.android.material.button.e */
/* loaded from: classes.dex */
public final class C2102e implements Comparator<MaterialButton> {

    /* renamed from: a */
    final /* synthetic */ MaterialButtonToggleGroup f9358a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2102e(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f9358a = materialButtonToggleGroup;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(MaterialButton materialButton, MaterialButton materialButton2) {
        MaterialButton materialButton3 = materialButton;
        MaterialButton materialButton4 = materialButton2;
        int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
        return compareTo2 != 0 ? compareTo2 : Integer.valueOf(this.f9358a.indexOfChild(materialButton3)).compareTo(Integer.valueOf(this.f9358a.indexOfChild(materialButton4)));
    }
}
