package com.demo.animation5x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import com.demo.animation5x.animationUtils.TransitionController;
import com.demo.animation5x.listener.TransitionCustomListener;

/**
 * Created by zhush on 2017/1/6
 * E-mail zhush@jerei.com
 * PS
 */
public class Main2Activity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         imageView  = (ImageView) findViewById(R.id.image);

                TransitionController.getInstance().setEnterListener(new TransitionCustomListener() {
            @Override
            public void onTransitionStart(Animator animator) {
            }

            @Override
            public void onTransitionEnd(Animator animator) {
                imageView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onTransitionCancel(Animator animator) {
            }
        });
        TransitionController.getInstance().show(this,getIntent());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        TransitionController.getInstance().exitActivity(Main2Activity   .this);
    }
}
