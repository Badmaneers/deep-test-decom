package com.color.support.widget.popupwindow;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import color.support.p043v7.appcompat.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ColorPopupListWindow.java */
/* renamed from: com.color.support.widget.popupwindow.a */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1585a extends PopupWindow implements View.OnLayoutChangeListener {

    /* renamed from: A */
    private boolean f7522A;

    /* renamed from: B */
    private boolean f7523B;

    /* renamed from: C */
    private boolean f7524C;

    /* renamed from: D */
    private Animation.AnimationListener f7525D;

    /* renamed from: a */
    private Context f7526a;

    /* renamed from: b */
    private BaseAdapter f7527b;

    /* renamed from: c */
    private BaseAdapter f7528c;

    /* renamed from: d */
    private BaseAdapter f7529d;

    /* renamed from: e */
    private View f7530e;

    /* renamed from: f */
    private Rect f7531f;

    /* renamed from: g */
    private Rect f7532g;

    /* renamed from: h */
    private Rect f7533h;

    /* renamed from: i */
    private Rect f7534i;

    /* renamed from: j */
    private List<C1589e> f7535j;

    /* renamed from: k */
    private ViewGroup f7536k;

    /* renamed from: l */
    private ListView f7537l;

    /* renamed from: m */
    private ListView f7538m;

    /* renamed from: n */
    private AdapterView.OnItemClickListener f7539n;

    /* renamed from: o */
    private Point f7540o;

    /* renamed from: p */
    private int[] f7541p;

    /* renamed from: q */
    private int[] f7542q;

    /* renamed from: r */
    private int[] f7543r;

    /* renamed from: s */
    private float f7544s;

    /* renamed from: t */
    private float f7545t;

    /* renamed from: u */
    private int f7546u;

    /* renamed from: v */
    private int f7547v;

    /* renamed from: w */
    private Interpolator f7548w;

    /* renamed from: x */
    private Interpolator f7549x;

    /* renamed from: y */
    private int f7550y;

    /* renamed from: z */
    private boolean f7551z;

    public ViewOnLayoutChangeListenerC1585a(Context context) {
        super(context);
        this.f7540o = new Point();
        this.f7541p = new int[2];
        this.f7542q = new int[2];
        this.f7543r = new int[4];
        this.f7525D = new AnimationAnimationListenerC1586b(this);
        this.f7526a = context;
        this.f7535j = new ArrayList();
        this.f7546u = context.getResources().getInteger(R.integer.oppo_animation_time_move_veryfast);
        this.f7547v = context.getResources().getInteger(R.integer.oppo_animation_time_move_veryfast);
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, R.interpolator.oppo_curve_opacity_inout);
        this.f7549x = loadInterpolator;
        this.f7548w = loadInterpolator;
        this.f7550y = context.getResources().getDimensionPixelSize(R.dimen.color_popup_list_window_min_width);
        this.f7538m = new ListView(context);
        this.f7538m.setDivider(null);
        this.f7538m.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.color_popup_list_window_layout, (ViewGroup) null);
        this.f7537l = (ListView) frameLayout.findViewById(R.id.color_popup_list_view);
        Drawable drawable = context.getResources().getDrawable(R.drawable.color_popup_list_window_bg);
        this.f7534i = new Rect();
        drawable.getPadding(this.f7534i);
        frameLayout.setBackground(drawable);
        this.f7536k = frameLayout;
        setBackgroundDrawable(new ColorDrawable(0));
        setClippingEnabled(false);
        if (Build.VERSION.SDK_INT > 23) {
            setExitTransition(null);
            setEnterTransition(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c2, code lost:            if (r13.f7523B != false) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b5, code lost:            r4 = r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b3, code lost:            if (r13.f7523B != false) goto L38;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5328a(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.popupwindow.ViewOnLayoutChangeListenerC1585a.m5328a(android.view.View):void");
    }

    /* renamed from: a */
    public final void m5327a() {
        BaseAdapter baseAdapter = this.f7529d;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((this.f7531f.right - this.f7531f.left) - this.f7534i.left) - this.f7534i.right, RecyclerView.UNDEFINED_DURATION);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = baseAdapter.getCount();
        int i = 0;
        int i2 = 0;
        int i3 = makeMeasureSpec2;
        View view = null;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = baseAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = baseAdapter.getView(i5, view, this.f7538m);
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view.getLayoutParams();
            if (layoutParams.height != -2) {
                i3 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            }
            view.measure(makeMeasureSpec, i3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (measuredWidth > i) {
                i = measuredWidth;
            }
            i2 += measuredHeight;
        }
        setWidth(Math.max(i, this.f7550y) + this.f7534i.left + this.f7534i.right);
        setHeight(i2 + this.f7534i.top + this.f7534i.bottom);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Rect rect = new Rect(i, i2, i3, i4);
        Rect rect2 = new Rect(i5, i6, i7, i8);
        if (!isShowing() || rect.equals(rect2)) {
            return;
        }
        m5326c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m5326c() {
        super.dismiss();
        this.f7524C = false;
        this.f7530e.getRootView().removeOnLayoutChangeListener(this);
        setContentView(null);
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (this.f7524C) {
            return;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, 1, this.f7544s, 1, this.f7545t);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        scaleAnimation.setDuration(this.f7546u);
        scaleAnimation.setInterpolator(this.f7548w);
        alphaAnimation.setDuration(this.f7547v);
        alphaAnimation.setInterpolator(this.f7549x);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(this.f7525D);
        this.f7536k.startAnimation(animationSet);
    }

    /* renamed from: a */
    public final void m5330a(List<C1589e> list) {
        if (list != null) {
            this.f7535j = list;
            this.f7527b = new C1587c(this.f7526a, list);
        }
    }

    /* renamed from: a */
    public final void m5329a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f7539n = onItemClickListener;
    }

    /* renamed from: b */
    public final ListView m5331b() {
        return this.f7537l;
    }
}
