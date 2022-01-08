package com.springinaction.springidol

import org.springframework.stereotype.Component

@Component
class Volunteer : Thinker {
    private var thoughts: String? = null

    override fun thinkOfSomething(thoughts: String) {
        this.thoughts = thoughts
    }

    fun getThoughts() = thoughts
}