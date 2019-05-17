package com.android.androidlatihantambahan.activitiesAnimation

import android.animation.ObjectAnimator

class LaunchRocketObject:BaseAnimationActivity(){
    override fun onStartAnimation() {
        val objAnimator=ObjectAnimator.ofFloat(rocket,
            "translationY",0f,-screenHeight)
        objAnimator.duration= DEFAULT_ANIM_DURATION
        objAnimator.start()
    }
}