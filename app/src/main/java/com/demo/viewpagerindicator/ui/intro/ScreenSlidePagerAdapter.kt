package com.demo.viewpagerindicator.ui.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.demo.viewpagerindicator.common.INTRO_STRING_OBJECT

class ScreenSlidePagerAdapter(
    fragment: Fragment,
    val listOfPagerContents: List<Array<String>>,
    val mPageNumbers :Int
) : FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int = mPageNumbers

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerContentFragment()

        when(position){
            0 ->
                fragment.arguments = Bundle().apply {
                    putStringArray(INTRO_STRING_OBJECT, listOfPagerContents[0])
                }
            1 ->
                fragment.arguments = Bundle().apply {
                    putStringArray(INTRO_STRING_OBJECT, listOfPagerContents[1])
                }
            2 ->
                fragment.arguments = Bundle().apply {
                    putStringArray(INTRO_STRING_OBJECT, listOfPagerContents[2])
                }
        }
        return fragment
    }
}