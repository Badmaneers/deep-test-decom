package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.content.C0420a;
import androidx.p012c.p013a.AbstractC0335f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SuggestionsAdapter.java */
@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.dg */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0269dg extends AbstractC0335f implements View.OnClickListener {

    /* renamed from: j */
    private final SearchManager f1327j;

    /* renamed from: k */
    private final SearchView f1328k;

    /* renamed from: l */
    private final SearchableInfo f1329l;

    /* renamed from: m */
    private final Context f1330m;

    /* renamed from: n */
    private final WeakHashMap<String, Drawable.ConstantState> f1331n;

    /* renamed from: o */
    private final int f1332o;

    /* renamed from: p */
    private boolean f1333p;

    /* renamed from: q */
    private int f1334q;

    /* renamed from: r */
    private ColorStateList f1335r;

    /* renamed from: s */
    private int f1336s;

    /* renamed from: t */
    private int f1337t;

    /* renamed from: u */
    private int f1338u;

    /* renamed from: v */
    private int f1339v;

    /* renamed from: w */
    private int f1340w;

    /* renamed from: x */
    private int f1341x;

    @Override // androidx.p012c.p013a.AbstractC0330a, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    public ViewOnClickListenerC0269dg(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f1333p = false;
        this.f1334q = 1;
        this.f1336s = -1;
        this.f1337t = -1;
        this.f1338u = -1;
        this.f1339v = -1;
        this.f1340w = -1;
        this.f1341x = -1;
        this.f1327j = (SearchManager) this.f1518d.getSystemService("search");
        this.f1328k = searchView;
        this.f1329l = searchableInfo;
        this.f1332o = searchView.getSuggestionCommitIconResId();
        this.f1330m = context;
        this.f1331n = weakHashMap;
    }

    /* renamed from: a */
    public final void m933a(int i) {
        this.f1334q = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d A[Catch: RuntimeException -> 0x0081, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0081, blocks: (B:8:0x001c, B:12:0x007d, B:17:0x0022, B:20:0x0029, B:22:0x004a, B:23:0x004d, B:25:0x0058, B:26:0x0064, B:27:0x0060), top: B:7:0x001c }] */
    @Override // androidx.p012c.p013a.AbstractC0330a, androidx.p012c.p013a.InterfaceC0334e
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.Cursor mo931a(java.lang.CharSequence r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L5
            java.lang.String r11 = ""
            goto L9
        L5:
            java.lang.String r11 = r11.toString()
        L9:
            androidx.appcompat.widget.SearchView r0 = r10.f1328k
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L8a
            androidx.appcompat.widget.SearchView r0 = r10.f1328k
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L1c
            goto L8a
        L1c:
            android.app.SearchableInfo r0 = r10.f1329l     // Catch: java.lang.RuntimeException -> L81
            if (r0 != 0) goto L22
        L20:
            r10 = r1
            goto L7b
        L22:
            java.lang.String r2 = r0.getSuggestAuthority()     // Catch: java.lang.RuntimeException -> L81
            if (r2 != 0) goto L29
            goto L20
        L29:
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch: java.lang.RuntimeException -> L81
            r3.<init>()     // Catch: java.lang.RuntimeException -> L81
            java.lang.String r4 = "content"
            android.net.Uri$Builder r3 = r3.scheme(r4)     // Catch: java.lang.RuntimeException -> L81
            android.net.Uri$Builder r2 = r3.authority(r2)     // Catch: java.lang.RuntimeException -> L81
            java.lang.String r3 = ""
            android.net.Uri$Builder r2 = r2.query(r3)     // Catch: java.lang.RuntimeException -> L81
            java.lang.String r3 = ""
            android.net.Uri$Builder r2 = r2.fragment(r3)     // Catch: java.lang.RuntimeException -> L81
            java.lang.String r3 = r0.getSuggestPath()     // Catch: java.lang.RuntimeException -> L81
            if (r3 == 0) goto L4d
            r2.appendEncodedPath(r3)     // Catch: java.lang.RuntimeException -> L81
        L4d:
            java.lang.String r3 = "search_suggest_query"
            r2.appendPath(r3)     // Catch: java.lang.RuntimeException -> L81
            java.lang.String r7 = r0.getSuggestSelection()     // Catch: java.lang.RuntimeException -> L81
            if (r7 == 0) goto L60
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.RuntimeException -> L81
            r3 = 0
            r0[r3] = r11     // Catch: java.lang.RuntimeException -> L81
            r8 = r0
            goto L64
        L60:
            r2.appendPath(r11)     // Catch: java.lang.RuntimeException -> L81
            r8 = r1
        L64:
            java.lang.String r11 = "limit"
            java.lang.String r0 = "50"
            r2.appendQueryParameter(r11, r0)     // Catch: java.lang.RuntimeException -> L81
            android.net.Uri r5 = r2.build()     // Catch: java.lang.RuntimeException -> L81
            android.content.Context r10 = r10.f1518d     // Catch: java.lang.RuntimeException -> L81
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch: java.lang.RuntimeException -> L81
            r6 = 0
            r9 = 0
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.RuntimeException -> L81
        L7b:
            if (r10 == 0) goto L89
            r10.getCount()     // Catch: java.lang.RuntimeException -> L81
            return r10
        L81:
            r10 = move-exception
            java.lang.String r11 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions query threw an exception."
            android.util.Log.w(r11, r0, r10)
        L89:
            return r1
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ViewOnClickListenerC0269dg.mo931a(java.lang.CharSequence):android.database.Cursor");
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m930c(mo1077a());
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m930c(mo1077a());
    }

    /* renamed from: c */
    private static void m930c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // androidx.p012c.p013a.AbstractC0330a, androidx.p012c.p013a.InterfaceC0334e
    /* renamed from: a */
    public final void mo934a(Cursor cursor) {
        if (this.f1333p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo934a(cursor);
            if (cursor != null) {
                this.f1336s = cursor.getColumnIndex("suggest_text_1");
                this.f1337t = cursor.getColumnIndex("suggest_text_2");
                this.f1338u = cursor.getColumnIndex("suggest_text_2_url");
                this.f1339v = cursor.getColumnIndex("suggest_icon_1");
                this.f1340w = cursor.getColumnIndex("suggest_icon_2");
                this.f1341x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // androidx.p012c.p013a.AbstractC0335f, androidx.p012c.p013a.AbstractC0330a
    /* renamed from: a */
    public final View mo932a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo932a = super.mo932a(context, cursor, viewGroup);
        mo932a.setTag(new C0270dh(mo932a));
        ((ImageView) mo932a.findViewById(R.id.edit_query)).setImageResource(this.f1332o);
        return mo932a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p012c.p013a.AbstractC0330a
    /* renamed from: a */
    public final void mo935a(View view, Context context, Cursor cursor) {
        Drawable m922a;
        String str;
        C0270dh c0270dh = (C0270dh) view.getTag();
        int i = this.f1341x != -1 ? cursor.getInt(this.f1341x) : 0;
        if (c0270dh.f1342a != null) {
            m926a(c0270dh.f1342a, m923a(cursor, this.f1336s));
        }
        if (c0270dh.f1343b != null) {
            String m923a = m923a(cursor, this.f1338u);
            if (m923a == null) {
                str = m923a(cursor, this.f1337t);
            } else {
                if (this.f1335r == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f1518d.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f1335r = this.f1518d.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(m923a);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1335r, null), 0, m923a.length(), 33);
                str = spannableString;
            }
            if (TextUtils.isEmpty(str)) {
                if (c0270dh.f1342a != null) {
                    c0270dh.f1342a.setSingleLine(false);
                    c0270dh.f1342a.setMaxLines(2);
                }
            } else if (c0270dh.f1342a != null) {
                c0270dh.f1342a.setSingleLine(true);
                c0270dh.f1342a.setMaxLines(1);
            }
            m926a(c0270dh.f1343b, str);
        }
        if (c0270dh.f1344c != null) {
            ImageView imageView = c0270dh.f1344c;
            if (this.f1339v == -1) {
                m922a = null;
            } else {
                m922a = m922a(cursor.getString(this.f1339v));
                if (m922a == null) {
                    ComponentName searchActivity = this.f1329l.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.f1331n.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = this.f1331n.get(flattenToShortString);
                        m922a = constantState == null ? null : constantState.newDrawable(this.f1330m.getResources());
                    } else {
                        m922a = m920a(searchActivity);
                        this.f1331n.put(flattenToShortString, m922a == null ? null : m922a.getConstantState());
                    }
                    if (m922a == null) {
                        m922a = this.f1518d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            m925a(imageView, m922a, 4);
        }
        if (c0270dh.f1345d != null) {
            m925a(c0270dh.f1345d, this.f1340w != -1 ? m922a(cursor.getString(this.f1340w)) : null, 8);
        }
        if (this.f1334q == 2 || (this.f1334q == 1 && (i & 1) != 0)) {
            c0270dh.f1346e.setVisibility(0);
            c0270dh.f1346e.setTag(c0270dh.f1342a.getText());
            c0270dh.f1346e.setOnClickListener(this);
            return;
        }
        c0270dh.f1346e.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1328k.m614a((CharSequence) tag);
        }
    }

    /* renamed from: a */
    private static void m926a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    private static void m925a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // androidx.p012c.p013a.AbstractC0330a, androidx.p012c.p013a.InterfaceC0334e
    /* renamed from: b */
    public final CharSequence mo936b(Cursor cursor) {
        String m924a;
        String m924a2;
        if (cursor == null) {
            return null;
        }
        String m924a3 = m924a(cursor, "suggest_intent_query");
        if (m924a3 != null) {
            return m924a3;
        }
        if (this.f1329l.shouldRewriteQueryFromData() && (m924a2 = m924a(cursor, "suggest_intent_data")) != null) {
            return m924a2;
        }
        if (!this.f1329l.shouldRewriteQueryFromText() || (m924a = m924a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m924a;
    }

    @Override // androidx.p012c.p013a.AbstractC0330a, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo932a = mo932a(this.f1518d, this.f1517c, viewGroup);
            if (mo932a != null) {
                ((C0270dh) mo932a.getTag()).f1342a.setText(e.toString());
            }
            return mo932a;
        }
    }

    @Override // androidx.p012c.p013a.AbstractC0330a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo1078b(this.f1518d, this.f1517c, viewGroup);
            if (b != null) {
                ((C0270dh) b.getTag()).f1342a.setText(e.toString());
            }
            return b;
        }
    }

    /* renamed from: a */
    private Drawable m922a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1330m.getPackageName() + "/" + parseInt;
            Drawable m929b = m929b(str2);
            if (m929b != null) {
                return m929b;
            }
            Drawable m1483a = C0420a.m1483a(this.f1330m, parseInt);
            m927a(str2, m1483a);
            return m1483a;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(String.valueOf(str)));
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m929b2 = m929b(str);
            if (m929b2 != null) {
                return m929b2;
            }
            Drawable m921a = m921a(Uri.parse(str));
            m927a(str, m921a);
            return m921a;
        }
    }

    /* renamed from: a */
    private Drawable m921a(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m928b(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: ".concat(String.valueOf(uri)));
                }
            }
            InputStream openInputStream = this.f1330m.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open ".concat(String.valueOf(uri)));
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for ".concat(String.valueOf(uri)), e);
                }
            }
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    /* renamed from: b */
    private Drawable m929b(String str) {
        Drawable.ConstantState constantState = this.f1331n.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private void m927a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1331n.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: a */
    private Drawable m920a(ComponentName componentName) {
        PackageManager packageManager = this.f1518d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m924a(Cursor cursor, String str) {
        return m923a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static String m923a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: b */
    private Drawable m928b(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: ".concat(String.valueOf(uri)));
        }
        try {
            Resources resourcesForApplication = this.f1518d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: ".concat(String.valueOf(uri)));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(uri)));
                }
            } else if (size == 2) {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(uri)));
            }
            if (parseInt == 0) {
                throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(uri)));
            }
            return resourcesForApplication.getDrawable(parseInt);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(uri)));
        }
    }
}
