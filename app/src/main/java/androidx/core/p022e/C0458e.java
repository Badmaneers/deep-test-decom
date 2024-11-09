package androidx.core.p022e;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* compiled from: PrecomputedTextCompat.java */
/* renamed from: androidx.core.e.e */
/* loaded from: classes.dex */
public final class C0458e implements Spannable {

    /* renamed from: a */
    private static final Object f2244a = new Object();

    /* renamed from: b */
    private static Executor f2245b = null;

    /* renamed from: c */
    private final Spannable f2246c;

    /* renamed from: d */
    private final C0459f f2247d;

    /* renamed from: e */
    private final PrecomputedText f2248e;

    /* renamed from: a */
    public final PrecomputedText m1595a() {
        if (this.f2246c instanceof PrecomputedText) {
            return (PrecomputedText) this.f2246c;
        }
        return null;
    }

    /* renamed from: b */
    public final C0459f m1596b() {
        return this.f2247d;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2248e.setSpan(obj, i, i2, i3);
        } else {
            this.f2246c.setSpan(obj, i, i2, i3);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2248e.removeSpan(obj);
        } else {
            this.f2246c.removeSpan(obj);
        }
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f2248e.getSpans(i, i2, cls);
        }
        return (T[]) this.f2246c.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f2246c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f2246c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f2246c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2246c.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2246c.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f2246c.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f2246c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f2246c.toString();
    }
}
