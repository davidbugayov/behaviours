package com.davidbugaev.samplebehavior

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import android.support.design.widget.SwipeDismissBehavior
import android.support.v7.widget.CardView




class SwipeActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_behavior)
        val mCardView = findViewById<CardView>(R.id.swype_card)
        val swipe = SwipeDismissBehavior<View>().apply {
            setSwipeDirection(
                    SwipeDismissBehavior.SWIPE_DIRECTION_ANY)

            setListener(
                    object : SwipeDismissBehavior.OnDismissListener {
                        override fun onDismiss(view: View) = Toast.makeText(this@SwipeActivity,
                                "Card swiped !!", Toast.LENGTH_SHORT).show()

                        override fun onDragStateChanged(state: Int) = Unit
                    })
        }

        val coordinatorParams = mCardView.layoutParams as CoordinatorLayout.LayoutParams
        coordinatorParams.behavior = swipe
    }
}