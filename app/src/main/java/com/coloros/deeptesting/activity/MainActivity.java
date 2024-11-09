package com.coloros.deeptesting.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.color.support.dialog.p050a.DialogC1312a;
import com.coloros.deeptesting.R;
import com.coloros.deeptesting.p064a.C1842h;
import com.coloros.neton.BuildConfig;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {

    /* renamed from: l */
    private Button f8584l;

    /* renamed from: m */
    private TextView f8585m;

    /* renamed from: n */
    private DialogC1312a f8586n;

    /* renamed from: j */
    private int f8582j = 99;

    /* renamed from: k */
    private int f8583k = 10;

    /* renamed from: o */
    private Handler f8587o = new HandlerC1850f(this);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.activity_main);
        Window window = getWindow();
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        window.setNavigationBarColor(-1);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        m5981i();
        this.f8584l = (Button) findViewById(R.id.apply);
        this.f8584l.setOnClickListener(new ViewOnClickListenerC1851g(this));
        this.f8585m = (TextView) findViewById(R.id.status);
        this.f8585m.setOnClickListener(new ViewOnClickListenerC1852h(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        switch (this.f8582j) {
            case -2:
                this.f8584l.setText(getString(R.string.dialog_exittest));
                this.f8585m.setText(getString(R.string.main_query));
                return;
            case -1:
                this.f8584l.setText(getString(R.string.main_apply));
                this.f8585m.setText(getString(R.string.main_query));
                return;
            case 0:
                this.f8584l.setText(getString(R.string.dialog_exittest));
                this.f8585m.setText(BuildConfig.FLAVOR);
                return;
            default:
                this.f8584l.setText(getString(R.string.main_apply));
                this.f8585m.setText(BuildConfig.FLAVOR);
                return;
        }
    }

    /* renamed from: h */
    public final void m5982h() {
        this.f8586n = new DialogC1312a(this);
        this.f8586n.setTitle(getString(R.string.dialog_applying));
        this.f8586n.show();
        this.f8586n.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m5981i() {
        this.f8582j = C1842h.m5962b(this);
        if (this.f8582j != 0) {
            if (C1842h.m5960a((Context) this)) {
                m5982h();
                this.f8583k = 10;
                C1842h.m5957a(this, 1003, this.f8587o);
            } else {
                C1842h.m5958a(this, getString(R.string.dialog_title), getString(R.string.dialog_nonetwork), null);
            }
        }
    }
}
