package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.R;
import androidx.recyclerview.widget.RecyclerView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* renamed from: a */
    private int f3323a;

    /* renamed from: b */
    private int f3324b;

    public PreferenceImageView(Context context) {
        this(context, null);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3323a = Integer.MAX_VALUE;
        this.f3324b = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PreferenceImageView, i, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.PreferenceImageView_maxWidth, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.PreferenceImageView_maxHeight, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i) {
        this.f3323a = i;
        super.setMaxWidth(i);
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f3323a;
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i) {
        this.f3324b = i;
        super.setMaxHeight(i);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f3324b;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i = View.MeasureSpec.makeMeasureSpec(maxWidth, RecyclerView.UNDEFINED_DURATION);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i2);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(maxHeight, RecyclerView.UNDEFINED_DURATION);
            }
        }
        super.onMeasure(i, i2);
    }
}
