package com.iamkurtgoz.mytranslater.annotations

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class Translate(val id: Int, val key: String)


//TARGET
//AnnotationTarget.CLASS = Sınıf Başlarında
//AnnotationTarget.PROPERTY = Özelliklerin başlarında
//AnnotationTarget.FIELD = Özelliklerin başlarında
//AnnotationTarget.LOCAL_VARIABLE = Yerel Değişkenlerin başlarında
//AnnotationTarget.CONSTRUCTOR = Constructorların başlarında
//AnnotationTarget.FUNCTION = Methodların başlarında
//AnnotationTarget.VALUE_PARAMETER = Constructor ve methodların parametre başlarında

//RETENTION
//AnnotationRetention.SOURCE = Derleme süresine kadar tutulur. Derleme sırasında kaybolur.
//AnnotationRetention.BINARY = Derlendikten sonra da tutulur ancak çalışma(runtime) anında kaybolur.
//AnnotationRetention.RUNTIME = Annotation bilgileri kod derlendikten sonra bile uygulama çalışma zamanında erişim sağlanır.