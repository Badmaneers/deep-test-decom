package color.support.design.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0276dn;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public final class TabItem extends View {

    /* renamed from: a */
    final CharSequence f4712a;

    /* renamed from: b */
    final Drawable f4713b;

    /* renamed from: c */
    final int f4714c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0276dn m943a = C0276dn.m943a(context, attributeSet, R.styleable.ColorTabItem);
        this.f4712a = m943a.m954c(R.styleable.ColorTabItem_android_text);
        this.f4713b = m943a.m948a(R.styleable.ColorTabItem_android_icon);
        this.f4714c = m943a.m962g(R.styleable.ColorTabItem_android_layout, 0);
        m943a.m952b();
    }
}
