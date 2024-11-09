package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.C0276dn;
import androidx.core.p024g.C0538w;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, InterfaceC0147ag {

    /* renamed from: a */
    private C0172s f526a;

    /* renamed from: b */
    private ImageView f527b;

    /* renamed from: c */
    private RadioButton f528c;

    /* renamed from: d */
    private TextView f529d;

    /* renamed from: e */
    private CheckBox f530e;

    /* renamed from: f */
    private TextView f531f;

    /* renamed from: g */
    private ImageView f532g;

    /* renamed from: h */
    private ImageView f533h;

    /* renamed from: i */
    private LinearLayout f534i;

    /* renamed from: j */
    private Drawable f535j;

    /* renamed from: k */
    private int f536k;

    /* renamed from: l */
    private Context f537l;

    /* renamed from: m */
    private boolean f538m;

    /* renamed from: n */
    private Drawable f539n;

    /* renamed from: o */
    private boolean f540o;

    /* renamed from: p */
    private int f541p;

    /* renamed from: q */
    private LayoutInflater f542q;

    /* renamed from: r */
    private boolean f543r;

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    /* renamed from: a */
    public final boolean mo339a() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0276dn m944a = C0276dn.m944a(getContext(), attributeSet, R.styleable.MenuView, i, 0);
        this.f535j = m944a.m948a(R.styleable.MenuView_android_itemBackground);
        this.f536k = m944a.m962g(R.styleable.MenuView_android_itemTextAppearance, -1);
        this.f538m = m944a.m949a(R.styleable.MenuView_preserveIconSpacing, false);
        this.f537l = context;
        this.f539n = m944a.m948a(R.styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f540o = obtainStyledAttributes.hasValue(0);
        m944a.m952b();
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C0538w.m1846a(this, this.f535j);
        this.f529d = (TextView) findViewById(R.id.title);
        if (this.f536k != -1) {
            this.f529d.setTextAppearance(this.f537l, this.f536k);
        }
        this.f531f = (TextView) findViewById(R.id.shortcut);
        this.f532g = (ImageView) findViewById(R.id.submenuarrow);
        if (this.f532g != null) {
            this.f532g.setImageDrawable(this.f539n);
        }
        this.f533h = (ImageView) findViewById(R.id.group_divider);
        this.f534i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    /* renamed from: a */
    public final void mo338a(C0172s c0172s) {
        this.f526a = c0172s;
        this.f541p = 0;
        setVisibility(c0172s.isVisible() ? 0 : 8);
        setTitle(c0172s.m479a((InterfaceC0147ag) this));
        setCheckable(c0172s.isCheckable());
        int i = (c0172s.m490e() && this.f526a.m490e()) ? 0 : 8;
        if (i == 0) {
            this.f531f.setText(this.f526a.m487d());
        }
        if (this.f531f.getVisibility() != i) {
            this.f531f.setVisibility(i);
        }
        setIcon(c0172s.getIcon());
        setEnabled(c0172s.isEnabled());
        setSubMenuArrowVisible(c0172s.hasSubMenu());
        setContentDescription(c0172s.getContentDescription());
    }

    /* renamed from: a */
    private void m345a(View view, int i) {
        if (this.f534i != null) {
            this.f534i.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public void setForceShowIcon(boolean z) {
        this.f543r = z;
        this.f538m = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f529d.setText(charSequence);
            if (this.f529d.getVisibility() != 0) {
                this.f529d.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f529d.getVisibility() != 8) {
            this.f529d.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    public C0172s getItemData() {
        return this.f526a;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f528c == null && this.f530e == null) {
            return;
        }
        if (this.f526a.m491f()) {
            if (this.f528c == null) {
                m346b();
            }
            compoundButton = this.f528c;
            compoundButton2 = this.f530e;
        } else {
            if (this.f530e == null) {
                m347c();
            }
            compoundButton = this.f530e;
            compoundButton2 = this.f528c;
        }
        if (z) {
            compoundButton.setChecked(this.f526a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        if (this.f530e != null) {
            this.f530e.setVisibility(8);
        }
        if (this.f528c != null) {
            this.f528c.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f526a.m491f()) {
            if (this.f528c == null) {
                m346b();
            }
            compoundButton = this.f528c;
        } else {
            if (this.f530e == null) {
                m347c();
            }
            compoundButton = this.f530e;
        }
        compoundButton.setChecked(z);
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f532g != null) {
            this.f532g.setVisibility(z ? 0 : 8);
        }
    }

    private void setShortcut$25d965e(boolean z) {
        int i = (z && this.f526a.m490e()) ? 0 : 8;
        if (i == 0) {
            this.f531f.setText(this.f526a.m487d());
        }
        if (this.f531f.getVisibility() != i) {
            this.f531f.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f526a.f712a.m472q() || this.f543r;
        if (z || this.f538m) {
            if (this.f527b == null && drawable == null && !this.f538m) {
                return;
            }
            if (this.f527b == null) {
                this.f527b = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                m345a(this.f527b, 0);
            }
            if (drawable != null || this.f538m) {
                ImageView imageView = this.f527b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f527b.getVisibility() != 0) {
                    this.f527b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f527b.setVisibility(8);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f527b != null && this.f538m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f527b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: b */
    private void m346b() {
        this.f528c = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        m345a(this.f528c, -1);
    }

    /* renamed from: c */
    private void m347c() {
        this.f530e = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        m345a(this.f530e, -1);
    }

    private LayoutInflater getInflater() {
        if (this.f542q == null) {
            this.f542q = LayoutInflater.from(getContext());
        }
        return this.f542q;
    }

    public void setGroupDividerEnabled(boolean z) {
        if (this.f533h != null) {
            this.f533h.setVisibility((this.f540o || !z) ? 8 : 0);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        if (this.f533h == null || this.f533h.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f533h.getLayoutParams();
        rect.top += this.f533h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }
}
