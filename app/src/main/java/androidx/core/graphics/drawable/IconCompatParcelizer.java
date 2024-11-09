package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC1091b;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC1091b abstractC1091b) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2400a = abstractC1091b.m3637b(iconCompat.f2400a, 1);
        iconCompat.f2402c = abstractC1091b.m3650c(iconCompat.f2402c);
        iconCompat.f2403d = abstractC1091b.m3638b((AbstractC1091b) iconCompat.f2403d, 3);
        iconCompat.f2404e = abstractC1091b.m3637b(iconCompat.f2404e, 4);
        iconCompat.f2405f = abstractC1091b.m3637b(iconCompat.f2405f, 5);
        iconCompat.f2406g = (ColorStateList) abstractC1091b.m3638b((AbstractC1091b) iconCompat.f2406g, 6);
        iconCompat.f2408j = abstractC1091b.m3648c(iconCompat.f2408j);
        iconCompat.f2407i = PorterDuff.Mode.valueOf(iconCompat.f2408j);
        int i = iconCompat.f2400a;
        if (i == -1) {
            if (iconCompat.f2403d != null) {
                iconCompat.f2401b = iconCompat.f2403d;
            } else {
                throw new IllegalArgumentException("Invalid icon");
            }
        } else {
            switch (i) {
                case 1:
                case 5:
                    if (iconCompat.f2403d != null) {
                        iconCompat.f2401b = iconCompat.f2403d;
                        break;
                    } else {
                        iconCompat.f2401b = iconCompat.f2402c;
                        iconCompat.f2400a = 3;
                        iconCompat.f2404e = 0;
                        iconCompat.f2405f = iconCompat.f2402c.length;
                        break;
                    }
                case 2:
                case 4:
                    iconCompat.f2401b = new String(iconCompat.f2402c, Charset.forName("UTF-16"));
                    break;
                case 3:
                    iconCompat.f2401b = iconCompat.f2402c;
                    break;
            }
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC1091b abstractC1091b) {
        iconCompat.f2408j = iconCompat.f2407i.name();
        int i = iconCompat.f2400a;
        if (i == -1) {
            iconCompat.f2403d = (Parcelable) iconCompat.f2401b;
        } else {
            switch (i) {
                case 1:
                case 5:
                    iconCompat.f2403d = (Parcelable) iconCompat.f2401b;
                    break;
                case 2:
                    iconCompat.f2402c = ((String) iconCompat.f2401b).getBytes(Charset.forName("UTF-16"));
                    break;
                case 3:
                    iconCompat.f2402c = (byte[]) iconCompat.f2401b;
                    break;
                case 4:
                    iconCompat.f2402c = iconCompat.f2401b.toString().getBytes(Charset.forName("UTF-16"));
                    break;
            }
        }
        if (-1 != iconCompat.f2400a) {
            abstractC1091b.m3627a(iconCompat.f2400a, 1);
        }
        if (iconCompat.f2402c != null) {
            abstractC1091b.m3643b(iconCompat.f2402c);
        }
        if (iconCompat.f2403d != null) {
            abstractC1091b.m3629a(iconCompat.f2403d, 3);
        }
        if (iconCompat.f2404e != 0) {
            abstractC1091b.m3627a(iconCompat.f2404e, 4);
        }
        if (iconCompat.f2405f != 0) {
            abstractC1091b.m3627a(iconCompat.f2405f, 5);
        }
        if (iconCompat.f2406g != null) {
            abstractC1091b.m3629a(iconCompat.f2406g, 6);
        }
        if (iconCompat.f2408j != null) {
            abstractC1091b.m3642b(iconCompat.f2408j);
        }
    }
}
