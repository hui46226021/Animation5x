package com.demo.animation5x.animationUtils;

import android.animation.Animator;
import android.view.View;

import com.demo.animation5x.view.CircularRevealLayout;
import com.demo.animation5x.view.RectRevealLayout;

/**
 * Created by zhush on 2017/1/6
 * E-mail zhush@jerei.com
 * PS
 */
public class ViewAnimationCompatUtils {

    private ViewAnimationCompatUtils(){}
    public static final int RECT_LEFT = 0;
    public static final int RECT_TOP = 1;
    public static final int RECT_RIGHT = 2;
    public static final int RECT_BOTTOM = 3;

    public static Animator createCircularReveal(final View view,
                                                final int centerX, final int centerY, final float startRadius, final float endRadius) {

        Animator animator = CircularRevealLayout.Builder.on(view)
                .centerX(centerX)
                .centerY(centerY)
                .startRadius(startRadius)
                .endRadius(endRadius)
                .create();
        return animator;

    }


    public static Animator createRectReveal(final View view,
                                                 final float startHeight, final float endHeight,int nDirection) {

        Animator animator = RectRevealLayout.Builder.on(view)
                .Direction(nDirection)
                .startHeight(startHeight)
                .endHeight(endHeight)
                .create();
        return animator;
    }
    public static Animator createRectReveal(final View view,
                                            final float startHeight, final float endHeight){
       return createRectReveal(view,startHeight,endHeight,ViewAnimationCompatUtils.RECT_TOP);
    }
}
