package com.color.support.widget.slideselect;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import color.support.p043v7.appcompat.R;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ColorSlideSelectView extends RelativeLayout implements InterfaceC1627j {

    /* renamed from: a */
    static final /* synthetic */ boolean f7745a = !ColorSlideSelectView.class.desiredAssertionStatus();

    /* renamed from: b */
    private ArrayAdapter<String> f7746b;

    /* renamed from: c */
    private ArrayList f7747c;

    /* renamed from: d */
    private Context f7748d;

    /* renamed from: e */
    private ColorSelectListView f7749e;

    /* renamed from: f */
    private boolean f7750f;

    /* renamed from: g */
    private boolean f7751g;

    /* renamed from: h */
    private int f7752h;

    /* renamed from: i */
    private int f7753i;

    /* renamed from: j */
    private long f7754j;

    /* renamed from: k */
    private Handler f7755k;

    /* renamed from: l */
    private boolean f7756l;

    /* renamed from: m */
    private RunnableC1623f f7757m;

    /* renamed from: n */
    private boolean f7758n;

    /* renamed from: o */
    private int f7759o;

    /* renamed from: p */
    private int f7760p;

    /* renamed from: q */
    private Context f7761q;

    /* renamed from: r */
    private View f7762r;

    /* renamed from: s */
    private View f7763s;

    /* renamed from: t */
    private int f7764t;

    /* renamed from: u */
    private int f7765u;

    /* renamed from: v */
    private InterfaceC1624g f7766v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ boolean m5434h(ColorSlideSelectView colorSlideSelectView) {
        colorSlideSelectView.f7751g = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ boolean m5435i(ColorSlideSelectView colorSlideSelectView) {
        colorSlideSelectView.f7756l = true;
        return true;
    }

    public void setOnSelectionChangeListerner(InterfaceC1624g interfaceC1624g) {
        this.f7766v = interfaceC1624g;
    }

    public ColorSlideSelectView(Context context) {
        this(context, null);
        this.f7761q = context;
    }

    public ColorSlideSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f7761q = context;
    }

    public ColorSlideSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7746b = null;
        this.f7747c = null;
        this.f7749e = null;
        this.f7752h = 0;
        this.f7755k = new Handler();
        this.f7761q = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorSlideSelectView);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.ColorSlideSelectView_item_font_size) {
                this.f7753i = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == R.styleable.ColorSlideSelectView_color_slide_selector_data_array) {
                this.f7747c = new ArrayList(Arrays.asList(getResources().getStringArray(obtainStyledAttributes.getResourceId(index, 0))));
            } else if (index == R.styleable.ColorSlideSelectView_color_slide_selector_selected_index) {
                this.f7752h = obtainStyledAttributes.getInt(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
        this.f7748d = context;
        this.f7759o = getResources().getDimensionPixelSize(R.dimen.color_slide_selector_item_height);
        this.f7760p = getResources().getDimensionPixelSize(R.dimen.color_slide_selector_item_height);
        this.f7764t = getResources().getDimensionPixelSize(R.dimen.color_slide_selector_item_height);
        this.f7765u = getResources().getDimensionPixelSize(R.dimen.color_slide_selector_item_height);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (!f7745a && layoutInflater == null) {
            throw new AssertionError();
        }
        layoutInflater.inflate(R.layout.secletor_color_slide_select_list_view, (ViewGroup) this, true);
        this.f7749e = (ColorSelectListView) findViewById(R.id.list_view);
        this.f7749e.setOnFingerUpListener(this);
        if (this.f7747c != null) {
            setAdapter(new C1625h(context, R.layout.list_item, this.f7747c, Integer.valueOf(this.f7759o), 16));
        }
    }

    public void setColorSlideView(View view) {
        setClickView(view);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f7750f || this.f7746b == null) {
            return;
        }
        m5425a();
        this.f7749e.setAdapter((ListAdapter) this.f7746b);
        this.f7750f = true;
    }

    /* renamed from: a */
    private void m5425a() {
        int[] iArr = new int[2];
        int statusBarHeight = getStatusBarHeight();
        int height = getHeight() + statusBarHeight;
        if (this.f7762r != null) {
            this.f7762r.getLocationInWindow(iArr);
            this.f7760p = this.f7762r.getHeight();
        }
        if (this.f7746b != null && (this.f7746b instanceof C1625h)) {
            ((C1625h) this.f7746b).m5437a(Integer.valueOf(this.f7759o));
        }
        getLocationInWindow(new int[2]);
        int i = (height / 2) - (this.f7759o / 2);
        int count = this.f7746b.getCount();
        int i2 = count / 2;
        int i3 = this.f7759o * i2;
        if (iArr[1] - (this.f7760p / 2) > i) {
            int i4 = height - iArr[1];
            if (i4 < i3) {
                m5427b((iArr[1] - this.f7759o) - (((count - (i4 / this.f7759o)) - 1) * this.f7759o));
                return;
            } else {
                m5427b(iArr[1] - (i2 * this.f7759o));
                return;
            }
        }
        if ((iArr[1] - this.f7759o) - statusBarHeight < i3) {
            m5427b(iArr[1] - (((iArr[1] - this.f7759o) / this.f7759o) * this.f7759o));
        } else {
            m5427b(iArr[1] - (i2 * this.f7759o));
        }
    }

    /* renamed from: b */
    private void m5427b(int i) {
        new Space(this.f7748d).setMinimumHeight(i);
        if (i > this.f7764t) {
            i -= this.f7764t;
        }
        setPadding(0, i + 30, 0, 0);
    }

    public void setSelectIndex(int i) {
        this.f7752h = i;
    }

    int getStatusBarHeight() {
        int identifier = this.f7748d.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return this.f7748d.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public void setAdapter(ArrayAdapter arrayAdapter) {
        this.f7746b = arrayAdapter;
    }

    public void setClickView(View view) {
        this.f7762r = view;
        if (this.f7762r == null) {
            return;
        }
        this.f7762r.setOnClickListener(new ViewOnClickListenerC1619b(this));
        this.f7762r.setOnTouchListener(new ViewOnTouchListenerC1620c(this));
    }

    @Override // com.color.support.widget.slideselect.InterfaceC1627j
    /* renamed from: a */
    public final void mo5436a(int i) {
        this.f7749e.setEnabled(false);
        this.f7751g = false;
        setVisibility(4);
        try {
            if (this.f7762r != null && i != -10) {
                TextView textView = (TextView) this.f7762r.findViewById(R.id.color_statusText_select);
                if (textView != null) {
                    textView.setText(this.f7746b.getItem(i));
                }
                this.f7752h = i;
                if (this.f7766v != null) {
                    this.f7746b.getItem(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1622e(this));
        startAnimation(alphaAnimation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ColorSelectListView colorSelectListView = this.f7749e;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        boolean z = false;
        if (colorSelectListView != null) {
            int[] iArr = new int[2];
            colorSelectListView.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int measuredWidth = colorSelectListView.getMeasuredWidth() + i;
            int measuredHeight = colorSelectListView.getMeasuredHeight() + i2;
            if (y >= i2 && y <= measuredHeight && x >= i && x <= measuredWidth) {
                z = true;
            }
        }
        if (z) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            mo5436a(-10);
        }
        return true;
    }

    public void setBlurView(View view) {
        this.f7763s = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m5428b(ColorSlideSelectView colorSlideSelectView) {
        colorSlideSelectView.m5425a();
        if (colorSlideSelectView.f7751g) {
            return;
        }
        colorSlideSelectView.f7749e.setEnabled(true);
        colorSlideSelectView.f7749e.setBackgroundDrawable(colorSlideSelectView.getResources().getDrawable(R.color.color_slide_selector_color_listview_bg));
        colorSlideSelectView.setVisibility(0);
        if (colorSlideSelectView.f7749e.getAdapter() != null) {
            for (int i = 0; i < colorSlideSelectView.f7749e.getAdapter().getCount(); i++) {
                if (i != colorSlideSelectView.f7752h) {
                    ((TextView) ((FrameLayout) colorSlideSelectView.f7749e.getChildAt(i)).getChildAt(0)).setTextColor(colorSlideSelectView.getResources().getColor(R.color.color_select_prefernce_default_tv_color));
                }
            }
            colorSlideSelectView.f7749e.getChildAt(colorSlideSelectView.f7752h).setBackgroundColor(colorSlideSelectView.getResources().getColor(android.R.color.transparent));
            ((TextView) ((FrameLayout) colorSlideSelectView.f7749e.getChildAt(colorSlideSelectView.f7752h)).getChildAt(0)).setTextColor(colorSlideSelectView.getResources().getColor(R.attr.colorPrimaryColor));
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            alphaAnimation.setAnimationListener(new C1621d(colorSlideSelectView));
            colorSlideSelectView.startAnimation(alphaAnimation);
        }
    }
}
