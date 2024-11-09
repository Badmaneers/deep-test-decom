package com.oppo.support.widget;

import java.text.Collator;
import java.util.Comparator;

/* compiled from: OppoTouchSearchView.java */
/* renamed from: com.oppo.support.widget.a */
/* loaded from: classes.dex */
final class C2468a implements Comparator<CharSequence> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(CharSequence charSequence, CharSequence charSequence2) {
        Collator collator;
        collator = OppoTouchSearchView.f10747c;
        return collator.compare(charSequence, charSequence2);
    }
}
