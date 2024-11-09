package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC0222bn {

    /* renamed from: a */
    private InterfaceC0223bo f906a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.InterfaceC0222bn
    public void setOnFitSystemWindowsListener(InterfaceC0223bo interfaceC0223bo) {
        this.f906a = interfaceC0223bo;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.f906a != null) {
            this.f906a.mo251a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
