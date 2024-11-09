package androidx.preference;

import android.widget.SeekBar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeekBarPreference.java */
/* renamed from: androidx.preference.t */
/* loaded from: classes.dex */
public final class C0814t implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ SeekBarPreference f3335a;

    public C0814t(SeekBarPreference seekBarPreference) {
        this.f3335a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z && (this.f3335a.f3296f || !this.f3335a.f3293c)) {
            this.f3335a.m2724a(seekBar);
        } else {
            SeekBarPreference seekBarPreference = this.f3335a;
            seekBarPreference.m2725b(i + seekBarPreference.f3292b);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f3335a.f3293c = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f3335a.f3293c = false;
        if (seekBar.getProgress() + this.f3335a.f3292b != this.f3335a.f3291a) {
            this.f3335a.m2724a(seekBar);
        }
    }
}
