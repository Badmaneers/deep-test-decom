package android.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.p024g.p026b.C0517b;

/* loaded from: classes.dex */
public class ColorOverScroller extends OverScroller {
    private static final boolean DBG = false;
    private static final int DEFAULT_DURATION = 250;
    private static final float DEFAULT_TIME_GAP = 16.0f;
    private static final int FLING_MODE = 1;
    private static final int MAXIMUM_FLING_VELOCITY_LIST = 2500;
    private static final int MAX_VELOCITY = 9000;

    /* renamed from: PI */
    private static final double f6PI = 3.1415926d;
    private static final int SCROLL_MODE = 0;
    private static final int SPRING_BACK_DURATION = 600;
    private static final String TAG = "ColorOverScroller";
    private static int sMaximumVelocity;
    private static int sOverscrollDistance;
    private final boolean mFlywheel;
    private Interpolator mInterpolator;
    private int mMode;
    private final ColorSplineOverScroller mScrollerX;
    private final ColorSplineOverScroller mScrollerY;

    public ColorOverScroller(Context context) {
        this(context, null);
    }

    public ColorOverScroller(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public ColorOverScroller(Context context, Interpolator interpolator, boolean z) {
        super(context, interpolator);
        if (interpolator == null) {
            this.mInterpolator = new ColorViscousFluidInterpolator();
        } else {
            this.mInterpolator = interpolator;
        }
        this.mFlywheel = z;
        this.mScrollerX = new ColorSplineOverScroller(context);
        this.mScrollerY = new ColorSplineOverScroller(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        sOverscrollDistance = displayMetrics.heightPixels;
        int i = (int) (displayMetrics.density * 2500.0f);
        sMaximumVelocity = i;
        if (i > MAX_VELOCITY) {
            sMaximumVelocity = MAX_VELOCITY;
        }
    }

    public ColorOverScroller(Context context, Interpolator interpolator, float f, float f2) {
        this(context, interpolator, true);
    }

    public ColorOverScroller(Context context, Interpolator interpolator, float f, float f2, boolean z) {
        this(context, interpolator, z);
    }

    public void setEnableScrollList(boolean z) {
        this.mScrollerX.mIsScrollList = z;
        this.mScrollerY.mIsScrollList = z;
    }

    void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            this.mInterpolator = new ColorViscousFluidInterpolator();
        } else {
            this.mInterpolator = interpolator;
        }
    }

    public void setColorFriction(float f) {
        this.mScrollerX.setFriction(f);
        this.mScrollerY.setFriction(f);
    }

    public boolean isColorFinished() {
        return this.mScrollerX.mFinished && this.mScrollerY.mFinished;
    }

    public final void colorForceFinished(boolean z) {
        this.mScrollerX.mFinished = z;
        this.mScrollerY.mFinished = z;
    }

    public int getColorCurrX() {
        return this.mScrollerX.mCurrentPosition;
    }

    public int getColorCurrY() {
        return this.mScrollerY.mCurrentPosition;
    }

    @Override // android.widget.OverScroller
    public float getCurrVelocity() {
        return (float) Math.sqrt((this.mScrollerX.mCurrVelocity * this.mScrollerX.mCurrVelocity) + (this.mScrollerY.mCurrVelocity * this.mScrollerY.mCurrVelocity));
    }

    public final int getColorStartX() {
        return this.mScrollerX.mStart;
    }

    public final int getColorStartY() {
        return this.mScrollerY.mStart;
    }

    public int getColorFinalX() {
        return this.mScrollerX.mFinal;
    }

    public int getColorFinalY() {
        return this.mScrollerY.mFinal;
    }

    @Deprecated
    public int getColorDuration() {
        return Math.max(this.mScrollerX.mDuration, this.mScrollerY.mDuration);
    }

    @Deprecated
    public void extendDuration(int i) {
        this.mScrollerX.extendDuration(i);
        this.mScrollerY.extendDuration(i);
    }

    @Deprecated
    public void setFinalX(int i) {
        this.mScrollerX.setFinalPosition(i);
    }

    @Deprecated
    public void setFinalY(int i) {
        this.mScrollerY.setFinalPosition(i);
    }

    @Override // android.widget.OverScroller
    public boolean computeScrollOffset() {
        if (isColorFinished()) {
            return false;
        }
        switch (this.mMode) {
            case 0:
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.mScrollerX.mStartTime;
                int i = this.mScrollerX.mDuration;
                if (currentAnimationTimeMillis < i) {
                    float interpolation = this.mInterpolator.getInterpolation(((float) currentAnimationTimeMillis) / i);
                    this.mScrollerX.updateScroll(interpolation);
                    this.mScrollerY.updateScroll(interpolation);
                    return true;
                }
                abortAnimation();
                return true;
            case 1:
                if (!this.mScrollerX.mFinished && !this.mScrollerX.update() && !this.mScrollerX.continueWhenFinished()) {
                    this.mScrollerX.finish();
                }
                if (this.mScrollerY.mFinished || this.mScrollerY.update() || this.mScrollerY.continueWhenFinished()) {
                    return true;
                }
                this.mScrollerY.finish();
                return true;
            default:
                return true;
        }
    }

    @Override // android.widget.OverScroller
    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, DEFAULT_DURATION);
    }

    @Override // android.widget.OverScroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.mMode = 0;
        this.mScrollerX.startScroll(i, i3, i5);
        this.mScrollerY.startScroll(i2, i4, i5);
    }

    @Override // android.widget.OverScroller
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mMode = 1;
        return this.mScrollerX.springback(i, i3, i4) || this.mScrollerY.springback(i2, i5, i6);
    }

    @Override // android.widget.OverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    @Override // android.widget.OverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!this.mFlywheel || isColorFinished()) {
            i11 = i3;
        } else {
            float f = this.mScrollerX.mCurrVelocity;
            float f2 = this.mScrollerY.mCurrVelocity;
            i11 = i3;
            float f3 = i11;
            if (Math.signum(f3) == Math.signum(f)) {
                i12 = i4;
                float f4 = i12;
                if (Math.signum(f4) == Math.signum(f2)) {
                    i13 = (int) (f4 + f2);
                    i14 = (int) (f3 + f);
                    this.mMode = 1;
                    this.mScrollerX.fling(i, i14, i5, i6, i9);
                    this.mScrollerY.fling(i2, i13, i7, i8, i10);
                }
                i13 = i12;
                i14 = i11;
                this.mMode = 1;
                this.mScrollerX.fling(i, i14, i5, i6, i9);
                this.mScrollerY.fling(i2, i13, i7, i8, i10);
            }
        }
        i12 = i4;
        i13 = i12;
        i14 = i11;
        this.mMode = 1;
        this.mScrollerX.fling(i, i14, i5, i6, i9);
        this.mScrollerY.fling(i2, i13, i7, i8, i10);
    }

    @Override // android.widget.OverScroller
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.mScrollerX.notifyEdgeReached(i, i2, i3);
    }

    @Override // android.widget.OverScroller
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.mScrollerY.notifyEdgeReached(i, i2, i3);
    }

    @Override // android.widget.OverScroller
    public boolean isOverScrolled() {
        if (this.mScrollerX.mFinished || this.mScrollerX.mState == 0) {
            return (this.mScrollerY.mFinished || this.mScrollerY.mState == 0) ? false : true;
        }
        return true;
    }

    @Override // android.widget.OverScroller
    public void abortAnimation() {
        this.mScrollerX.finish();
        this.mScrollerY.finish();
    }

    public int timePassed() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - Math.min(this.mScrollerX.mStartTime, this.mScrollerY.mStartTime));
    }

    public boolean isScrollingInDirection(float f, float f2) {
        return !isColorFinished() && Math.signum(f) == Math.signum((float) (this.mScrollerX.mFinal - this.mScrollerX.mStart)) && Math.signum(f2) == Math.signum((float) (this.mScrollerY.mFinal - this.mScrollerY.mStart));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ColorSplineOverScroller {
        private static final int BALLISTIC = 2;
        private static final float BALLISTIC_THRESHOLD = 0.91f;
        private static final float BASE_DENSITY_FACTOR = 160.0f;
        private static final int CUBIC = 1;
        private static final float END_TENSION = 1.0f;
        private static final float FLING_CONTROL_ONE_X = 0.0f;
        private static final float FLING_CONTROL_ONE_Y = 0.17f;
        private static final float FLING_CONTROL_TWO_X = 0.25f;
        private static final float FLING_CONTROL_TWO_Y = 0.85f;
        private static final int FLING_SPLINE = 3;
        private static final float FLOAT_1 = 1.0f;
        private static final float FLOAT_2 = 2.0f;
        private static final float FLOAT_6 = 6.0f;
        private static final float GRAVITY = 2000.0f;
        private static final float INCH_METER = 39.37f;
        private static final float INFLEXION = 0.35f;
        private static final int NB_SAMPLES = 100;
        private static final int NUM_10 = 10;
        private static final int NUM_100 = 100;
        private static final int NUM_1000 = 1000;
        private static final int NUM_800 = 800;
        private static final int OVER_SPLINE = 4;

        /* renamed from: P1 */
        private static final float f7P1 = 0.175f;

        /* renamed from: P2 */
        private static final float f8P2 = 0.35000002f;
        private static final float PHYSICAL_COFF_FACTOR = 0.84f;
        private static final double SOLVER_TIMESTEP_SEC = 0.016d;
        private static final int SPLINE = 0;
        private static final float START_TENSION = 0.5f;
        private static final float VISCOUS_FLUID_SCALE = 14.0f;
        private static float sViscousFluidNormalize;
        private float mCurrVelocity;
        private int mCurrentPosition;
        private float mDeceleration;
        private int mDuration;
        private double mEndValue;
        private int mFinal;
        private Interpolator mFlingInterpolator;
        private int mLastPosition;
        private double mLastVelocity;
        private int mOver;
        private boolean mOverSplineStart;
        private float mPhysicalCoeff;
        private int mScrollerDistance;
        private int mSplineDistance;
        private int mSplineState;
        private int mStart;
        private long mStartTime;
        private int mVelocity;
        private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
        private static final float[] SPLINE_POSITION = new float[101];
        private static final float[] SPLINE_TIME = new float[101];
        private int mOppoCount = 1;
        private float mStartV = 0.0f;
        private double mLastDetla = 0.0d;
        private boolean mIsScrollList = false;
        private boolean mOverSpring = false;
        private float mFlingFriction = ViewConfiguration.getScrollFriction();
        private int mState = 0;
        private float mReboundTension = 0.0f;
        private float mReboundFriction = 3.6f;
        private int mRestThreshold = 20;
        private boolean mFinished = true;

        private static float getDeceleration(int i) {
            if (i > 0) {
                return -2000.0f;
            }
            return GRAVITY;
        }

        void setFriction(float f) {
            this.mFlingFriction = f;
        }

        ColorSplineOverScroller(Context context) {
            this.mPhysicalCoeff = context.getResources().getDisplayMetrics().density * BASE_DENSITY_FACTOR * 386.0878f * PHYSICAL_COFF_FACTOR;
            sViscousFluidNormalize = 1.0f;
            sViscousFluidNormalize = 1.0f / viscousFluid(1.0f, VISCOUS_FLUID_SCALE);
            this.mFlingInterpolator = C0517b.m1773a(0.0f, FLING_CONTROL_ONE_Y, FLING_CONTROL_TWO_X, FLING_CONTROL_TWO_Y);
        }

        void updateScroll(float f) {
            this.mCurrentPosition = this.mStart + Math.round(f * (this.mFinal - this.mStart));
        }

        private void adjustDuration(int i, int i2, int i3) {
            float abs = Math.abs((i3 - i) / (i2 - i));
            int i4 = (int) (abs * 100.0f);
            if (i4 < 100) {
                float f = i4 / 100.0f;
                int i5 = i4 + 1;
                float f2 = SPLINE_TIME[i4];
                this.mDuration = (int) (this.mDuration * (f2 + (((abs - f) / ((i5 / 100.0f) - f)) * (SPLINE_TIME[i5] - f2))));
            }
        }

        void startScroll(int i, int i2, int i3) {
            this.mFinished = false;
            this.mCurrentPosition = i;
            this.mStart = i;
            this.mFinal = i + i2;
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mDuration = i3;
            this.mDeceleration = 0.0f;
            this.mVelocity = 0;
        }

        void finish() {
            this.mCurrentPosition = this.mFinal;
            this.mFinished = true;
        }

        void setFinalPosition(int i) {
            this.mFinal = i;
            this.mFinished = false;
        }

        void extendDuration(int i) {
            this.mDuration = ((int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime)) + i;
            this.mFinished = false;
        }

        boolean springback(int i, int i2, int i3) {
            this.mFinished = true;
            this.mCurrentPosition = i;
            this.mStart = i;
            this.mFinal = i;
            this.mVelocity = 0;
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mDuration = 0;
            if (i < i2) {
                startSpringback(i, i2, 0);
            } else if (i > i3) {
                startSpringback(i, i3, 0);
            }
            return !this.mFinished;
        }

        private void startSpringback(int i, int i2, int i3) {
            this.mOppoCount = 1;
            this.mFinished = false;
            this.mState = 1;
            this.mCurrentPosition = i;
            this.mStart = i;
            this.mFinal = i2;
            int i4 = i - i2;
            this.mDeceleration = getDeceleration(i4);
            this.mVelocity = -i4;
            this.mOver = Math.abs(i4);
            this.mDuration = (int) (Math.sqrt((i4 * (-2.0d)) / this.mDeceleration) * 1000.0d);
        }

        void fling(int i, int i2, int i3, int i4, int i5) {
            this.mOppoCount = 1;
            this.mOver = i5;
            this.mFinished = false;
            if (i2 > ColorOverScroller.sMaximumVelocity || i2 < (-ColorOverScroller.sMaximumVelocity)) {
                i2 = ((int) Math.signum(i2)) * ColorOverScroller.sMaximumVelocity;
            }
            float f = i2;
            this.mCurrVelocity = f;
            this.mVelocity = i2;
            this.mDuration = 0;
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mCurrentPosition = i;
            this.mStart = i;
            this.mStartV = f;
            this.mLastPosition = this.mStart;
            this.mOverSpring = false;
            if (i > i4 || i < i3) {
                this.mOverSpring = true;
                startAfterEdge(i, i3, i4, i2);
                return;
            }
            this.mState = 0;
            double d = 0.0d;
            if (i2 != 0) {
                this.mDuration = getSplineFlingDuration(i2) + 100;
                d = getSplineFlingDistance(i2);
                this.mEndValue = d;
                this.mLastVelocity = i2;
            }
            this.mSplineDistance = (int) (d * Math.signum(f));
            this.mFinal = i + this.mSplineDistance;
            if (this.mFinal < i3) {
                this.mFinal = i3;
            }
            if (this.mFinal > i4) {
                this.mFinal = i4;
            }
            if (i5 == 0 || this.mIsScrollList) {
                return;
            }
            this.mFinal = this.mStart;
            if (this.mFinal > ColorOverScroller.sOverscrollDistance || this.mFinal < (-ColorOverScroller.sOverscrollDistance)) {
                this.mFinal = ((int) Math.signum(f)) * ColorOverScroller.sOverscrollDistance;
            }
            this.mStart = 0;
            this.mSplineState = 3;
            this.mState = 2;
        }

        private double getSplineDeceleration(int i) {
            return Math.log((Math.abs(i) * INFLEXION) / (this.mPhysicalCoeff * 0.006f));
        }

        private double getSplineFlingDistance(int i) {
            return this.mFlingFriction * this.mPhysicalCoeff * Math.exp((DECELERATION_RATE / (DECELERATION_RATE - 1.0d)) * getSplineDeceleration(i));
        }

        private int getSplineFlingDuration(int i) {
            return (int) (Math.exp(getSplineDeceleration(i) / (DECELERATION_RATE - 1.0d)) * 1000.0d);
        }

        private void fitOnBounceCurve(int i, int i2, int i3) {
            float f = (-i3) / this.mDeceleration;
            float sqrt = (float) Math.sqrt((((((i3 * i3) / FLOAT_2) / Math.abs(this.mDeceleration)) + Math.abs(i2 - i)) * 2.0d) / Math.abs(this.mDeceleration));
            this.mStartTime -= (int) ((sqrt - f) * 1000.0f);
            this.mStart = i2;
            this.mVelocity = (int) ((-this.mDeceleration) * sqrt);
        }

        private void startBounceAfterEdge(int i, int i2, int i3) {
            this.mScrollerDistance = i;
            this.mDeceleration = getDeceleration(i3 == 0 ? i - i2 : i3);
            fitOnBounceCurve(i, i2, i3);
            onEdgeReached();
        }

        private void startAfterEdge(int i, int i2, int i3, int i4) {
            if (i > i2 && i < i3) {
                Log.e("OverScroller", "startAfterEdge called from a valid position");
                this.mFinished = true;
                return;
            }
            boolean z = i > i3;
            int i5 = z ? i3 : i2;
            if ((i - i5) * i4 >= 0) {
                startBounceAfterEdge(i, i5, i4);
            } else if (getSplineFlingDistance(i4) > Math.abs(r4)) {
                fling(i, i4, z ? i2 : i, z ? i : i3, this.mOver);
            } else {
                startSpringback(i, i5, i4);
            }
        }

        void notifyEdgeReached(int i, int i2, int i3) {
            if (this.mState == 0) {
                this.mOver = i3;
                this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
                this.mState = 1;
                startAfterEdge(i, i2, i2, (int) (this.mCurrVelocity / 1000.0f));
            }
        }

        private void onEdgeReached() {
            float signum = Math.signum(this.mVelocity);
            float f = (this.mVelocity * this.mVelocity) / 1600.0f;
            if (f > this.mOver) {
                this.mDeceleration = (((-signum) * this.mVelocity) * this.mVelocity) / (this.mOver * FLOAT_2);
                f = this.mOver;
            }
            this.mOppoCount = 1;
            this.mOver = (int) f;
            this.mState = 2;
            int i = this.mStart;
            if (this.mVelocity <= 0) {
                f = -f;
            }
            this.mFinal = i + ((int) f);
            this.mDuration = -((this.mVelocity * NUM_1000) / (this.mVelocity > 0 ? -800 : NUM_800));
            this.mSplineState = 4;
            this.mOverSplineStart = true;
        }

        boolean continueWhenFinished() {
            switch (this.mState) {
                case 0:
                    if (this.mIsScrollList && this.mOver != 0) {
                        this.mCurrentPosition = this.mFinal;
                        this.mStart = this.mFinal;
                        this.mVelocity = ((int) this.mCurrVelocity) / 10;
                        this.mScrollerDistance = 0;
                        onEdgeReached();
                        break;
                    } else {
                        return false;
                    }
                case 1:
                    return false;
                case 2:
                    this.mStartTime += this.mDuration;
                    startSpringback(this.mFinal, this.mStart, 0);
                    break;
            }
            update();
            return true;
        }

        /* JADX WARN: Type inference failed for: r1v40 */
        /* JADX WARN: Type inference failed for: r1v69, types: [int, boolean] */
        /* JADX WARN: Type inference failed for: r1v70 */
        boolean update() {
            double interpolation;
            ?? r1;
            AnimationUtils.currentAnimationTimeMillis();
            int i = (int) (this.mOppoCount * ColorOverScroller.DEFAULT_TIME_GAP);
            switch (this.mState) {
                case 0:
                    double d = this.mLastPosition;
                    double d2 = this.mLastVelocity;
                    double d3 = (this.mReboundTension * (this.mEndValue - this.mLastPosition)) - (this.mReboundFriction * this.mLastVelocity);
                    double d4 = ((d2 * SOLVER_TIMESTEP_SEC) / 2.0d) + d;
                    double d5 = ((d3 * SOLVER_TIMESTEP_SEC) / 2.0d) + d2;
                    double d6 = (this.mReboundTension * (this.mEndValue - d4)) - (this.mReboundFriction * d5);
                    double d7 = ((d5 * SOLVER_TIMESTEP_SEC) / 2.0d) + d;
                    double d8 = ((d6 * SOLVER_TIMESTEP_SEC) / 2.0d) + d2;
                    double d9 = (this.mReboundTension * (this.mEndValue - d7)) - (this.mReboundFriction * d8);
                    float f = (float) (d2 + ((d3 + ((d6 + d9) * 2.0d) + ((this.mReboundTension * (this.mEndValue - (d + (d8 * SOLVER_TIMESTEP_SEC)))) - (this.mReboundFriction * ((d9 * SOLVER_TIMESTEP_SEC) + d2)))) * 0.1666666716337204d * SOLVER_TIMESTEP_SEC));
                    double d10 = f;
                    double d11 = d10 * SOLVER_TIMESTEP_SEC;
                    if ((Math.abs(d11) > this.mLastDetla && this.mOppoCount > 1) || (this.mCurrVelocity > (-this.mRestThreshold) && this.mCurrVelocity < this.mRestThreshold)) {
                        this.mFinal = this.mCurrentPosition;
                        finish();
                        return false;
                    }
                    int round = (int) Math.round(d11);
                    if (round == 0) {
                        round = (int) (Math.abs(d11) / d11);
                    }
                    this.mCurrentPosition = this.mLastPosition + round;
                    this.mLastDetla = Math.abs(d11);
                    this.mLastPosition = this.mCurrentPosition;
                    this.mOppoCount++;
                    this.mCurrVelocity = f;
                    this.mLastVelocity = d10;
                    Log.d("TestColorScroller", "update: " + this.mCurrVelocity);
                    if (!this.mIsScrollList) {
                        return true;
                    }
                    if ((round <= 0 || this.mCurrentPosition < this.mFinal) && (round >= 0 || this.mCurrentPosition > this.mFinal)) {
                        return true;
                    }
                    this.mCurrentPosition = this.mFinal;
                    return false;
                case 1:
                    interpolation = this.mFlingInterpolator.getInterpolation(Math.min(i * 0.0016666667f, 1.0f)) * (this.mFinal - this.mStart);
                    this.mCurrentPosition = this.mStart + ((int) Math.round(interpolation));
                    if (this.mCurrentPosition == this.mFinal) {
                        this.mCurrentPosition = this.mFinal;
                        finish();
                        return false;
                    }
                    break;
                case 2:
                    if (this.mSplineState == 4 && (!this.mIsScrollList || !this.mOverSpring)) {
                        float viscousFluid = viscousFluid(i * (1.0f / this.mDuration), VISCOUS_FLUID_SCALE);
                        interpolation = (this.mFinal - this.mStart) * viscousFluid;
                        while (true) {
                            if (((this.mFinal < 0 && interpolation >= this.mScrollerDistance) || (this.mFinal > 0 && interpolation <= this.mScrollerDistance)) && !this.mIsScrollList) {
                                this.mOppoCount++;
                                viscousFluid = viscousFluid(((int) (this.mOppoCount * ColorOverScroller.DEFAULT_TIME_GAP)) * (1.0f / this.mDuration), VISCOUS_FLUID_SCALE);
                                interpolation = (this.mFinal - this.mStart) * viscousFluid;
                                this.mOverSplineStart = true;
                            }
                        }
                        if (this.mOverSplineStart) {
                            viscousFluid = viscousFluid(((int) ((this.mOppoCount + 1) * ColorOverScroller.DEFAULT_TIME_GAP)) * (1.0f / this.mDuration), VISCOUS_FLUID_SCALE);
                            double d12 = (this.mFinal - this.mStart) * viscousFluid;
                            if ((this.mFinal < 0 && d12 - interpolation < interpolation - this.mScrollerDistance) || (this.mFinal > 0 && d12 - interpolation > interpolation - this.mScrollerDistance)) {
                                this.mOppoCount++;
                                interpolation = d12;
                            }
                            this.mOverSplineStart = false;
                        }
                        if ((this.mFinal < 0 && this.mCurrentPosition <= this.mFinal) || ((this.mFinal > 0 && this.mCurrentPosition >= this.mFinal) || viscousFluid > BALLISTIC_THRESHOLD || Math.round(interpolation) == 0)) {
                            this.mFinal = this.mStart + ((int) Math.round(interpolation));
                            return false;
                        }
                    } else {
                        this.mFinal = this.mCurrentPosition;
                        return false;
                    }
                    break;
                default:
                    r1 = 1;
                    interpolation = 0.0d;
                    this.mOppoCount += r1;
                    this.mCurrentPosition = this.mStart + ((int) Math.round(interpolation));
                    return r1;
            }
            r1 = 1;
            this.mOppoCount += r1;
            this.mCurrentPosition = this.mStart + ((int) Math.round(interpolation));
            return r1;
        }

        private static float viscousFluid(float f, float f2) {
            return (((1.0f - ((float) Math.exp(1.0f - ((((1.0f - ((float) Math.log(1.5819767713546753d))) / f2) + f) * f2)))) * 0.63212055f) + 0.36787945f) * sViscousFluidNormalize;
        }
    }

    /* loaded from: classes.dex */
    class ColorViscousFluidInterpolator implements Interpolator {
        private static final float VISCOUS_FLUID_NORMALIZE = 1.0f / viscousFluid(1.0f);
        private static final float VISCOUS_FLUID_OFFSET = 1.0f - (VISCOUS_FLUID_NORMALIZE * viscousFluid(1.0f));
        private static final float VISCOUS_FLUID_SCALE = 8.0f;

        ColorViscousFluidInterpolator() {
        }

        private static float viscousFluid(float f) {
            float f2 = f * VISCOUS_FLUID_SCALE;
            if (f2 < 1.0f) {
                return f2 - (1.0f - ((float) Math.exp(-f2)));
            }
            return 0.36787945f + ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float viscousFluid = VISCOUS_FLUID_NORMALIZE * viscousFluid(f);
            return viscousFluid > 0.0f ? viscousFluid + VISCOUS_FLUID_OFFSET : viscousFluid;
        }
    }
}
