package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.core.widget.C0576n;

/* compiled from: AppCompatPopupWindow.java */
/* renamed from: androidx.appcompat.widget.ao */
/* loaded from: classes.dex */
final class C0196ao extends PopupWindow {

    /* renamed from: a */
    private static final boolean f1130a;

    /* renamed from: b */
    private boolean f1131b;

    static {
        f1130a = Build.VERSION.SDK_INT < 21;
    }

    public C0196ao(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C0276dn m944a = C0276dn.m944a(context, attributeSet, R.styleable.PopupWindow, i, i2);
        if (m944a.m964i(R.styleable.PopupWindow_overlapAnchor)) {
            boolean m949a = m944a.m949a(R.styleable.PopupWindow_overlapAnchor, false);
            if (f1130a) {
                this.f1131b = m949a;
            } else {
                C0576n.m2043a(this, m949a);
            }
        }
        setBackgroundDrawable(m944a.m948a(R.styleable.PopupWindow_android_popupBackground));
        m944a.m952b();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        if (f1130a && this.f1131b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1130a && this.f1131b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        if (f1130a && this.f1131b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
