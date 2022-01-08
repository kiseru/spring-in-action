package com.springinaction.springidol

open class Juggler(private val beanBags: Int) : Performer {
    constructor() : this(3)

    override fun perform() {
        println("JUGGLING $beanBags BEANBAGS")
    }
}