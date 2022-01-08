package com.springinaction.springidol

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringIdolConfig {
    @Bean
    fun duke() = Juggler()

    @Bean
    fun duke15() = Juggler(15)

    @Bean
    fun kenny() = Instrumentalist().apply { song = "Jingle Bells" }

    @Bean
    fun poeticDuke(poem: Poem) = PoeticJuggler(poem)
}