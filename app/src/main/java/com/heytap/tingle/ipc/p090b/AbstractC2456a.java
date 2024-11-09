package com.heytap.tingle.ipc.p090b;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SystemServiceProxy.java */
/* renamed from: com.heytap.tingle.ipc.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC2456a<T> {

    /* renamed from: d */
    private static String f10734d;

    /* renamed from: b */
    protected String f10736b;

    /* renamed from: c */
    protected boolean f10737c;

    /* renamed from: a */
    protected ThreadLocal<String> f10735a = new ThreadLocal<>();

    /* renamed from: e */
    private final ReentrantLock f10738e = new ReentrantLock(true);

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2456a() {
        f10734d = getClass().getName();
        this.f10737c = true;
    }
}
