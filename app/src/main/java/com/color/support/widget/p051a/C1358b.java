package com.color.support.widget.p051a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import color.support.p043v7.appcompat.R;
import com.color.support.widget.C1545gc;
import com.color.support.widget.InterfaceC1553gk;
import com.color.support.widget.SecurityKeyboardView;
import neton.client.Utils.ResponseCode;

/* compiled from: KeyboardHelper.java */
/* renamed from: com.color.support.widget.a.b */
/* loaded from: classes.dex */
public final class C1358b implements InterfaceC1553gk {

    /* renamed from: a */
    private int f6884a;

    /* renamed from: b */
    private C1545gc f6885b;

    /* renamed from: c */
    private C1545gc f6886c;

    /* renamed from: d */
    private C1545gc f6887d;

    /* renamed from: e */
    private C1545gc f6888e;

    /* renamed from: f */
    private final Context f6889f;

    /* renamed from: g */
    private final SecurityKeyboardView f6890g;

    /* renamed from: h */
    private boolean f6891h;

    /* renamed from: i */
    private boolean f6892i;

    /* renamed from: j */
    private boolean f6893j;

    /* renamed from: k */
    private AudioManager f6894k;

    /* renamed from: l */
    private Drawable f6895l;

    /* renamed from: m */
    private Drawable f6896m;

    /* renamed from: n */
    private Drawable f6897n;

    @Override // com.color.support.widget.InterfaceC1553gk
    /* renamed from: a */
    public final void mo4866a(CharSequence charSequence) {
    }

    @Override // com.color.support.widget.InterfaceC1553gk
    /* renamed from: b */
    public final void mo4867b(int i) {
    }

    /* renamed from: c */
    private void m4863c(int i) {
        C1545gc c1545gc;
        C1545gc keyboard = this.f6890g.getKeyboard();
        if (keyboard == this.f6885b && i == -2) {
            c1545gc = this.f6887d;
        } else {
            if (keyboard != this.f6885b || i != -6) {
                if (keyboard == this.f6886c && i == -2) {
                    c1545gc = this.f6887d;
                } else if (keyboard == this.f6886c && i == -6) {
                    c1545gc = this.f6885b;
                } else if (keyboard != this.f6887d || i != -2) {
                    if (keyboard == this.f6887d && i == -6) {
                        c1545gc = this.f6885b;
                    } else if (keyboard == this.f6887d && i == -7) {
                        c1545gc = this.f6888e;
                    } else if (keyboard == this.f6888e && i == -7) {
                        c1545gc = this.f6887d;
                    } else if (keyboard == this.f6888e && i == -6) {
                        c1545gc = this.f6885b;
                    }
                }
            }
            c1545gc = this.f6886c;
        }
        this.f6890g.setPreviewEnabled(c1545gc != this.f6885b);
        this.f6890g.setKeyboard(c1545gc);
        if (c1545gc == this.f6886c) {
            this.f6884a = 0;
            m4862a(c1545gc);
            this.f6890g.setNewShifted(this.f6884a);
        }
    }

    /* renamed from: a */
    private void m4862a(C1545gc c1545gc) {
        if (c1545gc != this.f6886c) {
            return;
        }
        this.f6895l = this.f6889f.getResources().getDrawable(R.drawable.color_sym_keyboard_shift);
        this.f6897n = this.f6889f.getResources().getDrawable(R.drawable.color_sym_keyboard_shift_shifted);
        this.f6896m = this.f6889f.getResources().getDrawable(R.drawable.color_sym_keyboard_shift_locked);
        int m5174e = c1545gc.m5174e();
        if (this.f6884a == 0) {
            c1545gc.m5168a().get(m5174e).f7324c = this.f6895l;
        } else if (this.f6884a == 1) {
            c1545gc.m5168a().get(m5174e).f7324c = this.f6897n;
        } else if (this.f6884a == 2) {
            c1545gc.m5168a().get(m5174e).f7324c = this.f6896m;
        }
    }

    @Override // com.color.support.widget.InterfaceC1553gk
    /* renamed from: a */
    public final void mo4865a(int i, int[] iArr) {
        if (i != -5) {
            if (i == -1) {
                C1545gc keyboard = this.f6890g.getKeyboard();
                if (keyboard == this.f6886c) {
                    if (this.f6884a == 0) {
                        this.f6884a = 1;
                    } else if (this.f6884a == 1) {
                        this.f6884a = 2;
                    } else if (this.f6884a == 2) {
                        this.f6884a = 0;
                    }
                    this.f6890g.setKeyboard(keyboard);
                    m4862a(keyboard);
                    this.f6890g.setNewShifted(this.f6884a);
                    return;
                }
                return;
            }
            if (i == -2 || i == -7) {
                m4863c(i);
                return;
            }
            if (i == -6) {
                m4863c(i);
                return;
            }
            if (this.f6890g.getNewShifted() > 0 && i != 32 && i != 10) {
                Character.toUpperCase(i);
            }
            C1545gc keyboard2 = this.f6890g.getKeyboard();
            if (this.f6884a == 1 && keyboard2 == this.f6886c) {
                this.f6884a = 0;
                m4862a(keyboard2);
                this.f6890g.setKeyboard(keyboard2);
                this.f6890g.setNewShifted(this.f6884a);
            }
        }
    }

    @Override // com.color.support.widget.InterfaceC1553gk
    /* renamed from: a */
    public final void mo4864a(int i) {
        if (i != 0) {
            if (this.f6893j) {
                this.f6890g.performHapticFeedback(ResponseCode.CODE_3XX_FOUND);
            } else if (this.f6891h) {
                this.f6890g.performHapticFeedback(1, 3);
            }
            if (this.f6892i) {
                if (this.f6890g == null) {
                    throw new IllegalStateException("getAudioManager called when there is no mView");
                }
                if (this.f6894k == null) {
                    this.f6894k = (AudioManager) this.f6890g.getContext().getSystemService("audio");
                }
                this.f6894k.playSoundEffect(5);
            }
        }
    }
}
