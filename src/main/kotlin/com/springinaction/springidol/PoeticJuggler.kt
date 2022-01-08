package com.springinaction.springidol

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component("duke")
class PoeticJuggler : Juggler {
    private val poem: Poem

    @Autowired
    constructor(poem: Poem) : super() {
        this.poem = poem
    }

    constructor(beanBags: Int, poem: Poem) : super(beanBags) {
        this.poem = poem
    }

    override fun perform() {
        super.perform()
        println("While reciting...")
        poem.recite()
    }
}