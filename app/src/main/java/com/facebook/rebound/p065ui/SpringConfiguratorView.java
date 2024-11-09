package com.facebook.rebound.p065ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TableLayout;
import android.widget.TextView;
import com.facebook.rebound.C1879j;
import com.facebook.rebound.C1881l;
import com.facebook.rebound.C1882m;
import com.facebook.rebound.C1885p;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import neton.client.config.Constants;

/* loaded from: classes.dex */
public class SpringConfiguratorView extends FrameLayout {

    /* renamed from: a */
    private static final DecimalFormat f8670a = new DecimalFormat("#.#");

    /* renamed from: b */
    private final C1889d f8671b;

    /* renamed from: c */
    private final List<C1881l> f8672c;

    /* renamed from: d */
    private final C1879j f8673d;

    /* renamed from: e */
    private final float f8674e;

    /* renamed from: f */
    private final float f8675f;

    /* renamed from: g */
    private final C1882m f8676g;

    /* renamed from: h */
    private final int f8677h;

    /* renamed from: i */
    private SeekBar f8678i;

    /* renamed from: j */
    private SeekBar f8679j;

    /* renamed from: k */
    private Spinner f8680k;

    /* renamed from: l */
    private TextView f8681l;

    /* renamed from: m */
    private TextView f8682m;

    /* renamed from: n */
    private C1881l f8683n;

    public SpringConfiguratorView(Context context) {
        this(context, null);
    }

    public SpringConfiguratorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @TargetApi(11)
    public SpringConfiguratorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8672c = new ArrayList();
        this.f8677h = Color.argb(255, 225, 225, 225);
        C1885p m6031b = C1885p.m6031b();
        this.f8676g = C1882m.m6028a();
        this.f8671b = new C1889d(this, context);
        Resources resources = getResources();
        this.f8675f = AbstractC1891f.m6048a(40.0f, resources);
        this.f8674e = AbstractC1891f.m6048a(280.0f, resources);
        this.f8673d = m6031b.m6006a();
        this.f8673d.m6019b().m6015a(1.0d).m6017a(new C1887b(this, (byte) 0));
        Resources resources2 = getResources();
        int m6048a = AbstractC1891f.m6048a(5.0f, resources2);
        int m6048a2 = AbstractC1891f.m6048a(10.0f, resources2);
        int m6048a3 = AbstractC1891f.m6048a(20.0f, resources2);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, m6048a, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(AbstractC1891f.m6049a(-1, AbstractC1891f.m6048a(300.0f, resources2)));
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams m6049a = AbstractC1891f.m6049a(-1, -1);
        m6049a.setMargins(0, m6048a3, 0, 0);
        frameLayout2.setLayoutParams(m6049a);
        frameLayout2.setBackgroundColor(Color.argb(100, 0, 0, 0));
        frameLayout.addView(frameLayout2);
        this.f8680k = new Spinner(context, 0);
        FrameLayout.LayoutParams m6049a2 = AbstractC1891f.m6049a(-1, -2);
        m6049a2.gravity = 48;
        m6049a2.setMargins(m6048a2, m6048a2, m6048a2, 0);
        this.f8680k.setLayoutParams(m6049a2);
        frameLayout2.addView(this.f8680k);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams m6049a3 = AbstractC1891f.m6049a(-1, -2);
        m6049a3.setMargins(0, 0, 0, AbstractC1891f.m6048a(80.0f, resources2));
        m6049a3.gravity = 80;
        linearLayout.setLayoutParams(m6049a3);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context);
        FrameLayout.LayoutParams m6049a4 = AbstractC1891f.m6049a(-1, -2);
        m6049a4.setMargins(m6048a2, m6048a2, m6048a2, m6048a3);
        linearLayout2.setPadding(m6048a2, m6048a2, m6048a2, m6048a2);
        linearLayout2.setLayoutParams(m6049a4);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2);
        this.f8678i = new SeekBar(context);
        this.f8678i.setLayoutParams(layoutParams);
        linearLayout2.addView(this.f8678i);
        this.f8682m = new TextView(getContext());
        this.f8682m.setTextColor(this.f8677h);
        FrameLayout.LayoutParams m6049a5 = AbstractC1891f.m6049a(AbstractC1891f.m6048a(50.0f, resources2), -1);
        this.f8682m.setGravity(19);
        this.f8682m.setLayoutParams(m6049a5);
        this.f8682m.setMaxLines(1);
        linearLayout2.addView(this.f8682m);
        LinearLayout linearLayout3 = new LinearLayout(context);
        FrameLayout.LayoutParams m6049a6 = AbstractC1891f.m6049a(-1, -2);
        m6049a6.setMargins(m6048a2, m6048a2, m6048a2, m6048a3);
        linearLayout3.setPadding(m6048a2, m6048a2, m6048a2, m6048a2);
        linearLayout3.setLayoutParams(m6049a6);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3);
        this.f8679j = new SeekBar(context);
        this.f8679j.setLayoutParams(layoutParams);
        linearLayout3.addView(this.f8679j);
        this.f8681l = new TextView(getContext());
        this.f8681l.setTextColor(this.f8677h);
        FrameLayout.LayoutParams m6049a7 = AbstractC1891f.m6049a(AbstractC1891f.m6048a(50.0f, resources2), -1);
        this.f8681l.setGravity(19);
        this.f8681l.setLayoutParams(m6049a7);
        this.f8681l.setMaxLines(1);
        linearLayout3.addView(this.f8681l);
        View view = new View(context);
        FrameLayout.LayoutParams m6049a8 = AbstractC1891f.m6049a(AbstractC1891f.m6048a(60.0f, resources2), AbstractC1891f.m6048a(40.0f, resources2));
        m6049a8.gravity = 49;
        view.setLayoutParams(m6049a8);
        view.setOnTouchListener(new ViewOnTouchListenerC1886a(this, (byte) 0));
        view.setBackgroundColor(Color.argb(255, 0, 164, 209));
        frameLayout.addView(view);
        addView(frameLayout);
        C1888c c1888c = new C1888c(this, (byte) 0);
        this.f8678i.setMax(Constants.DEFAULT_TRACE_HIT);
        this.f8678i.setOnSeekBarChangeListener(c1888c);
        this.f8679j.setMax(Constants.DEFAULT_TRACE_HIT);
        this.f8679j.setOnSeekBarChangeListener(c1888c);
        this.f8680k.setAdapter((SpinnerAdapter) this.f8671b);
        this.f8680k.setOnItemSelectedListener(new C1890e(this, (byte) 0));
        m6036b();
        setTranslationY(this.f8674e);
    }

    /* renamed from: b */
    private void m6036b() {
        Map<C1881l, String> m6029b = this.f8676g.m6029b();
        this.f8671b.m6046a();
        this.f8672c.clear();
        for (Map.Entry<C1881l, String> entry : m6029b.entrySet()) {
            if (entry.getKey() != C1881l.f8664c) {
                this.f8672c.add(entry.getKey());
                this.f8671b.m6047a(entry.getValue());
            }
        }
        this.f8672c.add(C1881l.f8664c);
        this.f8671b.m6047a(m6029b.get(C1881l.f8664c));
        this.f8671b.notifyDataSetChanged();
        if (this.f8672c.size() > 0) {
            this.f8680k.setSelection(0);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m6037b(SpringConfiguratorView springConfiguratorView, C1881l c1881l) {
        double d = c1881l.f8666b;
        int round = Math.round(((((float) (d == 0.0d ? 0.0d : ((d - 194.0d) / 3.62d) + 30.0d)) - 0.0f) * 100000.0f) / 200.0f);
        double d2 = c1881l.f8665a;
        int round2 = Math.round(((((float) (d2 != 0.0d ? 8.0d + ((d2 - 25.0d) / 3.0d) : 0.0d)) - 0.0f) * 100000.0f) / 50.0f);
        springConfiguratorView.f8678i.setProgress(round);
        springConfiguratorView.f8679j.setProgress(round2);
    }
}
