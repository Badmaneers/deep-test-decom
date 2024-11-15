package neton.client.config;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class Constants {
    public static final String ACTION_ROM_UPDATED = "oppo.intent.action.ROM_UPDATE_CONFIG_SUCCESS";
    public static final String DEFAULT_CONFIG = "{\n\"version\":\"1.0.3\",\n\"http_dns\":\"\",\n\"foreign_http_dns\":\"\",\n\"encypt_version\":\"1\",\n\"encypt_secret\":\"defalut.netton.client.secret\",\n\"trace_hit\":100000,\n\"session_timeout\":604800,\n\"session_cache_size\":0,\n\"dns_mode\":1,\n\"retry_times\":1,\n\"live_on_time\":600000,\n\"retry_interval_time\":0,\n\"trace_url\":\"https://c.snake.oppomobile.com\",\n\"foreign_trace_url\":\"https://g.snake.oppomobile.com\",\n\"http_last_dns\":\"https://api.dns.oppomobile.com\",\n\"foreign_http_last_dns\":\"https://api.dns.oppomobile.com\"\n}";
    public static final int DEFAULT_DNS_MODE = 1;
    public static String DEFAULT_ENCYPT_VERSION = "1";
    public static final long DEFAULT_LIVE_ON_TIME = 600000;
    public static final long DEFAULT_RETRY_INTERVAL_TIME = 0;
    public static final int DEFAULT_RETRY_TIMES = 1;
    public static final int DEFAULT_SESSION_CACHE_SIZE = 0;
    public static final int DEFAULT_SESSION_TIMEOUT = 604800;
    public static final int DEFAULT_TRACE_HIT = 100000;
    public static String DEFAULT_VERSION = "1.0.0";
    public static final String KEY_CLINET_ID = "clientID";
    public static final String KEY_CLINET_ID_MODIFY_TIME = "clientID_modify_time";
    public static final String KEY_CONFIG_LIST = "ROM_UPDATE_CONFIG_LIST";
    public static final String KEY_DNS_MODE = "dns_mode";
    public static final String KEY_ENCRYPT_HEADER = "encrypt_header";
    public static final String KEY_ENCYPT_SECRET = "encypt_secret";
    public static final String KEY_ENCYPT_VERSION = "encypt_version";
    public static final String KEY_FOREIGN_HTTP_DNS_LIST = "foreign_http_dns";
    public static final String KEY_FOREIGN_HTTP_LAST_DNS = "foreign_http_last_dns";
    public static final String KEY_FOREIGN_TRACE_URL = "foreign_trace_url";
    public static final String KEY_HEADER = "header";
    public static final String KEY_HEADER_SET = "OPPO_SET";
    public static final String KEY_HTTP_DNS_LIST = "http_dns";
    public static final String KEY_HTTP_LAST_DNS = "http_last_dns";
    public static final String KEY_LAST_LIVE_ON_TIME = "last_live_on_time";
    public static final String KEY_LIVE_ON_TIME = "live_on_time";
    public static final String KEY_MODE = "mode";
    public static final String KEY_REGIONCODE = "regionCode";
    public static final String KEY_RETRY_INTERVAL_TIME = "retry_interval_time";
    public static final String KEY_RETRY_TIMES = "retry_times";
    public static final String KEY_SESSION_CACHE_SIZE = "session_cache_size";
    public static final String KEY_SESSION_TIMEOUT = "session_timeout";
    public static final String KEY_TRACE_HIT = "trace_hit";
    public static final String KEY_TRACE_URL = "trace_url";
    public static final String KEY_VERSION = "version";
    public static final String NETTON_STATUS = "netton_status";
    public static final byte PROTOCOL_VERSION = 32;
    public static final String ROMUPDATE_NETON_FILTER = "NETON_CONFIG";
    public static final String SPLITER = ";";
    public static final String TRACE_LEVEL_12 = "1.2";
    public static byte[] DEFAULT_ENCYPT_SECRET = "netton.client.st".getBytes(Charset.defaultCharset());
    public static String[] DEFAULT_HTTP_DNS_LIST = new String[0];
    public static String DEFAULT_HTTP_LAST_DNS = "https://api.dns.oppomobile.com";
    public static String DEFAULT_TRACE_URL = "https://c.snake.oppomobile.com";
    public static String DEFAULT_TEST_TRACE_URL = "https://183.131.22.114:8090";
    public static String DEFAULT_FOREIGN_TRACE_URL = "https://g.snake.oppomobile.com";
    public static String DEFAULT_FOREIGN_HTTP_LAST_DNS = "https://api.dns.oppomobile.com";
    public static String[] DEFAULT_FOREIGN_HTTP_DNS_LIST = new String[0];
}
