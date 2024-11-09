package androidx.appcompat.view.menu;

import android.os.SystemClock;
import android.view.MenuItem;
import androidx.appcompat.widget.InterfaceC0237cb;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CascadingMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public final class C0162i implements InterfaceC0237cb {

    /* renamed from: a */
    final /* synthetic */ ViewOnKeyListenerC0159f f650a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0162i(ViewOnKeyListenerC0159f viewOnKeyListenerC0159f) {
        this.f650a = viewOnKeyListenerC0159f;
    }

    @Override // androidx.appcompat.widget.InterfaceC0237cb
    /* renamed from: a */
    public final void mo426a(C0168o c0168o, MenuItem menuItem) {
        this.f650a.f623a.removeCallbacksAndMessages(c0168o);
    }

    @Override // androidx.appcompat.widget.InterfaceC0237cb
    /* renamed from: b */
    public final void mo427b(C0168o c0168o, MenuItem menuItem) {
        this.f650a.f623a.removeCallbacksAndMessages(null);
        int size = this.f650a.f624b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c0168o == this.f650a.f624b.get(i).f656b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        this.f650a.f623a.postAtTime(new RunnableC0163j(this, i2 < this.f650a.f624b.size() ? this.f650a.f624b.get(i2) : null, menuItem, c0168o), c0168o, SystemClock.uptimeMillis() + 200);
    }
}
