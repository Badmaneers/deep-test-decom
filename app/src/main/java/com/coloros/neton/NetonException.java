package com.coloros.neton;

import java.io.IOException;

/* loaded from: classes.dex */
public class NetonException extends IOException {
    static final long serialVersionUID = 1;
    private Class<?> mExceptionClass;

    public Class<?> getExceptionClass() {
        return this.mExceptionClass;
    }

    public NetonException() {
        this.mExceptionClass = IOException.class;
    }

    public NetonException(String str) {
        super(str);
        this.mExceptionClass = IOException.class;
    }

    public NetonException(String str, Throwable th) {
        super(str, th);
        this.mExceptionClass = IOException.class;
        this.mExceptionClass = th.getClass();
    }

    public NetonException(Throwable th) {
        super(th);
        this.mExceptionClass = IOException.class;
        this.mExceptionClass = th.getClass();
    }
}
