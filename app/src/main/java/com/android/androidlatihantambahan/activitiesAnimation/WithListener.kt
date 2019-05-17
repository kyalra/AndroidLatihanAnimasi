package com.android.androidlatihantambahan.activitiesAnimation

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.Toast

class WithListener:BaseAnimationActivity() {
    override fun onStartAnimation() {
        val animator=ValueAnimator.ofFloat(0f,-screenHeight)
        animator.addUpdateListener {
            val value=it.animatedValue as Float
            rocket.translationY=value
            doge.translationY=value
        }
        animator.addListener(object :Animator.AnimatorListener{
            override fun onAnimationRepeat(animation: Animator?) {
                //nouse
            }

            override fun onAnimationEnd(animation: Animator?) {
                Toast.makeText(applicationContext,"Doge Dah Sampe",Toast.LENGTH_SHORT).show()
                finish()
            }

            override fun onAnimationCancel(animation: Animator?) {
                //no use
            }

            override fun onAnimationStart(animation: Animator?) {
                Toast.makeText(applicationContext,"Doge Berangkat",Toast.LENGTH_SHORT).show()

            }

        })
        animator.duration=5000L
        animator.start()
    }
}