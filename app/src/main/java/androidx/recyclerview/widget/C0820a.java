package androidx.recyclerview.widget;

import androidx.core.p023f.C0476g;
import androidx.core.p023f.InterfaceC0475f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdapterHelper.java */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public final class C0820a implements InterfaceC0833am {

    /* renamed from: a */
    final ArrayList<C0874c> f3441a;

    /* renamed from: b */
    final ArrayList<C0874c> f3442b;

    /* renamed from: c */
    final InterfaceC0847b f3443c;

    /* renamed from: d */
    Runnable f3444d;

    /* renamed from: e */
    final boolean f3445e;

    /* renamed from: f */
    final C0832al f3446f;

    /* renamed from: g */
    private InterfaceC0475f<C0874c> f3447g;

    /* renamed from: h */
    private int f3448h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0820a(InterfaceC0847b interfaceC0847b) {
        this(interfaceC0847b, (byte) 0);
    }

    private C0820a(InterfaceC0847b interfaceC0847b, byte b) {
        this.f3447g = new C0476g(30);
        this.f3441a = new ArrayList<>();
        this.f3442b = new ArrayList<>();
        this.f3448h = 0;
        this.f3443c = interfaceC0847b;
        this.f3445e = false;
        this.f3446f = new C0832al(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2923a() {
        m2916a(this.f3441a);
        m2916a(this.f3442b);
        this.f3448h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:141:0x021d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c6  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2927b() {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0820a.m2927b():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m2929c() {
        int size = this.f3442b.size();
        for (int i = 0; i < size; i++) {
            this.f3443c.mo3011b(this.f3442b.get(i));
        }
        m2916a(this.f3442b);
        this.f3448h = 0;
    }

    /* renamed from: b */
    private void m2917b(C0874c c0874c) {
        int i;
        if (c0874c.f3585a == 1 || c0874c.f3585a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m2918c = m2918c(c0874c.f3586b, c0874c.f3585a);
        int i2 = c0874c.f3586b;
        int i3 = c0874c.f3585a;
        if (i3 == 2) {
            i = 0;
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(c0874c)));
            }
            i = 1;
        }
        int i4 = m2918c;
        int i5 = i2;
        int i6 = 1;
        for (int i7 = 1; i7 < c0874c.f3588d; i7++) {
            int m2918c2 = m2918c(c0874c.f3586b + (i * i7), c0874c.f3585a);
            int i8 = c0874c.f3585a;
            if (i8 == 2 ? m2918c2 == i4 : i8 == 4 && m2918c2 == i4 + 1) {
                i6++;
            } else {
                C0874c mo2922a = mo2922a(c0874c.f3585a, i4, i6, c0874c.f3587c);
                m2915a(mo2922a, i5);
                mo2924a(mo2922a);
                if (c0874c.f3585a == 4) {
                    i5 += i6;
                }
                i6 = 1;
                i4 = m2918c2;
            }
        }
        Object obj = c0874c.f3587c;
        mo2924a(c0874c);
        if (i6 > 0) {
            C0874c mo2922a2 = mo2922a(c0874c.f3585a, i4, i6, obj);
            m2915a(mo2922a2, i5);
            mo2924a(mo2922a2);
        }
    }

    /* renamed from: a */
    private void m2915a(C0874c c0874c, int i) {
        this.f3443c.mo3009a(c0874c);
        int i2 = c0874c.f3585a;
        if (i2 == 2) {
            this.f3443c.mo3007a(i, c0874c.f3588d);
        } else {
            if (i2 == 4) {
                this.f3443c.mo3008a(i, c0874c.f3588d, c0874c.f3587c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: c */
    private int m2918c(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f3442b.size() - 1; size >= 0; size--) {
            C0874c c0874c = this.f3442b.get(size);
            if (c0874c.f3585a == 8) {
                if (c0874c.f3586b < c0874c.f3588d) {
                    i3 = c0874c.f3586b;
                    i4 = c0874c.f3588d;
                } else {
                    i3 = c0874c.f3588d;
                    i4 = c0874c.f3586b;
                }
                if (i >= i3 && i <= i4) {
                    if (i3 == c0874c.f3586b) {
                        if (i2 == 1) {
                            c0874c.f3588d++;
                        } else if (i2 == 2) {
                            c0874c.f3588d--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            c0874c.f3586b++;
                        } else if (i2 == 2) {
                            c0874c.f3586b--;
                        }
                        i--;
                    }
                } else if (i < c0874c.f3586b) {
                    if (i2 == 1) {
                        c0874c.f3586b++;
                        c0874c.f3588d++;
                    } else if (i2 == 2) {
                        c0874c.f3586b--;
                        c0874c.f3588d--;
                    }
                }
            } else if (c0874c.f3586b <= i) {
                if (c0874c.f3585a == 1) {
                    i -= c0874c.f3588d;
                } else if (c0874c.f3585a == 2) {
                    i += c0874c.f3588d;
                }
            } else if (i2 == 1) {
                c0874c.f3586b++;
            } else if (i2 == 2) {
                c0874c.f3586b--;
            }
        }
        for (int size2 = this.f3442b.size() - 1; size2 >= 0; size2--) {
            C0874c c0874c2 = this.f3442b.get(size2);
            if (c0874c2.f3585a == 8) {
                if (c0874c2.f3588d == c0874c2.f3586b || c0874c2.f3588d < 0) {
                    this.f3442b.remove(size2);
                    mo2924a(c0874c2);
                }
            } else if (c0874c2.f3588d <= 0) {
                this.f3442b.remove(size2);
                mo2924a(c0874c2);
            }
        }
        return i;
    }

    /* renamed from: c */
    private boolean m2920c(int i) {
        int size = this.f3442b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0874c c0874c = this.f3442b.get(i2);
            if (c0874c.f3585a == 8) {
                if (m2921a(c0874c.f3588d, i2 + 1) == i) {
                    return true;
                }
            } else if (c0874c.f3585a == 1) {
                int i3 = c0874c.f3586b + c0874c.f3588d;
                for (int i4 = c0874c.f3586b; i4 < i3; i4++) {
                    if (m2921a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m2919c(C0874c c0874c) {
        this.f3442b.add(c0874c);
        int i = c0874c.f3585a;
        if (i == 4) {
            this.f3443c.mo3008a(c0874c.f3586b, c0874c.f3588d, c0874c.f3587c);
            return;
        }
        if (i != 8) {
            switch (i) {
                case 1:
                    this.f3443c.mo3012c(c0874c.f3586b, c0874c.f3588d);
                    return;
                case 2:
                    this.f3443c.mo3010b(c0874c.f3586b, c0874c.f3588d);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(c0874c)));
            }
        }
        this.f3443c.mo3013d(c0874c.f3586b, c0874c.f3588d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m2930d() {
        return this.f3441a.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m2925a(int i) {
        return (this.f3448h & i) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m2926b(int i) {
        return m2921a(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m2921a(int i, int i2) {
        int size = this.f3442b.size();
        while (i2 < size) {
            C0874c c0874c = this.f3442b.get(i2);
            if (c0874c.f3585a == 8) {
                if (c0874c.f3586b == i) {
                    i = c0874c.f3588d;
                } else {
                    if (c0874c.f3586b < i) {
                        i--;
                    }
                    if (c0874c.f3588d <= i) {
                        i++;
                    }
                }
            } else if (c0874c.f3586b > i) {
                continue;
            } else if (c0874c.f3585a == 2) {
                if (i < c0874c.f3586b + c0874c.f3588d) {
                    return -1;
                }
                i -= c0874c.f3588d;
            } else if (c0874c.f3585a == 1) {
                i += c0874c.f3588d;
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m2928b(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.f3441a.add(mo2922a(4, i, i2, null));
        this.f3448h |= 4;
        return this.f3441a.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001e. Please report as an issue. */
    /* renamed from: e */
    public final void m2931e() {
        m2929c();
        int size = this.f3441a.size();
        for (int i = 0; i < size; i++) {
            C0874c c0874c = this.f3441a.get(i);
            int i2 = c0874c.f3585a;
            if (i2 == 4) {
                this.f3443c.mo3011b(c0874c);
                this.f3443c.mo3008a(c0874c.f3586b, c0874c.f3588d, c0874c.f3587c);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        this.f3443c.mo3011b(c0874c);
                        this.f3443c.mo3012c(c0874c.f3586b, c0874c.f3588d);
                        break;
                    case 2:
                        this.f3443c.mo3011b(c0874c);
                        this.f3443c.mo3007a(c0874c.f3586b, c0874c.f3588d);
                        break;
                }
            } else {
                this.f3443c.mo3011b(c0874c);
                this.f3443c.mo3013d(c0874c.f3586b, c0874c.f3588d);
            }
            if (this.f3444d != null) {
                this.f3444d.run();
            }
        }
        m2916a(this.f3441a);
        this.f3448h = 0;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0833am
    /* renamed from: a */
    public final C0874c mo2922a(int i, int i2, int i3, Object obj) {
        C0874c mo1617a = this.f3447g.mo1617a();
        if (mo1617a == null) {
            return new C0874c(i, i2, i3, obj);
        }
        mo1617a.f3585a = i;
        mo1617a.f3586b = i2;
        mo1617a.f3588d = i3;
        mo1617a.f3587c = obj;
        return mo1617a;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0833am
    /* renamed from: a */
    public final void mo2924a(C0874c c0874c) {
        if (this.f3445e) {
            return;
        }
        c0874c.f3587c = null;
        this.f3447g.mo1618a(c0874c);
    }

    /* renamed from: a */
    private void m2916a(List<C0874c> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo2924a(list.get(i));
        }
        list.clear();
    }
}
