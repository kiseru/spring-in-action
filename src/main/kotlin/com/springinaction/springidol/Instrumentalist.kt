package com.springinaction.springidol

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component("eddie")
class Instrumentalist : Performer {
    @Value("Jingle Bells")
    lateinit var song: String

    @Autowired
    @Qualifier("guitar")
    lateinit var instrument: Instrument

    override fun perform() {
        print("Playing $song : ")
        instrument.play()
    }
}