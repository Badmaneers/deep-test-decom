package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.appcompat.view.C0127a;
import androidx.appcompat.view.menu.AbstractC0157d;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0146af;
import androidx.appcompat.view.menu.InterfaceC0147ag;
import androidx.appcompat.view.menu.SubMenuC0153am;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.AbstractC0518c;
import androidx.core.p024g.InterfaceC0519d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ActionMenuPresenter extends AbstractC0157d implements InterfaceC0519d {

    /* renamed from: g */
    OverflowMenuButton f800g;

    /* renamed from: h */
    C0305n f801h;

    /* renamed from: i */
    C0301j f802i;

    /* renamed from: j */
    RunnableC0303l f803j;

    /* renamed from: k */
    final C0306o f804k;

    /* renamed from: l */
    int f805l;

    /* renamed from: m */
    private Drawable f806m;

    /* renamed from: n */
    private boolean f807n;

    /* renamed from: o */
    private boolean f808o;

    /* renamed from: p */
    private boolean f809p;

    /* renamed from: q */
    private int f810q;

    /* renamed from: r */
    private int f811r;

    /* renamed from: s */
    private int f812s;

    /* renamed from: t */
    private boolean f813t;

    /* renamed from: u */
    private boolean f814u;

    /* renamed from: v */
    private boolean f815v;

    /* renamed from: w */
    private boolean f816w;

    /* renamed from: x */
    private int f817x;

    /* renamed from: y */
    private final SparseBooleanArray f818y;

    /* renamed from: z */
    private C0302k f819z;

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.f818y = new SparseBooleanArray();
        this.f804k = new C0306o(this);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0157d, androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo357a(Context context, C0168o c0168o) {
        super.mo357a(context, c0168o);
        Resources resources = context.getResources();
        C0127a m301a = C0127a.m301a(context);
        if (!this.f809p) {
            this.f808o = m301a.m303b();
        }
        if (!this.f815v) {
            this.f810q = m301a.m304c();
        }
        if (!this.f813t) {
            this.f812s = m301a.m302a();
        }
        int i = this.f810q;
        if (this.f808o) {
            if (this.f800g == null) {
                this.f800g = new OverflowMenuButton(this.f608a);
                if (this.f807n) {
                    this.f800g.setImageDrawable(this.f806m);
                    this.f806m = null;
                    this.f807n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f800g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f800g.getMeasuredWidth();
        } else {
            this.f800g = null;
        }
        this.f811r = i;
        this.f817x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: d */
    public final void m547d() {
        if (!this.f813t) {
            this.f812s = C0127a.m301a(this.f609b).m302a();
        }
        if (this.f610c != null) {
            this.f610c.mo458b(true);
        }
    }

    /* renamed from: e */
    public final void m548e() {
        this.f808o = true;
        this.f809p = true;
    }

    /* renamed from: b */
    public final void m545b(boolean z) {
        this.f816w = z;
    }

    /* renamed from: a */
    public final void m543a(Drawable drawable) {
        if (this.f800g != null) {
            this.f800g.setImageDrawable(drawable);
        } else {
            this.f807n = true;
            this.f806m = drawable;
        }
    }

    /* renamed from: g */
    public final Drawable m549g() {
        if (this.f800g != null) {
            return this.f800g.getDrawable();
        }
        if (this.f807n) {
            return this.f806m;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0157d
    /* renamed from: a */
    public final InterfaceC0146af mo410a(ViewGroup viewGroup) {
        InterfaceC0146af interfaceC0146af = this.f613f;
        InterfaceC0146af mo410a = super.mo410a(viewGroup);
        if (interfaceC0146af != mo410a) {
            ((ActionMenuView) mo410a).setPresenter(this);
        }
        return mo410a;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0157d
    /* renamed from: a */
    public final View mo408a(C0172s c0172s, View view, ViewGroup viewGroup) {
        View actionView = c0172s.getActionView();
        if (actionView == null || c0172s.m495j()) {
            actionView = super.mo408a(c0172s, view, viewGroup);
        }
        actionView.setVisibility(c0172s.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m556a(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0157d
    /* renamed from: a */
    public final void mo412a(C0172s c0172s, InterfaceC0147ag interfaceC0147ag) {
        interfaceC0147ag.mo338a(c0172s);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0147ag;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f613f);
        if (this.f819z == null) {
            this.f819z = new C0302k(this);
        }
        actionMenuItemView.setPopupCallback(this.f819z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0157d
    /* renamed from: a */
    public final boolean mo414a(C0172s c0172s) {
        return c0172s.m492g();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0157d, androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo387a(boolean z) {
        super.mo387a(z);
        ((View) this.f613f).requestLayout();
        boolean z2 = false;
        if (this.f610c != null) {
            ArrayList<C0172s> m470n = this.f610c.m470n();
            int size = m470n.size();
            for (int i = 0; i < size; i++) {
                AbstractC0518c mo351a = m470n.get(i).mo351a();
                if (mo351a != null) {
                    mo351a.m1774a(this);
                }
            }
        }
        ArrayList<C0172s> m471o = this.f610c != null ? this.f610c.m471o() : null;
        if (this.f808o && m471o != null) {
            int size2 = m471o.size();
            if (size2 == 1) {
                z2 = !m471o.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f800g == null) {
                this.f800g = new OverflowMenuButton(this.f608a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f800g.getParent();
            if (viewGroup != this.f613f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f800g);
                }
                ((ActionMenuView) this.f613f).addView(this.f800g, ActionMenuView.m557b());
            }
        } else if (this.f800g != null && this.f800g.getParent() == this.f613f) {
            ((ViewGroup) this.f613f).removeView(this.f800g);
        }
        ((ActionMenuView) this.f613f).setOverflowReserved(this.f808o);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0157d
    /* renamed from: a */
    public final boolean mo413a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f800g) {
            return false;
        }
        return super.mo413a(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.AbstractC0157d, androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final boolean mo388a(SubMenuC0153am subMenuC0153am) {
        View view;
        boolean z = false;
        if (!subMenuC0153am.hasVisibleItems()) {
            return false;
        }
        SubMenuC0153am subMenuC0153am2 = subMenuC0153am;
        while (subMenuC0153am2.m404s() != this.f610c) {
            subMenuC0153am2 = (SubMenuC0153am) subMenuC0153am2.m404s();
        }
        MenuItem item = subMenuC0153am2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.f613f;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                view = viewGroup.getChildAt(i);
                if ((view instanceof InterfaceC0147ag) && ((InterfaceC0147ag) view).getItemData() == item) {
                    break;
                }
            }
        }
        view = 0;
        if (view == 0) {
            return false;
        }
        this.f805l = subMenuC0153am.getItem().getItemId();
        int size = subMenuC0153am.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item2 = subMenuC0153am.getItem(i2);
            if (item2.isVisible() && item2.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        this.f802i = new C0301j(this, this.f609b, subMenuC0153am, view);
        this.f802i.m376a(z);
        this.f802i.m378b();
        super.mo388a(subMenuC0153am);
        return true;
    }

    /* renamed from: h */
    public final boolean m550h() {
        if (!this.f808o || m554l() || this.f610c == null || this.f613f == null || this.f803j != null || this.f610c.m471o().isEmpty()) {
            return false;
        }
        this.f803j = new RunnableC0303l(this, new C0305n(this, this.f609b, this.f610c, this.f800g));
        ((View) this.f613f).post(this.f803j);
        super.mo388a((SubMenuC0153am) null);
        return true;
    }

    /* renamed from: i */
    public final boolean m551i() {
        if (this.f803j != null && this.f613f != null) {
            ((View) this.f613f).removeCallbacks(this.f803j);
            this.f803j = null;
            return true;
        }
        C0305n c0305n = this.f801h;
        if (c0305n == null) {
            return false;
        }
        c0305n.m381e();
        return true;
    }

    /* renamed from: j */
    public final boolean m552j() {
        return m553k() | m551i();
    }

    /* renamed from: k */
    public final boolean m553k() {
        if (this.f802i == null) {
            return false;
        }
        this.f802i.m381e();
        return true;
    }

    /* renamed from: l */
    public final boolean m554l() {
        return this.f801h != null && this.f801h.m383g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // androidx.appcompat.view.menu.AbstractC0157d, androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo389b() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.mo389b():boolean");
    }

    @Override // androidx.appcompat.view.menu.AbstractC0157d, androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo386a(C0168o c0168o, boolean z) {
        m552j();
        super.mo386a(c0168o, z);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: f */
    public final Parcelable mo390f() {
        SavedState savedState = new SavedState();
        savedState.f822a = this.f805l;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo384a(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.f822a <= 0 || (findItem = this.f610c.findItem(savedState.f822a)) == null) {
                return;
            }
            mo388a((SubMenuC0153am) findItem.getSubMenu());
        }
    }

    @Override // androidx.core.p024g.InterfaceC0519d
    /* renamed from: c */
    public final void mo546c(boolean z) {
        if (z) {
            super.mo388a((SubMenuC0153am) null);
        } else if (this.f610c != null) {
            this.f610c.m452a(false);
        }
    }

    /* renamed from: a */
    public final void m544a(ActionMenuView actionMenuView) {
        this.f613f = actionMenuView;
        actionMenuView.mo343a(this.f610c);
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0307p();

        /* renamed from: a */
        public int f822a;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f822a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f822a);
        }
    }

    /* loaded from: classes.dex */
    public class OverflowMenuButton extends AppCompatImageView implements InterfaceC0308q {

        /* renamed from: b */
        private final float[] f821b;

        @Override // androidx.appcompat.widget.InterfaceC0308q
        /* renamed from: c */
        public final boolean mo341c() {
            return false;
        }

        @Override // androidx.appcompat.widget.InterfaceC0308q
        /* renamed from: d */
        public final boolean mo342d() {
            return false;
        }

        public OverflowMenuButton(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            this.f821b = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0287dy.m973a(this, getContentDescription());
            setOnTouchListener(new C0304m(this, this, ActionMenuPresenter.this));
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m550h();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0546a.m1921a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }
}
