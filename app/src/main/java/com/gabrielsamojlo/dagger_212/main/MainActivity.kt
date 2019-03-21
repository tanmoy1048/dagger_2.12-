package com.gabrielsamojlo.dagger_212.main

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.widget.TextView
import com.gabrielsamojlo.dagger_212.R
import com.gabrielsamojlo.dagger_212.main.fragment.MainFragment

import javax.inject.Inject

import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var mViewModelFactory: ViewModelProvider.Factory


    private var mMainViewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mMainViewModel = ViewModelProviders.of(this, mViewModelFactory).get(MainViewModel::class.java)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = mMainViewModel!!.test

        supportFragmentManager.beginTransaction().replace(R.id.fragmentHolder, MainFragment()).commit()
    }
}
