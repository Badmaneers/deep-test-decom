package neton;

import com.coloros.neton.NetonException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import neton.internal.Util;
import neton.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;

/* loaded from: classes.dex */
public final class HttpUrl {
    static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    static final String FRAGMENT_ENCODE_SET = "";
    static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    static final String QUERY_COMPONENT_ENCODE_SET = " \"'<>#&=";
    static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    static final String QUERY_ENCODE_SET = " \"'<>#";
    static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    final String host;

    /* renamed from: ip */
    private final String f10837ip;
    private final String password;
    private final List<String> pathSegments;
    final int port;
    private final List<String> queryNamesAndValues;
    final String scheme;
    private final String url;
    private final String username;

    static int decodeHexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return (c - 'A') + 10;
    }

    HttpUrl(Builder builder) {
        this.scheme = builder.scheme;
        this.username = percentDecode(builder.encodedUsername, false);
        this.password = percentDecode(builder.encodedPassword, false);
        this.f10837ip = builder.f10838ip;
        this.host = builder.host;
        this.port = builder.effectivePort();
        this.pathSegments = percentDecode(builder.encodedPathSegments, false);
        this.queryNamesAndValues = builder.encodedQueryNamesAndValues != null ? percentDecode(builder.encodedQueryNamesAndValues, true) : null;
        this.fragment = builder.encodedFragment != null ? percentDecode(builder.encodedFragment, false) : null;
        this.url = builder.toString();
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new NetonException(new RuntimeException(e));
        }
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                return URI.create(builder.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new NetonException(new RuntimeException(e));
            }
        }
    }

    public final String scheme() {
        return this.scheme;
    }

    public final boolean isHttps() {
        return this.scheme.equals("https");
    }

    public final String encodedUsername() {
        if (this.username.isEmpty()) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, Util.delimiterOffset(str, length, str.length(), ":@"));
    }

    public final String username() {
        return this.username;
    }

    public final String encodedPassword() {
        if (this.password.isEmpty()) {
            return "";
        }
        return this.url.substring(this.url.indexOf(58, this.scheme.length() + 3) + 1, this.url.indexOf(64));
    }

    public final String password() {
        return this.password;
    }

    public final String host() {
        return this.host;
    }

    /* renamed from: ip */
    public final String m7842ip() {
        return this.f10837ip;
    }

    public final int port() {
        return this.port;
    }

    public static int defaultPort(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final String encodedPath() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        return this.url.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), "?#"));
    }

    static void pathSegmentsToString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public final List<String> encodedPathSegments() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < delimiterOffset) {
            int i = indexOf + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, i, delimiterOffset, '/');
            arrayList.add(this.url.substring(i, delimiterOffset2));
            indexOf = delimiterOffset2;
        }
        return arrayList;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int indexOf = this.url.indexOf(63) + 1;
        return this.url.substring(indexOf, Util.delimiterOffset(this.url, indexOf + 1, this.url.length(), '#'));
    }

    static void namesAndValuesToQueryString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static List<String> queryStringToNamesAndValues(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        namesAndValuesToQueryString(sb, this.queryNamesAndValues);
        return sb.toString();
    }

    public final int querySize() {
        if (this.queryNamesAndValues != null) {
            return this.queryNamesAndValues.size() / 2;
        }
        return 0;
    }

    public final String queryParameter(String str) {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int size = this.queryNamesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.queryNamesAndValues.get(i))) {
                return this.queryNamesAndValues.get(i + 1);
            }
        }
        return null;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.queryNamesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.queryNamesAndValues.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public final List<String> queryParameterValues(String str) {
        if (this.queryNamesAndValues == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.queryNamesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.queryNamesAndValues.get(i))) {
                arrayList.add(this.queryNamesAndValues.get(i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String queryParameterName(int i) {
        if (this.queryNamesAndValues == null) {
            throw new NetonException(new IndexOutOfBoundsException());
        }
        return this.queryNamesAndValues.get(i * 2);
    }

    public final String queryParameterValue(int i) {
        if (this.queryNamesAndValues == null) {
            throw new NetonException(new IndexOutOfBoundsException());
        }
        return this.queryNamesAndValues.get((i * 2) + 1);
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(this.url.indexOf(35) + 1);
    }

    public final String fragment() {
        return this.fragment;
    }

    public final String redact() {
        try {
            return newBuilder("/...").username("").password("").build().toString();
        } catch (NetonException unused) {
            return "";
        }
    }

    public final HttpUrl resolve(String str) {
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.scheme = this.scheme;
        builder.encodedUsername = encodedUsername();
        builder.encodedPassword = encodedPassword();
        builder.f10838ip = this.f10837ip;
        builder.host = this.host;
        builder.port = this.port != defaultPort(this.scheme) ? this.port : -1;
        builder.encodedPathSegments.clear();
        builder.encodedPathSegments.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.encodedFragment = encodedFragment();
        return builder;
    }

    public final Builder newBuilder(String str) {
        Builder builder = new Builder();
        if (builder.parse(this, str) == Builder.ParseResult.SUCCESS) {
            return builder;
        }
        return null;
    }

    public static HttpUrl parse(String str) {
        Builder builder = new Builder();
        if (builder.parse(null, str) == Builder.ParseResult.SUCCESS) {
            return builder.build();
        }
        return null;
    }

    public static HttpUrl get(URL url) {
        return parse(url.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HttpUrl getChecked(String str) {
        Builder builder = new Builder();
        Builder.ParseResult parse = builder.parse(null, str);
        switch (parse) {
            case SUCCESS:
                return builder.build();
            case INVALID_HOST:
                throw new UnknownHostException("Invalid host: ".concat(String.valueOf(str)));
            default:
                throw new MalformedURLException("Invalid URL: " + parse + " for " + str);
        }
    }

    public static HttpUrl get(URI uri) {
        return parse(uri.toString());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).url.equals(this.url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.verifyAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.get().getEffectiveTldPlusOne(this.host);
    }

    /* loaded from: classes.dex */
    public final class Builder {
        String encodedFragment;
        List<String> encodedQueryNamesAndValues;
        String host;

        /* renamed from: ip */
        String f10838ip;
        String scheme;
        String encodedUsername = "";
        String encodedPassword = "";
        int port = -1;
        final List<String> encodedPathSegments = new ArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum ParseResult {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public Builder() {
            this.encodedPathSegments.add("");
        }

        public final Builder scheme(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("scheme == null"));
            }
            if (str.equalsIgnoreCase("http")) {
                this.scheme = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.scheme = "https";
            } else {
                throw new NetonException(new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(str))));
            }
            return this;
        }

        public final Builder username(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("username == null"));
            }
            this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public final Builder encodedUsername(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("encodedUsername == null"));
            }
            this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public final Builder password(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("password == null"));
            }
            this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public final Builder encodedPassword(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("encodedPassword == null"));
            }
            this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public final Builder host(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("host == null"));
            }
            String canonicalizeHost = canonicalizeHost(str, 0, str.length());
            if (canonicalizeHost == null) {
                throw new NetonException(new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str))));
            }
            this.host = canonicalizeHost;
            return this;
        }

        /* renamed from: ip */
        public final Builder m7843ip(String str) {
            this.f10838ip = str;
            return this;
        }

        public final Builder port(int i) {
            if (i <= 0 || i > 65535) {
                throw new NetonException(new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i))));
            }
            this.port = i;
            return this;
        }

        final int effectivePort() {
            return this.port != -1 ? this.port : HttpUrl.defaultPort(this.scheme);
        }

        public final Builder addPathSegment(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("pathSegment == null"));
            }
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("pathSegments == null"));
            }
            return addPathSegments(str, false);
        }

        public final Builder addEncodedPathSegment(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("encodedPathSegment == null"));
            }
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("encodedPathSegments == null"));
            }
            return addPathSegments(str, true);
        }

        private Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, i, str.length(), "/\\");
                push(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }

        public final Builder setPathSegment(int i, String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("pathSegment == null"));
            }
            String canonicalize = HttpUrl.canonicalize(str, 0, str.length(), HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, true);
            if (isDot(canonicalize) || isDotDot(canonicalize)) {
                throw new NetonException(new IllegalArgumentException("unexpected path segment: ".concat(String.valueOf(str))));
            }
            this.encodedPathSegments.set(i, canonicalize);
            return this;
        }

        public final Builder setEncodedPathSegment(int i, String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("encodedPathSegment == null"));
            }
            String canonicalize = HttpUrl.canonicalize(str, 0, str.length(), HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, true);
            this.encodedPathSegments.set(i, canonicalize);
            if (isDot(canonicalize) || isDotDot(canonicalize)) {
                throw new NetonException(new IllegalArgumentException("unexpected path segment: ".concat(String.valueOf(str))));
            }
            return this;
        }

        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder encodedPath(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("encodedPath == null"));
            }
            if (!str.startsWith("/")) {
                throw new NetonException(new IllegalArgumentException("unexpected encodedPath: ".concat(String.valueOf(str))));
            }
            resolvePath(str, 0, str.length());
            return this;
        }

        public final Builder query(String str) {
            this.encodedQueryNamesAndValues = str != null ? HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, HttpUrl.QUERY_ENCODE_SET, false, false, true, true)) : null;
            return this;
        }

        public final Builder encodedQuery(String str) {
            this.encodedQueryNamesAndValues = str != null ? HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public final Builder addQueryParameter(String str, String str2) {
            if (str == null) {
                throw new NetonException(new NullPointerException("name == null"));
            }
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, true));
            this.encodedQueryNamesAndValues.add(str2 != null ? HttpUrl.canonicalize(str2, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, true) : null);
            return this;
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            if (str == null) {
                throw new NetonException(new NullPointerException("encodedName == null"));
            }
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET, true, false, true, true));
            this.encodedQueryNamesAndValues.add(str2 != null ? HttpUrl.canonicalize(str2, HttpUrl.QUERY_COMPONENT_ENCODE_SET, true, false, true, true) : null);
            return this;
        }

        public final Builder setQueryParameter(String str, String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("name == null"));
            }
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(HttpUrl.canonicalize(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, true));
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("encodedName == null"));
            }
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(HttpUrl.canonicalize(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET, true, false, true, true));
            return this;
        }

        private void removeAllCanonicalQueryParameters(String str) {
            for (int size = this.encodedQueryNamesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.encodedQueryNamesAndValues.get(size))) {
                    this.encodedQueryNamesAndValues.remove(size + 1);
                    this.encodedQueryNamesAndValues.remove(size);
                    if (this.encodedQueryNamesAndValues.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
            }
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? HttpUrl.canonicalize(str, "", false, false, false, false) : null;
            return this;
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? HttpUrl.canonicalize(str, "", true, false, false, false) : null;
            return this;
        }

        final Builder reencodeForUri() {
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                this.encodedPathSegments.set(i, HttpUrl.canonicalize(this.encodedPathSegments.get(i), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, true));
            }
            if (this.encodedQueryNamesAndValues != null) {
                int size2 = this.encodedQueryNamesAndValues.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.encodedQueryNamesAndValues.get(i2);
                    if (str != null) {
                        this.encodedQueryNamesAndValues.set(i2, HttpUrl.canonicalize(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, true));
                    }
                }
            }
            if (this.encodedFragment != null) {
                this.encodedFragment = HttpUrl.canonicalize(this.encodedFragment, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, false);
            }
            return this;
        }

        public final HttpUrl build() {
            if (this.scheme == null) {
                throw new NetonException(new IllegalStateException("scheme == null"));
            }
            if (this.host == null) {
                throw new NetonException(new IllegalStateException("host == null"));
            }
            return new HttpUrl(this);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.scheme);
            sb.append("://");
            if (!this.encodedUsername.isEmpty() || !this.encodedPassword.isEmpty()) {
                sb.append(this.encodedUsername);
                if (!this.encodedPassword.isEmpty()) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            if (this.host.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.host);
                sb.append(']');
            } else {
                sb.append(this.host);
            }
            int effectivePort = effectivePort();
            if (effectivePort != HttpUrl.defaultPort(this.scheme)) {
                sb.append(':');
                sb.append(effectivePort);
            }
            HttpUrl.pathSegmentsToString(sb, this.encodedPathSegments);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                HttpUrl.namesAndValuesToQueryString(sb, this.encodedQueryNamesAndValues);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        final ParseResult parse(HttpUrl httpUrl, String str) {
            int delimiterOffset;
            int i;
            int i2;
            int skipLeadingAsciiWhitespace = Util.skipLeadingAsciiWhitespace(str, 0, str.length());
            int skipTrailingAsciiWhitespace = Util.skipTrailingAsciiWhitespace(str, skipLeadingAsciiWhitespace, str.length());
            if (schemeDelimiterOffset(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace) != -1) {
                if (str.regionMatches(true, skipLeadingAsciiWhitespace, "https:", 0, 6)) {
                    this.scheme = "https";
                    skipLeadingAsciiWhitespace += 6;
                } else if (str.regionMatches(true, skipLeadingAsciiWhitespace, "http:", 0, 5)) {
                    this.scheme = "http";
                    skipLeadingAsciiWhitespace += 5;
                } else {
                    return ParseResult.UNSUPPORTED_SCHEME;
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme;
            } else {
                return ParseResult.MISSING_SCHEME;
            }
            int slashCount = slashCount(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace);
            char c = '#';
            if (slashCount >= 2 || httpUrl == null || !httpUrl.scheme.equals(this.scheme)) {
                boolean z = false;
                boolean z2 = false;
                int i3 = skipLeadingAsciiWhitespace + slashCount;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str, i3, skipTrailingAsciiWhitespace, "@/\\?#");
                    char charAt = delimiterOffset != skipTrailingAsciiWhitespace ? str.charAt(delimiterOffset) : (char) 65535;
                    if (charAt != 65535 && charAt != c && charAt != '/' && charAt != '\\') {
                        switch (charAt) {
                            case '@':
                                if (!z) {
                                    int delimiterOffset2 = Util.delimiterOffset(str, i3, delimiterOffset, ':');
                                    i2 = delimiterOffset;
                                    String canonicalize = HttpUrl.canonicalize(str, i3, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                    if (z2) {
                                        canonicalize = this.encodedUsername + "%40" + canonicalize;
                                    }
                                    this.encodedUsername = canonicalize;
                                    if (delimiterOffset2 != i2) {
                                        this.encodedPassword = HttpUrl.canonicalize(str, delimiterOffset2 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                        z = true;
                                    }
                                    z2 = true;
                                } else {
                                    i2 = delimiterOffset;
                                    this.encodedPassword += "%40" + HttpUrl.canonicalize(str, i3, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                }
                                i3 = i2 + 1;
                                c = '#';
                                break;
                        }
                    }
                }
                i = delimiterOffset;
                int portColonOffset = portColonOffset(str, i3, i);
                int i4 = portColonOffset + 1;
                if (i4 < i) {
                    this.host = canonicalizeHost(str, i3, portColonOffset);
                    this.port = parsePort(str, i4, i);
                    if (this.port == -1) {
                        return ParseResult.INVALID_PORT;
                    }
                } else {
                    this.host = canonicalizeHost(str, i3, portColonOffset);
                    this.port = HttpUrl.defaultPort(this.scheme);
                }
                if (httpUrl != null) {
                    this.f10838ip = httpUrl.f10837ip;
                }
                if (this.host == null) {
                    return ParseResult.INVALID_HOST;
                }
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.f10838ip = httpUrl.f10837ip;
                this.host = httpUrl.host;
                this.port = httpUrl.port;
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (skipLeadingAsciiWhitespace == skipTrailingAsciiWhitespace || str.charAt(skipLeadingAsciiWhitespace) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = skipLeadingAsciiWhitespace;
            }
            int delimiterOffset3 = Util.delimiterOffset(str, i, skipTrailingAsciiWhitespace, "?#");
            resolvePath(str, i, delimiterOffset3);
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str, delimiterOffset3, skipTrailingAsciiWhitespace, '#');
                this.encodedQueryNamesAndValues = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, true));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = HttpUrl.canonicalize(str, 1 + delimiterOffset3, skipTrailingAsciiWhitespace, "", true, false, false, false);
            }
            return ParseResult.SUCCESS;
        }

        private void resolvePath(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i++;
            } else {
                this.encodedPathSegments.set(this.encodedPathSegments.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = Util.delimiterOffset(str, i3, i2, "/\\");
                boolean z = i < i2;
                push(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        private void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize = HttpUrl.canonicalize(str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, true);
            if (isDot(canonicalize)) {
                return;
            }
            if (isDotDot(canonicalize)) {
                pop();
                return;
            }
            if (this.encodedPathSegments.get(this.encodedPathSegments.size() - 1).isEmpty()) {
                this.encodedPathSegments.set(this.encodedPathSegments.size() - 1, canonicalize);
            } else {
                this.encodedPathSegments.add(canonicalize);
            }
            if (z) {
                this.encodedPathSegments.add("");
            }
        }

        private boolean isDot(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean isDotDot(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void pop() {
            if (this.encodedPathSegments.remove(this.encodedPathSegments.size() - 1).isEmpty() && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(this.encodedPathSegments.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        private static int schemeDelimiterOffset(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                return -1;
            }
            while (true) {
                i++;
                if (i >= i2) {
                    return -1;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 < 'a' || charAt2 > 'z') {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        if (charAt2 < '0' || charAt2 > '9') {
                            if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                if (charAt2 == ':') {
                                    return i;
                                }
                                return -1;
                            }
                        }
                    }
                }
            }
        }

        private static int slashCount(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int portColonOffset(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt != '[') {
                    i++;
                }
                do {
                    i++;
                    if (i < i2) {
                    }
                    i++;
                } while (str.charAt(i) != ']');
                i++;
            }
            return i2;
        }

        private static String canonicalizeHost(String str, int i, int i2) {
            InetAddress decodeIpv6;
            String percentDecode = HttpUrl.percentDecode(str, i, i2, false);
            if (percentDecode.contains(":")) {
                if (percentDecode.startsWith("[") && percentDecode.endsWith("]")) {
                    decodeIpv6 = decodeIpv6(percentDecode, 1, percentDecode.length() - 1);
                } else {
                    decodeIpv6 = decodeIpv6(percentDecode, 0, percentDecode.length());
                }
                if (decodeIpv6 == null) {
                    return null;
                }
                byte[] address = decodeIpv6.getAddress();
                if (address.length == 16) {
                    return inet6AddressToAscii(address);
                }
                throw new AssertionError();
            }
            return Util.domainToAscii(percentDecode);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:            return null;     */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.net.InetAddress decodeIpv6(java.lang.String r11, int r12, int r13) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = -1
                r3 = 0
                r5 = r2
                r6 = r5
                r4 = r3
            L9:
                r7 = 0
                if (r12 >= r13) goto L7a
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r12 + 2
                if (r8 > r13) goto L28
                java.lang.String r9 = "::"
                r10 = 2
                boolean r9 = r11.regionMatches(r12, r9, r3, r10)
                if (r9 == 0) goto L28
                if (r5 == r2) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                if (r8 != r13) goto L25
                r5 = r4
                goto L7a
            L25:
                r5 = r4
                r6 = r8
                goto L4c
            L28:
                if (r4 == 0) goto L4b
                java.lang.String r8 = ":"
                r9 = 1
                boolean r8 = r11.regionMatches(r12, r8, r3, r9)
                if (r8 == 0) goto L36
                int r12 = r12 + 1
                goto L4b
            L36:
                java.lang.String r8 = "."
                boolean r12 = r11.regionMatches(r12, r8, r3, r9)
                if (r12 == 0) goto L4a
                int r12 = r4 + (-2)
                boolean r11 = decodeIpv4Suffix(r11, r6, r13, r1, r12)
                if (r11 != 0) goto L47
                return r7
            L47:
                int r4 = r4 + 2
                goto L7a
            L4a:
                return r7
            L4b:
                r6 = r12
            L4c:
                r8 = r3
                r12 = r6
            L4e:
                if (r12 >= r13) goto L60
                char r9 = r11.charAt(r12)
                int r9 = neton.HttpUrl.decodeHexDigit(r9)
                if (r9 == r2) goto L60
                int r8 = r8 << 4
                int r8 = r8 + r9
                int r12 = r12 + 1
                goto L4e
            L60:
                int r9 = r12 - r6
                if (r9 == 0) goto L79
                r10 = 4
                if (r9 <= r10) goto L68
                goto L79
            L68:
                int r7 = r4 + 1
                int r9 = r8 >>> 8
                r9 = r9 & 255(0xff, float:3.57E-43)
                byte r9 = (byte) r9
                r1[r4] = r9
                int r4 = r7 + 1
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L79:
                return r7
            L7a:
                if (r4 == r0) goto L8b
                if (r5 != r2) goto L7f
                return r7
            L7f:
                int r11 = r4 - r5
                int r12 = 16 - r11
                java.lang.System.arraycopy(r1, r5, r1, r12, r11)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r3)
            L8b:
                java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
                return r11
            L90:
                java.lang.AssertionError r11 = new java.lang.AssertionError
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: neton.HttpUrl.Builder.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
        }

        private static boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    }
                    i5++;
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            return i4 == i3 + 4;
        }

        private static String inet6AddressToAscii(byte[] bArr) {
            int i = 0;
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            while (i4 < bArr.length) {
                int i5 = i4;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i4;
                if (i6 > i2 && i6 >= 4) {
                    i3 = i4;
                    i2 = i6;
                }
                i4 = i5 + 2;
            }
            Buffer buffer = new Buffer();
            while (i < bArr.length) {
                if (i == i3) {
                    buffer.writeByte(58);
                    i += i2;
                    if (i == 16) {
                        buffer.writeByte(58);
                    }
                } else {
                    if (i > 0) {
                        buffer.writeByte(58);
                    }
                    buffer.writeHexadecimalUnsignedLong(((bArr[i] & 255) << 8) | (bArr[i + 1] & 255));
                    i += 2;
                }
            }
            return buffer.readUtf8();
        }

        private static int parsePort(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(HttpUrl.canonicalize(str, i, i2, "", false, false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String percentDecode(String str, boolean z) {
        return percentDecode(str, 0, str.length(), z);
    }

    private List<String> percentDecode(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? percentDecode(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String percentDecode(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i, i3);
                percentDecode(buffer, str, i3, i2, z);
                return buffer.readUtf8();
            }
        }
        return str.substring(i, i2);
    }

    static void percentDecode(Buffer buffer, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int decodeHexDigit = decodeHexDigit(str.charAt(i + 1));
                int decodeHexDigit2 = decodeHexDigit(str.charAt(i3));
                if (decodeHexDigit != -1 && decodeHexDigit2 != -1) {
                    buffer.writeByte((decodeHexDigit << 4) + decodeHexDigit2);
                    i = i3;
                }
                buffer.writeUtf8CodePoint(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    buffer.writeByte(32);
                }
                buffer.writeUtf8CodePoint(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    static boolean percentEncoded(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && decodeHexDigit(str.charAt(i + 1)) != -1 && decodeHexDigit(str.charAt(i3)) != -1;
    }

    static String canonicalize(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || percentEncoded(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            Buffer buffer = new Buffer();
            buffer.writeUtf8(str, i, i3);
            canonicalize(buffer, str, i3, i2, str2, z, z2, z3, z4);
            return buffer.readUtf8();
        }
        return str.substring(i, i2);
    }

    static void canonicalize(Buffer buffer, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Buffer buffer2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    buffer.writeUtf8(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !percentEncoded(str, i, i2)))))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(codePointAt);
                    while (!buffer2.exhausted()) {
                        int readByte = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        buffer.writeByte((int) HEX_DIGITS[(readByte >> 4) & 15]);
                        buffer.writeByte((int) HEX_DIGITS[readByte & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String canonicalize(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return canonicalize(str, 0, str.length(), str2, z, z2, z3, z4);
    }
}
