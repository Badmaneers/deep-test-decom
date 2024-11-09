package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import androidx.core.p016a.p017a.InterfaceMenuC0400a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater.java */
/* renamed from: androidx.appcompat.view.i */
/* loaded from: classes.dex */
public final class C0135i extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f462a;

    /* renamed from: b */
    static final Class<?>[] f463b;

    /* renamed from: c */
    final Object[] f464c;

    /* renamed from: d */
    final Object[] f465d;

    /* renamed from: e */
    Context f466e;

    /* renamed from: f */
    private Object f467f;

    static {
        Class<?>[] clsArr = {Context.class};
        f462a = clsArr;
        f463b = clsArr;
    }

    public C0135i(Context context) {
        super(context);
        this.f466e = context;
        this.f464c = new Object[]{context};
        this.f465d = this.f464c;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0400a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                XmlResourceParser layout = this.f466e.getResources().getLayout(i);
                try {
                    m317a(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (IOException e) {
                    e = e;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (XmlPullParserException e2) {
                    e = e2;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (Throwable th) {
                    th = th;
                    xmlResourceParser = layout;
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (XmlPullParserException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:            r4 = r9.getName();     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:            if (r5 == false) goto L91;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:            if (r4.equals(r6) == false) goto L91;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:            r6 = null;        r5 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c3, code lost:            r4 = r9.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:            if (r4.equals("group") == false) goto L94;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:            r0.m322a();     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:            if (r4.equals("item") == false) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:            if (r0.m327d() != false) goto L129;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:            if (r0.f477a == null) goto L103;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:            if (r0.f477a.mo501c() == false) goto L103;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:            r0.m326c();     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:            r0.m324b();     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:            if (r4.equals("menu") == false) goto L132;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:            r11 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:            if (r5 != false) goto L134;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:            r4 = r9.getName();     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:            if (r4.equals("group") == false) goto L111;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:            r0.m323a(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:            if (r4.equals("item") == false) goto L114;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:            r0.m325b(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ae, code lost:            if (r4.equals("menu") == false) goto L117;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:            m317a(r9, r10, r0.m326c());     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b8, code lost:            r5 = true;        r6 = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:            throw new java.lang.RuntimeException("Unexpected end of document");     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:            r4 = r11;        r6 = null;        r11 = false;        r5 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:            if (r11 != false) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:            switch(r4) {            case 1: goto L126;            case 2: goto L107;            case 3: goto L86;            default: goto L139;        };     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m317a(org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.view.Menu r11) {
        /*
            r8 = this;
            androidx.appcompat.view.k r0 = new androidx.appcompat.view.k
            r0.<init>(r8, r11)
            int r11 = r9.getEventType()
        L9:
            r1 = 2
            r2 = 1
            if (r11 != r1) goto L2e
            java.lang.String r11 = r9.getName()
            java.lang.String r1 = "menu"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L1e
            int r11 = r9.next()
            goto L34
        L1e:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = java.lang.String.valueOf(r11)
            java.lang.String r10 = "Expecting menu, got "
            java.lang.String r9 = r10.concat(r9)
            r8.<init>(r9)
            throw r8
        L2e:
            int r11 = r9.next()
            if (r11 != r2) goto L9
        L34:
            r1 = 0
            r3 = 0
            r4 = r11
            r6 = r1
            r11 = r3
            r5 = r11
        L3a:
            if (r11 != 0) goto Lc9
            switch(r4) {
                case 1: goto Lbb;
                case 2: goto L8a;
                case 3: goto L41;
                default: goto L3f;
            }
        L3f:
            goto Lc3
        L41:
            java.lang.String r4 = r9.getName()
            if (r5 == 0) goto L51
            boolean r7 = r4.equals(r6)
            if (r7 == 0) goto L51
            r6 = r1
            r5 = r3
            goto Lc3
        L51:
            java.lang.String r7 = "group"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L5e
            r0.m322a()
            goto Lc3
        L5e:
            java.lang.String r7 = "item"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L80
            boolean r4 = r0.m327d()
            if (r4 != 0) goto Lc3
            androidx.core.g.c r4 = r0.f477a
            if (r4 == 0) goto L7c
            androidx.core.g.c r4 = r0.f477a
            boolean r4 = r4.mo501c()
            if (r4 == 0) goto L7c
            r0.m326c()
            goto Lc3
        L7c:
            r0.m324b()
            goto Lc3
        L80:
            java.lang.String r7 = "menu"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto Lc3
            r11 = r2
            goto Lc3
        L8a:
            if (r5 != 0) goto Lc3
            java.lang.String r4 = r9.getName()
            java.lang.String r7 = "group"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L9c
            r0.m323a(r10)
            goto Lc3
        L9c:
            java.lang.String r7 = "item"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto La8
            r0.m325b(r10)
            goto Lc3
        La8:
            java.lang.String r7 = "menu"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto Lb8
            android.view.SubMenu r4 = r0.m326c()
            r8.m317a(r9, r10, r4)
            goto Lc3
        Lb8:
            r5 = r2
            r6 = r4
            goto Lc3
        Lbb:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Unexpected end of document"
            r8.<init>(r9)
            throw r8
        Lc3:
            int r4 = r9.next()
            goto L3a
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.C0135i.m317a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: a */
    public final Object m318a() {
        if (this.f467f == null) {
            Context context = this.f466e;
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            this.f467f = context;
        }
        return this.f467f;
    }
}
