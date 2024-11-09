package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.app.C0403a;
import androidx.core.app.InterfaceC0404b;
import androidx.lifecycle.C0734n;
import androidx.lifecycle.EnumC0729i;
import androidx.lifecycle.EnumC0730j;
import androidx.loader.p036a.AbstractC0747a;
import androidx.p011b.C0329o;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {

    /* renamed from: a */
    final C0702n f2785a;

    /* renamed from: b */
    final C0734n f2786b;

    /* renamed from: c */
    boolean f2787c;

    /* renamed from: d */
    boolean f2788d;

    /* renamed from: e */
    boolean f2789e;

    /* renamed from: f */
    boolean f2790f;

    /* renamed from: g */
    boolean f2791g;

    /* renamed from: h */
    int f2792h;

    /* renamed from: i */
    C0329o<String> f2793i;

    public FragmentActivity() {
        this.f2785a = C0702n.m2440a(new C0700l(this));
        this.f2786b = new C0734n(this);
        this.f2789e = true;
    }

    public FragmentActivity(int i) {
        super(i);
        this.f2785a = C0702n.m2440a(new C0700l(this));
        this.f2786b = new C0734n(this);
        this.f2789e = true;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f2785a.m2454c();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String m1067a = this.f2793i.m1067a(i4);
            this.f2793i.m1070b(i4);
            if (m1067a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            } else {
                if (this.f2785a.m2442a(m1067a) == null) {
                    Log.w("FragmentActivity", "Activity result no fragment exists for who: ".concat(String.valueOf(m1067a)));
                    return;
                }
                return;
            }
        }
        InterfaceC0404b m1451a = C0403a.m1451a();
        if (m1451a == null || !m1451a.m1454a()) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f2785a.m2446a(z);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f2785a.m2452b(z);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2785a.m2454c();
        this.f2785a.m2444a(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2785a.m2450b();
        if (bundle != null) {
            this.f2785a.m2445a(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f2792h = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f2793i = new C0329o<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f2793i.m1071b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f2793i == null) {
            this.f2793i = new C0329o<>();
            this.f2792h = 0;
        }
        super.onCreate(bundle);
        this.f2786b.m2623a(EnumC0729i.ON_CREATE);
        this.f2785a.m2456e();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return this.f2785a.m2448a(menu, getMenuInflater()) | super.onCreatePanelMenu(i, menu);
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m2326a = m2326a(view, str, context, attributeSet);
        return m2326a == null ? super.onCreateView(view, str, context, attributeSet) : m2326a;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m2326a = m2326a(null, str, context, attributeSet);
        return m2326a == null ? super.onCreateView(str, context, attributeSet) : m2326a;
    }

    /* renamed from: a */
    private View m2326a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2785a.m2441a(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2785a.m2462k();
        this.f2786b.m2623a(EnumC0729i.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f2785a.m2463l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2785a.m2449a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f2785a.m2453b(menuItem);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2785a.m2451b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f2788d = false;
        this.f2785a.m2460i();
        this.f2786b.m2623a(EnumC0729i.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f2785a.m2454c();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f2785a.m2454c();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f2788d = true;
        this.f2785a.m2454c();
        this.f2785a.m2464m();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f2786b.m2623a(EnumC0729i.ON_RESUME);
        this.f2785a.m2459h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m2329f();
        this.f2786b.m2623a(EnumC0729i.ON_STOP);
        Parcelable m2455d = this.f2785a.m2455d();
        if (m2455d != null) {
            bundle.putParcelable("android:support:fragments", m2455d);
        }
        if (this.f2793i.m1069b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f2792h);
            int[] iArr = new int[this.f2793i.m1069b()];
            String[] strArr = new String[this.f2793i.m1069b()];
            for (int i = 0; i < this.f2793i.m1069b(); i++) {
                iArr[i] = this.f2793i.m1072c(i);
                strArr[i] = this.f2793i.m1075d(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f2789e = false;
        if (!this.f2787c) {
            this.f2787c = true;
            this.f2785a.m2457f();
        }
        this.f2785a.m2454c();
        this.f2785a.m2464m();
        this.f2786b.m2623a(EnumC0729i.ON_START);
        this.f2785a.m2458g();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2789e = true;
        m2329f();
        this.f2785a.m2461j();
        this.f2786b.m2623a(EnumC0729i.ON_STOP);
    }

    @Deprecated
    /* renamed from: e */
    public void mo66e() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2787c);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2788d);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2789e);
        if (getApplication() != null) {
            AbstractC0747a.m2641a(this).mo2643a(str2, printWriter);
        }
        this.f2785a.m2443a().mo2477a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.f2791g && i != -1) {
            m2327a(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.f2791g && i != -1) {
            m2327a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f2790f && i != -1) {
            m2327a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f2790f && i != -1) {
            m2327a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: a */
    private static void m2327a(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2785a.m2454c();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String m1067a = this.f2793i.m1067a(i3);
            this.f2793i.m1070b(i3);
            if (m1067a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.f2785a.m2442a(m1067a) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: ".concat(String.valueOf(m1067a)));
            }
        }
    }

    /* renamed from: a */
    private static boolean m2328a(AbstractC0705q abstractC0705q, EnumC0730j enumC0730j) {
        boolean z = false;
        for (Fragment fragment : abstractC0705q.mo2481d()) {
            if (fragment != null) {
                if (fragment.mo31a().mo2608a().m2611a(EnumC0730j.STARTED)) {
                    fragment.f2761aa.m2624a(enumC0730j);
                    z = true;
                }
                if (fragment.m2316q() != null) {
                    z |= m2328a(fragment.m2319t(), enumC0730j);
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return super.onPreparePanel(i, view, menu);
        }
        return this.f2785a.m2447a(menu) | super.onPreparePanel(0, view, menu);
    }

    /* renamed from: f */
    private void m2329f() {
        do {
        } while (m2328a(this.f2785a.m2443a(), EnumC0730j.CREATED));
    }
}
