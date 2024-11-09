package color.support.p043v7.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0072am;
import color.support.p043v7.app.AlertController;
import color.support.p043v7.appcompat.R;
import color.support.p043v7.internal.widget.ButtonBarLayout;
import color.support.p043v7.internal.widget.ColorAlertLinearLayout;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class ColorAlertController extends AlertController {

    /* renamed from: B */
    private boolean f4899B;

    /* renamed from: C */
    private Context f4900C;

    /* renamed from: D */
    private Handler f4901D;

    /* renamed from: E */
    private ContentObserver f4902E;

    /* renamed from: F */
    private ComponentCallbacks f4903F;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ ComponentCallbacks m3985h(ColorAlertController colorAlertController) {
        colorAlertController.f4903F = null;
        return null;
    }

    public ColorAlertController(Context context, DialogC0072am dialogC0072am, Window window) {
        super(context, dialogC0072am, window);
        this.f4902E = new C1208r(this, this.f4901D);
        this.f4903F = new ComponentCallbacksC1209s(this);
        this.f4900C = context;
        this.f4901D = new HandlerC1212v(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // color.support.p043v7.app.AlertController
    /* renamed from: b */
    public final int mo3960b() {
        return m3983g() ? super.mo3960b() : R.layout.color_bottom_alert_dialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m3978e() {
        Point m3980f = m3980f();
        boolean z = m3980f.x < m3980f.y;
        DisplayMetrics displayMetrics = this.f4900C.getResources().getDisplayMetrics();
        WindowManager.LayoutParams attributes = this.f4870b.getAttributes();
        this.f4870b.clearFlags(-2147482112);
        if (m3983g()) {
            attributes.windowAnimations = R.style.Animation_ColorSupport_Dialog_Alpha;
            if (z) {
                attributes.width = -1;
                attributes.height = -2;
            } else {
                attributes.width = Math.min(m3980f.y, displayMetrics.widthPixels);
                attributes.height = this.f4900C.getResources().getDimensionPixelSize(R.dimen.alert_dialog_central_max_height);
            }
            this.f4870b.setGravity(17);
        } else {
            attributes.windowAnimations = R.style.ColorDialogAnimation;
            if (z) {
                this.f4870b.setGravity(80);
                attributes.width = -1;
                attributes.height = -2;
            } else {
                this.f4870b.setGravity(17);
                attributes.width = Math.min(m3980f.y, displayMetrics.widthPixels);
                attributes.height = this.f4900C.getResources().getDimensionPixelSize(R.dimen.alert_dialog_central_max_height);
            }
        }
        this.f4870b.setAttributes(attributes);
    }

    /* renamed from: f */
    private Point m3980f() {
        Point point = new Point();
        ((WindowManager) this.f4900C.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    /* renamed from: g */
    private boolean m3983g() {
        return m3967d() == 0;
    }

    /* renamed from: h */
    private int m3984h() {
        int dimensionPixelSize;
        if (!m3991m()) {
            return 0;
        }
        if (m3990l()) {
            dimensionPixelSize = 0;
        } else if (m3988j()) {
            dimensionPixelSize = m3986i();
        } else {
            dimensionPixelSize = this.f4900C.getResources().getDimensionPixelSize(R.dimen.alert_dialog_padding_bottom);
        }
        if (this.f4899B) {
            return dimensionPixelSize;
        }
        return 0;
    }

    /* renamed from: i */
    private int m3986i() {
        Resources resources = this.f4900C.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: j */
    private boolean m3988j() {
        if (!m3989k()) {
            return false;
        }
        int i = Settings.Secure.getInt(this.f4900C.getContentResolver(), "hide_navigationbar_enable", 0);
        int i2 = Settings.Secure.getInt(this.f4900C.getContentResolver(), "manual_hide_navigationbar", 0);
        this.f4899B = (i == -1 || i2 == -1) ? false : true;
        return i == 0 || (i == 1 && i2 == 0);
    }

    /* renamed from: k */
    private boolean m3989k() {
        String str;
        Resources resources = this.f4900C.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
        } catch (Exception e) {
            Log.d("ColorAlertController", "fail to get navigation bar status message is " + e.getMessage());
        }
        if ("1".equals(str)) {
            return false;
        }
        if ("0".equals(str)) {
            return true;
        }
        return z;
    }

    /* renamed from: l */
    private boolean m3990l() {
        return this.f4870b.getAttributes().gravity == 17;
    }

    /* renamed from: m */
    private boolean m3991m() {
        Activity m3971a;
        return Build.VERSION.SDK_INT < 24 || (m3971a = m3971a(this.f4900C)) == null || !m3971a.isInMultiWindowMode();
    }

    /* renamed from: a */
    private static Activity m3971a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: n */
    private void m3992n() {
        if (m3990l()) {
            this.f4870b.clearFlags(-2147482112);
        } else if (m3988j()) {
            this.f4870b.setNavigationBarColor(-1);
            this.f4870b.clearFlags(134217728);
            this.f4870b.getDecorView().setSystemUiVisibility(16);
            this.f4870b.addFlags(-2147482112);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m3993o() {
        View findViewById = this.f4870b.findViewById(R.id.parentPanel);
        if (findViewById == null || !(findViewById instanceof ColorAlertLinearLayout)) {
            return;
        }
        ColorAlertLinearLayout colorAlertLinearLayout = (ColorAlertLinearLayout) findViewById;
        if (m3990l()) {
            colorAlertLinearLayout.setNeedClip(true);
            colorAlertLinearLayout.setHasShadow(true);
        } else {
            colorAlertLinearLayout.setNeedClip(false);
            colorAlertLinearLayout.setHasShadow(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m3994p() {
        if (this.f4845A && m3983g()) {
            Point m3980f = m3980f();
            WindowManager.LayoutParams attributes = this.f4870b.getAttributes();
            View findViewById = this.f4870b.findViewById(R.id.parentPanel);
            if (findViewById == null || m3980f.x >= m3980f.y) {
                return;
            }
            DisplayMetrics displayMetrics = this.f4900C.getResources().getDisplayMetrics();
            int dimensionPixelSize = this.f4900C.getResources().getDimensionPixelSize(R.dimen.color_dialog_max_height) + findViewById.getPaddingTop() + findViewById.getPaddingBottom();
            int paddingBottom = findViewById.getPaddingBottom() + this.f4900C.getResources().getDimensionPixelSize(R.dimen.color_dialog_max_height_landscape) + findViewById.getPaddingTop();
            int i = displayMetrics.heightPixels;
            if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
                paddingBottom = dimensionPixelSize;
            }
            attributes.height = Math.min(i, paddingBottom);
            this.f4870b.setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // color.support.p043v7.app.AlertController
    /* renamed from: c */
    public final void mo3966c() {
        m3978e();
        boolean z = false;
        if (!m3983g()) {
            this.f4900C.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("manual_hide_navigationbar"), false, this.f4902E);
        }
        this.f4900C.registerComponentCallbacks(this.f4903F);
        if (!m3983g() && m3991m()) {
            m3997s();
            WindowManager.LayoutParams attributes = this.f4870b.getAttributes();
            try {
                Field declaredField = attributes.getClass().getDeclaredField("privateFlags");
                declaredField.setAccessible(true);
                declaredField.set(attributes, Integer.valueOf(declaredField.getInt(attributes) | 16777216 | 64));
            } catch (Exception e) {
                Log.d("ColorAlertController", "addPrivateFlag failed.Fail msg is " + e.getMessage());
            }
            if (m3973a(attributes) && Build.VERSION.SDK_INT < 29) {
                attributes.y -= m3984h();
            }
            this.f4870b.setAttributes(attributes);
        }
        m3993o();
        m3994p();
        ListView listView = this.f4873e;
        if (listView instanceof ColorRecyclerListView) {
            ColorRecyclerListView colorRecyclerListView = (ColorRecyclerListView) listView;
            if (!m3995q() && !m3996r() && !m3983g()) {
                z = true;
            }
            colorRecyclerListView.setNeedClip(z);
        }
        super.mo3966c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // color.support.p043v7.app.AlertController
    /* renamed from: b */
    public final void mo3963b(ViewGroup viewGroup) {
        super.mo3963b(viewGroup);
        if (m3983g() || this.f4893y || this.f4894z || !(viewGroup instanceof ButtonBarLayout)) {
            return;
        }
        ((ButtonBarLayout) viewGroup).setForceVertical(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // color.support.p043v7.app.AlertController
    /* renamed from: a */
    public final void mo3958a(ViewGroup viewGroup) {
        super.mo3958a(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.listPanel);
        if (this.f4872d != null && viewGroup2 != null && this.f4873e != null) {
            viewGroup2.addView(this.f4873e, new ViewGroup.LayoutParams(-1, -1));
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.color_alert_dialog_list_divider);
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
        if (m3983g()) {
            if (this.f4872d != null) {
                m3975c(viewGroup);
            }
        } else {
            if (this.f4892x) {
                if (this.f4883o != null) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4883o.getLayoutParams();
                    layoutParams.height = 0;
                    layoutParams.weight = 1.0f;
                    this.f4883o.setLayoutParams(layoutParams);
                }
                if (viewGroup2 != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewGroup2.getLayoutParams();
                    layoutParams2.height = 0;
                    layoutParams2.weight = 1.0f;
                    viewGroup2.setLayoutParams(layoutParams2);
                }
            }
            if ((this.f4893y || this.f4894z) && m3995q() && m3996r()) {
                if (this.f4883o != null) {
                    this.f4883o.setPadding(this.f4883o.getPaddingLeft(), this.f4900C.getResources().getDimensionPixelSize(R.dimen.center_dialog_scroll_padding_top), this.f4883o.getPaddingRight(), this.f4900C.getResources().getDimensionPixelSize(R.dimen.center_dialog_scroll_padding_bottom));
                }
                TextView textView = (TextView) viewGroup.findViewById(android.R.id.message);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView.getLayoutParams();
                layoutParams3.setMarginStart(this.f4900C.getResources().getDimensionPixelSize(R.dimen.bottom_choice_dialog_message_margin_start));
                layoutParams3.setMarginEnd(this.f4900C.getResources().getDimensionPixelSize(R.dimen.bottom_choice_dialog_message_margin_end));
                textView.setLayoutParams(layoutParams3);
                textView.setTextSize(0, this.f4900C.getResources().getDimensionPixelSize(R.dimen.TD07));
                textView.setTextColor(this.f4900C.getResources().getColor(R.color.color_alert_dialog_content_text_color));
                m3975c(viewGroup);
            }
        }
        viewGroup.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1210t(this, viewGroup));
    }

    /* renamed from: c */
    private void m3975c(ViewGroup viewGroup) {
        TextView textView = (TextView) viewGroup.findViewById(android.R.id.message);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1211u(this, textView));
    }

    /* renamed from: q */
    private boolean m3995q() {
        return !TextUtils.isEmpty(this.f4872d);
    }

    /* renamed from: r */
    private boolean m3996r() {
        return !TextUtils.isEmpty(this.f4871c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m3997s() {
        View findViewById;
        ViewGroup viewGroup = (ViewGroup) this.f4870b.findViewById(R.id.parentPanel);
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.alert_dialog_bottom_space)) != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = m3984h();
            findViewById.setLayoutParams(layoutParams);
        }
        m3992n();
        WindowManager.LayoutParams attributes = this.f4870b.getAttributes();
        if (m3973a(attributes)) {
            if (m3988j() && !m3990l()) {
                attributes.y -= m3986i();
            } else {
                attributes.y = 0;
            }
        }
        this.f4870b.setAttributes(attributes);
    }

    /* renamed from: a */
    private static boolean m3973a(WindowManager.LayoutParams layoutParams) {
        return layoutParams.type == 2003 || layoutParams.type == 2038 || layoutParams.type == 2303;
    }

    /* loaded from: classes.dex */
    public class FadingScrollView extends ScrollView {
        public FadingScrollView(Context context) {
            super(context);
        }

        public FadingScrollView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public FadingScrollView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    /* loaded from: classes.dex */
    public class ColorRecyclerListView extends AlertController.RecycleListView {

        /* renamed from: a */
        private Path f4904a;

        /* renamed from: b */
        private int f4905b;

        /* renamed from: c */
        private boolean f4906c;

        /* renamed from: d */
        private float[] f4907d;

        /* renamed from: e */
        private RectF f4908e;

        public ColorRecyclerListView(Context context) {
            this(context, null);
        }

        public ColorRecyclerListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4905b = context.getResources().getDimensionPixelOffset(R.dimen.alert_dialog_bottom_corner_radius);
            this.f4904a = new Path();
            this.f4908e = new RectF();
            this.f4907d = new float[]{this.f4905b, this.f4905b, this.f4905b, this.f4905b, 0.0f, 0.0f, 0.0f, 0.0f};
        }

        @Override // android.widget.AbsListView, android.view.View
        public void draw(Canvas canvas) {
            canvas.save();
            if (this.f4906c) {
                canvas.clipPath(this.f4904a);
            }
            super.draw(canvas);
            canvas.restore();
        }

        public void setNeedClip(boolean z) {
            this.f4906c = z;
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.f4904a.reset();
            this.f4908e.set(0.0f, 0.0f, i, i2);
            this.f4904a.addRoundRect(this.f4908e, this.f4907d, Path.Direction.CW);
        }
    }
}
