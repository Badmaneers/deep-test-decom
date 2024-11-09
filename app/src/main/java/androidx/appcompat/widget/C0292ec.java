package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.R;

/* compiled from: TooltipPopup.java */
/* renamed from: androidx.appcompat.widget.ec */
/* loaded from: classes.dex */
final class C0292ec {

    /* renamed from: a */
    private final Context f1412a;

    /* renamed from: b */
    private final View f1413b;

    /* renamed from: c */
    private final TextView f1414c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1415d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f1416e = new Rect();

    /* renamed from: f */
    private final int[] f1417f = new int[2];

    /* renamed from: g */
    private final int[] f1418g = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0292ec(Context context) {
        this.f1412a = context;
        this.f1413b = LayoutInflater.from(this.f1412a).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1414c = (TextView) this.f1413b.findViewById(R.id.message);
        this.f1415d.setTitle(getClass().getSimpleName());
        this.f1415d.packageName = this.f1412a.getPackageName();
        this.f1415d.type = 1002;
        this.f1415d.width = -2;
        this.f1415d.height = -2;
        this.f1415d.format = -3;
        this.f1415d.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        this.f1415d.flags = 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m983a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        int height;
        int i3;
        if (m981b()) {
            m982a();
        }
        this.f1414c.setText(charSequence);
        WindowManager.LayoutParams layoutParams = this.f1415d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1412a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1412a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1412a.getResources().getDimensionPixelOffset(z ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame(this.f1416e);
            if (this.f1416e.left < 0 && this.f1416e.top < 0) {
                Resources resources = this.f1412a.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                this.f1416e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen(this.f1418g);
            view.getLocationOnScreen(this.f1417f);
            int[] iArr = this.f1417f;
            iArr[0] = iArr[0] - this.f1418g[0];
            int[] iArr2 = this.f1417f;
            iArr2[1] = iArr2[1] - this.f1418g[1];
            layoutParams.x = (this.f1417f[0] + i) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f1413b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f1413b.getMeasuredHeight();
            int i4 = ((this.f1417f[1] + i3) - dimensionPixelOffset3) - measuredHeight;
            int i5 = this.f1417f[1] + height + dimensionPixelOffset3;
            if (!z) {
                if (measuredHeight + i5 <= this.f1416e.height()) {
                    layoutParams.y = i5;
                }
                layoutParams.y = i4;
            } else {
                if (i4 < 0) {
                    layoutParams.y = i5;
                }
                layoutParams.y = i4;
            }
        }
        ((WindowManager) this.f1412a.getSystemService("window")).addView(this.f1413b, this.f1415d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m982a() {
        if (m981b()) {
            ((WindowManager) this.f1412a.getSystemService("window")).removeView(this.f1413b);
        }
    }

    /* renamed from: b */
    private boolean m981b() {
        return this.f1413b.getParent() != null;
    }
}
