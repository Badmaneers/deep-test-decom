package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.InterfaceC0548c;

/* compiled from: AppCompatProgressBarHelper.java */
/* renamed from: androidx.appcompat.widget.ap */
/* loaded from: classes.dex */
class C0197ap {

    /* renamed from: a */
    private static final int[] f1132a = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: b */
    private final ProgressBar f1133b;

    /* renamed from: c */
    private Bitmap f1134c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0197ap(ProgressBar progressBar) {
        this.f1133b = progressBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo736a(AttributeSet attributeSet, int i) {
        C0276dn m944a = C0276dn.m944a(this.f1133b.getContext(), attributeSet, f1132a, i, 0);
        Drawable m951b = m944a.m951b(0);
        if (m951b != null) {
            ProgressBar progressBar = this.f1133b;
            if (m951b instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) m951b;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable m734a = m734a(animationDrawable.getFrame(i2), true);
                    m734a.setLevel(10000);
                    animationDrawable2.addFrame(m734a, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                m951b = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(m951b);
        }
        Drawable m951b2 = m944a.m951b(1);
        if (m951b2 != null) {
            this.f1133b.setProgressDrawable(m734a(m951b2, false));
        }
        m944a.m952b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private Drawable m734a(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0548c) {
            InterfaceC0548c interfaceC0548c = (InterfaceC0548c) drawable;
            Drawable mo1936a = interfaceC0548c.mo1936a();
            if (mo1936a != null) {
                interfaceC0548c.mo1937a(m734a(mo1936a, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m734a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1134c == null) {
                    this.f1134c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bitmap m735a() {
        return this.f1134c;
    }
}
