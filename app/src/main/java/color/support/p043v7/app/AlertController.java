package color.support.p043v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0072am;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    boolean f4845A;

    /* renamed from: B */
    private final Context f4846B;

    /* renamed from: C */
    private final int f4847C;

    /* renamed from: D */
    private View f4848D;

    /* renamed from: E */
    private int f4849E;

    /* renamed from: F */
    private int f4850F;

    /* renamed from: G */
    private int f4851G;

    /* renamed from: H */
    private int f4852H;

    /* renamed from: I */
    private int f4853I;

    /* renamed from: K */
    private Drawable f4855K;

    /* renamed from: L */
    private Drawable f4856L;

    /* renamed from: M */
    private Drawable f4857M;

    /* renamed from: O */
    private Drawable f4859O;

    /* renamed from: P */
    private ImageView f4860P;

    /* renamed from: Q */
    private TextView f4861Q;

    /* renamed from: R */
    private TextView f4862R;

    /* renamed from: S */
    private View f4863S;

    /* renamed from: T */
    private int f4864T;

    /* renamed from: U */
    private boolean f4865U;

    /* renamed from: a */
    final DialogC0072am f4869a;

    /* renamed from: b */
    final Window f4870b;

    /* renamed from: c */
    CharSequence f4871c;

    /* renamed from: d */
    CharSequence f4872d;

    /* renamed from: e */
    ListView f4873e;

    /* renamed from: f */
    Button f4874f;

    /* renamed from: g */
    CharSequence f4875g;

    /* renamed from: h */
    Message f4876h;

    /* renamed from: i */
    Button f4877i;

    /* renamed from: j */
    CharSequence f4878j;

    /* renamed from: k */
    Message f4879k;

    /* renamed from: l */
    Button f4880l;

    /* renamed from: m */
    CharSequence f4881m;

    /* renamed from: n */
    Message f4882n;

    /* renamed from: o */
    ScrollView f4883o;

    /* renamed from: p */
    ListAdapter f4884p;

    /* renamed from: r */
    protected int f4886r;

    /* renamed from: s */
    int f4887s;

    /* renamed from: t */
    int f4888t;

    /* renamed from: u */
    int f4889u;

    /* renamed from: v */
    int f4890v;

    /* renamed from: w */
    Handler f4891w;

    /* renamed from: y */
    boolean f4893y;

    /* renamed from: z */
    boolean f4894z;

    /* renamed from: J */
    private boolean f4854J = false;

    /* renamed from: N */
    private int f4858N = 0;

    /* renamed from: q */
    int f4885q = -1;

    /* renamed from: V */
    private int f4866V = 0;

    /* renamed from: W */
    private int f4867W = 0;

    /* renamed from: x */
    boolean f4892x = false;

    /* renamed from: X */
    private final View.OnClickListener f4868X = new ViewOnClickListenerC1190a(this);

    public AlertController(Context context, DialogC0072am dialogC0072am, Window window) {
        this.f4846B = context;
        this.f4869a = dialogC0072am;
        this.f4870b = window;
        this.f4891w = new HandlerC1201k(dialogC0072am);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.ColorSupportAlertDialog, R.attr.colorAlertDialogStyle, 0);
        this.f4886r = obtainStyledAttributes.getResourceId(R.styleable.ColorSupportAlertDialog_android_layout, 0);
        this.f4864T = obtainStyledAttributes.getResourceId(R.styleable.ColorSupportAlertDialog_buttonPanelSideLayout, 0);
        this.f4887s = obtainStyledAttributes.getResourceId(R.styleable.ColorSupportAlertDialog_listLayout, 0);
        this.f4888t = obtainStyledAttributes.getResourceId(R.styleable.ColorSupportAlertDialog_multiChoiceItemLayout, 0);
        this.f4889u = obtainStyledAttributes.getResourceId(R.styleable.ColorSupportAlertDialog_singleChoiceItemLayout, 0);
        this.f4890v = obtainStyledAttributes.getResourceId(R.styleable.ColorSupportAlertDialog_listItemLayout, 0);
        this.f4865U = obtainStyledAttributes.getBoolean(R.styleable.ColorSupportAlertDialog_showTitle, true);
        this.f4847C = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSupportAlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dialogC0072am.m186b();
    }

    /* renamed from: c */
    private static boolean m3951c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m3951c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m3952a() {
        this.f4869a.setContentView(mo3960b());
        mo3966c();
    }

    /* renamed from: b */
    public int mo3960b() {
        if (this.f4864T == 0) {
            return this.f4886r;
        }
        if (this.f4866V == 1) {
            return this.f4864T;
        }
        return this.f4886r;
    }

    /* renamed from: a */
    public final void m3959a(CharSequence charSequence) {
        this.f4871c = charSequence;
        if (this.f4861Q != null) {
            this.f4861Q.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void m3956a(View view) {
        this.f4863S = view;
    }

    /* renamed from: b */
    public final void m3964b(CharSequence charSequence) {
        this.f4872d = charSequence;
        if (this.f4862R != null) {
            this.f4862R.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void m3953a(int i) {
        this.f4848D = null;
        this.f4849E = i;
        this.f4854J = false;
    }

    /* renamed from: b */
    public final void m3962b(View view) {
        this.f4848D = view;
        this.f4849E = 0;
        this.f4854J = false;
    }

    /* renamed from: a */
    public final void m3957a(View view, int i, int i2, int i3, int i4) {
        this.f4848D = view;
        this.f4849E = 0;
        this.f4854J = true;
        this.f4850F = i;
        this.f4851G = i2;
        this.f4852H = i3;
        this.f4853I = i4;
    }

    /* renamed from: a */
    public final void m3954a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (onClickListener != null) {
            message = this.f4891w.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f4881m = charSequence;
                this.f4882n = message;
                this.f4857M = drawable;
                return;
            case -2:
                this.f4878j = charSequence;
                this.f4879k = message;
                this.f4856L = drawable;
                return;
            case -1:
                this.f4875g = charSequence;
                this.f4876h = message;
                this.f4855K = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: b */
    public final void m3961b(int i) {
        this.f4859O = null;
        this.f4858N = i;
        if (this.f4860P != null) {
            if (i != 0) {
                this.f4860P.setVisibility(0);
                this.f4860P.setImageResource(this.f4858N);
            } else {
                this.f4860P.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void m3955a(Drawable drawable) {
        this.f4859O = drawable;
        this.f4858N = 0;
        if (this.f4860P != null) {
            if (drawable != null) {
                this.f4860P.setVisibility(0);
                this.f4860P.setImageDrawable(drawable);
            } else {
                this.f4860P.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final int m3965c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f4846B.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    private static ViewGroup m3948a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public void mo3966c() {
        View inflate;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f4870b.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        if (this.f4848D != null) {
            inflate = this.f4848D;
        } else {
            inflate = this.f4849E != 0 ? LayoutInflater.from(this.f4846B).inflate(this.f4849E, viewGroup, false) : null;
        }
        boolean z = inflate != null;
        if (!z || !m3951c(inflate)) {
            this.f4870b.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f4870b.findViewById(R.id.custom);
            frameLayout.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
            if (this.f4854J) {
                frameLayout.setPadding(this.f4850F, this.f4851G, this.f4852H, this.f4853I);
            }
            if (this.f4873e != null) {
                ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup m3948a = m3948a(findViewById7, findViewById4);
        ViewGroup m3948a2 = m3948a(findViewById8, findViewById5);
        ViewGroup m3948a3 = m3948a(findViewById9, findViewById6);
        mo3958a(m3948a2);
        mo3963b(m3948a3);
        if (this.f4863S != null) {
            m3948a.addView(this.f4863S, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f4870b.findViewById(R.id.title_template).setVisibility(8);
        } else {
            this.f4860P = (ImageView) this.f4870b.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(this.f4871c)) && this.f4865U) {
                this.f4861Q = (TextView) this.f4870b.findViewById(R.id.alertTitle);
                this.f4861Q.setText(this.f4871c);
                if (this.f4858N != 0) {
                    this.f4860P.setImageResource(this.f4858N);
                } else if (this.f4859O != null) {
                    this.f4860P.setImageDrawable(this.f4859O);
                } else {
                    this.f4861Q.setPadding(this.f4860P.getPaddingLeft(), this.f4860P.getPaddingTop(), this.f4860P.getPaddingRight(), this.f4860P.getPaddingBottom());
                    this.f4860P.setVisibility(8);
                }
            } else {
                this.f4870b.findViewById(R.id.title_template).setVisibility(8);
                this.f4860P.setVisibility(8);
                m3948a.setVisibility(8);
            }
        }
        boolean z2 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z3 = (m3948a == null || m3948a.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (m3948a3 == null || m3948a3.getVisibility() == 8) ? false : true;
        if (!z4 && m3948a2 != null && (findViewById2 = m3948a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z3 != 0) {
            if (this.f4883o != null) {
                this.f4883o.setClipToPadding(true);
            }
            View findViewById10 = (this.f4872d == null && this.f4873e == null) ? null : m3948a.findViewById(R.id.titleDividerNoCustom);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (m3948a2 != null && (findViewById = m3948a2.findViewById(R.id.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        if (this.f4873e instanceof RecycleListView) {
            ((RecycleListView) this.f4873e).m3969a(z3, z4);
        }
        if (!z2) {
            if ((this.f4873e != null ? this.f4873e : this.f4883o) != null) {
                int i = z3 | (z4 ? (char) 2 : (char) 0);
                View findViewById11 = this.f4870b.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = this.f4870b.findViewById(R.id.scrollIndicatorDown);
                if (Build.VERSION.SDK_INT >= 23) {
                    if (findViewById11 != null) {
                        m3948a2.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        m3948a2.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i & 1) == 0) {
                        m3948a2.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (findViewById12 != null && (2 & i) == 0) {
                        m3948a2.removeView(findViewById12);
                        findViewById12 = null;
                    }
                    if (findViewById11 != null || findViewById12 != null) {
                        if (this.f4872d != null) {
                            this.f4883o.setOnScrollChangeListener(new ViewOnScrollChangeListenerC1192b(this, findViewById11, findViewById12));
                            this.f4883o.post(new RunnableC1193c(this, findViewById11, findViewById12));
                        } else if (this.f4873e != null) {
                            this.f4873e.setOnScrollListener(new C1194d(this, findViewById11, findViewById12));
                            this.f4873e.post(new RunnableC1195e(this, findViewById11, findViewById12));
                        } else {
                            if (findViewById11 != null) {
                                m3948a2.removeView(findViewById11);
                            }
                            if (findViewById12 != null) {
                                m3948a2.removeView(findViewById12);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = this.f4873e;
        if (listView == null || this.f4884p == null) {
            return;
        }
        listView.setAdapter(this.f4884p);
        int i2 = this.f4885q;
        if (i2 >= 0) {
            listView.setItemChecked(i2, true);
            listView.setSelection(i2);
        }
    }

    /* renamed from: a */
    public void mo3958a(ViewGroup viewGroup) {
        this.f4883o = (ScrollView) this.f4870b.findViewById(R.id.scrollView);
        this.f4883o.setFocusable(false);
        this.f4883o.setNestedScrollingEnabled(false);
        this.f4862R = (TextView) viewGroup.findViewById(android.R.id.message);
        if (this.f4862R == null) {
            return;
        }
        if (this.f4872d != null) {
            this.f4862R.setText(this.f4872d);
            return;
        }
        this.f4862R.setVisibility(8);
        this.f4883o.removeView(this.f4862R);
        if (this.f4873e != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f4883o.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f4883o);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f4873e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    public static void m3949a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: b */
    public void mo3963b(ViewGroup viewGroup) {
        int i;
        this.f4874f = (Button) viewGroup.findViewById(android.R.id.button1);
        this.f4874f.setOnClickListener(this.f4868X);
        if (TextUtils.isEmpty(this.f4875g) && this.f4855K == null) {
            this.f4874f.setVisibility(8);
            i = 0;
        } else {
            this.f4874f.setText(this.f4875g);
            if (this.f4855K != null) {
                this.f4855K.setBounds(0, 0, this.f4847C, this.f4847C);
                this.f4874f.setCompoundDrawables(this.f4855K, null, null, null);
            }
            this.f4874f.setVisibility(0);
            i = 1;
        }
        this.f4877i = (Button) viewGroup.findViewById(android.R.id.button2);
        this.f4877i.setOnClickListener(this.f4868X);
        if (TextUtils.isEmpty(this.f4878j) && this.f4856L == null) {
            this.f4877i.setVisibility(8);
        } else {
            this.f4877i.setText(this.f4878j);
            if (this.f4856L != null) {
                this.f4856L.setBounds(0, 0, this.f4847C, this.f4847C);
                this.f4877i.setCompoundDrawables(this.f4856L, null, null, null);
            }
            this.f4877i.setVisibility(0);
            i |= 2;
        }
        this.f4880l = (Button) viewGroup.findViewById(android.R.id.button3);
        this.f4880l.setOnClickListener(this.f4868X);
        if (TextUtils.isEmpty(this.f4881m) && this.f4857M == null) {
            this.f4880l.setVisibility(8);
        } else {
            this.f4880l.setText(this.f4881m);
            if (this.f4855K != null) {
                this.f4855K.setBounds(0, 0, this.f4847C, this.f4847C);
                this.f4874f.setCompoundDrawables(this.f4855K, null, null, null);
            }
            this.f4880l.setVisibility(0);
            i |= 4;
        }
        Context context = this.f4846B;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                m3950a(this.f4874f);
            } else if (i == 2) {
                m3950a(this.f4877i);
            } else if (i == 4) {
                m3950a(this.f4880l);
            }
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    private static void m3950a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final int m3967d() {
        return this.f4867W;
    }

    /* renamed from: d */
    public final void m3968d(int i) {
        this.f4867W = i;
    }

    /* loaded from: classes.dex */
    public class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f4895a;

        /* renamed from: b */
        private final int f4896b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecycleListView);
            this.f4896b = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f4895a = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public final void m3969a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f4895a, getPaddingRight(), z2 ? getPaddingBottom() : this.f4896b);
        }
    }
}
