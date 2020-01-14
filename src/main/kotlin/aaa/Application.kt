package aaa

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("aaa")
                .mainClass(Application.javaClass)
                .start()
    }
}