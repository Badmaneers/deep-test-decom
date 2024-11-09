package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0865br;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollEventAdapter.java */
/* renamed from: androidx.viewpager2.widget.f */
/* loaded from: classes.dex */
public final class C1123f extends AbstractC0865br {

    /* renamed from: a */
    private AbstractC1133p f4535a;

    /* renamed from: b */
    private final ViewPager2 f4536b;

    /* renamed from: c */
    private final RecyclerView f4537c;

    /* renamed from: d */
    private final LinearLayoutManager f4538d;

    /* renamed from: e */
    private int f4539e;

    /* renamed from: f */
    private int f4540f;

    /* renamed from: g */
    private C1124g f4541g = new C1124g();

    /* renamed from: h */
    private int f4542h;

    /* renamed from: i */
    private int f4543i;

    /* renamed from: j */
    private boolean f4544j;

    /* renamed from: k */
    private boolean f4545k;

    /* renamed from: l */
    private boolean f4546l;

    /* renamed from: m */
    private boolean f4547m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1123f(ViewPager2 viewPager2) {
        this.f4536b = viewPager2;
        this.f4537c = this.f4536b.f4505d;
        this.f4538d = (LinearLayoutManager) this.f4537c.getLayoutManager();
        m3737f();
    }

    /* renamed from: f */
    private void m3737f() {
        this.f4539e = 0;
        this.f4540f = 0;
        this.f4541g.m3747a();
        this.f4542h = -1;
        this.f4543i = -1;
        this.f4544j = false;
        this.f4545k = false;
        this.f4547m = false;
        this.f4546l = false;
    }

    @Override // androidx.recyclerview.widget.AbstractC0865br
    /* renamed from: a */
    public final void mo3136a(RecyclerView recyclerView, int i) {
        boolean z = true;
        if ((this.f4539e == 1 && this.f4540f == 1) || i != 1) {
            if (m3739h() && i == 2) {
                if (this.f4545k) {
                    m3735b(2);
                    this.f4544j = true;
                    return;
                }
                return;
            }
            if (m3739h() && i == 0) {
                m3738g();
                if (!this.f4545k) {
                    if (this.f4541g.f4548a != -1) {
                        m3734a(this.f4541g.f4548a, 0.0f, 0);
                    }
                } else if (this.f4541g.f4550c != 0) {
                    z = false;
                } else if (this.f4542h != this.f4541g.f4548a) {
                    m3736c(this.f4541g.f4548a);
                }
                if (z) {
                    m3735b(0);
                    m3737f();
                }
            }
            if (this.f4539e == 2 && i == 0 && this.f4546l) {
                m3738g();
                if (this.f4541g.f4550c == 0) {
                    if (this.f4543i != this.f4541g.f4548a) {
                        m3736c(this.f4541g.f4548a == -1 ? 0 : this.f4541g.f4548a);
                    }
                    m3735b(0);
                    m3737f();
                    return;
                }
                return;
            }
            return;
        }
        this.f4547m = false;
        this.f4539e = 1;
        if (this.f4543i != -1) {
            this.f4542h = this.f4543i;
            this.f4543i = -1;
        } else if (this.f4542h == -1) {
            this.f4542h = this.f4538d.m2849n();
        }
        m3735b(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:            if ((r5 < 0) == r3.f4536b.m3719b()) goto L14;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // androidx.recyclerview.widget.AbstractC0865br
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3137a(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f4545k = r4
            r3.m3738g()
            boolean r0 = r3.f4544j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L43
            r3.f4544j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f4536b
            boolean r6 = r6.m3719b()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = r2
            goto L23
        L22:
            r5 = r4
        L23:
            if (r5 == 0) goto L31
            androidx.viewpager2.widget.g r5 = r3.f4541g
            int r5 = r5.f4550c
            if (r5 == 0) goto L31
            androidx.viewpager2.widget.g r5 = r3.f4541g
            int r5 = r5.f4548a
            int r5 = r5 + r4
            goto L35
        L31:
            androidx.viewpager2.widget.g r5 = r3.f4541g
            int r5 = r5.f4548a
        L35:
            r3.f4543i = r5
            int r5 = r3.f4542h
            int r6 = r3.f4543i
            if (r5 == r6) goto L51
            int r5 = r3.f4543i
            r3.m3736c(r5)
            goto L51
        L43:
            int r5 = r3.f4539e
            if (r5 != 0) goto L51
            androidx.viewpager2.widget.g r5 = r3.f4541g
            int r5 = r5.f4548a
            if (r5 != r1) goto L4e
            r5 = r2
        L4e:
            r3.m3736c(r5)
        L51:
            androidx.viewpager2.widget.g r5 = r3.f4541g
            int r5 = r5.f4548a
            if (r5 != r1) goto L59
            r5 = r2
            goto L5d
        L59:
            androidx.viewpager2.widget.g r5 = r3.f4541g
            int r5 = r5.f4548a
        L5d:
            androidx.viewpager2.widget.g r6 = r3.f4541g
            float r6 = r6.f4549b
            androidx.viewpager2.widget.g r0 = r3.f4541g
            int r0 = r0.f4550c
            r3.m3734a(r5, r6, r0)
            androidx.viewpager2.widget.g r5 = r3.f4541g
            int r5 = r5.f4548a
            int r6 = r3.f4543i
            if (r5 == r6) goto L74
            int r5 = r3.f4543i
            if (r5 != r1) goto L84
        L74:
            androidx.viewpager2.widget.g r5 = r3.f4541g
            int r5 = r5.f4550c
            if (r5 != 0) goto L84
            int r5 = r3.f4540f
            if (r5 == r4) goto L84
            r3.m3735b(r2)
            r3.m3737f()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1123f.mo3137a(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: g */
    private void m3738g() {
        int top;
        C1124g c1124g = this.f4541g;
        c1124g.f4548a = this.f4538d.m2849n();
        if (c1124g.f4548a == -1) {
            c1124g.m3747a();
            return;
        }
        View mo2832b = this.f4538d.mo2832b(c1124g.f4548a);
        if (mo2832b == null) {
            c1124g.m3747a();
            return;
        }
        int o = LinearLayoutManager.m3079o(mo2832b);
        int p = LinearLayoutManager.m3080p(mo2832b);
        int m = LinearLayoutManager.m3077m(mo2832b);
        int n = LinearLayoutManager.m3078n(mo2832b);
        ViewGroup.LayoutParams layoutParams = mo2832b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            o += marginLayoutParams.leftMargin;
            p += marginLayoutParams.rightMargin;
            m += marginLayoutParams.topMargin;
            n += marginLayoutParams.bottomMargin;
        }
        int height = mo2832b.getHeight() + m + n;
        int width = p + mo2832b.getWidth() + o;
        if (this.f4538d.m2844i() == 0) {
            top = (mo2832b.getLeft() - o) - this.f4537c.getPaddingLeft();
            if (this.f4536b.m3719b()) {
                top = -top;
            }
        } else {
            top = (mo2832b.getTop() - m) - this.f4537c.getPaddingTop();
            width = height;
        }
        c1124g.f4550c = -top;
        if (c1124g.f4550c < 0) {
            if (new C1118a(this.f4538d).m3725a()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(c1124g.f4550c)));
        }
        c1124g.f4549b = width == 0 ? 0.0f : c1124g.f4550c / width;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3740a() {
        this.f4546l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3741a(int i) {
        this.f4539e = 2;
        this.f4547m = false;
        boolean z = this.f4543i != i;
        this.f4543i = i;
        m3735b(2);
        if (z) {
            m3736c(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3742a(AbstractC1133p abstractC1133p) {
        this.f4535a = abstractC1133p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m3743b() {
        return this.f4540f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m3744c() {
        return this.f4540f == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m3745d() {
        return this.f4547m;
    }

    /* renamed from: h */
    private boolean m3739h() {
        return this.f4539e == 1 || this.f4539e == 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final double m3746e() {
        m3738g();
        return this.f4541g.f4548a + this.f4541g.f4549b;
    }

    /* renamed from: b */
    private void m3735b(int i) {
        if ((this.f4539e == 3 && this.f4540f == 0) || this.f4540f == i) {
            return;
        }
        this.f4540f = i;
        if (this.f4535a != null) {
            this.f4535a.mo3730b(i);
        }
    }

    /* renamed from: c */
    private void m3736c(int i) {
        if (this.f4535a != null) {
            this.f4535a.mo3727a(i);
        }
    }

    /* renamed from: a */
    private void m3734a(int i, float f, int i2) {
        if (this.f4535a != null) {
            this.f4535a.mo3728a(i, f, i2);
        }
    }
}
