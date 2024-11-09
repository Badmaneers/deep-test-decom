package androidx.core.p024g.p025a;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* renamed from: androidx.core.g.a.c */
/* loaded from: classes.dex */
public final class C0482c {

    /* renamed from: d */
    private static int f2284d;

    /* renamed from: b */
    private final AccessibilityNodeInfo f2286b;

    /* renamed from: a */
    public int f2285a = -1;

    /* renamed from: c */
    private int f2287c = -1;

    /* renamed from: d */
    private static String m1640d(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                switch (i) {
                                    case 4:
                                        return "ACTION_SELECT";
                                    case 8:
                                        return "ACTION_CLEAR_SELECTION";
                                    case 16:
                                        return "ACTION_CLICK";
                                    case 32:
                                        return "ACTION_LONG_CLICK";
                                    case 64:
                                        return "ACTION_ACCESSIBILITY_FOCUS";
                                    case 128:
                                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                                    case 256:
                                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                                    case 512:
                                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                                    case 1024:
                                        return "ACTION_NEXT_HTML_ELEMENT";
                                    case 2048:
                                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                                    case 4096:
                                        return "ACTION_SCROLL_FORWARD";
                                    case 8192:
                                        return "ACTION_SCROLL_BACKWARD";
                                    case 16384:
                                        return "ACTION_COPY";
                                    case 32768:
                                        return "ACTION_PASTE";
                                    case 65536:
                                        return "ACTION_CUT";
                                    case 131072:
                                        return "ACTION_SET_SELECTION";
                                    case 262144:
                                        return "ACTION_EXPAND";
                                    case 524288:
                                        return "ACTION_COLLAPSE";
                                    case 2097152:
                                        return "ACTION_SET_TEXT";
                                    case R.id.accessibilityActionMoveWindow:
                                        return "ACTION_MOVE_WINDOW";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private C0482c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2286b = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0482c m1635a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0482c(accessibilityNodeInfo);
    }

    /* renamed from: a */
    public final AccessibilityNodeInfo m1645a() {
        return this.f2286b;
    }

    /* renamed from: a */
    public static C0482c m1634a(View view) {
        return m1635a(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: b */
    public static C0482c m1639b() {
        return m1635a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: a */
    public static C0482c m1636a(C0482c c0482c) {
        return m1635a(AccessibilityNodeInfo.obtain(c0482c.f2286b));
    }

    /* renamed from: b */
    public final void m1658b(View view) {
        this.f2287c = -1;
        this.f2286b.setSource(view);
    }

    /* renamed from: a */
    public final void m1648a(View view, int i) {
        this.f2287c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2286b.setSource(view, i);
        }
    }

    /* renamed from: c */
    public final int m1664c() {
        return this.f2286b.getChildCount();
    }

    /* renamed from: c */
    public final void m1667c(View view) {
        this.f2286b.addChild(view);
    }

    /* renamed from: b */
    public final void m1659b(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2286b.addChild(view, i);
        }
    }

    /* renamed from: d */
    public final int m1670d() {
        return this.f2286b.getActions();
    }

    /* renamed from: a */
    public final void m1646a(int i) {
        this.f2286b.addAction(i);
    }

    /* renamed from: a */
    private List<Integer> m1637a(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f2286b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f2286b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public final void m1649a(C0483d c0483d) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2286b.addAction((AccessibilityNodeInfo.AccessibilityAction) c0483d.f2325L);
        }
    }

    /* renamed from: b */
    public final boolean m1663b(C0483d c0483d) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f2286b.removeAction((AccessibilityNodeInfo.AccessibilityAction) c0483d.f2325L);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m1655a(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2286b.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: b */
    public final void m1656b(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2286b.setMovementGranularities(i);
        }
    }

    /* renamed from: e */
    public final int m1674e() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2286b.getMovementGranularities();
        }
        return 0;
    }

    /* renamed from: d */
    public final void m1672d(View view) {
        this.f2285a = -1;
        this.f2286b.setParent(view);
    }

    /* renamed from: e */
    public final void m1675e(View view) {
        this.f2285a = -1;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2286b.setParent(view, -1);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void m1647a(Rect rect) {
        this.f2286b.getBoundsInParent(rect);
    }

    @Deprecated
    /* renamed from: b */
    public final void m1657b(Rect rect) {
        this.f2286b.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public final void m1666c(Rect rect) {
        this.f2286b.getBoundsInScreen(rect);
    }

    /* renamed from: d */
    public final void m1671d(Rect rect) {
        this.f2286b.setBoundsInScreen(rect);
    }

    /* renamed from: a */
    public final void m1654a(boolean z) {
        this.f2286b.setCheckable(z);
    }

    /* renamed from: f */
    public final boolean m1680f() {
        return this.f2286b.isChecked();
    }

    /* renamed from: b */
    public final void m1662b(boolean z) {
        this.f2286b.setChecked(z);
    }

    /* renamed from: g */
    public final boolean m1683g() {
        return this.f2286b.isFocusable();
    }

    /* renamed from: c */
    public final void m1669c(boolean z) {
        this.f2286b.setFocusable(z);
    }

    /* renamed from: h */
    public final boolean m1686h() {
        return this.f2286b.isFocused();
    }

    /* renamed from: d */
    public final void m1673d(boolean z) {
        this.f2286b.setFocused(z);
    }

    /* renamed from: i */
    public final boolean m1689i() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2286b.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: e */
    public final void m1677e(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2286b.setVisibleToUser(z);
        }
    }

    /* renamed from: j */
    public final boolean m1691j() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2286b.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: f */
    public final void m1679f(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2286b.setAccessibilityFocused(z);
        }
    }

    /* renamed from: k */
    public final boolean m1693k() {
        return this.f2286b.isSelected();
    }

    /* renamed from: g */
    public final void m1682g(boolean z) {
        this.f2286b.setSelected(z);
    }

    /* renamed from: l */
    public final boolean m1695l() {
        return this.f2286b.isClickable();
    }

    /* renamed from: h */
    public final void m1685h(boolean z) {
        this.f2286b.setClickable(z);
    }

    /* renamed from: m */
    public final boolean m1697m() {
        return this.f2286b.isLongClickable();
    }

    /* renamed from: i */
    public final void m1688i(boolean z) {
        this.f2286b.setLongClickable(z);
    }

    /* renamed from: n */
    public final boolean m1699n() {
        return this.f2286b.isEnabled();
    }

    /* renamed from: j */
    public final void m1690j(boolean z) {
        this.f2286b.setEnabled(z);
    }

    /* renamed from: o */
    public final boolean m1700o() {
        return this.f2286b.isPassword();
    }

    /* renamed from: p */
    public final boolean m1701p() {
        return this.f2286b.isScrollable();
    }

    /* renamed from: k */
    public final void m1692k(boolean z) {
        this.f2286b.setScrollable(z);
    }

    /* renamed from: q */
    public final CharSequence m1702q() {
        return this.f2286b.getPackageName();
    }

    /* renamed from: a */
    public final void m1651a(CharSequence charSequence) {
        this.f2286b.setPackageName(charSequence);
    }

    /* renamed from: r */
    public final CharSequence m1703r() {
        return this.f2286b.getClassName();
    }

    /* renamed from: b */
    public final void m1660b(CharSequence charSequence) {
        this.f2286b.setClassName(charSequence);
    }

    /* renamed from: c */
    public final void m1668c(CharSequence charSequence) {
        this.f2286b.setText(charSequence);
    }

    /* renamed from: a */
    public final void m1652a(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 19 || Build.VERSION.SDK_INT >= 26) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2286b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f2286b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f2286b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f2286b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
        SparseArray<WeakReference<ClickableSpan>> m1642f = m1642f(view);
        if (m1642f != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < m1642f.size(); i++) {
                if (m1642f.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                m1642f.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
        ClickableSpan[] m1641d = m1641d(charSequence);
        if (m1641d == null || m1641d.length <= 0) {
            return;
        }
        m1644y().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", androidx.core.R.id.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> m1642f2 = m1642f(view);
        if (m1642f2 == null) {
            m1642f2 = new SparseArray<>();
            view.setTag(androidx.core.R.id.tag_accessibility_clickable_spans, m1642f2);
        }
        for (int i3 = 0; m1641d != null && i3 < m1641d.length; i3++) {
            int m1633a = m1633a(m1641d[i3], m1642f2);
            m1642f2.put(m1633a, new WeakReference<>(m1641d[i3]));
            ClickableSpan clickableSpan = m1641d[i3];
            Spanned spanned = (Spanned) charSequence;
            m1637a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            m1637a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
            m1637a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
            m1637a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(m1633a));
        }
    }

    /* renamed from: f */
    private static SparseArray<WeakReference<ClickableSpan>> m1642f(View view) {
        return (SparseArray) view.getTag(androidx.core.R.id.tag_accessibility_clickable_spans);
    }

    /* renamed from: d */
    public static ClickableSpan[] m1641d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: a */
    private static int m1633a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f2284d;
        f2284d = i2 + 1;
        return i2;
    }

    /* renamed from: t */
    public final CharSequence m1705t() {
        return this.f2286b.getContentDescription();
    }

    /* renamed from: e */
    public final void m1676e(CharSequence charSequence) {
        this.f2286b.setContentDescription(charSequence);
    }

    /* renamed from: u */
    public final void m1706u() {
        this.f2286b.recycle();
    }

    /* renamed from: a */
    public final void m1653a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2286b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0484e) obj).f2329a);
        }
    }

    /* renamed from: b */
    public final void m1661b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2286b.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0485f) obj).f2330a);
        }
    }

    /* renamed from: a */
    public final void m1650a(C0486g c0486g) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2286b.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c0486g.f2331a);
        }
    }

    /* renamed from: x */
    private List<C0483d> m1643x() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f2286b.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C0483d(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: f */
    public final void m1678f(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2286b.setHintText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f2286b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: g */
    public final void m1681g(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2286b.setError(charSequence);
        }
    }

    /* renamed from: v */
    public final void m1707v() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2286b.setCanOpenPopup(true);
        }
    }

    /* renamed from: y */
    private Bundle m1644y() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f2286b.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: c */
    public final void m1665c(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2286b.setMaxTextLength(i);
        }
    }

    /* renamed from: h */
    public final void m1684h(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2286b.setPaneTitle(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f2286b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: l */
    public final void m1694l(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2286b.setScreenReaderFocusable(z);
        } else {
            m1638a(1, z);
        }
    }

    /* renamed from: w */
    public final boolean m1708w() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f2286b.isShowingHintText();
        }
        Bundle m1644y = m1644y();
        return m1644y != null && (m1644y.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
    }

    /* renamed from: m */
    public final void m1696m(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2286b.setShowingHintText(z);
        } else {
            m1638a(4, z);
        }
    }

    /* renamed from: n */
    public final void m1698n(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2286b.setHeading(z);
        } else {
            m1638a(2, z);
        }
    }

    /* renamed from: i */
    public final void m1687i(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2286b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public final int hashCode() {
        if (this.f2286b == null) {
            return 0;
        }
        return this.f2286b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0482c)) {
            return false;
        }
        C0482c c0482c = (C0482c) obj;
        if (this.f2286b == null) {
            if (c0482c.f2286b != null) {
                return false;
            }
        } else if (!this.f2286b.equals(c0482c.f2286b)) {
            return false;
        }
        return this.f2287c == c0482c.f2287c && this.f2285a == c0482c.f2285a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m1647a(rect);
        sb.append("; boundsInParent: ".concat(String.valueOf(rect)));
        m1666c(rect);
        sb.append("; boundsInScreen: ".concat(String.valueOf(rect)));
        sb.append("; packageName: ");
        sb.append(this.f2286b.getPackageName());
        sb.append("; className: ");
        sb.append(this.f2286b.getClassName());
        sb.append("; text: ");
        sb.append(m1704s());
        sb.append("; contentDescription: ");
        sb.append(this.f2286b.getContentDescription());
        sb.append("; viewId: ");
        sb.append(Build.VERSION.SDK_INT >= 18 ? this.f2286b.getViewIdResourceName() : null);
        sb.append("; checkable: ");
        sb.append(this.f2286b.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f2286b.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f2286b.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f2286b.isFocused());
        sb.append("; selected: ");
        sb.append(this.f2286b.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f2286b.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f2286b.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f2286b.isEnabled());
        sb.append("; password: ");
        sb.append(this.f2286b.isPassword());
        sb.append("; scrollable: " + this.f2286b.isScrollable());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C0483d> m1643x = m1643x();
            for (int i = 0; i < m1643x.size(); i++) {
                C0483d c0483d = m1643x.get(i);
                String m1640d = m1640d(c0483d.m1709a());
                if (m1640d.equals("ACTION_UNKNOWN") && c0483d.m1712b() != null) {
                    m1640d = c0483d.m1712b().toString();
                }
                sb.append(m1640d);
                if (i != m1643x.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int actions = this.f2286b.getActions();
            while (actions != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
                actions &= ~numberOfTrailingZeros;
                sb.append(m1640d(numberOfTrailingZeros));
                if (actions != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    private void m1638a(int i, boolean z) {
        Bundle m1644y = m1644y();
        if (m1644y != null) {
            int i2 = m1644y.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            m1644y.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: s */
    public final CharSequence m1704s() {
        if (!m1637a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List<Integer> m1637a = m1637a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> m1637a2 = m1637a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> m1637a3 = m1637a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> m1637a4 = m1637a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2286b.getText(), 0, this.f2286b.getText().length()));
            for (int i = 0; i < m1637a.size(); i++) {
                spannableString.setSpan(new C0480a(m1637a4.get(i).intValue(), this, m1644y().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m1637a.get(i).intValue(), m1637a2.get(i).intValue(), m1637a3.get(i).intValue());
            }
            return spannableString;
        }
        return this.f2286b.getText();
    }
}
