package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC1091b;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1091b abstractC1091b) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2113a = (IconCompat) abstractC1091b.m3647c((AbstractC1091b) remoteActionCompat.f2113a);
        remoteActionCompat.f2114b = abstractC1091b.m3640b(remoteActionCompat.f2114b, 2);
        remoteActionCompat.f2115c = abstractC1091b.m3640b(remoteActionCompat.f2115c, 3);
        remoteActionCompat.f2116d = (PendingIntent) abstractC1091b.m3638b((AbstractC1091b) remoteActionCompat.f2116d, 4);
        remoteActionCompat.f2117e = abstractC1091b.m3645b(remoteActionCompat.f2117e, 5);
        remoteActionCompat.f2118f = abstractC1091b.m3645b(remoteActionCompat.f2118f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1091b abstractC1091b) {
        abstractC1091b.m3630a(remoteActionCompat.f2113a);
        abstractC1091b.m3632a(remoteActionCompat.f2114b, 2);
        abstractC1091b.m3632a(remoteActionCompat.f2115c, 3);
        abstractC1091b.m3629a(remoteActionCompat.f2116d, 4);
        abstractC1091b.m3635a(remoteActionCompat.f2117e, 5);
        abstractC1091b.m3635a(remoteActionCompat.f2118f, 6);
    }
}
