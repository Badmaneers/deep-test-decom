package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC0222bn {

    /* renamed from: a */
    private InterfaceC0223bo f905a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.InterfaceC0222bn
    public void setOnFitSystemWindowsListener(InterfaceC0223bo interfaceC0223bo) {
        this.f905a = interfaceC0223bo;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.f905a != null) {
            this.f905a.mo251a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
