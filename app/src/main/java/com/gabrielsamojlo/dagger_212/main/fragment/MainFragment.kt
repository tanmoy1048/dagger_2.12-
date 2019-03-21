package com.gabrielsamojlo.dagger_212.main.fragment

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gabrielsamojlo.dagger_212.R
import com.gabrielsamojlo.dagger_212.main.MainViewModel
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_main.*
import java.util.*
import javax.inject.Inject


class MainFragment : DaggerFragment() {
    @Inject
    lateinit var injectedCalendar:Calendar
    @Inject
    lateinit var mMainViewModel: MainFragmentViewModel
    //lateinit var mViewModelFactory: ViewModelProvider.Factory

    //private var mMainViewModel: MainFragmentViewModel? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //mMainViewModel = ViewModelProviders.of(this, mViewModelFactory).get(MainFragmentViewModel::class.java)

        text2.text =  mMainViewModel.anotherTest //injectedCalendar.timeInMillis.toString()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}
