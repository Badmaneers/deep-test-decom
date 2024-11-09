package androidx.core.p021d;

import java.util.Comparator;

/* compiled from: FontsContractCompat.java */
/* renamed from: androidx.core.d.f */
/* loaded from: classes.dex */
final class C0444f implements Comparator<byte[]> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length != bArr4.length) {
            return bArr3.length - bArr4.length;
        }
        for (int i = 0; i < bArr3.length; i++) {
            if (bArr3[i] != bArr4[i]) {
                return bArr3[i] - bArr4[i];
            }
        }
        return 0;
    }
}
