package com.coloros.anim;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p062f.C1806b;
import com.coloros.anim.p063g.C1814b;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class EffectiveAnimationView extends AppCompatImageView {

    /* renamed from: a */
    private static final String f7813a = "EffectiveAnimationView";

    /* renamed from: b */
    private final InterfaceC1827s<Throwable> f7814b;

    /* renamed from: c */
    private final C1698b f7815c;

    /* renamed from: d */
    private String f7816d;

    /* renamed from: e */
    private int f7817e;

    /* renamed from: f */
    private boolean f7818f;

    /* renamed from: g */
    private boolean f7819g;

    /* renamed from: h */
    private boolean f7820h;

    /* renamed from: i */
    private EnumC1695aq f7821i;

    /* renamed from: j */
    private Set<Object> f7822j;

    /* renamed from: k */
    private C1830v<C1638a> f7823k;

    /* renamed from: l */
    private C1638a f7824l;

    /* renamed from: m */
    private final InterfaceC1827s<C1638a> f7825m;

    public EffectiveAnimationView(Context context) {
        super(context);
        this.f7814b = new C1833y(this);
        this.f7815c = new C1698b();
        this.f7818f = false;
        this.f7819g = false;
        this.f7820h = false;
        this.f7821i = EnumC1695aq.AUTOMATIC;
        this.f7822j = new HashSet();
        this.f7825m = new C1834z(this);
        m5453a((AttributeSet) null);
    }

    public EffectiveAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7814b = new C1833y(this);
        this.f7815c = new C1698b();
        this.f7818f = false;
        this.f7819g = false;
        this.f7820h = false;
        this.f7821i = EnumC1695aq.AUTOMATIC;
        this.f7822j = new HashSet();
        this.f7825m = new C1834z(this);
        m5453a(attributeSet);
    }

    public EffectiveAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7814b = new C1833y(this);
        this.f7815c = new C1698b();
        this.f7818f = false;
        this.f7819g = false;
        this.f7820h = false;
        this.f7821i = EnumC1695aq.AUTOMATIC;
        this.f7822j = new HashSet();
        this.f7825m = new C1834z(this);
        m5453a(attributeSet);
    }

    /* renamed from: a */
    private void m5453a(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.EffectiveAnimationView);
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.EffectiveAnimationView_anim_rawRes);
            boolean hasValue2 = obtainStyledAttributes.hasValue(R.styleable.EffectiveAnimationView_anim_fileName);
            boolean hasValue3 = obtainStyledAttributes.hasValue(R.styleable.EffectiveAnimationView_anim_url);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("rawRes and fileName cannot be used at the same time. Please use only one at once.");
            }
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.EffectiveAnimationView_anim_rawRes, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(R.styleable.EffectiveAnimationView_anim_fileName);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(R.styleable.EffectiveAnimationView_anim_url)) != null) {
                setAnimationFromUrl(string);
            }
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.EffectiveAnimationView_anim_autoPlay, false)) {
            this.f7819g = true;
            this.f7820h = true;
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.EffectiveAnimationView_anim_loop, false)) {
            this.f7815c.m5600e(-1);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.EffectiveAnimationView_anim_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(R.styleable.EffectiveAnimationView_anim_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.EffectiveAnimationView_anim_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(R.styleable.EffectiveAnimationView_anim_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.EffectiveAnimationView_anim_speed)) {
            setSpeed(obtainStyledAttributes.getFloat(R.styleable.EffectiveAnimationView_anim_speed, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(R.styleable.EffectiveAnimationView_anim_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(R.styleable.EffectiveAnimationView_anim_progress, 0.0f));
        m5455a(obtainStyledAttributes.getBoolean(R.styleable.EffectiveAnimationView_anim_enableMergePathsForKitKatAndAbove, false));
        if (obtainStyledAttributes.hasValue(R.styleable.EffectiveAnimationView_anim_colorFilter)) {
            m5454a(new C1762g("**"), InterfaceC1828t.f8481z, new C1814b(new C1696ar(obtainStyledAttributes.getColor(R.styleable.EffectiveAnimationView_anim_colorFilter, 0))));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.EffectiveAnimationView_anim_scale)) {
            this.f7815c.m5594d(obtainStyledAttributes.getFloat(R.styleable.EffectiveAnimationView_anim_scale, 1.0f));
        }
        obtainStyledAttributes.recycle();
        m5457c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        m5452a();
        super.setImageResource(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m5452a();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m5452a();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (getDrawable() == this.f7815c) {
            super.invalidateDrawable(this.f7815c);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7826a = this.f7816d;
        savedState.f7827b = this.f7817e;
        savedState.f7828c = this.f7815c.m5615t();
        savedState.f7829d = this.f7815c.m5608m();
        savedState.f7830e = this.f7815c.m5584b();
        savedState.f7831f = this.f7815c.m5606k();
        savedState.f7832g = this.f7815c.m5607l();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7816d = savedState.f7826a;
        if (!TextUtils.isEmpty(this.f7816d)) {
            setAnimation(this.f7816d);
        }
        this.f7817e = savedState.f7827b;
        if (this.f7817e != 0) {
            setAnimation(this.f7817e);
        }
        setProgress(savedState.f7828c);
        if (savedState.f7829d) {
            m5456b();
        }
        this.f7815c.m5580a(savedState.f7830e);
        setRepeatMode(savedState.f7831f);
        setRepeatCount(savedState.f7832g);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        if (i == 0) {
            if (this.f7818f) {
                this.f7815c.m5601f();
                m5457c();
                return;
            }
            return;
        }
        this.f7818f = this.f7815c.m5608m();
        if (this.f7815c.m5608m()) {
            this.f7815c.m5614s();
            m5457c();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7820h && this.f7819g) {
            m5456b();
        }
    }

    /* renamed from: a */
    private void m5455a(boolean z) {
        this.f7815c.m5581a(z);
    }

    public void setAnimation(int i) {
        this.f7817e = i;
        this.f7816d = null;
        setCompositionTask(C1681ac.m5545a(getContext(), i));
    }

    public void setAnimation(String str) {
        this.f7816d = str;
        this.f7817e = 0;
        setCompositionTask(C1681ac.m5554b(getContext(), str));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(C1681ac.m5546a(getContext(), str));
    }

    /* renamed from: a */
    private void m5452a() {
        if (this.f7823k != null) {
            this.f7823k.m5933b(this.f7825m);
            this.f7823k.m5935d(this.f7814b);
        }
    }

    public C1638a getComposition() {
        return this.f7824l;
    }

    public void setComposition(C1638a c1638a) {
        if (C1806b.f8389b) {
            C1806b.m5866b("Set Composition \n".concat(String.valueOf(c1638a)));
        }
        this.f7815c.setCallback(this);
        this.f7824l = c1638a;
        boolean m5583a = this.f7815c.m5583a(c1638a);
        m5457c();
        if (getDrawable() != this.f7815c || m5583a) {
            setImageDrawable(null);
            setImageDrawable(this.f7815c);
            requestLayout();
            Iterator<Object> it = this.f7822j.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: b */
    private void m5456b() {
        this.f7815c.m5598e();
        m5457c();
    }

    public void setMinFrame(int i) {
        this.f7815c.m5575a(i);
    }

    public float getMinFrame() {
        return this.f7815c.m5602g();
    }

    public void setMinFrame(String str) {
        this.f7815c.m5587b(str);
    }

    public void setMinProgress(float f) {
        this.f7815c.m5574a(f);
    }

    public void setMaxFrame(int i) {
        this.f7815c.m5586b(i);
    }

    public float getMaxFrame() {
        return this.f7815c.m5603h();
    }

    public void setMaxFrame(String str) {
        this.f7815c.m5592c(str);
    }

    public void setMaxProgress(float f) {
        this.f7815c.m5585b(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f7815c.m5596d(str);
    }

    public float getSpeed() {
        return this.f7815c.m5604i();
    }

    public void setSpeed(float f) {
        this.f7815c.m5590c(f);
    }

    public int getRepeatMode() {
        return this.f7815c.m5606k();
    }

    public void setRepeatMode(int i) {
        this.f7815c.m5595d(i);
    }

    public int getRepeatCount() {
        return this.f7815c.m5607l();
    }

    public void setRepeatCount(int i) {
        this.f7815c.m5600e(i);
    }

    public String getImageAssetsFolder() {
        return this.f7815c.m5584b();
    }

    public void setImageAssetsFolder(String str) {
        this.f7815c.m5580a(str);
    }

    public void setImageAssetDelegate(InterfaceC1691am interfaceC1691am) {
        this.f7815c.m5578a(interfaceC1691am);
    }

    public void setFontAssetDelegate(C1690al c1690al) {
        this.f7815c.m5577a(c1690al);
    }

    public void setTextDelegate(C1697as c1697as) {
        this.f7815c.f8064b = c1697as;
    }

    /* renamed from: a */
    private <T> void m5454a(C1762g c1762g, T t, C1814b<T> c1814b) {
        this.f7815c.m5579a(c1762g, t, c1814b);
    }

    public float getScale() {
        return this.f7815c.m5611p();
    }

    public void setScale(float f) {
        this.f7815c.m5594d(f);
        if (getDrawable() == this.f7815c) {
            setImageDrawable(null);
            setImageDrawable(this.f7815c);
        }
    }

    public int getFrame() {
        return this.f7815c.m5605j();
    }

    public void setFrame(int i) {
        this.f7815c.m5591c(i);
    }

    public float getProgress() {
        return this.f7815c.m5615t();
    }

    public void setProgress(float f) {
        this.f7815c.m5599e(f);
    }

    public long getDuration() {
        if (this.f7824l != null) {
            return this.f7824l.m5470f();
        }
        return 0L;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f7815c.m5588b(z);
    }

    public C1693ao getPerformanceTracker() {
        return this.f7815c.m5589c();
    }

    public void setRenderMode(EnumC1695aq enumC1695aq) {
        this.f7821i = enumC1695aq;
        m5457c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:            if (r3 != false) goto L21;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5457c() {
        /*
            r5 = this;
            int[] r0 = com.coloros.anim.C1679aa.f8026a
            com.coloros.anim.aq r1 = r5.f7821i
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 2
            switch(r0) {
                case 1: goto L37;
                case 2: goto L36;
                case 3: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3b
        L10:
            com.coloros.anim.a r0 = r5.f7824l
            r3 = 0
            if (r0 == 0) goto L24
            com.coloros.anim.a r0 = r5.f7824l
            boolean r0 = r0.m5465b()
            if (r0 == 0) goto L24
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L24
            goto L33
        L24:
            com.coloros.anim.a r0 = r5.f7824l
            if (r0 == 0) goto L32
            com.coloros.anim.a r0 = r5.f7824l
            int r0 = r0.m5466c()
            r4 = 4
            if (r0 <= r4) goto L32
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L36
            goto L37
        L36:
            r2 = r1
        L37:
            r0 = 0
            r5.setLayerType(r2, r0)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coloros.anim.EffectiveAnimationView.m5457c():void");
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1680ab();

        /* renamed from: a */
        String f7826a;

        /* renamed from: b */
        int f7827b;

        /* renamed from: c */
        float f7828c;

        /* renamed from: d */
        boolean f7829d;

        /* renamed from: e */
        String f7830e;

        /* renamed from: f */
        int f7831f;

        /* renamed from: g */
        int f7832g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f7826a = parcel.readString();
            this.f7828c = parcel.readFloat();
            this.f7829d = parcel.readInt() == 1;
            this.f7830e = parcel.readString();
            this.f7831f = parcel.readInt();
            this.f7832g = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f7826a);
            parcel.writeFloat(this.f7828c);
            parcel.writeInt(this.f7829d ? 1 : 0);
            parcel.writeString(this.f7830e);
            parcel.writeInt(this.f7831f);
            parcel.writeInt(this.f7832g);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (this.f7815c.m5608m()) {
            this.f7815c.m5613r();
            m5457c();
            this.f7819g = true;
        }
        super.onDetachedFromWindow();
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(C1681ac.m5547a(new JsonReader(new StringReader(str))));
    }

    private void setCompositionTask(C1830v<C1638a> c1830v) {
        this.f7824l = null;
        this.f7815c.m5593d();
        m5452a();
        this.f7823k = c1830v.m5932a(this.f7825m).m5934c(this.f7814b);
    }
}
