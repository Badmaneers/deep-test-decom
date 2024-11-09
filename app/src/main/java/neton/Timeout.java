package neton;

import com.coloros.neton.NetonException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Timeout {
    private int connectTimeout;
    private int readTimeout;
    private TimeUnit timeUnit;
    private int writeTimeout;

    public Timeout(int i, int i2, int i3, TimeUnit timeUnit) {
        this.connectTimeout = 10000;
        this.readTimeout = 10000;
        this.writeTimeout = 10000;
        this.timeUnit = TimeUnit.MILLISECONDS;
        this.timeUnit = timeUnit;
        setConnectTimeout(i);
        setReadTimeout(i2);
        setWriteTimeout(i3);
    }

    public Timeout(int i, int i2, int i3) {
        this.connectTimeout = 10000;
        this.readTimeout = 10000;
        this.writeTimeout = 10000;
        this.timeUnit = TimeUnit.MILLISECONDS;
        setConnectTimeout(i);
        setReadTimeout(i2);
        setWriteTimeout(i3);
    }

    public Timeout() {
        this.connectTimeout = 10000;
        this.readTimeout = 10000;
        this.writeTimeout = 10000;
        this.timeUnit = TimeUnit.MILLISECONDS;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public void setConnectTimeout(int i) {
        if (i < 0) {
            throw new NetonException(new IllegalArgumentException("timeout < 0"));
        }
        if (this.timeUnit == null) {
            throw new NetonException(new NullPointerException("unit == null"));
        }
        long millis = this.timeUnit.toMillis(i);
        if (millis > 2147483647L) {
            throw new NetonException(new IllegalArgumentException("Timeout too large."));
        }
        if (millis == 0 && i > 0) {
            throw new NetonException(new IllegalArgumentException("Timeout too small."));
        }
        this.connectTimeout = (int) millis;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public void setReadTimeout(int i) {
        if (i < 0) {
            throw new NetonException(new IllegalArgumentException("timeout < 0"));
        }
        if (this.timeUnit == null) {
            throw new NetonException(new NullPointerException("unit == null"));
        }
        long millis = this.timeUnit.toMillis(i);
        if (millis > 2147483647L) {
            throw new NetonException(new IllegalArgumentException("Timeout too large."));
        }
        if (millis == 0 && i > 0) {
            throw new NetonException(new IllegalArgumentException("Timeout too small."));
        }
        this.readTimeout = (int) millis;
    }

    public int getWriteTimeout() {
        return this.writeTimeout;
    }

    public void setWriteTimeout(int i) {
        if (i < 0) {
            throw new NetonException(new IllegalArgumentException("timeout < 0"));
        }
        if (this.timeUnit == null) {
            throw new NetonException(new NullPointerException("unit == null"));
        }
        long millis = this.timeUnit.toMillis(i);
        if (millis > 2147483647L) {
            throw new NetonException(new IllegalArgumentException("Timeout too large."));
        }
        if (millis == 0 && i > 0) {
            throw new NetonException(new IllegalArgumentException("Timeout too small."));
        }
        this.writeTimeout = (int) millis;
    }

    public String toString() {
        return "Timeout{connectTimeout:" + this.connectTimeout + "readTimeout" + this.readTimeout + "writeTimeout" + this.writeTimeout + "}";
    }
}
