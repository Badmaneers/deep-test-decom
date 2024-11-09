package color.support.p043v7.internal.widget;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private TextPaint f5099a;

    /* renamed from: b */
    private Context f5100b;

    /* renamed from: c */
    private Button f5101c;

    /* renamed from: d */
    private Button f5102d;

    /* renamed from: e */
    private Button f5103e;

    /* renamed from: f */
    private View f5104f;

    /* renamed from: g */
    private View f5105g;

    /* renamed from: h */
    private View f5106h;

    /* renamed from: i */
    private View f5107i;

    /* renamed from: j */
    private View f5108j;

    /* renamed from: k */
    private View f5109k;

    /* renamed from: l */
    private int f5110l;

    /* renamed from: m */
    private int f5111m;

    /* renamed from: n */
    private int f5112n;

    /* renamed from: o */
    private int f5113o;

    /* renamed from: p */
    private int f5114p;

    /* renamed from: q */
    private int f5115q;

    /* renamed from: r */
    private int f5116r;

    /* renamed from: s */
    private int f5117s;

    /* renamed from: t */
    private int f5118t;

    /* renamed from: u */
    private int f5119u;

    /* renamed from: v */
    private int f5120v;

    /* renamed from: w */
    private int f5121w;

    /* renamed from: x */
    private boolean f5122x;

    public ButtonBarLayout(Context context) {
        super(context, null);
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5100b = context;
        this.f5099a = new TextPaint();
        this.f5099a.setTextSize(this.f5100b.getResources().getDimensionPixelSize(R.dimen.oppo_dialog_button_text_size));
        this.f5110l = this.f5100b.getResources().getDimensionPixelSize(R.dimen.color_alert_dialog_button_horizontal_padding);
        this.f5111m = this.f5100b.getResources().getDimensionPixelSize(R.dimen.color_alert_dialog_button_vertical_padding);
        this.f5113o = this.f5100b.getResources().getDimensionPixelSize(R.dimen.color_delete_alert_dialog_divider_height);
        this.f5114p = this.f5100b.getResources().getDimensionPixelSize(R.dimen.color_delete_alert_dialog_button_height);
        this.f5115q = this.f5100b.getResources().getDimensionPixelSize(R.dimen.alert_dialog_item_padding_offset);
        this.f5112n = this.f5100b.getResources().getDimensionPixelSize(R.dimen.alert_dialog_list_item_padding_top);
        this.f5116r = this.f5100b.getResources().getDimensionPixelSize(R.dimen.color_alert_dialog_vertical_button_divider_horizontal_margin);
        this.f5117s = this.f5100b.getResources().getDimensionPixelSize(R.dimen.color_alert_dialog_vertical_button_divider_vertical_margin);
        this.f5118t = this.f5100b.getResources().getDimensionPixelSize(R.dimen.color_alert_dialog_horizontal_button_divider_vertical_margin);
        this.f5119u = this.f5100b.getResources().getColor(R.color.color_bottom_alert_dialog_button_text_color);
        this.f5120v = this.f5100b.getResources().getColor(R.color.color_bottom_alert_dialog_button_warning_color);
        this.f5121w = this.f5100b.getResources().getDimensionPixelSize(R.dimen.color_alert_dialog_button_height);
    }

    public void setForceVertical(boolean z) {
        this.f5122x = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r16, int r17) {
        /*
            Method dump skipped, instructions count: 1831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: color.support.p043v7.internal.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    private int getButtonCount() {
        int i = m4026a(this.f5101c) ? 1 : 0;
        if (m4026a(this.f5102d)) {
            i++;
        }
        return m4026a(this.f5103e) ? i + 1 : i;
    }

    /* renamed from: a */
    private boolean m4025a() {
        return getOrientation() == 1;
    }

    /* renamed from: a */
    private static boolean m4026a(View view) {
        return view.getVisibility() == 0;
    }
}
