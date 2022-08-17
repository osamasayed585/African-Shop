package com.visionstech.africanshop.presentation.ui.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.visionstech.africanshop.data.utils.PreferencesManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
open class BaseFragment : Fragment() {

    @Inject
    lateinit var preferencesManager: PreferencesManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}