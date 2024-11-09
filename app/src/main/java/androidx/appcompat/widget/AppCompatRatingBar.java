package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a */
    private final C0197ap f877a;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f877a = new C0197ap(this);
        this.f877a.mo736a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap m735a = this.f877a.m735a();
        if (m735a != null) {
            setMeasuredDimension(View.resolveSizeAndState(m735a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
