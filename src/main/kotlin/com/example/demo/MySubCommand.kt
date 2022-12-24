package com.example.demo

import org.springframework.stereotype.Component
import picocli.CommandLine
import java.util.concurrent.Callable

@Component
@CommandLine.Command(name = "test", mixinStandardHelpOptions = true)
internal class MySubCommand : Callable<Int> {
    @Throws(Exception::class)
    override fun call(): Int {
        println("Hello World")
        return 0
    }
}