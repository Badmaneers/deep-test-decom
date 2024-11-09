package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.appcompat.R;

/* compiled from: ContextThemeWrapper.java */
/* renamed from: androidx.appcompat.view.e */
/* loaded from: classes.dex */
public final class C0131e extends ContextWrapper {

    /* renamed from: a */
    private int f444a;

    /* renamed from: b */
    private Resources.Theme f445b;

    /* renamed from: c */
    private LayoutInflater f446c;

    /* renamed from: d */
    private Configuration f447d;

    /* renamed from: e */
    private Resources f448e;

    public C0131e() {
        super(null);
    }

    public C0131e(Context context, int i) {
        super(context);
        this.f444a = i;
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f444a != i) {
            this.f444a = i;
            m314a();
        }
    }

    public final int getThemeResId() {
        return this.f444a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        if (this.f445b != null) {
            return this.f445b;
        }
        if (this.f444a == 0) {
            this.f444a = R.style.Theme_AppCompat_Light;
        }
        m314a();
        return this.f445b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f446c == null) {
                this.f446c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f446c;
        }
        return getBaseContext().getSystemService(str);
    }

    /* renamed from: a */
    private void m314a() {
        if (this.f445b == null) {
            this.f445b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f445b.setTo(theme);
            }
        }
        this.f445b.applyStyle(this.f444a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f448e == null) {
            if (this.f447d == null) {
                this.f448e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f448e = createConfigurationContext(this.f447d).getResources();
            }
        }
        return this.f448e;
    }
}
