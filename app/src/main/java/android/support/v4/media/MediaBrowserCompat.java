package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompatApi21;
import android.support.v4.media.MediaBrowserCompatApi23;
import android.support.v4.media.MediaBrowserCompatApi26;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0410h;
import androidx.media.C0773d;
import androidx.p011b.C0318a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    private final MediaBrowserImpl mImpl;
    static final String TAG = "MediaBrowserCompat";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);

    /* loaded from: classes.dex */
    public abstract class CustomActionCallback {
        public void onError(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onResult(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface MediaBrowserImpl {
        void connect();

        void disconnect();

        Bundle getExtras();

        void getItem(String str, ItemCallback itemCallback);

        Bundle getNotifyChildrenChangedOptions();

        String getRoot();

        ComponentName getServiceComponent();

        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(String str, Bundle bundle, SearchCallback searchCallback);

        void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback);

        void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

        void unsubscribe(String str, SubscriptionCallback subscriptionCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(Messenger messenger);

        void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* loaded from: classes.dex */
    public abstract class SearchCallback {
        public void onError(String str, Bundle bundle) {
        }

        public void onSearchResult(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mImpl = new MediaBrowserImplApi26(context, componentName, connectionCallback, bundle);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.mImpl = new MediaBrowserImplApi23(context, componentName, connectionCallback, bundle);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.mImpl = new MediaBrowserImplApi21(context, componentName, connectionCallback, bundle);
        } else {
            this.mImpl = new MediaBrowserImplBase(context, componentName, connectionCallback, bundle);
        }
    }

    public final void connect() {
        this.mImpl.connect();
    }

    public final void disconnect() {
        this.mImpl.disconnect();
    }

    public final boolean isConnected() {
        return this.mImpl.isConnected();
    }

    public final ComponentName getServiceComponent() {
        return this.mImpl.getServiceComponent();
    }

    public final String getRoot() {
        return this.mImpl.getRoot();
    }

    public final Bundle getExtras() {
        return this.mImpl.getExtras();
    }

    public final MediaSessionCompat.Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public final void subscribe(String str, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.mImpl.subscribe(str, null, subscriptionCallback);
    }

    public final void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options are null");
        }
        this.mImpl.subscribe(str, bundle, subscriptionCallback);
    }

    public final void unsubscribe(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.mImpl.unsubscribe(str, null);
    }

    public final void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.mImpl.unsubscribe(str, subscriptionCallback);
    }

    public final void getItem(String str, ItemCallback itemCallback) {
        this.mImpl.getItem(str, itemCallback);
    }

    public final void search(String str, Bundle bundle, SearchCallback searchCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        if (searchCallback == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        this.mImpl.search(str, bundle, searchCallback);
    }

    public final void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("action cannot be empty");
        }
        this.mImpl.sendCustomAction(str, bundle, customActionCallback);
    }

    public final Bundle getNotifyChildrenChangedOptions() {
        return this.mImpl.getNotifyChildrenChangedOptions();
    }

    /* loaded from: classes.dex */
    public class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            C00191() {
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface Flags {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static MediaItem fromMediaItem(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.fromMediaDescription(MediaBrowserCompatApi21.MediaItem.getDescription(obj)), MediaBrowserCompatApi21.MediaItem.getFlags(obj));
        }

        public static List<MediaItem> fromMediaItemList(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromMediaItem(it.next()));
            }
            return arrayList;
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.mFlags = i;
            this.mDescription = mediaDescriptionCompat;
        }

        MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$1 */
        /* loaded from: classes.dex */
        final class C00191 implements Parcelable.Creator<MediaItem> {
            C00191() {
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public int getFlags() {
            return this.mFlags;
        }

        public boolean isBrowsable() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.mFlags & 2) != 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public String getMediaId() {
            return this.mDescription.getMediaId();
        }
    }

    /* loaded from: classes.dex */
    public class ConnectionCallback {
        ConnectionCallbackInternal mConnectionCallbackInternal;
        final Object mConnectionCallbackObj;

        /* loaded from: classes.dex */
        public interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        public ConnectionCallback() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.mConnectionCallbackObj = MediaBrowserCompatApi21.createConnectionCallback(new StubApi21());
            } else {
                this.mConnectionCallbackObj = null;
            }
        }

        void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
            this.mConnectionCallbackInternal = connectionCallbackInternal;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class StubApi21 implements MediaBrowserCompatApi21.ConnectionCallback {
            StubApi21() {
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnected() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnected();
                }
                ConnectionCallback.this.onConnected();
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnectionSuspended() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnectionSuspended();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnectionFailed() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnectionFailed();
                }
                ConnectionCallback.this.onConnectionFailed();
            }
        }
    }

    /* loaded from: classes.dex */
    public abstract class SubscriptionCallback {
        final Object mSubscriptionCallbackObj;
        WeakReference<Subscription> mSubscriptionRef;
        final IBinder mToken = new Binder();

        public void onChildrenLoaded(String str, List<MediaItem> list) {
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void onError(String str) {
        }

        public void onError(String str, Bundle bundle) {
        }

        public SubscriptionCallback() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mSubscriptionCallbackObj = MediaBrowserCompatApi26.createSubscriptionCallback(new StubApi26());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.mSubscriptionCallbackObj = MediaBrowserCompatApi21.createSubscriptionCallback(new StubApi21());
            } else {
                this.mSubscriptionCallbackObj = null;
            }
        }

        void setSubscription(Subscription subscription) {
            this.mSubscriptionRef = new WeakReference<>(subscription);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class StubApi21 implements MediaBrowserCompatApi21.SubscriptionCallback {
            StubApi21() {
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback
            public void onChildrenLoaded(String str, List<?> list) {
                Subscription subscription = SubscriptionCallback.this.mSubscriptionRef == null ? null : SubscriptionCallback.this.mSubscriptionRef.get();
                if (subscription == null) {
                    SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));
                    return;
                }
                List<MediaItem> fromMediaItemList = MediaItem.fromMediaItemList(list);
                List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                List<Bundle> optionsList = subscription.getOptionsList();
                for (int i = 0; i < callbacks.size(); i++) {
                    Bundle bundle = optionsList.get(i);
                    if (bundle == null) {
                        SubscriptionCallback.this.onChildrenLoaded(str, fromMediaItemList);
                    } else {
                        SubscriptionCallback.this.onChildrenLoaded(str, applyOptions(fromMediaItemList, bundle), bundle);
                    }
                }
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback
            public void onError(String str) {
                SubscriptionCallback.this.onError(str);
            }

            List<MediaItem> applyOptions(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 <= 0 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }
        }

        /* loaded from: classes.dex */
        class StubApi26 extends StubApi21 implements MediaBrowserCompatApi26.SubscriptionCallback {
            StubApi26() {
                super();
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallback
            public void onChildrenLoaded(String str, List<?> list, Bundle bundle) {
                SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), bundle);
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                SubscriptionCallback.this.onError(str, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    public abstract class ItemCallback {
        final Object mItemCallbackObj;

        public void onError(String str) {
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }

        public ItemCallback() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.mItemCallbackObj = MediaBrowserCompatApi23.createItemCallback(new StubApi23());
            } else {
                this.mItemCallbackObj = null;
            }
        }

        /* loaded from: classes.dex */
        class StubApi23 implements MediaBrowserCompatApi23.ItemCallback {
            StubApi23() {
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi23.ItemCallback
            public void onItemLoaded(Parcel parcel) {
                if (parcel == null) {
                    ItemCallback.this.onItemLoaded(null);
                    return;
                }
                parcel.setDataPosition(0);
                MediaItem createFromParcel = MediaItem.CREATOR.createFromParcel(parcel);
                parcel.recycle();
                ItemCallback.this.onItemLoaded(createFromParcel);
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi23.ItemCallback
            public void onError(String str) {
                ItemCallback.this.onError(str);
            }
        }
    }

    /* loaded from: classes.dex */
    public class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        static final int CONNECT_STATE_CONNECTED = 3;
        static final int CONNECT_STATE_CONNECTING = 2;
        static final int CONNECT_STATE_DISCONNECTED = 1;
        static final int CONNECT_STATE_DISCONNECTING = 0;
        static final int CONNECT_STATE_SUSPENDED = 4;
        final ConnectionCallback mCallback;
        Messenger mCallbacksMessenger;
        final Context mContext;
        private Bundle mExtras;
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        final Bundle mRootHints;
        private String mRootId;
        ServiceBinderWrapper mServiceBinderWrapper;
        final ComponentName mServiceComponent;
        MediaServiceConnection mServiceConnection;
        final CallbackHandler mHandler = new CallbackHandler(this);
        private final C0318a<String, Subscription> mSubscriptions = new C0318a<>();
        int mState = 1;

        public MediaBrowserImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (connectionCallback == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            }
            this.mContext = context;
            this.mServiceComponent = componentName;
            this.mCallback = connectionCallback;
            this.mRootHints = bundle == null ? null : new Bundle(bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            if (this.mState != 0 && this.mState != 1) {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + getStateLabel(this.mState) + ")");
            }
            this.mState = 2;
            this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.1
                RunnableC00111() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    if (MediaBrowserImplBase.this.mState == 0) {
                        return;
                    }
                    MediaBrowserImplBase.this.mState = 2;
                    if (MediaBrowserCompat.DEBUG && MediaBrowserImplBase.this.mServiceConnection != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + MediaBrowserImplBase.this.mServiceConnection);
                    }
                    if (MediaBrowserImplBase.this.mServiceBinderWrapper != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + MediaBrowserImplBase.this.mServiceBinderWrapper);
                    }
                    if (MediaBrowserImplBase.this.mCallbacksMessenger != null) {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + MediaBrowserImplBase.this.mCallbacksMessenger);
                    }
                    Intent intent = new Intent("android.media.browse.MediaBrowserService");
                    intent.setComponent(MediaBrowserImplBase.this.mServiceComponent);
                    MediaBrowserImplBase.this.mServiceConnection = new MediaServiceConnection();
                    try {
                        z = MediaBrowserImplBase.this.mContext.bindService(intent, MediaBrowserImplBase.this.mServiceConnection, 1);
                    } catch (Exception unused) {
                        Log.e(MediaBrowserCompat.TAG, "Failed binding to service " + MediaBrowserImplBase.this.mServiceComponent);
                        z = false;
                    }
                    if (!z) {
                        MediaBrowserImplBase.this.forceCloseConnection();
                        MediaBrowserImplBase.this.mCallback.onConnectionFailed();
                    }
                    if (MediaBrowserCompat.DEBUG) {
                        Log.d(MediaBrowserCompat.TAG, "connect...");
                        MediaBrowserImplBase.this.dump();
                    }
                }
            });
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$1 */
        /* loaded from: classes.dex */
        class RunnableC00111 implements Runnable {
            RunnableC00111() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MediaBrowserImplBase.this.mState == 0) {
                    return;
                }
                MediaBrowserImplBase.this.mState = 2;
                if (MediaBrowserCompat.DEBUG && MediaBrowserImplBase.this.mServiceConnection != null) {
                    throw new RuntimeException("mServiceConnection should be null. Instead it is " + MediaBrowserImplBase.this.mServiceConnection);
                }
                if (MediaBrowserImplBase.this.mServiceBinderWrapper != null) {
                    throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + MediaBrowserImplBase.this.mServiceBinderWrapper);
                }
                if (MediaBrowserImplBase.this.mCallbacksMessenger != null) {
                    throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + MediaBrowserImplBase.this.mCallbacksMessenger);
                }
                Intent intent = new Intent("android.media.browse.MediaBrowserService");
                intent.setComponent(MediaBrowserImplBase.this.mServiceComponent);
                MediaBrowserImplBase.this.mServiceConnection = new MediaServiceConnection();
                try {
                    z = MediaBrowserImplBase.this.mContext.bindService(intent, MediaBrowserImplBase.this.mServiceConnection, 1);
                } catch (Exception unused) {
                    Log.e(MediaBrowserCompat.TAG, "Failed binding to service " + MediaBrowserImplBase.this.mServiceComponent);
                    z = false;
                }
                if (!z) {
                    MediaBrowserImplBase.this.forceCloseConnection();
                    MediaBrowserImplBase.this.mCallback.onConnectionFailed();
                }
                if (MediaBrowserCompat.DEBUG) {
                    Log.d(MediaBrowserCompat.TAG, "connect...");
                    MediaBrowserImplBase.this.dump();
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$2 */
        /* loaded from: classes.dex */
        class RunnableC00122 implements Runnable {
            RunnableC00122() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MediaBrowserImplBase.this.mCallbacksMessenger != null) {
                    try {
                        MediaBrowserImplBase.this.mServiceBinderWrapper.disconnect(MediaBrowserImplBase.this.mCallbacksMessenger);
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserCompat.TAG, "RemoteException during connect for " + MediaBrowserImplBase.this.mServiceComponent);
                    }
                }
                int i = MediaBrowserImplBase.this.mState;
                MediaBrowserImplBase.this.forceCloseConnection();
                if (i != 0) {
                    MediaBrowserImplBase.this.mState = i;
                }
                if (MediaBrowserCompat.DEBUG) {
                    Log.d(MediaBrowserCompat.TAG, "disconnect...");
                    MediaBrowserImplBase.this.dump();
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            this.mState = 0;
            this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.2
                RunnableC00122() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserImplBase.this.mCallbacksMessenger != null) {
                        try {
                            MediaBrowserImplBase.this.mServiceBinderWrapper.disconnect(MediaBrowserImplBase.this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
                            Log.w(MediaBrowserCompat.TAG, "RemoteException during connect for " + MediaBrowserImplBase.this.mServiceComponent);
                        }
                    }
                    int i = MediaBrowserImplBase.this.mState;
                    MediaBrowserImplBase.this.forceCloseConnection();
                    if (i != 0) {
                        MediaBrowserImplBase.this.mState = i;
                    }
                    if (MediaBrowserCompat.DEBUG) {
                        Log.d(MediaBrowserCompat.TAG, "disconnect...");
                        MediaBrowserImplBase.this.dump();
                    }
                }
            });
        }

        void forceCloseConnection() {
            if (this.mServiceConnection != null) {
                this.mContext.unbindService(this.mServiceConnection);
            }
            this.mState = 1;
            this.mServiceConnection = null;
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mHandler.setCallbacksMessenger(null);
            this.mRootId = null;
            this.mMediaSessionToken = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            return this.mState == 3;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
            if (!isConnected()) {
                throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.mState + ")");
            }
            return this.mServiceComponent;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public String getRoot() {
            if (!isConnected()) {
                throw new IllegalStateException("getRoot() called while not connected(state=" + getStateLabel(this.mState) + ")");
            }
            return this.mRootId;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getExtras() {
            if (!isConnected()) {
                throw new IllegalStateException("getExtras() called while not connected (state=" + getStateLabel(this.mState) + ")");
            }
            return this.mExtras;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
            if (!isConnected()) {
                throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.mState + ")");
            }
            return this.mMediaSessionToken;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.mSubscriptions.put(str, subscription);
            }
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            subscription.putCallback(bundle2, subscriptionCallback);
            if (isConnected()) {
                try {
                    this.mServiceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.TAG, "addSubscription failed with RemoteException parentId=".concat(String.valueOf(str)));
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription == null) {
                return;
            }
            try {
                if (subscriptionCallback == null) {
                    if (isConnected()) {
                        this.mServiceBinderWrapper.removeSubscription(str, null, this.mCallbacksMessenger);
                    }
                } else {
                    List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                    List<Bundle> optionsList = subscription.getOptionsList();
                    for (int size = callbacks.size() - 1; size >= 0; size--) {
                        if (callbacks.get(size) == subscriptionCallback) {
                            if (isConnected()) {
                                this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);
                            }
                            callbacks.remove(size);
                            optionsList.remove(size);
                        }
                    }
                }
            } catch (RemoteException unused) {
                Log.d(MediaBrowserCompat.TAG, "removeSubscription failed with RemoteException parentId=".concat(String.valueOf(str)));
            }
            if (subscription.isEmpty() || subscriptionCallback == null) {
                this.mSubscriptions.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(String str, ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!isConnected()) {
                Log.i(MediaBrowserCompat.TAG, "Not connected, unable to retrieve the MediaItem.");
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.3
                    final /* synthetic */ ItemCallback val$cb;
                    final /* synthetic */ String val$mediaId;

                    RunnableC00133(ItemCallback itemCallback2, String str2) {
                        r2 = itemCallback2;
                        r3 = str2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onError(r3);
                    }
                });
                return;
            }
            try {
                this.mServiceBinderWrapper.getMediaItem(str2, new ItemReceiver(str2, itemCallback2, this.mHandler), this.mCallbacksMessenger);
            } catch (RemoteException unused) {
                Log.i(MediaBrowserCompat.TAG, "Remote error getting media item: ".concat(String.valueOf(str2)));
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.4
                    final /* synthetic */ ItemCallback val$cb;
                    final /* synthetic */ String val$mediaId;

                    RunnableC00144(ItemCallback itemCallback2, String str2) {
                        r2 = itemCallback2;
                        r3 = str2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onError(r3);
                    }
                });
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$3 */
        /* loaded from: classes.dex */
        class RunnableC00133 implements Runnable {
            final /* synthetic */ ItemCallback val$cb;
            final /* synthetic */ String val$mediaId;

            RunnableC00133(ItemCallback itemCallback2, String str2) {
                r2 = itemCallback2;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onError(r3);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$4 */
        /* loaded from: classes.dex */
        class RunnableC00144 implements Runnable {
            final /* synthetic */ ItemCallback val$cb;
            final /* synthetic */ String val$mediaId;

            RunnableC00144(ItemCallback itemCallback2, String str2) {
                r2 = itemCallback2;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onError(r3);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(String str, Bundle bundle, SearchCallback searchCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected (state=" + getStateLabel(this.mState) + ")");
            }
            try {
                this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);
            } catch (RemoteException e) {
                Log.i(MediaBrowserCompat.TAG, "Remote error searching items with query: ".concat(String.valueOf(str)), e);
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.5
                    final /* synthetic */ SearchCallback val$callback;
                    final /* synthetic */ Bundle val$extras;
                    final /* synthetic */ String val$query;

                    RunnableC00155(SearchCallback searchCallback2, String str2, Bundle bundle2) {
                        r2 = searchCallback2;
                        r3 = str2;
                        r4 = bundle2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onError(r3, r4);
                    }
                });
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$5 */
        /* loaded from: classes.dex */
        class RunnableC00155 implements Runnable {
            final /* synthetic */ SearchCallback val$callback;
            final /* synthetic */ Bundle val$extras;
            final /* synthetic */ String val$query;

            RunnableC00155(SearchCallback searchCallback2, String str2, Bundle bundle2) {
                r2 = searchCallback2;
                r3 = str2;
                r4 = bundle2;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onError(r3, r4);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
            try {
                this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);
            } catch (RemoteException e) {
                Log.i(MediaBrowserCompat.TAG, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e);
                if (customActionCallback != null) {
                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.6
                        final /* synthetic */ String val$action;
                        final /* synthetic */ CustomActionCallback val$callback;
                        final /* synthetic */ Bundle val$extras;

                        RunnableC00166(CustomActionCallback customActionCallback2, String str2, Bundle bundle2) {
                            r2 = customActionCallback2;
                            r3 = str2;
                            r4 = bundle2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            r2.onError(r3, r4, null);
                        }
                    });
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$6 */
        /* loaded from: classes.dex */
        class RunnableC00166 implements Runnable {
            final /* synthetic */ String val$action;
            final /* synthetic */ CustomActionCallback val$callback;
            final /* synthetic */ Bundle val$extras;

            RunnableC00166(CustomActionCallback customActionCallback2, String str2, Bundle bundle2) {
                r2 = customActionCallback2;
                r3 = str2;
                r4 = bundle2;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onError(r3, r4, null);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (isCurrent(messenger, "onConnect")) {
                if (this.mState != 2) {
                    Log.w(MediaBrowserCompat.TAG, "onConnect from service while mState=" + getStateLabel(this.mState) + "... ignoring");
                    return;
                }
                this.mRootId = str;
                this.mMediaSessionToken = token;
                this.mExtras = bundle;
                this.mState = 3;
                if (MediaBrowserCompat.DEBUG) {
                    Log.d(MediaBrowserCompat.TAG, "ServiceCallbacks.onConnect...");
                    dump();
                }
                this.mCallback.onConnected();
                try {
                    for (Map.Entry<String, Subscription> entry : this.mSubscriptions.entrySet()) {
                        String key = entry.getKey();
                        Subscription value = entry.getValue();
                        List<SubscriptionCallback> callbacks = value.getCallbacks();
                        List<Bundle> optionsList = value.getOptionsList();
                        for (int i = 0; i < callbacks.size(); i++) {
                            this.mServiceBinderWrapper.addSubscription(key, callbacks.get(i).mToken, optionsList.get(i), this.mCallbacksMessenger);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.TAG, "addSubscription failed with RemoteException.");
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
            Log.e(MediaBrowserCompat.TAG, "onConnectFailed for " + this.mServiceComponent);
            if (isCurrent(messenger, "onConnectFailed")) {
                if (this.mState != 2) {
                    Log.w(MediaBrowserCompat.TAG, "onConnect from service while mState=" + getStateLabel(this.mState) + "... ignoring");
                    return;
                }
                forceCloseConnection();
                this.mCallback.onConnectionFailed();
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (isCurrent(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.DEBUG) {
                    Log.d(MediaBrowserCompat.TAG, "onLoadChildren for " + this.mServiceComponent + " id=" + str);
                }
                Subscription subscription = this.mSubscriptions.get(str);
                if (subscription == null) {
                    if (MediaBrowserCompat.DEBUG) {
                        Log.d(MediaBrowserCompat.TAG, "onLoadChildren for id that isn't subscribed id=".concat(String.valueOf(str)));
                        return;
                    }
                    return;
                }
                SubscriptionCallback callback = subscription.getCallback(bundle);
                if (callback != null) {
                    if (bundle == null) {
                        if (list == null) {
                            callback.onError(str);
                            return;
                        }
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list);
                        this.mNotifyChildrenChangedOptions = null;
                        return;
                    }
                    if (list == null) {
                        callback.onError(str, bundle);
                        return;
                    }
                    this.mNotifyChildrenChangedOptions = bundle2;
                    callback.onChildrenLoaded(str, list, bundle);
                    this.mNotifyChildrenChangedOptions = null;
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
            return this.mNotifyChildrenChangedOptions;
        }

        private static String getStateLabel(int i) {
            switch (i) {
                case 0:
                    return "CONNECT_STATE_DISCONNECTING";
                case 1:
                    return "CONNECT_STATE_DISCONNECTED";
                case 2:
                    return "CONNECT_STATE_CONNECTING";
                case 3:
                    return "CONNECT_STATE_CONNECTED";
                case 4:
                    return "CONNECT_STATE_SUSPENDED";
                default:
                    return "UNKNOWN/".concat(String.valueOf(i));
            }
        }

        private boolean isCurrent(Messenger messenger, String str) {
            if (this.mCallbacksMessenger == messenger && this.mState != 0 && this.mState != 1) {
                return true;
            }
            if (this.mState == 0 || this.mState == 1) {
                return false;
            }
            Log.i(MediaBrowserCompat.TAG, str + " for " + this.mServiceComponent + " with mCallbacksMessenger=" + this.mCallbacksMessenger + " this=" + this);
            return false;
        }

        void dump() {
            Log.d(MediaBrowserCompat.TAG, "MediaBrowserCompat...");
            Log.d(MediaBrowserCompat.TAG, "  mServiceComponent=" + this.mServiceComponent);
            Log.d(MediaBrowserCompat.TAG, "  mCallback=" + this.mCallback);
            Log.d(MediaBrowserCompat.TAG, "  mRootHints=" + this.mRootHints);
            Log.d(MediaBrowserCompat.TAG, "  mState=" + getStateLabel(this.mState));
            Log.d(MediaBrowserCompat.TAG, "  mServiceConnection=" + this.mServiceConnection);
            Log.d(MediaBrowserCompat.TAG, "  mServiceBinderWrapper=" + this.mServiceBinderWrapper);
            Log.d(MediaBrowserCompat.TAG, "  mCallbacksMessenger=" + this.mCallbacksMessenger);
            Log.d(MediaBrowserCompat.TAG, "  mRootId=" + this.mRootId);
            Log.d(MediaBrowserCompat.TAG, "  mMediaSessionToken=" + this.mMediaSessionToken);
        }

        /* loaded from: classes.dex */
        public class MediaServiceConnection implements ServiceConnection {
            MediaServiceConnection() {
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1 */
            /* loaded from: classes.dex */
            class RunnableC00171 implements Runnable {
                final /* synthetic */ IBinder val$binder;
                final /* synthetic */ ComponentName val$name;

                RunnableC00171(ComponentName componentName, IBinder iBinder) {
                    r2 = componentName;
                    r3 = iBinder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.DEBUG) {
                        Log.d(MediaBrowserCompat.TAG, "MediaServiceConnection.onServiceConnected name=" + r2 + " binder=" + r3);
                        MediaBrowserImplBase.this.dump();
                    }
                    if (MediaServiceConnection.this.isCurrent("onServiceConnected")) {
                        MediaBrowserImplBase.this.mServiceBinderWrapper = new ServiceBinderWrapper(r3, MediaBrowserImplBase.this.mRootHints);
                        MediaBrowserImplBase.this.mCallbacksMessenger = new Messenger(MediaBrowserImplBase.this.mHandler);
                        MediaBrowserImplBase.this.mHandler.setCallbacksMessenger(MediaBrowserImplBase.this.mCallbacksMessenger);
                        MediaBrowserImplBase.this.mState = 2;
                        try {
                            if (MediaBrowserCompat.DEBUG) {
                                Log.d(MediaBrowserCompat.TAG, "ServiceCallbacks.onConnect...");
                                MediaBrowserImplBase.this.dump();
                            }
                            MediaBrowserImplBase.this.mServiceBinderWrapper.connect(MediaBrowserImplBase.this.mContext, MediaBrowserImplBase.this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
                            Log.w(MediaBrowserCompat.TAG, "RemoteException during connect for " + MediaBrowserImplBase.this.mServiceComponent);
                            if (MediaBrowserCompat.DEBUG) {
                                Log.d(MediaBrowserCompat.TAG, "ServiceCallbacks.onConnect...");
                                MediaBrowserImplBase.this.dump();
                            }
                        }
                    }
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.1
                    final /* synthetic */ IBinder val$binder;
                    final /* synthetic */ ComponentName val$name;

                    RunnableC00171(ComponentName componentName2, IBinder iBinder2) {
                        r2 = componentName2;
                        r3 = iBinder2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (MediaBrowserCompat.DEBUG) {
                            Log.d(MediaBrowserCompat.TAG, "MediaServiceConnection.onServiceConnected name=" + r2 + " binder=" + r3);
                            MediaBrowserImplBase.this.dump();
                        }
                        if (MediaServiceConnection.this.isCurrent("onServiceConnected")) {
                            MediaBrowserImplBase.this.mServiceBinderWrapper = new ServiceBinderWrapper(r3, MediaBrowserImplBase.this.mRootHints);
                            MediaBrowserImplBase.this.mCallbacksMessenger = new Messenger(MediaBrowserImplBase.this.mHandler);
                            MediaBrowserImplBase.this.mHandler.setCallbacksMessenger(MediaBrowserImplBase.this.mCallbacksMessenger);
                            MediaBrowserImplBase.this.mState = 2;
                            try {
                                if (MediaBrowserCompat.DEBUG) {
                                    Log.d(MediaBrowserCompat.TAG, "ServiceCallbacks.onConnect...");
                                    MediaBrowserImplBase.this.dump();
                                }
                                MediaBrowserImplBase.this.mServiceBinderWrapper.connect(MediaBrowserImplBase.this.mContext, MediaBrowserImplBase.this.mCallbacksMessenger);
                            } catch (RemoteException unused) {
                                Log.w(MediaBrowserCompat.TAG, "RemoteException during connect for " + MediaBrowserImplBase.this.mServiceComponent);
                                if (MediaBrowserCompat.DEBUG) {
                                    Log.d(MediaBrowserCompat.TAG, "ServiceCallbacks.onConnect...");
                                    MediaBrowserImplBase.this.dump();
                                }
                            }
                        }
                    }
                });
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2 */
            /* loaded from: classes.dex */
            class RunnableC00182 implements Runnable {
                final /* synthetic */ ComponentName val$name;

                RunnableC00182(ComponentName componentName) {
                    r2 = componentName;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.DEBUG) {
                        Log.d(MediaBrowserCompat.TAG, "MediaServiceConnection.onServiceDisconnected name=" + r2 + " this=" + this + " mServiceConnection=" + MediaBrowserImplBase.this.mServiceConnection);
                        MediaBrowserImplBase.this.dump();
                    }
                    if (MediaServiceConnection.this.isCurrent("onServiceDisconnected")) {
                        MediaBrowserImplBase.this.mServiceBinderWrapper = null;
                        MediaBrowserImplBase.this.mCallbacksMessenger = null;
                        MediaBrowserImplBase.this.mHandler.setCallbacksMessenger(null);
                        MediaBrowserImplBase.this.mState = 4;
                        MediaBrowserImplBase.this.mCallback.onConnectionSuspended();
                    }
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.2
                    final /* synthetic */ ComponentName val$name;

                    RunnableC00182(ComponentName componentName2) {
                        r2 = componentName2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (MediaBrowserCompat.DEBUG) {
                            Log.d(MediaBrowserCompat.TAG, "MediaServiceConnection.onServiceDisconnected name=" + r2 + " this=" + this + " mServiceConnection=" + MediaBrowserImplBase.this.mServiceConnection);
                            MediaBrowserImplBase.this.dump();
                        }
                        if (MediaServiceConnection.this.isCurrent("onServiceDisconnected")) {
                            MediaBrowserImplBase.this.mServiceBinderWrapper = null;
                            MediaBrowserImplBase.this.mCallbacksMessenger = null;
                            MediaBrowserImplBase.this.mHandler.setCallbacksMessenger(null);
                            MediaBrowserImplBase.this.mState = 4;
                            MediaBrowserImplBase.this.mCallback.onConnectionSuspended();
                        }
                    }
                });
            }

            private void postOrRun(Runnable runnable) {
                if (Thread.currentThread() == MediaBrowserImplBase.this.mHandler.getLooper().getThread()) {
                    runnable.run();
                } else {
                    MediaBrowserImplBase.this.mHandler.post(runnable);
                }
            }

            boolean isCurrent(String str) {
                if (MediaBrowserImplBase.this.mServiceConnection == this && MediaBrowserImplBase.this.mState != 0 && MediaBrowserImplBase.this.mState != 1) {
                    return true;
                }
                if (MediaBrowserImplBase.this.mState == 0 || MediaBrowserImplBase.this.mState == 1) {
                    return false;
                }
                Log.i(MediaBrowserCompat.TAG, str + " for " + MediaBrowserImplBase.this.mServiceComponent + " with mServiceConnection=" + MediaBrowserImplBase.this.mServiceConnection + " this=" + this);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class MediaBrowserImplApi21 implements ConnectionCallback.ConnectionCallbackInternal, MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        protected final Object mBrowserObj;
        protected Messenger mCallbacksMessenger;
        final Context mContext;
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        protected final Bundle mRootHints;
        protected ServiceBinderWrapper mServiceBinderWrapper;
        protected int mServiceVersion;
        protected final CallbackHandler mHandler = new CallbackHandler(this);
        private final C0318a<String, Subscription> mSubscriptions = new C0318a<>();

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            this.mContext = context;
            this.mRootHints = bundle != null ? new Bundle(bundle) : new Bundle();
            this.mRootHints.putInt("extra_client_version", 1);
            connectionCallback.setInternalConnectionCallback(this);
            this.mBrowserObj = MediaBrowserCompatApi21.createBrowser(context, componentName, connectionCallback.mConnectionCallbackObj, this.mRootHints);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            MediaBrowserCompatApi21.connect(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            if (this.mServiceBinderWrapper != null && this.mCallbacksMessenger != null) {
                try {
                    this.mServiceBinderWrapper.unregisterCallbackMessenger(this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error unregistering client messenger.");
                }
            }
            MediaBrowserCompatApi21.disconnect(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            return MediaBrowserCompatApi21.isConnected(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
            return MediaBrowserCompatApi21.getServiceComponent(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public String getRoot() {
            return MediaBrowserCompatApi21.getRoot(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getExtras() {
            return MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
            if (this.mMediaSessionToken == null) {
                this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(this.mBrowserObj));
            }
            return this.mMediaSessionToken;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.mSubscriptions.put(str, subscription);
            }
            subscriptionCallback.setSubscription(subscription);
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            subscription.putCallback(bundle2, subscriptionCallback);
            if (this.mServiceBinderWrapper == null) {
                MediaBrowserCompatApi21.subscribe(this.mBrowserObj, str, subscriptionCallback.mSubscriptionCallbackObj);
                return;
            }
            try {
                this.mServiceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
            } catch (RemoteException unused) {
                Log.i(MediaBrowserCompat.TAG, "Remote error subscribing media item: ".concat(String.valueOf(str)));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription == null) {
                return;
            }
            if (this.mServiceBinderWrapper != null) {
                try {
                    if (subscriptionCallback == null) {
                        this.mServiceBinderWrapper.removeSubscription(str, null, this.mCallbacksMessenger);
                    } else {
                        List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                        List<Bundle> optionsList = subscription.getOptionsList();
                        for (int size = callbacks.size() - 1; size >= 0; size--) {
                            if (callbacks.get(size) == subscriptionCallback) {
                                this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);
                                callbacks.remove(size);
                                optionsList.remove(size);
                            }
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.TAG, "removeSubscription failed with RemoteException parentId=".concat(String.valueOf(str)));
                }
            } else if (subscriptionCallback == null) {
                MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, str);
            } else {
                List<SubscriptionCallback> callbacks2 = subscription.getCallbacks();
                List<Bundle> optionsList2 = subscription.getOptionsList();
                for (int size2 = callbacks2.size() - 1; size2 >= 0; size2--) {
                    if (callbacks2.get(size2) == subscriptionCallback) {
                        callbacks2.remove(size2);
                        optionsList2.remove(size2);
                    }
                }
                if (callbacks2.size() == 0) {
                    MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, str);
                }
            }
            if (subscription.isEmpty() || subscriptionCallback == null) {
                this.mSubscriptions.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(String str, ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!MediaBrowserCompatApi21.isConnected(this.mBrowserObj)) {
                Log.i(MediaBrowserCompat.TAG, "Not connected, unable to retrieve the MediaItem.");
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.1
                    final /* synthetic */ ItemCallback val$cb;
                    final /* synthetic */ String val$mediaId;

                    RunnableC00041(ItemCallback itemCallback2, String str2) {
                        r2 = itemCallback2;
                        r3 = str2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onError(r3);
                    }
                });
            } else {
                if (this.mServiceBinderWrapper == null) {
                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.2
                        final /* synthetic */ ItemCallback val$cb;
                        final /* synthetic */ String val$mediaId;

                        RunnableC00052(ItemCallback itemCallback2, String str2) {
                            r2 = itemCallback2;
                            r3 = str2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            r2.onError(r3);
                        }
                    });
                    return;
                }
                try {
                    this.mServiceBinderWrapper.getMediaItem(str2, new ItemReceiver(str2, itemCallback2, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error getting media item: ".concat(String.valueOf(str2)));
                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.3
                        final /* synthetic */ ItemCallback val$cb;
                        final /* synthetic */ String val$mediaId;

                        RunnableC00063(ItemCallback itemCallback2, String str2) {
                            r2 = itemCallback2;
                            r3 = str2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            r2.onError(r3);
                        }
                    });
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$1 */
        /* loaded from: classes.dex */
        public class RunnableC00041 implements Runnable {
            final /* synthetic */ ItemCallback val$cb;
            final /* synthetic */ String val$mediaId;

            RunnableC00041(ItemCallback itemCallback2, String str2) {
                r2 = itemCallback2;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onError(r3);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$2 */
        /* loaded from: classes.dex */
        public class RunnableC00052 implements Runnable {
            final /* synthetic */ ItemCallback val$cb;
            final /* synthetic */ String val$mediaId;

            RunnableC00052(ItemCallback itemCallback2, String str2) {
                r2 = itemCallback2;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onError(r3);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$3 */
        /* loaded from: classes.dex */
        public class RunnableC00063 implements Runnable {
            final /* synthetic */ ItemCallback val$cb;
            final /* synthetic */ String val$mediaId;

            RunnableC00063(ItemCallback itemCallback2, String str2) {
                r2 = itemCallback2;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onError(r3);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(String str, Bundle bundle, SearchCallback searchCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            }
            if (this.mServiceBinderWrapper == null) {
                Log.i(MediaBrowserCompat.TAG, "The connected service doesn't support search.");
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.4
                    final /* synthetic */ SearchCallback val$callback;
                    final /* synthetic */ Bundle val$extras;
                    final /* synthetic */ String val$query;

                    RunnableC00074(SearchCallback searchCallback2, String str2, Bundle bundle2) {
                        r2 = searchCallback2;
                        r3 = str2;
                        r4 = bundle2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onError(r3, r4);
                    }
                });
                return;
            }
            try {
                this.mServiceBinderWrapper.search(str2, bundle2, new SearchResultReceiver(str2, bundle2, searchCallback2, this.mHandler), this.mCallbacksMessenger);
            } catch (RemoteException e) {
                Log.i(MediaBrowserCompat.TAG, "Remote error searching items with query: ".concat(String.valueOf(str2)), e);
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.5
                    final /* synthetic */ SearchCallback val$callback;
                    final /* synthetic */ Bundle val$extras;
                    final /* synthetic */ String val$query;

                    RunnableC00085(SearchCallback searchCallback2, String str2, Bundle bundle2) {
                        r2 = searchCallback2;
                        r3 = str2;
                        r4 = bundle2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onError(r3, r4);
                    }
                });
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$4 */
        /* loaded from: classes.dex */
        class RunnableC00074 implements Runnable {
            final /* synthetic */ SearchCallback val$callback;
            final /* synthetic */ Bundle val$extras;
            final /* synthetic */ String val$query;

            RunnableC00074(SearchCallback searchCallback2, String str2, Bundle bundle2) {
                r2 = searchCallback2;
                r3 = str2;
                r4 = bundle2;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onError(r3, r4);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$5 */
        /* loaded from: classes.dex */
        class RunnableC00085 implements Runnable {
            final /* synthetic */ SearchCallback val$callback;
            final /* synthetic */ Bundle val$extras;
            final /* synthetic */ String val$query;

            RunnableC00085(SearchCallback searchCallback2, String str2, Bundle bundle2) {
                r2 = searchCallback2;
                r3 = str2;
                r4 = bundle2;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onError(r3, r4);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
            if (this.mServiceBinderWrapper == null) {
                Log.i(MediaBrowserCompat.TAG, "The connected service doesn't support sendCustomAction.");
                if (customActionCallback != null) {
                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.6
                        final /* synthetic */ String val$action;
                        final /* synthetic */ CustomActionCallback val$callback;
                        final /* synthetic */ Bundle val$extras;

                        RunnableC00096(CustomActionCallback customActionCallback2, String str2, Bundle bundle2) {
                            r2 = customActionCallback2;
                            r3 = str2;
                            r4 = bundle2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            r2.onError(r3, r4, null);
                        }
                    });
                }
            }
            try {
                this.mServiceBinderWrapper.sendCustomAction(str2, bundle2, new CustomActionResultReceiver(str2, bundle2, customActionCallback2, this.mHandler), this.mCallbacksMessenger);
            } catch (RemoteException e) {
                Log.i(MediaBrowserCompat.TAG, "Remote error sending a custom action: action=" + str2 + ", extras=" + bundle2, e);
                if (customActionCallback2 != null) {
                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.7
                        final /* synthetic */ String val$action;
                        final /* synthetic */ CustomActionCallback val$callback;
                        final /* synthetic */ Bundle val$extras;

                        RunnableC00107(CustomActionCallback customActionCallback2, String str2, Bundle bundle2) {
                            r2 = customActionCallback2;
                            r3 = str2;
                            r4 = bundle2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            r2.onError(r3, r4, null);
                        }
                    });
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$6 */
        /* loaded from: classes.dex */
        class RunnableC00096 implements Runnable {
            final /* synthetic */ String val$action;
            final /* synthetic */ CustomActionCallback val$callback;
            final /* synthetic */ Bundle val$extras;

            RunnableC00096(CustomActionCallback customActionCallback2, String str2, Bundle bundle2) {
                r2 = customActionCallback2;
                r3 = str2;
                r4 = bundle2;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onError(r3, r4, null);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$7 */
        /* loaded from: classes.dex */
        class RunnableC00107 implements Runnable {
            final /* synthetic */ String val$action;
            final /* synthetic */ CustomActionCallback val$callback;
            final /* synthetic */ Bundle val$extras;

            RunnableC00107(CustomActionCallback customActionCallback2, String str2, Bundle bundle2) {
                r2 = customActionCallback2;
                r3 = str2;
                r4 = bundle2;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onError(r3, r4, null);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
            Bundle extras = MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
            if (extras == null) {
                return;
            }
            this.mServiceVersion = extras.getInt("extra_service_version", 0);
            IBinder m1464a = C0410h.m1464a(extras, "extra_messenger");
            if (m1464a != null) {
                this.mServiceBinderWrapper = new ServiceBinderWrapper(m1464a, this.mRootHints);
                this.mCallbacksMessenger = new Messenger(this.mHandler);
                this.mHandler.setCallbacksMessenger(this.mCallbacksMessenger);
                try {
                    this.mServiceBinderWrapper.registerCallbackMessenger(this.mContext, this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error registering client messenger.");
                }
            }
            IMediaSession asInterface = IMediaSession.Stub.asInterface(C0410h.m1464a(extras, "extra_session_binder"));
            if (asInterface != null) {
                this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(this.mBrowserObj), asInterface);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mMediaSessionToken = null;
            this.mHandler.setCallbacksMessenger(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.mCallbacksMessenger != messenger) {
                return;
            }
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription == null) {
                if (MediaBrowserCompat.DEBUG) {
                    Log.d(MediaBrowserCompat.TAG, "onLoadChildren for id that isn't subscribed id=".concat(String.valueOf(str)));
                    return;
                }
                return;
            }
            SubscriptionCallback callback = subscription.getCallback(bundle);
            if (callback != null) {
                if (bundle == null) {
                    if (list == null) {
                        callback.onError(str);
                        return;
                    }
                    this.mNotifyChildrenChangedOptions = bundle2;
                    callback.onChildrenLoaded(str, list);
                    this.mNotifyChildrenChangedOptions = null;
                    return;
                }
                if (list == null) {
                    callback.onError(str, bundle);
                    return;
                }
                this.mNotifyChildrenChangedOptions = bundle2;
                callback.onChildrenLoaded(str, list, bundle);
                this.mNotifyChildrenChangedOptions = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
            return this.mNotifyChildrenChangedOptions;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(String str, ItemCallback itemCallback) {
            if (this.mServiceBinderWrapper == null) {
                MediaBrowserCompatApi23.getItem(this.mBrowserObj, str, itemCallback.mItemCallbackObj);
            } else {
                super.getItem(str, itemCallback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                super.subscribe(str, bundle, subscriptionCallback);
            } else if (bundle == null) {
                MediaBrowserCompatApi21.subscribe(this.mBrowserObj, str, subscriptionCallback.mSubscriptionCallbackObj);
            } else {
                MediaBrowserCompatApi26.subscribe(this.mBrowserObj, str, bundle, subscriptionCallback.mSubscriptionCallbackObj);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                super.unsubscribe(str, subscriptionCallback);
            } else if (subscriptionCallback == null) {
                MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, str);
            } else {
                MediaBrowserCompatApi26.unsubscribe(this.mBrowserObj, str, subscriptionCallback.mSubscriptionCallbackObj);
            }
        }
    }

    /* loaded from: classes.dex */
    public class Subscription {
        private final List<SubscriptionCallback> mCallbacks = new ArrayList();
        private final List<Bundle> mOptionsList = new ArrayList();

        public boolean isEmpty() {
            return this.mCallbacks.isEmpty();
        }

        public List<Bundle> getOptionsList() {
            return this.mOptionsList;
        }

        public List<SubscriptionCallback> getCallbacks() {
            return this.mCallbacks;
        }

        public SubscriptionCallback getCallback(Bundle bundle) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (C0773d.m2670a(this.mOptionsList.get(i), bundle)) {
                    return this.mCallbacks.get(i);
                }
            }
            return null;
        }

        public void putCallback(Bundle bundle, SubscriptionCallback subscriptionCallback) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (C0773d.m2670a(this.mOptionsList.get(i), bundle)) {
                    this.mCallbacks.set(i, subscriptionCallback);
                    return;
                }
            }
            this.mCallbacks.add(subscriptionCallback);
            this.mOptionsList.add(bundle);
        }
    }

    /* loaded from: classes.dex */
    public class CallbackHandler extends Handler {
        private final WeakReference<MediaBrowserServiceCallbackImpl> mCallbackImplRef;
        private WeakReference<Messenger> mCallbacksMessengerRef;

        CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.mCallbackImplRef = new WeakReference<>(mediaBrowserServiceCallbackImpl);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.mCallbacksMessengerRef == null || this.mCallbacksMessengerRef.get() == null || this.mCallbackImplRef.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.ensureClassLoader(data);
            MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = this.mCallbackImplRef.get();
            Messenger messenger = this.mCallbacksMessengerRef.get();
            try {
                switch (message.what) {
                    case 1:
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.ensureClassLoader(bundle);
                        mediaBrowserServiceCallbackImpl.onServiceConnected(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                        return;
                    case 2:
                        mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                        return;
                    case 3:
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.ensureClassLoader(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.ensureClassLoader(bundle3);
                        mediaBrowserServiceCallbackImpl.onLoadChildren(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                        return;
                    default:
                        Log.w(MediaBrowserCompat.TAG, "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        return;
                }
            } catch (BadParcelableException unused) {
                Log.e(MediaBrowserCompat.TAG, "Could not unparcel the data.");
                if (message.what == 1) {
                    mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                }
            }
        }

        void setCallbacksMessenger(Messenger messenger) {
            this.mCallbacksMessengerRef = new WeakReference<>(messenger);
        }
    }

    /* loaded from: classes.dex */
    public class ServiceBinderWrapper {
        private Messenger mMessenger;
        private Bundle mRootHints;

        public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
            this.mMessenger = new Messenger(iBinder);
            this.mRootHints = bundle;
        }

        void connect(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.mRootHints);
            sendRequest(1, bundle, messenger);
        }

        void disconnect(Messenger messenger) {
            sendRequest(2, null, messenger);
        }

        void addSubscription(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0410h.m1465a(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            sendRequest(3, bundle2, messenger);
        }

        void removeSubscription(String str, IBinder iBinder, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            C0410h.m1465a(bundle, "data_callback_token", iBinder);
            sendRequest(4, bundle, messenger);
        }

        void getMediaItem(String str, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(5, bundle, messenger);
        }

        void registerCallbackMessenger(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.mRootHints);
            sendRequest(6, bundle, messenger);
        }

        void unregisterCallbackMessenger(Messenger messenger) {
            sendRequest(7, null, messenger);
        }

        void search(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_search_query", str);
            bundle2.putBundle("data_search_extras", bundle);
            bundle2.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(8, bundle2, messenger);
        }

        void sendCustomAction(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_custom_action", str);
            bundle2.putBundle("data_custom_action_extras", bundle);
            bundle2.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(9, bundle2, messenger);
        }

        private void sendRequest(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.mMessenger.send(obtain);
        }
    }

    /* loaded from: classes.dex */
    public class ItemReceiver extends ResultReceiver {
        private final ItemCallback mCallback;
        private final String mMediaId;

        ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.mMediaId = str;
            this.mCallback = itemCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.mCallback.onError(this.mMediaId);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.mCallback.onItemLoaded((MediaItem) parcelable);
            } else {
                this.mCallback.onError(this.mMediaId);
            }
        }
    }

    /* loaded from: classes.dex */
    class SearchResultReceiver extends ResultReceiver {
        private final SearchCallback mCallback;
        private final Bundle mExtras;
        private final String mQuery;

        SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
            super(handler);
            this.mQuery = str;
            this.mExtras = bundle;
            this.mCallback = searchCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.mCallback.onError(this.mQuery, this.mExtras);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.mCallback.onSearchResult(this.mQuery, this.mExtras, arrayList);
        }
    }

    /* loaded from: classes.dex */
    class CustomActionResultReceiver extends ResultReceiver {
        private final String mAction;
        private final CustomActionCallback mCallback;
        private final Bundle mExtras;

        CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
            super(handler);
            this.mAction = str;
            this.mExtras = bundle;
            this.mCallback = customActionCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            if (this.mCallback == null) {
                return;
            }
            MediaSessionCompat.ensureClassLoader(bundle);
            switch (i) {
                case -1:
                    this.mCallback.onError(this.mAction, this.mExtras, bundle);
                    return;
                case 0:
                    this.mCallback.onResult(this.mAction, this.mExtras, bundle);
                    return;
                case 1:
                    this.mCallback.onProgressUpdate(this.mAction, this.mExtras, bundle);
                    return;
                default:
                    Log.w(MediaBrowserCompat.TAG, "Unknown result code: " + i + " (extras=" + this.mExtras + ", resultData=" + bundle + ")");
                    return;
            }
        }
    }
}
