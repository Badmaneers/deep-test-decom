package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton {

    /* renamed from: a */
    private final C0211bc f893a;

    public AppCompatToggleButton(Context context) {
        this(context, null);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f893a = new C0211bc(this);
        this.f893a.m773a(attributeSet, i);
    }
}
