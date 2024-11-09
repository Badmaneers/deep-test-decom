package com.coloros.deeptesting.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import color.support.design.widget.ColorAppBarLayout;
import color.support.p043v7.widget.Toolbar;
import com.color.support.dialog.p050a.DialogC1312a;
import com.coloros.deeptesting.R;

/* loaded from: classes.dex */
public class StatusActivity extends Activity {

    /* renamed from: a */
    private Toolbar f8588a;

    /* renamed from: b */
    private ColorAppBarLayout f8589b;

    /* renamed from: c */
    private RelativeLayout f8590c;

    /* renamed from: d */
    private Button f8591d;

    /* renamed from: e */
    private TextView f8592e;

    /* renamed from: f */
    private TextView f8593f;

    /* renamed from: g */
    private TextView f8594g;

    /* renamed from: h */
    private DialogC1312a f8595h;

    /* renamed from: i */
    private Handler f8596i = new HandlerC1853i(this);

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.status);
        Window window = getWindow();
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        window.setNavigationBarColor(-1);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        this.f8588a = (Toolbar) findViewById(R.id.toolbar);
        this.f8588a.setNavigationIcon(R.drawable.color_back_arrow);
        this.f8588a.setNavigationOnClickListener(new ViewOnClickListenerC1854j(this));
        this.f8588a.setTitle(getString(R.string.status_title));
        this.f8589b = (ColorAppBarLayout) findViewById(R.id.colorAppBarLayout);
        this.f8590c = (RelativeLayout) findViewById(R.id.root);
        this.f8590c.post(new RunnableC1855k(this));
        this.f8591d = (Button) findViewById(R.id.ok);
        this.f8591d.setOnClickListener(new ViewOnClickListenerC1856l(this));
        this.f8592e = (TextView) findViewById(R.id.status_message);
        this.f8593f = (TextView) findViewById(R.id.status_describe);
        this.f8594g = (TextView) findViewById(R.id.start_unlock);
        this.f8594g.setOnClickListener(new ViewOnClickListenerC1857m(this));
        switch (getIntent().getIntExtra("resultCode", 100)) {
            case -1020:
                this.f8592e.setText(getString(R.string.application_fail));
                this.f8593f.setText(getString(R.string.detail_apk_change));
                return;
            case -1015:
                this.f8592e.setText(getString(R.string.application_fail));
                this.f8593f.setText(getString(R.string.detail_ota_version));
                return;
            case -1013:
                this.f8592e.setText(getString(R.string.verification_fail));
                return;
            case -1008:
                this.f8592e.setText(getString(R.string.application_nosubmitted));
                return;
            case -1006:
                this.f8592e.setText(getString(R.string.verification_submitted));
                this.f8593f.setText(getString(R.string.detail_submitted));
                return;
            case -1004:
                this.f8592e.setText(getString(R.string.application_fail));
                this.f8593f.setText(getString(R.string.detail_excess));
                return;
            case -1003:
                this.f8592e.setText(getString(R.string.application_submitted));
                this.f8593f.setText(getString(R.string.detail_submitted));
                return;
            case -1002:
                this.f8592e.setText(getString(R.string.application_fail));
                this.f8593f.setText(getString(R.string.detail_timelimit));
                return;
            case 0:
                this.f8592e.setText(getString(R.string.application_submitted));
                this.f8593f.setText(getString(R.string.detail_submitted));
                return;
            case 1:
                this.f8592e.setText(getString(R.string.verification_pass));
                this.f8594g.setText(getString(R.string.status_start));
                return;
            case 10:
                this.f8592e.setText(getString(R.string.application_fail));
                this.f8593f.setText(getString(R.string.detail_govcustom));
                return;
            case 11:
                this.f8592e.setText(getString(R.string.application_fail));
                this.f8593f.setText(getString(R.string.detail_mobilecustom));
                return;
            case 100:
                this.f8592e.setText(getString(R.string.network_timeout));
                this.f8593f.setText(getString(R.string.detail_networktimeout));
                return;
            default:
                this.f8592e.setText(getString(R.string.application_fail));
                this.f8593f.setText(getString(R.string.detail_wrongdata));
                return;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: a */
    public final void m5987a() {
        this.f8595h = new DialogC1312a(this);
        this.f8595h.setTitle(getString(R.string.dialog_applying));
        this.f8595h.show();
        this.f8595h.setCancelable(false);
    }
}
