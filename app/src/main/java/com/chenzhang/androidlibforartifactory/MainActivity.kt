package com.chenzhang.androidlibforartifactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chenzhang.droidlibrary.getMessageFromTransitiveDependency
import com.chenzhang.droidlibrary2.getMessageFromDirectDependency
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "Welcome".getMessageFromDirectDependency()
        message2.text = "Welcome".getMessageFromTransitiveDependency()
    }
}
