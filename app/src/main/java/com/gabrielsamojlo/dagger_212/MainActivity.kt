package com.gabrielsamojlo.dagger_212

import android.os.Bundle
import android.widget.TextView

import javax.inject.Inject

import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var dummyDependency: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = dummyDependency
    }
}
