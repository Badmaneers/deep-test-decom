package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: a */
    int f3291a;

    /* renamed from: b */
    int f3292b;

    /* renamed from: c */
    boolean f3293c;

    /* renamed from: d */
    SeekBar f3294d;

    /* renamed from: e */
    boolean f3295e;

    /* renamed from: f */
    boolean f3296f;

    /* renamed from: g */
    private int f3297g;

    /* renamed from: h */
    private int f3298h;

    /* renamed from: i */
    private TextView f3299i;

    /* renamed from: j */
    private boolean f3300j;

    /* renamed from: k */
    private SeekBar.OnSeekBarChangeListener f3301k;

    /* renamed from: l */
    private View.OnKeyListener f3302l;

    private SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3301k = new C0814t(this);
        this.f3302l = new ViewOnKeyListenerC0815u(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SeekBarPreference, i, 0);
        this.f3292b = obtainStyledAttributes.getInt(R.styleable.SeekBarPreference_min, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.SeekBarPreference_android_max, 100);
        i2 = i2 < this.f3292b ? this.f3292b : i2;
        if (i2 != this.f3297g) {
            this.f3297g = i2;
            mo2693b();
        }
        int i3 = obtainStyledAttributes.getInt(R.styleable.SeekBarPreference_seekBarIncrement, 0);
        if (i3 != this.f3298h) {
            this.f3298h = Math.min(this.f3297g - this.f3292b, Math.abs(i3));
            mo2693b();
        }
        this.f3295e = obtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_adjustable, true);
        this.f3300j = obtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_showSeekBarValue, false);
        this.f3296f = obtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_updatesContinuously, false);
        obtainStyledAttributes.recycle();
    }

    private SeekBarPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarPreferenceStyle, (byte) 0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: a */
    protected final Object mo2694a(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2724a(SeekBar seekBar) {
        int progress = this.f3292b + seekBar.getProgress();
        if (progress != this.f3291a) {
            Integer.valueOf(progress);
            if (!m2720o()) {
                seekBar.setProgress(this.f3291a - this.f3292b);
                m2725b(this.f3291a);
                return;
            }
            if (progress < this.f3292b) {
                progress = this.f3292b;
            }
            if (progress > this.f3297g) {
                progress = this.f3297g;
            }
            if (progress != this.f3291a) {
                this.f3291a = progress;
                m2725b(this.f3291a);
                m2710a(progress);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m2725b(int i) {
        if (this.f3299i != null) {
            this.f3299i.setText(String.valueOf(i));
        }
    }

    /* loaded from: classes.dex */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0816v();

        /* renamed from: a */
        int f3303a;

        /* renamed from: b */
        int f3304b;

        /* renamed from: c */
        int f3305c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3303a = parcel.readInt();
            this.f3304b = parcel.readInt();
            this.f3305c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3303a);
            parcel.writeInt(this.f3304b);
            parcel.writeInt(this.f3305c);
        }
    }
}
