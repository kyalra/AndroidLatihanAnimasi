package com.android.androidlatihantambahan.activitiesAnimation

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import com.android.androidlatihantambahan.R

class PakeXML:BaseAnimationActivity() {
    override fun onStartAnimation() {
    val rocketAnim=AnimatorInflater.loadAnimator(this,
        R.animator.blink_jump)as AnimatorSet
        rocketAnim.setTarget(rocket)

        val dogeanim=AnimatorInflater.loadAnimator(this,
            R.animator.blink_jump)as AnimatorSet
        dogeanim.setTarget(doge)

        val bothAnimSet=AnimatorSet()
        bothAnimSet.playTogether(rocketAnim,dogeanim)
        bothAnimSet.duration= DEFAULT_ANIM_DURATION
        bothAnimSet.start()
    }
}