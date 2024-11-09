package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimateLayoutChangeDetector.java */
/* renamed from: androidx.viewpager2.widget.a */
/* loaded from: classes.dex */
public final class C1118a {

    /* renamed from: a */
    private static final ViewGroup.MarginLayoutParams f4526a;

    /* renamed from: b */
    private LinearLayoutManager f4527b;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f4526a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1118a(LinearLayoutManager linearLayoutManager) {
        this.f4527b = linearLayoutManager;
    }

    /* renamed from: b */
    private boolean m3724b() {
        int v = this.f4527b.m3121v();
        for (int i = 0; i < v; i++) {
            if (m3723a(this.f4527b.m3111f(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3723a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m3723a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:            r0 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:            if (r4[r0 - 1][1] >= r3) goto L38;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3725a() {
        /*
            r11 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r11.f4527b
            int r0 = r0.m3121v()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La2
            androidx.recyclerview.widget.LinearLayoutManager r3 = r11.f4527b
            int r3 = r3.m2844i()
            if (r3 != 0) goto L14
            r3 = r2
            goto L15
        L14:
            r3 = r1
        L15:
            r4 = 2
            int[] r4 = new int[]{r0, r4}
            java.lang.Class<int> r5 = int.class
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r5, r4)
            int[][] r4 = (int[][]) r4
            r5 = r1
        L23:
            if (r5 >= r0) goto L6f
            androidx.recyclerview.widget.LinearLayoutManager r6 = r11.f4527b
            android.view.View r6 = r6.m3111f(r5)
            if (r6 == 0) goto L67
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            boolean r8 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L38
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L3a
        L38:
            android.view.ViewGroup$MarginLayoutParams r7 = androidx.viewpager2.widget.C1118a.f4526a
        L3a:
            r8 = r4[r5]
            if (r3 == 0) goto L46
            int r9 = r6.getLeft()
            int r10 = r7.leftMargin
            int r9 = r9 - r10
            goto L4d
        L46:
            int r9 = r6.getTop()
            int r10 = r7.topMargin
            int r9 = r9 - r10
        L4d:
            r8[r1] = r9
            r8 = r4[r5]
            if (r3 == 0) goto L5b
            int r6 = r6.getRight()
            int r7 = r7.rightMargin
            int r6 = r6 + r7
            goto L62
        L5b:
            int r6 = r6.getBottom()
            int r7 = r7.bottomMargin
            int r6 = r6 + r7
        L62:
            r8[r2] = r6
            int r5 = r5 + 1
            goto L23
        L67:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "null view contained in the view hierarchy"
            r11.<init>(r0)
            throw r11
        L6f:
            androidx.viewpager2.widget.b r3 = new androidx.viewpager2.widget.b
            r3.<init>(r11)
            java.util.Arrays.sort(r4, r3)
            r3 = r2
        L78:
            if (r3 >= r0) goto L8b
            int r5 = r3 + (-1)
            r5 = r4[r5]
            r5 = r5[r2]
            r6 = r4[r3]
            r6 = r6[r1]
            if (r5 == r6) goto L88
        L86:
            r0 = r1
            goto La3
        L88:
            int r3 = r3 + 1
            goto L78
        L8b:
            r3 = r4[r1]
            r3 = r3[r2]
            r5 = r4[r1]
            r5 = r5[r1]
            int r3 = r3 - r5
            r5 = r4[r1]
            r5 = r5[r1]
            if (r5 > 0) goto L86
            int r0 = r0 - r2
            r0 = r4[r0]
            r0 = r0[r2]
            if (r0 >= r3) goto La2
            goto L86
        La2:
            r0 = r2
        La3:
            if (r0 == 0) goto Lad
            androidx.recyclerview.widget.LinearLayoutManager r0 = r11.f4527b
            int r0 = r0.m3121v()
            if (r0 > r2) goto Lb4
        Lad:
            boolean r11 = r11.m3724b()
            if (r11 == 0) goto Lb4
            return r2
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1118a.m3725a():boolean");
    }
}
