package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.R;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.graphics.C0542a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDrawableManager.java */
/* renamed from: androidx.appcompat.widget.al */
/* loaded from: classes.dex */
public final class C0193al implements InterfaceC0243ch {

    /* renamed from: a */
    private final int[] f1120a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b */
    private final int[] f1121b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c */
    private final int[] f1122c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};

    /* renamed from: d */
    private final int[] f1123d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e */
    private final int[] f1124e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f */
    private final int[] f1125f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    /* renamed from: b */
    private static ColorStateList m717b(Context context, int i) {
        int m937a = C0272dj.m937a(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{C0272dj.f1347a, C0272dj.f1350d, C0272dj.f1348b, C0272dj.f1354h}, new int[]{C0272dj.m939c(context, R.attr.colorButtonNormal), C0542a.m1900a(m937a, i), C0542a.m1900a(m937a, i), i});
    }

    @Override // androidx.appcompat.widget.InterfaceC0243ch
    /* renamed from: a */
    public final Drawable mo720a(C0238cc c0238cc, Context context, int i) {
        if (i == R.drawable.abc_cab_background_top_material) {
            return new LayerDrawable(new Drawable[]{c0238cc.m891a(context, R.drawable.abc_cab_background_internal_bg), c0238cc.m891a(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        return null;
    }

    /* renamed from: a */
    private static void m715a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0218bj.m849c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0192ak.f1117a;
        }
        drawable.setColorFilter(C0192ak.m706a(i, mode));
    }

    @Override // androidx.appcompat.widget.InterfaceC0243ch
    /* renamed from: a */
    public final boolean mo721a(Context context, int i, Drawable drawable) {
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2;
        PorterDuff.Mode mode3;
        PorterDuff.Mode mode4;
        PorterDuff.Mode mode5;
        PorterDuff.Mode mode6;
        if (i == R.drawable.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
            int m937a = C0272dj.m937a(context, R.attr.colorControlNormal);
            mode4 = C0192ak.f1117a;
            m715a(findDrawableByLayerId, m937a, mode4);
            Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress);
            int m937a2 = C0272dj.m937a(context, R.attr.colorControlNormal);
            mode5 = C0192ak.f1117a;
            m715a(findDrawableByLayerId2, m937a2, mode5);
            Drawable findDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(android.R.id.progress);
            int m937a3 = C0272dj.m937a(context, R.attr.colorControlActivated);
            mode6 = C0192ak.f1117a;
            m715a(findDrawableByLayerId3, m937a3, mode6);
            return true;
        }
        if (i != R.drawable.abc_ratingbar_material && i != R.drawable.abc_ratingbar_indicator_material && i != R.drawable.abc_ratingbar_small_material) {
            return false;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        Drawable findDrawableByLayerId4 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
        int m939c = C0272dj.m939c(context, R.attr.colorControlNormal);
        mode = C0192ak.f1117a;
        m715a(findDrawableByLayerId4, m939c, mode);
        Drawable findDrawableByLayerId5 = layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress);
        int m937a4 = C0272dj.m937a(context, R.attr.colorControlActivated);
        mode2 = C0192ak.f1117a;
        m715a(findDrawableByLayerId5, m937a4, mode2);
        Drawable findDrawableByLayerId6 = layerDrawable2.findDrawableByLayerId(android.R.id.progress);
        int m937a5 = C0272dj.m937a(context, R.attr.colorControlActivated);
        mode3 = C0192ak.f1117a;
        m715a(findDrawableByLayerId6, m937a5, mode3);
        return true;
    }

    /* renamed from: a */
    private static boolean m716a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC0243ch
    /* renamed from: a */
    public final ColorStateList mo718a(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return C0057a.m45a(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return C0057a.m45a(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i != R.drawable.abc_btn_default_mtrl_shape) {
                if (i != R.drawable.abc_btn_borderless_material) {
                    if (i != R.drawable.abc_btn_colored_material) {
                        if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                            return C0057a.m45a(context, R.color.abc_tint_spinner);
                        }
                        if (m716a(this.f1121b, i)) {
                            return C0272dj.m938b(context, R.attr.colorControlNormal);
                        }
                        if (m716a(this.f1124e, i)) {
                            return C0057a.m45a(context, R.color.abc_tint_default);
                        }
                        if (m716a(this.f1125f, i)) {
                            return C0057a.m45a(context, R.color.abc_tint_btn_checkable);
                        }
                        if (i == R.drawable.abc_seekbar_thumb_material) {
                            return C0057a.m45a(context, R.color.abc_tint_seek_thumb);
                        }
                        return null;
                    }
                    return m717b(context, C0272dj.m937a(context, R.attr.colorAccent));
                }
                return m717b(context, 0);
            }
            return m717b(context, C0272dj.m937a(context, R.attr.colorButtonNormal));
        }
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList m938b = C0272dj.m938b(context, R.attr.colorSwitchThumbNormal);
        if (m938b != null && m938b.isStateful()) {
            iArr[0] = C0272dj.f1347a;
            iArr2[0] = m938b.getColorForState(iArr[0], 0);
            iArr[1] = C0272dj.f1351e;
            iArr2[1] = C0272dj.m937a(context, R.attr.colorControlActivated);
            iArr[2] = C0272dj.f1354h;
            iArr2[2] = m938b.getDefaultColor();
        } else {
            iArr[0] = C0272dj.f1347a;
            iArr2[0] = C0272dj.m939c(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = C0272dj.f1351e;
            iArr2[1] = C0272dj.m937a(context, R.attr.colorControlActivated);
            iArr[2] = C0272dj.f1354h;
            iArr2[2] = C0272dj.m937a(context, R.attr.colorSwitchThumbNormal);
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    @Override // androidx.appcompat.widget.InterfaceC0243ch
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo722b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0192ak.m710c()
            int[] r1 = r6.f1120a
            boolean r1 = m716a(r1, r8)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L17
            int r2 = androidx.appcompat.R.attr.colorControlNormal
        L14:
            r8 = r3
        L15:
            r6 = r5
            goto L45
        L17:
            int[] r1 = r6.f1122c
            boolean r1 = m716a(r1, r8)
            if (r1 == 0) goto L22
            int r2 = androidx.appcompat.R.attr.colorControlActivated
            goto L14
        L22:
            int[] r6 = r6.f1123d
            boolean r6 = m716a(r6, r8)
            if (r6 == 0) goto L2d
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L14
        L2d:
            int r6 = androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha
            if (r8 != r6) goto L3d
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r6 = 1109603123(0x42233333, float:40.8)
            int r6 = java.lang.Math.round(r6)
            r8 = r6
            goto L15
        L3d:
            int r6 = androidx.appcompat.R.drawable.abc_dialog_material_background
            if (r8 != r6) goto L42
            goto L14
        L42:
            r8 = r3
            r6 = r4
            r2 = r6
        L45:
            if (r6 == 0) goto L62
            boolean r6 = androidx.appcompat.widget.C0218bj.m849c(r9)
            if (r6 == 0) goto L51
            android.graphics.drawable.Drawable r9 = r9.mutate()
        L51:
            int r6 = androidx.appcompat.widget.C0272dj.m937a(r7, r2)
            android.graphics.PorterDuffColorFilter r6 = androidx.appcompat.widget.C0192ak.m706a(r6, r0)
            r9.setColorFilter(r6)
            if (r8 == r3) goto L61
            r9.setAlpha(r8)
        L61:
            return r5
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0193al.mo722b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    @Override // androidx.appcompat.widget.InterfaceC0243ch
    /* renamed from: a */
    public final PorterDuff.Mode mo719a(int i) {
        if (i == R.drawable.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }
}
