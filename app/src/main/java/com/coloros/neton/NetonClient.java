package com.coloros.neton;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import neton.Call;
import neton.Callback;
import neton.Headers;
import neton.MediaType;
import neton.Request;
import neton.RequestBody;
import neton.Response;
import neton.Timeout;
import neton.client.config.ConfigManager;
import neton.client.config.NetonReceiver;
import neton.client.dns.DnsManager;

/* loaded from: classes.dex */
public class NetonClient {
    private static Processor sMProcessor;
    private Context mContext;

    /* synthetic */ NetonClient(C18621 c18621) {
        this();
    }

    /* loaded from: classes.dex */
    public class InstanceHolder {
        static NetonClient ourInstance = new NetonClient();

        private InstanceHolder() {
        }
    }

    public static NetonClient getInstance() {
        return InstanceHolder.ourInstance;
    }

    private NetonClient() {
    }

    public Context getContext() {
        return this.mContext;
    }

    public synchronized void init(Context context) {
        init(context, null);
    }

    public synchronized void init(Context context, NetonConfig netonConfig) {
        NetonException netonException;
        if (this.mContext != null) {
            return;
        }
        try {
            this.mContext = context.getApplicationContext();
            ConfigManager.getInstance().init(this.mContext);
            DnsManager.getInstance().init(this.mContext);
            sMProcessor = new Processor(this.mContext, netonConfig);
        } finally {
        }
    }

    public static Processor getProcessor() {
        checkInit();
        return sMProcessor;
    }

    private static void checkInit() {
        if (sMProcessor == null) {
            throw new NetonException(new IllegalStateException("please init Neton first,or set region code when use http dns"));
        }
    }

    public static Response execute(Request request) {
        checkInit();
        try {
            return sMProcessor.process(request, false);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new NetonException(e2);
        }
    }

    public static void executeAsync(Request request, Callback callback) {
        checkInit();
        try {
            sMProcessor.process(request, callback, false);
        } catch (Exception e) {
            throw new NetonException(e);
        }
    }

    public static Response get(String str) {
        return execute(new Request.Builder().get().url(str).build());
    }

    public static String getString(String str) {
        return execute(new Request.Builder().get().url(str).build()).body().string();
    }

    public static void getAsync(String str, Callback callback) {
        executeAsync(new Request.Builder().url(str).build(), callback);
    }

    public static void getAsync(String str, Timeout timeout, Callback callback) {
        executeAsync(new Request.Builder().timeout(timeout).url(str).build(), callback);
    }

    public static Response post(String str, String str2) {
        return execute(new Request.Builder().post(RequestBody.create(MediaType.parse(MediaType.TEXT_PLAIN), str2)).url(str).build());
    }

    public static Response post(String str, byte[] bArr) {
        return execute(new Request.Builder().post(RequestBody.create(MediaType.parse(MediaType.OCTET_STREAM), bArr)).url(str).build());
    }

    public static void postAsync(String str, String str2, Callback callback) {
        executeAsync(new Request.Builder().post(RequestBody.create(MediaType.parse(MediaType.TEXT_PLAIN), str2)).url(str).build(), callback);
    }

    public static void postAsync(String str, byte[] bArr, Callback callback) {
        executeAsync(new Request.Builder().post(RequestBody.create(MediaType.parse(MediaType.OCTET_STREAM), bArr)).url(str).build(), callback);
    }

    public static void postAsync(String str, String str2, byte[] bArr, Timeout timeout, Callback callback) {
        executeAsync(new Request.Builder().post(RequestBody.create(MediaType.parse(str2), bArr)).timeout(timeout).url(str).build(), callback);
    }

    public static Response post(String str, File file) {
        return execute(new Request.Builder().post(RequestBody.create(MediaType.parse(MediaType.OCTET_STREAM), file)).url(str).build());
    }

    public static void postFileAsync(String str, File file, Timeout timeout, Callback callback) {
        executeAsync(new Request.Builder().post(RequestBody.create(MediaType.parse(MediaType.OCTET_STREAM), file)).timeout(timeout).url(str).build(), callback);
    }

    public static void postFileAsync(String str, Map<String, String> map, Map<String, Object> map2, Timeout timeout, ProgressCallBack progressCallBack) {
        executeAsync(new Request.Builder().post(RequestBody.create(map2, progressCallBack)).headers(Headers.m7840of(map)).timeout(timeout).url(str).build(), new Callback() { // from class: com.coloros.neton.NetonClient.1
            C18621() {
            }

            @Override // neton.Callback
            public final void onFailure(Call call, IOException iOException) {
                ProgressCallBack.this.onFailure(call, iOException);
            }

            @Override // neton.Callback
            public final void onResponse(Call call, Response response) {
                if (!response.isSuccessful()) {
                    ProgressCallBack.this.onFailure(call, new IOException("response is not success!"));
                }
                ProgressCallBack.this.onResponse(call, response);
            }
        });
    }

    /* renamed from: com.coloros.neton.NetonClient$1 */
    /* loaded from: classes.dex */
    final class C18621 implements Callback {
        C18621() {
        }

        @Override // neton.Callback
        public final void onFailure(Call call, IOException iOException) {
            ProgressCallBack.this.onFailure(call, iOException);
        }

        @Override // neton.Callback
        public final void onResponse(Call call, Response response) {
            if (!response.isSuccessful()) {
                ProgressCallBack.this.onFailure(call, new IOException("response is not success!"));
            }
            ProgressCallBack.this.onResponse(call, response);
        }
    }

    /* renamed from: com.coloros.neton.NetonClient$2 */
    /* loaded from: classes.dex */
    final class C18632 implements Callback {
        final /* synthetic */ File val$dstFile;

        C18632(File file) {
            r2 = file;
        }

        @Override // neton.Callback
        public final void onFailure(Call call, IOException iOException) {
            ProgressCallBack.this.onFailure(call, iOException);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[Catch: IOException -> 0x0091, TRY_LEAVE, TryCatch #4 {IOException -> 0x0091, blocks: (B:42:0x008d, B:35:0x0095), top: B:41:0x008d }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // neton.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onResponse(neton.Call r11, neton.Response r12) {
            /*
                r10 = this;
                java.lang.String r0 = "getFileAsync--onResponse start"
                neton.client.Utils.LogUtil.m7844d(r0)
                r0 = 2048(0x800, float:2.87E-42)
                byte[] r0 = new byte[r0]
                r1 = 0
                neton.ResponseBody r2 = r12.body()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L86
                long r2 = r2.contentLength()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L86
                r4 = 0
                neton.ResponseBody r6 = r12.body()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L86
                java.io.InputStream r6 = r6.byteStream()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L86
                java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
                java.io.File r8 = r2     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
                r7.<init>(r8)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                java.lang.String r8 = "getFileAsync--onResponse dstFile:"
                r1.<init>(r8)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                java.io.File r8 = r2     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                r1.append(r8)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                neton.client.Utils.LogUtil.m7844d(r1)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            L36:
                int r1 = r6.read(r0)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                r8 = -1
                if (r1 == r8) goto L62
                long r8 = (long) r1     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                long r4 = r4 + r8
                r8 = 0
                r7.write(r0, r8, r1)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                java.lang.String r9 = "getFileAsync--current:"
                r8.<init>(r9)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                r8.append(r4)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                java.lang.String r9 = ",len:"
                r8.append(r9)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                r8.append(r1)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                neton.client.Utils.LogUtil.m7844d(r1)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                com.coloros.neton.ProgressCallBack r1 = com.coloros.neton.ProgressCallBack.this     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                r1.onProgress(r2, r4)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                goto L36
            L62:
                r7.flush()     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                if (r6 == 0) goto L6d
                r6.close()     // Catch: java.io.IOException -> L6b
                goto L6d
            L6b:
                r10 = move-exception
                goto L76
            L6d:
                r7.close()     // Catch: java.io.IOException -> L6b
                com.coloros.neton.ProgressCallBack r10 = com.coloros.neton.ProgressCallBack.this
                r10.onResponse(r11, r12)
                return
            L76:
                throw r10
            L77:
                r10 = move-exception
                goto L8b
            L79:
                r10 = move-exception
                goto L80
            L7b:
                r10 = move-exception
                r7 = r1
                goto L8b
            L7e:
                r10 = move-exception
                r7 = r1
            L80:
                r1 = r6
                goto L88
            L82:
                r10 = move-exception
                r6 = r1
                r7 = r6
                goto L8b
            L86:
                r10 = move-exception
                r7 = r1
            L88:
                throw r10     // Catch: java.lang.Throwable -> L89
            L89:
                r10 = move-exception
                r6 = r1
            L8b:
                if (r6 == 0) goto L93
                r6.close()     // Catch: java.io.IOException -> L91
                goto L93
            L91:
                r10 = move-exception
                goto L99
            L93:
                if (r7 == 0) goto L9a
                r7.close()     // Catch: java.io.IOException -> L91
                goto L9a
            L99:
                throw r10
            L9a:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.coloros.neton.NetonClient.C18632.onResponse(neton.Call, neton.Response):void");
        }
    }

    public static void getFileAsync(String str, Map<String, String> map, File file, Timeout timeout, ProgressCallBack progressCallBack) {
        executeAsync(new Request.Builder().timeout(timeout).headers(Headers.m7840of(map)).url(str).build(), new Callback() { // from class: com.coloros.neton.NetonClient.2
            final /* synthetic */ File val$dstFile;

            C18632(File file2) {
                r2 = file2;
            }

            @Override // neton.Callback
            public final void onFailure(Call call, IOException iOException) {
                ProgressCallBack.this.onFailure(call, iOException);
            }

            @Override // neton.Callback
            public final void onResponse(Call call, Response response) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    */
                /*
                    this = this;
                    java.lang.String r0 = "getFileAsync--onResponse start"
                    neton.client.Utils.LogUtil.m7844d(r0)
                    r0 = 2048(0x800, float:2.87E-42)
                    byte[] r0 = new byte[r0]
                    r1 = 0
                    neton.ResponseBody r2 = r12.body()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L86
                    long r2 = r2.contentLength()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L86
                    r4 = 0
                    neton.ResponseBody r6 = r12.body()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L86
                    java.io.InputStream r6 = r6.byteStream()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L86
                    java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
                    java.io.File r8 = r2     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
                    r7.<init>(r8)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    java.lang.String r8 = "getFileAsync--onResponse dstFile:"
                    r1.<init>(r8)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    java.io.File r8 = r2     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    r1.append(r8)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    neton.client.Utils.LogUtil.m7844d(r1)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                L36:
                    int r1 = r6.read(r0)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    r8 = -1
                    if (r1 == r8) goto L62
                    long r8 = (long) r1     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    long r4 = r4 + r8
                    r8 = 0
                    r7.write(r0, r8, r1)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    java.lang.String r9 = "getFileAsync--current:"
                    r8.<init>(r9)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    r8.append(r4)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    java.lang.String r9 = ",len:"
                    r8.append(r9)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    r8.append(r1)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    neton.client.Utils.LogUtil.m7844d(r1)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    com.coloros.neton.ProgressCallBack r1 = com.coloros.neton.ProgressCallBack.this     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    r1.onProgress(r2, r4)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    goto L36
                L62:
                    r7.flush()     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
                    if (r6 == 0) goto L6d
                    r6.close()     // Catch: java.io.IOException -> L6b
                    goto L6d
                L6b:
                    r10 = move-exception
                    goto L76
                L6d:
                    r7.close()     // Catch: java.io.IOException -> L6b
                    com.coloros.neton.ProgressCallBack r10 = com.coloros.neton.ProgressCallBack.this
                    r10.onResponse(r11, r12)
                    return
                L76:
                    throw r10
                L77:
                    r10 = move-exception
                    goto L8b
                L79:
                    r10 = move-exception
                    goto L80
                L7b:
                    r10 = move-exception
                    r7 = r1
                    goto L8b
                L7e:
                    r10 = move-exception
                    r7 = r1
                L80:
                    r1 = r6
                    goto L88
                L82:
                    r10 = move-exception
                    r6 = r1
                    r7 = r6
                    goto L8b
                L86:
                    r10 = move-exception
                    r7 = r1
                L88:
                    throw r10     // Catch: java.lang.Throwable -> L89
                L89:
                    r10 = move-exception
                    r6 = r1
                L8b:
                    if (r6 == 0) goto L93
                    r6.close()     // Catch: java.io.IOException -> L91
                    goto L93
                L91:
                    r10 = move-exception
                    goto L99
                L93:
                    if (r7 == 0) goto L9a
                    r7.close()     // Catch: java.io.IOException -> L91
                    goto L9a
                L99:
                    throw r10
                L9a:
                    throw r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.coloros.neton.NetonClient.C18632.onResponse(neton.Call, neton.Response):void");
            }
        });
    }

    public void cancel(Object obj) {
        checkInit();
        sMProcessor.cancel(obj);
    }

    public void close() {
        checkInit();
        sMProcessor.close();
    }

    public void processNetonAction(Intent intent) {
        checkInit();
        NetonReceiver.processNetonAction(this.mContext, intent);
    }
}
