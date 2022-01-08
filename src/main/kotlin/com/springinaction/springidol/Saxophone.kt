package com.springinaction.springidol

import org.springframework.stereotype.Component

@Component
class Saxophone : Instrument {
    override fun play() {
        println("TOUT TOUT TOUT")
    }
}