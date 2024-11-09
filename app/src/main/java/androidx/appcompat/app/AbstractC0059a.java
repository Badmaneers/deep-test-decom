package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyEvent;
import androidx.appcompat.view.AbstractC0128b;
import androidx.appcompat.view.InterfaceC0129c;

/* compiled from: ActionBar.java */
/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0059a {
    /* renamed from: a */
    public abstract int mo152a();

    /* renamed from: a */
    public AbstractC0128b mo153a(InterfaceC0129c interfaceC0129c) {
        return null;
    }

    /* renamed from: a */
    public void mo155a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo156a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void mo157a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo158a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo159a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo160b() {
        return null;
    }

    /* renamed from: b */
    public void mo161b(boolean z) {
    }

    /* renamed from: c */
    public void mo163c(boolean z) {
    }

    /* renamed from: d */
    public boolean mo164d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo165e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo166f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo167g() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo168h() {
    }

    /* renamed from: c */
    public void mo162c() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    /* renamed from: a */
    public void mo154a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }
}
