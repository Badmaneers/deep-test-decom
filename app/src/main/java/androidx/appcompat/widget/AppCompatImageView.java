package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.p024g.InterfaceC0537v;
import androidx.core.widget.InterfaceC0581s;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements InterfaceC0537v, InterfaceC0581s {

    /* renamed from: a */
    private final C0190ai f869a;

    /* renamed from: b */
    private final C0195an f870b;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C0273dk.m940a(context), attributeSet, i);
        this.f869a = new C0190ai(this);
        this.f869a.m694a(attributeSet, i);
        this.f870b = new C0195an(this);
        this.f870b.m729a(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f870b != null) {
            this.f870b.m726a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f870b != null) {
            this.f870b.m733d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f870b != null) {
            this.f870b.m733d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f870b != null) {
            this.f870b.m733d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f869a != null) {
            this.f869a.m691a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f869a != null) {
            this.f869a.m690a();
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f869a != null) {
            this.f869a.m692a(colorStateList);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f869a != null) {
            return this.f869a.m695b();
        }
        return null;
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f869a != null) {
            this.f869a.m693a(mode);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f869a != null) {
            return this.f869a.m696c();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0581s
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f870b != null) {
            this.f870b.m727a(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0581s
    public ColorStateList getSupportImageTintList() {
        if (this.f870b != null) {
            return this.f870b.m731b();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0581s
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f870b != null) {
            this.f870b.m728a(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0581s
    public PorterDuff.Mode getSupportImageTintMode() {
        if (this.f870b != null) {
            return this.f870b.m732c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f869a != null) {
            this.f869a.m697d();
        }
        if (this.f870b != null) {
            this.f870b.m733d();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f870b.m730a() && super.hasOverlappingRendering();
    }
}
