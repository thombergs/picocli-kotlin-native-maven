package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.ExitCodeGenerator
import org.springframework.stereotype.Component
import picocli.CommandLine

@Component
class PicoCliRunner(
    private val command: MyCommand,
    private val picoCliFactory: CommandLine.IFactory
) : CommandLineRunner, ExitCodeGenerator {
    private var exitCode = 0

    @Throws(Exception::class)
    override fun run(vararg args: String?) {
        exitCode = CommandLine(command, picoCliFactory).execute(*args)
    }

    override fun getExitCode(): Int {
        return this.exitCode
    }
}