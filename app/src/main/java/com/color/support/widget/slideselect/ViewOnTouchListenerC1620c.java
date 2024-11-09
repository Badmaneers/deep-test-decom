package com.color.support.widget.slideselect;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSlideSelectView.java */
/* renamed from: com.color.support.widget.slideselect.c */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1620c implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ ColorSlideSelectView f7768a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnTouchListenerC1620c(ColorSlideSelectView colorSlideSelectView) {
        this.f7768a = colorSlideSelectView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ColorSelectListView colorSelectListView;
        boolean z;
        ColorSelectListView colorSelectListView2;
        ColorSelectListView colorSelectListView3;
        Handler handler;
        RunnableC1623f runnableC1623f;
        ColorSelectListView colorSelectListView4;
        long j;
        Handler handler2;
        RunnableC1623f runnableC1623f2;
        ColorSelectListView colorSelectListView5;
        boolean z2;
        boolean z3;
        ColorSelectListView colorSelectListView6;
        ColorSelectListView colorSelectListView7;
        switch (motionEvent.getAction()) {
            case 0:
                this.f7768a.f7757m = new RunnableC1623f(this.f7768a);
                handler = this.f7768a.f7755k;
                runnableC1623f = this.f7768a.f7757m;
                handler.postDelayed(runnableC1623f, 500L);
                this.f7768a.f7754j = Calendar.getInstance().getTimeInMillis();
                colorSelectListView4 = this.f7768a.f7749e;
                colorSelectListView4.setEnabled(true);
                break;
            case 1:
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                j = this.f7768a.f7754j;
                if (timeInMillis - j <= 500) {
                    handler2 = this.f7768a.f7755k;
                    runnableC1623f2 = this.f7768a.f7757m;
                    handler2.removeCallbacks(runnableC1623f2);
                    colorSelectListView5 = this.f7768a.f7749e;
                    colorSelectListView5.setTriggerSource(1);
                    ColorSlideSelectView.m5428b(this.f7768a);
                    break;
                }
                break;
            case 2:
                z2 = this.f7768a.f7756l;
                if (z2) {
                    z3 = this.f7768a.f7751g;
                    if (!z3) {
                        colorSelectListView6 = this.f7768a.f7749e;
                        colorSelectListView6.setTriggerSource(0);
                        colorSelectListView7 = this.f7768a.f7749e;
                        colorSelectListView7.setIsFirstDown(true);
                    }
                    ColorSlideSelectView.m5428b(this.f7768a);
                    ColorSlideSelectView.m5434h(this.f7768a);
                    break;
                }
                break;
        }
        colorSelectListView = this.f7768a.f7749e;
        if (colorSelectListView.getTriggerSource() != 0) {
            return true;
        }
        z = this.f7768a.f7751g;
        if (!z && motionEvent.getAction() == 2) {
            colorSelectListView3 = this.f7768a.f7749e;
            colorSelectListView3.setIsFirstDown(true);
        }
        colorSelectListView2 = this.f7768a.f7749e;
        colorSelectListView2.onTouchEvent(motionEvent);
        return true;
    }
}
