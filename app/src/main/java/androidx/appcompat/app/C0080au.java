package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0438d;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TwilightManager.java */
/* renamed from: androidx.appcompat.app.au */
/* loaded from: classes.dex */
public final class C0080au {

    /* renamed from: a */
    private static C0080au f238a;

    /* renamed from: b */
    private final Context f239b;

    /* renamed from: c */
    private final LocationManager f240c;

    /* renamed from: d */
    private final C0081av f241d = new C0081av();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0080au m193a(Context context) {
        if (f238a == null) {
            Context applicationContext = context.getApplicationContext();
            f238a = new C0080au(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f238a;
    }

    private C0080au(Context context, LocationManager locationManager) {
        this.f239b = context;
        this.f240c = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m194a() {
        long j;
        C0081av c0081av = this.f241d;
        if (this.f241d.f247f > System.currentTimeMillis()) {
            return c0081av.f242a;
        }
        Location m192a = C0438d.m1552a(this.f239b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m192a("network") : null;
        Location m192a2 = C0438d.m1552a(this.f239b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m192a("gps") : null;
        if (m192a2 == null || m192a == null ? m192a2 != null : m192a2.getTime() > m192a.getTime()) {
            m192a = m192a2;
        }
        if (m192a == null) {
            Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
            int i = Calendar.getInstance().get(11);
            return i < 6 || i >= 22;
        }
        C0081av c0081av2 = this.f241d;
        long currentTimeMillis = System.currentTimeMillis();
        C0079at m190a = C0079at.m190a();
        m190a.m191a(currentTimeMillis - 86400000, m192a.getLatitude(), m192a.getLongitude());
        long j2 = m190a.f235a;
        m190a.m191a(currentTimeMillis, m192a.getLatitude(), m192a.getLongitude());
        boolean z = m190a.f237c == 1;
        long j3 = m190a.f236b;
        long j4 = m190a.f235a;
        boolean z2 = z;
        m190a.m191a(currentTimeMillis + 86400000, m192a.getLatitude(), m192a.getLongitude());
        long j5 = m190a.f236b;
        if (j3 == -1 || j4 == -1) {
            j = currentTimeMillis + 43200000;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        c0081av2.f242a = z2;
        c0081av2.f243b = j2;
        c0081av2.f244c = j3;
        c0081av2.f245d = j4;
        c0081av2.f246e = j5;
        c0081av2.f247f = j;
        return c0081av.f242a;
    }

    /* renamed from: a */
    private Location m192a(String str) {
        try {
            if (this.f240c.isProviderEnabled(str)) {
                return this.f240c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
