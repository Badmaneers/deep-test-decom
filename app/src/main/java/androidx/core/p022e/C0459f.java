package androidx.core.p022e;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.p023f.C0472c;

/* compiled from: PrecomputedTextCompat.java */
/* renamed from: androidx.core.e.f */
/* loaded from: classes.dex */
public final class C0459f {

    /* renamed from: a */
    final PrecomputedText.Params f2249a;

    /* renamed from: b */
    private final TextPaint f2250b;

    /* renamed from: c */
    private final TextDirectionHeuristic f2251c;

    /* renamed from: d */
    private final int f2252d;

    /* renamed from: e */
    private final int f2253e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public C0459f(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2249a = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        } else {
            this.f2249a = null;
        }
        this.f2250b = textPaint;
        this.f2251c = textDirectionHeuristic;
        this.f2252d = i;
        this.f2253e = i2;
    }

    public C0459f(PrecomputedText.Params params) {
        this.f2250b = params.getTextPaint();
        this.f2251c = params.getTextDirection();
        this.f2252d = params.getBreakStrategy();
        this.f2253e = params.getHyphenationFrequency();
        this.f2249a = Build.VERSION.SDK_INT < 29 ? null : params;
    }

    /* renamed from: a */
    public final TextPaint m1597a() {
        return this.f2250b;
    }

    /* renamed from: b */
    public final TextDirectionHeuristic m1599b() {
        return this.f2251c;
    }

    /* renamed from: c */
    public final int m1600c() {
        return this.f2252d;
    }

    /* renamed from: d */
    public final int m1601d() {
        return this.f2253e;
    }

    /* renamed from: a */
    public final boolean m1598a(C0459f c0459f) {
        if ((Build.VERSION.SDK_INT >= 23 && (this.f2252d != c0459f.f2252d || this.f2253e != c0459f.f2253e)) || this.f2250b.getTextSize() != c0459f.f2250b.getTextSize() || this.f2250b.getTextScaleX() != c0459f.f2250b.getTextScaleX() || this.f2250b.getTextSkewX() != c0459f.f2250b.getTextSkewX()) {
            return false;
        }
        if ((Build.VERSION.SDK_INT >= 21 && (this.f2250b.getLetterSpacing() != c0459f.f2250b.getLetterSpacing() || !TextUtils.equals(this.f2250b.getFontFeatureSettings(), c0459f.f2250b.getFontFeatureSettings()))) || this.f2250b.getFlags() != c0459f.f2250b.getFlags()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (!this.f2250b.getTextLocales().equals(c0459f.f2250b.getTextLocales())) {
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 17 && !this.f2250b.getTextLocale().equals(c0459f.f2250b.getTextLocale())) {
            return false;
        }
        return this.f2250b.getTypeface() == null ? c0459f.f2250b.getTypeface() == null : this.f2250b.getTypeface().equals(c0459f.f2250b.getTypeface());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0459f)) {
            return false;
        }
        C0459f c0459f = (C0459f) obj;
        if (m1598a(c0459f)) {
            return Build.VERSION.SDK_INT < 18 || this.f2251c == c0459f.f2251c;
        }
        return false;
    }

    public final int hashCode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0472c.m1614a(Float.valueOf(this.f2250b.getTextSize()), Float.valueOf(this.f2250b.getTextScaleX()), Float.valueOf(this.f2250b.getTextSkewX()), Float.valueOf(this.f2250b.getLetterSpacing()), Integer.valueOf(this.f2250b.getFlags()), this.f2250b.getTextLocales(), this.f2250b.getTypeface(), Boolean.valueOf(this.f2250b.isElegantTextHeight()), this.f2251c, Integer.valueOf(this.f2252d), Integer.valueOf(this.f2253e));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return C0472c.m1614a(Float.valueOf(this.f2250b.getTextSize()), Float.valueOf(this.f2250b.getTextScaleX()), Float.valueOf(this.f2250b.getTextSkewX()), Float.valueOf(this.f2250b.getLetterSpacing()), Integer.valueOf(this.f2250b.getFlags()), this.f2250b.getTextLocale(), this.f2250b.getTypeface(), Boolean.valueOf(this.f2250b.isElegantTextHeight()), this.f2251c, Integer.valueOf(this.f2252d), Integer.valueOf(this.f2253e));
        }
        if (Build.VERSION.SDK_INT >= 18) {
            return C0472c.m1614a(Float.valueOf(this.f2250b.getTextSize()), Float.valueOf(this.f2250b.getTextScaleX()), Float.valueOf(this.f2250b.getTextSkewX()), Integer.valueOf(this.f2250b.getFlags()), this.f2250b.getTextLocale(), this.f2250b.getTypeface(), this.f2251c, Integer.valueOf(this.f2252d), Integer.valueOf(this.f2253e));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return C0472c.m1614a(Float.valueOf(this.f2250b.getTextSize()), Float.valueOf(this.f2250b.getTextScaleX()), Float.valueOf(this.f2250b.getTextSkewX()), Integer.valueOf(this.f2250b.getFlags()), this.f2250b.getTextLocale(), this.f2250b.getTypeface(), this.f2251c, Integer.valueOf(this.f2252d), Integer.valueOf(this.f2253e));
        }
        return C0472c.m1614a(Float.valueOf(this.f2250b.getTextSize()), Float.valueOf(this.f2250b.getTextScaleX()), Float.valueOf(this.f2250b.getTextSkewX()), Integer.valueOf(this.f2250b.getFlags()), this.f2250b.getTypeface(), this.f2251c, Integer.valueOf(this.f2252d), Integer.valueOf(this.f2253e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("textSize=" + this.f2250b.getTextSize());
        sb.append(", textScaleX=" + this.f2250b.getTextScaleX());
        sb.append(", textSkewX=" + this.f2250b.getTextSkewX());
        if (Build.VERSION.SDK_INT >= 21) {
            sb.append(", letterSpacing=" + this.f2250b.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f2250b.isElegantTextHeight());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            sb.append(", textLocale=" + this.f2250b.getTextLocales());
        } else if (Build.VERSION.SDK_INT >= 17) {
            sb.append(", textLocale=" + this.f2250b.getTextLocale());
        }
        sb.append(", typeface=" + this.f2250b.getTypeface());
        if (Build.VERSION.SDK_INT >= 26) {
            sb.append(", variationSettings=" + this.f2250b.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f2251c);
        sb.append(", breakStrategy=" + this.f2252d);
        sb.append(", hyphenationFrequency=" + this.f2253e);
        sb.append("}");
        return sb.toString();
    }
}
