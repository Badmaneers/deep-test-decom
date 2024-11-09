package neton.client.liveon;

import android.content.Context;
import android.text.TextUtils;
import com.coloros.neton.NetonClient;
import com.coloros.neton.NetonException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import neton.HttpUrl;
import neton.Request;
import neton.client.Utils.LogUtil;
import neton.client.Utils.NetHelper;
import neton.client.Utils.ThreadPoolUtil;
import neton.client.config.ConfigManager;
import neton.client.config.Constants;

/* loaded from: classes.dex */
public class LiveOnHttpsManager {
    private static final LiveOnHttpsManager ourInstance = new LiveOnHttpsManager();
    private boolean isStartLiveOn;
    private Map<String, LiveOnHttps> liveOnHttpsMap = new HashMap();

    public static LiveOnHttpsManager getInstance() {
        return ourInstance;
    }

    private LiveOnHttpsManager() {
    }

    public void parseLiveOnHttpsMap(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            LiveOnHttps liveOnHttps = new LiveOnHttps();
            try {
                HttpUrl parse = HttpUrl.parse(entry.getKey());
                if (parse == null) {
                    parse = new HttpUrl.Builder().scheme("https").host(entry.getKey()).port(443).build();
                }
                if (!parse.isHttps()) {
                    parse = parse.newBuilder().scheme("https").build();
                }
                liveOnHttps.setHttpsUrl(parse);
                HttpUrl parse2 = HttpUrl.parse(entry.getValue());
                if (parse2 == null) {
                    parse2 = new HttpUrl.Builder().scheme("http").host(entry.getValue()).port(80).build();
                }
                liveOnHttps.setHttpUrl(parse2);
            } catch (Exception e) {
                LogUtil.m7847e("parseLiveOnHttpsMap--e:" + e.toString());
            }
            if (liveOnHttps.getHttpsUrl() != null && liveOnHttps.getHttpUrl() != null) {
                String key = LiveOnHttps.getKey(liveOnHttps.getHttpsUrl());
                if (!TextUtils.isEmpty(key)) {
                    this.liveOnHttpsMap.put(key, liveOnHttps);
                }
            }
        }
        LogUtil.m7844d("parseLiveOnHttpsMap--liveOnHttpsMap:" + this.liveOnHttpsMap);
    }

    public LiveOnHttps getLiveOnHttps(HttpUrl httpUrl) {
        String key = LiveOnHttps.getKey(httpUrl);
        if (this.liveOnHttpsMap == null || this.liveOnHttpsMap.isEmpty() || TextUtils.isEmpty(key) || !this.liveOnHttpsMap.containsKey(key)) {
            return null;
        }
        return this.liveOnHttpsMap.get(key);
    }

    public void updateLiveOn(Request request, Request request2, boolean z) {
        LiveOnHttps liveOnHttps;
        if (!request.url().isHttps() || (liveOnHttps = getInstance().getLiveOnHttps(request.url())) == null) {
            return;
        }
        if (request2.url().isHttps()) {
            liveOnHttps.setHttpsLiveOn(z);
        } else {
            if (request2.url().isHttps() || z) {
                return;
            }
            liveOnHttps.setHttpsLiveOn(true);
        }
    }

    public synchronized void startLiveOn(Context context) {
        LogUtil.m7844d("startLiveOn--start");
        if (!checkNeedLiveOn(context)) {
            LogUtil.m7844d("startLiveOn--check not need live on");
            return;
        }
        if (this.isStartLiveOn) {
            LogUtil.m7844d("startLiveOn--isStartLiveOn:" + this.isStartLiveOn);
        } else {
            this.isStartLiveOn = true;
            ConfigManager.getInstance().setLongData(Constants.KEY_LAST_LIVE_ON_TIME, Long.valueOf(System.currentTimeMillis()));
            ConfigManager.getInstance().commit();
            ThreadPoolUtil.execute(new Runnable() { // from class: neton.client.liveon.LiveOnHttpsManager.1
                RunnableC25001() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    Iterator it = LiveOnHttpsManager.this.liveOnHttpsMap.entrySet().iterator();
                    while (it.hasNext()) {
                        LiveOnHttps liveOnHttps = (LiveOnHttps) ((Map.Entry) it.next()).getValue();
                        LogUtil.m7844d("startLiveOn--real--liveOnHttps:".concat(String.valueOf(liveOnHttps)));
                        if (!liveOnHttps.isHttpsLiveOn()) {
                            try {
                                if (NetonClient.getProcessor().process(new Request.Builder().url(liveOnHttps.getHttpUrl()).build(), true).isSuccessful()) {
                                    liveOnHttps.setHttpsLiveOn(true);
                                } else {
                                    liveOnHttps.setHttpsLiveOn(false);
                                }
                            } catch (NetonException e) {
                                LogUtil.m7844d("startLiveOn--NetonException:" + e.toString());
                            } catch (IOException e2) {
                                LogUtil.m7844d("startLiveOn--IOException:" + e2.toString());
                            } catch (Exception e3) {
                                LogUtil.m7844d("startLiveOn--Exception:" + e3.toString());
                            }
                        }
                    }
                    LiveOnHttpsManager.this.isStartLiveOn = false;
                }
            });
        }
    }

    /* renamed from: neton.client.liveon.LiveOnHttpsManager$1 */
    /* loaded from: classes.dex */
    class RunnableC25001 implements Runnable {
        RunnableC25001() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = LiveOnHttpsManager.this.liveOnHttpsMap.entrySet().iterator();
            while (it.hasNext()) {
                LiveOnHttps liveOnHttps = (LiveOnHttps) ((Map.Entry) it.next()).getValue();
                LogUtil.m7844d("startLiveOn--real--liveOnHttps:".concat(String.valueOf(liveOnHttps)));
                if (!liveOnHttps.isHttpsLiveOn()) {
                    try {
                        if (NetonClient.getProcessor().process(new Request.Builder().url(liveOnHttps.getHttpUrl()).build(), true).isSuccessful()) {
                            liveOnHttps.setHttpsLiveOn(true);
                        } else {
                            liveOnHttps.setHttpsLiveOn(false);
                        }
                    } catch (NetonException e) {
                        LogUtil.m7844d("startLiveOn--NetonException:" + e.toString());
                    } catch (IOException e2) {
                        LogUtil.m7844d("startLiveOn--IOException:" + e2.toString());
                    } catch (Exception e3) {
                        LogUtil.m7844d("startLiveOn--Exception:" + e3.toString());
                    }
                }
            }
            LiveOnHttpsManager.this.isStartLiveOn = false;
        }
    }

    private boolean checkNeedLiveOn(Context context) {
        if (this.liveOnHttpsMap == null || this.liveOnHttpsMap.isEmpty() || !NetHelper.isConnectNet(context)) {
            return false;
        }
        long longValue = ConfigManager.getInstance().getLongData(Constants.KEY_LAST_LIVE_ON_TIME).longValue();
        long longValue2 = ConfigManager.getInstance().getLongData(Constants.KEY_LIVE_ON_TIME, Long.valueOf(Constants.DEFAULT_LIVE_ON_TIME)).longValue();
        boolean z = System.currentTimeMillis() - longValue > longValue2;
        LogUtil.m7844d("startLiveOn--" + this.liveOnHttpsMap + ",lastTime:" + longValue + ",liveOnTime:" + longValue2 + ",needLiveOn:" + z);
        return z;
    }
}
