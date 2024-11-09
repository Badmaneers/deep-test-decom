package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p019c.C0419a;
import androidx.core.p023f.C0478i;
import androidx.core.p024g.C0505af;
import androidx.core.p024g.C0529n;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0527l;
import androidx.core.p024g.InterfaceC0528m;
import androidx.core.p024g.p025a.C0481b;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0527l, InterfaceC0528m {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    C0880cf mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    AbstractC0845ay mAdapter;
    C0820a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC0849bb mChildDrawingOrderCallback;
    C0899d mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0850bc mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC0919x mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC0864bq mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC0851bd mItemAnimator;
    private InterfaceC0852be mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<AbstractC0855bh> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    AbstractC0856bi mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C0870bw mObserver;
    private List<InterfaceC0862bo> mOnChildAttachStateListeners;
    private AbstractC0863bp mOnFlingListener;
    private final ArrayList<InterfaceC0864bq> mOnItemTouchListeners;
    final List<AbstractC0879ce> mPendingAccessibilityImportanceChange;
    private SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    C0921z mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C0868bu mRecycler;
    InterfaceC0869bv mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC0865br mScrollListener;
    private List<AbstractC0865br> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0529n mScrollingChildHelper;
    final C0876cb mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RunnableC0878cd mViewFlinger;
    private final InterfaceC0898cx mViewInfoProcessCallback;
    final C0896cv mViewInfoStore;

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    static {
        FORCE_INVALIDATE_DISPLAY_LIST = Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = Build.VERSION.SDK_INT >= 23;
        POST_UPDATES_ON_ANIMATION = Build.VERSION.SDK_INT >= 16;
        ALLOW_THREAD_GAP_WORK = Build.VERSION.SDK_INT >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = Build.VERSION.SDK_INT <= 15;
        IGNORE_DETACHED_FOCUSED_CHILD = Build.VERSION.SDK_INT <= 15;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        sQuinticInterpolator = new InterpolatorC0841au();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C0870bw(this);
        this.mRecycler = new C0868bu(this);
        this.mViewInfoStore = new C0896cv();
        this.mUpdateChildViewsRunnable = new RunnableC0839as(this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C0850bc();
        this.mItemAnimator = new C0903h();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC0878cd(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C0921z() : null;
        this.mState = new C0876cb();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0854bg(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC0840at(this);
        this.mViewInfoProcessCallback = new C0842av(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C0505af.m1738a(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C0505af.m1740b(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.m3040a(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C0538w.m1876g(this) == 0) {
            C0538w.m1840a((View) this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0880cf(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, androidx.recyclerview.R.styleable.RecyclerView, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        this.mEnableFastScroller = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
        if (this.mEnableFastScroller) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C0538w.m1836a(this) == 0) {
            C0538w.m1860b(this);
        }
    }

    public C0880cf getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(C0880cf c0880cf) {
        this.mAccessibilityDelegate = c0880cf;
        C0538w.m1849a(this, this.mAccessibilityDelegate);
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(AbstractC0856bi.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC0856bi) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            }
        }
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0899d(new C0843aw(this));
    }

    void initAdapterManager() {
        this.mAdapterHelper = new C0820a(new C0844ax(this));
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
                break;
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void swapAdapter(AbstractC0845ay abstractC0845ay, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0845ay, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void setAdapter(AbstractC0845ay abstractC0845ay) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0845ay, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void removeAndRecycleViews() {
        if (this.mItemAnimator != null) {
            this.mItemAnimator.mo3048d();
        }
        if (this.mLayout != null) {
            this.mLayout.m3108c(this.mRecycler);
            this.mLayout.m3105b(this.mRecycler);
        }
        this.mRecycler.m3158a();
    }

    private void setAdapterInternal(AbstractC0845ay abstractC0845ay, boolean z, boolean z2) {
        if (this.mAdapter != null) {
            this.mAdapter.m3023b(this.mObserver);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m2923a();
        AbstractC0845ay abstractC0845ay2 = this.mAdapter;
        this.mAdapter = abstractC0845ay;
        if (abstractC0845ay != null) {
            abstractC0845ay.m3017a(this.mObserver);
        }
        C0868bu c0868bu = this.mRecycler;
        AbstractC0845ay abstractC0845ay3 = this.mAdapter;
        c0868bu.m3158a();
        c0868bu.m3173e().m3143a(abstractC0845ay2, abstractC0845ay3, z);
        this.mState.f3594f = true;
    }

    public AbstractC0845ay getAdapter() {
        return this.mAdapter;
    }

    public void setRecyclerListener(InterfaceC0869bv interfaceC0869bv) {
        this.mRecyclerListener = interfaceC0869bv;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.mLayout != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC0862bo interfaceC0862bo) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC0862bo);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC0862bo interfaceC0862bo) {
        if (this.mOnChildAttachStateListeners == null) {
            return;
        }
        this.mOnChildAttachStateListeners.remove(interfaceC0862bo);
    }

    public void clearOnChildAttachStateChangeListeners() {
        if (this.mOnChildAttachStateListeners != null) {
            this.mOnChildAttachStateListeners.clear();
        }
    }

    public void setLayoutManager(AbstractC0856bi abstractC0856bi) {
        if (abstractC0856bi == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            if (this.mItemAnimator != null) {
                this.mItemAnimator.mo3048d();
            }
            this.mLayout.m3108c(this.mRecycler);
            this.mLayout.m3105b(this.mRecycler);
            this.mRecycler.m3158a();
            if (this.mIsAttached) {
                this.mLayout.m3104b(this, this.mRecycler);
            }
            this.mLayout.m3093a((RecyclerView) null);
            this.mLayout = null;
        } else {
            this.mRecycler.m3158a();
        }
        C0899d c0899d = this.mChildHelper;
        C0900e c0900e = c0899d.f3673b;
        while (true) {
            c0900e.f3675a = 0L;
            if (c0900e.f3676b == null) {
                break;
            } else {
                c0900e = c0900e.f3676b;
            }
        }
        for (int size = c0899d.f3674c.size() - 1; size >= 0; size--) {
            c0899d.f3672a.mo3004d(c0899d.f3674c.get(size));
            c0899d.f3674c.remove(size);
        }
        c0899d.f3672a.mo3001b();
        this.mLayout = abstractC0856bi;
        if (abstractC0856bi != null) {
            if (abstractC0856bi.f3535q != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0856bi + " is already attached to a RecyclerView:" + abstractC0856bi.f3535q.exceptionLabel());
            }
            this.mLayout.m3093a(this);
            if (this.mIsAttached) {
                this.mLayout.f3540v = true;
            }
        }
        this.mRecycler.m3165b();
        requestLayout();
    }

    public void setOnFlingListener(AbstractC0863bp abstractC0863bp) {
        this.mOnFlingListener = abstractC0863bp;
    }

    public AbstractC0863bp getOnFlingListener() {
        return this.mOnFlingListener;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.mPendingSavedState == null) {
            if (this.mLayout != null) {
                savedState.f3400a = this.mLayout.mo2840f();
            } else {
                savedState.f3400a = null;
            }
        } else {
            savedState.f3400a = this.mPendingSavedState.f3400a;
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.mPendingSavedState = (SavedState) parcelable;
        super.onRestoreInstanceState(this.mPendingSavedState.m2149a());
        if (this.mLayout == null || this.mPendingSavedState.f3400a == null) {
            return;
        }
        this.mLayout.mo2826a(this.mPendingSavedState.f3400a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void addAnimatingView(AbstractC0879ce abstractC0879ce) {
        View view = abstractC0879ce.f3614a;
        boolean z = view.getParent() == this;
        this.mRecycler.m3167b(getChildViewHolder(view));
        if (abstractC0879ce.m3221o()) {
            this.mChildHelper.m3287a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.m3286a(view);
        } else {
            this.mChildHelper.m3296e(view);
        }
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean m3298g = this.mChildHelper.m3298g(view);
        if (m3298g) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m3167b(childViewHolderInt);
            this.mRecycler.m3162a(childViewHolderInt);
        }
        stopInterceptRequestLayout(!m3298g);
        return m3298g;
    }

    public AbstractC0856bi getLayoutManager() {
        return this.mLayout;
    }

    public C0866bs getRecycledViewPool() {
        return this.mRecycler.m3173e();
    }

    public void setRecycledViewPool(C0866bs c0866bs) {
        C0868bu c0868bu = this.mRecycler;
        if (c0868bu.f3564e != null) {
            c0868bu.f3564e.m3146b();
        }
        c0868bu.f3564e = c0866bs;
        if (c0868bu.f3564e == null || c0868bu.f3565f.getAdapter() == null) {
            return;
        }
        c0868bu.f3564e.m3141a();
    }

    public void setViewCacheExtension(AbstractC0877cc abstractC0877cc) {
        this.mRecycler.m3161a(abstractC0877cc);
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.m3159a(i);
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void addItemDecoration(AbstractC0855bh abstractC0855bh, int i) {
        if (this.mLayout != null) {
            this.mLayout.mo2831a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(abstractC0855bh);
        } else {
            this.mItemDecorations.add(i, abstractC0855bh);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(AbstractC0855bh abstractC0855bh) {
        addItemDecoration(abstractC0855bh, -1);
    }

    public AbstractC0855bh getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        return this.mItemDecorations.get(i);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeItemDecoration(AbstractC0855bh abstractC0855bh) {
        if (this.mLayout != null) {
            this.mLayout.mo2831a("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC0855bh);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0849bb interfaceC0849bb) {
        if (interfaceC0849bb == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC0849bb;
        setChildrenDrawingOrderEnabled(this.mChildDrawingOrderCallback != null);
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0865br abstractC0865br) {
        this.mScrollListener = abstractC0865br;
    }

    public void addOnScrollListener(AbstractC0865br abstractC0865br) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC0865br);
    }

    public void removeOnScrollListener(AbstractC0865br abstractC0865br) {
        if (this.mScrollListeners != null) {
            this.mScrollListeners.remove(abstractC0865br);
        }
    }

    public void clearOnScrollListeners() {
        if (this.mScrollListeners != null) {
            this.mScrollListeners.clear();
        }
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            this.mLayout.mo2836d(i);
            awakenScrollBars();
        }
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.mo2836d(i);
        awakenScrollBars();
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            this.mLayout.mo2828a(this, i);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean mo2842g = this.mLayout.mo2842g();
        boolean mo2843h = this.mLayout.mo2843h();
        if (mo2842g || mo2843h) {
            if (!mo2842g) {
                i = 0;
            }
            if (!mo2843h) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null);
        }
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0419a.m1480a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int mo2772a = i != 0 ? this.mLayout.mo2772a(i, this.mRecycler, this.mState) : 0;
        int mo2787b = i2 != 0 ? this.mLayout.mo2787b(i2, this.mRecycler, this.mState) : 0;
        C0419a.m1479a();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = mo2772a;
            iArr[1] = mo2787b;
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C0419a.m1480a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C0419a.m1479a();
            return;
        }
        if (this.mAdapterHelper.m2930d()) {
            if (this.mAdapterHelper.m2925a(4) && !this.mAdapterHelper.m2925a(11)) {
                C0419a.m1480a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.m2927b();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.m2929c();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                C0419a.m1479a();
                return;
            }
            if (this.mAdapterHelper.m2930d()) {
                C0419a.m1480a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                C0419a.m1479a();
            }
        }
    }

    private boolean hasUpdatedView() {
        int m3284a = this.mChildHelper.m3284a();
        for (int i = 0; i < m3284a; i++) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3290b(i));
            if (childViewHolderInt != null && !childViewHolderInt.m3208b() && childViewHolderInt.m3228v()) {
                return true;
            }
        }
        return false;
    }

    boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            this.mReusableIntPair[0] = 0;
            this.mReusableIntPair[1] = 0;
            scrollStep(i, i2, this.mReusableIntPair);
            int i7 = this.mReusableIntPair[0];
            int i8 = this.mReusableIntPair[1];
            i3 = i7;
            i4 = i8;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        this.mReusableIntPair[0] = 0;
        this.mReusableIntPair[1] = 0;
        dispatchNestedScroll(i3, i4, i5, i6, this.mScrollOffset, 0, this.mReusableIntPair);
        int i9 = i5 - this.mReusableIntPair[0];
        int i10 = i6 - this.mReusableIntPair[1];
        boolean z = (this.mReusableIntPair[0] == 0 && this.mReusableIntPair[1] == 0) ? false : true;
        this.mLastTouchX -= this.mScrollOffset[0];
        this.mLastTouchY -= this.mScrollOffset[1];
        int[] iArr = this.mNestedOffsets;
        iArr[0] = iArr[0] + this.mScrollOffset[0];
        int[] iArr2 = this.mNestedOffsets;
        iArr2[1] = iArr2[1] + this.mScrollOffset[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    pullGlows(motionEvent.getX(), i9, motionEvent.getY(), i10);
                }
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i3 != 0 || i4 != 0) {
            dispatchOnScrolled(i3, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i3 == 0 && i4 == 0) ? false : true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        if (this.mLayout != null && this.mLayout.mo2842g()) {
            return this.mLayout.mo2798e(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        if (this.mLayout != null && this.mLayout.mo2842g()) {
            return this.mLayout.mo2839f(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        if (this.mLayout != null && this.mLayout.mo2842g()) {
            return this.mLayout.mo2795d(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        if (this.mLayout != null && this.mLayout.mo2843h()) {
            return this.mLayout.mo2744b(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        if (this.mLayout != null && this.mLayout.mo2843h()) {
            return this.mLayout.mo2841g(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        if (this.mLayout != null && this.mLayout.mo2843h()) {
            return this.mLayout.mo2743a(this.mState);
        }
        return 0;
    }

    void startInterceptRequestLayout() {
        this.mInterceptRequestLayoutDepth++;
        if (this.mInterceptRequestLayoutDepth != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth <= 0) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!this.mLayout.mo2842g()) {
            i = 0;
        }
        if (!this.mLayout.mo2843h()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 == Integer.MIN_VALUE || i3 > 0) {
            if (z) {
                int i4 = i != 0 ? 1 : 0;
                if (i2 != 0) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
            }
            this.mViewFlinger.m3196a(i, i2, i3, interpolator);
            return;
        }
        scrollBy(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public boolean fling(int i, int i2) {
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int mo2842g = this.mLayout.mo2842g();
        boolean mo2843h = this.mLayout.mo2843h();
        if (mo2842g == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!mo2843h || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = i;
        float f2 = i2;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = mo2842g != 0 || mo2843h;
            dispatchNestedFling(f, f2, z);
            if (this.mOnFlingListener != null && this.mOnFlingListener.mo3133a(i, i2)) {
                return true;
            }
            if (z) {
                if (mo2843h) {
                    mo2842g = (mo2842g == true ? 1 : 0) | 2;
                }
                startNestedScroll(mo2842g, 1);
                this.mViewFlinger.m3195a(Math.max(-this.mMaxFlingVelocity, Math.min(i, this.mMaxFlingVelocity)), Math.max(-this.mMaxFlingVelocity, Math.min(i2, this.mMaxFlingVelocity)));
                return true;
            }
        }
        return false;
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.m3197b();
        if (this.mLayout != null) {
            this.mLayout.m3087G();
        }
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.C0570h.m2038a(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C0570h.m2038a(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.C0570h.m2038a(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.C0570h.m2038a(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.p024g.C0538w.m1874f(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void releaseGlows() {
        boolean z;
        if (this.mLeftGlow != null) {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        if (this.mTopGlow != null) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        if (this.mRightGlow != null) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        if (this.mBottomGlow != null) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0538w.m1874f(this);
        }
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        if (this.mLeftGlow == null || this.mLeftGlow.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        if (this.mRightGlow != null && !this.mRightGlow.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        if (this.mTopGlow != null && !this.mTopGlow.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        if (this.mBottomGlow != null && !this.mBottomGlow.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0538w.m1874f(this);
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        C0538w.m1874f(this);
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        this.mLeftGlow = C0850bc.m3036a(this);
        if (this.mClipToPadding) {
            this.mLeftGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.mLeftGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        this.mRightGlow = C0850bc.m3036a(this);
        if (this.mClipToPadding) {
            this.mRightGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.mRightGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        this.mTopGlow = C0850bc.m3036a(this);
        if (this.mClipToPadding) {
            this.mTopGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.mTopGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        this.mBottomGlow = C0850bc.m3036a(this);
        if (this.mClipToPadding) {
            this.mBottomGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.mBottomGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void setEdgeEffectFactory(C0850bc c0850bc) {
        C0478i.m1620a(c0850bc);
        this.mEdgeEffectFactory = c0850bc;
        invalidateGlows();
    }

    public C0850bc getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.mo2843h()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.mo2842g()) {
                int i3 = (C0538w.m1878h(this.mLayout.f3535q) == 1) ^ (i == 2) ? 66 : 17;
                z = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo2774a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo2774a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(view2, null);
        return view;
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        int i3 = C0538w.m1878h(this.mLayout.f3535q) == 1 ? -1 : 1;
        if ((this.mTempRect.left < this.mTempRect2.left || this.mTempRect.right <= this.mTempRect2.left) && this.mTempRect.right < this.mTempRect2.right) {
            i2 = 1;
        } else {
            i2 = ((this.mTempRect.right > this.mTempRect2.right || this.mTempRect.left >= this.mTempRect2.right) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        if ((this.mTempRect.top < this.mTempRect2.top || this.mTempRect.bottom <= this.mTempRect2.top) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c = 1;
        } else if ((this.mTempRect.bottom <= this.mTempRect2.bottom && this.mTempRect.top < this.mTempRect2.bottom) || this.mTempRect.top <= this.mTempRect2.top) {
            c = 0;
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        switch (i) {
            case 1:
                return c < 0 || (c == 0 && i2 * i3 <= 0);
            case 2:
                return c > 0 || (c == 0 && i2 * i3 >= 0);
            default:
                throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!(this.mLayout.m3119t() || isComputingLayout()) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0861bn) {
            C0861bn c0861bn = (C0861bn) layoutParams;
            if (!c0861bn.f3552e) {
                Rect rect = c0861bn.f3551d;
                this.mTempRect.left -= rect.left;
                this.mTempRect.right += rect.right;
                this.mTempRect.top -= rect.top;
                this.mTempRect.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.mo3098a(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.mo3098a(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:            if (r0 >= 30.0f) goto L48;     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.mLayoutOrScrollCounter = r0
            r1 = 1
            r4.mIsAttached = r1
            boolean r2 = r4.mFirstLayoutComplete
            if (r2 == 0) goto L15
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r4.mFirstLayoutComplete = r2
            androidx.recyclerview.widget.bi r2 = r4.mLayout
            if (r2 == 0) goto L20
            androidx.recyclerview.widget.bi r2 = r4.mLayout
            r2.f3540v = r1
        L20:
            r4.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L6c
            java.lang.ThreadLocal<androidx.recyclerview.widget.x> r0 = androidx.recyclerview.widget.RunnableC0919x.f3770a
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.x r0 = (androidx.recyclerview.widget.RunnableC0919x) r0
            r4.mGapWorker = r0
            androidx.recyclerview.widget.x r0 = r4.mGapWorker
            if (r0 != 0) goto L65
            androidx.recyclerview.widget.x r0 = new androidx.recyclerview.widget.x
            r0.<init>()
            r4.mGapWorker = r0
            android.view.Display r0 = androidx.core.p024g.C0538w.m1824H(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L54
            if (r0 == 0) goto L54
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L54
            goto L55
        L54:
            r0 = r1
        L55:
            androidx.recyclerview.widget.x r1 = r4.mGapWorker
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f3774d = r2
            java.lang.ThreadLocal<androidx.recyclerview.widget.x> r0 = androidx.recyclerview.widget.RunnableC0919x.f3770a
            androidx.recyclerview.widget.x r1 = r4.mGapWorker
            r0.set(r1)
        L65:
            androidx.recyclerview.widget.x r0 = r4.mGapWorker
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f3772b
            r0.add(r4)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mItemAnimator != null) {
            this.mItemAnimator.mo3048d();
        }
        stopScroll();
        this.mIsAttached = false;
        if (this.mLayout != null) {
            this.mLayout.m3104b(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        C0897cw.m3280b();
        if (!ALLOW_THREAD_GAP_WORK || this.mGapWorker == null) {
            return;
        }
        this.mGapWorker.f3772b.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(exceptionLabel()));
        }
    }

    public void addOnItemTouchListener(InterfaceC0864bq interfaceC0864bq) {
        this.mOnItemTouchListeners.add(interfaceC0864bq);
    }

    public void removeOnItemTouchListener(InterfaceC0864bq interfaceC0864bq) {
        this.mOnItemTouchListeners.remove(interfaceC0864bq);
        if (this.mInterceptingOnItemTouchListener == interfaceC0864bq) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        if (this.mInterceptingOnItemTouchListener == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        this.mInterceptingOnItemTouchListener.mo3135b(motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0864bq interfaceC0864bq = this.mOnItemTouchListeners.get(i);
            if (interfaceC0864bq.mo3134a(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC0864bq;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        if (this.mLayout == null) {
            return false;
        }
        boolean mo2842g = this.mLayout.mo2842g();
        boolean mo2843h = this.mLayout.mo2843h();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case 0:
                if (this.mIgnoreMotionEventTillDown) {
                    this.mIgnoreMotionEventTillDown = false;
                }
                this.mScrollPointerId = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.mLastTouchX = x;
                this.mInitialTouchX = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.mLastTouchY = y;
                this.mInitialTouchY = y;
                if (this.mScrollState == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    stopNestedScroll(1);
                }
                int[] iArr = this.mNestedOffsets;
                this.mNestedOffsets[1] = 0;
                iArr[0] = 0;
                int i = mo2842g;
                if (mo2843h) {
                    i = (mo2842g ? 1 : 0) | 2;
                }
                startNestedScroll(i, 0);
                break;
            case 1:
                this.mVelocityTracker.clear();
                stopNestedScroll(0);
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (findPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                if (this.mScrollState != 1) {
                    int i2 = x2 - this.mInitialTouchX;
                    int i3 = y2 - this.mInitialTouchY;
                    if (mo2842g == 0 || Math.abs(i2) <= this.mTouchSlop) {
                        z = false;
                    } else {
                        this.mLastTouchX = x2;
                        z = true;
                    }
                    if (mo2843h && Math.abs(i3) > this.mTouchSlop) {
                        this.mLastTouchY = y2;
                        z = true;
                    }
                    if (z) {
                        setScrollState(1);
                        break;
                    }
                }
                break;
            case 3:
                cancelScroll();
                break;
            case 5:
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
                break;
            case 6:
                onPointerUp(motionEvent);
                break;
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void resetScroll() {
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.bi r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L76
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.bi r0 = r5.mLayout
            boolean r0 = r0.mo2843h()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.bi r3 = r5.mLayout
            boolean r3 = r3.mo2842g()
            if (r3 == 0) goto L54
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L63
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L61
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.bi r3 = r5.mLayout
            boolean r3 = r3.mo2843h()
            if (r3 == 0) goto L56
            float r0 = -r0
        L54:
            r3 = r2
            goto L63
        L56:
            androidx.recyclerview.widget.bi r3 = r5.mLayout
            boolean r3 = r3.mo2842g()
            if (r3 == 0) goto L61
            r3 = r0
            r0 = r2
            goto L63
        L61:
            r0 = r2
            r3 = r0
        L63:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6b
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L76
        L6b:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.scrollByInternal(r2, r0, r6)
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mLayout == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (this.mLayout.mo2838e()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.m3114g(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f3592d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.m3110e(i, i2);
            this.mState.f3597i = true;
            dispatchLayoutStep2();
            this.mLayout.m3113f(i, i2);
            if (this.mLayout.mo2848m()) {
                this.mLayout.m3110e(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f3597i = true;
                dispatchLayoutStep2();
                this.mLayout.m3113f(i, i2);
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.m3114g(i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            if (this.mState.f3599k) {
                this.mState.f3595g = true;
            } else {
                this.mAdapterHelper.m2931e();
                this.mState.f3595g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f3599k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (this.mAdapter != null) {
            this.mState.f3593e = this.mAdapter.mo3020b();
        } else {
            this.mState.f3593e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.m3114g(i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f3595g = false;
    }

    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(AbstractC0856bi.m3060a(i, getPaddingLeft() + getPaddingRight(), C0538w.m1885n(this)), AbstractC0856bi.m3060a(i2, getPaddingTop() + getPaddingBottom(), C0538w.m1886o(this)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    public void setItemAnimator(AbstractC0851bd abstractC0851bd) {
        if (this.mItemAnimator != null) {
            this.mItemAnimator.mo3048d();
            this.mItemAnimator.m3040a(null);
        }
        this.mItemAnimator = abstractC0851bd;
        if (this.mItemAnimator != null) {
            this.mItemAnimator.m3040a(this.mItemAnimatorListener);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z) {
        this.mLayoutOrScrollCounter--;
        if (this.mLayoutOrScrollCounter <= 0) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public boolean isAccessibilityEnabled() {
        return this.mAccessibilityManager != null && this.mAccessibilityManager.isEnabled();
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        C0481b.m1632a(obtain, i);
        sendAccessibilityEventUnchecked(obtain);
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = (accessibilityEvent == null || Build.VERSION.SDK_INT < 19) ? 0 : accessibilityEvent.getContentChangeTypes();
        if (contentChangeTypes == 0) {
            contentChangeTypes = 0;
        }
        this.mEatenAccessibilityChangeFlags = contentChangeTypes | this.mEatenAccessibilityChangeFlags;
        return true;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public AbstractC0851bd getItemAnimator() {
        return this.mItemAnimator;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        C0538w.m1852a(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo2797d();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m2923a();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo2778a();
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m2927b();
        } else {
            this.mAdapterHelper.m2931e();
        }
        boolean z = false;
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f3598j = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.f3539u) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.m3026c());
        C0876cb c0876cb = this.mState;
        if (this.mState.f3598j && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z = true;
        }
        c0876cb.f3599k = z;
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        boolean z = false;
        this.mState.f3597i = false;
        if (this.mState.f3592d == 1) {
            dispatchLayoutStep1();
            this.mLayout.m3103b(this);
            dispatchLayoutStep2();
        } else {
            C0820a c0820a = this.mAdapterHelper;
            if (!c0820a.f3442b.isEmpty() && !c0820a.f3441a.isEmpty()) {
                z = true;
            }
            if (z || this.mLayout.m3124y() != getWidth() || this.mLayout.m3125z() != getHeight()) {
                this.mLayout.m3103b(this);
                dispatchLayoutStep2();
            } else {
                this.mLayout.m3103b(this);
            }
        }
        dispatchLayoutStep3();
    }

    private void saveFocusInfo() {
        int m3210d;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC0879ce findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f3601m = this.mAdapter.m3026c() ? findContainingViewHolder.f3618e : -1L;
        C0876cb c0876cb = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            m3210d = -1;
        } else {
            m3210d = findContainingViewHolder.m3220n() ? findContainingViewHolder.f3617d : findContainingViewHolder.m3210d();
        }
        c0876cb.f3600l = m3210d;
        this.mState.f3602n = getDeepestFocusedViewWithId(findContainingViewHolder.f3614a);
    }

    private void resetFocusInfo() {
        this.mState.f3601m = -1L;
        this.mState.f3600l = -1;
        this.mState.f3602n = -1;
    }

    private View findNextViewToFocus() {
        AbstractC0879ce findViewHolderForAdapterPosition;
        int i = this.mState.f3600l != -1 ? this.mState.f3600l : 0;
        int m3190a = this.mState.m3190a();
        for (int i2 = i; i2 < m3190a; i2++) {
            AbstractC0879ce findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.f3614a.hasFocusable()) {
                return findViewHolderForAdapterPosition2.f3614a;
            }
        }
        int min = Math.min(m3190a, i);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.f3614a.hasFocusable());
        return findViewHolderForAdapterPosition.f3614a;
    }

    private void recoverFocusFromState() {
        View view;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.mChildHelper.m3284a() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.mChildHelper.m3295d(focusedChild)) {
                return;
            }
        }
        View view2 = null;
        AbstractC0879ce findViewHolderForItemId = (this.mState.f3601m == -1 || !this.mAdapter.m3026c()) ? null : findViewHolderForItemId(this.mState.f3601m);
        if (findViewHolderForItemId == null || this.mChildHelper.m3295d(findViewHolderForItemId.f3614a) || !findViewHolderForItemId.f3614a.hasFocusable()) {
            if (this.mChildHelper.m3284a() > 0) {
                view2 = findNextViewToFocus();
            }
        } else {
            view2 = findViewHolderForItemId.f3614a;
        }
        if (view2 != null) {
            if (this.mState.f3602n == -1 || (view = view2.findViewById(this.mState.f3602n)) == null || !view.isFocusable()) {
                view = view2;
            }
            view.requestFocus();
        }
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    final void fillRemainingScrollValues(C0876cb c0876cb) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f3606a;
            c0876cb.f3603o = overScroller.getFinalX() - overScroller.getCurrX();
            c0876cb.f3604p = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            c0876cb.f3603o = 0;
            c0876cb.f3604p = 0;
        }
    }

    private void dispatchLayoutStep1() {
        this.mState.m3191a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f3597i = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m3268a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        this.mState.f3596h = this.mState.f3598j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        this.mState.f3595g = this.mState.f3599k;
        this.mState.f3593e = this.mAdapter.mo3020b();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f3598j) {
            int m3284a = this.mChildHelper.m3284a();
            for (int i = 0; i < m3284a; i++) {
                AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3290b(i));
                if (!childViewHolderInt.m3208b() && (!childViewHolderInt.m3217k() || this.mAdapter.m3026c())) {
                    AbstractC0851bd.m3038e(childViewHolderInt);
                    childViewHolderInt.m3224r();
                    this.mViewInfoStore.m3270a(childViewHolderInt, new C0853bf().m3057a(childViewHolderInt));
                    if (this.mState.f3596h && childViewHolderInt.m3228v() && !childViewHolderInt.m3220n() && !childViewHolderInt.m3208b() && !childViewHolderInt.m3217k()) {
                        this.mViewInfoStore.m3269a(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f3599k) {
            saveOldPositions();
            boolean z = this.mState.f3594f;
            this.mState.f3594f = false;
            this.mLayout.mo2793c(this.mRecycler, this.mState);
            this.mState.f3594f = z;
            for (int i2 = 0; i2 < this.mChildHelper.m3284a(); i2++) {
                AbstractC0879ce childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m3290b(i2));
                if (!childViewHolderInt2.m3208b()) {
                    C0897cw c0897cw = this.mViewInfoStore.f3666a.get(childViewHolderInt2);
                    if (!((c0897cw == null || (c0897cw.f3669a & 4) == 0) ? false : true)) {
                        AbstractC0851bd.m3038e(childViewHolderInt2);
                        boolean m3205a = childViewHolderInt2.m3205a(8192);
                        childViewHolderInt2.m3224r();
                        C0853bf m3057a = new C0853bf().m3057a(childViewHolderInt2);
                        if (m3205a) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, m3057a);
                        } else {
                            C0896cv c0896cv = this.mViewInfoStore;
                            C0897cw c0897cw2 = c0896cv.f3666a.get(childViewHolderInt2);
                            if (c0897cw2 == null) {
                                c0897cw2 = C0897cw.m3278a();
                                c0896cv.f3666a.put(childViewHolderInt2, c0897cw2);
                            }
                            c0897cw2.f3669a |= 2;
                            c0897cw2.f3670b = m3057a;
                        }
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f3592d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m3191a(6);
        this.mAdapterHelper.m2931e();
        this.mState.f3593e = this.mAdapter.mo3020b();
        this.mState.f3591c = 0;
        this.mState.f3595g = false;
        this.mLayout.mo2793c(this.mRecycler, this.mState);
        this.mState.f3594f = false;
        this.mPendingSavedState = null;
        this.mState.f3598j = this.mState.f3598j && this.mItemAnimator != null;
        this.mState.f3592d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.m3191a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.f3592d = 1;
        if (this.mState.f3598j) {
            for (int m3284a = this.mChildHelper.m3284a() - 1; m3284a >= 0; m3284a--) {
                AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3290b(m3284a));
                if (!childViewHolderInt.m3208b()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    C0853bf m3057a = new C0853bf().m3057a(childViewHolderInt);
                    AbstractC0879ce m1032a = this.mViewInfoStore.f3667b.m1032a(changedHolderKey);
                    if (m1032a != null && !m1032a.m3208b()) {
                        boolean m3271a = this.mViewInfoStore.m3271a(m1032a);
                        boolean m3271a2 = this.mViewInfoStore.m3271a(childViewHolderInt);
                        if (!m3271a || m1032a != childViewHolderInt) {
                            C0853bf m3272b = this.mViewInfoStore.m3272b(m1032a);
                            this.mViewInfoStore.m3273b(childViewHolderInt, m3057a);
                            C0853bf m3274c = this.mViewInfoStore.m3274c(childViewHolderInt);
                            if (m3272b == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, m1032a);
                            } else {
                                animateChange(m1032a, childViewHolderInt, m3272b, m3274c, m3271a, m3271a2);
                            }
                        }
                    }
                    this.mViewInfoStore.m3273b(childViewHolderInt, m3057a);
                }
            }
            C0896cv c0896cv = this.mViewInfoStore;
            InterfaceC0898cx interfaceC0898cx = this.mViewInfoProcessCallback;
            for (int size = c0896cv.f3666a.size() - 1; size >= 0; size--) {
                AbstractC0879ce m1061b = c0896cv.f3666a.m1061b(size);
                C0897cw m1063d = c0896cv.f3666a.m1063d(size);
                if ((m1063d.f3669a & 3) == 3) {
                    interfaceC0898cx.mo2990a(m1061b);
                } else if ((m1063d.f3669a & 1) != 0) {
                    if (m1063d.f3670b == null) {
                        interfaceC0898cx.mo2990a(m1061b);
                    } else {
                        interfaceC0898cx.mo2991a(m1061b, m1063d.f3670b, m1063d.f3671c);
                    }
                } else if ((m1063d.f3669a & 14) == 14) {
                    interfaceC0898cx.mo2992b(m1061b, m1063d.f3670b, m1063d.f3671c);
                } else if ((m1063d.f3669a & 12) == 12) {
                    interfaceC0898cx.mo2993c(m1061b, m1063d.f3670b, m1063d.f3671c);
                } else if ((m1063d.f3669a & 4) != 0) {
                    interfaceC0898cx.mo2991a(m1061b, m1063d.f3670b, null);
                } else if ((m1063d.f3669a & 8) != 0) {
                    interfaceC0898cx.mo2992b(m1061b, m1063d.f3670b, m1063d.f3671c);
                }
                C0897cw.m3279a(m1063d);
            }
        }
        this.mLayout.m3105b(this.mRecycler);
        this.mState.f3590b = this.mState.f3593e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mState.f3598j = false;
        this.mState.f3599k = false;
        this.mLayout.f3539u = false;
        if (this.mRecycler.f3561b != null) {
            this.mRecycler.f3561b.clear();
        }
        if (this.mLayout.f3543y) {
            this.mLayout.f3542x = 0;
            this.mLayout.f3543y = false;
            this.mRecycler.m3165b();
        }
        this.mLayout.mo2794c(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.m3268a();
        if (didChildRangeChange(this.mMinMaxLayoutPositions[0], this.mMinMaxLayoutPositions[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private void handleMissingPreInfoForChangeError(long j, AbstractC0879ce abstractC0879ce, AbstractC0879ce abstractC0879ce2) {
        int m3284a = this.mChildHelper.m3284a();
        for (int i = 0; i < m3284a; i++) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3290b(i));
            if (childViewHolderInt != abstractC0879ce && getChangedHolderKey(childViewHolderInt) == j) {
                if (this.mAdapter != null && this.mAdapter.m3026c()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC0879ce + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC0879ce + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0879ce2 + " cannot be found but it is necessary for " + abstractC0879ce + exceptionLabel());
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC0879ce abstractC0879ce, C0853bf c0853bf) {
        abstractC0879ce.m3199a(0, 8192);
        if (this.mState.f3596h && abstractC0879ce.m3228v() && !abstractC0879ce.m3220n() && !abstractC0879ce.m3208b()) {
            this.mViewInfoStore.m3269a(getChangedHolderKey(abstractC0879ce), abstractC0879ce);
        }
        this.mViewInfoStore.m3270a(abstractC0879ce, c0853bf);
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int m3284a = this.mChildHelper.m3284a();
        if (m3284a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < m3284a; i3++) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3290b(i3));
            if (!childViewHolderInt.m3208b()) {
                int m3209c = childViewHolderInt.m3209c();
                if (m3209c < i2) {
                    i2 = m3209c;
                }
                if (m3209c > i) {
                    i = m3209c;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        return (this.mMinMaxLayoutPositions[0] == i && this.mMinMaxLayoutPositions[1] == i2) ? false : true;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC0879ce childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.m3221o()) {
                childViewHolderInt.m3216j();
            } else if (!childViewHolderInt.m3208b()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    long getChangedHolderKey(AbstractC0879ce abstractC0879ce) {
        if (!this.mAdapter.m3026c()) {
            return abstractC0879ce.f3616c;
        }
        return abstractC0879ce.f3618e;
    }

    public void animateAppearance(AbstractC0879ce abstractC0879ce, C0853bf c0853bf, C0853bf c0853bf2) {
        abstractC0879ce.m3204a(false);
        if (this.mItemAnimator.mo3045b(abstractC0879ce, c0853bf, c0853bf2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(AbstractC0879ce abstractC0879ce, C0853bf c0853bf, C0853bf c0853bf2) {
        addAnimatingView(abstractC0879ce);
        abstractC0879ce.m3204a(false);
        if (this.mItemAnimator.mo3041a(abstractC0879ce, c0853bf, c0853bf2)) {
            postAnimationRunner();
        }
    }

    private void animateChange(AbstractC0879ce abstractC0879ce, AbstractC0879ce abstractC0879ce2, C0853bf c0853bf, C0853bf c0853bf2, boolean z, boolean z2) {
        abstractC0879ce.m3204a(false);
        if (z) {
            addAnimatingView(abstractC0879ce);
        }
        if (abstractC0879ce != abstractC0879ce2) {
            if (z2) {
                addAnimatingView(abstractC0879ce2);
            }
            abstractC0879ce.f3621h = abstractC0879ce2;
            addAnimatingView(abstractC0879ce);
            this.mRecycler.m3167b(abstractC0879ce);
            abstractC0879ce2.m3204a(false);
            abstractC0879ce2.f3622i = abstractC0879ce;
        }
        if (this.mItemAnimator.mo3042a(abstractC0879ce, abstractC0879ce2, c0853bf, c0853bf2)) {
            postAnimationRunner();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0419a.m1480a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C0419a.m1479a();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    void markItemDecorInsetsDirty() {
        int m3289b = this.mChildHelper.m3289b();
        for (int i = 0; i < m3289b; i++) {
            ((C0861bn) this.mChildHelper.m3293c(i).getLayoutParams()).f3552e = true;
        }
        C0868bu c0868bu = this.mRecycler;
        int size = c0868bu.f3562c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0861bn c0861bn = (C0861bn) c0868bu.f3562c.get(i2).f3614a.getLayoutParams();
            if (c0861bn != null) {
                c0861bn.f3552e = true;
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).mo3058a(canvas);
        }
        if (this.mLeftGlow == null || this.mLeftGlow.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            z = this.mLeftGlow != null && this.mLeftGlow.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (this.mTopGlow != null && !this.mTopGlow.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            z |= this.mTopGlow != null && this.mTopGlow.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.mRightGlow != null && !this.mRightGlow.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            z |= this.mRightGlow != null && this.mRightGlow.draw(canvas);
            canvas.restoreToCount(save3);
        }
        if (this.mBottomGlow == null || this.mBottomGlow.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            if (this.mBottomGlow != null && this.mBottomGlow.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.mo3044b()) {
            z2 = true;
        }
        if (z2) {
            C0538w.m1874f(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).mo3059a(canvas, this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0861bn) && this.mLayout.mo2786a((C0861bn) layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.mLayout == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return this.mLayout.mo2789b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.mLayout == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return this.mLayout.mo2776a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.mLayout == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return this.mLayout.mo2777a(layoutParams);
    }

    public boolean isAnimating() {
        return this.mItemAnimator != null && this.mItemAnimator.mo3044b();
    }

    void saveOldPositions() {
        int m3289b = this.mChildHelper.m3289b();
        for (int i = 0; i < m3289b; i++) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3293c(i));
            if (!childViewHolderInt.m3208b() && childViewHolderInt.f3617d == -1) {
                childViewHolderInt.f3617d = childViewHolderInt.f3616c;
            }
        }
    }

    void clearOldPositions() {
        int m3289b = this.mChildHelper.m3289b();
        for (int i = 0; i < m3289b; i++) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3293c(i));
            if (!childViewHolderInt.m3208b()) {
                childViewHolderInt.m3198a();
            }
        }
        C0868bu c0868bu = this.mRecycler;
        int size = c0868bu.f3562c.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0868bu.f3562c.get(i2).m3198a();
        }
        int size2 = c0868bu.f3560a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            c0868bu.f3560a.get(i3).m3198a();
        }
        if (c0868bu.f3561b != null) {
            int size3 = c0868bu.f3561b.size();
            for (int i4 = 0; i4 < size3; i4++) {
                c0868bu.f3561b.get(i4).m3198a();
            }
        }
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int m3289b = this.mChildHelper.m3289b();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i9 = 0; i9 < m3289b; i9++) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3293c(i9));
            if (childViewHolderInt != null && childViewHolderInt.f3616c >= i4 && childViewHolderInt.f3616c <= i3) {
                if (childViewHolderInt.f3616c == i) {
                    childViewHolderInt.m3200a(i2 - i, false);
                } else {
                    childViewHolderInt.m3200a(i5, false);
                }
                this.mState.f3594f = true;
            }
        }
        C0868bu c0868bu = this.mRecycler;
        if (i < i2) {
            i8 = i2;
            i7 = -1;
            i6 = i;
        } else {
            i6 = i2;
            i7 = 1;
            i8 = i;
        }
        int size = c0868bu.f3562c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0879ce abstractC0879ce = c0868bu.f3562c.get(i10);
            if (abstractC0879ce != null && abstractC0879ce.f3616c >= i6 && abstractC0879ce.f3616c <= i8) {
                if (abstractC0879ce.f3616c == i) {
                    abstractC0879ce.m3200a(i2 - i, false);
                } else {
                    abstractC0879ce.m3200a(i7, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int m3289b = this.mChildHelper.m3289b();
        for (int i3 = 0; i3 < m3289b; i3++) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3293c(i3));
            if (childViewHolderInt != null && !childViewHolderInt.m3208b() && childViewHolderInt.f3616c >= i) {
                childViewHolderInt.m3200a(i2, false);
                this.mState.f3594f = true;
            }
        }
        C0868bu c0868bu = this.mRecycler;
        int size = c0868bu.f3562c.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0879ce abstractC0879ce = c0868bu.f3562c.get(i4);
            if (abstractC0879ce != null && abstractC0879ce.f3616c >= i) {
                abstractC0879ce.m3200a(i2, true);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m3289b = this.mChildHelper.m3289b();
        for (int i4 = 0; i4 < m3289b; i4++) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3293c(i4));
            if (childViewHolderInt != null && !childViewHolderInt.m3208b()) {
                if (childViewHolderInt.f3616c >= i3) {
                    childViewHolderInt.m3200a(-i2, z);
                    this.mState.f3594f = true;
                } else if (childViewHolderInt.f3616c >= i) {
                    childViewHolderInt.m3206b(8);
                    childViewHolderInt.m3200a(-i2, z);
                    childViewHolderInt.f3616c = i - 1;
                    this.mState.f3594f = true;
                }
            }
        }
        C0868bu c0868bu = this.mRecycler;
        for (int size = c0868bu.f3562c.size() - 1; size >= 0; size--) {
            AbstractC0879ce abstractC0879ce = c0868bu.f3562c.get(size);
            if (abstractC0879ce != null) {
                if (abstractC0879ce.f3616c >= i3) {
                    abstractC0879ce.m3200a(-i2, z);
                } else if (abstractC0879ce.f3616c >= i) {
                    abstractC0879ce.m3206b(8);
                    c0868bu.m3172d(size);
                }
            }
        }
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int m3289b = this.mChildHelper.m3289b();
        int i4 = i2 + i;
        for (int i5 = 0; i5 < m3289b; i5++) {
            View m3293c = this.mChildHelper.m3293c(i5);
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(m3293c);
            if (childViewHolderInt != null && !childViewHolderInt.m3208b() && childViewHolderInt.f3616c >= i && childViewHolderInt.f3616c < i4) {
                childViewHolderInt.m3206b(2);
                childViewHolderInt.m3203a(obj);
                ((C0861bn) m3293c.getLayoutParams()).f3552e = true;
            }
        }
        C0868bu c0868bu = this.mRecycler;
        for (int size = c0868bu.f3562c.size() - 1; size >= 0; size--) {
            AbstractC0879ce abstractC0879ce = c0868bu.f3562c.get(size);
            if (abstractC0879ce != null && (i3 = abstractC0879ce.f3616c) >= i && i3 < i4) {
                abstractC0879ce.m3206b(2);
                c0868bu.m3172d(size);
            }
        }
    }

    public boolean canReuseUpdatedViewHolder(AbstractC0879ce abstractC0879ce) {
        return this.mItemAnimator == null || this.mItemAnimator.mo3043a(abstractC0879ce, abstractC0879ce.m3224r());
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void markKnownViewsInvalid() {
        int m3289b = this.mChildHelper.m3289b();
        for (int i = 0; i < m3289b; i++) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3293c(i));
            if (childViewHolderInt != null && !childViewHolderInt.m3208b()) {
                childViewHolderInt.m3206b(6);
            }
        }
        markItemDecorInsetsDirty();
        C0868bu c0868bu = this.mRecycler;
        int size = c0868bu.f3562c.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0879ce abstractC0879ce = c0868bu.f3562c.get(i2);
            if (abstractC0879ce != null) {
                abstractC0879ce.m3206b(6);
                abstractC0879ce.m3203a((Object) null);
            }
        }
        if (c0868bu.f3565f.mAdapter == null || !c0868bu.f3565f.mAdapter.m3026c()) {
            c0868bu.m3171d();
        }
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        if (this.mLayout != null) {
            this.mLayout.mo2831a("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public AbstractC0879ce getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:            return r3;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public AbstractC0879ce findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public static AbstractC0879ce getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C0861bn) view.getLayoutParams()).f3550c;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public int getChildAdapterPosition(View view) {
        AbstractC0879ce childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.m3210d();
        }
        return -1;
    }

    public int getChildLayoutPosition(View view) {
        AbstractC0879ce childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.m3209c();
        }
        return -1;
    }

    public long getChildItemId(View view) {
        AbstractC0879ce childViewHolderInt;
        if (this.mAdapter == null || !this.mAdapter.m3026c() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.f3618e;
    }

    @Deprecated
    public AbstractC0879ce findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public AbstractC0879ce findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public AbstractC0879ce findViewHolderForAdapterPosition(int i) {
        AbstractC0879ce abstractC0879ce = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int m3289b = this.mChildHelper.m3289b();
        for (int i2 = 0; i2 < m3289b; i2++) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3293c(i2));
            if (childViewHolderInt != null && !childViewHolderInt.m3220n() && getAdapterPositionFor(childViewHolderInt) == i) {
                if (!this.mChildHelper.m3295d(childViewHolderInt.f3614a)) {
                    return childViewHolderInt;
                }
                abstractC0879ce = childViewHolderInt;
            }
        }
        return abstractC0879ce;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.AbstractC0879ce findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.d r0 = r5.mChildHelper
            int r0 = r0.m3289b()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L39
            androidx.recyclerview.widget.d r3 = r5.mChildHelper
            android.view.View r3 = r3.m3293c(r2)
            androidx.recyclerview.widget.ce r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L36
            boolean r4 = r3.m3220n()
            if (r4 != 0) goto L36
            if (r7 == 0) goto L23
            int r4 = r3.f3616c
            if (r4 == r6) goto L29
            goto L36
        L23:
            int r4 = r3.m3209c()
            if (r4 != r6) goto L36
        L29:
            androidx.recyclerview.widget.d r1 = r5.mChildHelper
            android.view.View r4 = r3.f3614a
            boolean r1 = r1.m3295d(r4)
            if (r1 == 0) goto L35
            r1 = r3
            goto L36
        L35:
            return r3
        L36:
            int r2 = r2 + 1
            goto L8
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.ce");
    }

    public AbstractC0879ce findViewHolderForItemId(long j) {
        AbstractC0879ce abstractC0879ce = null;
        if (this.mAdapter == null || !this.mAdapter.m3026c()) {
            return null;
        }
        int m3289b = this.mChildHelper.m3289b();
        for (int i = 0; i < m3289b; i++) {
            AbstractC0879ce childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3293c(i));
            if (childViewHolderInt != null && !childViewHolderInt.m3220n() && childViewHolderInt.f3618e == j) {
                if (!this.mChildHelper.m3295d(childViewHolderInt.f3614a)) {
                    return childViewHolderInt;
                }
                abstractC0879ce = childViewHolderInt;
            }
        }
        return abstractC0879ce;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int m3284a = this.mChildHelper.m3284a() - 1; m3284a >= 0; m3284a--) {
            View m3290b = this.mChildHelper.m3290b(m3284a);
            float translationX = m3290b.getTranslationX();
            float translationY = m3290b.getTranslationY();
            if (f >= m3290b.getLeft() + translationX && f <= m3290b.getRight() + translationX && f2 >= m3290b.getTop() + translationY && f2 <= m3290b.getBottom() + translationY) {
                return m3290b;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void offsetChildrenVertical(int i) {
        int m3284a = this.mChildHelper.m3284a();
        for (int i2 = 0; i2 < m3284a; i2++) {
            this.mChildHelper.m3290b(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int m3284a = this.mChildHelper.m3284a();
        for (int i2 = 0; i2 < m3284a; i2++) {
            this.mChildHelper.m3290b(i2).offsetLeftAndRight(i);
        }
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C0861bn c0861bn = (C0861bn) view.getLayoutParams();
        Rect rect2 = c0861bn.f3551d;
        rect.set((view.getLeft() - rect2.left) - c0861bn.leftMargin, (view.getTop() - rect2.top) - c0861bn.topMargin, view.getRight() + rect2.right + c0861bn.rightMargin, view.getBottom() + rect2.bottom + c0861bn.bottomMargin);
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C0861bn c0861bn = (C0861bn) view.getLayoutParams();
        if (!c0861bn.f3552e) {
            return c0861bn.f3551d;
        }
        if (this.mState.f3595g && (c0861bn.f3550c.m3228v() || c0861bn.f3550c.m3217k())) {
            return c0861bn.f3551d;
        }
        Rect rect = c0861bn.f3551d;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i);
            Rect rect2 = this.mTempRect;
            view.getLayoutParams();
            rect2.set(0, 0, 0, 0);
            rect.left += this.mTempRect.left;
            rect.top += this.mTempRect.top;
            rect.right += this.mTempRect.right;
            rect.bottom += this.mTempRect.bottom;
        }
        c0861bn.f3552e = false;
        return rect;
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        if (this.mScrollListener != null) {
            this.mScrollListener.mo3137a(this, i, i2);
        }
        if (this.mScrollListeners != null) {
            for (int size = this.mScrollListeners.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo3137a(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchOnScrollStateChanged(int i) {
        if (this.mLayout != null) {
            this.mLayout.mo2900i(i);
        }
        onScrollStateChanged(i);
        if (this.mScrollListener != null) {
            this.mScrollListener.mo3136a(this, i);
        }
        if (this.mScrollListeners != null) {
            for (int size = this.mScrollListeners.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo3136a(this, i);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m2930d();
    }

    void repositionShadowingViews() {
        int m3284a = this.mChildHelper.m3284a();
        for (int i = 0; i < m3284a; i++) {
            View m3290b = this.mChildHelper.m3290b(i);
            AbstractC0879ce childViewHolder = getChildViewHolder(m3290b);
            if (childViewHolder != null && childViewHolder.f3622i != null) {
                View view = childViewHolder.f3622i.f3614a;
                int left = m3290b.getLeft();
                int top = m3290b.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    public static void clearNestedRecyclerViewIfNotNested(AbstractC0879ce abstractC0879ce) {
        if (abstractC0879ce.f3615b != null) {
            RecyclerView recyclerView = abstractC0879ce.f3615b.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC0879ce.f3614a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC0879ce.f3615b = null;
        }
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public void dispatchChildDetached(View view) {
        getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        if (this.mOnChildAttachStateListeners != null) {
            for (int size = this.mOnChildAttachStateListeners.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size);
            }
        }
    }

    public void dispatchChildAttached(View view) {
        getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        if (this.mOnChildAttachStateListeners != null) {
            for (int size = this.mOnChildAttachStateListeners.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo3132a(view);
            }
        }
    }

    public boolean setChildImportantForAccessibilityInternal(AbstractC0879ce abstractC0879ce, int i) {
        if (isComputingLayout()) {
            abstractC0879ce.f3628o = i;
            this.mPendingAccessibilityImportanceChange.add(abstractC0879ce);
            return false;
        }
        C0538w.m1840a(abstractC0879ce.f3614a, i);
        return true;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            AbstractC0879ce abstractC0879ce = this.mPendingAccessibilityImportanceChange.get(size);
            if (abstractC0879ce.f3614a.getParent() == this && !abstractC0879ce.m3208b() && (i = abstractC0879ce.f3628o) != -1) {
                C0538w.m1840a(abstractC0879ce.f3614a, i);
                abstractC0879ce.f3628o = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getAdapterPositionFor(androidx.recyclerview.widget.AbstractC0879ce r7) {
        /*
            r6 = this;
            r0 = 524(0x20c, float:7.34E-43)
            boolean r0 = r7.m3205a(r0)
            r1 = -1
            if (r0 != 0) goto L5e
            boolean r0 = r7.m3219m()
            if (r0 != 0) goto L10
            goto L5e
        L10:
            androidx.recyclerview.widget.a r6 = r6.mAdapterHelper
            int r7 = r7.f3616c
            java.util.ArrayList<androidx.recyclerview.widget.c> r0 = r6.f3441a
            int r0 = r0.size()
            r2 = 0
        L1b:
            if (r2 >= r0) goto L5d
            java.util.ArrayList<androidx.recyclerview.widget.c> r3 = r6.f3441a
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.c r3 = (androidx.recyclerview.widget.C0874c) r3
            int r4 = r3.f3585a
            r5 = 8
            if (r4 == r5) goto L47
            switch(r4) {
                case 1: goto L3f;
                case 2: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L5a
        L2f:
            int r4 = r3.f3586b
            if (r4 > r7) goto L5a
            int r4 = r3.f3586b
            int r5 = r3.f3588d
            int r4 = r4 + r5
            if (r4 <= r7) goto L3b
            return r1
        L3b:
            int r3 = r3.f3588d
            int r7 = r7 - r3
            goto L5a
        L3f:
            int r4 = r3.f3586b
            if (r4 > r7) goto L5a
            int r3 = r3.f3588d
            int r7 = r7 + r3
            goto L5a
        L47:
            int r4 = r3.f3586b
            if (r4 != r7) goto L4e
            int r7 = r3.f3588d
            goto L5a
        L4e:
            int r4 = r3.f3586b
            if (r4 >= r7) goto L54
            int r7 = r7 + (-1)
        L54:
            int r3 = r3.f3588d
            if (r3 > r7) goto L5a
            int r7 = r7 + 1
        L5a:
            int r2 = r2 + 1
            goto L1b
        L5d:
            return r7
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.getAdapterPositionFor(androidx.recyclerview.widget.ce):int");
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new C0914s(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m1794a(z);
    }

    @Override // android.view.View, androidx.core.p024g.InterfaceC0526k
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m1795a();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m1805b(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().m1799a(i, i2);
    }

    @Override // android.view.View, androidx.core.p024g.InterfaceC0526k
    public void stopNestedScroll() {
        getScrollingChildHelper().m1806c();
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().m1807c(i);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m1804b();
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().m1798a(i);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m1800a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m1801a(i, i2, i3, i4, iArr, i5);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m1793a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m1802a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m1803a(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m1797a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m1796a(f, f2);
    }

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0871bx();

        /* renamed from: a */
        Parcelable f3400a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3400a = parcel.readParcelable(classLoader == null ? AbstractC0856bi.class.getClassLoader() : classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3400a, 0);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.mChildDrawingOrderCallback == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return this.mChildDrawingOrderCallback.m3035a();
    }

    private C0529n getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0529n(this);
        }
        return this.mScrollingChildHelper;
    }
}
