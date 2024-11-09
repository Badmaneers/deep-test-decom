package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: TextViewCompat.java */
/* renamed from: androidx.core.widget.p */
/* loaded from: classes.dex */
final class ActionModeCallbackC0578p implements ActionMode.Callback {

    /* renamed from: a */
    private final ActionMode.Callback f2525a;

    /* renamed from: b */
    private final TextView f2526b;

    /* renamed from: c */
    private Class<?> f2527c;

    /* renamed from: d */
    private Method f2528d;

    /* renamed from: e */
    private boolean f2529e;

    /* renamed from: f */
    private boolean f2530f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActionModeCallbackC0578p(ActionMode.Callback callback, TextView textView) {
        this.f2525a = callback;
        this.f2526b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f2525a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f2525a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f2525a.onDestroyActionMode(actionMode);
    }

    /* renamed from: a */
    private static Intent m2056a() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context = this.f2526b.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f2530f) {
            this.f2530f = true;
            try {
                this.f2527c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f2528d = this.f2527c.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f2529e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f2527c = null;
                this.f2528d = null;
                this.f2529e = false;
            }
        }
        try {
            Method declaredMethod = (this.f2529e && this.f2527c.isInstance(menu)) ? this.f2528d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m2056a(), 0)) {
                    if (context.getPackageName().equals(resolveInfo.activityInfo.packageName) || (resolveInfo.activityInfo.exported && (resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0))) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                MenuItem add = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                TextView textView = this.f2526b;
                add.setIntent(m2056a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled())).setClassName(resolveInfo2.activityInfo.packageName, resolveInfo2.activityInfo.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f2525a.onPrepareActionMode(actionMode, menu);
    }
}
