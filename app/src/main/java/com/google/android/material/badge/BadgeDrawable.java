package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p024g.C0538w;
import com.coloros.neton.BuildConfig;
import com.google.android.material.R;
import com.google.android.material.internal.C2238ag;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.InterfaceC2240ai;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p079h.C2222e;
import com.google.android.material.p082k.C2295h;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class BadgeDrawable extends Drawable implements InterfaceC2240ai {

    /* renamed from: a */
    private static final int f9096a = R.style.Widget_MaterialComponents_Badge;

    /* renamed from: b */
    private static final int f9097b = R.attr.badgeStyle;

    /* renamed from: c */
    private final WeakReference<Context> f9098c;

    /* renamed from: d */
    private final C2295h f9099d;

    /* renamed from: e */
    private final C2238ag f9100e;

    /* renamed from: f */
    private final Rect f9101f;

    /* renamed from: g */
    private final float f9102g;

    /* renamed from: h */
    private final float f9103h;

    /* renamed from: i */
    private final float f9104i;

    /* renamed from: j */
    private final SavedState f9105j;

    /* renamed from: k */
    private float f9106k;

    /* renamed from: l */
    private float f9107l;

    /* renamed from: m */
    private int f9108m;

    /* renamed from: n */
    private float f9109n;

    /* renamed from: o */
    private float f9110o;

    /* renamed from: p */
    private float f9111p;

    /* renamed from: q */
    private WeakReference<View> f9112q;

    /* renamed from: r */
    private WeakReference<ViewGroup> f9113r;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* loaded from: classes.dex */
    public final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2064a();

        /* renamed from: a */
        private int f9114a;

        /* renamed from: b */
        private int f9115b;

        /* renamed from: c */
        private int f9116c;

        /* renamed from: d */
        private int f9117d;

        /* renamed from: e */
        private int f9118e;

        /* renamed from: f */
        private CharSequence f9119f;

        /* renamed from: g */
        private int f9120g;

        /* renamed from: h */
        private int f9121h;

        /* renamed from: i */
        private int f9122i;

        /* renamed from: j */
        private int f9123j;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState(Context context) {
            this.f9116c = 255;
            this.f9117d = -1;
            this.f9115b = new C2222e(context, R.style.TextAppearance_MaterialComponents_Badge).f9820b.getDefaultColor();
            this.f9119f = context.getString(R.string.mtrl_badge_numberless_content_description);
            this.f9120g = R.plurals.mtrl_badge_content_description;
        }

        public SavedState(Parcel parcel) {
            this.f9116c = 255;
            this.f9117d = -1;
            this.f9114a = parcel.readInt();
            this.f9115b = parcel.readInt();
            this.f9116c = parcel.readInt();
            this.f9117d = parcel.readInt();
            this.f9118e = parcel.readInt();
            this.f9119f = parcel.readString();
            this.f9120g = parcel.readInt();
            this.f9121h = parcel.readInt();
            this.f9122i = parcel.readInt();
            this.f9123j = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9114a);
            parcel.writeInt(this.f9115b);
            parcel.writeInt(this.f9116c);
            parcel.writeInt(this.f9117d);
            parcel.writeInt(this.f9118e);
            parcel.writeString(this.f9119f.toString());
            parcel.writeInt(this.f9120g);
            parcel.writeInt(this.f9121h);
            parcel.writeInt(this.f9122i);
            parcel.writeInt(this.f9123j);
        }
    }

    /* renamed from: a */
    public final SavedState m6357a() {
        return this.f9105j;
    }

    /* renamed from: a */
    public static BadgeDrawable m6343a(Context context, SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m6348d(savedState.f9118e);
        if (savedState.f9117d != -1) {
            badgeDrawable.m6347c(savedState.f9117d);
        }
        badgeDrawable.m6344a(savedState.f9114a);
        badgeDrawable.m6346b(savedState.f9115b);
        badgeDrawable.m6351e(savedState.f9121h);
        badgeDrawable.m6353f(savedState.f9122i);
        badgeDrawable.m6355g(savedState.f9123j);
        return badgeDrawable;
    }

    /* renamed from: a */
    public static BadgeDrawable m6342a(Context context) {
        int i = f9097b;
        int i2 = f9096a;
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        TypedArray m7095a = C2243al.m7095a(context, null, R.styleable.Badge, i, i2, new int[0]);
        badgeDrawable.m6348d(m7095a.getInt(R.styleable.Badge_maxCharacterCount, 4));
        if (m7095a.hasValue(R.styleable.Badge_number)) {
            badgeDrawable.m6347c(m7095a.getInt(R.styleable.Badge_number, 0));
        }
        badgeDrawable.m6344a(m6341a(context, m7095a, R.styleable.Badge_backgroundColor));
        if (m7095a.hasValue(R.styleable.Badge_badgeTextColor)) {
            badgeDrawable.m6346b(m6341a(context, m7095a, R.styleable.Badge_badgeTextColor));
        }
        badgeDrawable.m6351e(m7095a.getInt(R.styleable.Badge_badgeGravity, 8388661));
        badgeDrawable.m6353f(m7095a.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0));
        badgeDrawable.m6355g(m7095a.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0));
        m7095a.recycle();
        return badgeDrawable;
    }

    /* renamed from: a */
    private static int m6341a(Context context, TypedArray typedArray, int i) {
        return C2221d.m7045a(context, typedArray, i).getDefaultColor();
    }

    private BadgeDrawable(Context context) {
        C2222e c2222e;
        Context context2;
        this.f9098c = new WeakReference<>(context);
        C2243al.m7096a(context);
        Resources resources = context.getResources();
        this.f9101f = new Rect();
        this.f9099d = new C2295h();
        this.f9102g = resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.f9104i = resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.f9103h = resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        this.f9100e = new C2238ag(this);
        this.f9100e.m7089a().setTextAlign(Paint.Align.CENTER);
        this.f9105j = new SavedState(context);
        int i = R.style.TextAppearance_MaterialComponents_Badge;
        Context context3 = this.f9098c.get();
        if (context3 == null || this.f9100e.m7093c() == (c2222e = new C2222e(context3, i)) || (context2 = this.f9098c.get()) == null) {
            return;
        }
        this.f9100e.m7091a(c2222e, context2);
        m6352f();
    }

    /* renamed from: a */
    public final void m6358a(View view, ViewGroup viewGroup) {
        this.f9112q = new WeakReference<>(view);
        this.f9113r = new WeakReference<>(viewGroup);
        m6352f();
        invalidateSelf();
    }

    /* renamed from: a */
    private void m6344a(int i) {
        this.f9105j.f9114a = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f9099d.m7259M() != valueOf) {
            this.f9099d.m7282g(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: b */
    private void m6346b(int i) {
        this.f9105j.f9115b = i;
        if (this.f9100e.m7089a().getColor() != i) {
            this.f9100e.m7089a().setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    private boolean m6349d() {
        return this.f9105j.f9117d != -1;
    }

    /* renamed from: e */
    private int m6350e() {
        if (m6349d()) {
            return this.f9105j.f9117d;
        }
        return 0;
    }

    /* renamed from: c */
    private void m6347c(int i) {
        int max = Math.max(0, i);
        if (this.f9105j.f9117d != max) {
            this.f9105j.f9117d = max;
            this.f9100e.m7092b();
            m6352f();
            invalidateSelf();
        }
    }

    /* renamed from: d */
    private void m6348d(int i) {
        if (this.f9105j.f9118e != i) {
            this.f9105j.f9118e = i;
            m6356h();
            this.f9100e.m7092b();
            m6352f();
            invalidateSelf();
        }
    }

    /* renamed from: e */
    private void m6351e(int i) {
        if (this.f9105j.f9121h != i) {
            this.f9105j.f9121h = i;
            if (this.f9112q == null || this.f9112q.get() == null) {
                return;
            }
            m6358a(this.f9112q.get(), this.f9113r != null ? this.f9113r.get() : null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9105j.f9116c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f9105j.f9116c = i;
        this.f9100e.m7089a().setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f9101f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f9101f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f9099d.draw(canvas);
        if (m6349d()) {
            Rect rect = new Rect();
            String m6354g = m6354g();
            this.f9100e.m7089a().getTextBounds(m6354g, 0, m6354g.length(), rect);
            canvas.drawText(m6354g, this.f9106k, this.f9107l + (rect.height() / 2), this.f9100e.m7089a());
        }
    }

    @Override // com.google.android.material.internal.InterfaceC2240ai
    /* renamed from: b */
    public final void mo6359b() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.InterfaceC2240ai
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: c */
    public final CharSequence m6360c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (m6349d()) {
            if (this.f9105j.f9120g <= 0 || (context = this.f9098c.get()) == null) {
                return null;
            }
            return context.getResources().getQuantityString(this.f9105j.f9120g, m6350e(), Integer.valueOf(m6350e()));
        }
        return this.f9105j.f9119f;
    }

    /* renamed from: f */
    private void m6353f(int i) {
        this.f9105j.f9122i = i;
        m6352f();
    }

    /* renamed from: g */
    private void m6355g(int i) {
        this.f9105j.f9123j = i;
        m6352f();
    }

    /* renamed from: f */
    private void m6352f() {
        Context context = this.f9098c.get();
        View view = this.f9112q != null ? this.f9112q.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f9101f);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        ViewGroup viewGroup = this.f9113r != null ? this.f9113r.get() : null;
        if (viewGroup != null || C2065b.f9124a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        m6345a(context, rect2, view);
        C2065b.m6381a(this.f9101f, this.f9106k, this.f9107l, this.f9110o, this.f9111p);
        this.f9099d.m7285o(this.f9109n);
        if (rect.equals(this.f9101f)) {
            return;
        }
        this.f9099d.setBounds(this.f9101f);
    }

    /* renamed from: a */
    private void m6345a(Context context, Rect rect, View view) {
        int i = this.f9105j.f9121h;
        if (i == 8388691 || i == 8388693) {
            this.f9107l = rect.bottom - this.f9105j.f9123j;
        } else {
            this.f9107l = rect.top + this.f9105j.f9123j;
        }
        if (m6350e() <= 9) {
            this.f9109n = !m6349d() ? this.f9102g : this.f9103h;
            this.f9111p = this.f9109n;
            this.f9110o = this.f9109n;
        } else {
            this.f9109n = this.f9103h;
            this.f9111p = this.f9109n;
            this.f9110o = (this.f9100e.m7088a(m6354g()) / 2.0f) + this.f9104i;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(m6349d() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
        int i2 = this.f9105j.f9121h;
        if (i2 == 8388659 || i2 == 8388691) {
            this.f9106k = C0538w.m1878h(view) == 0 ? (rect.left - this.f9110o) + dimensionPixelSize + this.f9105j.f9122i : ((rect.right + this.f9110o) - dimensionPixelSize) - this.f9105j.f9122i;
        } else {
            this.f9106k = C0538w.m1878h(view) == 0 ? ((rect.right + this.f9110o) - dimensionPixelSize) - this.f9105j.f9122i : (rect.left - this.f9110o) + dimensionPixelSize + this.f9105j.f9122i;
        }
    }

    /* renamed from: g */
    private String m6354g() {
        if (m6350e() <= this.f9108m) {
            return Integer.toString(m6350e());
        }
        Context context = this.f9098c.get();
        return context == null ? BuildConfig.FLAVOR : context.getString(R.string.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.f9108m), "+");
    }

    /* renamed from: h */
    private void m6356h() {
        this.f9108m = ((int) Math.pow(10.0d, this.f9105j.f9118e - 1.0d)) - 1;
    }
}
