package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.C0131e;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.C0273dk;
import androidx.core.p024g.C0538w;
import androidx.p011b.C0318a;
import java.lang.reflect.Constructor;
import java.util.Map;

/* loaded from: classes.dex */
public class AppCompatViewInflater {

    /* renamed from: a */
    private static final Class<?>[] f190a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f191b = {R.attr.onClick};

    /* renamed from: c */
    private static final String[] f192c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f193d = new C0318a();

    /* renamed from: e */
    private final Object[] f194e = new Object[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final View m146a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3) {
        View mo147a;
        Context context2 = (!z || view == null) ? context : view.getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.View, 0, 0);
        int resourceId = z2 ? obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.View_android_theme, 0) : 0;
        if (resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0 && (!(context2 instanceof C0131e) || ((C0131e) context2).getThemeResId() != resourceId)) {
            context2 = new C0131e(context2, resourceId);
        }
        if (z3) {
            context2 = C0273dk.m940a(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = '\f';
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\r';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mo147a = mo147a(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case 1:
                mo147a = new AppCompatImageView(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case 2:
                mo147a = mo148b(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case 3:
                mo147a = new AppCompatEditText(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case 4:
                mo147a = new AppCompatSpinner(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case 5:
                mo147a = new AppCompatImageButton(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case 6:
                mo147a = mo149c(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case 7:
                mo147a = mo150d(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case '\b':
                mo147a = new AppCompatCheckedTextView(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case '\t':
                mo147a = mo151e(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case '\n':
                mo147a = new AppCompatMultiAutoCompleteTextView(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case 11:
                mo147a = new AppCompatRatingBar(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case '\f':
                mo147a = new AppCompatSeekBar(context2, attributeSet);
                m145a(mo147a, str);
                break;
            case '\r':
                mo147a = new AppCompatToggleButton(context2, attributeSet);
                m145a(mo147a, str);
                break;
            default:
                mo147a = null;
                break;
        }
        if (mo147a == null && context != context2) {
            mo147a = m143a(context2, str, attributeSet);
        }
        if (mo147a != null) {
            Context context3 = mo147a.getContext();
            if ((context3 instanceof ContextWrapper) && (Build.VERSION.SDK_INT < 15 || C0538w.m1823G(mo147a))) {
                TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, f191b);
                String string = obtainStyledAttributes2.getString(0);
                if (string != null) {
                    mo147a.setOnClickListener(new ViewOnClickListenerC0074ao(mo147a, string));
                }
                obtainStyledAttributes2.recycle();
            }
        }
        return mo147a;
    }

    /* renamed from: a */
    protected AppCompatTextView mo147a(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: b */
    protected AppCompatButton mo148b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: c */
    protected AppCompatCheckBox mo149c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: d */
    protected AppCompatRadioButton mo150d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* renamed from: e */
    protected AppCompatAutoCompleteTextView mo151e(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: a */
    private void m145a(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: a */
    private View m143a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f194e[0] = context;
            this.f194e[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m144a(context, str, (String) null);
            }
            for (int i = 0; i < f192c.length; i++) {
                View m144a = m144a(context, str, f192c[i]);
                if (m144a != null) {
                    return m144a;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        } finally {
            this.f194e[0] = null;
            this.f194e[1] = null;
        }
    }

    /* renamed from: a */
    private View m144a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends View> constructor = f193d.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f190a);
            f193d.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f194e);
    }
}
