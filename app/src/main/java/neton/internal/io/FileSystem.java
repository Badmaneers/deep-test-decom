package neton.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* loaded from: classes.dex */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() { // from class: neton.internal.io.FileSystem.1
        @Override // neton.internal.io.FileSystem
        public final Source source(File file) {
            return Okio.source(file);
        }

        @Override // neton.internal.io.FileSystem
        public final Sink sink(File file) {
            try {
                return Okio.sink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return Okio.sink(file);
            }
        }

        @Override // neton.internal.io.FileSystem
        public final Sink appendingSink(File file) {
            try {
                return Okio.appendingSink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return Okio.appendingSink(file);
            }
        }

        @Override // neton.internal.io.FileSystem
        public final void delete(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }

        @Override // neton.internal.io.FileSystem
        public final boolean exists(File file) {
            return file.exists();
        }

        @Override // neton.internal.io.FileSystem
        public final long size(File file) {
            return file.length();
        }

        @Override // neton.internal.io.FileSystem
        public final void rename(File file, File file2) {
            delete(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // neton.internal.io.FileSystem
        public final void deleteContents(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(file2)));
                }
            }
        }
    };

    Sink appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    Sink sink(File file);

    long size(File file);

    Source source(File file);
}
