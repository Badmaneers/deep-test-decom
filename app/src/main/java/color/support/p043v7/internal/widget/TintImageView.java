package color.support.p043v7.internal.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C0276dn;

/* loaded from: classes.dex */
public class TintImageView extends AppCompatImageView {

    /* renamed from: a */
    private static final int[] f5203a = {R.attr.background, R.attr.src};

    /* renamed from: b */
    private final C1233ap f5204b;

    public TintImageView(Context context) {
        this(context, null);
    }

    public TintImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TintImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0276dn m944a = C0276dn.m944a(getContext(), attributeSet, f5203a, i, 0);
        if (m944a.m945a() > 0) {
            if (m944a.m964i(0)) {
                setBackgroundDrawable(m944a.m948a(0));
            }
            if (m944a.m964i(1)) {
                setImageDrawable(m944a.m948a(1));
            }
        }
        m944a.m952b();
        this.f5204b = C1233ap.m4077a(context);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        setImageDrawable(this.f5204b.m4078a(i));
    }
}
