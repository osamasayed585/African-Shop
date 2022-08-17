package com.visionstech.africanshop.presentation.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavHostController
import androidx.navigation.ui.setupWithNavController
import com.visionstech.africanshop.R
import com.visionstech.africanshop.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var mBinding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         mBinding = FragmentMainBinding.inflate(inflater, container,false)

        val navHostFragment = childFragmentManager.findFragmentById(R.id.main_fragment) as NavHostController

        mBinding.bottomNavigationView.setupWithNavController(navController = navHostFragment)

        mBinding.toolbar.setupWithNavController(navController = navHostFragment)



        return mBinding.root
    }
}