package com.iamkurtgoz.mytranslater.annotations

import android.app.Activity
import android.widget.TextView
import java.util.*

object TranslateInject {

    fun inject(target: Activity){
        val language = Locale.getDefault().language

        for (field in target.javaClass.declaredFields){
            val translateAnnotation: Translate? = field.getAnnotation(Translate::class.java)
            translateAnnotation?.let { translate: Translate ->
                val text = if (language == "tr") "Merhaba Dünya" else "Hello World"

                field.set(target, target.findViewById(translate.id))
                if (TextView::class.java.isAssignableFrom(field.type)){
                    (target.findViewById(translate.id) as TextView).text = text
                }
            }
        }
    }
}