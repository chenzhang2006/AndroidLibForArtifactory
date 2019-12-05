package com.chenzhang.androidlibforartifactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chenzhang.droidlibrary.getPublishingMessage
import com.chenzhang.droidlibrary2.getDecoratedMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "welcome".getDecoratedMessage() + "welcome".getPublishingMessage()
    }
}
