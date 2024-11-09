package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.graphics.C0552e;
import androidx.core.p022e.C0458e;
import androidx.core.p022e.C0459f;
import androidx.core.p024g.InterfaceC0537v;
import androidx.core.widget.C0577o;
import androidx.core.widget.InterfaceC0566d;
import androidx.core.widget.InterfaceC0580r;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC0537v, InterfaceC0566d, InterfaceC0580r {

    /* renamed from: a */
    private final C0190ai f889a;

    /* renamed from: b */
    private final C0211bc f890b;

    /* renamed from: c */
    private final C0210bb f891c;

    /* renamed from: e */
    private Future<C0458e> f892e;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0273dk.m940a(context), attributeSet, i);
        this.f889a = new C0190ai(this);
        this.f889a.m694a(attributeSet, i);
        this.f890b = new C0211bc(this);
        this.f890b.m773a(attributeSet, i);
        this.f890b.m777b();
        this.f891c = new C0210bb(this);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f889a != null) {
            this.f889a.m691a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f889a != null) {
            this.f889a.m690a();
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f889a != null) {
            this.f889a.m692a(colorStateList);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f889a != null) {
            return this.f889a.m695b();
        }
        return null;
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f889a != null) {
            this.f889a.m693a(mode);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f889a != null) {
            return this.f889a.m696c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f890b != null) {
            this.f890b.m769a(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f889a != null) {
            this.f889a.m697d();
        }
        if (this.f890b != null) {
            this.f890b.m777b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f890b != null) {
            this.f890b.m778c();
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (f2511d) {
            super.setTextSize(i, f);
        } else if (this.f890b != null) {
            this.f890b.m767a(i, f);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f890b == null || f2511d || !this.f890b.m780e()) {
            return;
        }
        this.f890b.m779d();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f2511d) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f890b != null) {
            this.f890b.m766a(i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f2511d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f890b != null) {
            this.f890b.m768a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f2511d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f890b != null) {
            this.f890b.m776a(iArr, i);
        }
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (f2511d) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.f890b != null) {
            return this.f890b.m781f();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f2511d) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f890b != null) {
            return this.f890b.m782g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f2511d) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f890b != null) {
            return this.f890b.m783h();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f2511d) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f890b != null) {
            return this.f890b.m784i();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f2511d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f890b != null) {
            return this.f890b.m785j();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0194am.m723a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0577o.m2051b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0577o.m2054c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C0577o.m2055d(this, i);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0577o.m2046a(this, callback));
    }

    public C0459f getTextMetricsParamsCompat() {
        return C0577o.m2053c(this);
    }

    public void setPrecomputedText(C0458e c0458e) {
        C0577o.m2050a(this, c0458e);
    }

    /* renamed from: a */
    private void m578a() {
        if (this.f892e != null) {
            try {
                Future<C0458e> future = this.f892e;
                this.f892e = null;
                C0577o.m2050a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m578a();
        return super.getText();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        if (Build.VERSION.SDK_INT >= 28 || this.f891c == null) {
            super.setTextClassifier(textClassifier);
        } else {
            this.f891c.m760a(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        if (Build.VERSION.SDK_INT >= 28 || this.f891c == null) {
            return super.getTextClassifier();
        }
        return this.f891c.m759a();
    }

    public void setTextFuture(Future<C0458e> future) {
        this.f892e = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m578a();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        if (this.f890b != null) {
            this.f890b.m765a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        if (this.f890b != null) {
            this.f890b.m765a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        if (this.f890b != null) {
            this.f890b.m765a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C0057a.m46b(context, i) : null, i2 != 0 ? C0057a.m46b(context, i2) : null, i3 != 0 ? C0057a.m46b(context, i3) : null, i4 != 0 ? C0057a.m46b(context, i4) : null);
        if (this.f890b != null) {
            this.f890b.m765a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        if (this.f890b != null) {
            this.f890b.m765a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C0057a.m46b(context, i) : null, i2 != 0 ? C0057a.m46b(context, i2) : null, i3 != 0 ? C0057a.m46b(context, i3) : null, i4 != 0 ? C0057a.m46b(context, i4) : null);
        if (this.f890b != null) {
            this.f890b.m765a();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f890b.m786k();
    }

    @Override // androidx.core.widget.InterfaceC0580r
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f890b.m770a(colorStateList);
        this.f890b.m777b();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f890b.m787l();
    }

    @Override // androidx.core.widget.InterfaceC0580r
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f890b.m771a(mode);
        this.f890b.m777b();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface m1943a = (typeface == null || i <= 0) ? null : C0552e.m1943a(getContext(), typeface, i);
        if (m1943a != null) {
            typeface = m1943a;
        }
        super.setTypeface(typeface, i);
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public void setTextMetricsParamsCompat(C0459f c0459f) {
        int i;
        if (Build.VERSION.SDK_INT >= 18) {
            TextDirectionHeuristic m1599b = c0459f.m1599b();
            if (m1599b != TextDirectionHeuristics.FIRSTSTRONG_RTL && m1599b != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                if (m1599b == TextDirectionHeuristics.ANYRTL_LTR) {
                    i = 2;
                } else if (m1599b == TextDirectionHeuristics.LTR) {
                    i = 3;
                } else if (m1599b == TextDirectionHeuristics.RTL) {
                    i = 4;
                } else if (m1599b == TextDirectionHeuristics.LOCALE) {
                    i = 5;
                } else if (m1599b == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    i = 6;
                } else if (m1599b == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    i = 7;
                }
                setTextDirection(i);
            }
            i = 1;
            setTextDirection(i);
        }
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = c0459f.m1597a().getTextScaleX();
            getPaint().set(c0459f.m1597a());
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(c0459f.m1597a());
        setBreakStrategy(c0459f.m1600c());
        setHyphenationFrequency(c0459f.m1601d());
    }
}
