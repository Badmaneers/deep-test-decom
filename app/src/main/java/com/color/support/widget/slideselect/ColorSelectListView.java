package com.color.support.widget.slideselect;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Space;
import android.widget.TextView;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorSelectListView extends ListView {

    /* renamed from: a */
    private InterfaceC1627j f7734a;

    /* renamed from: b */
    private int f7735b;

    /* renamed from: c */
    private boolean f7736c;

    /* renamed from: d */
    private boolean f7737d;

    /* renamed from: e */
    private Vibrator f7738e;

    /* renamed from: f */
    private int f7739f;

    /* renamed from: g */
    private int f7740g;

    /* renamed from: h */
    private Bitmap f7741h;

    /* renamed from: i */
    private double f7742i;

    /* renamed from: j */
    private boolean f7743j;

    /* renamed from: k */
    private int f7744k;

    public void setAnimationInPregress(boolean z) {
        this.f7737d = z;
    }

    public void setIsFirstDown(boolean z) {
        this.f7743j = z;
    }

    public int getTriggerSource() {
        return this.f7744k;
    }

    public void setTriggerSource(int i) {
        this.f7744k = i;
    }

    public ColorSelectListView(Context context) {
        super(context);
        this.f7742i = 12.0d;
    }

    public ColorSelectListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7742i = 12.0d;
        this.f7738e = (Vibrator) context.getSystemService("vibrator");
        this.f7739f = getResources().getColor(R.color.color_slide_secletor_item_bg);
        this.f7740g = getResources().getColor(android.R.color.transparent);
    }

    public ColorSelectListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7742i = 12.0d;
        this.f7738e = (Vibrator) context.getSystemService("vibrator");
        this.f7739f = getResources().getColor(R.color.color_slide_secletor_item_bg);
        this.f7740g = getResources().getColor(android.R.color.transparent);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f7737d) {
            return true;
        }
        if (this.f7744k == 0) {
            switch (motionEvent.getAction()) {
                case 1:
                    if (this.f7736c) {
                        this.f7734a.mo5436a(this.f7735b);
                    } else {
                        this.f7734a.mo5436a(-10);
                    }
                    this.f7736c = false;
                    setTriggerSource(2);
                    break;
                case 2:
                    int i = 0;
                    while (true) {
                        if (i < getChildCount()) {
                            View childAt = getChildAt(i);
                            if (!(childAt instanceof Space)) {
                                if (m5420a(childAt).contains(motionEvent.getRawX(), motionEvent.getRawY())) {
                                    if (this.f7743j) {
                                        this.f7735b = i;
                                        this.f7743j = false;
                                        this.f7736c = false;
                                    } else {
                                        if (this.f7735b != i) {
                                            this.f7736c = true;
                                        }
                                        if (!this.f7736c) {
                                            continue;
                                        } else if (this.f7735b != i) {
                                            this.f7735b = i;
                                            m5421a();
                                            setItemFous(childAt);
                                        }
                                    }
                                } else if (this.f7736c) {
                                    FrameLayout frameLayout = (FrameLayout) childAt;
                                    if (((TextView) frameLayout.getChildAt(0)).getCurrentTextColor() != getResources().getColor(R.color.color_select_prefernce_default_tv_color)) {
                                        ((TextView) frameLayout.getChildAt(0)).setTextColor(getResources().getColor(R.color.color_select_prefernce_default_tv_color));
                                    }
                                    if ((childAt.getBackground() instanceof ColorDrawable) && ((ColorDrawable) childAt.getBackground()).getColor() == this.f7739f) {
                                        setItemLoseFocus(childAt);
                                    }
                                }
                            }
                            i++;
                        }
                    }
                    return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 0:
            case 2:
                break;
            case 1:
                setTriggerSource(2);
                this.f7734a.mo5436a(this.f7735b);
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            if (m5420a(childAt2).contains(motionEvent.getRawX(), motionEvent.getRawY())) {
                if (this.f7735b == i2) {
                    return true;
                }
                this.f7735b = i2;
                m5421a();
                setItemFous(childAt2);
            } else {
                setItemLoseFocus(childAt2);
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m5421a() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f7738e.vibrate(VibrationEffect.createOneShot(16L, 250));
        } else {
            performHapticFeedback(0);
        }
    }

    private void setItemLoseFocus(View view) {
        view.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        ((TextView) ((FrameLayout) view).getChildAt(0)).setTextColor(getResources().getColor(R.color.color_select_prefernce_default_tv_color));
    }

    private void setItemFous(View view) {
        view.setBackgroundColor(getResources().getColor(R.color.color_slide_secletor_item_bg));
        ((TextView) ((FrameLayout) view).getChildAt(0)).setTextColor(getResources().getColor(R.color.color_select_prefernce_focus_tv_color));
    }

    public void setOnFingerUpListener(InterfaceC1627j interfaceC1627j) {
        this.f7734a = interfaceC1627j;
    }

    /* renamed from: a */
    private static RectF m5420a(View view) {
        view.getLocationOnScreen(new int[2]);
        return new RectF(r0[0], r0[1], r0[0] + view.getWidth(), r0[1] + view.getHeight());
    }

    public void setBlurBitmap(Bitmap bitmap) {
        this.f7741h = bitmap;
        invalidate();
    }
}
