package com.google.android.material.button;

/* compiled from: MaterialButtonToggleGroup.java */
/* renamed from: com.google.android.material.button.i */
/* loaded from: classes.dex */
final class C2106i implements InterfaceC2099b {

    /* renamed from: a */
    final /* synthetic */ MaterialButtonToggleGroup f9366a;

    private C2106i(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f9366a = materialButtonToggleGroup;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2106i(MaterialButtonToggleGroup materialButtonToggleGroup, byte b) {
        this(materialButtonToggleGroup);
    }

    @Override // com.google.android.material.button.InterfaceC2099b
    /* renamed from: a */
    public final void mo6527a(MaterialButton materialButton) {
        MaterialButtonToggleGroup.m6516a(this.f9366a, materialButton.getId(), materialButton.isChecked());
        this.f9366a.invalidate();
    }
}
