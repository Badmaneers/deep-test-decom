package com.color.support.widget.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1342g;

/* loaded from: classes.dex */
public class ColorToolNavigationMenuView extends ColorNavigationMenuView {

    /* renamed from: a */
    private int f7501a;

    /* renamed from: b */
    private int f7502b;

    /* renamed from: c */
    private int[] f7503c;

    /* renamed from: d */
    private int f7504d;

    /* renamed from: e */
    private int f7505e;

    /* renamed from: f */
    private int f7506f;

    public ColorToolNavigationMenuView(Context context) {
        this(context, null);
    }

    public ColorToolNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.f7502b = resources.getDimensionPixelSize(R.dimen.color_tool_navigation_edge_item_padding);
        this.f7503c = new int[5];
        this.f7504d = resources.getDimensionPixelSize(R.dimen.color_tool_navigation_item_min_width);
        this.f7505e = resources.getDimensionPixelSize(R.dimen.color_tool_navigation_item_icon_margin_horizontal);
        this.f7506f = resources.getDimensionPixelSize(R.dimen.color_tool_navigation_icon_margin_top);
    }

    public ColorToolNavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.color.support.widget.navigation.ColorNavigationMenuView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        View view;
        int size = View.MeasureSpec.getSize(i) - (this.f7502b * 2);
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f7501a, 1073741824);
        int i4 = size / (childCount == 0 ? 1 : childCount);
        int i5 = size - (i4 * childCount);
        for (int i6 = 0; i6 < childCount; i6++) {
            this.f7503c[i6] = i4;
            if (i5 > 0) {
                int[] iArr = this.f7503c;
                iArr[i6] = iArr[i6] + 1;
                i5--;
            }
        }
        if (C1342g.m4385a(getContext())) {
            i3 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                TextView textView = (TextView) childAt.findViewById(R.id.normalLable);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) childAt.findViewById(R.id.icon).getLayoutParams();
                layoutParams.topMargin = this.f7506f;
                int measureText = (int) textView.getPaint().measureText(textView.getText().toString());
                if (childAt.getVisibility() != 8) {
                    switch (childCount) {
                        case 1:
                            view = childAt;
                            m5315a(layoutParams, 0);
                            m5313a(measureText, textView, 0);
                            m5314a(view, i7, this.f7502b, this.f7502b, makeMeasureSpec);
                            break;
                        case 2:
                        case 3:
                            view = childAt;
                            if (i7 == 0) {
                                m5315a(layoutParams, 1);
                                m5313a(measureText, textView, 1);
                                m5314a(view, i7, this.f7502b, 0, makeMeasureSpec);
                                break;
                            } else if (i7 == childCount - 1) {
                                m5315a(layoutParams, 2);
                                m5313a(measureText, textView, 2);
                                m5314a(view, i7, 0, this.f7502b, makeMeasureSpec);
                                break;
                            } else {
                                m5315a(layoutParams, 0);
                                m5313a(measureText, textView, 0);
                                m5314a(view, i7, 0, 0, makeMeasureSpec);
                                break;
                            }
                        case 4:
                        case 5:
                            if (i7 == 0) {
                                m5315a(layoutParams, 0);
                                m5313a(measureText, textView, 0);
                                view = childAt;
                                m5314a(childAt, i7, this.f7502b, 0, makeMeasureSpec);
                                break;
                            } else {
                                view = childAt;
                                if (i7 == childCount - 1) {
                                    m5315a(layoutParams, 0);
                                    m5313a(measureText, textView, 0);
                                    m5314a(view, i7, 0, this.f7502b, makeMeasureSpec);
                                    break;
                                } else {
                                    m5315a(layoutParams, 0);
                                    m5313a(measureText, textView, 0);
                                    m5314a(view, i7, 0, 0, makeMeasureSpec);
                                    break;
                                }
                            }
                        default:
                            view = childAt;
                            break;
                    }
                    view.getLayoutParams().width = view.getMeasuredWidth();
                    i3 += view.getMeasuredWidth();
                }
            }
        } else {
            i3 = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt2 = getChildAt(i8);
                RelativeLayout relativeLayout = (RelativeLayout) childAt2.findViewById(R.id.rl_content);
                if (childAt2.getVisibility() != 8) {
                    switch (childCount) {
                        case 1:
                            relativeLayout.setGravity(1);
                            m5314a(childAt2, i8, this.f7502b, this.f7502b, makeMeasureSpec);
                            break;
                        case 2:
                        case 3:
                            if (i8 == 0) {
                                relativeLayout.setGravity(8388611);
                                m5314a(childAt2, i8, this.f7502b, 0, makeMeasureSpec);
                                break;
                            } else if (i8 == childCount - 1) {
                                relativeLayout.setGravity(8388613);
                                m5314a(childAt2, i8, 0, this.f7502b, makeMeasureSpec);
                                break;
                            } else {
                                relativeLayout.setGravity(1);
                                break;
                            }
                        case 4:
                        case 5:
                            relativeLayout.setGravity(1);
                            if (i8 == 0) {
                                m5314a(childAt2, i8, this.f7502b, 0, makeMeasureSpec);
                                break;
                            } else if (i8 == childCount - 1) {
                                m5314a(childAt2, i8, 0, this.f7502b, makeMeasureSpec);
                                break;
                            }
                            break;
                    }
                    m5314a(childAt2, i8, 0, 0, makeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    i3 += childAt2.getMeasuredWidth();
                    continue;
                }
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i3, View.MeasureSpec.makeMeasureSpec(i3, 1073741824), 0), View.resolveSizeAndState(this.f7501a, makeMeasureSpec, 0));
    }

    @Override // com.color.support.widget.navigation.ColorNavigationMenuView
    public void setItemHeight(int i) {
        this.f7501a = i;
    }

    /* renamed from: d */
    private boolean m5316d() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: a */
    private void m5315a(RelativeLayout.LayoutParams layoutParams, int i) {
        layoutParams.addRule(i == 1 ? 20 : i == 2 ? 21 : 14, -1);
        if (!m5316d()) {
            layoutParams.leftMargin = i == 1 ? this.f7505e : 0;
            layoutParams.rightMargin = i == 2 ? this.f7505e : 0;
        } else {
            layoutParams.rightMargin = i == 1 ? this.f7505e : 0;
            layoutParams.leftMargin = i == 2 ? this.f7505e : 0;
        }
    }

    /* renamed from: a */
    private void m5314a(View view, int i, int i2, int i3, int i4) {
        view.setPadding(m5316d() ? i3 : i2, 0, m5316d() ? i2 : i3, 0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f7503c[i] + i2 + i3, 1073741824), i4);
    }

    /* renamed from: a */
    private void m5313a(int i, TextView textView, int i2) {
        if (i >= this.f7504d) {
            i = this.f7504d;
        }
        switch (i2) {
            case 0:
                textView.setTextAlignment(4);
                textView.setPadding(0, 0, 0, 0);
                return;
            case 1:
                textView.setTextAlignment(5);
                textView.setPadding(m5316d() ? 0 : (this.f7504d - i) / 2, 0, m5316d() ? (this.f7504d - i) / 2 : 0, 0);
                return;
            case 2:
                textView.setTextAlignment(6);
                textView.setPadding(m5316d() ? (this.f7504d - i) / 2 : 0, 0, m5316d() ? 0 : (this.f7504d - i) / 2, 0);
                return;
            default:
                return;
        }
    }
}
