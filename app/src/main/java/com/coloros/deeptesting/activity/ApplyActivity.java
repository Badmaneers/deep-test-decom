package com.coloros.deeptesting.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import color.support.design.widget.ColorAppBarLayout;
import color.support.p043v7.widget.Toolbar;
import com.color.support.dialog.p050a.DialogC1312a;
import com.coloros.deeptesting.R;

/* loaded from: classes.dex */
public class ApplyActivity extends AppCompatActivity {

    /* renamed from: j */
    private Context f8572j;

    /* renamed from: k */
    private Toolbar f8573k;

    /* renamed from: l */
    private ColorAppBarLayout f8574l;

    /* renamed from: m */
    private ScrollView f8575m;

    /* renamed from: n */
    private Button f8576n;

    /* renamed from: o */
    private CheckBox f8577o;

    /* renamed from: p */
    private TextView f8578p;

    /* renamed from: r */
    private DialogC1312a f8580r;

    /* renamed from: q */
    private boolean f8579q = false;

    /* renamed from: s */
    private Handler f8581s = new HandlerC1845a(this);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.apply);
        Window window = getWindow();
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        window.setNavigationBarColor(-1);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        this.f8573k = (Toolbar) findViewById(R.id.toolbar);
        this.f8573k.setNavigationIcon(R.drawable.color_back_arrow);
        this.f8573k.setNavigationOnClickListener(new ViewOnClickListenerC1846b(this));
        this.f8573k.setTitle(getString(R.string.apply_title));
        this.f8574l = (ColorAppBarLayout) findViewById(R.id.colorAppBarLayout);
        this.f8575m = (ScrollView) findViewById(R.id.scrollView);
        this.f8575m.post(new RunnableC1847c(this));
        this.f8572j = getApplicationContext();
        this.f8578p = (TextView) findViewById(R.id.disclaimer);
        String string = getString(R.string.apply_disclaimer);
        String string2 = getString(R.string.apply_supplement);
        SpannableString spannableString = new SpannableString(string + '\n' + string2 + '\n');
        spannableString.setSpan(new StyleSpan(1), string.length() + 1, string.length() + string2.length(), 18);
        this.f8578p.setText(spannableString);
        this.f8577o = (CheckBox) findViewById(R.id.check_box);
        this.f8576n = (Button) findViewById(R.id.agree);
        this.f8576n.setEnabled(this.f8579q);
        this.f8577o.setOnClickListener(new ViewOnClickListenerC1848d(this));
        this.f8576n.setOnClickListener(new ViewOnClickListenerC1849e(this));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: h */
    public final void m5973h() {
        this.f8580r = new DialogC1312a(this);
        this.f8580r.setTitle(getString(R.string.dialog_applying));
        this.f8580r.show();
        this.f8580r.setCancelable(false);
    }
}
