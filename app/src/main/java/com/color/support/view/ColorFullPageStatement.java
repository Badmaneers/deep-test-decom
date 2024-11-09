package com.color.support.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1336a;
import com.color.support.widget.ColorButton;
import com.color.support.widget.MaxHeightScrollView;

/* loaded from: classes.dex */
public class ColorFullPageStatement extends LinearLayout {

    /* renamed from: a */
    private TextView f5828a;

    /* renamed from: b */
    private ColorButton f5829b;

    /* renamed from: c */
    private TextView f5830c;

    /* renamed from: d */
    private LayoutInflater f5831d;

    /* renamed from: e */
    private Context f5832e;

    /* renamed from: f */
    private InterfaceC1351c f5833f;

    /* renamed from: g */
    private MaxHeightScrollView f5834g;

    /* renamed from: h */
    private MaxHeightScrollView f5835h;

    /* renamed from: i */
    private ImageView f5836i;

    public ColorFullPageStatement(Context context) {
        this(context, null);
    }

    public ColorFullPageStatement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorFullPageStatement(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private ColorFullPageStatement(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, 0);
        this.f5832e = context;
        this.f5831d = (LayoutInflater) this.f5832e.getSystemService("layout_inflater");
        View inflate = this.f5831d.inflate(R.layout.color_full_page_statement, this);
        this.f5828a = (TextView) inflate.findViewById(R.id.txt_statement);
        this.f5829b = (ColorButton) inflate.findViewById(R.id.btn_confirm);
        this.f5834g = (MaxHeightScrollView) inflate.findViewById(R.id.text_field1);
        this.f5835h = (MaxHeightScrollView) inflate.findViewById(R.id.scroll_text);
        this.f5830c = (TextView) inflate.findViewById(R.id.txt_exit);
        this.f5836i = (ImageView) inflate.findViewById(R.id.img_privacy_icon);
        this.f5834g.setNestedScrollingEnabled(true);
        C1336a.m4373b(this.f5828a);
        this.f5829b.setOnClickListener(new ViewOnClickListenerC1349a(this));
        this.f5830c.setOnClickListener(new ViewOnClickListenerC1350b(this));
        TypedArray obtainStyledAttributes = this.f5832e.obtainStyledAttributes(attributeSet, R.styleable.ColorFullPageStatement);
        String string = obtainStyledAttributes.getString(R.styleable.ColorFullPageStatement_exitButtonText);
        String string2 = obtainStyledAttributes.getString(R.styleable.ColorFullPageStatement_bottomButtonText);
        this.f5828a.setText(obtainStyledAttributes.getString(R.styleable.ColorFullPageStatement_appStatement));
        if (string2 != null) {
            this.f5829b.setText(string2);
        }
        if (string != null) {
            this.f5830c.setText(string);
        }
        obtainStyledAttributes.recycle();
    }

    public MaxHeightScrollView getScrollTextView() {
        return this.f5835h;
    }

    public TextView getAppStatement() {
        return this.f5828a;
    }

    public void setAppStatement(CharSequence charSequence) {
        this.f5828a.setText(charSequence);
    }

    public void setButtonText(CharSequence charSequence) {
        this.f5829b.setText(charSequence);
    }

    public void setExitButtonText(CharSequence charSequence) {
        this.f5830c.setText(charSequence);
    }

    public void setButtonListener(InterfaceC1351c interfaceC1351c) {
        this.f5833f = interfaceC1351c;
    }

    public void setContainer(View view) {
        this.f5834g.addView(view);
    }

    public void setStatementMaxHeight(int i) {
        this.f5835h.setMaxHeight(i);
    }
}
