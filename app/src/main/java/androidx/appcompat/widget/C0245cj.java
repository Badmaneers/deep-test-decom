package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* compiled from: ResourcesWrapper.java */
/* renamed from: androidx.appcompat.widget.cj */
/* loaded from: classes.dex */
class C0245cj extends Resources {

    /* renamed from: a */
    private final Resources f1284a;

    public C0245cj(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1284a = resources;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) {
        return this.f1284a.getText(i);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) {
        return this.f1284a.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public String getString(int i) {
        return this.f1284a.getString(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) {
        return this.f1284a.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.f1284a.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) {
        return this.f1284a.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f1284a.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) {
        return this.f1284a.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) {
        return this.f1284a.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) {
        return this.f1284a.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) {
        return this.f1284a.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) {
        return this.f1284a.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) {
        return this.f1284a.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) {
        return this.f1284a.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        return this.f1284a.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        return this.f1284a.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) {
        return this.f1284a.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) {
        return this.f1284a.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.f1284a.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) {
        return this.f1284a.getMovie(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) {
        return this.f1284a.getColor(i);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) {
        return this.f1284a.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) {
        return this.f1284a.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) {
        return this.f1284a.getInteger(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) {
        return this.f1284a.getLayout(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) {
        return this.f1284a.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) {
        return this.f1284a.getXml(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) {
        return this.f1284a.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.f1284a.openRawResource(i, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.f1284a.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.f1284a.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.f1284a.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.f1284a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1284a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        if (this.f1284a != null) {
            this.f1284a.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f1284a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f1284a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f1284a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) {
        return this.f1284a.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) {
        return this.f1284a.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) {
        return this.f1284a.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) {
        return this.f1284a.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f1284a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f1284a.parseBundleExtra(str, attributeSet, bundle);
    }
}
