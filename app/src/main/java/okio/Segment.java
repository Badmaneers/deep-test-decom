package okio;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class Segment {
    static final int SHARE_MINIMUM = 1024;
    static final int SIZE = 8192;
    final byte[] data;
    int limit;
    Segment next;
    boolean owner;
    int pos;
    Segment prev;
    boolean shared;

    public Segment() {
        this.data = new byte[SIZE];
        this.owner = true;
        this.shared = false;
    }

    public Segment(Segment segment) {
        this(segment.data, segment.pos, segment.limit);
        segment.shared = true;
    }

    public Segment(byte[] bArr, int i, int i2) {
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.owner = false;
        this.shared = true;
    }

    @Nullable
    public final Segment pop() {
        Segment segment = this.next != this ? this.next : null;
        this.prev.next = this.next;
        this.next.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        segment.prev = this;
        segment.next = this.next;
        this.next.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment split(int i) {
        Segment take;
        if (i <= 0 || i > this.limit - this.pos) {
            throw new IllegalArgumentException();
        }
        if (i >= SHARE_MINIMUM) {
            take = new Segment(this);
        } else {
            take = SegmentPool.take();
            System.arraycopy(this.data, this.pos, take.data, 0, i);
        }
        take.limit = take.pos + i;
        this.pos += i;
        this.prev.push(take);
        return take;
    }

    public final void compact() {
        if (this.prev == this) {
            throw new IllegalStateException();
        }
        if (this.prev.owner) {
            int i = this.limit - this.pos;
            if (i > (8192 - this.prev.limit) + (this.prev.shared ? 0 : this.prev.pos)) {
                return;
            }
            writeTo(this.prev, i);
            pop();
            SegmentPool.recycle(this);
        }
    }

    public final void writeTo(Segment segment, int i) {
        if (!segment.owner) {
            throw new IllegalArgumentException();
        }
        if (segment.limit + i > SIZE) {
            if (segment.shared) {
                throw new IllegalArgumentException();
            }
            if ((segment.limit + i) - segment.pos > SIZE) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(segment.data, segment.pos, segment.data, 0, segment.limit - segment.pos);
            segment.limit -= segment.pos;
            segment.pos = 0;
        }
        System.arraycopy(this.data, this.pos, segment.data, segment.limit, i);
        segment.limit += i;
        this.pos += i;
    }
}
