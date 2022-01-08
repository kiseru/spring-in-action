package com.springinaction.springidol

import org.springframework.stereotype.Component

@Component
class Guitar : Instrument {
    override fun play() {
        println("Strum strum strum")
    }
}