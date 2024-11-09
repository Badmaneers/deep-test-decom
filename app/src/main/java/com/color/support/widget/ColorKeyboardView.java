package com.color.support.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import color.support.p043v7.appcompat.R;
import com.color.support.widget.p051a.C1358b;

/* loaded from: classes.dex */
public class ColorKeyboardView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    private ImageView f6116a;

    /* renamed from: b */
    private ImageView f6117b;

    /* renamed from: c */
    private RelativeLayout f6118c;

    /* renamed from: d */
    private int f6119d;

    /* renamed from: e */
    private InterfaceC1386ba f6120e;

    /* renamed from: f */
    private InterfaceC1387bb f6121f;

    /* renamed from: g */
    private SecurityKeyboardView f6122g;

    /* renamed from: h */
    private boolean f6123h;

    /* renamed from: i */
    private C1358b f6124i;

    /* renamed from: j */
    private Context f6125j;

    /* renamed from: k */
    private String f6126k;

    /* renamed from: l */
    private String f6127l;

    /* renamed from: m */
    private int f6128m;

    /* renamed from: n */
    private String f6129n;

    /* renamed from: o */
    private TextView f6130o;

    public ColorKeyboardView(Context context) {
        this(context, null);
    }

    public ColorKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6119d = 0;
        this.f6120e = null;
        this.f6121f = null;
        this.f6125j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorKeyboardView, i, R.style.ColorKeyBoardView);
        this.f6123h = obtainStyledAttributes.getBoolean(R.styleable.ColorKeyboardView_colorKeyboardViewType, true);
        this.f6128m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorKeyboardView_colorWidthOffset, 0);
        this.f6129n = obtainStyledAttributes.getString(R.styleable.ColorKeyboardView_colorTitleName);
        LayoutInflater.from(context).inflate(this.f6123h ? R.layout.color_security_keybord_view : R.layout.color_unlock_keybord_view, (ViewGroup) this, true);
        this.f6116a = (ImageView) findViewById(R.id.color_keyboard_view_close);
        this.f6117b = (ImageView) findViewById(R.id.color_keyboard_view_detail);
        this.f6122g = (SecurityKeyboardView) findViewById(R.id.keyboardview);
        this.f6118c = (RelativeLayout) findViewById(R.id.color_keyboard_view_top);
        this.f6130o = (TextView) findViewById(R.id.color_keyboard_view_text);
        this.f6118c.setVisibility(this.f6123h ? 0 : 8);
        this.f6116a.setOnClickListener(this);
        this.f6117b.setOnClickListener(this);
        this.f6122g.setProximityCorrectionEnabled(true);
        this.f6130o.setText(this.f6129n);
        this.f6126k = context.getResources().getString(R.string.color_keyboard_view_access_close_button);
        this.f6127l = context.getResources().getString(R.string.color_keyboard_view_access_detail_button);
        if (this.f6116a != null) {
            this.f6116a.setAccessibilityDelegate(new C1383ay(this));
        }
        if (this.f6117b != null) {
            this.f6117b.setAccessibilityDelegate(new C1384az(this));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (getKeyboardView().getKeyboard() != null) {
            int m5172c = (size - getKeyboardView().getKeyboard().m5172c()) / 2;
            SecurityKeyboardView securityKeyboardView = this.f6122g;
            securityKeyboardView.setPadding(m5172c, securityKeyboardView.getPaddingTop(), m5172c, this.f6122g.getPaddingBottom());
            this.f6116a.setPaddingRelative(this.f6116a.getPaddingStart(), this.f6116a.getPaddingTop(), this.f6128m + m5172c, this.f6116a.getPaddingBottom());
            this.f6117b.setPaddingRelative(m5172c + this.f6128m, this.f6117b.getPaddingTop(), this.f6117b.getPaddingEnd(), this.f6117b.getPaddingBottom());
            this.f6122g.m4859a();
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
        int i = R.id.color_keyboard_view_close;
        view.getId();
        int i2 = R.id.color_keyboard_view_detail;
    }

    public SecurityKeyboardView getKeyboardView() {
        if (this.f6122g != null) {
            return this.f6122g;
        }
        return null;
    }

    public void setOnClickButtonListener(InterfaceC1386ba interfaceC1386ba) {
        this.f6120e = interfaceC1386ba;
    }

    public void setOnClickSwitchListener(InterfaceC1387bb interfaceC1387bb) {
        this.f6121f = interfaceC1387bb;
    }

    public void setKeyBoardType(int i) {
        this.f6119d = i;
    }

    public void setKeyboardHelper(C1358b c1358b) {
        this.f6124i = c1358b;
    }

    public C1358b getKeyboardHelper() {
        return this.f6124i;
    }

    public View getTopView() {
        return this.f6118c;
    }
}
