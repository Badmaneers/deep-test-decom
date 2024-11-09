package androidx.appcompat.app;

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
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.C0227bs;
import androidx.core.p024g.C0538w;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlertController {

    /* renamed from: A */
    private int f65A;

    /* renamed from: C */
    private CharSequence f67C;

    /* renamed from: D */
    private Drawable f68D;

    /* renamed from: E */
    private CharSequence f69E;

    /* renamed from: F */
    private Drawable f70F;

    /* renamed from: G */
    private CharSequence f71G;

    /* renamed from: H */
    private Drawable f72H;

    /* renamed from: J */
    private Drawable f74J;

    /* renamed from: K */
    private ImageView f75K;

    /* renamed from: L */
    private TextView f76L;

    /* renamed from: M */
    private TextView f77M;

    /* renamed from: N */
    private View f78N;

    /* renamed from: O */
    private int f79O;

    /* renamed from: P */
    private int f80P;

    /* renamed from: Q */
    private boolean f81Q;

    /* renamed from: a */
    final DialogC0072am f84a;

    /* renamed from: b */
    ListView f85b;

    /* renamed from: c */
    Button f86c;

    /* renamed from: d */
    Message f87d;

    /* renamed from: e */
    Button f88e;

    /* renamed from: f */
    Message f89f;

    /* renamed from: g */
    Button f90g;

    /* renamed from: h */
    Message f91h;

    /* renamed from: i */
    NestedScrollView f92i;

    /* renamed from: j */
    ListAdapter f93j;

    /* renamed from: l */
    int f95l;

    /* renamed from: m */
    int f96m;

    /* renamed from: n */
    int f97n;

    /* renamed from: o */
    int f98o;

    /* renamed from: p */
    Handler f99p;

    /* renamed from: q */
    private final Context f100q;

    /* renamed from: r */
    private final Window f101r;

    /* renamed from: s */
    private final int f102s;

    /* renamed from: t */
    private CharSequence f103t;

    /* renamed from: u */
    private CharSequence f104u;

    /* renamed from: v */
    private View f105v;

    /* renamed from: w */
    private int f106w;

    /* renamed from: x */
    private int f107x;

    /* renamed from: y */
    private int f108y;

    /* renamed from: z */
    private int f109z;

    /* renamed from: B */
    private boolean f66B = false;

    /* renamed from: I */
    private int f73I = 0;

    /* renamed from: k */
    int f94k = -1;

    /* renamed from: R */
    private int f82R = 0;

    /* renamed from: S */
    private final View.OnClickListener f83S = new ViewOnClickListenerC0089d(this);

    public AlertController(Context context, DialogC0072am dialogC0072am, Window window) {
        this.f100q = context;
        this.f84a = dialogC0072am;
        this.f101r = window;
        this.f99p = new HandlerC0099n(dialogC0072am);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.AlertDialog, R.attr.alertDialogStyle, 0);
        this.f79O = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_android_layout, 0);
        this.f80P = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.f95l = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listLayout, 0);
        this.f96m = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.f97n = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.f98o = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listItemLayout, 0);
        this.f81Q = obtainStyledAttributes.getBoolean(R.styleable.AlertDialog_showTitle, true);
        this.f102s = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dialogC0072am.m186b();
    }

    /* renamed from: c */
    private static boolean m52c(View view) {
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
            if (m52c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m59a(CharSequence charSequence) {
        this.f103t = charSequence;
        if (this.f76L != null) {
            this.f76L.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void m57a(View view) {
        this.f78N = view;
    }

    /* renamed from: b */
    public final void m62b(CharSequence charSequence) {
        this.f104u = charSequence;
        if (this.f77M != null) {
            this.f77M.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void m54a(int i) {
        this.f105v = null;
        this.f106w = i;
        this.f66B = false;
    }

    /* renamed from: b */
    public final void m61b(View view) {
        this.f105v = view;
        this.f106w = 0;
        this.f66B = false;
    }

    /* renamed from: a */
    public final void m58a(View view, int i, int i2, int i3, int i4) {
        this.f105v = view;
        this.f106w = 0;
        this.f66B = true;
        this.f107x = i;
        this.f108y = i2;
        this.f109z = i3;
        this.f65A = i4;
    }

    /* renamed from: a */
    public final void m55a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (onClickListener != null) {
            message = this.f99p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f71G = charSequence;
                this.f91h = message;
                this.f72H = drawable;
                return;
            case -2:
                this.f69E = charSequence;
                this.f89f = message;
                this.f70F = drawable;
                return;
            case -1:
                this.f67C = charSequence;
                this.f87d = message;
                this.f68D = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: b */
    public final void m60b(int i) {
        this.f74J = null;
        this.f73I = i;
        if (this.f75K != null) {
            if (i != 0) {
                this.f75K.setVisibility(0);
                this.f75K.setImageResource(this.f73I);
            } else {
                this.f75K.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void m56a(Drawable drawable) {
        this.f74J = drawable;
        this.f73I = 0;
        if (this.f75K != null) {
            if (drawable != null) {
                this.f75K.setVisibility(0);
                this.f75K.setImageDrawable(drawable);
            } else {
                this.f75K.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final int m63c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f100q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    private static ViewGroup m49a(View view, View view2) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m50a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: a */
    private static void m51a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* loaded from: classes.dex */
    public class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f110a;

        /* renamed from: b */
        private final int f111b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecycleListView);
            this.f111b = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f110a = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public final void m64a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f110a, getPaddingRight(), z2 ? getPaddingBottom() : this.f111b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m53a() {
        int i;
        View inflate;
        int i2;
        View findViewById;
        View findViewById2;
        if (this.f80P != 0 && this.f82R == 1) {
            i = this.f80P;
        } else {
            i = this.f79O;
        }
        this.f84a.setContentView(i);
        View findViewById3 = this.f101r.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        if (this.f105v != null) {
            inflate = this.f105v;
        } else {
            inflate = this.f106w != 0 ? LayoutInflater.from(this.f100q).inflate(this.f106w, viewGroup, false) : null;
        }
        boolean z = inflate != null;
        if (!z || !m52c(inflate)) {
            this.f101r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f101r.findViewById(R.id.custom);
            frameLayout.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
            if (this.f66B) {
                frameLayout.setPadding(this.f107x, this.f108y, this.f109z, this.f65A);
            }
            if (this.f85b != null) {
                ((C0227bs) viewGroup.getLayoutParams()).f1228g = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup m49a = m49a(findViewById7, findViewById4);
        ViewGroup m49a2 = m49a(findViewById8, findViewById5);
        ViewGroup m49a3 = m49a(findViewById9, findViewById6);
        this.f92i = (NestedScrollView) this.f101r.findViewById(R.id.scrollView);
        this.f92i.setFocusable(false);
        this.f92i.setNestedScrollingEnabled(false);
        this.f77M = (TextView) m49a2.findViewById(android.R.id.message);
        if (this.f77M != null) {
            if (this.f104u != null) {
                this.f77M.setText(this.f104u);
            } else {
                this.f77M.setVisibility(8);
                this.f92i.removeView(this.f77M);
                if (this.f85b != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f92i.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f92i);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f85b, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    m49a2.setVisibility(8);
                }
            }
        }
        this.f86c = (Button) m49a3.findViewById(android.R.id.button1);
        this.f86c.setOnClickListener(this.f83S);
        if (TextUtils.isEmpty(this.f67C) && this.f68D == null) {
            this.f86c.setVisibility(8);
            i2 = 0;
        } else {
            this.f86c.setText(this.f67C);
            if (this.f68D != null) {
                this.f68D.setBounds(0, 0, this.f102s, this.f102s);
                this.f86c.setCompoundDrawables(this.f68D, null, null, null);
            }
            this.f86c.setVisibility(0);
            i2 = 1;
        }
        this.f88e = (Button) m49a3.findViewById(android.R.id.button2);
        this.f88e.setOnClickListener(this.f83S);
        if (TextUtils.isEmpty(this.f69E) && this.f70F == null) {
            this.f88e.setVisibility(8);
        } else {
            this.f88e.setText(this.f69E);
            if (this.f70F != null) {
                this.f70F.setBounds(0, 0, this.f102s, this.f102s);
                this.f88e.setCompoundDrawables(this.f70F, null, null, null);
            }
            this.f88e.setVisibility(0);
            i2 |= 2;
        }
        this.f90g = (Button) m49a3.findViewById(android.R.id.button3);
        this.f90g.setOnClickListener(this.f83S);
        if (TextUtils.isEmpty(this.f71G) && this.f72H == null) {
            this.f90g.setVisibility(8);
        } else {
            this.f90g.setText(this.f71G);
            if (this.f68D != null) {
                this.f68D.setBounds(0, 0, this.f102s, this.f102s);
                this.f86c.setCompoundDrawables(this.f68D, null, null, null);
            }
            this.f90g.setVisibility(0);
            i2 |= 4;
        }
        Context context = this.f100q;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                m51a(this.f86c);
            } else if (i2 == 2) {
                m51a(this.f88e);
            } else if (i2 == 4) {
                m51a(this.f90g);
            }
        }
        if (!(i2 != 0)) {
            m49a3.setVisibility(8);
        }
        if (this.f78N != null) {
            m49a.addView(this.f78N, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f101r.findViewById(R.id.title_template).setVisibility(8);
        } else {
            this.f75K = (ImageView) this.f101r.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(this.f103t)) && this.f81Q) {
                this.f76L = (TextView) this.f101r.findViewById(R.id.alertTitle);
                this.f76L.setText(this.f103t);
                if (this.f73I != 0) {
                    this.f75K.setImageResource(this.f73I);
                } else if (this.f74J != null) {
                    this.f75K.setImageDrawable(this.f74J);
                } else {
                    this.f76L.setPadding(this.f75K.getPaddingLeft(), this.f75K.getPaddingTop(), this.f75K.getPaddingRight(), this.f75K.getPaddingBottom());
                    this.f75K.setVisibility(8);
                }
            } else {
                this.f101r.findViewById(R.id.title_template).setVisibility(8);
                this.f75K.setVisibility(8);
                m49a.setVisibility(8);
            }
        }
        boolean z2 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z3 = (m49a == null || m49a.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (m49a3 == null || m49a3.getVisibility() == 8) ? false : true;
        if (!z4 && m49a2 != null && (findViewById2 = m49a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z3 != 0) {
            if (this.f92i != null) {
                this.f92i.setClipToPadding(true);
            }
            View findViewById10 = (this.f104u == null && this.f85b == null) ? null : m49a.findViewById(R.id.titleDividerNoCustom);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (m49a2 != null && (findViewById = m49a2.findViewById(R.id.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        if (this.f85b instanceof RecycleListView) {
            ((RecycleListView) this.f85b).m64a(z3, z4);
        }
        if (!z2) {
            View view = this.f85b != null ? this.f85b : this.f92i;
            if (view != null) {
                int i3 = z3 | (z4 ? 2 : 0);
                View findViewById11 = this.f101r.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = this.f101r.findViewById(R.id.scrollIndicatorDown);
                if (Build.VERSION.SDK_INT >= 23) {
                    C0538w.m1872e(view, i3);
                    if (findViewById11 != null) {
                        m49a2.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        m49a2.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i3 & 1) == 0) {
                        m49a2.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (findViewById12 != null && (i3 & 2) == 0) {
                        m49a2.removeView(findViewById12);
                        findViewById12 = null;
                    }
                    if (findViewById11 != null || findViewById12 != null) {
                        if (this.f104u != null) {
                            this.f92i.setOnScrollChangeListener(new C0090e(this, findViewById11, findViewById12));
                            this.f92i.post(new RunnableC0091f(this, findViewById11, findViewById12));
                        } else if (this.f85b != null) {
                            this.f85b.setOnScrollListener(new C0092g(this, findViewById11, findViewById12));
                            this.f85b.post(new RunnableC0093h(this, findViewById11, findViewById12));
                        } else {
                            if (findViewById11 != null) {
                                m49a2.removeView(findViewById11);
                            }
                            if (findViewById12 != null) {
                                m49a2.removeView(findViewById12);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = this.f85b;
        if (listView == null || this.f93j == null) {
            return;
        }
        listView.setAdapter(this.f93j);
        int i4 = this.f94k;
        if (i4 >= 0) {
            listView.setItemChecked(i4, true);
            listView.setSelection(i4);
        }
    }
}
