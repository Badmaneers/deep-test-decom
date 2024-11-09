package androidx.room.p038a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: DBUtil.java */
/* renamed from: androidx.room.a.c */
/* loaded from: classes.dex */
public final class C0925c {
    /* renamed from: a */
    public static int m3338a(File file) {
        FileChannel fileChannel;
        ByteBuffer allocate;
        try {
            allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel.tryLock(60L, 4L, true);
            fileChannel.position(60L);
            if (fileChannel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i = allocate.getInt();
            if (fileChannel != null) {
                fileChannel.close();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
