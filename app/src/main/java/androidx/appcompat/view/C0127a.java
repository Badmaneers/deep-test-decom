package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import androidx.appcompat.R;

/* compiled from: ActionBarPolicy.java */
/* renamed from: androidx.appcompat.view.a */
/* loaded from: classes.dex */
public final class C0127a {

    /* renamed from: a */
    private Context f441a;

    /* renamed from: a */
    public static C0127a m301a(Context context) {
        return new C0127a(context);
    }

    private C0127a(Context context) {
        this.f441a = context;
    }

    /* renamed from: a */
    public final int m302a() {
        Configuration configuration = this.f441a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: b */
    public final boolean m303b() {
        return Build.VERSION.SDK_INT >= 19 || !ViewConfiguration.get(this.f441a).hasPermanentMenuKey();
    }

    /* renamed from: c */
    public final int m304c() {
        return this.f441a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public final boolean m305d() {
        return this.f441a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    /* renamed from: e */
    public final int m306e() {
        TypedArray obtainStyledAttributes = this.f441a.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0);
        Resources resources = this.f441a.getResources();
        if (!m305d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public final boolean m307f() {
        return this.f441a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public final int m308g() {
        return this.f441a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }
}
