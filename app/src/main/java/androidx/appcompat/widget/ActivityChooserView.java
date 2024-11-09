package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.core.p024g.AbstractC0518c;

/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C0188ag f835a;

    /* renamed from: b */
    final FrameLayout f836b;

    /* renamed from: c */
    final FrameLayout f837c;

    /* renamed from: d */
    AbstractC0518c f838d;

    /* renamed from: e */
    final DataSetObserver f839e;

    /* renamed from: f */
    PopupWindow.OnDismissListener f840f;

    /* renamed from: g */
    boolean f841g;

    /* renamed from: h */
    int f842h;

    /* renamed from: i */
    private final ViewOnClickListenerC0189ah f843i;

    /* renamed from: j */
    private final View f844j;

    /* renamed from: k */
    private final Drawable f845k;

    /* renamed from: l */
    private final ImageView f846l;

    /* renamed from: m */
    private final ImageView f847m;

    /* renamed from: n */
    private final int f848n;

    /* renamed from: o */
    private final ViewTreeObserver.OnGlobalLayoutListener f849o;

    /* renamed from: p */
    private C0228bt f850p;

    /* renamed from: q */
    private boolean f851q;

    /* renamed from: r */
    private int f852r;

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f839e = new C0183ab(this);
        this.f849o = new ViewTreeObserverOnGlobalLayoutListenerC0184ac(this);
        this.f842h = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActivityChooserView, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, R.styleable.ActivityChooserView, attributeSet, obtainStyledAttributes, i, 0);
        }
        this.f842h = obtainStyledAttributes.getInt(R.styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        this.f843i = new ViewOnClickListenerC0189ah(this);
        this.f844j = findViewById(R.id.activity_chooser_view_content);
        this.f845k = this.f844j.getBackground();
        this.f837c = (FrameLayout) findViewById(R.id.default_activity_button);
        this.f837c.setOnClickListener(this.f843i);
        this.f837c.setOnLongClickListener(this.f843i);
        this.f847m = (ImageView) this.f837c.findViewById(R.id.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout.setOnClickListener(this.f843i);
        frameLayout.setAccessibilityDelegate(new C0185ad(this));
        frameLayout.setOnTouchListener(new C0186ae(this, frameLayout));
        this.f836b = frameLayout;
        this.f846l = (ImageView) frameLayout.findViewById(R.id.image);
        this.f846l.setImageDrawable(drawable);
        this.f835a = new C0188ag(this);
        this.f835a.registerDataSetObserver(new C0187af(this));
        Resources resources = context.getResources();
        this.f848n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }

    public void setActivityChooserModel(C0313v c0313v) {
        this.f835a.m679a(c0313v);
        if (getListPopupWindow().mo393e()) {
            m574b();
            m573a();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f846l.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f846l.setContentDescription(getContext().getString(i));
    }

    public void setProvider(AbstractC0518c abstractC0518c) {
        this.f838d = abstractC0518c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int, boolean] */
    /* renamed from: a */
    public final void m572a(int i) {
        if (this.f835a.m685e() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f849o);
        ?? r0 = this.f837c.getVisibility() == 0 ? 1 : 0;
        int m683c = this.f835a.m683c();
        if (i != Integer.MAX_VALUE && m683c > i + r0) {
            this.f835a.m680a(true);
            this.f835a.m678a(i - 1);
        } else {
            this.f835a.m680a(false);
            this.f835a.m678a(i);
        }
        C0228bt listPopupWindow = getListPopupWindow();
        if (listPopupWindow.mo393e()) {
            return;
        }
        if (this.f841g || r0 == 0) {
            this.f835a.m681a(true, r0);
        } else {
            this.f835a.m681a(false, false);
        }
        listPopupWindow.m865e(Math.min(this.f835a.m677a(), this.f848n));
        listPopupWindow.mo391a_();
        if (this.f838d != null) {
            this.f838d.m1775a(true);
        }
        listPopupWindow.f1243c.setContentDescription(getContext().getString(R.string.abc_activitychooserview_choose_application));
        listPopupWindow.f1243c.setSelector(new ColorDrawable(0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0313v m685e = this.f835a.m685e();
        if (m685e != null) {
            m685e.registerObserver(this.f839e);
        }
        this.f851q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0313v m685e = this.f835a.m685e();
        if (m685e != null) {
            m685e.unregisterObserver(this.f839e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f849o);
        }
        if (getListPopupWindow().mo393e()) {
            m574b();
        }
        this.f851q = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        View view = this.f844j;
        if (this.f837c.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f844j.layout(0, 0, i3 - i, i4 - i2);
        if (getListPopupWindow().mo393e()) {
            return;
        }
        m574b();
    }

    public C0313v getDataModel() {
        return this.f835a.m685e();
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f840f = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.f842h = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f852r = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0228bt getListPopupWindow() {
        if (this.f850p == null) {
            this.f850p = new C0228bt(getContext());
            this.f850p.mo745a(this.f835a);
            this.f850p.m862b(this);
            this.f850p.m868j();
            this.f850p.m858a((AdapterView.OnItemClickListener) this.f843i);
            this.f850p.m859a((PopupWindow.OnDismissListener) this.f843i);
        }
        return this.f850p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m575c() {
        if (this.f835a.getCount() > 0) {
            this.f836b.setEnabled(true);
        } else {
            this.f836b.setEnabled(false);
        }
        int m683c = this.f835a.m683c();
        int m684d = this.f835a.m684d();
        if (m683c == 1 || (m683c > 1 && m684d > 0)) {
            this.f837c.setVisibility(0);
            ResolveInfo m682b = this.f835a.m682b();
            PackageManager packageManager = getContext().getPackageManager();
            this.f847m.setImageDrawable(m682b.loadIcon(packageManager));
            if (this.f852r != 0) {
                this.f837c.setContentDescription(getContext().getString(this.f852r, m682b.loadLabel(packageManager)));
            }
        } else {
            this.f837c.setVisibility(8);
        }
        if (this.f837c.getVisibility() == 0) {
            this.f844j.setBackgroundDrawable(this.f845k);
        } else {
            this.f844j.setBackgroundDrawable(null);
        }
    }

    /* loaded from: classes.dex */
    public class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f853a = {android.R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0276dn m943a = C0276dn.m943a(context, attributeSet, f853a);
            setBackgroundDrawable(m943a.m948a(0));
            m943a.m952b();
        }
    }

    /* renamed from: a */
    public final boolean m573a() {
        if (getListPopupWindow().mo393e() || !this.f851q) {
            return false;
        }
        this.f841g = false;
        m572a(this.f842h);
        return true;
    }

    /* renamed from: b */
    public final boolean m574b() {
        if (!getListPopupWindow().mo393e()) {
            return true;
        }
        getListPopupWindow().mo392d();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f849o);
        return true;
    }
}
