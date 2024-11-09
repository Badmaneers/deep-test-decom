package com.color.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.SearchView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ColorSearchView extends SearchView {

    /* renamed from: k */
    private SearchView.SearchAutoComplete f6464k;

    /* renamed from: l */
    private boolean f6465l;

    public ColorSearchView(Context context) {
        super(context);
        this.f6465l = true;
    }

    public ColorSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6465l = true;
    }

    public ColorSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6465l = true;
    }

    public SearchView.SearchAutoComplete getSearchAutoComplete() {
        if (this.f6464k == null) {
            try {
                Field declaredField = Class.forName("androidx.appcompat.widget.SearchView").getDeclaredField("mSearchSrcTextView");
                declaredField.setAccessible(true);
                this.f6464k = (SearchView.SearchAutoComplete) declaredField.get(this);
                return this.f6464k;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return this.f6464k;
    }
}
