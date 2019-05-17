package com.android.androidlatihantambahan.activitiesAnimation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator

class TerbangBareng:BaseAnimationActivity() {
    override fun onStartAnimation() {
        val positionAnimator=ValueAnimator.ofFloat(0f,-screenHeight)
        positionAnimator.addUpdateListener {
            val value=it.animatedValue as Float
            rocket.translationY=value
            doge.translationY=value
        }
        val rotationAnimator= ObjectAnimator.ofFloat(0f,360f)
        rotationAnimator.addUpdateListener {
            val value=it.animatedValue as Float
            doge.rotation=value
        }
        val animatorSet=AnimatorSet()
        animatorSet.play(positionAnimator).with(rotationAnimator)
        animatorSet.duration= DEFAULT_ANIM_DURATION
        animatorSet.start()
    }
}