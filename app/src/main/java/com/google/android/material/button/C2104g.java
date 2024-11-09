package com.google.android.material.button;

/* compiled from: MaterialButtonToggleGroup.java */
/* renamed from: com.google.android.material.button.g */
/* loaded from: classes.dex */
final class C2104g implements InterfaceC2098a {

    /* renamed from: a */
    final /* synthetic */ MaterialButtonToggleGroup f9360a;

    private C2104g(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f9360a = materialButtonToggleGroup;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2104g(MaterialButtonToggleGroup materialButtonToggleGroup, byte b) {
        this(materialButtonToggleGroup);
    }

    @Override // com.google.android.material.button.InterfaceC2098a
    /* renamed from: a */
    public final void mo6526a(MaterialButton materialButton, boolean z) {
        if (MaterialButtonToggleGroup.m6518a(this.f9360a)) {
            return;
        }
        if (MaterialButtonToggleGroup.m6522b(this.f9360a)) {
            MaterialButtonToggleGroup.m6509a(this.f9360a, z ? materialButton.getId() : -1);
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f9360a;
        materialButton.getId();
        MaterialButtonToggleGroup.m6524c(materialButtonToggleGroup);
        MaterialButtonToggleGroup.m6516a(this.f9360a, materialButton.getId(), z);
        this.f9360a.invalidate();
    }
}
