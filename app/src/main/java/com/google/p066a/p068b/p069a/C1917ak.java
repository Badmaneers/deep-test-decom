package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import java.util.BitSet;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ak */
/* loaded from: classes.dex */
final class C1917ak extends AbstractC1902af<BitSet> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ BitSet mo6058a(C2001a c2001a) {
        return m6066b(c2001a);
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, BitSet bitSet) {
        BitSet bitSet2 = bitSet;
        if (bitSet2 == null) {
            c2006f.mo6103f();
            return;
        }
        c2006f.mo6098b();
        for (int i = 0; i < bitSet2.length(); i++) {
            c2006f.mo6093a(bitSet2.get(i) ? 1L : 0L);
        }
        c2006f.mo6100c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:            if (java.lang.Integer.parseInt(r1) != 0) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:            r5 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:            if (r6.mo6088m() != 0) goto L23;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0028. Please report as an issue. */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.BitSet m6066b(com.google.p066a.p071d.C2001a r6) {
        /*
            com.google.a.d.e r0 = r6.mo6081f()
            com.google.a.d.e r1 = com.google.p066a.p071d.EnumC2005e.NULL
            if (r0 != r1) goto Ld
            r6.mo6085j()
            r6 = 0
            return r6
        Ld:
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r6.mo6076a()
            com.google.a.d.e r1 = r6.mo6081f()
            r2 = 0
            r3 = r2
        L1b:
            com.google.a.d.e r4 = com.google.p066a.p071d.EnumC2005e.END_ARRAY
            if (r1 == r4) goto L6f
            int[] r4 = com.google.p066a.p068b.p069a.C1931ay.f8710a
            int r5 = r1.ordinal()
            r4 = r4[r5]
            r5 = 1
            switch(r4) {
                case 1: goto L5d;
                case 2: goto L58;
                case 3: goto L3b;
                default: goto L2b;
            }
        L2b:
            com.google.a.ab r6 = new com.google.a.ab
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Invalid bitset value type: "
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            throw r6
        L3b:
            java.lang.String r1 = r6.mo6083h()
            int r4 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L48
            if (r4 == 0) goto L46
            goto L63
        L46:
            r5 = r2
            goto L63
        L48:
            com.google.a.ab r6 = new com.google.a.ab
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Error: Expecting: bitset number value (1, 0), Found: "
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            throw r6
        L58:
            boolean r5 = r6.mo6084i()
            goto L63
        L5d:
            int r1 = r6.mo6088m()
            if (r1 == 0) goto L46
        L63:
            if (r5 == 0) goto L68
            r0.set(r3)
        L68:
            int r3 = r3 + 1
            com.google.a.d.e r1 = r6.mo6081f()
            goto L1b
        L6f:
            r6.mo6077b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p066a.p068b.p069a.C1917ak.m6066b(com.google.a.d.a):java.util.BitSet");
    }
}
