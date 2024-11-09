package androidx.preference;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownPreference.java */
/* renamed from: androidx.preference.b */
/* loaded from: classes.dex */
public final class C0797b implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ DropDownPreference f3319a;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0797b(DropDownPreference dropDownPreference) {
        this.f3319a = dropDownPreference;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i >= 0) {
            String charSequence = this.f3319a.m2701e()[i].toString();
            if (charSequence.equals(this.f3319a.m2703g()) || !this.f3319a.m2720o()) {
                return;
            }
            this.f3319a.m2699a(charSequence);
        }
    }
}
