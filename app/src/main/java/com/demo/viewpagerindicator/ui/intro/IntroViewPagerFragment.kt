package com.demo.viewpagerindicator.ui.intro


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.viewpagerindicator.R
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_intro_view_pager.*
import kotlinx.android.synthetic.main.fragment_intro_view_pager.intro_pager as digital_pager
import kotlinx.android.synthetic.main.fragment_intro_view_pager.into_tab_layout as pager_tab_layout


class IntroViewPagerFragment : Fragment() {

    private val mPageNumbers = 3

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_intro_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pagerAdapter =
            ScreenSlidePagerAdapter(this,getListOfPagerContents(),mPageNumbers)
        digital_pager.adapter = pagerAdapter

        TabLayoutMediator(pager_tab_layout, digital_pager)
        { tab, position ->}.attach()
    }

    fun getListOfPagerContents(): List<Array<String>> {

        val ar1 = arrayOf(getString(R.string.intro_title_1), getString(R.string.intro_sub_title_1),"R" )
        val ar2 = arrayOf(getString(R.string.intro_title_2), getString(R.string.intro_sub_title_2) ,"G")
        val ar3 = arrayOf(getString(R.string.intro_title_3), getString(R.string.intro_sub_title_3) ,"B")
        return listOf(ar1,ar2,ar3)
    }


}
