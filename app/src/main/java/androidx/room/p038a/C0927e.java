package androidx.room.p038a;

import android.database.Cursor;
import androidx.p032e.p033a.InterfaceC0646b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo.java */
/* renamed from: androidx.room.a.e */
/* loaded from: classes.dex */
public final class C0927e {

    /* renamed from: a */
    public final String f3804a;

    /* renamed from: b */
    public final Map<String, C0928f> f3805b;

    /* renamed from: c */
    public final Set<C0929g> f3806c;

    /* renamed from: d */
    public final Set<C0931i> f3807d;

    public C0927e(String str, Map<String, C0928f> map, Set<C0929g> set, Set<C0931i> set2) {
        this.f3804a = str;
        this.f3805b = Collections.unmodifiableMap(map);
        this.f3806c = Collections.unmodifiableSet(set);
        this.f3807d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0927e c0927e = (C0927e) obj;
        if (this.f3804a == null ? c0927e.f3804a != null : !this.f3804a.equals(c0927e.f3804a)) {
            return false;
        }
        if (this.f3805b == null ? c0927e.f3805b != null : !this.f3805b.equals(c0927e.f3805b)) {
            return false;
        }
        if (this.f3806c == null ? c0927e.f3806c != null : !this.f3806c.equals(c0927e.f3806c)) {
            return false;
        }
        if (this.f3807d == null || c0927e.f3807d == null) {
            return true;
        }
        return this.f3807d.equals(c0927e.f3807d);
    }

    public final int hashCode() {
        return ((((this.f3804a != null ? this.f3804a.hashCode() : 0) * 31) + (this.f3805b != null ? this.f3805b.hashCode() : 0)) * 31) + (this.f3806c != null ? this.f3806c.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f3804a + "', columns=" + this.f3805b + ", foreignKeys=" + this.f3806c + ", indices=" + this.f3807d + '}';
    }

    /* renamed from: a */
    public static C0927e m3340a(InterfaceC0646b interfaceC0646b, String str) {
        return new C0927e(str, m3344c(interfaceC0646b, str), m3343b(interfaceC0646b, str), m3345d(interfaceC0646b, str));
    }

    /* renamed from: b */
    private static Set<C0929g> m3343b(InterfaceC0646b interfaceC0646b, String str) {
        HashSet hashSet = new HashSet();
        Cursor mo2211b = interfaceC0646b.mo2211b("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = mo2211b.getColumnIndex("id");
            int columnIndex2 = mo2211b.getColumnIndex("seq");
            int columnIndex3 = mo2211b.getColumnIndex("table");
            int columnIndex4 = mo2211b.getColumnIndex("on_delete");
            int columnIndex5 = mo2211b.getColumnIndex("on_update");
            List<C0930h> m3342a = m3342a(mo2211b);
            int count = mo2211b.getCount();
            for (int i = 0; i < count; i++) {
                mo2211b.moveToPosition(i);
                if (mo2211b.getInt(columnIndex2) == 0) {
                    int i2 = mo2211b.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C0930h c0930h : m3342a) {
                        if (c0930h.f3820a == i2) {
                            arrayList.add(c0930h.f3822c);
                            arrayList2.add(c0930h.f3823d);
                        }
                    }
                    hashSet.add(new C0929g(mo2211b.getString(columnIndex3), mo2211b.getString(columnIndex4), mo2211b.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            mo2211b.close();
        }
    }

    /* renamed from: a */
    private static List<C0930h> m3342a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0930h(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    private static Map<String, C0928f> m3344c(InterfaceC0646b interfaceC0646b, String str) {
        Cursor mo2211b = interfaceC0646b.mo2211b("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (mo2211b.getColumnCount() > 0) {
                int columnIndex = mo2211b.getColumnIndex("name");
                int columnIndex2 = mo2211b.getColumnIndex("type");
                int columnIndex3 = mo2211b.getColumnIndex("notnull");
                int columnIndex4 = mo2211b.getColumnIndex("pk");
                int columnIndex5 = mo2211b.getColumnIndex("dflt_value");
                while (mo2211b.moveToNext()) {
                    String string = mo2211b.getString(columnIndex);
                    hashMap.put(string, new C0928f(string, mo2211b.getString(columnIndex2), mo2211b.getInt(columnIndex3) != 0, mo2211b.getInt(columnIndex4), mo2211b.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            mo2211b.close();
        }
    }

    /* renamed from: d */
    private static Set<C0931i> m3345d(InterfaceC0646b interfaceC0646b, String str) {
        Cursor mo2211b = interfaceC0646b.mo2211b("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = mo2211b.getColumnIndex("name");
            int columnIndex2 = mo2211b.getColumnIndex("origin");
            int columnIndex3 = mo2211b.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (mo2211b.moveToNext()) {
                    if ("c".equals(mo2211b.getString(columnIndex2))) {
                        String string = mo2211b.getString(columnIndex);
                        boolean z = true;
                        if (mo2211b.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        C0931i m3341a = m3341a(interfaceC0646b, string, z);
                        if (m3341a == null) {
                            return null;
                        }
                        hashSet.add(m3341a);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            mo2211b.close();
        }
    }

    /* renamed from: a */
    private static C0931i m3341a(InterfaceC0646b interfaceC0646b, String str, boolean z) {
        Cursor mo2211b = interfaceC0646b.mo2211b("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = mo2211b.getColumnIndex("seqno");
            int columnIndex2 = mo2211b.getColumnIndex("cid");
            int columnIndex3 = mo2211b.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (mo2211b.moveToNext()) {
                    if (mo2211b.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(mo2211b.getInt(columnIndex)), mo2211b.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new C0931i(str, z, arrayList);
            }
            mo2211b.close();
            return null;
        } finally {
            mo2211b.close();
        }
    }
}
