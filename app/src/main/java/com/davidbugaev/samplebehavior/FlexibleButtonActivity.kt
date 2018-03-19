package com.davidbugaev.samplebehavior

import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import android.view.View


class FlexibleButtonActivity : AppCompatActivity(), AppBarLayout.OnOffsetChangedListener {

    private var mFab: View? = null
    private var mMaxScrollSize: Int = 0
    private var mIsImageHidden: Boolean = false
    private val PERCENTAGE_TO_SHOW_IMAGE = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flexiblespace_with_button)

        mFab = findViewById(R.id.flexible_fab)


        val appbar = findViewById<AppBarLayout>(R.id.flexible_appbar)
        appbar.addOnOffsetChangedListener(this)
    }

    override fun onOffsetChanged(appBarLayout: AppBarLayout, i: Int) {
        if (mMaxScrollSize == 0)
            mMaxScrollSize = appBarLayout.totalScrollRange
        val currentScrollPercentage = Math.abs(i) * 100 / mMaxScrollSize
        if (currentScrollPercentage >= PERCENTAGE_TO_SHOW_IMAGE) {
            if (!mIsImageHidden) {
                mIsImageHidden = true
                ViewCompat.animate(mFab).scaleY(0f).scaleX(0f).start()
            }
        }
        if (currentScrollPercentage < PERCENTAGE_TO_SHOW_IMAGE) {
            if (mIsImageHidden) {
                mIsImageHidden = false
                ViewCompat.animate(mFab).scaleY(1f).scaleX(1f).start()
            }
        }
    }
}