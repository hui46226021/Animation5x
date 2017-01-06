package com.demo.animation5x.listener;

import android.animation.Animator;
/**
 * Created by zhush on 2017/1/6
 * E-mail zhush@jerei.com
 * PS
 */
public interface TransitionCustomListener {

    public void onTransitionStart(Animator animator);

    public void onTransitionEnd(Animator animator);

    public void onTransitionCancel(Animator animator);

}
