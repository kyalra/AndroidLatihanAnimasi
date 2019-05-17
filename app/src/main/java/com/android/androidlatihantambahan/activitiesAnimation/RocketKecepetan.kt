package com.android.androidlatihantambahan.activitiesAnimation

import android.animation.ValueAnimator
import android.view.animation.AccelerateInterpolator
import android.view.animation.LinearInterpolator

class RocketKecepetan:BaseAnimationActivity() {
    override fun onStartAnimation() {
        val valueAnimator= ValueAnimator.ofFloat(0f,-screenHeight)
        valueAnimator.addUpdateListener {
            val value=it.animatedValue as Float

            rocket.translationY=value
        }
        valueAnimator.interpolator= AccelerateInterpolator(10f)
        valueAnimator.duration= DEFAULT_ANIM_DURATION

        valueAnimator.start()
    }

}