package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.p024g.InterfaceC0537v;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements InterfaceC0537v {

    /* renamed from: c */
    private static final int[] f879c = {R.attr.spinnerMode};

    /* renamed from: a */
    int f880a;

    /* renamed from: b */
    final Rect f881b;

    /* renamed from: d */
    private final C0190ai f882d;

    /* renamed from: e */
    private final Context f883e;

    /* renamed from: f */
    private AbstractViewOnAttachStateChangeListenerC0224bp f884f;

    /* renamed from: g */
    private SpinnerAdapter f885g;

    /* renamed from: h */
    private final boolean f886h;

    /* renamed from: i */
    private InterfaceC0209ba f887i;

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private AppCompatSpinner(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:            if (r3 != null) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:            r3.recycle();     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:            switch(r11) {            case 0: goto L26;            case 1: goto L25;            default: goto L27;        };     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:            r11 = new androidx.appcompat.widget.C0203av(r7, r7.f883e, r9, r10);        r1 = androidx.appcompat.widget.C0276dn.m944a(r7.f883e, r9, androidx.appcompat.R.styleable.Spinner, r10, 0);        r7.f880a = r1.m959f(androidx.appcompat.R.styleable.Spinner_android_dropDownWidth, -2);        r11.m857a(r1.m948a(androidx.appcompat.R.styleable.Spinner_android_popupBackground));        r11.mo746a(r0.m956d(androidx.appcompat.R.styleable.Spinner_android_prompt));        r1.m952b();        r7.f887i = r11;        r7.f884f = new androidx.appcompat.widget.C0199ar(r7, r7, r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:            r7.f887i = new androidx.appcompat.widget.DialogInterfaceOnClickListenerC0201at(r7);        r7.f887i.mo746a(r0.m956d(androidx.appcompat.R.styleable.Spinner_android_prompt));     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:            r11 = r0.m963h(androidx.appcompat.R.styleable.Spinner_android_entries);     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:            if (r11 == null) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:            r1 = new android.widget.ArrayAdapter(r8, android.R.layout.simple_spinner_item, r11);        r1.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);        setAdapter2((android.widget.SpinnerAdapter) r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:            r0.m952b();        r7.f886h = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:            if (r7.f885g == null) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:            setAdapter2(r7.f885g);        r7.f885g = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:            r7.f882d.m694a(r9, r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:            if (r3 == null) goto L23;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17, types: [android.content.Context, androidx.appcompat.view.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f881b = r0
            int[] r0 = androidx.appcompat.R.styleable.Spinner
            r1 = 0
            androidx.appcompat.widget.dn r0 = androidx.appcompat.widget.C0276dn.m944a(r8, r9, r0, r10, r1)
            androidx.appcompat.widget.ai r2 = new androidx.appcompat.widget.ai
            r2.<init>(r7)
            r7.f882d = r2
            int r2 = androidx.appcompat.R.styleable.Spinner_popupTheme
            int r2 = r0.m962g(r2, r1)
            if (r2 == 0) goto L28
            androidx.appcompat.view.e r3 = new androidx.appcompat.view.e
            r3.<init>(r8, r2)
            r7.f883e = r3
            goto L2a
        L28:
            r7.f883e = r8
        L2a:
            r2 = 0
            int[] r3 = androidx.appcompat.widget.AppCompatSpinner.f879c     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L48
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r9, r3, r10, r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L48
            boolean r4 = r3.hasValue(r1)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> Ld0
            if (r4 == 0) goto L3c
            int r4 = r3.getInt(r1, r1)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> Ld0
            r11 = r4
        L3c:
            if (r3 == 0) goto L54
        L3e:
            r3.recycle()
            goto L54
        L42:
            r4 = move-exception
            goto L4a
        L44:
            r7 = move-exception
            r3 = r2
            goto Ld1
        L48:
            r4 = move-exception
            r3 = r2
        L4a:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch: java.lang.Throwable -> Ld0
            if (r3 == 0) goto L54
            goto L3e
        L54:
            switch(r11) {
                case 0: goto L8f;
                case 1: goto L58;
                default: goto L57;
            }
        L57:
            goto La1
        L58:
            androidx.appcompat.widget.av r11 = new androidx.appcompat.widget.av
            android.content.Context r3 = r7.f883e
            r11.<init>(r7, r3, r9, r10)
            android.content.Context r3 = r7.f883e
            int[] r4 = androidx.appcompat.R.styleable.Spinner
            androidx.appcompat.widget.dn r1 = androidx.appcompat.widget.C0276dn.m944a(r3, r9, r4, r10, r1)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.m959f(r3, r4)
            r7.f880a = r3
            int r3 = androidx.appcompat.R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.m948a(r3)
            r11.m857a(r3)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r3 = r0.m956d(r3)
            r11.mo746a(r3)
            r1.m952b()
            r7.f887i = r11
            androidx.appcompat.widget.ar r1 = new androidx.appcompat.widget.ar
            r1.<init>(r7, r7, r11)
            r7.f884f = r1
            goto La1
        L8f:
            androidx.appcompat.widget.at r11 = new androidx.appcompat.widget.at
            r11.<init>(r7)
            r7.f887i = r11
            androidx.appcompat.widget.ba r11 = r7.f887i
            int r1 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r1 = r0.m956d(r1)
            r11.mo746a(r1)
        La1:
            int r11 = androidx.appcompat.R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.m963h(r11)
            if (r11 == 0) goto Lb9
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r8, r3, r11)
            int r8 = androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r8)
            r7.setAdapter(r1)
        Lb9:
            r0.m952b()
            r8 = 1
            r7.f886h = r8
            android.widget.SpinnerAdapter r8 = r7.f885g
            if (r8 == 0) goto Lca
            android.widget.SpinnerAdapter r8 = r7.f885g
            r7.setAdapter(r8)
            r7.f885g = r2
        Lca:
            androidx.appcompat.widget.ai r7 = r7.f882d
            r7.m694a(r9, r10)
            return
        Ld0:
            r7 = move-exception
        Ld1:
            if (r3 == 0) goto Ld6
            r3.recycle()
        Ld6:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f883e;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f887i != null) {
            this.f887i.mo744a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0057a.m46b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        if (this.f887i != null) {
            return this.f887i.mo747b();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        if (this.f887i != null) {
            this.f887i.mo742a(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        if (this.f887i != null) {
            return this.f887i.mo749c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        if (this.f887i != null) {
            this.f887i.mo750c(i);
            this.f887i.mo748b(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        if (this.f887i != null) {
            return this.f887i.mo753f();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f887i != null) {
            this.f880a = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f887i != null) {
            return this.f880a;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f886h) {
            this.f885g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f887i != null) {
            this.f887i.mo745a(new C0202au(spinnerAdapter, (this.f883e == null ? getContext() : this.f883e).getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f887i == null || !this.f887i.mo752e()) {
            return;
        }
        this.f887i.mo751d();
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f884f == null || !this.f884f.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f887i == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m576a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        if (this.f887i != null) {
            if (this.f887i.mo752e()) {
                return true;
            }
            m577a();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        if (this.f887i != null) {
            this.f887i.mo746a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        return this.f887i != null ? this.f887i.mo741a() : super.getPrompt();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f882d != null) {
            this.f882d.m691a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f882d != null) {
            this.f882d.m690a();
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f882d != null) {
            this.f882d.m692a(colorStateList);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f882d != null) {
            return this.f882d.m695b();
        }
        return null;
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f882d != null) {
            this.f882d.m693a(mode);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f882d != null) {
            return this.f882d.m696c();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f882d != null) {
            this.f882d.m697d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m576a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int i2 = 0;
        View view = null;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f881b);
        return i2 + this.f881b.left + this.f881b.right;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC0209ba getInternalPopup() {
        return this.f887i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m577a() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f887i.mo743a(getTextDirection(), getTextAlignment());
        } else {
            this.f887i.mo743a(-1, -1);
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f888a = this.f887i != null && this.f887i.mo752e();
        return savedState;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f888a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0200as(this));
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0207az();

        /* renamed from: a */
        boolean f888a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Parcel parcel) {
            super(parcel);
            this.f888a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f888a ? (byte) 1 : (byte) 0);
        }
    }
}
