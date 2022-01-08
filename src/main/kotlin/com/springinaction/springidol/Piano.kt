package com.springinaction.springidol

import org.springframework.stereotype.Component

@Component
class Piano : Instrument {
    override fun play() {
        println("PLINK PLINK PLINK")
    }
}