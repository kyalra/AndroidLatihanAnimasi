package com.android.androidlatihantambahan.activitiesAnimation

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.support.v4.content.ContextCompat
import com.android.androidlatihantambahan.R

class MaininBackground : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val objAnimator = ObjectAnimator.ofObject(
            framelayout,
            "backgroundColor",
            ArgbEvaluator(),
            ContextCompat.getColor(this, R.color.background_from),
            ContextCompat.getColor(this, R.color.background_to)
        )
        objAnimator.repeatCount=1
        objAnimator.repeatMode=ValueAnimator.REVERSE

        objAnimator.duration= DEFAULT_ANIM_DURATION
        objAnimator.start()
    }
}