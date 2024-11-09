package com.google.android.material.chip;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;
import androidx.customview.p027a.AbstractC0582a;
import com.coloros.neton.BuildConfig;
import com.google.android.material.R;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Chip.java */
/* renamed from: com.google.android.material.chip.c */
/* loaded from: classes.dex */
public final class C2113c extends AbstractC0582a {

    /* renamed from: c */
    final /* synthetic */ Chip f9438c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2113c(Chip chip, Chip chip2) {
        super(chip2);
        this.f9438c = chip;
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final int mo2070a(float f, float f2) {
        boolean m6629j;
        RectF closeIconTouchBounds;
        m6629j = this.f9438c.m6629j();
        if (!m6629j) {
            return 0;
        }
        closeIconTouchBounds = this.f9438c.getCloseIconTouchBounds();
        return closeIconTouchBounds.contains(f, f2) ? 1 : 0;
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2077a(List<Integer> list) {
        boolean m6629j;
        View.OnClickListener onClickListener;
        list.add(0);
        m6629j = this.f9438c.m6629j();
        if (m6629j && this.f9438c.m6634c()) {
            onClickListener = this.f9438c.f9413h;
            if (onClickListener != null) {
                list.add(1);
            }
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2075a(int i, boolean z) {
        if (i == 1) {
            this.f9438c.f9418m = z;
            this.f9438c.refreshDrawableState();
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2074a(int i, C0482c c0482c) {
        Rect rect;
        Rect closeIconTouchBoundsInt;
        if (i == 1) {
            CharSequence closeIconContentDescription = this.f9438c.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                c0482c.m1676e(closeIconContentDescription);
            } else {
                CharSequence text = this.f9438c.getText();
                Context context = this.f9438c.getContext();
                int i2 = R.string.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                if (TextUtils.isEmpty(text)) {
                    text = BuildConfig.FLAVOR;
                }
                objArr[0] = text;
                c0482c.m1676e(context.getString(i2, objArr).trim());
            }
            closeIconTouchBoundsInt = this.f9438c.getCloseIconTouchBoundsInt();
            c0482c.m1657b(closeIconTouchBoundsInt);
            c0482c.m1649a(C0483d.f2303e);
            c0482c.m1690j(this.f9438c.isEnabled());
            return;
        }
        c0482c.m1676e(BuildConfig.FLAVOR);
        rect = Chip.f9407b;
        c0482c.m1657b(rect);
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: a */
    protected final void mo2076a(C0482c c0482c) {
        c0482c.m1654a(this.f9438c.m6635d());
        c0482c.m1685h(this.f9438c.isClickable());
        if (this.f9438c.m6635d() || this.f9438c.isClickable()) {
            c0482c.m1660b((CharSequence) (this.f9438c.m6635d() ? "android.widget.CompoundButton" : "android.widget.Button"));
        } else {
            c0482c.m1660b("android.view.View");
        }
        CharSequence text = this.f9438c.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            c0482c.m1668c(text);
        } else {
            c0482c.m1676e(text);
        }
    }

    @Override // androidx.customview.p027a.AbstractC0582a
    /* renamed from: b */
    protected final boolean mo2084b(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        if (i == 0) {
            return this.f9438c.performClick();
        }
        if (i == 1) {
            return this.f9438c.m6633b();
        }
        return false;
    }
}
