package com.iamkurtgoz.mytranslater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.iamkurtgoz.mytranslater.annotations.Translate
import com.iamkurtgoz.mytranslater.annotations.TranslateInject

class MainActivity : AppCompatActivity() {

    @Translate(id = R.id.helloWorld, key = "hello_world")
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TranslateInject.inject(this)
    }
}
