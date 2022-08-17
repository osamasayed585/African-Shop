package com.visionstech.africanshop.presentation.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.visionstech.africanshop.R
import com.visionstech.africanshop.databinding.FragmentSplashBinding
import com.visionstech.africanshop.presentation.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashFragment : BaseFragment() {

    private lateinit var binding: FragmentSplashBinding

    private val navigation: Navigation? = null

    @Inject
    lateinit var handler: Handler

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        handler.postDelayed(this::validation, 2000)
    }

    private fun validation() {

        val action = SplashFragmentDirections.actionSplashFragmentToOnBoardingFragment()
        findNavController().navigate(action)
    }

    fun notificationsHandler() {
    }

}