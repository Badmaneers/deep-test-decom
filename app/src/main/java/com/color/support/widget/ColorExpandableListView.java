package com.color.support.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

/* loaded from: classes.dex */
public class ColorExpandableListView extends ExpandableListView {

    /* renamed from: a */
    private ExpandableListView.OnGroupClickListener f6037a;

    /* renamed from: b */
    private C1361ac f6038b;

    public ColorExpandableListView(Context context) {
        this(context, null);
    }

    public ColorExpandableListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ColorExpandableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setDivider(null);
        setChildDivider(null);
        setGroupIndicator(null);
        super.setOnGroupClickListener(new C1634w(this));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams.height == -2) {
            throw new RuntimeException("cannot set wrap_content");
        }
        super.setLayoutParams(layoutParams);
    }

    @Override // android.widget.ListView
    public void setDivider(Drawable drawable) {
        if (drawable != null) {
            throw new RuntimeException("cannot set divider");
        }
        super.setDivider(null);
    }

    @Override // android.widget.ExpandableListView
    public void setChildDivider(Drawable drawable) {
        if (drawable != null) {
            throw new RuntimeException("cannot set childDivider.");
        }
        super.setChildDivider(null);
    }

    @Override // android.widget.ExpandableListView
    public void setGroupIndicator(Drawable drawable) {
        if (drawable != null) {
            throw new RuntimeException("cannot set groupIndicator.");
        }
        super.setGroupIndicator(null);
    }

    @Override // android.widget.ExpandableListView
    public void setOnGroupClickListener(ExpandableListView.OnGroupClickListener onGroupClickListener) {
        this.f6037a = onGroupClickListener;
    }

    @Override // android.widget.ExpandableListView
    public void setAdapter(ExpandableListAdapter expandableListAdapter) {
        this.f6038b = new C1361ac(expandableListAdapter, this);
        super.setAdapter(this.f6038b);
    }

    @Override // android.widget.ExpandableListView
    public boolean expandGroup(int i) {
        if (!C1361ac.m4873a(this.f6038b, i)) {
            return false;
        }
        boolean expandGroup = super.expandGroup(i);
        if (expandGroup) {
            return expandGroup;
        }
        C1361ac.m4874b(this.f6038b, i);
        return expandGroup;
    }

    @Override // android.widget.ExpandableListView
    public boolean collapseGroup(int i) {
        boolean m4876c = C1361ac.m4876c(this.f6038b, i);
        if (m4876c) {
            this.f6038b.notifyDataSetChanged();
        }
        return m4876c;
    }
}
