package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.p024g.C0538w;

/* compiled from: FastScroller.java */
/* renamed from: androidx.recyclerview.widget.s */
/* loaded from: classes.dex */
final class C0914s extends AbstractC0855bh implements InterfaceC0864bq {

    /* renamed from: k */
    private static final int[] f3734k = {R.attr.state_pressed};

    /* renamed from: l */
    private static final int[] f3735l = new int[0];

    /* renamed from: a */
    final StateListDrawable f3741a;

    /* renamed from: b */
    final Drawable f3742b;

    /* renamed from: c */
    int f3743c;

    /* renamed from: d */
    int f3744d;

    /* renamed from: e */
    float f3745e;

    /* renamed from: f */
    int f3746f;

    /* renamed from: g */
    int f3747g;

    /* renamed from: h */
    float f3748h;

    /* renamed from: m */
    private final int f3751m;

    /* renamed from: n */
    private final int f3752n;

    /* renamed from: o */
    private final int f3753o;

    /* renamed from: p */
    private final int f3754p;

    /* renamed from: q */
    private final StateListDrawable f3755q;

    /* renamed from: r */
    private final Drawable f3756r;

    /* renamed from: s */
    private final int f3757s;

    /* renamed from: t */
    private final int f3758t;

    /* renamed from: w */
    private RecyclerView f3761w;

    /* renamed from: u */
    private int f3759u = 0;

    /* renamed from: v */
    private int f3760v = 0;

    /* renamed from: x */
    private boolean f3762x = false;

    /* renamed from: y */
    private boolean f3763y = false;

    /* renamed from: z */
    private int f3764z = 0;

    /* renamed from: A */
    private int f3736A = 0;

    /* renamed from: B */
    private final int[] f3737B = new int[2];

    /* renamed from: C */
    private final int[] f3738C = new int[2];

    /* renamed from: i */
    final ValueAnimator f3749i = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* renamed from: j */
    int f3750j = 0;

    /* renamed from: D */
    private final Runnable f3739D = new RunnableC0915t(this);

    /* renamed from: E */
    private final AbstractC0865br f3740E = new C0916u(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0914s(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f3741a = stateListDrawable;
        this.f3742b = drawable;
        this.f3755q = stateListDrawable2;
        this.f3756r = drawable2;
        this.f3753o = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3754p = Math.max(i, drawable.getIntrinsicWidth());
        this.f3757s = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3758t = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3751m = i2;
        this.f3752n = i3;
        this.f3741a.setAlpha(255);
        this.f3742b.setAlpha(255);
        this.f3749i.addListener(new C0917v(this));
        this.f3749i.addUpdateListener(new C0918w(this));
        if (this.f3761w != recyclerView) {
            if (this.f3761w != null) {
                this.f3761w.removeItemDecoration(this);
                this.f3761w.removeOnItemTouchListener(this);
                this.f3761w.removeOnScrollListener(this.f3740E);
                m3323d();
            }
            this.f3761w = recyclerView;
            if (this.f3761w != null) {
                this.f3761w.addItemDecoration(this);
                this.f3761w.addOnItemTouchListener(this);
                this.f3761w.addOnScrollListener(this.f3740E);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3324a() {
        this.f3761w.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3325a(int i) {
        if (i == 2 && this.f3764z != 2) {
            this.f3741a.setState(f3734k);
            m3323d();
        }
        if (i != 0) {
            m3322c();
        } else {
            this.f3761w.invalidate();
        }
        if (this.f3764z == 2 && i != 2) {
            this.f3741a.setState(f3735l);
            m3319b(1200);
        } else if (i == 1) {
            m3319b(1500);
        }
        this.f3764z = i;
    }

    /* renamed from: b */
    private boolean m3320b() {
        return C0538w.m1878h(this.f3761w) == 1;
    }

    /* renamed from: c */
    private void m3322c() {
        int i = this.f3750j;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f3749i.cancel();
            }
        }
        this.f3750j = 1;
        this.f3749i.setFloatValues(((Float) this.f3749i.getAnimatedValue()).floatValue(), 1.0f);
        this.f3749i.setDuration(500L);
        this.f3749i.setStartDelay(0L);
        this.f3749i.start();
    }

    /* renamed from: d */
    private void m3323d() {
        this.f3761w.removeCallbacks(this.f3739D);
    }

    /* renamed from: b */
    private void m3319b(int i) {
        m3323d();
        this.f3761w.postDelayed(this.f3739D, i);
    }

    @Override // androidx.recyclerview.widget.AbstractC0855bh
    /* renamed from: a */
    public final void mo3058a(Canvas canvas) {
        if (this.f3759u != this.f3761w.getWidth() || this.f3760v != this.f3761w.getHeight()) {
            this.f3759u = this.f3761w.getWidth();
            this.f3760v = this.f3761w.getHeight();
            m3325a(0);
            return;
        }
        if (this.f3750j != 0) {
            if (this.f3762x) {
                int i = this.f3759u - this.f3753o;
                int i2 = this.f3744d - (this.f3743c / 2);
                this.f3741a.setBounds(0, 0, this.f3753o, this.f3743c);
                this.f3742b.setBounds(0, 0, this.f3754p, this.f3760v);
                if (m3320b()) {
                    this.f3742b.draw(canvas);
                    canvas.translate(this.f3753o, i2);
                    canvas.scale(-1.0f, 1.0f);
                    this.f3741a.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-this.f3753o, -i2);
                } else {
                    canvas.translate(i, 0.0f);
                    this.f3742b.draw(canvas);
                    canvas.translate(0.0f, i2);
                    this.f3741a.draw(canvas);
                    canvas.translate(-i, -i2);
                }
            }
            if (this.f3763y) {
                int i3 = this.f3760v - this.f3757s;
                int i4 = this.f3747g - (this.f3746f / 2);
                this.f3755q.setBounds(0, 0, this.f3746f, this.f3757s);
                this.f3756r.setBounds(0, 0, this.f3759u, this.f3758t);
                canvas.translate(0.0f, i3);
                this.f3756r.draw(canvas);
                canvas.translate(i4, 0.0f);
                this.f3755q.draw(canvas);
                canvas.translate(-i4, -i3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3326a(int i, int i2) {
        int computeVerticalScrollRange = this.f3761w.computeVerticalScrollRange();
        int i3 = this.f3760v;
        this.f3762x = computeVerticalScrollRange - i3 > 0 && this.f3760v >= this.f3751m;
        int computeHorizontalScrollRange = this.f3761w.computeHorizontalScrollRange();
        int i4 = this.f3759u;
        this.f3763y = computeHorizontalScrollRange - i4 > 0 && this.f3759u >= this.f3751m;
        if (!this.f3762x && !this.f3763y) {
            if (this.f3764z != 0) {
                m3325a(0);
                return;
            }
            return;
        }
        if (this.f3762x) {
            float f = i3;
            this.f3744d = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.f3743c = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.f3763y) {
            float f2 = i4;
            this.f3747g = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.f3746f = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        if (this.f3764z == 0 || this.f3764z == 1) {
            m3325a(1);
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC0864bq
    /* renamed from: a */
    public final boolean mo3134a(MotionEvent motionEvent) {
        if (this.f3764z == 1) {
            boolean m3318a = m3318a(motionEvent.getX(), motionEvent.getY());
            boolean m3321b = m3321b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m3318a && !m3321b) {
                return false;
            }
            if (m3321b) {
                this.f3736A = 1;
                this.f3748h = (int) motionEvent.getX();
            } else if (m3318a) {
                this.f3736A = 2;
                this.f3745e = (int) motionEvent.getY();
            }
            m3325a(2);
        } else if (this.f3764z != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0864bq
    /* renamed from: b */
    public final void mo3135b(MotionEvent motionEvent) {
        if (this.f3764z == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m3318a = m3318a(motionEvent.getX(), motionEvent.getY());
            boolean m3321b = m3321b(motionEvent.getX(), motionEvent.getY());
            if (m3318a || m3321b) {
                if (m3321b) {
                    this.f3736A = 1;
                    this.f3748h = (int) motionEvent.getX();
                } else if (m3318a) {
                    this.f3736A = 2;
                    this.f3745e = (int) motionEvent.getY();
                }
                m3325a(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3764z == 2) {
            this.f3745e = 0.0f;
            this.f3748h = 0.0f;
            m3325a(1);
            this.f3736A = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3764z == 2) {
            m3322c();
            if (this.f3736A == 1) {
                float x = motionEvent.getX();
                this.f3738C[0] = this.f3752n;
                this.f3738C[1] = this.f3759u - this.f3752n;
                int[] iArr = this.f3738C;
                float max = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.f3747g - max) >= 2.0f) {
                    int m3317a = m3317a(this.f3748h, max, iArr, this.f3761w.computeHorizontalScrollRange(), this.f3761w.computeHorizontalScrollOffset(), this.f3759u);
                    if (m3317a != 0) {
                        this.f3761w.scrollBy(m3317a, 0);
                    }
                    this.f3748h = max;
                }
            }
            if (this.f3736A == 2) {
                float y = motionEvent.getY();
                this.f3737B[0] = this.f3752n;
                this.f3737B[1] = this.f3760v - this.f3752n;
                int[] iArr2 = this.f3737B;
                float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.f3744d - max2) >= 2.0f) {
                    int m3317a2 = m3317a(this.f3745e, max2, iArr2, this.f3761w.computeVerticalScrollRange(), this.f3761w.computeVerticalScrollOffset(), this.f3760v);
                    if (m3317a2 != 0) {
                        this.f3761w.scrollBy(0, m3317a2);
                    }
                    this.f3745e = max2;
                }
            }
        }
    }

    /* renamed from: a */
    private static int m3317a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: a */
    private boolean m3318a(float f, float f2) {
        if (m3320b()) {
            if (f > this.f3753o / 2) {
                return false;
            }
        } else if (f < this.f3759u - this.f3753o) {
            return false;
        }
        return f2 >= ((float) (this.f3744d - (this.f3743c / 2))) && f2 <= ((float) (this.f3744d + (this.f3743c / 2)));
    }

    /* renamed from: b */
    private boolean m3321b(float f, float f2) {
        return f2 >= ((float) (this.f3760v - this.f3757s)) && f >= ((float) (this.f3747g - (this.f3746f / 2))) && f <= ((float) (this.f3747g + (this.f3746f / 2)));
    }
}
