package color.support.p043v7.widget;

import android.content.Context;
import androidx.core.p024g.C0507ah;
import androidx.core.widget.C0572j;
import color.support.p043v7.appcompat.R;
import color.support.p043v7.internal.widget.ListViewCompat;

/* compiled from: ColorBaseListPopupWindow.java */
/* renamed from: color.support.v7.widget.h */
/* loaded from: classes.dex */
public final class C1281h extends ListViewCompat {

    /* renamed from: f */
    private boolean f5440f;

    /* renamed from: g */
    private boolean f5441g;

    /* renamed from: h */
    private boolean f5442h;

    /* renamed from: i */
    private C0507ah f5443i;

    /* renamed from: j */
    private C0572j f5444j;

    public C1281h(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f5441g = z;
        setCacheColorHint(0);
    }

    @Override // color.support.p043v7.internal.widget.ListViewCompat
    /* renamed from: a */
    public final boolean mo4061a() {
        return this.f5442h || super.mo4061a();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f5441g && this.f5440f) || super.isInTouchMode();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f5441g || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f5441g || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f5441g || super.hasFocus();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0019  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4228a(android.view.MotionEvent r9, int r10) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L11;
                case 2: goto Lf;
                case 3: goto Lc;
                default: goto L9;
            }
        L9:
            r3 = r1
            r10 = r2
            goto L56
        Lc:
            r10 = r2
            r3 = r10
            goto L56
        Lf:
            r3 = r1
            goto L12
        L11:
            r3 = r2
        L12:
            int r10 = r9.findPointerIndex(r10)
            if (r10 >= 0) goto L19
            goto Lc
        L19:
            float r4 = r9.getX(r10)
            int r4 = (int) r4
            float r10 = r9.getY(r10)
            int r10 = (int) r10
            int r5 = r8.pointToPosition(r4, r10)
            r6 = -1
            if (r5 != r6) goto L2c
            r10 = r1
            goto L56
        L2c:
            int r3 = r8.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r8.getChildAt(r3)
            float r4 = (float) r4
            float r10 = (float) r10
            r8.f5442h = r1
            r8.setPressed(r1)
            r8.layoutChildren()
            r8.setSelection(r5)
            r8.m4060a(r5, r3, r4, r10)
            r8.setSelectorEnabled(r2)
            r8.refreshDrawableState()
            if (r0 != r1) goto L9
            long r6 = r8.getItemIdAtPosition(r5)
            r8.performItemClick(r3, r5, r6)
            goto L9
        L56:
            if (r3 == 0) goto L5a
            if (r10 == 0) goto L6e
        L5a:
            r8.f5442h = r2
            r8.setPressed(r2)
            r8.drawableStateChanged()
            androidx.core.g.ah r10 = r8.f5443i
            if (r10 == 0) goto L6e
            androidx.core.g.ah r10 = r8.f5443i
            r10.m1761c()
            r10 = 0
            r8.f5443i = r10
        L6e:
            if (r3 == 0) goto L86
            androidx.core.widget.j r10 = r8.f5444j
            if (r10 != 0) goto L7b
            androidx.core.widget.j r10 = new androidx.core.widget.j
            r10.<init>(r8)
            r8.f5444j = r10
        L7b:
            androidx.core.widget.j r10 = r8.f5444j
            r10.m2020a(r1)
            androidx.core.widget.j r10 = r8.f5444j
            r10.onTouch(r8, r9)
            goto L8f
        L86:
            androidx.core.widget.j r9 = r8.f5444j
            if (r9 == 0) goto L8f
            androidx.core.widget.j r8 = r8.f5444j
            r8.m2020a(r2)
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: color.support.p043v7.widget.C1281h.m4228a(android.view.MotionEvent, int):boolean");
    }
}
