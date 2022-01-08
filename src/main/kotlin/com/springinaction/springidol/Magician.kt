package com.springinaction.springidol

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

@Aspect
@Component
class Magician : MindReader {

    private var thoughts: String? = null

    @Pointcut("execution(* com.springinaction.springidol.Thinker.thinkOfSomething(String)) && args(thoughts)")
    fun thinking(thoughts: String) {
    }

    @Before("thinking(thoughts)")
    override fun interceptThoughts(thoughts: String) {
        println("Intercepting volunteer's thoughts")
        this.thoughts = thoughts
    }

    override fun getThoughts(): String? {
        return thoughts
    }
}