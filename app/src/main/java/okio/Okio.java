package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes.dex */
public final class Okio {
    static final Logger logger = Logger.getLogger(Okio.class.getName());

    private Okio() {
    }

    public static BufferedSource buffer(Source source) {
        return new RealBufferedSource(source);
    }

    public static BufferedSink buffer(Sink sink) {
        return new RealBufferedSink(sink);
    }

    public static Sink sink(OutputStream outputStream) {
        return sink(outputStream, new Timeout());
    }

    private static Sink sink(final OutputStream outputStream, final Timeout timeout) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (timeout == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new Sink() { // from class: okio.Okio.1
            @Override // okio.Sink
            public final void write(Buffer buffer, long j) {
                Util.checkOffsetAndCount(buffer.size, 0L, j);
                while (j > 0) {
                    Timeout.this.throwIfReached();
                    Segment segment = buffer.head;
                    int min = (int) Math.min(j, segment.limit - segment.pos);
                    outputStream.write(segment.data, segment.pos, min);
                    segment.pos += min;
                    long j2 = min;
                    j -= j2;
                    buffer.size -= j2;
                    if (segment.pos == segment.limit) {
                        buffer.head = segment.pop();
                        SegmentPool.recycle(segment);
                    }
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public final void flush() {
                outputStream.flush();
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                outputStream.close();
            }

            @Override // okio.Sink
            public final Timeout timeout() {
                return Timeout.this;
            }

            public final String toString() {
                return "sink(" + outputStream + ")";
            }
        };
    }

    public static Sink sink(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        AsyncTimeout timeout = timeout(socket);
        return timeout.sink(sink(socket.getOutputStream(), timeout));
    }

    public static Source source(InputStream inputStream) {
        return source(inputStream, new Timeout());
    }

    private static Source source(final InputStream inputStream, final Timeout timeout) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (timeout == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new Source() { // from class: okio.Okio.2
            @Override // okio.Source
            public final long read(Buffer buffer, long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                }
                if (j == 0) {
                    return 0L;
                }
                try {
                    Timeout.this.throwIfReached();
                    Segment writableSegment = buffer.writableSegment(1);
                    int read = inputStream.read(writableSegment.data, writableSegment.limit, (int) Math.min(j, 8192 - writableSegment.limit));
                    if (read == -1) {
                        return -1L;
                    }
                    writableSegment.limit += read;
                    long j2 = read;
                    buffer.size += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (Okio.isAndroidGetsocknameError(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                inputStream.close();
            }

            @Override // okio.Source
            public final Timeout timeout() {
                return Timeout.this;
            }

            public final String toString() {
                return "source(" + inputStream + ")";
            }
        };
    }

    public static Source source(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return source(new FileInputStream(file));
    }

    @IgnoreJRERequirement
    public static Source source(Path path, OpenOption... openOptionArr) {
        if (path == null) {
            throw new IllegalArgumentException("path == null");
        }
        return source(Files.newInputStream(path, openOptionArr));
    }

    public static Sink sink(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return sink(new FileOutputStream(file));
    }

    public static Sink appendingSink(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return sink(new FileOutputStream(file, true));
    }

    @IgnoreJRERequirement
    public static Sink sink(Path path, OpenOption... openOptionArr) {
        if (path == null) {
            throw new IllegalArgumentException("path == null");
        }
        return sink(Files.newOutputStream(path, openOptionArr));
    }

    public static Sink blackhole() {
        return new Sink() { // from class: okio.Okio.3
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // okio.Sink, java.io.Flushable
            public final void flush() {
            }

            @Override // okio.Sink
            public final void write(Buffer buffer, long j) {
                buffer.skip(j);
            }

            @Override // okio.Sink
            public final Timeout timeout() {
                return Timeout.NONE;
            }
        };
    }

    public static Source source(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        AsyncTimeout timeout = timeout(socket);
        return timeout.source(source(socket.getInputStream(), timeout));
    }

    private static AsyncTimeout timeout(final Socket socket) {
        return new AsyncTimeout() { // from class: okio.Okio.4
            @Override // okio.AsyncTimeout
            protected final IOException newTimeoutException(@Nullable IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // okio.AsyncTimeout
            protected final void timedOut() {
                try {
                    socket.close();
                } catch (AssertionError e) {
                    if (Okio.isAndroidGetsocknameError(e)) {
                        Okio.logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                        return;
                    }
                    throw e;
                } catch (Exception e2) {
                    Okio.logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                }
            }
        };
    }

    static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}