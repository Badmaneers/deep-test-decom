package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.R;
import androidx.core.p024g.InterfaceC0537v;
import androidx.core.widget.C0577o;
import androidx.core.widget.InterfaceC0566d;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC0537v, InterfaceC0566d {

    /* renamed from: a */
    private final C0190ai f857a;

    /* renamed from: b */
    private final C0211bc f858b;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0273dk.m940a(context), attributeSet, i);
        this.f857a = new C0190ai(this);
        this.f857a.m694a(attributeSet, i);
        this.f858b = new C0211bc(this);
        this.f858b.m773a(attributeSet, i);
        this.f858b.m777b();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f857a != null) {
            this.f857a.m691a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f857a != null) {
            this.f857a.m690a();
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f857a != null) {
            this.f857a.m692a(colorStateList);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f857a != null) {
            return this.f857a.m695b();
        }
        return null;
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f857a != null) {
            this.f857a.m693a(mode);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f857a != null) {
            return this.f857a.m696c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f857a != null) {
            this.f857a.m697d();
        }
        if (this.f858b != null) {
            this.f858b.m777b();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f858b != null) {
            this.f858b.m769a(context, i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f858b != null) {
            this.f858b.m778c();
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (f2511d) {
            super.setTextSize(i, f);
        } else if (this.f858b != null) {
            this.f858b.m767a(i, f);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f858b == null || f2511d || !this.f858b.m780e()) {
            return;
        }
        this.f858b.m779d();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f2511d) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f858b != null) {
            this.f858b.m766a(i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f2511d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f858b != null) {
            this.f858b.m768a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f2511d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f858b != null) {
            this.f858b.m776a(iArr, i);
        }
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (f2511d) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.f858b != null) {
            return this.f858b.m781f();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f2511d) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f858b != null) {
            return this.f858b.m782g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f2511d) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f858b != null) {
            return this.f858b.m783h();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f2511d) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f858b != null) {
            return this.f858b.m784i();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f2511d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f858b != null) {
            return this.f858b.m785j();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        if (this.f858b != null) {
            this.f858b.m775a(z);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0577o.m2046a(this, callback));
    }
}
