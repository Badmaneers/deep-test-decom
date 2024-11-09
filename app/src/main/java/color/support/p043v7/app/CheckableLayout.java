package color.support.p043v7.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.Checkable;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class CheckableLayout extends RelativeLayout implements Checkable {

    /* renamed from: a */
    private Checkable f4898a;

    public CheckableLayout(Context context) {
        super(context);
    }

    public CheckableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                KeyEvent.Callback childAt = getChildAt(i);
                if (childAt instanceof Checkable) {
                    this.f4898a = (Checkable) childAt;
                    return;
                }
            }
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f4898a != null) {
            this.f4898a.setChecked(z);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4898a != null && this.f4898a.isChecked();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (this.f4898a != null) {
            this.f4898a.toggle();
        }
    }
}
