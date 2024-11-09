package com.color.support.widget;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.color.support.widget.ColorSearchViewAnimate;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.db */
/* loaded from: classes.dex */
public final class C1441db {

    /* renamed from: a */
    final /* synthetic */ ColorSearchViewAnimate f7077a;

    /* renamed from: b */
    private long f7078b;

    /* renamed from: c */
    private int f7079c;

    /* renamed from: d */
    private volatile AtomicBoolean f7080d;

    /* renamed from: e */
    private Runnable f7081e;

    /* renamed from: f */
    private Runnable f7082f;

    /* renamed from: g */
    private Runnable f7083g;

    /* renamed from: h */
    private Runnable f7084h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1441db(ColorSearchViewAnimate colorSearchViewAnimate) {
        long j;
        this.f7077a = colorSearchViewAnimate;
        j = this.f7077a.f6478m;
        this.f7078b = j;
        this.f7080d = new AtomicBoolean(false);
        this.f7081e = new RunnableC1442dc(this);
        this.f7082f = new RunnableC1447dh(this);
        this.f7083g = new RunnableC1448di(this);
        this.f7084h = new RunnableC1449dj(this);
    }

    /* renamed from: a */
    public final void m4998a(int i) {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton;
        ImageView imageView;
        boolean z;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        LinearLayout linearLayout;
        ColorSearchView colorSearchView;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton2;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton3;
        ImageView imageView7;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton4;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton5;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton6;
        ImageView imageView8;
        ColorSearchView colorSearchView2;
        ColorSearchView colorSearchView3;
        ColorSearchView colorSearchView4;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        ImageView imageView12;
        ImageView imageView13;
        boolean m4691h;
        ImageView imageView14;
        ImageView imageView15;
        ImageView imageView16;
        AtomicInteger atomicInteger3;
        boolean z2;
        ImageView imageView17;
        ImageView imageView18;
        ImageView imageView19;
        ImageView imageView20;
        LinearLayout linearLayout5;
        ColorSearchView colorSearchView5;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton7;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton8;
        ImageView imageView21;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton9;
        ImageView imageView22;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton10;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton11;
        ColorSearchView colorSearchView6;
        ColorSearchView colorSearchView7;
        ColorSearchView colorSearchView8;
        LinearLayout linearLayout6;
        ImageView imageView23;
        ImageView imageView24;
        ImageView imageView25;
        boolean m4691h2;
        ImageView imageView26;
        ImageView imageView27;
        ImageView imageView28;
        atomicInteger = this.f7077a.f6474i;
        if (atomicInteger.get() == i) {
            return;
        }
        if (i == 1) {
            synchronized (this) {
                if (this.f7080d.compareAndSet(false, true)) {
                    atomicInteger3 = this.f7077a.f6474i;
                    atomicInteger3.set(1);
                    z2 = this.f7077a.f6485t;
                    if (z2) {
                        imageView23 = this.f7077a.f6467b;
                        if (imageView23 != null) {
                            if (this.f7079c == 0) {
                                m4691h2 = this.f7077a.m4691h();
                                if (!m4691h2) {
                                    imageView28 = this.f7077a.f6467b;
                                    this.f7079c = -imageView28.getLeft();
                                } else {
                                    int width = this.f7077a.getWidth();
                                    imageView26 = this.f7077a.f6467b;
                                    int right = width - imageView26.getRight();
                                    imageView27 = this.f7077a.f6467b;
                                    this.f7079c = right + imageView27.getWidth();
                                }
                            }
                            int i2 = this.f7079c;
                            imageView24 = this.f7077a.f6467b;
                            imageView24.setPivotX(i2);
                            imageView25 = this.f7077a.f6467b;
                            imageView25.animate().setDuration(this.f7078b).rotationY(80.0f).setListener(new C1452dm(this)).start();
                        }
                    } else {
                        imageView17 = this.f7077a.f6467b;
                        if (imageView17 != null) {
                            imageView18 = this.f7077a.f6467b;
                            imageView18.setPivotX(0.0f);
                            imageView19 = this.f7077a.f6467b;
                            imageView19.setRotationY(0.0f);
                            imageView20 = this.f7077a.f6467b;
                            imageView20.animate().setDuration(this.f7078b).alpha(0.0f).setListener(new C1450dk(this)).start();
                        }
                    }
                    linearLayout5 = this.f7077a.f6472g;
                    if (linearLayout5 != null) {
                        linearLayout6 = this.f7077a.f6472g;
                        linearLayout6.animate().alpha(0.0f).setDuration(this.f7078b).setListener(new C1454do(this)).start();
                    }
                    colorSearchView5 = this.f7077a.f6469d;
                    if (colorSearchView5 != null) {
                        colorSearchView6 = this.f7077a.f6469d;
                        colorSearchView6.setAlpha(0.0f);
                        colorSearchView7 = this.f7077a.f6469d;
                        colorSearchView7.setVisibility(0);
                        colorSearchView8 = this.f7077a.f6469d;
                        colorSearchView8.animate().alpha(1.0f).setDuration(this.f7078b).start();
                    }
                    searchCancelButton7 = this.f7077a.f6470e;
                    if (searchCancelButton7 != null) {
                        searchCancelButton8 = this.f7077a.f6470e;
                        searchCancelButton8.setAlpha(0.0f);
                        imageView21 = this.f7077a.f6471f;
                        imageView21.setAlpha(0.0f);
                        searchCancelButton9 = this.f7077a.f6470e;
                        searchCancelButton9.setVisibility(0);
                        imageView22 = this.f7077a.f6471f;
                        imageView22.setVisibility(0);
                        searchCancelButton10 = this.f7077a.f6470e;
                        searchCancelButton10.setAlpha(0.0f);
                        searchCancelButton11 = this.f7077a.f6470e;
                        searchCancelButton11.setVisibility(0);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setDuration(this.f7078b);
                        ofFloat.addUpdateListener(new C1445df(this));
                        ofFloat.addListener(new C1446dg(this));
                        ofFloat.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (i == 0) {
            synchronized (this) {
                if (this.f7080d.compareAndSet(false, true)) {
                    atomicInteger2 = this.f7077a.f6474i;
                    atomicInteger2.set(0);
                    searchCancelButton = this.f7077a.f6470e;
                    searchCancelButton.setVisibility(4);
                    imageView = this.f7077a.f6471f;
                    imageView.setVisibility(4);
                    z = this.f7077a.f6485t;
                    if (z) {
                        imageView9 = this.f7077a.f6467b;
                        if (imageView9 != null) {
                            if (this.f7079c == 0) {
                                m4691h = this.f7077a.m4691h();
                                if (!m4691h) {
                                    imageView16 = this.f7077a.f6467b;
                                    this.f7079c = -imageView16.getLeft();
                                } else {
                                    int width2 = this.f7077a.getWidth();
                                    imageView14 = this.f7077a.f6467b;
                                    int right2 = width2 - imageView14.getRight();
                                    imageView15 = this.f7077a.f6467b;
                                    this.f7079c = right2 + imageView15.getWidth();
                                }
                            }
                            imageView10 = this.f7077a.f6467b;
                            imageView10.setVisibility(0);
                            int i3 = this.f7079c;
                            imageView11 = this.f7077a.f6467b;
                            imageView11.setPivotX(i3);
                            imageView12 = this.f7077a.f6467b;
                            imageView12.setRotationY(80.0f);
                            imageView13 = this.f7077a.f6467b;
                            imageView13.animate().setDuration(this.f7078b).rotationY(0.0f).setListener(new C1453dn(this)).start();
                        }
                    } else {
                        imageView2 = this.f7077a.f6467b;
                        if (imageView2 != null) {
                            imageView3 = this.f7077a.f6467b;
                            imageView3.setPivotX(0.0f);
                            imageView4 = this.f7077a.f6467b;
                            imageView4.setRotationY(0.0f);
                            imageView5 = this.f7077a.f6467b;
                            imageView5.setVisibility(0);
                            imageView6 = this.f7077a.f6467b;
                            imageView6.animate().setDuration(this.f7078b).alpha(1.0f).setListener(new C1451dl(this)).start();
                        }
                    }
                    linearLayout = this.f7077a.f6472g;
                    if (linearLayout != null) {
                        linearLayout2 = this.f7077a.f6472g;
                        linearLayout2.setVisibility(0);
                        linearLayout3 = this.f7077a.f6472g;
                        linearLayout3.setAlpha(0.0f);
                        linearLayout4 = this.f7077a.f6472g;
                        linearLayout4.animate().alpha(1.0f).setDuration(this.f7078b).setListener(null).start();
                    }
                    colorSearchView = this.f7077a.f6469d;
                    if (colorSearchView != null) {
                        colorSearchView2 = this.f7077a.f6469d;
                        colorSearchView2.setAlpha(1.0f);
                        colorSearchView3 = this.f7077a.f6469d;
                        colorSearchView3.setVisibility(0);
                        colorSearchView4 = this.f7077a.f6469d;
                        colorSearchView4.animate().alpha(0.0f).setDuration(this.f7078b).start();
                    }
                    searchCancelButton2 = this.f7077a.f6470e;
                    if (searchCancelButton2 != null) {
                        searchCancelButton3 = this.f7077a.f6470e;
                        searchCancelButton3.setAlpha(1.0f);
                        imageView7 = this.f7077a.f6471f;
                        imageView7.setAlpha(1.0f);
                        searchCancelButton4 = this.f7077a.f6470e;
                        if (!searchCancelButton4.f6490a) {
                            searchCancelButton6 = this.f7077a.f6470e;
                            searchCancelButton6.setVisibility(0);
                            imageView8 = this.f7077a.f6471f;
                            imageView8.setVisibility(0);
                        } else {
                            searchCancelButton5 = this.f7077a.f6470e;
                            searchCancelButton5.setPerformClicked(false);
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat2.setDuration(this.f7078b);
                        ofFloat2.addUpdateListener(new C1443dd(this));
                        ofFloat2.addListener(new C1444de(this));
                        ofFloat2.start();
                    }
                }
            }
        }
    }
}
