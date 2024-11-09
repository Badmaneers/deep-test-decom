package color.support.p043v7.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorActionMenuViewV6.java */
/* renamed from: color.support.v7.widget.b */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1264b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f5360a;

    /* renamed from: b */
    final /* synthetic */ ColorActionMenuViewV6 f5361b;

    public ViewOnClickListenerC1264b(ColorActionMenuViewV6 colorActionMenuViewV6, View view) {
        this.f5361b = colorActionMenuViewV6;
        this.f5360a = view;
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x0050 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            color.support.v7.widget.ColorActionMenuViewV6 r6 = r5.f5361b
            com.color.support.widget.popupwindow.a r6 = r6.f5293c
            if (r6 != 0) goto L30
            color.support.v7.widget.ColorActionMenuViewV6 r6 = r5.f5361b
            com.color.support.widget.popupwindow.a r0 = new com.color.support.widget.popupwindow.a
            color.support.v7.widget.ColorActionMenuViewV6 r1 = r5.f5361b
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r6.f5293c = r0
            color.support.v7.widget.ColorActionMenuViewV6 r6 = r5.f5361b
            com.color.support.widget.popupwindow.a r6 = r6.f5293c
            r0 = 1
            r6.setTouchable(r0)
            r6.setFocusable(r0)
            r6.setOutsideTouchable(r0)
            r6.update()
            color.support.v7.widget.ColorActionMenuViewV6 r6 = r5.f5361b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            color.support.p043v7.widget.ColorActionMenuViewV6.m4113a(r6, r0)
        L30:
            color.support.v7.widget.ColorActionMenuViewV6 r6 = r5.f5361b
            java.util.ArrayList r6 = color.support.p043v7.widget.ColorActionMenuViewV6.m4112a(r6)
            r6.clear()
            color.support.v7.widget.ColorActionMenuViewV6 r6 = r5.f5361b
            androidx.appcompat.view.menu.o r6 = color.support.p043v7.widget.ColorActionMenuViewV6.m4114b(r6)
            if (r6 == 0) goto L105
            r6 = 0
        L42:
            color.support.v7.widget.ColorActionMenuViewV6 r0 = r5.f5361b
            androidx.appcompat.view.menu.o r0 = color.support.p043v7.widget.ColorActionMenuViewV6.m4114b(r0)
            java.util.ArrayList r0 = r0.m471o()
            int r0 = r0.size()
            if (r6 >= r0) goto Lec
            color.support.v7.widget.ColorActionMenuViewV6 r0 = r5.f5361b
            color.support.v7.widget.ColorActionMenuViewV6 r1 = r5.f5361b
            androidx.appcompat.view.menu.o r1 = color.support.p043v7.widget.ColorActionMenuViewV6.m4114b(r1)
            java.util.ArrayList r1 = r1.m471o()
            java.lang.Object r1 = r1.get(r6)
            androidx.appcompat.view.menu.s r1 = (androidx.appcompat.view.menu.C0172s) r1
            color.support.p043v7.widget.ColorActionMenuViewV6.m4111a(r0, r1)
            color.support.v7.widget.ColorActionMenuViewV6 r0 = r5.f5361b
            androidx.appcompat.view.menu.s r0 = color.support.p043v7.widget.ColorActionMenuViewV6.m4115c(r0)
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            if (r0 == 0) goto Lb3
            color.support.v7.widget.ColorActionMenuViewV6 r0 = r5.f5361b
            java.util.ArrayList r0 = color.support.p043v7.widget.ColorActionMenuViewV6.m4112a(r0)
            com.color.support.widget.popupwindow.e r1 = new com.color.support.widget.popupwindow.e
            color.support.v7.widget.ColorActionMenuViewV6 r2 = r5.f5361b
            androidx.appcompat.view.menu.s r2 = color.support.p043v7.widget.ColorActionMenuViewV6.m4115c(r2)
            android.graphics.drawable.Drawable r2 = r2.getIcon()
            color.support.v7.widget.ColorActionMenuViewV6 r3 = r5.f5361b
            androidx.appcompat.view.menu.s r3 = color.support.p043v7.widget.ColorActionMenuViewV6.m4115c(r3)
            java.lang.CharSequence r3 = r3.getTitle()
            if (r3 == 0) goto La0
            color.support.v7.widget.ColorActionMenuViewV6 r3 = r5.f5361b
            androidx.appcompat.view.menu.s r3 = color.support.p043v7.widget.ColorActionMenuViewV6.m4115c(r3)
            java.lang.CharSequence r3 = r3.getTitle()
            java.lang.String r3 = r3.toString()
            goto La2
        La0:
            java.lang.String r3 = ""
        La2:
            color.support.v7.widget.ColorActionMenuViewV6 r4 = r5.f5361b
            androidx.appcompat.view.menu.s r4 = color.support.p043v7.widget.ColorActionMenuViewV6.m4115c(r4)
            boolean r4 = r4.isEnabled()
            r1.<init>(r2, r3, r4)
            r0.add(r6, r1)
            goto Le8
        Lb3:
            color.support.v7.widget.ColorActionMenuViewV6 r0 = r5.f5361b
            java.util.ArrayList r0 = color.support.p043v7.widget.ColorActionMenuViewV6.m4112a(r0)
            com.color.support.widget.popupwindow.e r1 = new com.color.support.widget.popupwindow.e
            color.support.v7.widget.ColorActionMenuViewV6 r2 = r5.f5361b
            androidx.appcompat.view.menu.s r2 = color.support.p043v7.widget.ColorActionMenuViewV6.m4115c(r2)
            java.lang.CharSequence r2 = r2.getTitle()
            if (r2 == 0) goto Ld6
            color.support.v7.widget.ColorActionMenuViewV6 r2 = r5.f5361b
            androidx.appcompat.view.menu.s r2 = color.support.p043v7.widget.ColorActionMenuViewV6.m4115c(r2)
            java.lang.CharSequence r2 = r2.getTitle()
            java.lang.String r2 = r2.toString()
            goto Ld8
        Ld6:
            java.lang.String r2 = ""
        Ld8:
            color.support.v7.widget.ColorActionMenuViewV6 r3 = r5.f5361b
            androidx.appcompat.view.menu.s r3 = color.support.p043v7.widget.ColorActionMenuViewV6.m4115c(r3)
            boolean r3 = r3.isEnabled()
            r1.<init>(r2, r3)
            r0.add(r6, r1)
        Le8:
            int r6 = r6 + 1
            goto L42
        Lec:
            color.support.v7.widget.ColorActionMenuViewV6 r6 = r5.f5361b
            com.color.support.widget.popupwindow.a r6 = r6.f5293c
            color.support.v7.widget.ColorActionMenuViewV6 r0 = r5.f5361b
            java.util.ArrayList r0 = color.support.p043v7.widget.ColorActionMenuViewV6.m4112a(r0)
            r6.m5330a(r0)
            color.support.v7.widget.ColorActionMenuViewV6 r6 = r5.f5361b
            com.color.support.widget.popupwindow.a r6 = r6.f5293c
            color.support.v7.widget.c r0 = new color.support.v7.widget.c
            r0.<init>(r5)
            r6.m5329a(r0)
        L105:
            color.support.v7.widget.ColorActionMenuViewV6 r6 = r5.f5361b
            com.color.support.widget.popupwindow.a r6 = r6.f5293c
            android.view.View r5 = r5.f5360a
            r6.m5328a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: color.support.p043v7.widget.ViewOnClickListenerC1264b.onClick(android.view.View):void");
    }
}
