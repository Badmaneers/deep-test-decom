package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.InterfaceC0130d;
import androidx.core.p024g.C0538w;
import androidx.customview.view.AbsSavedState;
import androidx.p012c.p013a.AbstractC0330a;
import com.coloros.neton.BuildConfig;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC0130d {

    /* renamed from: i */
    static final C0261cz f939i = new C0261cz();

    /* renamed from: A */
    private InterfaceC0264db f940A;

    /* renamed from: B */
    private InterfaceC0263da f941B;

    /* renamed from: C */
    private InterfaceC0265dc f942C;

    /* renamed from: D */
    private View.OnClickListener f943D;

    /* renamed from: E */
    private boolean f944E;

    /* renamed from: F */
    private boolean f945F;

    /* renamed from: G */
    private boolean f946G;

    /* renamed from: H */
    private CharSequence f947H;

    /* renamed from: I */
    private boolean f948I;

    /* renamed from: J */
    private boolean f949J;

    /* renamed from: K */
    private int f950K;

    /* renamed from: L */
    private boolean f951L;

    /* renamed from: M */
    private CharSequence f952M;

    /* renamed from: N */
    private CharSequence f953N;

    /* renamed from: O */
    private boolean f954O;

    /* renamed from: P */
    private int f955P;

    /* renamed from: Q */
    private Bundle f956Q;

    /* renamed from: R */
    private final Runnable f957R;

    /* renamed from: S */
    private Runnable f958S;

    /* renamed from: T */
    private final WeakHashMap<String, Drawable.ConstantState> f959T;

    /* renamed from: U */
    private final View.OnClickListener f960U;

    /* renamed from: V */
    private final TextView.OnEditorActionListener f961V;

    /* renamed from: W */
    private final AdapterView.OnItemClickListener f962W;

    /* renamed from: a */
    final SearchAutoComplete f963a;

    /* renamed from: aa */
    private final AdapterView.OnItemSelectedListener f964aa;

    /* renamed from: ab */
    private TextWatcher f965ab;

    /* renamed from: b */
    final ImageView f966b;

    /* renamed from: c */
    final ImageView f967c;

    /* renamed from: d */
    final ImageView f968d;

    /* renamed from: e */
    final ImageView f969e;

    /* renamed from: f */
    View.OnFocusChangeListener f970f;

    /* renamed from: g */
    AbstractC0330a f971g;

    /* renamed from: h */
    SearchableInfo f972h;

    /* renamed from: j */
    View.OnKeyListener f973j;

    /* renamed from: k */
    private final View f974k;

    /* renamed from: l */
    private final View f975l;

    /* renamed from: m */
    private final View f976m;

    /* renamed from: n */
    private final View f977n;

    /* renamed from: o */
    private C0268df f978o;

    /* renamed from: p */
    private Rect f979p;

    /* renamed from: q */
    private Rect f980q;

    /* renamed from: r */
    private int[] f981r;

    /* renamed from: s */
    private int[] f982s;

    /* renamed from: t */
    private final ImageView f983t;

    /* renamed from: u */
    private final Drawable f984u;

    /* renamed from: v */
    private final int f985v;

    /* renamed from: w */
    private final int f986w;

    /* renamed from: x */
    private final Intent f987x;

    /* renamed from: y */
    private final Intent f988y;

    /* renamed from: z */
    private final CharSequence f989z;

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f979p = new Rect();
        this.f980q = new Rect();
        this.f981r = new int[2];
        this.f982s = new int[2];
        this.f957R = new RunnableC0251cp(this);
        this.f958S = new RunnableC0253cr(this);
        this.f959T = new WeakHashMap<>();
        this.f960U = new ViewOnClickListenerC0256cu(this);
        this.f973j = new ViewOnKeyListenerC0257cv(this);
        this.f961V = new C0258cw(this);
        this.f962W = new C0259cx(this);
        this.f964aa = new C0260cy(this);
        this.f965ab = new C0252cq(this);
        C0276dn m944a = C0276dn.m944a(context, attributeSet, R.styleable.SearchView, i, 0);
        LayoutInflater.from(context).inflate(m944a.m962g(R.styleable.SearchView_layout, R.layout.abc_search_view), (ViewGroup) this, true);
        this.f963a = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f963a.setSearchView(this);
        this.f974k = findViewById(R.id.search_edit_frame);
        this.f975l = findViewById(R.id.search_plate);
        this.f976m = findViewById(R.id.submit_area);
        this.f966b = (ImageView) findViewById(R.id.search_button);
        this.f967c = (ImageView) findViewById(R.id.search_go_btn);
        this.f968d = (ImageView) findViewById(R.id.search_close_btn);
        this.f969e = (ImageView) findViewById(R.id.search_voice_btn);
        this.f983t = (ImageView) findViewById(R.id.search_mag_icon);
        C0538w.m1846a(this.f975l, m944a.m948a(R.styleable.SearchView_queryBackground));
        C0538w.m1846a(this.f976m, m944a.m948a(R.styleable.SearchView_submitBackground));
        this.f966b.setImageDrawable(m944a.m948a(R.styleable.SearchView_searchIcon));
        this.f967c.setImageDrawable(m944a.m948a(R.styleable.SearchView_goIcon));
        this.f968d.setImageDrawable(m944a.m948a(R.styleable.SearchView_closeIcon));
        this.f969e.setImageDrawable(m944a.m948a(R.styleable.SearchView_voiceIcon));
        this.f983t.setImageDrawable(m944a.m948a(R.styleable.SearchView_searchIcon));
        this.f984u = m944a.m948a(R.styleable.SearchView_searchHintIcon);
        C0287dy.m973a(this.f966b, getResources().getString(R.string.abc_searchview_description_search));
        this.f985v = m944a.m962g(R.styleable.SearchView_suggestionRowLayout, R.layout.abc_search_dropdown_item_icons_2line);
        this.f986w = m944a.m962g(R.styleable.SearchView_commitIcon, 0);
        this.f966b.setOnClickListener(this.f960U);
        this.f968d.setOnClickListener(this.f960U);
        this.f967c.setOnClickListener(this.f960U);
        this.f969e.setOnClickListener(this.f960U);
        this.f963a.setOnClickListener(this.f960U);
        this.f963a.addTextChangedListener(this.f965ab);
        this.f963a.setOnEditorActionListener(this.f961V);
        this.f963a.setOnItemClickListener(this.f962W);
        this.f963a.setOnItemSelectedListener(this.f964aa);
        this.f963a.setOnKeyListener(this.f973j);
        this.f963a.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0254cs(this));
        setIconifiedByDefault(m944a.m949a(R.styleable.SearchView_iconifiedByDefault, true));
        int m958e = m944a.m958e(R.styleable.SearchView_android_maxWidth, -1);
        if (m958e != -1) {
            setMaxWidth(m958e);
        }
        this.f989z = m944a.m954c(R.styleable.SearchView_defaultQueryHint);
        this.f947H = m944a.m954c(R.styleable.SearchView_queryHint);
        int m946a = m944a.m946a(R.styleable.SearchView_android_imeOptions, -1);
        if (m946a != -1) {
            setImeOptions(m946a);
        }
        int m946a2 = m944a.m946a(R.styleable.SearchView_android_inputType, -1);
        if (m946a2 != -1) {
            setInputType(m946a2);
        }
        setFocusable(m944a.m949a(R.styleable.SearchView_android_focusable, true));
        m944a.m952b();
        this.f987x = new Intent("android.speech.action.WEB_SEARCH");
        this.f987x.addFlags(268435456);
        this.f987x.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f988y = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f988y.addFlags(268435456);
        this.f977n = findViewById(this.f963a.getDropDownAnchor());
        if (this.f977n != null) {
            this.f977n.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0255ct(this));
        }
        m603a(this.f944E);
        m613p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f985v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f986w;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f972h = searchableInfo;
        Intent intent = null;
        if (this.f972h != null) {
            this.f963a.setThreshold(this.f972h.getSuggestThreshold());
            this.f963a.setImeOptions(this.f972h.getImeOptions());
            int inputType = this.f972h.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f972h.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.f963a.setInputType(inputType);
            if (this.f971g != null) {
                this.f971g.mo934a((Cursor) null);
            }
            if (this.f972h.getSuggestAuthority() != null) {
                this.f971g = new ViewOnClickListenerC0269dg(getContext(), this, this.f972h, this.f959T);
                this.f963a.setAdapter(this.f971g);
                ((ViewOnClickListenerC0269dg) this.f971g).m933a(this.f948I ? 2 : 1);
            }
            m613p();
        }
        boolean z = false;
        if (this.f972h != null && this.f972h.getVoiceSearchEnabled()) {
            if (this.f972h.getVoiceSearchLaunchWebSearch()) {
                intent = this.f987x;
            } else if (this.f972h.getVoiceSearchLaunchRecognizer()) {
                intent = this.f988y;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                z = true;
            }
        }
        this.f951L = z;
        if (this.f951L) {
            this.f963a.setPrivateImeOptions("nm");
        }
        m603a(this.f945F);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f956Q = bundle;
    }

    public void setImeOptions(int i) {
        this.f963a.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.f963a.getImeOptions();
    }

    public void setInputType(int i) {
        this.f963a.setInputType(i);
    }

    public int getInputType() {
        return this.f963a.getInputType();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f949J || !isFocusable()) {
            return false;
        }
        if (!this.f945F) {
            boolean requestFocus = this.f963a.requestFocus(i, rect);
            if (requestFocus) {
                m603a(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f949J = true;
        super.clearFocus();
        this.f963a.clearFocus();
        this.f963a.setImeVisibility(false);
        this.f949J = false;
    }

    public void setOnQueryTextListener(InterfaceC0264db interfaceC0264db) {
        this.f940A = interfaceC0264db;
    }

    public void setOnCloseListener(InterfaceC0263da interfaceC0263da) {
        this.f941B = interfaceC0263da;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f970f = onFocusChangeListener;
    }

    public void setOnSuggestionListener(InterfaceC0265dc interfaceC0265dc) {
        this.f942C = interfaceC0265dc;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f943D = onClickListener;
    }

    public CharSequence getQuery() {
        return this.f963a.getText();
    }

    public final void setQuery$609c24db(CharSequence charSequence) {
        this.f963a.setText(charSequence);
        this.f963a.setSelection(this.f963a.length());
        this.f953N = charSequence;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f947H = charSequence;
        m613p();
    }

    public CharSequence getQueryHint() {
        if (this.f947H != null) {
            return this.f947H;
        }
        if (this.f972h != null && this.f972h.getHintId() != 0) {
            return getContext().getText(this.f972h.getHintId());
        }
        return this.f989z;
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f944E == z) {
            return;
        }
        this.f944E = z;
        m603a(z);
        m613p();
    }

    public void setIconified(boolean z) {
        if (z) {
            m622e();
        } else {
            m623f();
        }
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f946G = z;
        m603a(this.f945F);
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f948I = z;
        if (this.f971g instanceof ViewOnClickListenerC0269dg) {
            ((ViewOnClickListenerC0269dg) this.f971g).m933a(z ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(AbstractC0330a abstractC0330a) {
        this.f971g = abstractC0330a;
        this.f963a.setAdapter(this.f971g);
    }

    public AbstractC0330a getSuggestionsAdapter() {
        return this.f971g;
    }

    public void setMaxWidth(int i) {
        this.f950K = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.f950K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f963a;
            Rect rect = this.f979p;
            searchAutoComplete.getLocationInWindow(this.f981r);
            getLocationInWindow(this.f982s);
            int i5 = this.f981r[1] - this.f982s[1];
            int i6 = this.f981r[0] - this.f982s[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            this.f980q.set(this.f979p.left, 0, this.f979p.right, i4 - i2);
            if (this.f978o == null) {
                this.f978o = new C0268df(this.f980q, this.f979p, this.f963a);
                setTouchDelegate(this.f978o);
            } else {
                this.f978o.m919a(this.f980q, this.f979p);
            }
        }
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    /* renamed from: a */
    private void m603a(boolean z) {
        this.f945F = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f963a.getText());
        this.f966b.setVisibility(i2);
        m605b(z2);
        this.f974k.setVisibility(z ? 8 : 0);
        if (this.f983t.getDrawable() != null && !this.f944E) {
            i = 0;
        }
        this.f983t.setVisibility(i);
        m611n();
        m607c(z2 ? false : true);
        m610m();
    }

    /* renamed from: l */
    private boolean m609l() {
        return (this.f946G || this.f951L) && !this.f945F;
    }

    /* renamed from: b */
    private void m605b(boolean z) {
        this.f967c.setVisibility((this.f946G && m609l() && hasFocus() && (z || !this.f951L)) ? 0 : 8);
    }

    /* renamed from: m */
    private void m610m() {
        this.f976m.setVisibility((m609l() && (this.f967c.getVisibility() == 0 || this.f969e.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: n */
    private void m611n() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f963a.getText());
        if (!z2 && (!this.f944E || this.f954O)) {
            z = false;
        }
        this.f968d.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f968d.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: o */
    private void m612o() {
        post(this.f957R);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m619c() {
        int[] iArr = this.f963a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.f975l.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f976m.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f957R);
        post(this.f958S);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m614a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m616a(int i, KeyEvent keyEvent) {
        if (this.f972h != null && this.f971g != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m618b(this.f963a.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.f963a.setSelection(i == 21 ? 0 : this.f963a.length());
                this.f963a.setListSelection(0);
                this.f963a.clearListSelection();
                f939i.m914c(this.f963a);
                return true;
            }
            if (i != 19 || this.f963a.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private CharSequence m606c(CharSequence charSequence) {
        if (!this.f944E || this.f984u == null) {
            return charSequence;
        }
        int textSize = (int) (this.f963a.getTextSize() * 1.25d);
        this.f984u.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f984u), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: p */
    private void m613p() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f963a;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(m606c(queryHint));
    }

    /* renamed from: c */
    private void m607c(boolean z) {
        int i;
        if (this.f951L && !this.f945F && z) {
            i = 0;
            this.f967c.setVisibility(8);
        } else {
            i = 8;
        }
        this.f969e.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m617b(CharSequence charSequence) {
        Editable text = this.f963a.getText();
        this.f953N = text;
        boolean z = !TextUtils.isEmpty(text);
        m605b(z);
        m607c(z ? false : true);
        m611n();
        m610m();
        if (this.f940A != null && !TextUtils.equals(charSequence, this.f952M)) {
            charSequence.toString();
        }
        this.f952M = charSequence.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m621d() {
        Editable text = this.f963a.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f940A != null) {
            InterfaceC0264db interfaceC0264db = this.f940A;
            text.toString();
            if (interfaceC0264db.m916a()) {
                return;
            }
        }
        if (this.f972h != null) {
            m615a(text.toString());
        }
        this.f963a.setImeVisibility(false);
        this.f963a.dismissDropDown();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m622e() {
        if (TextUtils.isEmpty(this.f963a.getText())) {
            if (this.f944E) {
                if (this.f941B == null || !this.f941B.m915a()) {
                    clearFocus();
                    m603a(true);
                    return;
                }
                return;
            }
            return;
        }
        this.f963a.setText(BuildConfig.FLAVOR);
        this.f963a.requestFocus();
        this.f963a.setImeVisibility(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m623f() {
        m603a(false);
        this.f963a.requestFocus();
        this.f963a.setImeVisibility(true);
        if (this.f943D != null) {
            this.f943D.onClick(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m624g() {
        if (this.f972h == null) {
            return;
        }
        SearchableInfo searchableInfo = this.f972h;
        try {
            String str = null;
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    Intent intent = this.f988y;
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    Intent intent2 = new Intent("android.intent.action.SEARCH");
                    intent2.setComponent(searchActivity);
                    PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
                    Bundle bundle = new Bundle();
                    if (this.f956Q != null) {
                        bundle.putParcelable("app_data", this.f956Q);
                    }
                    Intent intent3 = new Intent(intent);
                    Resources resources = getResources();
                    String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
                    String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
                    String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
                    int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
                    intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
                    intent3.putExtra("android.speech.extra.PROMPT", string2);
                    intent3.putExtra("android.speech.extra.LANGUAGE", string3);
                    intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
                    if (searchActivity != null) {
                        str = searchActivity.flattenToShortString();
                    }
                    intent3.putExtra("calling_package", str);
                    intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                    intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                    getContext().startActivity(intent3);
                    return;
                }
                return;
            }
            Intent intent4 = new Intent(this.f987x);
            ComponentName searchActivity2 = searchableInfo.getSearchActivity();
            if (searchActivity2 != null) {
                str = searchActivity2.flattenToShortString();
            }
            intent4.putExtra("calling_package", str);
            getContext().startActivity(intent4);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m612o();
    }

    @Override // androidx.appcompat.view.InterfaceC0130d
    /* renamed from: b */
    public final void mo313b() {
        setQuery$609c24db(BuildConfig.FLAVOR);
        clearFocus();
        m603a(true);
        this.f963a.setImeOptions(this.f955P);
        this.f954O = false;
    }

    @Override // androidx.appcompat.view.InterfaceC0130d
    /* renamed from: a */
    public final void mo312a() {
        if (this.f954O) {
            return;
        }
        this.f954O = true;
        this.f955P = this.f963a.getImeOptions();
        this.f963a.setImeOptions(this.f955P | 33554432);
        this.f963a.setText(BuildConfig.FLAVOR);
        setIconified(false);
    }

    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0266dd();

        /* renamed from: a */
        boolean f990a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f990a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f990a));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f990a + "}";
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f990a = this.f945F;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        m603a(savedState.f990a);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m626j() {
        int i;
        if (this.f977n.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f975l.getPaddingLeft();
            Rect rect = new Rect();
            boolean m987a = C0295ef.m987a(this);
            int dimensionPixelSize = this.f944E ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
            this.f963a.getDropDownBackground().getPadding(rect);
            if (m987a) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f963a.setDropDownHorizontalOffset(i);
            this.f963a.setDropDownWidth((((this.f977n.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m618b(int i) {
        if (this.f942C != null && this.f942C.m918b()) {
            return false;
        }
        m608d(i);
        this.f963a.setImeVisibility(false);
        this.f963a.dismissDropDown();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m620c(int i) {
        if (this.f942C != null && this.f942C.m917a()) {
            return false;
        }
        Editable text = this.f963a.getText();
        Cursor mo1077a = this.f971g.mo1077a();
        if (mo1077a == null) {
            return true;
        }
        if (mo1077a.moveToPosition(i)) {
            CharSequence mo936b = this.f971g.mo936b(mo1077a);
            if (mo936b != null) {
                setQuery(mo936b);
                return true;
            }
            setQuery(text);
            return true;
        }
        setQuery(text);
        return true;
    }

    /* renamed from: d */
    private boolean m608d(int i) {
        Cursor mo1077a = this.f971g.mo1077a();
        if (mo1077a == null || !mo1077a.moveToPosition(i)) {
            return false;
        }
        m602a(m600a(mo1077a));
        return true;
    }

    /* renamed from: a */
    private void m602a(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e) {
            Log.e("SearchView", "Failed launch activity: ".concat(String.valueOf(intent)), e);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f963a.setText(charSequence);
        this.f963a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m615a(String str) {
        getContext().startActivity(m601a("android.intent.action.SEARCH", null, null, str));
    }

    /* renamed from: a */
    private Intent m601a(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f953N);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f956Q != null) {
            intent.putExtra("app_data", this.f956Q);
        }
        intent.setComponent(this.f972h.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private Intent m600a(Cursor cursor) {
        int i;
        String m924a;
        try {
            String m924a2 = ViewOnClickListenerC0269dg.m924a(cursor, "suggest_intent_action");
            if (m924a2 == null) {
                m924a2 = this.f972h.getSuggestIntentAction();
            }
            if (m924a2 == null) {
                m924a2 = "android.intent.action.SEARCH";
            }
            String m924a3 = ViewOnClickListenerC0269dg.m924a(cursor, "suggest_intent_data");
            if (m924a3 == null) {
                m924a3 = this.f972h.getSuggestIntentData();
            }
            if (m924a3 != null && (m924a = ViewOnClickListenerC0269dg.m924a(cursor, "suggest_intent_data_id")) != null) {
                m924a3 = m924a3 + "/" + Uri.encode(m924a);
            }
            return m601a(m924a2, m924a3 == null ? null : Uri.parse(m924a3), ViewOnClickListenerC0269dg.m924a(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC0269dg.m924a(cursor, "suggest_intent_query"));
        } catch (RuntimeException e) {
            try {
                i = cursor.getPosition();
            } catch (RuntimeException unused) {
                i = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i + " returned exception.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m627k() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f963a.refreshAutoCompleteResults();
        } else {
            f939i.m912a(this.f963a);
            f939i.m913b(this.f963a);
        }
    }

    /* renamed from: a */
    static boolean m604a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* loaded from: classes.dex */
    public class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: a */
        final Runnable f991a;

        /* renamed from: b */
        private int f992b;

        /* renamed from: c */
        private SearchView f993c;

        /* renamed from: d */
        private boolean f994d;

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f991a = new RunnableC0267de(this);
            this.f992b = getThreshold();
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        void setSearchView(SearchView searchView) {
            this.f993c = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f992b = i;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f993c.hasFocus() && getVisibility() == 0) {
                this.f994d = true;
                if (SearchView.m604a(getContext())) {
                    SearchView.f939i.m914c(this);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f993c.m625h();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f992b <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f993c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f994d) {
                removeCallbacks(this.f991a);
                post(this.f991a);
            }
            return onCreateInputConnection;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final void m628a() {
            if (this.f994d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f994d = false;
            }
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f994d = false;
                removeCallbacks(this.f991a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.f994d = false;
                    removeCallbacks(this.f991a);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.f994d = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f945F) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            size = this.f950K > 0 ? Math.min(this.f950K, size) : Math.min(getPreferredWidth(), size);
        } else if (mode != 0) {
            if (mode == 1073741824 && this.f950K > 0) {
                size = Math.min(this.f950K, size);
            }
        } else {
            size = this.f950K > 0 ? this.f950K : getPreferredWidth();
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* renamed from: h */
    final void m625h() {
        m603a(this.f945F);
        m612o();
        if (this.f963a.hasFocus()) {
            m627k();
        }
    }
}
