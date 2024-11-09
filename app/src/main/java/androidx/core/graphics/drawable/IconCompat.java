package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: h */
    static final PorterDuff.Mode f2399h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    Object f2401b;

    /* renamed from: a */
    public int f2400a = -1;

    /* renamed from: c */
    public byte[] f2402c = null;

    /* renamed from: d */
    public Parcelable f2403d = null;

    /* renamed from: e */
    public int f2404e = 0;

    /* renamed from: f */
    public int f2405f = 0;

    /* renamed from: g */
    public ColorStateList f2406g = null;

    /* renamed from: i */
    PorterDuff.Mode f2407i = f2399h;

    /* renamed from: j */
    public String f2408j = null;

    public String toString() {
        String str;
        String str2;
        int i;
        if (this.f2400a == -1) {
            return String.valueOf(this.f2401b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2400a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2400a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2401b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2401b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                if (this.f2400a == -1 && Build.VERSION.SDK_INT >= 23) {
                    str2 = m1917a((Icon) this.f2401b);
                } else {
                    if (this.f2400a != 2) {
                        throw new IllegalStateException("called getResPackage() on ".concat(String.valueOf(this)));
                    }
                    str2 = ((String) this.f2401b).split(":", -1)[0];
                }
                sb.append(str2);
                sb.append(" id=");
                Object[] objArr = new Object[1];
                if (this.f2400a == -1 && Build.VERSION.SDK_INT >= 23) {
                    i = m1918b((Icon) this.f2401b);
                } else {
                    if (this.f2400a != 2) {
                        throw new IllegalStateException("called getResId() on ".concat(String.valueOf(this)));
                    }
                    i = this.f2404e;
                }
                objArr[0] = Integer.valueOf(i);
                sb.append(String.format("0x%08x", objArr));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2404e);
                if (this.f2405f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2405f);
                    break;
                }
                break;
            case 4:
                sb.append(" uri=");
                sb.append(this.f2401b);
                break;
        }
        if (this.f2406g != null) {
            sb.append(" tint=");
            sb.append(this.f2406g);
        }
        if (this.f2407i != f2399h) {
            sb.append(" mode=");
            sb.append(this.f2407i);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m1917a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: b */
    private static int m1918b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }
}
