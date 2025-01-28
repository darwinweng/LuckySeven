package com.luckyseven.app.ui.home

import android.os.Bundle
import android.view.View
import com.luckyseven.app.R
import com.luckyseven.app.databinding.FragmentHomeBinding
import com.luckyseven.app.ui.BaseFragment

class HomeFragment: BaseFragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
    }
}