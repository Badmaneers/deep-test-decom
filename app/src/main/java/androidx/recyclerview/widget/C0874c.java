package androidx.recyclerview.widget;

/* compiled from: AdapterHelper.java */
/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
final class C0874c {

    /* renamed from: a */
    int f3585a;

    /* renamed from: b */
    int f3586b;

    /* renamed from: c */
    Object f3587c;

    /* renamed from: d */
    int f3588d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0874c(int i, int i2, int i3, Object obj) {
        this.f3585a = i;
        this.f3586b = i2;
        this.f3588d = i3;
        this.f3587c = obj;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f3585a;
        if (i == 4) {
            str = "up";
        } else if (i != 8) {
            switch (i) {
                case 1:
                    str = "add";
                    break;
                case 2:
                    str = "rm";
                    break;
                default:
                    str = "??";
                    break;
            }
        } else {
            str = "mv";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f3586b);
        sb.append("c:");
        sb.append(this.f3588d);
        sb.append(",p:");
        sb.append(this.f3587c);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0874c c0874c = (C0874c) obj;
        if (this.f3585a != c0874c.f3585a) {
            return false;
        }
        if (this.f3585a == 8 && Math.abs(this.f3588d - this.f3586b) == 1 && this.f3588d == c0874c.f3586b && this.f3586b == c0874c.f3588d) {
            return true;
        }
        if (this.f3588d != c0874c.f3588d || this.f3586b != c0874c.f3586b) {
            return false;
        }
        if (this.f3587c != null) {
            if (!this.f3587c.equals(c0874c.f3587c)) {
                return false;
            }
        } else if (c0874c.f3587c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f3585a * 31) + this.f3586b) * 31) + this.f3588d;
    }
}
