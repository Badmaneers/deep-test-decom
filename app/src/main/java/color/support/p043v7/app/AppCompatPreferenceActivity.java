package color.support.p043v7.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0104s;
import androidx.appcompat.app.InterfaceC0103r;

/* loaded from: classes.dex */
public abstract class AppCompatPreferenceActivity extends PreferenceActivity {

    /* renamed from: a */
    private AbstractC0104s f4897a;

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        m3970a().mo129k();
        m3970a().mo114c();
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m3970a().mo116d();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m3970a().mo110b();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m3970a().mo115c(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m3970a().mo102a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3970a().mo103a(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3970a().mo112b(view, layoutParams);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        m3970a().mo123g();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m3970a().mo106a(charSequence);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3970a().mo101a(configuration);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        m3970a().mo120f();
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m3970a().mo128j();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m3970a().mo127i();
    }

    /* renamed from: a */
    private AbstractC0104s m3970a() {
        if (this.f4897a == null) {
            this.f4897a = AbstractC0104s.m244a(this, (InterfaceC0103r) null);
        }
        return this.f4897a;
    }
}
