package com.color.support.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorTimePicker.java */
/* renamed from: com.color.support.widget.ev */
/* loaded from: classes.dex */
public final class C1488ev implements InterfaceC1420ch {

    /* renamed from: a */
    final /* synthetic */ ColorTimePicker f7129a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1488ev(ColorTimePicker colorTimePicker) {
        this.f7129a = colorTimePicker;
    }

    @Override // com.color.support.widget.InterfaceC1420ch
    /* renamed from: a */
    public final String mo4952a(int i) {
        String[] strArr;
        String[] strArr2;
        int i2;
        String[] strArr3;
        String[] strArr4;
        String str;
        String[] strArr5;
        String m4778c = ColorTimePicker.m4778c(this.f7129a, i);
        strArr = this.f7129a.f6693a;
        int i3 = i - 1;
        strArr[i3] = m4778c;
        strArr2 = this.f7129a.f6705m;
        boolean z = true;
        strArr2[i3] = m4778c.substring(m4778c.indexOf(" ") + 1);
        i2 = this.f7129a.f6701i;
        if (i == i2) {
            strArr4 = this.f7129a.f6705m;
            str = this.f7129a.f6707o;
            strArr4[i3] = str;
            strArr5 = this.f7129a.f6705m;
            return strArr5[i3];
        }
        strArr3 = this.f7129a.f6705m;
        String str2 = strArr3[i3];
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < str2.length(); i4++) {
            if (str2.charAt(i4) != ' ' || !z) {
                sb.append(str2.charAt(i4));
            }
            if (z && str2.charAt(i4) == ' ') {
                z = false;
            }
        }
        return sb.toString();
    }
}
