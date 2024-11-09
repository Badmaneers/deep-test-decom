package neton;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class MediaType {
    public static final String FORM = "application/x-www-form-urlencoded";
    public static final String IMAGE_PNG = "image/png";
    public static final String JSON = "application/json; charset=utf-8";
    public static final String MULTIPART_FORM = "multipart/form-data";
    public static final String OCTET_STREAM = "application/octet-stream";
    private static final String QUOTED = "\"([^\"]*)\"";
    public static final String TEXT_PLAIN = "text/plain; charset=utf-8";
    public static final String TEXT_XML = "text/xml; charset=utf-8";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String charset;
    private final String mediaType;
    private final String subtype;
    private final String type;
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    private MediaType(String str, String str2, String str3, String str4) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.charset = str4;
    }

    public static MediaType parse(String str) {
        Matcher matcher = TYPE_SUBTYPE.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = PARAMETER.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                String group2 = matcher2.group(2);
                if (group2 != null) {
                    if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                        group2 = group2.substring(1, group2.length() - 1);
                    }
                } else {
                    group2 = matcher2.group(3);
                }
                if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                    return null;
                }
                str2 = group2;
            }
        }
        return new MediaType(str, lowerCase, lowerCase2, str2);
    }

    public final String type() {
        return this.type;
    }

    public final String subtype() {
        return this.subtype;
    }

    public final Charset charset() {
        return charset(null);
    }

    public final Charset charset(Charset charset) {
        try {
            return this.charset != null ? Charset.forName(this.charset) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String toString() {
        return this.mediaType;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && ((MediaType) obj).mediaType.equals(this.mediaType);
    }

    public final int hashCode() {
        return this.mediaType.hashCode();
    }
}
