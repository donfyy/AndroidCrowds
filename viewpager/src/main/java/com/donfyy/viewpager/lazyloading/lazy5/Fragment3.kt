package com.donfyy.viewpager.lazyloading.lazy5

import com.donfyy.viewpager.R

class Fragment3 : BaseFragment() {
    override val layoutRes: Int
        get() = R.layout.fragment_3

    init {
        setFragmentDelegater(FragmentDelegater(this))
    }
}