package neton;

import java.util.ArrayList;
import java.util.List;
import neton.internal.Util;
import okio.Buffer;
import okio.BufferedSink;

/* loaded from: classes.dex */
public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.parse(MediaType.FORM);
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public final String name(int i) {
        return HttpUrl.percentDecode(encodedName(i), true);
    }

    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public final String value(int i) {
        return HttpUrl.percentDecode(encodedValue(i), true);
    }

    @Override // neton.RequestBody
    public final MediaType contentType() {
        return CONTENT_TYPE;
    }

    @Override // neton.RequestBody
    public final long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // neton.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        writeOrCountBytes(bufferedSink, false);
    }

    private long writeOrCountBytes(BufferedSink bufferedSink, boolean z) {
        Buffer buffer;
        if (z) {
            buffer = new Buffer();
        } else {
            buffer = bufferedSink.buffer();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.encodedNames.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8(this.encodedValues.get(i));
        }
        if (!z) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    /* loaded from: classes.dex */
    public final class Builder {
        private final List<String> names = new ArrayList();
        private final List<String> values = new ArrayList();

        public final Builder add(String str, String str2) {
            this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            return this;
        }

        public final Builder addEncoded(String str, String str2) {
            this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }
}
