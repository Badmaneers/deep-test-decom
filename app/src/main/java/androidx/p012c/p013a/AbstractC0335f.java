package androidx.p012c.p013a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter.java */
/* renamed from: androidx.c.a.f */
/* loaded from: classes.dex */
public abstract class AbstractC0335f extends AbstractC0330a {

    /* renamed from: j */
    private int f1527j;

    /* renamed from: k */
    private int f1528k;

    /* renamed from: l */
    private LayoutInflater f1529l;

    @Deprecated
    public AbstractC0335f(Context context, int i) {
        super(context);
        this.f1528k = i;
        this.f1527j = i;
        this.f1529l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.p012c.p013a.AbstractC0330a
    /* renamed from: a */
    public View mo932a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1529l.inflate(this.f1527j, viewGroup, false);
    }

    @Override // androidx.p012c.p013a.AbstractC0330a
    /* renamed from: b */
    public final View mo1078b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1529l.inflate(this.f1528k, viewGroup, false);
    }
}
